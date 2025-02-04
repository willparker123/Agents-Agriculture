
package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ModBlocks", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModBlocks {
	
	
	public static final String modid = "ModBlocks";
	
	public static Block hay;
	public static Block salt;
	public static Block blockSalt;
	public static Block blockPepper;
	public static Block blockSugar;
	public static Block blockReed;
	public static Block blockBacon;
	public static Block blockChocolate;
	
	public static Block cheesemold;
	public static Block cheesemoldSet;
	public static Block cheesemoldFilled;
	public static Block blockcheesewheel;
	public static Block jellyblock;
	public static Block jellyblockApple;
	public static Block jellyblockStrawberry;
	public static Block jellyblockLemon;
	public static Block jellyblockGrape;
	public static Block jellyblockCherry;
	public static Block jellyblockOrange;
	public static Block jellyblockBlackcurrant;
	public static Block jellyblockRaspberry;
	public static Block jellyblockBRaspberry;
	
	public static Block fermenter;
	public static Block fermenterWater;
	public static Block fermenterBarley;
	public static Block fermenterBarleyDone;
	public static Block fermenterSpiderEye;
	public static Block fermenterSpiderEyeDone;
	public static Block pickler;
	public static Block picklerVinegar;
	public static Block picklerOnion;
	public static Block picklerOnionDone;
	public static Block picklerEgg;
	public static Block picklerEggDone;
	public static Block brewer;
	public static Block brewerWater;
	public static Block brewerBeer;
	public static Block brewerBeerDone;
	public static Block brewerBeerStrongDone;
	public static Block brewerAle;
	public static Block brewerAleDone;
	public static Block brewerAleStrongDone;
	public static Block brewerCider;
	public static Block brewerCiderDone;
	public static Block brewerCiderStrongDone;
	public static Block brewerEggNog;
	public static Block brewerEggNogDone;
	public static Block brewerTea;
	public static Block brewerTeaDone;
	public static Block brewerTeaStrongDone;
	public static Block brewerTeaExtraStrongDone;
	
	public static Block brewerWine;
	public static Block brewerWineDone;
	public static Block brewerWineStrongDone;
	public static Block brewerWineWhite;
	public static Block brewerWineWhiteDone;
	public static Block brewerWineWhiteStrongDone;
	public static Block brewerWineRed;
	public static Block brewerWineRedDone;
	public static Block brewerWineRedStrongDone;
	
	public static Block brewerVodka;
	public static Block brewerVodkaDone;
	
	public static Block rack;
	public static Block rackb;
	public static Block rackWeed;
	public static Block rackWeedb;
	public static Block rackWeedDry;
	public static Block rackWeedDryb;
	public static Block rackTobacco;
	public static Block rackTobaccob;
	public static Block rackTobaccoDry;
	public static Block rackTobaccoDryb;
	public static Block rackPigskin;
	public static Block rackPigskinb;
	public static Block rackLeather;
	public static Block rackLeatherb;
	public static Block rackTea;
	public static Block rackTeab;
	public static Block rackTeaDry;
	public static Block rackTeaDryb;
	
	public static Block gumball;
	public static Block gumballb;
	public static Block gumballc;
	public static Block gumballd;
	public static Block gumballe;
	public static Block gumballf;
	public static Block gumballg;
	public static Block gumballh;
	
	public static Block planks;
	
	public static Block vinerack;
	public static Block vinerackb;
	public static Block vinerackc;
	public static Block vinerackd;
	
	public static Block cigarbox;
	public static Block cigarboxb;
	public static Block cigarboxc;
	public static Block cigarboxd;
	public static Block cigarboxe;
	
	public static Block cigarbox2;
	public static Block cigarbox2b;
	public static Block cigarbox2c;
	public static Block cigarbox2d;
	public static Block cigarbox2e;
	
	public static Block cigarbox3;
	public static Block cigarbox3b;
	public static Block cigarbox3c;
	public static Block cigarbox3d;
	public static Block cigarbox3e;
	
	public static Block cigarbox4;
	public static Block cigarbox4b;
	public static Block cigarbox4c;
	public static Block cigarbox4d;
	public static Block cigarbox4e;
	
	
        // The instance of your mod that Forge uses.
@Instance("ModBlocks")
public static ModBlocks instance;
// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
public static CommonProxy proxy;

@PreInit
public void preInit(FMLPreInitializationEvent event)
{


}

