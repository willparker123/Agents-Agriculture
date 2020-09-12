package agentsmod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SeedExtractorRecipes
{
    private static final SeedExtractorRecipes smeltingBase = new SeedExtractorRecipes();

    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final SeedExtractorRecipes smelting()
    {
        return smeltingBase;
    }

    private SeedExtractorRecipes()
    {
        this.addSmelting(Block.plantRed.blockID, new ItemStack(ModFruits.roseSeed), 0.1F);
        this.addSmelting(Block.plantYellow.blockID, new ItemStack(ModFruits.dandelionSeed), 0.1F);
        this.addSmelting(ModFruits.barley.itemID, new ItemStack(ModFruits.barleySeed), 0.1F);
        this.addSmelting(ModFruits.rice.itemID, new ItemStack(ModFruits.riceSeed), 0.1F);
        this.addSmelting(ModFruits.weed.itemID, new ItemStack(ModFruits.weedSeed), 0.4F);
        this.addSmelting(ModFruits.cotton.itemID, new ItemStack(ModFruits.cottonSeed), 0.1F);
        this.addSmelting(ModFruits.strawberry.itemID, new ItemStack(ModFruits.strawberrySeed), 0.1F);
        this.addSmelting(ModFruits.tomato.itemID, new ItemStack(ModFruits.tomatoSeed), 0.1F);
        this.addSmelting(ModFruits.lemon.itemID, new ItemStack(ModFruits.lemonSeed), 0.1F);
        this.addSmelting(ModFruits.orange.itemID, new ItemStack(ModFruits.orangeSeed), 0.1F);
        this.addSmelting(ModFruits.cherry.itemID, new ItemStack(ModFruits.cherrySeed), 0.1F);
        this.addSmelting(ModFruits.lettuce.itemID, new ItemStack(ModFruits.lettuceSeed), 0.1F);
        this.addSmelting(ModFruits.corn.itemID, new ItemStack(ModFruits.cornSeed), 0.1F);
        this.addSmelting(ModFood.pepper.itemID, new ItemStack(ModFruits.pepperSeed), 0.1F);
        this.addSmelting(ModFruits.olive.itemID, new ItemStack(ModFruits.oliveSeed), 0.1F);
        this.addSmelting(Block.pumpkin.blockID, new ItemStack(Item.pumpkinSeeds,4), 0.6F);
        this.addSmelting(Block.pumpkinLantern.blockID, new ItemStack(Item.pumpkinSeeds,4), 0.6F);
        this.addSmelting(Block.melon.blockID, new ItemStack(Item.melonSeeds,4), 0.6F);
        this.addSmelting(Item.melon.itemID, new ItemStack(Item.melonSeeds), 0.1F);
        this.addSmelting(Item.speckledMelon.itemID, new ItemStack(Item.melonSeeds), 0.1F);
        this.addSmelting(Item.wheat.itemID, new ItemStack(Item.seeds), 0.1F);
        this.addSmelting(ModFruits.pepperGreen.itemID, new ItemStack(ModFruits.peppersSeed), 0.1F);
        this.addSmelting(ModFruits.pepperYellow.itemID, new ItemStack(ModFruits.peppersSeed), 0.2F);
        this.addSmelting(ModFruits.pepperRed.itemID, new ItemStack(ModFruits.peppersSeed), 0.4F);
        this.addSmelting(ModFruits.tobacco.itemID, new ItemStack(ModFruits.tobaccoSeed), 0.3F);
        this.addSmelting(ModCrops.parsleyPlant.blockID, new ItemStack(ModFruits.parsleySeed), 0.1F);
        this.addSmelting(ModCrops.lavenderPlant.blockID, new ItemStack(ModFruits.lavenderSeed), 0.1F);
        this.addSmelting(ModFruits.grape.itemID, new ItemStack(ModFruits.grapeSeed), 0.2F);
        this.addSmelting(ModFruits.grapePurple.itemID, new ItemStack(ModFruits.grapePurpleSeed), 0.4F);
        this.addSmelting(ModFruits.chicle.itemID, new ItemStack(ModFruits.chicleSeed), 0.2F);
        this.addSmelting(ModFruits.raspberry.itemID, new ItemStack(ModFruits.raspberrySeed), 0.3F);
        this.addSmelting(ModFruits.braspberry.itemID, new ItemStack(ModFruits.braspberrySeed), 0.3F);
        this.addSmelting(ModFruits.blueberry.itemID, new ItemStack(ModFruits.blueberrySeed), 0.3F);
        this.addSmelting(ModFruits.blackcurrant.itemID, new ItemStack(ModFruits.blackcurrantSeed), 0.3F);
        this.addSmelting(ModFruits.hops.itemID, new ItemStack(ModFruits.hopSeed), 0.4F);
        this.addSmelting(Block.vine.blockID, new ItemStack(ModFruits.grapeSeed), 0.1F);
        this.addSmelting(ModFruits.appleGreen.itemID, new ItemStack(ModFruits.appleGreenSeed), 0.4F);
        this.addSmelting(Item.appleRed.itemID, new ItemStack(ModFruits.appleRedSeed), 0.4F);
        this.addSmelting(ModFruits.peaPod.itemID, new ItemStack(ModFruits.pea,6), 0.4F);
        this.addSmelting(ModFruits.beanPod.itemID, new ItemStack(ModFruits.bean,6), 0.4F);
        this.addSmelting(ModFruits.oats.itemID, new ItemStack(ModFruits.oatsSeed,1), 0.1F);
        this.addSmelting(ModFruits.soyPod.itemID, new ItemStack(ModFruits.soy,3), 0.4F);
        this.addSmelting(ModFruits.tea.itemID, new ItemStack(ModFruits.teaSeed), 0.4F);
        this.addSmelting(Block.leaves.blockID,0, new ItemStack(ModFruits.oakTreeSeed), 0.5F);
		this.addSmelting(Block.leaves.blockID,1, new ItemStack(ModFruits.spruceTreeSeed), 0.5F);
		this.addSmelting(Block.leaves.blockID,2, new ItemStack(ModFruits.birchTreeSeed), 0.5F);
		this.addSmelting(Block.leaves.blockID,3, new ItemStack(ModFruits.jungleTreeSeed), 0.5F);
		
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
