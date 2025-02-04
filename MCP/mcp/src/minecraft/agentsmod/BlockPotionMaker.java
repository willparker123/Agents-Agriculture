package agentsmod;

import java.util.Random;

import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockPotionMaker extends Block 
{

	@SideOnly(Side.CLIENT)
	private Icon iconTop;
	@SideOnly(Side.CLIENT)
	private Icon iconFront;
	@SideOnly(Side.CLIENT)
	private Icon iconBottom;

	public BlockPotionMaker(int id)
	{
		super(id, Material.iron); //edit
		this.setTickRandomly(true);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(ModGuiPotionMaker.modid + ":" + "potionmaker_side"); //edit
		this.iconTop = iconRegister.registerIcon(ModGuiPotionMaker.modid + ":" + "potionmaker_top");
		this.iconBottom = iconRegister.registerIcon(ModGuiPotionMaker.modid + ":" + "potionmaker_bottom");
		this.iconFront = iconRegister.registerIcon(ModGuiPotionMaker.modid + ":" + "potionmaker_front");
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.iconTop : par1 == 0 ? this.iconBottom : par1 == par2 ? this.iconFront : this.blockIcon;
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModGuiPotionMaker.potionMakerIdle.blockID; //edit
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModGuiPotionMaker.potionMakerIdle.blockID; //edit
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

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemstack)
	{
		int l = MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (l == 0)
		{
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}

		if (l == 1)
		{
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}

		if (l == 2)
		{
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}

		if (l == 3)
		{
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
	}

	public boolean onBlockActivated(World par1World, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if(!par5EntityPlayer.isSneaking())
		{
			par5EntityPlayer.openGui(ModGuiPotionMaker.instance, ModGuiPotionMaker.guiIdPotionMaker, par1World, x, y, z);
			return true;
		}
		else
		{
			return true;
		}
	}
}
