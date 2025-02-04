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

public class BlockDNAFabricator extends Block
{
	@SideOnly(Side.CLIENT)
	private Icon blockTop;

	@SideOnly(Side.CLIENT)
	private Icon blockSides1;
	@SideOnly(Side.CLIENT)
	private Icon blockSides2;

	@SideOnly(Side.CLIENT)
	private Icon blockFront;


	public BlockDNAFabricator(int par1, Material par2)
	{
		super(par1, Material.iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.blockTop : par1 == 4 ? this.blockSides1 : par1 == 5 ? this.blockSides2 : par1 == 2 ? this.blockFront : par1 == 3 ? this.blockFront : this.blockIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
		this.blockTop = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
		this.blockSides1 = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_side1");
		this.blockSides2 = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_side2");
		this.blockFront = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "_front");
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA57.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA57.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.garlic, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA60.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA60.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.chicleSeed, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA62.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA62.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutHard, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA63.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA63.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutHarder, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA64.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA64.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.peanut, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA67.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA67.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.mintSeed, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA69.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA69.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.raspberrySeed, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA70.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA70.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.braspberrySeed, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA71.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA71.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.blackcurrantSeed, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA72.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA72.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.blueberrySeed, 1));
				return true;
			}

			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA73.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA73.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutGold, 1));
				return true;
			}
			
			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA74.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA74.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutDiamond, 1));
				return true;
			}
			
			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA75.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA75.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.hopSeed, 1));
				return true;
			}
			
			if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModDNA.DNA76.itemID)
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModDNA.DNA76.itemID);
				par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.grapePurpleSeed, 1));
				return true;
			}

			else
			{
				return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
			}
}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModBlocks.DNAextractor2.blockID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModBlocks.DNAextractor2.blockID;
	}

	//1 = top
	//0 - bottom
	//5 - left
	//4 right
	//2 front
	//3 back
}
