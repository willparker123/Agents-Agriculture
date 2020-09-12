package agentsmod;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockCropWeed extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray; 
    
	protected BlockCropWeed(int par1)
	{
		super(par1); 
		setTickRandomly(true);
		float f = 0.5F;
		this.disableStats();
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
		if ((par1World.getBlockMetadata(par2, par3, par4) >= 3))
		{
			par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFruits.weed,3));
		    this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
		    par1World.setBlockMetadataWithNotify(par2, par3, par4, 1, 2);
		}
					else
					{
						return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer, par6, par7, par8, par9);
					}
					
					return false;
	}
	
	public boolean modfertilize(World par1World, int par2, int par3, int par4)
    {
    	        return par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
    }
    
	public void fertilize(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 0, 1);

        if (l > 3)
        {
            l = 3;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }
	
	 @SideOnly(Side.CLIENT)

	    /**
	     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	     */
	    public Icon getIcon(int par1, int par2)
	    {
	        if (par2 < 0 || par2 > 3)
	        {
	            par2 = 3;
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
	        this.iconArray = new Icon[4];

	        for (int i = 0; i < this.iconArray.length; ++i)
	        {
	            this.iconArray[i] = par1IconRegister.registerIcon(ModCrops.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
	        }
	    }

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public void setBlockBoundsForItemRender()
	{
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		//0F 0F 0F Width Height Length
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

    private float getGrowthRate(World par1World, int par2, int par3, int par4)
    {
        float var5 = 1F;
        int var6 = par1World.getBlockId(par2, par3, par4 - 1);
        int var7 = par1World.getBlockId(par2, par3, par4 + 1);
        int var8 = par1World.getBlockId(par2 - 1, par3, par4);
        int var9 = par1World.getBlockId(par2 + 1, par3, par4);
        int var10 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
        int var11 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
        int var12 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
        int var13 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
        boolean var14 = var8 == this.blockID || var9 == this.blockID;
        boolean var15 = var6 == this.blockID || var7 == this.blockID;
        boolean var16 = var10 == this.blockID || var11 == this.blockID || var12 == this.blockID || var13 == this.blockID;

        for (int var17 = par2 - 1; var17 <= par2 + 1; ++var17)
        {
            for (int var18 = par4 - 1; var18 <= par4 + 1; ++var18)
            {
                int var19 = par1World.getBlockId(var17, par3 - 1, var18);
                float var20 = 0.0F;

                if (blocksList[var19] != null && blocksList[var19].canSustainPlant(par1World, var17, par3 - 1, var18, ForgeDirection.UP, this))
                {
                    var20 = 1.0F;

                    if (blocksList[var19].isFertile(par1World, var17, par3 - 1, var18))
                    {
                        var20 = 3.0F;
                    }
                }

                if (var17 != par2 || var18 != par4)
                {
                    var20 /= 4.0F;
                }

                var5 += var20;
            }
        }

        if (var16 || var14 && var15)
        {
            var5 /= 2.0F;
        }

        return var5;
    }


    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return super.canPlaceBlockAt(par1World, par2, par3, par4) && canBlockStay(par1World, par2, par3, par4);
    }

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    @Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID|| par1 == ModCrops.weedCrop.blockID;
    }

	public int getRenderType()
	{
		return 1;
	}

    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        if (par1 >= 3)
        {
            return ModFruits.weed.itemID;
        }
        else
        {
            return 0;
        }
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
    	return 3 + par1Random.nextInt(6);
    }
   
    /*/
    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);

        if (par1World.isRemote)
        {
            return;
        }

        int i = 3 + par7;

        for (int j = 0; j < i; j++)
        {
            if (par1World.rand.nextInt(5) == 0)
            {
                float f = 0.7F;
                float f1 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
                float f2 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
                float f3 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
                EntityItem entityitem = new EntityItem(par1World, (float)par2 + f1, (float)par3 + f2, (float)par4 + f3, new ItemStack(ModFruits.weedSeed));
                entityitem.delayBeforeCanPickup = 10;
                par1World.spawnEntityInWorld(entityitem);
            }
        }
    }
 /*/
    

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModFruits.weedSeed.itemID;
	}
    
    public void onBlockActivated(EntityPlayer par5EntityPlayer)
	{
    	par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.fertiliser.itemID);
	}

	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		super.updateTick(par1World, par2, par3, par4, par5Random);
		
		if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 15)
		{

		int ii = par1World.getBlockMetadata(par2, par3, par4);

		if (ii == 3)
		{
			if (par1World.isAirBlock(par2, par3 + 1, par4)) //If the top block is air
			{
				int var6;

				for (var6 = 1; par1World.getBlockId(par2, par3 - var6, par4) == this.blockID; ++var6)
				{
					;
				}

				if (var6 < 3)
				{
					int var7 = par1World.getBlockMetadata(par2, par3, par4); //gets metadata

					if (var7 == 3) //If the metadata is _ _ _
					{
						par1World.setBlock(par2, par3 + 1, par4, this.blockID);
					}
				}
			}

				int i = par1World.getBlockMetadata(par2, par3, par4);

				if (i < 3)
				{
					float f = getGrowthRate(par1World, par2, par3, par4);

		               if (par5Random.nextInt((int)(25000 / f) + 1) == 0)
					{
						i++;
						par1World.setBlockMetadataWithNotify(par2, par3, par4, i, 2);
					}
				}
			}
		}
	}
}



