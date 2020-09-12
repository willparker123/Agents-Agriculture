package agentsmod;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
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
import net.minecraft.world.World;

public class BlockCigarbox5 extends Block
{
	@SideOnly(Side.CLIENT)
    private Icon blockTop;
	@SideOnly(Side.CLIENT)
    private Icon blockBottom;
	@SideOnly(Side.CLIENT)
    private Icon blockFront;
	@SideOnly(Side.CLIENT)
    private Icon blockBack;
	
    protected BlockCigarbox5(int par1, Material wood)
    {
        super(par1, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightOpacity(0);
        this.setBlockBounds(0.1875F, 0.0F, 0.125F, 0.8125F, 0.5F, 0.875F);
    }
    
    public void setBlockBoundsForItemRender()
    {
    	this.setBlockBounds(0.1875F, 0.0F, 0.125F, 0.8125F, 0.5F, 0.875F);
        //0F 0F 0F Width Height Length
    }

    public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
        this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }
    
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.blockTop : par1 == 0 ? this.blockBottom : par1 == 4 ? this.blockFront : par1 == 5 ? this.blockBack : this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_side");
        this.blockTop = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
        this.blockBottom = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_bottom");
        this.blockFront = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_front");
        this.blockBack = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_back");
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.tobaccoCigar,1));
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, ModBlocks.cigarboxd.blockID);
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
    }
    
 
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModBlocks.cigarboxe.blockID;
    }
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return ModBlocks.cigarboxe.blockID;
    }
    
    
	public void onBlockAdded(World world, int x, int y, int z)
	{
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World world, int x, int y, int z)
	{
		if (!world.isRemote)
		{
			int l = world.getBlockId(x, y, z -1);
			int il = world.getBlockId(x, y, z + 1);
			int jl = world.getBlockId(x -1, y, z);
			int kl = world.getBlockId(x + 1, y, z);

			byte b0 = 3;

			if (Block.opaqueCubeLookup[l] && ! Block.opaqueCubeLookup[il])
			{
				b0 = 3;
			}

			if (Block.opaqueCubeLookup[il] && ! Block.opaqueCubeLookup[l])
			{
				b0 = 2;
			}

			if (Block.opaqueCubeLookup[kl] && ! Block.opaqueCubeLookup[jl])
			{
				b0 = 5;
			}

			if (Block.opaqueCubeLookup[jl] && ! Block.opaqueCubeLookup[kl])
			{
				b0 = 4;
			}

			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
	}

	public TileEntity createNewTileEntity(World world)
	{
		return new TileEntityMoveable();
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack)
	{
		int l = MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (l == 0)
		{
			this.onBlockDestroyedByPlayer(world, x, y, z, 1);
			world.setBlock(x, y, z, ModBlocks.cigarbox4e.blockID);
		}

		if (l == 1)
		{
			this.onBlockDestroyedByPlayer(world, x, y, z, 1);
			world.setBlock(x, y, z, ModBlocks.cigarbox3e.blockID);
		}

		if (l == 2)
		{
			this.onBlockDestroyedByPlayer(world, x, y, z, 1);
			world.setBlock(x, y, z, ModBlocks.cigarbox2e.blockID);
		}

		if (l == 3)
		{

		}
	}
}
