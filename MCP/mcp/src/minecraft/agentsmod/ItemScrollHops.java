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
 
public class ItemScrollHops extends Item
 {
     public ItemScrollHops(int i)
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
    	 par3EntityPlayer.addChatMessage("\2474Name: \247fHops");
    	 par3EntityPlayer.addChatMessage("\247aHeight: \247f2 Blocks");
    	 par3EntityPlayer.addChatMessage("\247aLight Level: \247fOver 10");
    	 par3EntityPlayer.addChatMessage("\247aStages: \247f6 (Per Block High)");
    	 par3EntityPlayer.addChatMessage("\247aDrops: \247f3-5 Hops");
    	 par3EntityPlayer.addChatMessage("\247aGrows On: \247fTilled Dirt");
    	 par3EntityPlayer.addChatMessage("\247aGrowth Rate: \247fSlow");
    	 par3EntityPlayer.addChatMessage("Can be right-clicked for it's Fruit. Obtained only though cross-breeding.");
    	 par3EntityPlayer.addChatMessage("\247l********************");
    	 }
    	 return par1ItemStack;  
     }
 
 }