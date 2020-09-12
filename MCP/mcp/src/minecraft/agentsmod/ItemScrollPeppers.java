package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
 
public class ItemScrollPeppers extends Item
 {
     public ItemScrollPeppers(int i)
     {
         super(i);
         maxStackSize = 64;
         this.setCreativeTab(ModCreativeTabs.tabOther);  
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.itemIcon = par1IconRegister.registerIcon(ModTools.modid + ":" + (this.getUnlocalizedName().substring(5)));
     }
     
     public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
     {
    	 if(par2World.isRemote)
    	 {
        	 par3EntityPlayer.addChatMessage("\247l********************");
    	 par3EntityPlayer.addChatMessage("\2474Name: \247fBell Peppers");
    	 par3EntityPlayer.addChatMessage("\247aHeight: \247f1 Block");
    	 par3EntityPlayer.addChatMessage("\247aLight Level: \247fOver 13");
    	 par3EntityPlayer.addChatMessage("\247aStages: \247f8 to Green, 11 to Yellow, 14 to Red");
    	 par3EntityPlayer.addChatMessage("\247aDrops: \247f2-4 Bell Peppers");
    	 par3EntityPlayer.addChatMessage("\247aGrows On: \247fTilled Dirt");
    	 par3EntityPlayer.addChatMessage("\247aGrowth Rate: \247fFairly Quick");
    	 par3EntityPlayer.addChatMessage("Can be right-clicked for it's Fruit. Found in Jungles, Swamps and Forests. If you leave it to grow, it will grow to Green Peppers, then Yellow, then Red.");
    	 par3EntityPlayer.addChatMessage("\247l********************");
    	 }
    	 return par1ItemStack;  
     }
 
 }