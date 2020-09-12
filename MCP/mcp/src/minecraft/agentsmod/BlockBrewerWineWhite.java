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

public class BlockBrewerWineWhite extends Block
{
	@SideOnly(Side.CLIENT)
	private Icon blockTop;
	@SideOnly(Side.CLIENT)
	private Icon blockBottom;

	public BlockBrewerWineWhite(int par1, Material par2)
	{
		super(par1, Material.wood);
		this.setTickRandomly(true);
	}

	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.blockTop : par1 == 0 ? this.blockBottom : this.blockIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (ModBlocks.brewer.getUnlocalizedName().substring(5)));
		this.blockTop = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
		this.blockBottom = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (ModBlocks.brewer.getUnlocalizedName().substring(5)) + "_bottom");
	}

	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		super.updateTick(par1World, par2, par3, par4, par5Random);

		if (par1World.getBlockLightValue(par2, par3 + 1, par4) <= 10)
		{
			float f = 1.0F;
			
				if (par5Random.nextInt((int)(180F / f) + 1) == 0)
				{
				    this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				    par1World.setBlock(par2, par3, par4, ModBlocks.brewerWineWhiteDone.blockID);
	            }
	        }
	    }

	public String getTextureFile()
	{
		return "/agentsmod/blocks.png";
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.brewer.blockID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModBlocks.brewer.blockID;
	}

	//1 = top
	//0 - bottom
	//5 - left
	//4 right
	//2 front
	//3 back
}
