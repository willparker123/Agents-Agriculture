package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class ItemFertiliser extends Item
 {
     public ItemFertiliser(int i)
     {
         super(i);
         maxStackSize = 64;
         this.setCreativeTab(ModCreativeTabs.tabPlants);
     }

 	public void onRightClick(EntityPlayer par5EntityPlayer)
 	{
     	par5EntityPlayer.inventory.consumeInventoryItem(ModFruits.fertiliser.itemID);
 	}
     
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFruits.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
     public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
     {
         if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
         {
             return false;
         }
         else
         {
             int var11;
             int var12;
             int var13;
             
            

     var11 = par3World.getBlockId(par4, par5, par6);

     FertiliserEvent event = new FertiliserEvent(par2EntityPlayer, par3World, var11, par4, par5, par6);
     if (MinecraftForge.EVENT_BUS.post(event))
     {
         return false;
     }
     
     if (event.getResult() == Result.ALLOW)
     {
         if (!par3World.isRemote)
         {
        	 --par1ItemStack.stackSize;
         }
         return true;
     }
     
     if (var11 == ModCrops.chicleSapling.blockID)
     {
         if (!par3World.isRemote)
         {
             ((BlockChicleSapling)ModCrops.chicleSapling).growchicleTree(par3World, par4, par5, par6, par3World.rand);
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 == ModCrops.lemonSapling.blockID)
     {
         if (!par3World.isRemote)
         {
             ((BlockLemonSapling)ModCrops.lemonSapling).growLemonTree(par3World, par4, par5, par6, par3World.rand);
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 == ModCrops.orangeSapling.blockID)
     {
         if (!par3World.isRemote)
         {
             ((BlockOrangeSapling)ModCrops.orangeSapling).growOrangeTree(par3World, par4, par5, par6, par3World.rand);
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 == ModCrops.cherrySapling.blockID)
     {
         if (!par3World.isRemote)
         {
             ((BlockCherrySapling)ModCrops.cherrySapling).growcherryTree(par3World, par4, par5, par6, par3World.rand);
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 == ModCrops.oliveSapling.blockID)
     {
         if (!par3World.isRemote)
         {
             ((BlockOliveSapling)ModCrops.oliveSapling).growoliveTree(par3World, par4, par5, par6, par3World.rand);
             --par1ItemStack.stackSize;
         }

         return true;
     } 
     
     if (var11 == ModCrops.appleRedSapling.blockID)
     {
         if (!par3World.isRemote)
         {
             ((BlockAppleRedSapling)ModCrops.appleRedSapling).growappleRedTree(par3World, par4, par5, par6, par3World.rand);
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 == ModCrops.appleGreenSapling.blockID)
     {
         if (!par3World.isRemote)
         {
             ((BlockAppleGreenSapling)ModCrops.appleGreenSapling).growappleGreenTree(par3World, par4, par5, par6, par3World.rand);
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBarley)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropCorn)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropCotton)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropLettuce)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropPepper)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropRice)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropStrawberry)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropTomato)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropWeed)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropOnion)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropOlive)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropLemon)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropOrange)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropCherry)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropRose)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropDandelion)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropLavender)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropParsley)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropTobacco)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }

     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropPeppers)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropWalnut)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }

     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrape)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrape2)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrape3)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrape4)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGarlic)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropChicle)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropWalnutHard)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropWalnutHarder)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropPeanut)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropMint)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropRaspberry)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBRaspberry)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBlueberry)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBlackcurrant)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropWalnutGold)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropWalnutDiamond)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropHops)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrapePurple)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrapePurple2)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrapePurple3)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropGrapePurple4)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }

     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropAppleRed)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropAppleGreen)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }

     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBean)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBean2)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBean3)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropBean4)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropPea)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropPea2)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropPea3)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropPea4)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropOats)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropSoy)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropTea)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     
     if (var11 > 0 && Block.blocksList[var11] instanceof BlockCropCoffee)
     {
         if (!par3World.isRemote)
         {
             --par1ItemStack.stackSize;
         }

         return true;
     }
     /*/if (!par2EntityPlayer.capabilities.isCreativeMode)
     {
         --par1ItemStack.stackSize;
     }
     /*/
 		return false;
     }
 }
 }
 
 