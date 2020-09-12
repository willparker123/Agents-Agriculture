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
 
public class ItemScrollRice extends Item
 {
     public ItemScrollRice(int i)
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
    	 par3EntityPlayer.addChatMessage("\2474Name: \247fRice");
    	 par3EntityPlayer.addChatMessage("\247aHeight: \247f1 Block");
    	 par3EntityPlayer.addChatMessage("\247aLight Level: \247fOver 5");
    	 par3EntityPlayer.addChatMessage("\247aStages: \247f8");
    	 par3EntityPlayer.addChatMessage("\247aDrops: \247f3-5 Rice");
    	 par3EntityPlayer.addChatMessage("\247aGrows On: \247fWet Clay (Not normal Clay)");
    	 par3EntityPlayer.addChatMessage("\247aGrowth Rate: \247fFast");
    	 par3EntityPlayer.addChatMessage("Found in Plains and Hills");
    	 par3EntityPlayer.addChatMessage("\247l********************");
    	 }
    	 return par1ItemStack;  
     }
 
 }