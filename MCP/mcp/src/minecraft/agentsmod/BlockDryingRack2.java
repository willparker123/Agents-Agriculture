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

public class BlockDryingRack2 extends BlockDirectional
{
	@SideOnly(Side.CLIENT)
	private Icon blockFront;

	public BlockDryingRack2(int par1, Material par2)
	{
		super(par1, Material.wood);
		this.setBlockBounds(0.4F, 0.0F, 0.0F, 0.6F, 1.0F, 1.0F);
		this.setLightOpacity(1);
		this.setTickRandomly(true);
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
		return par1 == 4 ? this.blockFront : par1 == 5 ? this.blockFront : this.blockIcon;
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pigskin.itemID)
		{
			par5EntityPlayer.inventory.consumeInventoryItem(ModFood.pigskin.itemID);
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, ModBlocks.rackPigskinb.blockID);
			return false;
		}

		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == Item.leather.itemID)
		{
			par5EntityPlayer.inventory.consumeInventoryItem(Item.leather.itemID);
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, ModBlocks.rackLeatherb.blockID);
			return false;
		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModTools.sackWeed.itemID)
		{
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, ModBlocks.rackWeedb.blockID);
			par5EntityPlayer.inventory.consumeInventoryItem(ModTools.sackWeed.itemID);
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.sack,1));
			return false;
		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModTools.sackTobacco.itemID)
		{
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, ModBlocks.rackTobaccob.blockID);
			par5EntityPlayer.inventory.consumeInventoryItem(ModTools.sackTobacco.itemID);
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.sack,1));
			return false;
		}

		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModTools.sackTea.itemID)
		{
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlock(par2, par3, par4, ModBlocks.rackTeab.blockID);
			par5EntityPlayer.inventory.consumeInventoryItem(ModTools.sackTea.itemID);
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.sack,1));
			return false;
		}
		
		else
		{
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
		}
	}

	public void setBlockBoundsForItemRender()
	{
		this.setBlockBounds(0.4F, 0.0F, 0.0F, 0.6F, 1.0F, 1.0F);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
		this.blockFront = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "2");
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

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.rack.blockID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModBlocks.rack.blockID;
	}
}
