package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerGrinder extends Container
{
	private TileEntityGrinder Grinder;

	public int lastBurnTime;
	public int lastItemBurnTime;
	public int lastCookTime;
	
	public ContainerGrinder(InventoryPlayer inventory, TileEntityGrinder tileentity)
	{
		this.Grinder = tileentity;

		this.addSlotToContainer(new Slot(tileentity, 0, 26, 17));
		this.addSlotToContainer(new Slot(tileentity, 1, 26, 53));
		this.addSlotToContainer(new SlotFurnace(inventory.player, tileentity, 2, 131, 35));

		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(inventory, j + i*9 + 9, 8 + j*18, 84 + i*18));
			}
		}
		
		for(int i = 0; i < 9; i++)
		{
			this.addSlotToContainer(new Slot(inventory, i, 8 + i*18, 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting crafting)
	{
		super.addCraftingToCrafters(crafting);
		crafting.sendProgressBarUpdate(this, 0, this.Grinder.cookTime);
		crafting.sendProgressBarUpdate(this, 1, this.Grinder.burnTime);
		crafting.sendProgressBarUpdate(this, 2, this.Grinder.currentItemBurnTime);
	}
	
	public void detectAndSendChanges()
	{
		super.detectAndSendChanges();
		
		for(int i = 0; i < this.crafters.size(); i++)
		{
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			
			if(this.lastCookTime != this.Grinder.cookTime)
			{
				icrafting.sendProgressBarUpdate(this, 0, this.Grinder.cookTime);
			}
			
			if(this.lastBurnTime != this.Grinder.burnTime)
			{
				icrafting.sendProgressBarUpdate(this, 1, this.Grinder.burnTime);
			}
			
			if(this.lastItemBurnTime != this.Grinder.currentItemBurnTime)
			{
				icrafting.sendProgressBarUpdate(this, 2, this.Grinder.currentItemBurnTime);
			}
		}
		
		this.lastCookTime = this.Grinder.cookTime;
		this.lastBurnTime = this.Grinder.burnTime;
		this.lastItemBurnTime = this.Grinder.currentItemBurnTime;
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int slot, int newValue)
	{
		if(slot == 0) this.Grinder.cookTime = newValue;
		if(slot == 1) this.Grinder.burnTime = newValue;
		if(slot == 2) this.Grinder.currentItemBurnTime = newValue;
	}
	
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 != 1 && par2 != 0)
            {
                if (GrinderRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityGrinder.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 3 && par2 < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		return this.Grinder.isUseableByPlayer(entityplayer);
	}

}
