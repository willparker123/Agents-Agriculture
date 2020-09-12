package agentsmod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FryerRecipes
{
	private static final FryerRecipes smeltingBase = new FryerRecipes();

	/** The list of smelting results. */
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
	private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static final FryerRecipes smelting()
	{
		return smeltingBase;
	}

	private FryerRecipes()
	{
		this.addSmelting(Item.porkRaw.itemID, new ItemStack(ModFood.friedspam), 0.2F);
		this.addSmelting(ModFood.sausage.itemID, new ItemStack(ModFood.friedsausage), 0.2F);
		this.addSmelting(ModFood.pigskin.itemID, new ItemStack(ModFood.porkscratching), 0.2F);
		this.addSmelting(Item.chickenRaw.itemID, new ItemStack(ModFood.friedchicken), 0.2F);
		this.addSmelting(Item.fishRaw.itemID, new ItemStack(ModFood.friedfish), 0.2F);
		this.addSmelting(ModFood.fishcake.itemID, new ItemStack(ModFood.friedfishcake), 0.2F);
		this.addSmelting(ModFood.baconRaw.itemID, new ItemStack(ModFood.baconCooked), 0.2F);
		this.addSmelting(Item.egg.itemID, new ItemStack(ModFood.eggFried), 0.2F);
		this.addSmelting(ModFood.burgerRaw.itemID, new ItemStack(ModFood.burgerCooked), 0.2F);
		this.addSmelting(ModFood.potatoSlice.itemID, new ItemStack(ModFood.crisps), 0.2F);
		this.addSmelting(ModFood.potatoWedge.itemID, new ItemStack(ModFood.chips), 0.2F);
		this.addSmelting(ModFood.potatoMashed.itemID, new ItemStack(ModFood.hashbrown), 0.2F);
		this.addSmelting(ModFood.chickenNugget.itemID, new ItemStack(ModFood.chickenNuggetCooked), 0.2F);
		this.addSmelting(ModFood.chickenSweetSour.itemID, new ItemStack(ModFood.chickenSweetSourCooked), 0.2F);
	}

	/**
	 * Adds a smelting recipe.
	 */
	public void addSmelting(int par1, ItemStack par2ItemStack, float par3)
	{
		this.smeltingList.put(Integer.valueOf(par1), par2ItemStack);
		this.experienceList.put(Integer.valueOf(par2ItemStack.itemID), Float.valueOf(par3));
	}

	/**
	 * Returns the smelting result of an item.
	 * Deprecated in favor of a metadata sensitive version
	 */
	@Deprecated
	public ItemStack getSmeltingResult(int par1)
	{
		return (ItemStack)this.smeltingList.get(Integer.valueOf(par1));
	}

	public Map getSmeltingList()
	{
		return this.smeltingList;
	}

	@Deprecated //In favor of ItemStack sensitive version
	public float getExperience(int par1)
	{
		return this.experienceList.containsKey(Integer.valueOf(par1)) ? ((Float)this.experienceList.get(Integer.valueOf(par1))).floatValue() : 0.0F;
	}

	/**
	 * A metadata sensitive version of adding a furnace recipe.
	 */
	public void addSmelting(int itemID, int metadata, ItemStack itemstack, float experience)
	{
		metaSmeltingList.put(Arrays.asList(itemID, metadata), itemstack);
		metaExperience.put(Arrays.asList(itemstack.itemID, itemstack.getItemDamage()), experience);
	}

	/**
	 * Used to get the resulting ItemStack form a source ItemStack
	 * @param item The Source ItemStack
	 * @return The result ItemStack
	 */
	public ItemStack getSmeltingResult(ItemStack item) 
	{
		if (item == null)
		{
			return null;
		}
		ItemStack ret = (ItemStack)metaSmeltingList.get(Arrays.asList(item.itemID, item.getItemDamage()));
		if (ret != null) 
		{
			return ret;
		}
		return (ItemStack)smeltingList.get(Integer.valueOf(item.itemID));
	}

	/**
	 * Grabs the amount of base experience for this item to give when pulled from the furnace slot.
	 */
	public float getExperience(ItemStack item)
	{
		if (item == null || item.getItem() == null)
		{
			return 0;
		}
		float ret = item.getItem().getSmeltingExperience(item);
		if (ret < 0 && metaExperience.containsKey(Arrays.asList(item.itemID, item.getItemDamage())))
		{
			ret = metaExperience.get(Arrays.asList(item.itemID, item.getItemDamage()));
		}
		if (ret < 0 && experienceList.containsKey(item.itemID))
		{
			ret = ((Float)experienceList.get(item.itemID)).floatValue();
		}
		return (ret < 0 ? 0 : ret);
	}

	public Map<List<Integer>, ItemStack> getMetaSmeltingList()
	{
		return metaSmeltingList;
	}
}
