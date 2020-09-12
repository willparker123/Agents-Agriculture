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

public class BlockPotionMaker4 extends Block
{
	@SideOnly(Side.CLIENT)
	private Icon blockTop;

	@SideOnly(Side.CLIENT)
	private Icon blockFront;

	@SideOnly(Side.CLIENT)
	private Icon blockActivated;


	public BlockPotionMaker4(int par1, Material par2)
	{
		super(par1, Material.rock);
		this.setTickRandomly(true);
	}

	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.blockTop : par1 == 5 ? this.blockFront : this.blockIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
		this.blockTop = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
		this.blockFront = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_front");
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{		
		if (par5EntityPlayer.inventory.hasItem(Item.glassBottle.itemID))
		{
			if (par5EntityPlayer.inventory.hasItem(Item.netherStalkSeeds.itemID))
			{
				if (par5EntityPlayer.inventory.hasItem(ModFood.burntbread.itemID))
				{
					if (par5EntityPlayer.inventory.hasItem(Item.redstone.itemID))
					{
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glassBottle.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.netherStalkSeeds.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(ModFood.burntbread.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.redstone.itemID);
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionhungerLong, 1));
						return true;
					}

					if (par5EntityPlayer.inventory.hasItem(Item.glowstone.itemID))
					{
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glassBottle.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.netherStalkSeeds.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(ModFood.burntbread.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glowstone.itemID);
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionhungerStrong, 1));
						return true;
					}

					else
					{
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glassBottle.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.netherStalkSeeds.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(ModFood.burntbread.itemID);
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionhunger, 1));
						return true;
					}
				}

				if (par5EntityPlayer.inventory.hasItem(ModTools.scorpiontail.itemID))
				{
					if (par5EntityPlayer.inventory.hasItem(Item.redstone.itemID))
					{
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glassBottle.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.netherStalkSeeds.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(ModTools.scorpiontail.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.redstone.itemID);
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionvenomLong, 1));
						return true;
					}

					if (par5EntityPlayer.inventory.hasItem(Item.glowstone.itemID))
					{
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glassBottle.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.netherStalkSeeds.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(ModTools.scorpiontail.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glowstone.itemID);
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionvenomStrong, 1));
						return true;
					}

					else
					{
						par5EntityPlayer.inventory.consumeInventoryItem(Item.glassBottle.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(Item.netherStalkSeeds.itemID);
						par5EntityPlayer.inventory.consumeInventoryItem(ModTools.scorpiontail.itemID);
						par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.poison, 1));
						return true;
					}

				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}

		if (par5EntityPlayer.inventory.hasItem(ModTools.poison.itemID))
		{
			if (par5EntityPlayer.inventory.hasItem(Item.redstone.itemID))
			{
				par5EntityPlayer.inventory.consumeInventoryItem(Item.redstone.itemID);
				par5EntityPlayer.inventory.consumeInventoryItem(ModTools.poison.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionvenomLong, 1));
				return true;
			}

			if (par5EntityPlayer.inventory.hasItem(Item.glowstone.itemID))
			{
				par5EntityPlayer.inventory.consumeInventoryItem(Item.glowstone.itemID);
				par5EntityPlayer.inventory.consumeInventoryItem(ModTools.poison.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionvenomStrong, 1));
				return true;
			}

			else
			{
				return true;
			}
		}

		if (par5EntityPlayer.inventory.hasItem(ModTools.potionhunger.itemID))
		{
			if (par5EntityPlayer.inventory.hasItem(Item.redstone.itemID))
			{
				par5EntityPlayer.inventory.consumeInventoryItem(Item.redstone.itemID);
				par5EntityPlayer.inventory.consumeInventoryItem(ModTools.potionhunger.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionhungerLong, 1));
				return true;
			}

			if (par5EntityPlayer.inventory.hasItem(Item.glowstone.itemID))
			{
				par5EntityPlayer.inventory.consumeInventoryItem(Item.glowstone.itemID);
				par5EntityPlayer.inventory.consumeInventoryItem(ModTools.potionhunger.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.potionhungerStrong, 1));
				return true;
			}

			else
			{
				return true;
			}
		}

		else
		{
			return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
		}
	}

	public String getTextureFile()
	{
		return "/agentsmod/blocks.png";
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.potionmaker.blockID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModBlocks.potionmaker.blockID;
	}

	//1 = top
	//0 - bottom
	//5 - left
	//4 right
	//2 front
	//3 back
}
