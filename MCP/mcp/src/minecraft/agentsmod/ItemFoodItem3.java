package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
 
public class ItemFoodItem3 extends Item
 {
     public ItemFoodItem3(int i)
     {
         super(i);
         maxStackSize = 64;
         this.setCreativeTab(ModCreativeTabs.tabDrinks);
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.itemIcon = par1IconRegister.registerIcon(ModFood.modid + ":" + (this.getUnlocalizedName().substring(5)));
     }
     
 	public void takenFromCrafting(EntityPlayer e, ItemStack item, IInventory m)
    {
     for(int i=0; i<m.getSizeInventory(); i++)
  {         
      if(m.getStackInSlot(i) != null)
      {
       ItemStack j = m.getStackInSlot(i);
       if(j.getItem() != null && j.getItem() == ModTools.knife)
       {    
        ItemStack k = new ItemStack(ModTools.knife, 2);
        k.damageItem(j.getItemDamage() + 1, e);
        m.setInventorySlotContents(i, k);
       }
      }
  }
  }
 
 }