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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockCropGrape4 extends BlockCrops
{
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;
	private Random par1Random;

	protected BlockCropGrape4(int par1)
	{
		super(par1);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0625F);
		this.setLightOpacity(1);
		this.setTickRandomly(true);
		this.disableStats();
	}

	@Override
	protected boolean canThisPlantGrowOnThisBlockID(int par1)
	{
		return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID || par1 == ModCrops.grapeCrop.blockID || par1 == ModCrops.grapeCropb.blockID || par1 == ModCrops.grapeCropc.blockID || par1 == ModCrops.grapeCropd.blockID;
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{

		if (par1World.getBlockMetadata(par2, par3, par4) > 5)
		{
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.grape,3));
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
		}
		if (par1World.getBlockMetadata(par2, par3, par4) > 6)
		{
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.grape,3));
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
	        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 0, 2);

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
			 this.iconArray[i] = par1IconRegister.registerIcon(ModCrops.modid + ":" + "grapeCrop" + i);
		 }
	 }

	 public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	 {
		 super.updateTick(par1World, par2, par3, par4, par5Random);

		 if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 14)
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

	 public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	 {
		 super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);

		 if (par1World.isRemote)
		 {
			 return;
		 }

		 int i = 5 + par7;

		 for (int j = 0; j < i; j++)
		 {
			 if (par1World.rand.nextInt(5) == 0)
			 {
				 float f = 0.7F;
				 float f1 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
				 float f2 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
				 float f3 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
				 EntityItem entityitem = new EntityItem(par1World, (float)par2 + f1, (float)par3 + f2, (float)par4 + f3, new ItemStack(ModFruits.grapeSeed));
				 entityitem.delayBeforeCanPickup = 10;
				 par1World.spawnEntityInWorld(entityitem);
			 }
		 }
	 }

	 @Override
	 public void setBlockBoundsForItemRender()
	 {
		 this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0625F);
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
			 ret.add(new ItemStack(ModFruits.grape, 4));
		 }

		 return ret;
	 } 

}
