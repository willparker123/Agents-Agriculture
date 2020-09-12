package agentsmod;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCheeseMoldSet extends Block
{
	@SideOnly(Side.CLIENT)
	private Icon blockTop;

	public BlockCheeseMoldSet(int par1, Material par2)
	{
		super(par1, Material.piston);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.4F, 1.0F);
		this.setLightOpacity(1);
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFood.cheesewheel,1));
		this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
		par1World.setBlock(par2, par3, par4, ModBlocks.cheesemold.blockID);
		return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
	}

	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.blockTop : this.blockIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
		this.blockTop = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "2");
	}

	public void setBlockBoundsForItemRender()
	{
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.4F, 1.0F);
		//0F 0F 0F Width Height Length
	}

	public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	{
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	}

	public String getTextureFile()
	{
		return "/agentsmod/blocks.png";
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
		return ModFood.cheesewheel.itemID;
	}

	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	{
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);

		if (par1World.isRemote)
		{
			return;
		}

		int i = 1 + par7;

		for (int j = 0; j < i; j++)
		{
			if (par1World.rand.nextInt(1) == 0)
			{
				float f = 0.7F;
				float f1 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
				float f2 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
				float f3 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
				EntityItem entityitem = new EntityItem(par1World, (float)par2 + f1, (float)par3 + f2, (float)par4 + f3, new ItemStack(ModTools.cheesemold));
				entityitem.delayBeforeCanPickup = 10;
				par1World.spawnEntityInWorld(entityitem);
			}
		}
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModTools.cheesemold.itemID;
	}

}
