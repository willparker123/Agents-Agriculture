package agentsmod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockCropPea extends BlockCrops
{
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;
	private Random par1Random;

	protected BlockCropPea(int par1)
	{
		super(par1);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0625F, 1.0F, 1.0F);
		this.setLightOpacity(1);
		this.setTickRandomly(true);
		this.disableStats();
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{

		if (par1World.getBlockMetadata(par2, par3, par4) > 5)
		{
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.peaPod,2));
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
		}
		if (par1World.getBlockMetadata(par2, par3, par4) > 6)
		{
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.peaPod,2));
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
		}
		else
		{
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
		}

		return false;
	}


	protected int getSeedItem()
	{
		return 0;
	}

	/**
	 * Generate a crop produce ItemStack for this crop.
	 */
	 protected int getCropItem()
	 {
		 return 0;
	 }

	 public boolean modfertilize(World par1World, int par2, int par3, int par4)
	 {
		 return par1World.setBlockMetadataWithNotify(par2, par3, par4, 6, 2);
	 }

		public void fertilize(World par1World, int par2, int par3, int par4)
	    {
	        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 1, 2);

	        if (l > 6)
	        {
	            l = 6;
	        }

	        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
	    }

	 @SideOnly(Side.CLIENT)

	 /**
	  * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	  */
	 public Icon getIcon(int par1, int par2)
	 {
		 if (par2 < 0 || par2 > 6)
		 {
			 par2 = 6;
		 }

		 return this.iconArray[par2];
	 }

	 @SideOnly(Side.CLIENT)

	 /**
	  * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	  * is the only chance you get to register icons.
	  */
	 public void registerIcons(IconRegister par1IconRegister)
	 {
		 this.iconArray = new Icon[7];

		 for (int i = 0; i < this.iconArray.length; ++i)
		 {
			 this.iconArray[i] = par1IconRegister.registerIcon(ModCrops.modid + ":" + "peaCrop" + i);
		 }
	 }

	 public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	 {
		 super.updateTick(par1World, par2, par3, par4, par5Random);

		 if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
		 {
			 int i = par1World.getBlockMetadata(par2, par3, par4);

			 if (i < 6)
			 {
				 float f = getGrowthRate(par1World, par2, par3, par4);

				 if (par5Random.nextInt((int)(2500 / f) + 1) == 0)
				 {
					 i++;
					 par1World.setBlockMetadataWithNotify(par2, par3, par4, i, 2);
				 }
			 }
		 }
	 }

	 private float getGrowthRate(World par1World, int par2, int par3, int par4)
	 {
		 float f = 1F;
		 int i = par1World.getBlockId(par2, par3, par4 - 1);
		 int j = par1World.getBlockId(par2, par3, par4 + 1);
		 int k = par1World.getBlockId(par2 - 1, par3, par4);
		 int l = par1World.getBlockId(par2 + 1, par3, par4);
		 int i1 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
		 int j1 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
		 int k1 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
		 int l1 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
		 boolean flag = k == blockID || l == blockID;
		 boolean flag1 = i == blockID || j == blockID;
		 boolean flag2 = i1 == blockID || j1 == blockID || k1 == blockID || l1 == blockID;

		 for (int i2 = par2 - 1; i2 <= par2 + 1; i2++)
		 {
			 for (int j2 = par4 - 1; j2 <= par4 + 1; j2++)
			 {
				 int k2 = par1World.getBlockId(i2, par3 - 1, j2);
				 float f1 = 0.0F;

				 if (k2 == Block.tilledField.blockID)
				 {
					 f1 = 1.0F;

					 if (par1World.getBlockMetadata(i2, par3 - 1, j2) > 0)
					 {
						 f1 = 3F;
					 }
				 }

				 if (i2 != par2 || j2 != par4)
				 {
					 f1 /= 4F;
				 }

				 f += f1;
			 }
		 }

		 if (flag2 || flag && flag1)
		 {
			 f /= 2.0F;
		 }

		 return f;
	 }


	 @Override
	 public int getRenderType()
	 {
		 return 0;
	 }

	 public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	 {
		 this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		 super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	 }

	 @Override
	 public void setBlockBoundsForItemRender()
	 {
		 this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0625F, 1.0F, 1.0F);
		 //0F 0F 0F Width Height Length
	 }

	 @Override
	 public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	 {
		 int l = par1World.getBlockId(par2, par3, par4);
		 Block block = Block.blocksList[l];
		 return block == null || block.isBlockReplaceable(par1World, par2, par3, par4);
	 }

	 @Override
	 public boolean canBlockStay(World par1World, int par2, int par3, int par4)
	 {
		 return true;
	 }

	 @Override
	 public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	 {
		 return AxisAlignedBB.getAABBPool().getAABB((double)par2 + this.minX, (double)par3 + this.minY, (double)par4 + this.minZ, (double)par2 + this.maxX, (double)par3 + this.maxY, (double)par4 + this.maxZ);
	 }

	 public void onBlockActivated(EntityPlayer par5EntityPlayer)
	 {
		 par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.fertiliser.itemID);
	 }

	 public int idPicked(World par1World, int par2, int par3, int par4)
	 {
		 return ModBlocks.vinerack.blockID;
	 }

	 /*/
	public int quantityDropped(Random par1Random)
	{
		return 2 + par1Random.nextInt(5);
	}
	/*/

	 @Override
	 public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
	 {
		 ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

		 if (metadata >= 0)
		 {
			 ret.add(new ItemStack(ModBlocks.vinerack, 1));
		 }

		 if (metadata > 5)
		 {
			 ret.add(new ItemStack(ModFruits.peaPod, 4));
		 }
		 if (metadata > 6)
		 {
			 ret.add(new ItemStack(ModFruits.peaPod, 4));
		 }

		 return ret;
	 } 

	 @Override
	 protected boolean canThisPlantGrowOnThisBlockID(int par1)
	 {
		 return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID || par1 == ModCrops.peaCrop.blockID || par1 == ModCrops.peaCropb.blockID || par1 == ModCrops.peaCropc.blockID || par1 == ModCrops.peaCropd.blockID;
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

			 byte b0 = 0;

			 if (Block.opaqueCubeLookup[l] && ! Block.opaqueCubeLookup[il])
			 {
				 b0 = 0;
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
			 this.onBlockDestroyedByPlayer(world, x, y, z, 2);
			 world.setBlock(x, y, z, ModBlocks.vinerackb.blockID);
		 }

		 if (l == 1)
		 {
			 this.onBlockDestroyedByPlayer(world, x, y, z, 2);
			 world.setBlock(x, y, z, ModBlocks.vinerack.blockID);
		 }

		 if (l == 2)
		 {
			 this.onBlockDestroyedByPlayer(world, x, y, z, 2);
			 world.setBlock(x, y, z, ModBlocks.vinerackd.blockID);
		 }

		 if (l == 3)
		 {
			 this.onBlockDestroyedByPlayer(world, x, y, z, 2);
			 world.setBlock(x, y, z, ModBlocks.vinerackc.blockID);
		 }
	 }
}
