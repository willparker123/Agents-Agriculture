package agentsmod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ElementExtractorRecipes
{
    private static final ElementExtractorRecipes smeltingBase = new ElementExtractorRecipes();

    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    private HashMap<List<Integer>, ItemStack> metaSmeltingList = new HashMap<List<Integer>, ItemStack>();
    private HashMap<List<Integer>, Float> metaExperience = new HashMap<List<Integer>, Float>();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static final ElementExtractorRecipes smelting()
    {
        return smeltingBase;
    }

    private ElementExtractorRecipes()
    {
        this.addSmelting(Block.blockLapis.blockID, new ItemStack(ModDNA.DNA50,9), 2.0F);
        this.addSmelting(Block.blockGold.blockID, new ItemStack(ModDNA.DNA48,9), 3.0F);
        this.addSmelting(Block.blockIron.blockID, new ItemStack(ModDNA.DNA49,9), 1.0F);
        this.addSmelting(Block.blockDiamond.blockID, new ItemStack(ModDNA.DNA52,36), 4.0F);
        this.addSmelting(Block.coalBlock.blockID, new ItemStack(ModDNA.DNA52,9), 4.0F);
        this.addSmelting(Item.coal.itemID, new ItemStack(ModDNA.DNA52), 0.5F);
        this.addSmelting(Item.dyePowder.itemID,4, new ItemStack(ModDNA.DNA50), 0.5F);
        this.addSmelting(Item.ingotIron.itemID, new ItemStack(ModDNA.DNA49), 0.5F);
        this.addSmelting(Item.ingotGold.itemID, new ItemStack(ModDNA.DNA48), 0.5F);
        this.addSmelting(Item.diamond.itemID, new ItemStack(ModDNA.DNA52,8), 0.5F);
        this.addSmelting(Item.dyePowder.itemID,3, new ItemStack(ModDNA.DNA65), 0.5F);
        this.addSmelting(Block.leaves.blockID, new ItemStack(ModDNA.DNA53), 0.5F);
        this.addSmelting(Item.potion.itemID,0, new ItemStack(ModDNA.DNA77), 0.5F);
        this.addSmelting(Item.bucketWater.itemID, new ItemStack(ModDNA.DNA77,2), 0.5F);
        this.addSmelting(ModFood.bottleAir.itemID, new ItemStack(ModDNA.DNA78), 0.5F);
        
        this.addSmelting(ModFruits.walnutDiamond.itemID, new ItemStack(ModDNA.DNA52), 0.5F);
        this.addSmelting(ModFruits.walnutGold.itemID, new ItemStack(ModDNA.DNA48), 0.5F);
        this.addSmelting(ModFruits.walnutHarder.itemID, new ItemStack(ModDNA.DNA49), 0.5F);
        
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
