package agentsmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityElementExtractor extends TileEntity implements ISidedInventory
{

	private String localisedName;

	private static final int[] slots_top = new int[] {0};
	private static final int[] slots_bottom = new int[]{1};
	private static final int[] slots_sides = new int[]{2};

	public int furnaceSpeed = 400; //how many ticks to cook an item
	public int burnTime;
	public int currentItemBurnTime;
	public int cookTime;

	private ItemStack[] slots = new ItemStack[3]; //number of slots in gui

	public int getSizeInventory()
	{
		return this.slots.length;
	}

	public String getInvName()
	{
		return this.isInvNameLocalized() ? this.localisedName : "Chemical Extractor";
	}

	public void setGuiDisplayName(String displayName)
	{
		this.localisedName = displayName;
	}

	public boolean isInvNameLocalized()
	{
		return this.localisedName != null && this.localisedName.length() > 0;
	}

	@Override
	public ItemStack getStackInSlot(int i)
	{
		return this.slots[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j)
	{
		if(this.slots[i] != null)
		{
			ItemStack itemstack;

			if(this.slots[i].stackSize <= j)
			{
				itemstack = this.slots[i];
				this.slots[i] = null;
				return itemstack;
			}

			else
			{
				itemstack = this.slots[i].splitStack(j);

				if(this.slots[i].stackSize == 0)
				{
					this.slots[i] = null;
				}
				
				return itemstack;
			}
		}
		
		return null;
	}

	public ItemStack getStackInSlotOnClosing(int i)
	{
		if(this.slots[i] != null)
		{
			ItemStack itemstack = this.slots[i];
			this.slots[i] = null;
			return itemstack;
		}
		
		return null;
	}

	public void setInventorySlotContents(int i, ItemStack itemstack)
	{
		this.slots[i] = itemstack;
		
		if(itemstack != null && itemstack.stackSize > this.getInventoryStackLimit())
		{
			itemstack.stackSize = this.getInventoryStackLimit();
		}
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	public boolean isUseableByPlayer(EntityPlayer entityplayer)
	{
		return this.worldObj.getBlockTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : entityplayer.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64D;
	}

	public void openChest()
	{

	}

	public void closeChest()
	{

	}
	
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		
		nbt.setShort("BurnTime", (short)this.burnTime);
		nbt.setShort("CookTime", (short)this.cookTime);
		
		NBTTagList list = new NBTTagList();
		
		for(int i = 0; i < this.slots.length; i++)
		{
			if(this.slots[i] != null)
			{
				NBTTagCompound compound = new NBTTagCompound();
				compound.setByte("Slot", (byte)i);
				this.slots[i].writeToNBT(compound);
				list.appendTag(compound);
			}
		}
		
		nbt.setTag("Items", list);
		
		if(this.isInvNameLocalized())
		{
			nbt.setString("CustomName", this.localisedName);
		}
	}
	
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList nbttaglist = par1NBTTagCompound.getTagList("Items");
        this.slots = new ItemStack[this.getSizeInventory()];

        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.tagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if (b0 >= 0 && b0 < this.slots.length)
            {
                this.slots[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.burnTime = par1NBTTagCompound.getShort("BurnTime");
        this.cookTime = par1NBTTagCompound.getShort("CookTime");
        this.currentItemBurnTime = getItemBurnTime(this.slots[1]);

        if (par1NBTTagCompound.hasKey("CustomName"))
        {
            this.localisedName = par1NBTTagCompound.getString("CustomName");
        }
    }

	public void updateEntity()
	{
		boolean flag = this.burnTime > 0;
		boolean flag1 = false;

		if(this.burnTime > 0)
		{
			this.burnTime--;
		}

		if(!this.worldObj.isRemote)
		{
			if(this.burnTime == 0 && this.canSmelt())
			{
				this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]); //fuel slot

				if(this.burnTime > 0)
				{
					flag1 = true;

					if(this.slots[1] != null)
					{
						this.slots[1].stackSize--;

						if(this.slots[1].stackSize == 0)
						{
							this.slots[1] = this.slots[1].getItem().getContainerItemStack(this.slots[1]);
						}
					}
				}
			}

			if(this.isBurning() && this.canSmelt())
			{
				this.cookTime++;

				if(this.cookTime == this.furnaceSpeed)
				{
					this.cookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
			}

			else
			{
				this.cookTime = 0;
			}


			if(flag != this.burnTime > 0)
			{
				flag1 = true;
				BlockElementExtractor.updateElementExtractorBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			}
		}

		if(flag1)
		{
			this.onInventoryChanged();
		}
	}



	boolean isBurning()
	{
		return this.burnTime > 0;
	}

	static boolean isItemFuel(ItemStack itemstack)
	{
		return getItemBurnTime(itemstack) > 0; //if an item burns for under 0 ticks it is not a fuel
	}

	private boolean canSmelt()
	{
		if(this.slots[0] == null)
		{
			return false;
		}

		else
		{
			ItemStack itemstack = ElementExtractorRecipes.smelting().getSmeltingResult(this.slots[0]);

			if(itemstack == null) return false;
			if(this.slots[2] == null) return true;
			if(!this.slots[2].isItemEqual(itemstack)) return false;

			int result = this.slots[2].stackSize + itemstack.stackSize;

			return(result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
		}
	}

	public void smeltItem()
	{
		if(this.canSmelt())
		{
			ItemStack itemstack = ElementExtractorRecipes.smelting().getSmeltingResult(this.slots[0]);

			if(this.slots[2] == null)
			{
				this.slots[2] = itemstack.copy();
			}

			else if(this.slots[2].isItemEqual(itemstack))
			{
				this.slots[2].stackSize += itemstack.stackSize;
			}

			this.slots[0].stackSize--;

			if(this.slots[0].stackSize <= 0)
			{
				this.slots[0] = null;
			}
		}
	}

	private static int getItemBurnTime(ItemStack itemstack)
	{
		if(itemstack == null)
		{
			return 0; //ticks any item burns for
		}
		else
		{
			int i = itemstack.itemID;
			Item item = itemstack.getItem();

			if(item instanceof ItemBlock && Block.blocksList[i] != null)
			{
				Block block = Block.blocksList[i];

				if(block == ModFuels.firefuelBlock)
				{
					return 32000; //ticks it burns for
				}
				
				if(block == ModFuels.firefuelBlock2)
				{
					return 128000; //ticks it burns for
				}
				
				if(block == ModFuels.firefuelBlock3)
				{
					return 512000; //ticks it burns for
				}

			}

			if (i == Item.bucketLava.itemID) return 2800; //ticks it burns for
			if (i == ModFuels.firefuel.itemID) return 3200; //ticks it burns for
			if (i == ModFuels.firefuel2.itemID) return 12800; //ticks it burns for
			if (i == ModFuels.firefuel3.itemID) return 51200; //ticks it burns for
			
			return GameRegistry.getFuelValue(itemstack);
		}
	}

	public int[] getAccessibleSlotsFromSide(int par1)
    {
        return par1 == 0 ? slots_bottom : (par1 == 1 ? slots_top : slots_sides);
    }
	
	public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack)
    {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(par2ItemStack) : true);
    }

	public boolean canInsertItem(int i, ItemStack itemstack, int j)
	{
		return this.isItemValidForSlot(i, itemstack);
	}

	public boolean canExtractItem(int i, ItemStack itemstack, int j)
	{
		return j != 0 || i != 1 || itemstack.itemID == Item.bucketEmpty.itemID;
	}

	public int getBurnTimeRemainingScaled(int i)
	{
		if(this.currentItemBurnTime == 0)
		{
			this.currentItemBurnTime = this.furnaceSpeed;
		}
		
		return this.burnTime * i / this.currentItemBurnTime;
	}

	public int getCookProgressScaled(int i)
	{
		return this.cookTime * i / this.furnaceSpeed;
	}

}
