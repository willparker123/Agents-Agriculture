package agentsmod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DnaFabricatorRecipes
{
	private static final DnaFabricatorRecipes smeltingBase = new DnaFabricatorRecipes();

	/** The list of smelting results. */
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
	private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static final DnaFabricatorRecipes smelting()
	{
		return smeltingBase;
	}

	private DnaFabricatorRecipes()
	{
		this.addSmelting(ModDNA.DNA1.itemID, new ItemStack(ModFruits.roseSeed), 2.0F);
		this.addSmelting(ModDNA.DNA2.itemID, new ItemStack(ModFruits.dandelionSeed), 2.0F);
		this.addSmelting(ModDNA.DNA3.itemID, new ItemStack(ModFruits.strawberrySeed), 2.0F);
		this.addSmelting(ModDNA.DNA4.itemID, new ItemStack(ModFruits.tomatoSeed), 2.0F);
		this.addSmelting(ModDNA.DNA5.itemID, new ItemStack(ModFruits.lemonSeed), 2.0F);
		this.addSmelting(ModDNA.DNA6.itemID, new ItemStack(ModFruits.orangeSeed), 2.0F);
		this.addSmelting(ModDNA.DNA7.itemID, new ItemStack(ModFruits.cherrySeed), 2.0F);
		this.addSmelting(ModDNA.DNA8.itemID, new ItemStack(ModFruits.lettuceSeed), 2.0F);
		this.addSmelting(ModDNA.DNA9.itemID, new ItemStack(ModFruits.cornSeed), 2.0F);
		this.addSmelting(ModDNA.DNA10.itemID, new ItemStack(ModFruits.pepperSeed), 2.0F);
		this.addSmelting(ModDNA.DNA11.itemID, new ItemStack(ModFruits.riceSeed), 2.0F);
		this.addSmelting(ModDNA.DNA12.itemID, new ItemStack(ModFruits.barleySeed), 2.0F);
		this.addSmelting(ModDNA.DNA13.itemID, new ItemStack(ModFruits.cottonSeed), 2.0F);
		this.addSmelting(ModDNA.DNA14.itemID, new ItemStack(ModFruits.onion), 2.0F);
		this.addSmelting(ModDNA.DNA15.itemID, new ItemStack(ModFruits.oliveSeed), 2.0F);
		this.addSmelting(ModDNA.DNA16.itemID, new ItemStack(ModFruits.weedSeed), 2.0F);
		this.addSmelting(ModDNA.DNA21.itemID, new ItemStack(Item.dyePowder,1,3), 2.0F);
		this.addSmelting(ModDNA.DNA22.itemID, new ItemStack(Item.appleRed), 2.0F);
		this.addSmelting(ModDNA.DNA23.itemID, new ItemStack(Item.pumpkinSeeds), 2.0F);
		this.addSmelting(ModDNA.DNA24.itemID, new ItemStack(Item.melonSeeds), 2.0F);
		this.addSmelting(ModDNA.DNA25.itemID, new ItemStack(Item.seeds), 2.0F);
		this.addSmelting(ModDNA.DNA26.itemID, new ItemStack(Item.reed), 2.0F);
		this.addSmelting(ModDNA.DNA27.itemID, new ItemStack(Block.mushroomBrown), 2.0F);
		this.addSmelting(ModDNA.DNA28.itemID, new ItemStack(Block.mushroomRed), 2.0F);
		this.addSmelting(ModDNA.DNA29.itemID, new ItemStack(Item.carrot), 2.0F);
		this.addSmelting(ModDNA.DNA30.itemID, new ItemStack(Item.potato), 2.0F);
		this.addSmelting(ModDNA.DNA36.itemID, new ItemStack(Block.cactus), 2.0F);
		this.addSmelting(ModDNA.DNA40.itemID, new ItemStack(ModFruits.lavenderSeed), 2.0F);
		this.addSmelting(ModDNA.DNA41.itemID, new ItemStack(ModFruits.parsleySeed), 2.0F);
		this.addSmelting(ModDNA.DNA43.itemID, new ItemStack(ModFruits.walnut), 2.0F);
		this.addSmelting(ModDNA.DNA45.itemID, new ItemStack(ModFruits.tobaccoSeed), 2.0F);
		this.addSmelting(ModDNA.DNA46.itemID, new ItemStack(ModFruits.peppersSeed), 2.0F);
		this.addSmelting(ModDNA.DNA47.itemID, new ItemStack(Block.vine), 2.0F);
		this.addSmelting(ModDNA.DNA57.itemID, new ItemStack(ModFruits.garlic), 2.0F);
		this.addSmelting(ModDNA.DNA58.itemID, new ItemStack(ModFruits.grapeSeed), 2.0F);
		this.addSmelting(ModDNA.DNA60.itemID, new ItemStack(ModFruits.chicleSeed), 2.0F);
		this.addSmelting(ModDNA.DNA62.itemID, new ItemStack(ModFruits.walnutHard), 2.0F);
		this.addSmelting(ModDNA.DNA63.itemID, new ItemStack(ModFruits.walnutHarder), 2.0F);
		this.addSmelting(ModDNA.DNA64.itemID, new ItemStack(ModFruits.peanut), 2.0F);
		this.addSmelting(ModDNA.DNA67.itemID, new ItemStack(ModFruits.mintSeed), 2.0F);
		this.addSmelting(ModDNA.DNA69.itemID, new ItemStack(ModFruits.raspberrySeed), 2.0F);
		this.addSmelting(ModDNA.DNA70.itemID, new ItemStack(ModFruits.braspberrySeed), 2.0F);
		this.addSmelting(ModDNA.DNA71.itemID, new ItemStack(ModFruits.blackcurrantSeed), 2.0F);
		this.addSmelting(ModDNA.DNA72.itemID, new ItemStack(ModFruits.blueberrySeed), 2.0F);
		this.addSmelting(ModDNA.DNA73.itemID, new ItemStack(ModFruits.walnutGold), 2.0F);
		this.addSmelting(ModDNA.DNA74.itemID, new ItemStack(ModFruits.walnutDiamond), 2.0F);
		this.addSmelting(ModDNA.DNA75.itemID, new ItemStack(ModFruits.hopSeed), 2.0F);
		this.addSmelting(ModDNA.DNA76.itemID, new ItemStack(ModFruits.grapePurpleSeed), 2.0F);
		this.addSmelting(ModDNA.DNA79.itemID, new ItemStack(ModFruits.appleGreenSeed), 2.0F);
		this.addSmelting(ModDNA.DNA80.itemID, new ItemStack(ModFruits.appleRedSeed), 2.0F);
		this.addSmelting(ModDNA.DNA81.itemID, new ItemStack(ModFruits.bean), 2.0F);
		this.addSmelting(ModDNA.DNA82.itemID, new ItemStack(ModFruits.pea), 2.0F);
		this.addSmelting(ModDNA.DNA84.itemID, new ItemStack(ModFruits.oatsSeed), 2.0F);
		this.addSmelting(ModDNA.DNA85.itemID, new ItemStack(ModFruits.soy), 2.0F);
		this.addSmelting(ModDNA.DNA86.itemID, new ItemStack(ModFruits.teaSeed), 2.0F);
		this.addSmelting(ModDNA.DNA87.itemID, new ItemStack(ModFruits.coffee), 2.0F);
		this.addSmelting(ModDNA.DNA31.itemID, new ItemStack(ModFruits.oakTreeSeed), 2.0F);
		this.addSmelting(ModDNA.DNA33.itemID, new ItemStack(ModFruits.birchTreeSeed), 2.0F);
		this.addSmelting(ModDNA.DNA32.itemID, new ItemStack(ModFruits.spruceTreeSeed), 2.0F);
		this.addSmelting(ModDNA.DNA34.itemID, new ItemStack(ModFruits.jungleTreeSeed), 2.0F);
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
