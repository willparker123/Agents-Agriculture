package agentsmod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SqueezerRecipes
{
	private static final SqueezerRecipes smeltingBase = new SqueezerRecipes();

	/** The list of smelting results. */
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
	private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static final SqueezerRecipes smelting()
	{
		return smeltingBase;
	}

	private SqueezerRecipes()
	{
		this.addSmelting(Item.seeds.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(Item.melonSeeds.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(Item.pumpkinSeeds.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.barleySeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.blackcurrantSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.blueberrySeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.braspberrySeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.cherrySeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.chicleSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.cornSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.cottonSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.dandelionSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.grapeSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.grapePurpleSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.hopSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.lavenderSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.lemonSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.lettuceSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.mintSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.oliveSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.orangeSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.parsleySeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.peppersSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.raspberrySeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.riceSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.roseSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.strawberrySeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.tobaccoSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.tomatoSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.walnut.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.appleGreenSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		this.addSmelting(ModFruits.appleRedSeed.itemID, new ItemStack(ModTools.oilseed), 0.3F);
		
		this.addSmelting(ModTools.whalefat.itemID, new ItemStack(ModTools.oilwhale), 0.3F);
		this.addSmelting(ModFruits.olive.itemID, new ItemStack(ModTools.oilolive), 0.3F);
		this.addSmelting(Item.fishRaw.itemID, new ItemStack(ModTools.oilfish), 0.3F);
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
