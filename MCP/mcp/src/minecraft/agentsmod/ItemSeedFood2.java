package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemSeedFood2 extends ItemSeedFood implements IPlantable
{
    /** Block ID of the crop this seed food should place. */
    private int cropId;

    /** Block ID of the soil this seed food should be planted on. */
    private int soilId;

    public ItemSeedFood2(int par1, int par2, float par3, int par4, int par5)
    {
        super(par1, par2, par3, par4, par5);
        this.cropId = par4;
        this.soilId = par5;
        this.setCreativeTab(ModCreativeTabs.tabPlants);
        this.setCreativeTab(ModCreativeTabs.tabFood);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFruits.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
    
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        --par1ItemStack.stackSize;
        par3EntityPlayer.getFoodStats().addStats(this);
        par2World.playSoundAtEntity(par3EntityPlayer, "random.slurp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        
    	if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.walnut.itemID)
    	{
    		par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutshell, 1));
    	}
    	
    	if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.walnutHard.itemID)
    	{
    		par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutshellHard, 1));
    	}
    	
    	if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.walnutHarder.itemID)
    	{
    		par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutshellHarder, 1));
    	}
    	
    	if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.truffle.itemID)
        {
        	par3EntityPlayer.heal(16);
        }
    	
    	if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.truffleWhite.itemID)
        {
        	par3EntityPlayer.heal(20);
        }
    	
        return par1ItemStack;
    }
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
        {
            int var11 = par3World.getBlockId(par4, par5, par6);

            if (var11 == this.soilId && par3World.isAirBlock(par4, par5 + 1, par6))
            {
                par3World.setBlock(par4, par5 + 1, par6, this.cropId);
                --par1ItemStack.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        return EnumPlantType.Crop;
    }

    @Override
    public int getPlantID(World world, int x, int y, int z)
    {
        return cropId;
    }

    @Override
    public int getPlantMetadata(World world, int x, int y, int z)
    {
        return 0;
    }
}
