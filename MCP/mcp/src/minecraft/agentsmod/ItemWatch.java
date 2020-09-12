package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
 
public class ItemWatch extends Item
 {
     public ItemWatch(int i)
     {
         super(i);
         maxStackSize = 1;
         this.setCreativeTab(ModCreativeTabs.tabOther);
         this.setMaxDamage(80);
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.itemIcon = par1IconRegister.registerIcon(ModTools.modid + ":" + (this.getUnlocalizedName().substring(5)));
     }
     
 	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
	 {
 		par1ItemStack.damageItem(16, par3EntityLiving);
 	    par2EntityLiving.addPotionEffect(new PotionEffect(Potion.confusion.id, 60, 6));
 	    return true;
	 }
    @SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}
 
 }