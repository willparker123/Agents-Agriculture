package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class ItemTool2 extends Item
 {
     public ItemTool2(int i)
     {
         super(i);
         maxStackSize = 64;
         this.setCreativeTab(ModCreativeTabs.tabOther);
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.itemIcon = par1IconRegister.registerIcon(ModTools.modid + ":" + (this.getUnlocalizedName().substring(5)));
     }
 
 }