package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCheeseMold extends Item
{
    /** The ID of the block the reed will spawn when used from inventory bar. */
    private int spawnID;

    public ItemCheeseMold(int par1)
    {
        super(par1);
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFood.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if(par7 != 1)
        {
        	return false;
        }
        else
        {
        	if(par2EntityPlayer.canPlayerEdit(x, y, z, par7, par1ItemStack))
        	{
        		par3World.setBlock(x, y + 1, z, ModBlocks.cheesemold.blockID);
        		par3World.notifyBlockOfNeighborChange(x, y, z, ModBlocks.cheesemold.blockID);
        	--par1ItemStack.stackSize;
        	return true;
        	}
        	else
        	{
        		return false;
        	}
        }
    }
}
