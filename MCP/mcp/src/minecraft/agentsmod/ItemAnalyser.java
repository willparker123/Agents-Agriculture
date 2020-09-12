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

public class ItemAnalyser extends Item
{
	public ItemAnalyser(int i)
	{
		super(i);
		maxStackSize = 1;
		this.setCreativeTab(ModCreativeTabs.tabOther);
		this.setMaxDamage(20);
	}

	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(ModTools.modid + ":" + (this.getUnlocalizedName().substring(5)));
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par2World.playSoundAtEntity(par3EntityPlayer, "random.fizz", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if(par2World.isRemote)
		{
			ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\2472**ANALYSING**");
		}

		
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.barleySeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.barleySeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollBarley, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**BARLEY ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.blackcurrantSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.blackcurrantSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollBlackcurrant, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**BLACKCURRANT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.blueberrySeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.blueberrySeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollBlueberry, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**BLUEBERRY ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.braspberrySeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.braspberrySeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollBRaspberry, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**BLUE RASPBERRY ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.cherrySeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.cherrySeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollCherry, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**CHERRY ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.chicleSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.chicleSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollChicle, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**CHICLE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.cornSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.cornSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollCorn, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**CORN ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.cottonSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.cottonSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollCotton, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**COTTON ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.dandelionSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.dandelionSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollDandelion, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**DANDELION ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.garlic.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.garlic.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollGarlic, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**GARLIC ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.grapeSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.grapeSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollGrape, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**GRAPE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.lavenderSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.lavenderSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollLavender, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**LAVENDER ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.lemonSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.lemonSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollLemon, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**LEMON ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.lettuceSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.lettuceSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollLettuce, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**LETTUCE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.mintSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.mintSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollMint, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**MINT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.oliveSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.oliveSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollOlive, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**OLIVE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.onion.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.onion.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollOnion, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**ONION ANALYSED**");
			}
			
			return par1ItemStack;
		}

		if (par3EntityPlayer.inventory.hasItem(ModFruits.orangeSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.orangeSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollOrange, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**ORANGE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.parsleySeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.parsleySeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollParsley, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**PARSLEY ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.peanut.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.peanut.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollPeanut, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**PEANUT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.pepperSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.pepperSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollPepper, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**PEPPER ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.peppersSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.peppersSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollPeppers, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**BELL PEPPER ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.raspberrySeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.raspberrySeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollRaspberry, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**RASPBERRY ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.riceSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.riceSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollRice, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**RICE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.roseSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.roseSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollRose, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**ROSE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.strawberrySeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.strawberrySeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollStrawberry, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**STRAWBERRY ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.tobaccoSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.tobaccoSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollTobacco, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**TOBACCO ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.tomatoSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.tomatoSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollTomato, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**TOMATO ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.walnut.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.walnut.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollWalnut, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**WALNUT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.walnutHard.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.walnutHard.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollWalnutHard, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**HARDENED WALNUT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.walnutHarder.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.walnutHarder.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollWalnutHarder, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**IRON WALNUT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.walnutGold.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.walnutGold.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollWalnutGold, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**GOLDEN WALNUT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.walnutDiamond.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.walnutDiamond.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollWalnutDiamond, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**DIAMOND WALNUT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.weedSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.weedSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollWeed, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**CANNABIS ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(Item.seeds.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(Item.seeds.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollWheat, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**WHEAT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(Item.carrot.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(Item.carrot.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollCarrot, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**CARROT ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(Item.potato.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(Item.potato.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollPotato, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**POTATO ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(Item.melonSeeds.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(Item.melonSeeds.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollMelon, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**MELON ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(Item.pumpkinSeeds.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(Item.pumpkinSeeds.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollPumpkin, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**PUMPKIN ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.hopSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.hopSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollHops, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**HOPS ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.appleGreenSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.appleGreenSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollApple, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**APPLE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.appleRedSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.appleRedSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollApple, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**APPLE ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.bean.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.bean.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollBean, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**GREEN BEAN ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.pea.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.pea.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollPea, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**PEA ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.oatsSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.oatsSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollOats, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**OATS ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.soy.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.soy.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollSoy, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**SOY BEAN ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.teaSeed.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.teaSeed.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollTea, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**TEA LEAF ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		if (par3EntityPlayer.inventory.hasItem(ModFruits.coffee.itemID))
		{
			par3EntityPlayer.inventory.consumeInventoryItem(ModFruits.coffee.itemID);
			par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModTools.scrollCoffee, 1));
			par1ItemStack.damageItem(1, par3EntityPlayer);
			
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247a**COFFEE BEAN ANALYSED**");
			}
			
			return par1ItemStack;
		}
		
		else
		{
			if(par2World.isRemote)
			{
				ModLoader.getMinecraftInstance().thePlayer.addChatMessage("\247c**NO SEED FOUND**");
			}
		}
		return par1ItemStack;
	}

}