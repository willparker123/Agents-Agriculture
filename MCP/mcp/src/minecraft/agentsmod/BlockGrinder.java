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
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockGrinder extends BlockContainer 
{


	private final Random GrinderRand = new Random();

    /**
     * This flag is used to prevent the furnace inventory to be dropped upon block removal, is used internally when the
     * furnace block changes from idle to active and vice-versa.
     */
    private static boolean keepGrinderInventory;
	private final boolean isActive;

	private static boolean keepInventory;

    //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
    //And the second three are the top-right corner.
	public BlockGrinder(int id, boolean isActive)
	{
		super(id, Material.iron); //edit
		this.setTickRandomly(true);
		this.isActive = isActive;
		this.setBlockBounds(-0.5F, 0.0F, -0.5F, 1.5F, 0.625F, 1.5F);
	}
    
    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
            return -1;
    }
    
    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
            return false;
    }

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon("modguigrinder:GrinderItem");
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
		return this.blockIcon;
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return ModGuiGrinder.GrinderIdle.blockID; //edit
	}

	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModGuiGrinder.GrinderIdle.blockID; //edit
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
		return new TileEntityGrinder();
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

		if (itemstack.hasDisplayName())
		{
			((TileEntityGrinder)world.getBlockTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
		}
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (par1World.isRemote)
		{
			return true;
		}
		else
		{
			TileEntityGrinder tileEntityGrinder = (TileEntityGrinder)par1World.getBlockTileEntity(par2, par3, par4);

			if (tileEntityGrinder != null)
			{
				par5EntityPlayer.openGui(ModGuiGrinder.instance, ModGuiGrinder.guiIdGrinder, par1World, par2, par3, par4);
			}

			return true;
		}
	}

	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
        //if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
        //{
        	//TileEntityGrinder.burnTime > 0;
        //}
        
		if (this.isActive)
		{
			int l = par1World.getBlockMetadata(par2, par3, par4);
			float f = (float)par2 + 0.5F;
			float f1 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 100.0F;
			float f2 = (float)par4 + 0.5F;
			float f3 = 0.52F;
			float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

			if (l == 4)
			{
				par1World.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 5)
			{
				par1World.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 2)
			{
				par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 3)
			{
				par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
			}
		}
	}

	public static void updateGrinderBlockState(boolean active, World par1World, int xCoord, int yCoord, int zCoord)
	{
		int l = par1World.getBlockMetadata(xCoord, yCoord, zCoord);
        TileEntity tileentity = par1World.getBlockTileEntity(xCoord, yCoord, zCoord);
        keepGrinderInventory = true;

        if (active)
        {
            par1World.setBlock(xCoord, yCoord, zCoord, ModGuiGrinder.GrinderActive.blockID);
        }
        else
        {
            par1World.setBlock(xCoord, yCoord, zCoord, ModGuiGrinder.GrinderIdle.blockID);
        }

        keepGrinderInventory = false;
        par1World.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, l, 2);

        if (tileentity != null)
        {
            tileentity.validate();
            par1World.setBlockTileEntity(xCoord, yCoord, zCoord, tileentity);
        }
	}
	
	public boolean hasCompararatorInputOverride()
	{
		return true;
	}
	
	public int getCompararatorInputOverride(World world, int x, int y, int z, int i)
	{
		return Container.calcRedstoneFromInventory((IInventory)world.getBlockTileEntity(x, y, z));
	}
	
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        if (!keepGrinderInventory)
        {
            TileEntityGrinder tileentityGrinder = (TileEntityGrinder)par1World.getBlockTileEntity(par2, par3, par4);

            if (tileentityGrinder != null)
            {
                for (int j1 = 0; j1 < tileentityGrinder.getSizeInventory(); ++j1)
                {
                    ItemStack itemstack = tileentityGrinder.getStackInSlot(j1);

                    if (itemstack != null)
                    {
                        float f = this.GrinderRand.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.GrinderRand.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.GrinderRand.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int k1 = this.GrinderRand.nextInt(21) + 10;

                            if (k1 > itemstack.stackSize)
                            {
                                k1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= k1;
                            EntityItem entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.itemID, k1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.GrinderRand.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.GrinderRand.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.GrinderRand.nextGaussian() * f3);
                            par1World.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                par1World.func_96440_m(par2, par3, par4, par5);
            }
        }

        super.breakBlock(par1World, par2, par3, par4, par5, par6);
    }
}
