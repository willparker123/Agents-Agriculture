package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockSqueezerOlive extends Block
{
	@SideOnly(Side.CLIENT)
    private Icon blockTop;
	
    protected BlockSqueezerOlive(int par1, Material wood)
    {
        super(par1, Material.rock);
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
        	par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.oilolive,1));
            this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
            par1World.setBlock(par2, par3, par4, ModBlocks.squeezer.blockID);
            return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
    }
    
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return ModBlocks.squeezer.blockID;
    }
}
