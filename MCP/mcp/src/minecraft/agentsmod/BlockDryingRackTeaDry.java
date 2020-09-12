package agentsmod;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDryingRackTeaDry extends BlockDirectional
{
	@SideOnly(Side.CLIENT)
	private Icon blockFront;
	@SideOnly(Side.CLIENT)
	private Icon field_94474_b;
	@SideOnly(Side.CLIENT)
	private Icon field_94475_c;

	public BlockDryingRackTeaDry(int par1, Material par2)
	{
		super(par1, Material.wood);
		this.setBlockBounds(0.0F, 0.0F, 0.4F, 1.0F, 1.0F, 0.6F);
		this.setLightOpacity(1);
		setTickRandomly(true);
		float f = 0.5F;
	}
	
public Icon getIcon(int par1, int par2)
{
    return par1 == 2 ? this.blockFront : par1 == 3 ? this.blockFront : this.blockIcon;
}

public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
{
    par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.teaDry,4));
    this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
    par1World.setBlock(par2, par3, par4, ModBlocks.rack.blockID);
    return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);

}

	/*/
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.field_94474_b : (par1 == 0 ? this.field_94474_b : (par2 == 2 && par1 == 2 ? this.field_94475_c : (par2 == 3 && par1 == 5 ? this.field_94475_c : (par2 == 0 && par1 == 3 ? this.field_94475_c : (par2 == 1 && par1 == 4 ? this.field_94475_c : this.blockIcon)))));
	}
/*/
	public void setBlockBoundsForItemRender()
	{
		this.setBlockBounds(0.0F, 0.0F, 0.4F, 1.0F, 1.0F, 0.6F);
		//0F 0F 0F Width Height Length
	}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
	this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
    this.blockFront = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "2");
}

	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	/*/
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.field_94475_c = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "2");
		this.field_94474_b = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
		this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

	@Override
public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
{
    int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
    par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
	this.setBlockBounds(0.4F, 0.0F, 0.0F, 0.6F, 1.0F, 1.0F);
}
/*/

	public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	{
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
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
		return ModBlocks.rack.blockID;
	}
	
	public int idDropped2(int par1, Random par2Random, int par3)
	{
		return ModFruits.teaDry.itemID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModBlocks.rack.blockID;
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

		}

		if (l == 1)
		{
			this.onBlockDestroyedByPlayer(world, x, y, z, 1);
			world.setBlock(x, y, z, ModBlocks.rackTeaDryb.blockID);
		}

		if (l == 2)
		{
			
		}

		if (l == 3)
		{
			this.onBlockDestroyedByPlayer(world, x, y, z, 1);
			world.setBlock(x, y, z, ModBlocks.rackTeaDryb.blockID);
		}
	}
}
