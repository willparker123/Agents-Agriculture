package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockSqueezer extends Block
{
	@SideOnly(Side.CLIENT)
    private Icon blockTop;
	
    protected BlockSqueezer(int par1, Material wood)
    {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.blockTop : par1 == 0 ? this.blockTop : this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
        this.blockTop = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "2");
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == Item.glassBottle.itemID)
        {
        	par5EntityPlayer.inventory.consumeInventoryItem(Item.glassBottle.itemID);
            this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
            par1World.setBlock(par2, par3, par4, ModBlocks.squeezerBottle.blockID);
            return false;
        }
        else
        {
            return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
        }
    }
    
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return ModBlocks.squeezer.blockID;
    }
}
