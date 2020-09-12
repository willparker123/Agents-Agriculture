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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockLattice3 extends Block
{
	@SideOnly(Side.CLIENT)
	private Icon blockFront;
	
    protected BlockLattice3(int par1, Material wood)
    {
        super(par1, Material.wood);
        this.setBlockBounds(0.9375F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
				par1World.setBlock(par2, par3, par4, ModCrops.grapeCropc.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.grapeSeed.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.grapeCropc.blockID);
			}

		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.grapePurpleSeed.itemID)
		{
			if (par5EntityPlayer.capabilities.isCreativeMode)
			{
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.grapePurpleCropc.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.grapePurpleSeed.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.grapePurpleCropc.blockID);
			}

		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.bean.itemID)
		{
			if (par5EntityPlayer.capabilities.isCreativeMode)
			{
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.beanCropc.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.bean.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.beanCropc.blockID);
			}

		}
		
		if (par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID == ModFruits.pea.itemID)
		{
			if (par5EntityPlayer.capabilities.isCreativeMode)
			{
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.peaCropc.blockID);
			}
			
			else
			{
				par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.pea.itemID);
				this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
				par1World.setBlock(par2, par3, par4, ModCrops.peaCropc.blockID);
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
        this.setBlockBounds(0.9375F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		//0F 0F 0F Length Height Width
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
}
