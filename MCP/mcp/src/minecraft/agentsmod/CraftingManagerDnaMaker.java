package agentsmod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class CraftingManagerDnaMaker
{
    /** The static instance of this class */
    private static final CraftingManagerDnaMaker instance = new CraftingManagerDnaMaker();

    /** A list of all the recipes added */
    private List recipes = new ArrayList();

    /**
     * Returns the static instance of this class
     */
    public static final CraftingManagerDnaMaker getInstance()
    {
        return instance;
    }

    private CraftingManagerDnaMaker()
    {
    	this.addRecipe(new ItemStack(ModDNA.DNA55,3), new Object[] {"XYX", "ZXZ", "XYX", 'X', ModDNA.DNA46, 'Y', ModDNA.DNA17, 'Z', ModDNA.DNA19});
		this.addRecipe(new ItemStack(ModDNA.DNA55,3), new Object[] {"XYX", "ZXZ", "XYX", 'X', ModDNA.DNA46, 'Z', ModDNA.DNA17, 'Y', ModDNA.DNA19});
		this.addShapelessRecipe(new ItemStack(ModDNA.DNA56, 1), new Object[]{new ItemStack(ModDNA.DNA55), new ItemStack(ModDNA.DNA17), new ItemStack(ModDNA.DNA19), new ItemStack(ModDNA.DNA20)}); 
		this.addShapelessRecipe(new ItemStack(ModDNA.DNA57, 1), new Object[]{new ItemStack(ModDNA.DNA56), new ItemStack(ModDNA.DNA38), new ItemStack(ModDNA.DNA14)}); 
		this.addRecipe(new ItemStack(ModDNA.DNA60,1), new Object[] {"XYX", "YZY", "XYX", 'X', ModDNA.DNA34, 'Z', ModDNA.DNA6, 'Y', ModDNA.DNA59});
		this.addRecipe(new ItemStack(ModDNA.DNA60,1), new Object[] {"XYX", "YZY", "XYX", 'Y', ModDNA.DNA34, 'Z', ModDNA.DNA6, 'X', ModDNA.DNA59});
		this.addRecipe(new ItemStack(ModDNA.DNA61,1), new Object[] {"XYX", "YZY", "XYX", 'X', ModDNA.DNA51, 'Z', ModDNA.DNA44, 'Y', ModDNA.DNA49});
		this.addRecipe(new ItemStack(ModDNA.DNA61,1), new Object[] {"XYX", "YZY", "XYX", 'Y', ModDNA.DNA51, 'Z', ModDNA.DNA44, 'X', ModDNA.DNA49});
		this.addRecipe(new ItemStack(ModDNA.DNA62,1), new Object[] {"XYX", "YZY", "XYX", 'Y', ModDNA.DNA61, 'Z', ModDNA.DNA43, 'X', ModDNA.DNA51});
		this.addRecipe(new ItemStack(ModDNA.DNA62,1), new Object[] {"XYX", "YZY", "XYX", 'X', ModDNA.DNA61, 'Z', ModDNA.DNA43, 'Y', ModDNA.DNA51});
		this.addRecipe(new ItemStack(ModDNA.DNA63,1), new Object[] {"XXX", "YZY", "XXX", 'X', ModDNA.DNA49, 'Z', ModDNA.DNA62, 'Y', ModDNA.DNA51});
		this.addRecipe(new ItemStack(ModDNA.DNA63,1), new Object[] {"XYX", "XZX", "XYX", 'X', ModDNA.DNA49, 'Z', ModDNA.DNA62, 'Y', ModDNA.DNA51});
		this.addRecipe(new ItemStack(ModDNA.DNA64,1), new Object[] {"XYX", "WZW", "XYX", 'X', ModDNA.DNA18, 'Z', ModDNA.DNA43, 'Y', ModDNA.DNA44, 'W', ModDNA.DNA37});
		this.addRecipe(new ItemStack(ModDNA.DNA64,1), new Object[] {"XYX", "WZW", "XYX", 'X', ModDNA.DNA18, 'Z', ModDNA.DNA43, 'W', ModDNA.DNA44, 'Y', ModDNA.DNA37});
		this.addRecipe(new ItemStack(ModDNA.DNA66,1), new Object[] {"XYX", "WZW", "XYX", 'X', ModDNA.DNA42, 'Z', ModDNA.DNA55, 'Y', ModDNA.DNA18, 'W', ModDNA.DNA20});
		this.addRecipe(new ItemStack(ModDNA.DNA66,1), new Object[] {"XYX", "WZW", "XYX", 'X', ModDNA.DNA42, 'Z', ModDNA.DNA55, 'W', ModDNA.DNA18, 'Y', ModDNA.DNA20});
		this.addRecipe(new ItemStack(ModDNA.DNA67,1), new Object[] {"XYX", "YZY", "XYX", 'X', ModDNA.DNA42, 'Z', ModDNA.DNA39, 'Y', ModDNA.DNA66});
		this.addRecipe(new ItemStack(ModDNA.DNA67,1), new Object[] {"XYX", "YZY", "XYX", 'Y', ModDNA.DNA42, 'Z', ModDNA.DNA39, 'X', ModDNA.DNA66});
		
		this.addRecipe(new ItemStack(ModDNA.DNA69,1), new Object[] {"XYX", "YZY", "XYX", 'X', ModDNA.DNA68, 'Z', ModDNA.DNA3, 'Y', ModDNA.DNA18});
		this.addRecipe(new ItemStack(ModDNA.DNA69,1), new Object[] {"XYX", "YZY", "XYX", 'Y', ModDNA.DNA68, 'Z', ModDNA.DNA3, 'X', ModDNA.DNA18});
		this.addRecipe(new ItemStack(ModDNA.DNA70,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Y', ModDNA.DNA69, 'Z', new ItemStack(Item.dyePowder,1,4), 'X', new ItemStack(Item.dyePowder,1,12)});
		this.addRecipe(new ItemStack(ModDNA.DNA70,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA69, 'Z', new ItemStack(Item.dyePowder,1,4), 'Y', new ItemStack(Item.dyePowder,1,12)});	
		this.addRecipe(new ItemStack(ModDNA.DNA71,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA18, 'Y', new ItemStack(Item.dyePowder,1,0), 'Z', new ItemStack(ModDNA.DNA68)});	
		this.addRecipe(new ItemStack(ModDNA.DNA71,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA18, 'Y', new ItemStack(Item.dyePowder,1,0), 'X', new ItemStack(ModDNA.DNA68)});	
		this.addRecipe(new ItemStack(ModDNA.DNA72,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA18, 'Y', new ItemStack(Item.dyePowder,1,4), 'Z', new ItemStack(ModDNA.DNA68)});	
		this.addRecipe(new ItemStack(ModDNA.DNA72,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA18, 'Y', new ItemStack(Item.dyePowder,1,4), 'X', new ItemStack(ModDNA.DNA68)});	
		this.addRecipe(new ItemStack(ModDNA.DNA73,1), new Object[] {"ZZZ", "ZYZ", "ZZZ", 'Z', ModDNA.DNA48, 'Y', new ItemStack(ModDNA.DNA63)});	
		this.addRecipe(new ItemStack(ModDNA.DNA74,1), new Object[] {"ZGZ", "GYG", "ZGZ", 'Z', ModDNA.DNA51, 'G', ModDNA.DNA52, 'Y', new ItemStack(ModDNA.DNA73)});
		this.addRecipe(new ItemStack(ModDNA.DNA74,1), new Object[] {"ZGZ", "GYG", "ZGZ", 'Z', ModDNA.DNA52, 'G', ModDNA.DNA51, 'Y', new ItemStack(ModDNA.DNA73)});
		this.addRecipe(new ItemStack(ModDNA.DNA75,1), new Object[] {"ZXZ", "GYG", "ZXZ", 'Z', ModDNA.DNA19, 'G', ModDNA.DNA47, 'Y', new ItemStack(ModDNA.DNA37), 'X', new ItemStack(ModDNA.DNA18)});
		this.addRecipe(new ItemStack(ModDNA.DNA75,1), new Object[] {"ZXZ", "GYG", "ZXZ", 'Z', ModDNA.DNA19, 'X', ModDNA.DNA47, 'Y', new ItemStack(ModDNA.DNA37), 'G', new ItemStack(ModDNA.DNA18)});
		this.addRecipe(new ItemStack(ModDNA.DNA76,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA18, 'Z', new ItemStack(Item.dyePowder,1,5), 'Y', new ItemStack(ModDNA.DNA58)});
		this.addRecipe(new ItemStack(ModDNA.DNA76,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA18, 'X', new ItemStack(Item.dyePowder,1,5), 'Y', new ItemStack(ModDNA.DNA58)});
		this.addRecipe(new ItemStack(ModDNA.DNA79,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA31, 'X', new ItemStack(Item.dyePowder,1,10), 'Y', new ItemStack(ModDNA.DNA22)});
		this.addRecipe(new ItemStack(ModDNA.DNA80,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA31, 'X', new ItemStack(Item.dyePowder,1,1), 'Y', new ItemStack(ModDNA.DNA22)});
		this.addRecipe(new ItemStack(ModDNA.DNA79,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA31, 'Z', new ItemStack(Item.dyePowder,1,10), 'Y', new ItemStack(ModDNA.DNA22)});
		this.addRecipe(new ItemStack(ModDNA.DNA80,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA31, 'Z', new ItemStack(Item.dyePowder,1,1), 'Y', new ItemStack(ModDNA.DNA22)});
		
		this.addRecipe(new ItemStack(ModDNA.DNA81,1), new Object[] {"ZBZ", "AYA", "ZBZ", 'Z', ModDNA.DNA37, 'A', ModDNA.DNA17, 'B', ModDNA.DNA18, 'Y', new ItemStack(ModDNA.DNA47)});
		this.addRecipe(new ItemStack(ModDNA.DNA81,1), new Object[] {"ZBZ", "AYA", "ZBZ", 'Z', ModDNA.DNA37, 'B', ModDNA.DNA17, 'A', ModDNA.DNA18, 'Y', new ItemStack(ModDNA.DNA47)});
		this.addRecipe(new ItemStack(ModDNA.DNA82,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA37, 'X', ModDNA.DNA83, 'Y', new ItemStack(ModDNA.DNA81)});
		this.addRecipe(new ItemStack(ModDNA.DNA82,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA37, 'Z', ModDNA.DNA83, 'Y', new ItemStack(ModDNA.DNA81)});
		this.addRecipe(new ItemStack(ModDNA.DNA84,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA25, 'Z', ModDNA.DNA12, 'Y', new ItemStack(ModDNA.DNA18)});
		this.addRecipe(new ItemStack(ModDNA.DNA84,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA25, 'X', ModDNA.DNA12, 'Y', new ItemStack(ModDNA.DNA18)});
		//this.addRecipe(new ItemStack(ModDNA.DNA82,1), new Object[] {"ZBZ", "AYA", "ZBZ", 'Z', ModDNA.DNA37, 'A', ModDNA.DNA83, 'B', ModDNA.DNA18, 'Y', new ItemStack(ModDNA.DNA81)});
		this.addShapelessRecipe(new ItemStack(ModDNA.DNA85, 1), new Object[]{new ItemStack(ModDNA.DNA37), new ItemStack(ModDNA.DNA56), new ItemStack(ModDNA.DNA18), new ItemStack(ModDNA.DNA19)}); 
		this.addRecipe(new ItemStack(ModDNA.DNA86,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'Z', ModDNA.DNA39, 'X', ModDNA.DNA19, 'Y', new ItemStack(ModDNA.DNA67)});
		this.addRecipe(new ItemStack(ModDNA.DNA86,1), new Object[] {"ZXZ", "XYX", "ZXZ", 'X', ModDNA.DNA39, 'Z', ModDNA.DNA19, 'Y', new ItemStack(ModDNA.DNA67)});
		this.addRecipe(new ItemStack(ModDNA.DNA87,1), new Object[] {"ZXZ", "GYG", "ZXZ", 'G', ModDNA.DNA37, 'Z', ModDNA.DNA19, 'Y', new ItemStack(ModDNA.DNA86), 'X', new ItemStack(Item.dyePowder,1,3)});
		this.addRecipe(new ItemStack(ModDNA.DNA87,1), new Object[] {"ZGZ", "XYX", "ZGZ", 'X', ModDNA.DNA37, 'Z', ModDNA.DNA19, 'Y', new ItemStack(ModDNA.DNA86), 'G', new ItemStack(Item.dyePowder,1,3)});
		
        Collections.sort(this.recipes, new RecipeSorterDnaMaker(this));
    }

    public ShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (par2ArrayOfObj[i] instanceof String[])
        {
            String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (par2ArrayOfObj[i] instanceof String)
            {
                String s2 = (String)par2ArrayOfObj[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
        {
            Character character = (Character)par2ArrayOfObj[i];
            ItemStack itemstack1 = null;

            if (par2ArrayOfObj[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
            }
            else if (par2ArrayOfObj[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
            }
            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack, par1ItemStack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = par2ArrayOfObj;
        int i = par2ArrayOfObj.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid Shapeless Recipe!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.itemID == itemstack1.itemID && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && Item.itemsList[itemstack.itemID].isRepairable())
        {
            Item item = Item.itemsList[itemstack.itemID];
            int k = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int l = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int i1 = k + l + item.getMaxDamage() * 5 / 100;
            int j1 = item.getMaxDamage() - i1;

            if (j1 < 0)
            {
                j1 = 0;
            }

            return new ItemStack(itemstack.itemID, 1, j1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }

    /**
     * returns the List<> of all recipes
     */
    public List getRecipeList()
    {
        return this.recipes;
    }
}
