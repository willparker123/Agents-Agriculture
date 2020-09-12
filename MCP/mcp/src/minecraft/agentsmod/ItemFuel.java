package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
 
public class ItemFuel extends Item
 {
     public ItemFuel(int i)
     {
         super(i);
         maxStackSize = 64;
 		this.setCreativeTab(ModCreativeTabs.tabFuels);
              }
     
     @Override
     @SideOnly(Side.CLIENT)
     public boolean hasEffect(ItemStack par1ItemStack)
     {
         return false;
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.itemIcon = par1IconRegister.registerIcon(ModFuels.modid + ":" + (this.getUnlocalizedName().substring(5)));
     }
  }