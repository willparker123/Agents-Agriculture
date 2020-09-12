package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler4 implements ICraftingHandler
{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix)
	{
		for(int i=0; i < craftMatrix.getSizeInventory(); i++) //Checks all the slots
		{               
			if(craftMatrix.getStackInSlot(i) != null) //If there is an item
			{
				ItemStack j = craftMatrix.getStackInSlot(i); //Gets the item
				
				if (item.itemID == ModTools.destalker.itemID)
				{
					if(j.getItem() != null && j.getItem() == ModTools.destalker) //If it's a firestone
					{
						ItemStack a = new ItemStack(ModTools.destalker, 2, (j.getItemDamage() + j.getMaxDamage())); //Makes a new itemstack that's been damaged and has 2 items
						if(a.getItemDamage() >= a.getMaxDamage())
						{ //If it is destroyed
							--a.stackSize; //Removes the added item
						}
					}
				}
				else
				{
					if(j.getItem() != null && j.getItem() == ModTools.destalker) //If it's a firestone
					{
						ItemStack a = new ItemStack(ModTools.destalker, 2, (j.getItemDamage() + 1)); //Makes a new itemstack that's been damaged and has 2 items
						if(a.getItemDamage() >= a.getMaxDamage())
						{ //If it is destroyed
							--a.stackSize; //Removes the added item
						}
						craftMatrix.setInventorySlotContents(i, a); //Sets the slot to the new item
					}
				}
			}

			/*/
			if(player.inventory.hasItem(ModFood.destalker.itemID)); //If there is an item
			{
				player.inventory.consumeInventoryItem(ModFood.destalker.itemID);
			}
			/*/
		}

		if (item.itemID == ModFood.biscuitjaffa.itemID)
		{
			player.addStat(ModFood.jaffaAchieve, 1);
		}

		if (item.itemID == ModFood.buttiejam.itemID)
		{
			player.addStat(ModFood.jamAchieve, 1);
		}

		if (item.itemID == ModTools.baseballbat.itemID)
		{
			player.addStat(ModTools.pbjtAchieve, 1);
		}

		if (item.itemID == ModFood.eggScrambled.itemID)
		{
			player.addStat(ModFood.eggAchieve, 1);
		}

		if (item.itemID == ModFood.bun.itemID)
		{
			player.addStat(ModFood.bunsAchieve, 1);
		}

		if (item.itemID == ModFood.pepperoni.itemID)
		{
			player.addStat(ModFood.salamiAchieve, 1);
		}

		if (item.itemID == ModFood.friedchickenpack.itemID)
		{
			player.addStat(ModFood.kfcAchieve, 1);
		}
		
		if (item.itemID == ModFood.cerealFlakesPack.itemID)
		{
			player.addStat(ModFood.kellogsAchieve, 1);
		}
		
		if (item.itemID == ModFood.burgerHorse.itemID)
		{
			player.addStat(ModFood.tescoAchieve, 1);
		}
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item)
	{
		if (item.itemID == ModFruits.ash.itemID)
        {
                player.addStat(ModFruits.ashAchieve, 1);
        }
		
		if (item.itemID == ModFood.horsemeatCooked.itemID)
        {
                player.addStat(ModFood.horseAchieve, 1);
        }
	}
}