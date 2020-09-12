package agentsmod;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGumball2 extends BlockContainer
{
	
    protected BlockGumball2(int par1, Material wood)
    {
        super(par1, Material.glass);
        
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 3F, 1F);
    }
  //Make sure you set this as your TileEntity class relevant for the block!
    public TileEntity createNewTileEntity(World world) {
            return new TileEntityGumball2();
    }
    
    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
            return -1;
    }
    
    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
            return false;
    }
    
    //This is the icon to use for showing the block in your hand.
    public void registerIcons(IconRegister icon) {
            this.blockIcon = icon.registerIcon("modblocks:Gumball2");
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFood.gumApple,1));
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, ModBlocks.gumball.blockID);

			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModBlocks.gumball.blockID;
    }
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return ModBlocks.gumball.blockID;
    }
}
