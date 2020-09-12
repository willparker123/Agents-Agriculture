package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
 
public class ItemMiscItem2 extends Item
 {
     public ItemMiscItem2(int i)
     {
         super(i);
         maxStackSize = 64;
         this.setCreativeTab(ModCreativeTabs.tabOther);
         this.setCreativeTab(CreativeTabs.tabAllSearch);
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.itemIcon = par1IconRegister.registerIcon(ModFruits.modid + ":" + (this.getUnlocalizedName().substring(5)));
     }
 }