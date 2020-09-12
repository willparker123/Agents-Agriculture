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
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockLattice extends Block
{
	@SideOnly(Side.CLIENT)
	private Icon blockFront;
	
    protected BlockLattice(int par1, Material wood)
    {
        super(par1, Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0625F, 1.0F, 1.0F);
		this.setLightOpacity(1);
		this.setTickRandomly(true);
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.grapeSeed.itemID)
		{
			if (par5EntityPlayer.capabilities.isCreativeMode)
			{
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.grapeCrop.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.grapeSeed.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.grapeCrop.blockID);
			}

		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.grapePurpleSeed.itemID)
		{
			if (par5EntityPlayer.capabilities.isCreativeMode)
			{
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.grapePurpleCrop.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.grapePurpleSeed.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.grapePurpleCrop.blockID);
			}

		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.bean.itemID)
		{
			if (par5EntityPlayer.capabilities.isCreativeMode)
			{
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.beanCrop.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.bean.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.beanCrop.blockID);
			}

		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.pea.itemID)
		{
			if (par5EntityPlayer.capabilities.isCreativeMode)
			{
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.peaCrop.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.pea.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.peaCrop.blockID);
			}

		}
		else
		{
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
		}
		return false;
	}
    
    public void setBlockBoundsForItemRender()
	{
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0625F, 1.0F, 1.0F);
		//0F 0F 0F Width Height Length
	}
    
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

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockFront = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
		this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "2");
	}
    
    public Icon getIcon(int par1, int par2)
	{
		return par1 == 4 ? this.blockFront : par1 == 5 ? this.blockFront : this.blockIcon;
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.vinerack.blockID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModBlocks.vinerack.blockID;
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
			world.setBlock(x, y, z, ModBlocks.vinerackb.blockID);
		}

		if (l == 1)
		{

		}

		if (l == 2)
		{
			this.onBlockDestroyedByPlayer(world, x, y, z, 1);
			world.setBlock(x, y, z, ModBlocks.vinerackd.blockID);
		}

		if (l == 3)
		{
			this.onBlockDestroyedByPlayer(world, x, y, z, 1);
			world.setBlock(x, y, z, ModBlocks.vinerackc.blockID);
		}
	}
}