@Init
public void load (FMLInitializationEvent event) {
	
	//hay
	hay = new BlockHay(ModConfig.hayID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.7F).setResistance(0.5F).setUnlocalizedName("hay");
	GameRegistry.registerBlock(hay);
	LanguageRegistry.addName(hay, "Straw Bale");
	
	//salt
	salt = new BlockSalt(ModConfig.saltBlockID, Material.sand).setStepSound(Block.soundSandFootstep).setHardness(0.5F).setResistance(0.8F).setUnlocalizedName("salt");
	GameRegistry.registerBlock(salt);
	LanguageRegistry.addName(salt, "Salty Sand");
	
	
	
	//blockSalt
	blockSalt = new BlockBlockSalt(ModConfig.blockSaltID, Material.sand).setStepSound(Block.soundSandFootstep).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("blockSalt");
		GameRegistry.registerBlock(blockSalt);
		LanguageRegistry.addName(blockSalt, "Salt Block");
		
			//blockPepper
			blockPepper = new BlockBlockPepper(ModConfig.blockPepperID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("blockPepper");
				GameRegistry.registerBlock(blockPepper);
				LanguageRegistry.addName(blockPepper, "Pepper Block");
				
				//blockSugar
				blockSugar = new BlockBlockSugar(ModConfig.blockSugarID, Material.cactus).setStepSound(Block.soundSnowFootstep).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("blockSugar");
					GameRegistry.registerBlock(blockSugar);
					LanguageRegistry.addName(blockSugar, "Sugar Block");
					
				//blockReed
				blockReed = new BlockBlockReed(ModConfig.blockReedID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("blockReed");
					GameRegistry.registerBlock(blockReed);
					LanguageRegistry.addName(blockReed, "Sugar Cane Block");
					
					//blockBacon
					blockBacon = new BlockBlockBacon(ModConfig.blockBaconID, Material.pumpkin).setStepSound(Block.soundClothFootstep).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("blockBacon");
						GameRegistry.registerBlock(blockBacon);
						LanguageRegistry.addName(blockBacon, "Bacon Block");
						
						//blockChocolate
						blockChocolate = new BlockBlockChocolate(ModConfig.blockChocolateID, Material.cactus).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(4.0F).setUnlocalizedName("blockChocolate");
							GameRegistry.registerBlock(blockChocolate);
							LanguageRegistry.addName(blockChocolate, "Chocolate Block");

	//Cheese Mold
	cheesemold = new BlockCheeseMold(ModConfig.cheesemoldBlockID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(2.8F).setUnlocalizedName("cheesemold");
	GameRegistry.registerBlock(cheesemold);
	LanguageRegistry.addName(cheesemold, "Cheese Mould");
	
	//Cheese Mold Filled
	cheesemoldFilled = new BlockCheeseMoldFilled(ModConfig.cheesemoldBlockFilledID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(2.8F).setUnlocalizedName("cheesemoldFilled");
	GameRegistry.registerBlock(cheesemoldFilled);
	LanguageRegistry.addName(cheesemoldFilled, "Cheese Mould (Filled)");
	
	//Cheese Mold Set
	cheesemoldSet = new BlockCheeseMoldSet(ModConfig.cheesemoldBlockSetID, Material.cloth).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(2.8F).setUnlocalizedName("cheesemoldSet");
	GameRegistry.registerBlock(cheesemoldSet);
	LanguageRegistry.addName(cheesemoldSet, "Cheese Mould (Set)");
	
	//Cheese
	blockcheesewheel = new BlockCheeseWheel(ModConfig.cheesewheelBlockID, Material.cloth).setStepSound(Block.soundClothFootstep).setHardness(0.5F).setResistance(1.0F).setUnlocalizedName("blockcheesewheel");
	GameRegistry.registerBlock(blockcheesewheel);
	LanguageRegistry.addName(blockcheesewheel, "Cheese Wheel");
	
	//pickler
		pickler = new BlockPickler(ModConfig.picklerID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("pickler");
		GameRegistry.registerBlock(pickler);
		LanguageRegistry.addName(pickler, "Pickling Barrel");
		//pickler - Vinegar
		picklerVinegar = new BlockPicklerVinegar(ModConfig.picklerVinegarID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.8F).setResistance(4.0F).setUnlocalizedName("picklerVinegar");
		GameRegistry.registerBlock(picklerVinegar);
		LanguageRegistry.addName(picklerVinegar, "Pickling Barrel");
		//pickler - Onion
		picklerOnion = new BlockPicklerOnion(ModConfig.picklerOnionID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("picklerOnion");
		GameRegistry.registerBlock(picklerOnion);
		LanguageRegistry.addName(picklerOnion, "Pickling Barrel");
		//pickler - Onion Done
		picklerOnionDone = new BlockPicklerOnionDone(ModConfig.picklerOnionDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("picklerOnionDone");
		GameRegistry.registerBlock(picklerOnionDone);
		LanguageRegistry.addName(picklerOnionDone, "Pickling Barrel");
		//pickler - Egg
				picklerEgg = new BlockPicklerEgg(ModConfig.picklerEggID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("picklerEgg");
				GameRegistry.registerBlock(picklerEgg);
				LanguageRegistry.addName(picklerEgg, "Pickling Barrel");
				//pickler - Egg Done
				picklerEggDone = new BlockPicklerEggDone(ModConfig.picklerEggDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("picklerEggDone");
				GameRegistry.registerBlock(picklerEggDone);
				LanguageRegistry.addName(picklerEggDone, "Pickling Barrel");
				//Fermenter
	fermenter = new BlockFermenter(ModConfig.fermenterID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("fermenter");
	GameRegistry.registerBlock(fermenter);
	LanguageRegistry.addName(fermenter, "Fermenting Barrel");
	//Fermenter - Water
	fermenterWater = new BlockFermenterWater(ModConfig.fermenterWaterID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.8F).setResistance(4.0F).setUnlocalizedName("fermenterWater");
	GameRegistry.registerBlock(fermenterWater);
	LanguageRegistry.addName(fermenterWater, "Fermenting Barrel");
	//Fermenter - Barley
	fermenterBarley = new BlockFermenterBarley(ModConfig.fermenterBarleyID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("fermenterBarley");
	GameRegistry.registerBlock(fermenterBarley);
	LanguageRegistry.addName(fermenterBarley, "Fermenting Barrel");
	//Fermenter - Barley Done
	fermenterBarleyDone = new BlockFermenterBarleyDone(ModConfig.fermenterBarleyDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("fermenterBarleyDone");
	GameRegistry.registerBlock(fermenterBarleyDone);
	LanguageRegistry.addName(fermenterBarleyDone, "Fermenting Barrel");
	//Fermenter - SpiderEye
	fermenterSpiderEye = new BlockFermenterSpiderEye(ModConfig.fermenterSpiderEyeID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("fermenterSpiderEye");
	GameRegistry.registerBlock(fermenterSpiderEye);
	LanguageRegistry.addName(fermenterSpiderEye, "Fermenting Barrel");
	//Fermenter - SpiderEye Done
	fermenterSpiderEyeDone = new BlockFermenterSpiderEyeDone(ModConfig.fermenterSpiderEyeDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(3.0F).setUnlocalizedName("fermenterSpiderEyeDone");
	GameRegistry.registerBlock(fermenterSpiderEyeDone);
	LanguageRegistry.addName(fermenterSpiderEyeDone, "Fermenting Barrel");
	
	//Brewing 
	brewer = new BlockBrewer(ModConfig.brewerID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setUnlocalizedName("brewer");
	GameRegistry.registerBlock(brewer);
	LanguageRegistry.addName(brewer, "Brewing Barrel");
	//Brewing 
	brewerWater = new BlockBrewerWater(ModConfig.brewerWaterID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWater");
	GameRegistry.registerBlock(brewerWater);
	LanguageRegistry.addName(brewerWater, "Brewing Barrel");
	//Brewing 
	brewerBeer = new BlockBrewerBeer(ModConfig.brewerBeerID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerBeer");
	GameRegistry.registerBlock(brewerBeer);
	LanguageRegistry.addName(brewerBeer, "Brewing Barrel");
	//Brewing 
	brewerBeerDone = new BlockBrewerBeerDone(ModConfig.brewerBeerDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerBeerDone");
	GameRegistry.registerBlock(brewerBeerDone);
	LanguageRegistry.addName(brewerBeerDone, "Brewing Barrel");
	//Brewing 
	brewerAle = new BlockBrewerAle(ModConfig.brewerAleID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerAle");
	GameRegistry.registerBlock(brewerAle);
	LanguageRegistry.addName(brewerAle, "Brewing Barrel");
	//Brewing 
	brewerAleDone = new BlockBrewerAleDone(ModConfig.brewerAleDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerAleDone");
	GameRegistry.registerBlock(brewerAleDone);
	LanguageRegistry.addName(brewerAleDone, "Brewing Barrel");
	//Brewing 
	brewerCider = new BlockBrewerCider(ModConfig.brewerCiderID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerCider");
	GameRegistry.registerBlock(brewerCider);
	LanguageRegistry.addName(brewerCider, "Brewing Barrel");
	//Brewing 
	brewerCiderDone = new BlockBrewerCiderDone(ModConfig.brewerCiderDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerCiderDone");
	GameRegistry.registerBlock(brewerCiderDone);
	LanguageRegistry.addName(brewerCiderDone, "Brewing Barrel");
	//Brewing 
	brewerBeerStrongDone = new BlockBrewerBeerStrongDone(ModConfig.brewerBeerStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerBeerStrongDone");
	GameRegistry.registerBlock(brewerBeerStrongDone);
	LanguageRegistry.addName(brewerBeerStrongDone, "Brewing Barrel");
	//Brewing 
	brewerAleStrongDone = new BlockBrewerAleStrongDone(ModConfig.brewerAleStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerAleStrongDone");
	GameRegistry.registerBlock(brewerAleStrongDone);
	LanguageRegistry.addName(brewerAleStrongDone, "Brewing Barrel");
	//Brewing 
	brewerCiderStrongDone = new BlockBrewerCiderStrongDone(ModConfig.brewerCiderStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerCiderStrongDone");
	GameRegistry.registerBlock(brewerCiderStrongDone);
	LanguageRegistry.addName(brewerCiderStrongDone, "Brewing Barrel");
	//Brewing 
	brewerEggNog = new BlockBrewerEggNog(ModConfig.brewerEggNogID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerEggNog");
	GameRegistry.registerBlock(brewerEggNog);
	LanguageRegistry.addName(brewerEggNog, "Brewing Barrel");
	//Brewing 
	brewerEggNogDone = new BlockBrewerEggNogDone(ModConfig.brewerEggNogDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerEggNogDone");
	GameRegistry.registerBlock(brewerEggNogDone);
	LanguageRegistry.addName(brewerEggNogDone, "Brewing Barrel");
	//Brewing 
		brewerTea = new BlockBrewerTea(ModConfig.brewerTeaID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerTea");
		GameRegistry.registerBlock(brewerTea);
		LanguageRegistry.addName(brewerTea, "Brewing Barrel");
		//Brewing 
		brewerTeaDone = new BlockBrewerTeaDone(ModConfig.brewerTeaDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerTeaDone");
		GameRegistry.registerBlock(brewerTeaDone);
		LanguageRegistry.addName(brewerTeaDone, "Brewing Barrel");
		//Brewing 
				brewerTeaStrongDone = new BlockBrewerTeaStrongDone(ModConfig.brewerTeaStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerTeaStrongDone");
				GameRegistry.registerBlock(brewerTeaStrongDone);
				LanguageRegistry.addName(brewerTeaStrongDone, "Brewing Barrel");
				//Brewing 
				brewerTeaExtraStrongDone = new BlockBrewerTeaExtraStrongDone(ModConfig.brewerTeaExtraStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerTeaExtraStrongDone");
				GameRegistry.registerBlock(brewerTeaExtraStrongDone);
				LanguageRegistry.addName(brewerTeaExtraStrongDone, "Brewing Barrel");
				
	
	
	//Brewing 
	brewerWine = new BlockBrewerWine(ModConfig.brewerWineID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWine");
	GameRegistry.registerBlock(brewerWine);
	LanguageRegistry.addName(brewerWine, "Brewing Barrel");
	//Brewing 
	brewerWineDone = new BlockBrewerWineDone(ModConfig.brewerWineDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineDone");
	GameRegistry.registerBlock(brewerWineDone);
	LanguageRegistry.addName(brewerWineDone, "Brewing Barrel");
	//Brewing 
	brewerWineStrongDone = new BlockBrewerWineStrongDone(ModConfig.brewerWineStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineStrongDone");
	GameRegistry.registerBlock(brewerWineStrongDone);
	LanguageRegistry.addName(brewerWineStrongDone, "Brewing Barrel");
	//Brewing 
	brewerWineWhite = new BlockBrewerWineWhite(ModConfig.brewerWineWhiteID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineWhite");
	GameRegistry.registerBlock(brewerWineWhite);
	LanguageRegistry.addName(brewerWineWhite, "Brewing Barrel");
	//Brewing 
	brewerWineWhiteDone = new BlockBrewerWineWhiteDone(ModConfig.brewerWineWhiteDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineWhiteDone");
	GameRegistry.registerBlock(brewerWineWhiteDone);
	LanguageRegistry.addName(brewerWineWhiteDone, "Brewing Barrel");
	//Brewing 
	brewerWineWhiteStrongDone = new BlockBrewerWineWhiteStrongDone(ModConfig.brewerWineWhiteStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineWhiteStrongDone");
	GameRegistry.registerBlock(brewerWineWhiteStrongDone);
	LanguageRegistry.addName(brewerWineWhiteStrongDone, "Brewing Barrel");
	//Brewing 
	brewerWineRed = new BlockBrewerWineRed(ModConfig.brewerWineRedID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineRed");
	GameRegistry.registerBlock(brewerWineRed);
	LanguageRegistry.addName(brewerWineRed, "Brewing Barrel");
	//Brewing 
	brewerWineRedDone = new BlockBrewerWineRedDone(ModConfig.brewerWineRedDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineRedDone");
	GameRegistry.registerBlock(brewerWineRedDone);
	LanguageRegistry.addName(brewerWineRedDone, "Brewing Barrel");
	//Brewing 
	brewerWineRedStrongDone = new BlockBrewerWineRedStrongDone(ModConfig.brewerWineRedStrongDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerWineRedStrongDone");
	GameRegistry.registerBlock(brewerWineRedStrongDone);
	LanguageRegistry.addName(brewerWineRedStrongDone, "Brewing Barrel");
	
	
	
	//Brewing 
	brewerVodka = new BlockBrewerVodka(ModConfig.brewerVodkaID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerVodka");
	GameRegistry.registerBlock(brewerVodka);
	LanguageRegistry.addName(brewerVodka, "Brewing Barrel");
	//Brewing 
	brewerVodkaDone = new BlockBrewerVodkaDone(ModConfig.brewerVodkaDoneID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.2F).setResistance(6.0F).setUnlocalizedName("brewerVodkaDone");
	GameRegistry.registerBlock(brewerVodkaDone);
	LanguageRegistry.addName(brewerVodkaDone, "Brewing Barrel");
	
	
	
	//Drying rack
	rack = new BlockDryingRack(ModConfig.rackID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rack");
	GameRegistry.registerBlock(rack);
    LanguageRegistry.addName(rack, "Drying Rack");
    
	rackb = new BlockDryingRack2(ModConfig.rackbID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackb");
	GameRegistry.registerBlock(rackb);
    LanguageRegistry.addName(rackb, "Drying Rack");
    
    rackPigskin = new BlockDryingRackPigskin(ModConfig.rackPigskinID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackPigskin");
	GameRegistry.registerBlock(rackPigskin);
    LanguageRegistry.addName(rackPigskin, "Drying Rack");
    
    rackPigskinb = new BlockDryingRackPigskin2(ModConfig.rackPigskinbID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackPigskinb");
	GameRegistry.registerBlock(rackPigskinb);
    LanguageRegistry.addName(rackPigskinb, "Drying Rack");
    
    rackLeather = new BlockDryingRackLeather(ModConfig.rackLeatherID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackLeather");
	GameRegistry.registerBlock(rackLeather);
    LanguageRegistry.addName(rackLeather, "Drying Rack");
    
    rackLeatherb = new BlockDryingRackLeather2(ModConfig.rackLeatherbID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackLeatherb");
	GameRegistry.registerBlock(rackLeatherb);
    LanguageRegistry.addName(rackLeatherb, "Drying Rack");
    
    rackWeed = new BlockDryingRackWeed(ModConfig.rackWeedID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackWeed");
	GameRegistry.registerBlock(rackWeed);
    LanguageRegistry.addName(rackWeed, "Drying Rack");
    
    rackWeedb = new BlockDryingRackWeed2(ModConfig.rackWeedbID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackWeedb");
	GameRegistry.registerBlock(rackWeedb);
    LanguageRegistry.addName(rackWeedb, "Drying Rack");
    
    rackWeedDry = new BlockDryingRackWeedDry(ModConfig.rackWeedDryID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackWeedDry");
	GameRegistry.registerBlock(rackWeedDry);
    LanguageRegistry.addName(rackWeedDry, "Drying Rack");
    
    rackWeedDryb = new BlockDryingRackWeedDry2(ModConfig.rackWeedDrybID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackWeedDryb");
	GameRegistry.registerBlock(rackWeedDryb);
    LanguageRegistry.addName(rackWeedDryb, "Drying Rack");
    
    rackTobacco = new BlockDryingRackTobacco(ModConfig.rackTobaccoID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTobacco");
	GameRegistry.registerBlock(rackTobacco);
    LanguageRegistry.addName(rackTobacco, "Drying Rack");
    
    rackTobaccob = new BlockDryingRackTobacco2(ModConfig.rackTobaccobID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTobaccob");
	GameRegistry.registerBlock(rackTobaccob);
    LanguageRegistry.addName(rackTobaccob, "Drying Rack");
    
    rackTobaccoDry = new BlockDryingRackTobaccoDry(ModConfig.rackTobaccoDryID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTobaccoDry");
	GameRegistry.registerBlock(rackTobaccoDry);
    LanguageRegistry.addName(rackTobaccoDry, "Drying Rack");
    
    rackTobaccoDryb = new BlockDryingRackTobaccoDry2(ModConfig.rackTobaccoDrybID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTobaccoDryb");
	GameRegistry.registerBlock(rackTobaccoDryb);
    LanguageRegistry.addName(rackTobaccoDryb, "Drying Rack");

    rackTea = new BlockDryingRackTea(ModConfig.rackTeaID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTea");
	GameRegistry.registerBlock(rackTea);
    LanguageRegistry.addName(rackTea, "Drying Rack");
    
    rackTeab = new BlockDryingRackTea2(ModConfig.rackTeabID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTeab");
	GameRegistry.registerBlock(rackTeab);
    LanguageRegistry.addName(rackTeab, "Drying Rack");
    
    rackTeaDry = new BlockDryingRackTeaDry(ModConfig.rackTeaDryID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTeaDry");
	GameRegistry.registerBlock(rackTeaDry);
    LanguageRegistry.addName(rackTeaDry, "Drying Rack");
    
    rackTeaDryb = new BlockDryingRackTeaDry2(ModConfig.rackTeaDrybID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(3.0F).setUnlocalizedName("rackTeaDryb");
	GameRegistry.registerBlock(rackTeaDryb);
    LanguageRegistry.addName(rackTeaDryb, "Drying Rack");
    
    
    
    
  //Planks
	planks = new BlockPlanks(ModConfig.planksID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("planks");
	GameRegistry.registerBlock(planks, ItemBlockPlanks.class);
	LanguageRegistry.addName(new ItemStack(ModBlocks.planks,1,0), "Chicle Wood Planks");
	LanguageRegistry.addName(new ItemStack(ModBlocks.planks,1,1), "Cherry Wood Planks");
	LanguageRegistry.addName(new ItemStack(ModBlocks.planks,1,2), "Orange Wood Planks");
	LanguageRegistry.addName(new ItemStack(ModBlocks.planks,1,3), "Lemon Wood Planks");
	LanguageRegistry.addName(new ItemStack(ModBlocks.planks,1,4), "Olive Wood Planks");
	
		
		//vine rack
		vinerack = new BlockLattice(ModConfig.vinerackID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(2.5F).setUnlocalizedName("vinerack");
		GameRegistry.registerBlock(vinerack);
		LanguageRegistry.addName(vinerack, "Wooden Lattice");
		
		vinerackb = new BlockLattice2(ModConfig.vinerackbID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(2.5F).setUnlocalizedName("vinerackb");
		GameRegistry.registerBlock(vinerackb);
		LanguageRegistry.addName(vinerackb, "Wooden Lattice");
		
		vinerackc = new BlockLattice3(ModConfig.vinerackcID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(2.5F).setUnlocalizedName("vinerackc");
		GameRegistry.registerBlock(vinerackc);
		LanguageRegistry.addName(vinerackc, "Wooden Lattice");
		
		vinerackd = new BlockLattice4(ModConfig.vinerackdID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(1.6F).setResistance(2.5F).setUnlocalizedName("vinerackd");
		GameRegistry.registerBlock(vinerackd);
		LanguageRegistry.addName(vinerackd, "Wooden Lattice");
	
		
		
	  //jelly
		jellyblock = new BlockJelly(ModConfig.jellyblockID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblock");
		GameRegistry.registerBlock(jellyblock);
		LanguageRegistry.addName(jellyblock, "Jelly Block");
		//jelly
		jellyblockApple = new BlockJelly(ModConfig.jellyblockAppleID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockApple");
		GameRegistry.registerBlock(jellyblockApple);
		LanguageRegistry.addName(jellyblockApple, "Jelly Block");
		//jelly
		jellyblockStrawberry = new BlockJelly(ModConfig.jellyblockStrawberryID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockStrawberry");
		GameRegistry.registerBlock(jellyblockStrawberry);
		LanguageRegistry.addName(jellyblockStrawberry, "Jelly Block");
		//jelly
		jellyblockLemon = new BlockJelly(ModConfig.jellyblockLemonID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockLemon");
		GameRegistry.registerBlock(jellyblockLemon);
		LanguageRegistry.addName(jellyblockLemon, "Jelly Block");
		//jelly
		jellyblockGrape = new BlockJelly(ModConfig.jellyblockGrapeID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockGrape");
		GameRegistry.registerBlock(jellyblockGrape);
		LanguageRegistry.addName(jellyblockGrape, "Jelly Block");
		//jelly
		jellyblockCherry = new BlockJelly(ModConfig.jellyblockCherryID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockCherry");
		GameRegistry.registerBlock(jellyblockCherry);
		LanguageRegistry.addName(jellyblockCherry, "Jelly Block");
		//jelly
		jellyblockOrange = new BlockJelly(ModConfig.jellyblockOrangeID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockOrange");
		GameRegistry.registerBlock(jellyblockOrange);
		LanguageRegistry.addName(jellyblockOrange, "Jelly Block");
		//jelly
		jellyblockBlackcurrant = new BlockJelly(ModConfig.jellyblockBlackcurrantID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockBlackcurrant");
		GameRegistry.registerBlock(jellyblockBlackcurrant);
		LanguageRegistry.addName(jellyblockBlackcurrant, "Jelly Block");
		//jelly
		jellyblockRaspberry = new BlockJelly(ModConfig.jellyblockRaspberryID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockRaspberry");
		GameRegistry.registerBlock(jellyblockRaspberry);
		LanguageRegistry.addName(jellyblockRaspberry, "Jelly Block");
		//jelly
		jellyblockBRaspberry = new BlockJelly(ModConfig.jellyblockBRaspberryID, Material.cloth).setStepSound(Block.soundSnowFootstep).setHardness(0.8F).setResistance(4.0F).setUnlocalizedName("jellyblockBRaspberry");
		GameRegistry.registerBlock(jellyblockBRaspberry);
		LanguageRegistry.addName(jellyblockBRaspberry, "Jelly Block");
		
	
        GameRegistry.registerTileEntity(TileEntityGumball.class, "tileEntityGumball");
        GameRegistry.registerTileEntity(TileEntityGumball2.class, "tileEntityGumball2");
        GameRegistry.registerTileEntity(TileEntityGumball3.class, "tileEntityGumball3");
        GameRegistry.registerTileEntity(TileEntityGumball4.class, "tileEntityGumball4");
        GameRegistry.registerTileEntity(TileEntityGumball5.class, "tileEntityGumball5");
        GameRegistry.registerTileEntity(TileEntityGumball6.class, "tileEntityGumball6");
        GameRegistry.registerTileEntity(TileEntityGumball7.class, "tileEntityGumball7");
        GameRegistry.registerTileEntity(TileEntityGumball8.class, "tileEntityGumball8");
		//gumball
		gumball = new BlockGumball(ModConfig.gumballID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(6.0F).setUnlocalizedName("gumball");
		GameRegistry.registerBlock(gumball);
		LanguageRegistry.addName(gumball, "Gumball Machine");
		gumballb = new BlockGumball2(ModConfig.gumballbID, Material.rock).setLightValue(0.6F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("gumballb");
		GameRegistry.registerBlock(gumballb);
		LanguageRegistry.addName(gumballb, "Gumball Machine");
		gumballc = new BlockGumball3(ModConfig.gumballcID, Material.rock).setLightValue(0.6F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("gumballc");
		GameRegistry.registerBlock(gumballc);
		LanguageRegistry.addName(gumballc, "Gumball Machine");
		gumballd = new BlockGumball4(ModConfig.gumballdID, Material.rock).setLightValue(0.6F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("gumballd");
		GameRegistry.registerBlock(gumballd);
		LanguageRegistry.addName(gumballd, "Gumball Machine");
		gumballe = new BlockGumball5(ModConfig.gumballeID, Material.rock).setLightValue(0.6F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("gumballe");
		GameRegistry.registerBlock(gumballe);
		LanguageRegistry.addName(gumballe, "Gumball Machine");
		gumballf = new BlockGumball6(ModConfig.gumballfID, Material.rock).setLightValue(0.6F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("gumballf");
		GameRegistry.registerBlock(gumballf);
		LanguageRegistry.addName(gumballf, "Gumball Machine");
		gumballg = new BlockGumball7(ModConfig.gumballgID, Material.rock).setLightValue(0.6F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("gumballg");
		GameRegistry.registerBlock(gumballg);
		LanguageRegistry.addName(gumballg, "Gumball Machine");
		gumballh = new BlockGumball8(ModConfig.gumballhID, Material.rock).setLightValue(0.6F).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(10.0F).setUnlocalizedName("gumballh");
		GameRegistry.registerBlock(gumballh);
		LanguageRegistry.addName(gumballh, "Gumball Machine (Filled)");
		
		
		
		//cigarbox
		cigarbox = new BlockCigarbox(ModConfig.cigarboxID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox");
		GameRegistry.registerBlock(cigarbox);
		LanguageRegistry.addName(cigarbox, "Cigar Box");
		cigarboxb = new BlockCigarbox2(ModConfig.cigarboxbID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarboxb");
		GameRegistry.registerBlock(cigarboxb);
		LanguageRegistry.addName(cigarboxb, "Cigar Box (1 Cigar)");
		cigarboxc = new BlockCigarbox3(ModConfig.cigarboxcID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarboxc");
		GameRegistry.registerBlock(cigarboxc);
		LanguageRegistry.addName(cigarboxc, "Cigar Box (2 Cigars)");
		cigarboxd = new BlockCigarbox4(ModConfig.cigarboxdID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarboxd");
		GameRegistry.registerBlock(cigarboxd);
		LanguageRegistry.addName(cigarboxd, "Cigar Box (3 Cigars)");
		cigarboxe = new BlockCigarbox5(ModConfig.cigarboxeID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarboxe");
		GameRegistry.registerBlock(cigarboxe);
		LanguageRegistry.addName(cigarboxe, "Cigar Box (4 Cigars)");
		
		//cigarbox2
		cigarbox2 = new BlockCigarboxB(ModConfig.cigarbox2ID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox2");
		GameRegistry.registerBlock(cigarbox2);
		LanguageRegistry.addName(cigarbox2, "Cigar Box");
		cigarbox2b = new BlockCigarboxB2(ModConfig.cigarbox2bID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox2b");
		GameRegistry.registerBlock(cigarbox2b);
		LanguageRegistry.addName(cigarbox2b, "Cigar Box (1 Cigar)");
		cigarbox2c = new BlockCigarboxB3(ModConfig.cigarbox2cID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox2c");
		GameRegistry.registerBlock(cigarbox2c);
		LanguageRegistry.addName(cigarbox2c, "Cigar Box (2 Cigars)");
		cigarbox2d = new BlockCigarboxB4(ModConfig.cigarbox2dID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox2d");
		GameRegistry.registerBlock(cigarbox2d);
		LanguageRegistry.addName(cigarbox2d, "Cigar Box (3 Cigars)");
		cigarbox2e = new BlockCigarboxB5(ModConfig.cigarbox2eID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox2e");
		GameRegistry.registerBlock(cigarbox2e);
		LanguageRegistry.addName(cigarbox2e, "Cigar Box (4 Cigars)");
		
		//cigarbox3
		cigarbox3 = new BlockCigarboxC(ModConfig.cigarbox3ID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox3");
		GameRegistry.registerBlock(cigarbox3);
		LanguageRegistry.addName(cigarbox3, "Cigar Box");
		cigarbox3b = new BlockCigarboxC2(ModConfig.cigarbox3bID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox3b");
		GameRegistry.registerBlock(cigarbox3b);
		LanguageRegistry.addName(cigarbox3b, "Cigar Box (1 Cigar)");
		cigarbox3c = new BlockCigarboxC3(ModConfig.cigarbox3cID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox3c");
		GameRegistry.registerBlock(cigarbox3c);
		LanguageRegistry.addName(cigarbox3c, "Cigar Box (2 Cigars)");
		cigarbox3d = new BlockCigarboxC4(ModConfig.cigarbox3dID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox3d");
		GameRegistry.registerBlock(cigarbox3d);
		LanguageRegistry.addName(cigarbox3d, "Cigar Box (3 Cigars)");
		cigarbox3e = new BlockCigarboxC5(ModConfig.cigarbox3eID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox3e");
		GameRegistry.registerBlock(cigarbox3e);
		LanguageRegistry.addName(cigarbox3e, "Cigar Box (4 Cigars)");
		
		//cigarbox4
		cigarbox4 = new BlockCigarboxD(ModConfig.cigarbox4ID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox4");
		GameRegistry.registerBlock(cigarbox4);
		LanguageRegistry.addName(cigarbox4, "Cigar Box");
		cigarbox4b = new BlockCigarboxD2(ModConfig.cigarbox4bID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox4b");
		GameRegistry.registerBlock(cigarbox4b);
		LanguageRegistry.addName(cigarbox4b, "Cigar Box (1 Cigar)");
		cigarbox4c = new BlockCigarboxD3(ModConfig.cigarbox4cID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox4c");
		GameRegistry.registerBlock(cigarbox4c);
		LanguageRegistry.addName(cigarbox4c, "Cigar Box (2 Cigars)");
		cigarbox4d = new BlockCigarboxD4(ModConfig.cigarbox4dID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox4d");
		GameRegistry.registerBlock(cigarbox4d);
		LanguageRegistry.addName(cigarbox4d, "Cigar Box (3 Cigars)");
		cigarbox4e = new BlockCigarboxD5(ModConfig.cigarbox4eID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.4F).setResistance(5.5F).setUnlocalizedName("cigarbox4e");
		GameRegistry.registerBlock(cigarbox4e);
		LanguageRegistry.addName(cigarbox4e, "Cigar Box (4 Cigars)");
		
	    
	    
	    
	    
	    
	GameRegistry.addRecipe(new ItemStack(ModBlocks.hay, 1), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(ModFood.straw,1)});
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.salt, 1), new Object[]{new ItemStack(Block.sand, 1), new ItemStack(ModFood.salt), new ItemStack(ModFood.salt), new ItemStack(ModFood.salt)});
	GameRegistry.addRecipe(new ItemStack(ModGuiSeedExtractor.seedextractorIdle, 1), new Object[] {"YZY", "YXY", "YYY", 'X', Item.seeds, 'Y', Block.cobblestone,  'Z', new ItemStack(ModTools.grindingmech,1)});
	GameRegistry.addRecipe(new ItemStack(ModGuiDnaExtractor.dnaextractorIdle, 1), new Object[] {"YZY", "YXY", "YYY", 'Z', new ItemStack(ModTools.core,1), 'Y', Block.cobblestone,  'X', ModGuiSeedExtractor.seedextractorIdle});
	GameRegistry.addRecipe(new ItemStack(ModGuiDnaFabricator.dnafabricatorIdle, 1), new Object[] {"YSY", "YZY", "YXY", 'Z', new ItemStack(ModTools.core2,1), 'Y', Item.ingotIron,  'X', ModGuiDnaExtractor.dnaextractorIdle,  'S', Block.glass});
	GameRegistry.addRecipe(new ItemStack(ModGuiElementExtractor.elementextractorIdle, 1), new Object[] {"YPY", "GDG", "YEY", 'E', new ItemStack(ModGuiDnaExtractor.dnaextractorIdle,1), 'D', Item.diamond,  'P', new ItemStack(Item.potion,1,0),  'G', Block.glowStone,  'Y', Item.ingotIron});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.rack, 2), new Object[] {"YYY", "XZX", "X X", 'Y', Block.wood, 'X', Item.stick, 'Z', Block.cloth});
	GameRegistry.addRecipe(new ItemStack(ModGuiSqueezer.squeezerIdle, 1), new Object[] {"YZY", "YXY", "YYY", 'X', Block.glass, 'Y', Block.cobblestone,  'Z', Block.obsidian});
	GameRegistry.addRecipe(new ItemStack(ModGuiFryer.fryerIdle, 1), new Object[] {"YYY", "XGX", "XHX", 'X', Block.cobblestone, 'Y', Block.fenceIron,  'G', Block.furnaceIdle,  'H', Item.redstone});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.gumball, 1), new Object[] {" X ", "YGY", "YZY", 'Z', new ItemStack(Block.dropper,1), 'Y', Item.ingotIron,  'X', Block.glass,  'G', Block.glowStone});
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.gumballh, 1), new Object[]{new ItemStack(gumball, 1), new ItemStack(ModFood.gumApple), new ItemStack(ModFood.gumStrawberry), new ItemStack(ModFood.gumLemon), new ItemStack(ModFood.gumGrape), new ItemStack(ModFood.gumCherry), new ItemStack(ModFood.gumOrange), new ItemStack(ModFood.gumMelon)});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.cigarbox, 2), new Object[] {"XXX", "Y Y", "YYY", 'Y', Block.wood, 'X', Block.planks});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.cigarbox, 2), new Object[] {"XXX", "Y Y", "YYY", 'Y', Block.wood, 'X', ModBlocks.planks});
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cigarboxe, 1), new Object[]{new ItemStack(cigarbox, 1), new ItemStack(ModFruits.tobaccoCigar), new ItemStack(ModFruits.tobaccoCigar), new ItemStack(ModFruits.tobaccoCigar), new ItemStack(ModFruits.tobaccoCigar)});
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cigarboxd, 1), new Object[]{new ItemStack(cigarbox, 1), new ItemStack(ModFruits.tobaccoCigar), new ItemStack(ModFruits.tobaccoCigar), new ItemStack(ModFruits.tobaccoCigar)});
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cigarboxc, 1), new Object[]{new ItemStack(cigarbox, 1), new ItemStack(ModFruits.tobaccoCigar), new ItemStack(ModFruits.tobaccoCigar)});
	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cigarboxb, 1), new Object[]{new ItemStack(cigarbox, 1), new ItemStack(ModFruits.tobaccoCigar)});
	GameRegistry.addRecipe(new ItemStack(ModGuiGrinder.GrinderIdle, 1), new Object[] {" Y ", "XXX", 'Y', ModTools.millstoneItem, 'X', Block.stone});
	
	GameRegistry.addRecipe(new ItemStack(ModBlocks.planks,4,0), new Object[] {"#", '#', new ItemStack(ModCrops.chicleLog)});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.planks,4,1), new Object[] {"#", '#', new ItemStack(ModCrops.cherryLog)});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.planks, 4, 2), new Object[] {"#", '#', new ItemStack(ModCrops.orangeLog)});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.planks, 4, 3), new Object[] {"#", '#', new ItemStack(ModCrops.lemonLog)});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.planks, 4, 4), new Object[] {"#", '#', new ItemStack(ModCrops.oliveLog)});
	GameRegistry.addRecipe(new ItemStack(Block.planks,4), new Object[] {"#", '#', new ItemStack(ModCrops.appleRedLog)});
	GameRegistry.addRecipe(new ItemStack(Block.planks,4), new Object[] {"#", '#', new ItemStack(ModCrops.appleGreenLog)});
	
	GameRegistry.addRecipe(new ItemStack(Block.workbench, 1), new Object[] {"YY", "YY", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Item.doorWood, 1), new Object[] {"YY", "YY", "YY", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Block.trapdoor, 1), new Object[] {"YYY", "YYY", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Block.woodenButton, 1), new Object[] {"Y", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Block.pressurePlatePlanks, 1), new Object[] {"YY", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Item.boat, 1), new Object[] {"Y Y", "YYY", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Block.chest, 1), new Object[] {"YYY", "Y Y", "YYY", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Block.music, 1), new Object[] {"YYY", "YRY", "YYY", 'Y', ModBlocks.planks, 'R', new ItemStack(Item.redstone)});
	GameRegistry.addRecipe(new ItemStack(Block.jukebox, 1), new Object[] {"YYY", "YRY", "YYY", 'Y', ModBlocks.planks, 'R', new ItemStack(Item.diamond)});
	GameRegistry.addRecipe(new ItemStack(Item.sign, 1), new Object[] {"YYY", "YYY", " X ", 'Y', ModBlocks.planks, 'X', new ItemStack(Item.stick)});
	GameRegistry.addRecipe(new ItemStack(Block.fenceGate, 1), new Object[] {"XYX", "XYX", 'Y', ModBlocks.planks, 'X', new ItemStack(Item.stick)});
	GameRegistry.addRecipe(new ItemStack(Item.bowlEmpty, 1), new Object[] {"Y Y", " Y ", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Item.bed, 1), new Object[] {"XXX", "YYY", 'Y', ModBlocks.planks, 'X', Block.cloth});
	GameRegistry.addRecipe(new ItemStack(Block.pistonBase, 1), new Object[] {"YYY", "XIX", "XRX", 'Y', ModBlocks.planks, 'X', Block.cobblestone, 'I', Item.ingotIron, 'R', Item.redstone});
	GameRegistry.addRecipe(new ItemStack(Block.bookShelf, 1), new Object[] {"YYY", "XXX", "YYY", 'Y', ModBlocks.planks, 'X', Item.book});
	GameRegistry.addRecipe(new ItemStack(ModTools.woodcog, 1), new Object[] {" Y ", "Y Y", " Y ", 'Y', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.vinerack, 4), new Object[] {"YYY", "YYY", "XYX", 'Y', Item.stick, 'X', Block.planks});
	GameRegistry.addRecipe(new ItemStack(ModBlocks.vinerack, 4), new Object[] {"YYY", "YYY", "XYX", 'Y', Item.stick, 'X', ModBlocks.planks});
	GameRegistry.addRecipe(new ItemStack(Item.stick, 4), new Object[] {"Y", "Y", 'Y', ModBlocks.planks});
	
	GameRegistry.addRecipe(new ItemStack(jellyblock, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jelly)});
	GameRegistry.addRecipe(new ItemStack(jellyblockApple, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyApple)});
	GameRegistry.addRecipe(new ItemStack(jellyblockStrawberry, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyStrawberry)});
	GameRegistry.addRecipe(new ItemStack(jellyblockLemon, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyLemon)});
	GameRegistry.addRecipe(new ItemStack(jellyblockGrape, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyGrape)});
	GameRegistry.addRecipe(new ItemStack(jellyblockCherry, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyCherry)});
	GameRegistry.addRecipe(new ItemStack(jellyblockOrange, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyOrange)});
	GameRegistry.addRecipe(new ItemStack(jellyblockBlackcurrant, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyBlackcurrant)});
	GameRegistry.addRecipe(new ItemStack(jellyblockRaspberry, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyRaspberry)});
	GameRegistry.addRecipe(new ItemStack(jellyblockBRaspberry, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.jellyBRaspberry)});

	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.pickler, 1), new Object[]{new ItemStack(fermenter, 1), new ItemStack(ModFood.vinegar)});
	GameRegistry.addRecipe(new ItemStack(fermenter, 1), new Object[] {"Y Y", "YYY", "YYY", 'Y', Block.wood});
	GameRegistry.addRecipe(new ItemStack(brewer, 1), new Object[] {"YYY", "ZXZ", "YYY", 'Y', Block.wood, 'Z', new ItemStack(Item.ingotIron), 'X', new ItemStack(ModBlocks.fermenter)});
	GameRegistry.addRecipe(new ItemStack(ModGuiPotionMaker.potionMakerIdle, 1), new Object[] {"YXY", "SZS", "SCS", 'Y', new ItemStack(Item.ingotIron), 'X', new ItemStack(Item.glassBottle), 'Z', new ItemStack(Item.brewingStand), 'S', new ItemStack(Block.stone), 'C', new ItemStack(Block.workbench)});
	GameRegistry.addRecipe(new ItemStack(ModGuiDnaMaker.dnaMakerIdle, 1), new Object[] {"YIY", "ICI", "YIY", 'Y', new ItemStack(Item.diamond), 'I', new ItemStack(Item.ingotIron), 'C', new ItemStack(Block.workbench)});

	GameRegistry.addRecipe(new ItemStack(blockSalt, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.salt)});
	GameRegistry.addRecipe(new ItemStack(blockPepper, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.pepper)});
	GameRegistry.addRecipe(new ItemStack(blockSugar, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(Item.sugar)});
	GameRegistry.addRecipe(new ItemStack(blockReed, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(Item.reed)});
	GameRegistry.addRecipe(new ItemStack(blockBacon, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.baconRaw)});
	GameRegistry.addRecipe(new ItemStack(blockChocolate, 1), new Object[] {"YYY", "YYY", "YYY", 'Y', new ItemStack(ModFood.chocolate)});
	
}
@PostInit
public void postInit(FMLPostInitializationEvent event) {
// this is the post initialization.
}
}