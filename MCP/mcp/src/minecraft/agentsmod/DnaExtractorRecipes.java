package agentsmod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DnaExtractorRecipes
{
	private static final DnaExtractorRecipes smeltingBase = new DnaExtractorRecipes();

	/** The list of smelting results. */
	private Map smeltingList = new HashMap();
	private Map experienceList = new HashMap();
	private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
	private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

	/**
	 * Used to call methods addSmelting and getSmeltingResult.
	 */
	public static final DnaExtractorRecipes smelting()
	{
		return smeltingBase;
	}

	private DnaExtractorRecipes()
	{
		this.addSmelting(ModFruits.roseSeed.itemID, new ItemStack(ModDNA.DNA1), 0.5F);
		this.addSmelting(ModDNA.DNA1.itemID, new ItemStack(ModDNA.DNA35), 0.5F);
		this.addSmelting(ModFruits.dandelionSeed.itemID, new ItemStack(ModDNA.DNA2), 0.5F);
		this.addSmelting(ModFruits.strawberrySeed.itemID, new ItemStack(ModDNA.DNA3), 0.5F);
		this.addSmelting(ModDNA.DNA3.itemID, new ItemStack(ModDNA.DNA68), 0.5F);
		this.addSmelting(ModFruits.tomatoSeed.itemID, new ItemStack(ModDNA.DNA4), 0.5F);
		this.addSmelting(ModFruits.lemonSeed.itemID, new ItemStack(ModDNA.DNA5), 0.5F);
		this.addSmelting(ModDNA.DNA5.itemID, new ItemStack(ModDNA.DNA20), 0.5F);
		this.addSmelting(ModFruits.orangeSeed.itemID, new ItemStack(ModDNA.DNA6), 0.5F);
		this.addSmelting(ModFruits.cherrySeed.itemID, new ItemStack(ModDNA.DNA7), 0.5F);
		this.addSmelting(ModDNA.DNA7.itemID, new ItemStack(ModDNA.DNA68), 0.5F);
		this.addSmelting(ModFruits.lettuceSeed.itemID, new ItemStack(ModDNA.DNA8), 0.5F);
		this.addSmelting(ModFruits.cornSeed.itemID, new ItemStack(ModDNA.DNA9), 0.5F);
		this.addSmelting(ModFruits.pepperSeed.itemID, new ItemStack(ModDNA.DNA10), 0.5F);
		this.addSmelting(ModDNA.DNA10.itemID, new ItemStack(ModDNA.DNA19), 0.5F);
		this.addSmelting(ModFruits.riceSeed.itemID, new ItemStack(ModDNA.DNA11), 0.5F);
		this.addSmelting(ModFruits.barleySeed.itemID, new ItemStack(ModDNA.DNA12), 0.5F);
		this.addSmelting(ModFruits.cottonSeed.itemID, new ItemStack(ModDNA.DNA13), 0.5F);
		this.addSmelting(ModFruits.onion.itemID, new ItemStack(ModDNA.DNA14), 0.5F);
		this.addSmelting(ModDNA.DNA14.itemID, new ItemStack(ModDNA.DNA38), 0.5F);
		this.addSmelting(ModFruits.oliveSeed.itemID, new ItemStack(ModDNA.DNA15), 0.5F);
		this.addSmelting(ModDNA.DNA15.itemID, new ItemStack(ModDNA.DNA17), 0.5F);
		this.addSmelting(ModFruits.weedSeed.itemID, new ItemStack(ModDNA.DNA16), 0.5F);
		this.addSmelting(ModDNA.DNA16.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(ModFood.salt.itemID, new ItemStack(ModDNA.DNA17), 0.5F);
		this.addSmelting(Item.sugar.itemID, new ItemStack(ModDNA.DNA18), 0.5F);
		this.addSmelting(Item.appleRed.itemID, new ItemStack(ModDNA.DNA80), 0.5F);
		this.addSmelting(Item.pumpkinSeeds.itemID, new ItemStack(ModDNA.DNA23), 0.5F);
		this.addSmelting(ModDNA.DNA23.itemID, new ItemStack(ModDNA.DNA54), 0.5F);
		this.addSmelting(Item.melonSeeds.itemID, new ItemStack(ModDNA.DNA24), 0.5F);
		this.addSmelting(ModDNA.DNA24.itemID, new ItemStack(ModDNA.DNA54), 0.5F);
		this.addSmelting(Item.seeds.itemID, new ItemStack(ModDNA.DNA25), 0.5F);
		this.addSmelting(Item.reed.itemID, new ItemStack(ModDNA.DNA26), 0.5F);
		this.addSmelting(Block.mushroomBrown.blockID, new ItemStack(ModDNA.DNA27), 0.5F);
		this.addSmelting(Block.mushroomRed.blockID, new ItemStack(ModDNA.DNA28), 0.5F);
		this.addSmelting(Item.carrot.itemID, new ItemStack(ModDNA.DNA29), 0.5F);
		this.addSmelting(ModDNA.DNA29.itemID, new ItemStack(ModDNA.DNA38), 0.5F);
		this.addSmelting(Item.potato.itemID, new ItemStack(ModDNA.DNA30), 0.5F);
		this.addSmelting(ModDNA.DNA30.itemID, new ItemStack(ModDNA.DNA38), 0.5F);
		this.addSmelting(Block.cactus.blockID, new ItemStack(ModDNA.DNA36), 0.5F);
		this.addSmelting(Item.dyePowder.itemID,3, new ItemStack(ModDNA.DNA21), 0.5F);
		this.addSmelting(ModDNA.DNA21.itemID, new ItemStack(ModDNA.DNA37), 0.5F);
		this.addSmelting(ModDNA.DNA31.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(ModDNA.DNA32.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(ModDNA.DNA33.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(ModDNA.DNA34.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(ModFruits.parsleySeed.itemID, new ItemStack(ModDNA.DNA41), 0.5F);
		this.addSmelting(ModFruits.lavenderSeed.itemID, new ItemStack(ModDNA.DNA40), 0.5F);
		this.addSmelting(ModDNA.DNA40.itemID, new ItemStack(ModDNA.DNA42), 0.5F);
		this.addSmelting(ModDNA.DNA41.itemID, new ItemStack(ModDNA.DNA42), 0.5F);
		this.addSmelting(ModFruits.walnut.itemID, new ItemStack(ModDNA.DNA43), 0.5F);
		this.addSmelting(ModDNA.DNA43.itemID, new ItemStack(ModDNA.DNA44), 0.5F);
		this.addSmelting(ModFruits.peppersSeed.itemID, new ItemStack(ModDNA.DNA46), 0.5F);
		this.addSmelting(ModFruits.tobaccoSeed.itemID, new ItemStack(ModDNA.DNA45), 0.5F);
		this.addSmelting(ModDNA.DNA45.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(Block.vine.blockID, new ItemStack(ModDNA.DNA47), 0.5F);
		this.addSmelting(ModFruits.tobaccoSeed.itemID, new ItemStack(ModDNA.DNA45), 0.5F);
		this.addSmelting(ModDNA.DNA48.itemID, new ItemStack(ModDNA.DNA51), 0.5F);
		this.addSmelting(ModDNA.DNA49.itemID, new ItemStack(ModDNA.DNA51), 0.5F);
		this.addSmelting(ModFruits.garlic.itemID, new ItemStack(ModDNA.DNA57), 0.5F);
		this.addSmelting(ModDNA.DNA57.itemID, new ItemStack(ModDNA.DNA56), 0.5F);
		this.addSmelting(Item.slimeBall.itemID, new ItemStack(ModDNA.DNA59), 0.5F);
		this.addSmelting(ModFruits.chicleSeed.itemID, new ItemStack(ModDNA.DNA60), 0.5F);
		this.addSmelting(ModFruits.walnutHard.itemID, new ItemStack(ModDNA.DNA62), 0.5F);
		this.addSmelting(ModFruits.walnutHarder.itemID, new ItemStack(ModDNA.DNA63), 0.5F);
		this.addSmelting(ModDNA.DNA62.itemID, new ItemStack(ModDNA.DNA61), 0.5F);
		this.addSmelting(ModDNA.DNA63.itemID, new ItemStack(ModDNA.DNA61), 0.5F);
		this.addSmelting(ModFruits.mintSeed.itemID, new ItemStack(ModDNA.DNA67), 0.5F);
		this.addSmelting(ModDNA.DNA67.itemID, new ItemStack(ModDNA.DNA66), 0.5F);
		this.addSmelting(ModFruits.raspberrySeed.itemID, new ItemStack(ModDNA.DNA69), 0.5F);
		this.addSmelting(ModFruits.braspberrySeed.itemID, new ItemStack(ModDNA.DNA70), 0.5F);
		this.addSmelting(ModFruits.blueberrySeed.itemID, new ItemStack(ModDNA.DNA72), 0.5F);
		this.addSmelting(ModFruits.blackcurrantSeed.itemID, new ItemStack(ModDNA.DNA71), 0.5F);
		this.addSmelting(ModDNA.DNA69.itemID, new ItemStack(ModDNA.DNA68), 0.5F);
		this.addSmelting(ModDNA.DNA70.itemID, new ItemStack(ModDNA.DNA68), 0.5F);
		this.addSmelting(ModDNA.DNA71.itemID, new ItemStack(ModDNA.DNA68), 0.5F);
		this.addSmelting(ModDNA.DNA72.itemID, new ItemStack(ModDNA.DNA68), 0.5F);
		this.addSmelting(ModDNA.DNA73.itemID, new ItemStack(ModDNA.DNA61), 0.5F);
		this.addSmelting(ModDNA.DNA74.itemID, new ItemStack(ModDNA.DNA61), 0.5F);
		this.addSmelting(ModFruits.walnutGold.itemID, new ItemStack(ModDNA.DNA73), 0.5F);
		this.addSmelting(ModFruits.walnutDiamond.itemID, new ItemStack(ModDNA.DNA74), 0.5F);
		this.addSmelting(ModFruits.grapeSeed.itemID, new ItemStack(ModDNA.DNA58), 0.5F);
		this.addSmelting(ModFruits.grapePurpleSeed.itemID, new ItemStack(ModDNA.DNA76), 0.5F);
		this.addSmelting(ModDNA.DNA76.itemID, new ItemStack(ModDNA.DNA47), 0.5F);
		this.addSmelting(ModDNA.DNA58.itemID, new ItemStack(ModDNA.DNA47), 0.5F);
		this.addSmelting(ModFruits.hopSeed.itemID, new ItemStack(ModDNA.DNA75), 0.5F);
		this.addSmelting(Item.reed.itemID, new ItemStack(ModDNA.DNA26), 0.5F);
		this.addSmelting(ModDNA.DNA26.itemID, new ItemStack(ModDNA.DNA18), 0.5F);
		this.addSmelting(ModFruits.peanut.itemID, new ItemStack(ModDNA.DNA64), 0.5F);
		this.addSmelting(ModDNA.DNA64.itemID, new ItemStack(ModDNA.DNA44), 0.5F);
		this.addSmelting(ModDNA.DNA73.itemID, new ItemStack(ModDNA.DNA48), 0.5F);
		this.addSmelting(ModDNA.DNA63.itemID, new ItemStack(ModDNA.DNA49), 0.5F);
		this.addSmelting(ModDNA.DNA79.itemID, new ItemStack(ModDNA.DNA22), 0.5F);
		this.addSmelting(ModDNA.DNA80.itemID, new ItemStack(ModDNA.DNA22), 0.5F);
		this.addSmelting(ModFruits.appleRedSeed.itemID, new ItemStack(ModDNA.DNA80), 0.5F);
		this.addSmelting(ModFruits.appleGreenSeed.itemID, new ItemStack(ModDNA.DNA79), 0.5F);
		this.addSmelting(ModFruits.bean.itemID, new ItemStack(ModDNA.DNA81), 0.5F);
		this.addSmelting(ModFruits.pea.itemID, new ItemStack(ModDNA.DNA82), 0.5F);
		this.addSmelting(ModDNA.DNA81.itemID, new ItemStack(ModDNA.DNA83), 0.5F);
		this.addSmelting(ModDNA.DNA82.itemID, new ItemStack(ModDNA.DNA83), 0.5F);
		this.addSmelting(ModDNA.DNA83.itemID, new ItemStack(ModDNA.DNA47), 0.5F);
		this.addSmelting(ModFruits.oatsSeed.itemID, new ItemStack(ModDNA.DNA84), 0.5F);
		this.addSmelting(ModDNA.DNA84.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(ModFruits.soy.itemID, new ItemStack(ModDNA.DNA85), 0.5F);
		this.addSmelting(ModDNA.DNA85.itemID, new ItemStack(ModDNA.DNA37), 0.5F);
		this.addSmelting(ModDNA.DNA61.itemID, new ItemStack(ModDNA.DNA51), 0.5F);
		this.addSmelting(Block.stone.blockID, new ItemStack(ModDNA.DNA51), 0.5F);
		this.addSmelting(ModFruits.teaSeed.itemID, new ItemStack(ModDNA.DNA86), 0.5F);
		this.addSmelting(ModDNA.DNA86.itemID, new ItemStack(ModDNA.DNA39), 0.5F);
		this.addSmelting(ModFruits.coffee.itemID, new ItemStack(ModDNA.DNA87), 0.5F);
		this.addSmelting(ModDNA.DNA87.itemID, new ItemStack(ModDNA.DNA37), 0.5F);
		this.addSmelting(ModFruits.oakTreeSeed.itemID, new ItemStack(ModDNA.DNA31), 0.5F);
		this.addSmelting(ModFruits.birchTreeSeed.itemID, new ItemStack(ModDNA.DNA33), 0.5F);
		this.addSmelting(ModFruits.spruceTreeSeed.itemID, new ItemStack(ModDNA.DNA32), 0.5F);
		this.addSmelting(ModFruits.jungleTreeSeed.itemID, new ItemStack(ModDNA.DNA34), 0.5F);
		
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
