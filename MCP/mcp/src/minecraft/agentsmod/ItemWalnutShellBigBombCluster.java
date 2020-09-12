package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
 
public class ItemWalnutShellBigBombCluster extends Item
 {
     public ItemWalnutShellBigBombCluster(int i)
     {
         super(i);
         maxStackSize = 64;
         this.setCreativeTab(ModCreativeTabs.tabOther);
     }
     
     public void registerIcons(IconRegister par1IconRegister)
     {
         this.itemIcon = par1IconRegister.registerIcon(ModFruits.modid + ":" + (this.getUnlocalizedName().substring(5)));
     }
     
     public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
     {
         if (!par3EntityPlayer.capabilities.isCreativeMode)
         {
             --par1ItemStack.stackSize;
         }

         par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

         if (!par2World.isRemote)
         {
             par2World.spawnEntityInWorld(new EntityWalnutShellBigBomb(par2World, par3EntityPlayer));
             par2World.spawnEntityInWorld(new EntityWalnutShellBigBomb2(par2World, par3EntityPlayer));
             par2World.spawnEntityInWorld(new EntityWalnutShellBigBomb3(par2World, par3EntityPlayer));
         }

         return par1ItemStack;
     }
 
 }