package agentsmod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockCropWalnutHard extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;
    
	protected BlockCropWalnutHard(int par1)
	{
		super(par1);
		setTickRandomly(true);
		float f = 0.5F;
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
		this.disableStats();
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
    
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if ((par1World.getBlockMetadata(par2, par3, par4) >= 10))
		{
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.walnutHard,5));
		    this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
		    par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
		}
					else
					{
						return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
					}
					
					return false;
	}
	
    public void modfertilize(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 1, 1); //Between 2-5 stages grown per bonemeal

        if (l > 10) //Stages
        {
            l = 10;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }
    
	 @SideOnly(Side.CLIENT)

	    /**
	     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	     */
	    public Icon getIcon(int par1, int par2)
	    {
	        if (par2 < 0 || par2 > 10)
	        {
	            par2 = 10;
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
	        this.iconArray = new Icon[11];

	        for (int i = 0; i < this.iconArray.length; ++i)
	        {
	            this.iconArray[i] = par1IconRegister.registerIcon(ModCrops.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
	        }
	    }

	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		super.updateTick(par1World, par2, par3, par4, par5Random);

		if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 13)
		{
			int i = par1World.getBlockMetadata(par2, par3, par4);

			if (i < 10)
			{
				float f = getGrowthRate(par1World, par2, par3, par4);

	               if (par5Random.nextInt((int)(2500000 / f) + 1) == 0)
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

	protected boolean canThisPlantGrowOnThisBlockID(int par1)
	{
		return par1 == Block.tilledField.blockID;
	}

	public int getRenderType()
	{
		return 1;
	}


	public int idDropped(int par1, Random par2Random, int par3)
    {
        if (par1 >= 10)
        {
            return ModFruits.walnutHard.itemID;
        }
        else
        {
            return 0;
        }
    }

public int quantityDropped(Random par1Random)
{
	return 4 + par1Random.nextInt(6);
}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModFruits.walnutHard.itemID;
	}
	
	public void onBlockActivated(EntityPlayer par5EntityPlayer)
	{
    	par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.fertiliser.itemID);
	}


}
