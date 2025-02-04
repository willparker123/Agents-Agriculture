
package agentsmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.IWorldGenerator;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ModCrops", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModCrops {

        // The instance of your mod that Forge uses.
@Instance("ModCrops")
public static ModCrops instance;
// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup


@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
public static CommonProxy proxy;

public static final String modid = "ModCrops";

public static Block strawberryCrop;
public static Block tomatoCrop;
public static Block weedCrop;
public static Block lettuceCrop;
public static Block cornCrop;
public static Block pepperCrop;
public static Block barleyCrop;
public static Block riceCrop;
public static Block cottonCrop;
public static Block onionCrop;
public static Block oliveCrop;
public static Block lemonCrop;
public static Block orangeCrop;
public static Block cherryCrop;
public static Block lavenderCrop;
public static Block parsleyCrop;
public static Block tobaccoCrop;
public static Block peppersCrop;
public static Block walnutCrop;
public static Block walnutHardCrop;
public static Block walnutHarderCrop;
public static Block walnutGoldCrop;
public static Block walnutDiamondCrop;
public static Block grapeCrop;
public static Block grapeCropb;
public static Block grapeCropc;
public static Block grapeCropd;
public static Block garlicCrop;
public static Block chicleCrop;
public static Block peanutCrop;
public static Block mintCrop;
public static Block truffleBlock;
public static Block truffleBlockWhite;
public static Block raspberryCrop;
public static Block braspberryCrop;
public static Block blackcurrantCrop;
public static Block blueberryCrop;
public static Block hopsCrop;
public static Block grapePurpleCrop;
public static Block grapePurpleCropb;
public static Block grapePurpleCropc;
public static Block grapePurpleCropd;
public static Block beanCrop;
public static Block beanCropb;
public static Block beanCropc;
public static Block beanCropd;
public static Block peaCrop;
public static Block peaCropb;
public static Block peaCropc;
public static Block peaCropd;
public static Block oatsCrop;
public static Block soyCrop;
public static Block teaCrop;
public static Block coffeeCrop;

public static Block roseCrop;
public static Block dandelionCrop;
public static Block oakTreeCrop;
public static Block birchTreeCrop;
public static Block spruceTreeCrop;
public static Block jungleTreeCrop;

public static Block lemonLog;
public static Block lemonLeaves;
public static Block lemonLeaves1;
public static Block lemonLeaves2;
public static Block lemonLeaves3;
public static Block lemonSapling;

public static Block orangeLog;
public static Block orangeLeaves;
public static Block orangeLeaves1;
public static Block orangeLeaves2;
public static Block orangeLeaves3;
public static Block orangeSapling;

public static Block cherryLog;
public static Block cherryLeaves;
public static Block cherryLeaves1;
public static Block cherryLeaves2;
public static Block cherryLeaves3;
public static Block cherrySapling;

public static Block oliveLog;
public static Block oliveLeaves;
public static Block oliveLeaves1;
public static Block oliveLeaves2;
public static Block oliveLeaves3;
public static Block oliveSapling;

public static Block chicleLog;
public static Block chicleLeaves;
public static Block chicleLeaves1;
public static Block chicleLeaves2;
public static Block chicleLeaves3;
public static Block chicleSapling;

public static Block appleRedLog;
public static Block appleRedLeaves;
public static Block appleRedLeaves1;
public static Block appleRedLeaves2;
public static Block appleRedLeaves3;
public static Block appleRedSapling;
public static Block appleRedCrop;

public static Block appleGreenLog;
public static Block appleGreenLeaves;
public static Block appleGreenLeaves1;
public static Block appleGreenLeaves2;
public static Block appleGreenLeaves3;
public static Block appleGreenSapling;
public static Block appleGreenCrop;

public static Block grass1;
public static Block grass2;
public static Block grass3;
public static Block wetClay;

public static Block strawberryPlant;
public static Block weedPlant;
public static Block lettucePlant;
public static Block cornPlant;
public static Block pepperPlant;
public static Block onionPlant;
public static Block parsleyPlant;
public static Block lavenderPlant;
public static Block tobaccoPlant;
public static Block peppersPlant;
public static Block walnutPlant;
public static Block seaweed;



//public static WorldGenStrawberry WorldGenStrawberry = new WorldGenStrawberry();
//public static WorldGenLettuce WorldGenLettuce = new WorldGenLettuce();
//public static WorldGenWeed WorldGenWeed = new WorldGenWeed();
//public static WorldGenCorn WorldGenCorn = new WorldGenCorn();
//public static WorldGenPepper WorldGenPepper = new WorldGenPepper();
//public static WorldGenGrass1 WorldGenGrass1 = new WorldGenGrass1();
//public static WorldGenGrass2 WorldGenGrass2 = new WorldGenGrass2();
//public static WorldGenGrass3 WorldGenGrass3 = new WorldGenGrass3();
public static WorldGenTrees WorldGenTrees = new WorldGenTrees();
public static WorldGenPlants WorldGenPlants = new WorldGenPlants();

public static WorldGenLemonTree WorldGenLemonTree = new WorldGenLemonTree(true);
public static WorldGenOrangeTree WorldGenOrangeTree = new WorldGenOrangeTree(true);
public static WorldGenCherryTree WorldGenCherryTree = new WorldGenCherryTree(true);
public static WorldGenOliveTree WorldGenOliveTree = new WorldGenOliveTree(true);
public static WorldGenChicleTree WorldGenChicleTree = new WorldGenChicleTree(true);
//public static WorldGenOnion WorldGenOnion = new WorldGenOnion();
//public static WorldGenLavender WorldGenLavender = new WorldGenLavender();
//public static WorldGenParsley WorldGenParsley = new WorldGenParsley();
//public static WorldGenTobacco WorldGenTobacco = new WorldGenTobacco();
//public static WorldGenPeppers WorldGenPeppers = new WorldGenPeppers();
//public static WorldGenWalnut WorldGenWalnut = new WorldGenWalnut();
public static WorldGenTruffle WorldGenTruffle = new WorldGenTruffle();
public static WorldGenSeaweed WorldGenSeaweed = new WorldGenSeaweed();
public static WorldGenSalt WorldGenSalt = new WorldGenSalt();

//public static WorldGenSalt WorldGenSalt = new WorldGenSalt();




@PreInit
public void preInit(FMLPreInitializationEvent event)
{
	
	//strawberry
	 strawberryCrop = new BlockCropStrawberry(ModConfig.strawberryCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("strawberryCrop");
	 GameRegistry.registerBlock(strawberryCrop);
	 LanguageRegistry.addName(strawberryCrop, "Strawberry Plant");
	 
	//tomato
		 tomatoCrop = new BlockCropTomato(ModConfig.tomatoCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("tomatoCrop");
		 GameRegistry.registerBlock(tomatoCrop);
		 LanguageRegistry.addName(tomatoCrop, "Tomato Plant");
		 
		//weed
		 weedCrop = new BlockCropWeed(ModConfig.weedCropID).setStepSound(Block.soundClothFootstep).setHardness(0.0F).setUnlocalizedName("weedCrop");
		 GameRegistry.registerBlock(weedCrop);
		 LanguageRegistry.addName(weedCrop, "Cannabis Plant");
		 
		
		//lettuce
		 lettuceCrop = new BlockCropLettuce(ModConfig.lettuceCropID).setStepSound(Block.soundSandFootstep).setHardness(0.0F).setUnlocalizedName("lettuceCrop");
		 GameRegistry.registerBlock(lettuceCrop);
		 LanguageRegistry.addName(lettuceCrop, "Lettuce Plant");
		 
		//corn
		 cornCrop = new BlockCropCorn(ModConfig.cornCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("cornCrop");
		 GameRegistry.registerBlock(cornCrop);
		 LanguageRegistry.addName(cornCrop, "Corn Stalk");
		 
		//pepper
		 pepperCrop = new BlockCropPepper(ModConfig.pepperCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("pepperCrop");
		 GameRegistry.registerBlock(pepperCrop);
		 LanguageRegistry.addName(pepperCrop, "Pepper Plant");
		 
		//barley
		 barleyCrop = new BlockCropBarley(ModConfig.barleyCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("barleyCrop");
		 GameRegistry.registerBlock(barleyCrop);
		 LanguageRegistry.addName(barleyCrop, "Barley Crop");
		 
			//Rice
		 riceCrop = new BlockCropRice(ModConfig.riceCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("riceCrop");
		 GameRegistry.registerBlock(riceCrop);
		 LanguageRegistry.addName(riceCrop, "Rice Crop");
		 
			//cotton
		 cottonCrop = new BlockCropCotton(ModConfig.cottonCropID).setStepSound(Block.soundClothFootstep).setHardness(0.4F).setUnlocalizedName("cottonCrop");
		 GameRegistry.registerBlock(cottonCrop);
		 LanguageRegistry.addName(cottonCrop, "Cotton Plant");
		 
			//onion
		 onionCrop = new BlockCropOnion(ModConfig.onionCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("onionCrop");
		 GameRegistry.registerBlock(onionCrop);
		 LanguageRegistry.addName(onionCrop, "Onion Plant");
		 
		//olive
		 oliveCrop = new BlockCropOlive(ModConfig.oliveCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.04F).setUnlocalizedName("oliveCrop");
		 GameRegistry.registerBlock(oliveCrop);
		 LanguageRegistry.addName(oliveCrop, "Olive Tree");
		 
			//lemon
		 lemonCrop = new BlockCropLemon(ModConfig.lemonCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.02F).setUnlocalizedName("lemonCrop");
		 GameRegistry.registerBlock(lemonCrop);
		 LanguageRegistry.addName(lemonCrop, "Lemon Tree");
		 
			//orange
		 orangeCrop = new BlockCropOrange(ModConfig.orangeCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.02F).setUnlocalizedName("orangeCrop");
		 GameRegistry.registerBlock(orangeCrop);
		 LanguageRegistry.addName(orangeCrop, "Orange Tree");
		 
			//cherry
		 cherryCrop = new BlockCropCherry(ModConfig.cherryCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.02F).setUnlocalizedName("cherryCrop");
		 GameRegistry.registerBlock(cherryCrop);
		 LanguageRegistry.addName(cherryCrop, "Cherry Tree");
		 
		//rose
		 roseCrop = new BlockCropRose(ModConfig.roseCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.02F).setUnlocalizedName("roseCrop");
		 GameRegistry.registerBlock(roseCrop);
		 LanguageRegistry.addName(roseCrop, "Roses");
		 
		//dandelion
		 dandelionCrop = new BlockCropDandelion(ModConfig.dandelionCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.02F).setUnlocalizedName("dandelionCrop");
		 GameRegistry.registerBlock(dandelionCrop);
		 LanguageRegistry.addName(dandelionCrop, "Dandelions");
		 
		//lavender
		 lavenderCrop = new BlockCropLavender(ModConfig.lavenderCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.00F).setUnlocalizedName("lavenderCrop");
		 GameRegistry.registerBlock(lavenderCrop);
		 LanguageRegistry.addName(lavenderCrop, "Lavender");
		 
		//parsley
		 parsleyCrop = new BlockCropParsley(ModConfig.parsleyCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.00F).setUnlocalizedName("parsleyCrop");
		 GameRegistry.registerBlock(parsleyCrop);
		 LanguageRegistry.addName(parsleyCrop, "Parsley");
		 
		//tobacco
		 tobaccoCrop = new BlockCropTobacco(ModConfig.tobaccoCropID).setStepSound(Block.soundClothFootstep).setHardness(0.08F).setUnlocalizedName("tobaccoCrop");
		 GameRegistry.registerBlock(tobaccoCrop);
		 LanguageRegistry.addName(tobaccoCrop, "Tobacco");
		 
		//peppers
		 peppersCrop = new BlockCropPeppers(ModConfig.peppersCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.00F).setUnlocalizedName("peppersCrop");
		 GameRegistry.registerBlock(peppersCrop);
		 LanguageRegistry.addName(peppersCrop, "Peppers");
		 
			//walnut
		 walnutCrop = new BlockCropWalnut(ModConfig.walnutCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.4F).setUnlocalizedName("walnutCrop");
		 GameRegistry.registerBlock(walnutCrop);
		 LanguageRegistry.addName(walnutCrop, "Walnuts");
		 
		//walnut hard
		 walnutHardCrop = new BlockCropWalnutHard(ModConfig.walnutHardCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.8F).setUnlocalizedName("walnutHardCrop");
		 GameRegistry.registerBlock(walnutHardCrop);
		 LanguageRegistry.addName(walnutHardCrop, "Hard Walnuts");
		 
		//walnut iron
		 walnutHarderCrop = new BlockCropWalnutHarder(ModConfig.walnutHarderCropID).setStepSound(Block.soundWoodFootstep).setHardness(1.4F).setUnlocalizedName("walnutHarderCrop");
		 GameRegistry.registerBlock(walnutHarderCrop);
		 LanguageRegistry.addName(walnutHarderCrop, "Iron Walnuts");
		 
		//walnutGold
		 walnutGoldCrop = new BlockCropWalnutGold(ModConfig.walnutGoldCropID).setStepSound(Block.soundWoodFootstep).setHardness(2.6F).setUnlocalizedName("walnutGoldCrop");
		 GameRegistry.registerBlock(walnutGoldCrop);
		 LanguageRegistry.addName(walnutGoldCrop, "Golden Walnuts");
		 
		//walnutDiamond
		 walnutDiamondCrop = new BlockCropWalnutDiamond(ModConfig.walnutDiamondCropID).setStepSound(Block.soundAnvilFootstep).setHardness(4.6F).setUnlocalizedName("walnutDiamondCrop");
		 GameRegistry.registerBlock(walnutDiamondCrop);
		 LanguageRegistry.addName(walnutDiamondCrop, "Diamond Walnuts");
		 
			//grape
		 grapeCrop = new BlockCropGrape(ModConfig.grapeCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapeCrop");
		 GameRegistry.registerBlock(grapeCrop);
		 LanguageRegistry.addName(grapeCrop, "Grapes");
		 
		 grapeCropb = new BlockCropGrape2(ModConfig.grapeCropbID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapeCropb");
		 GameRegistry.registerBlock(grapeCropb);
		 LanguageRegistry.addName(grapeCropb, "Grapes");
		 
		 grapeCropc = new BlockCropGrape3(ModConfig.grapeCropcID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapeCropc");
		 GameRegistry.registerBlock(grapeCropc);
		 LanguageRegistry.addName(grapeCropc, "Grapes");
		 
		 grapeCropd = new BlockCropGrape4(ModConfig.grapeCropdID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapeCropd");
		 GameRegistry.registerBlock(grapeCropd);
		 LanguageRegistry.addName(grapeCropd, "Grapes");
		 
		//garlic
		 garlicCrop = new BlockCropGarlic(ModConfig.garlicCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.06F).setUnlocalizedName("garlicCrop");
		 GameRegistry.registerBlock(garlicCrop);
		 LanguageRegistry.addName(garlicCrop, "Garlic Plant");
		 
		//chicle
		 chicleCrop = new BlockCropChicle(ModConfig.chicleCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.12F).setUnlocalizedName("chicleCrop");
		 GameRegistry.registerBlock(chicleCrop);
		 LanguageRegistry.addName(chicleCrop, "Chicle Tree");
		 
		//peanut
		 peanutCrop = new BlockCropPeanut(ModConfig.peanutCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.3F).setUnlocalizedName("peanutCrop");
		 GameRegistry.registerBlock(peanutCrop);
		 LanguageRegistry.addName(peanutCrop, "Peanut Plant");
		 
		//mint
		 mintCrop = new BlockCropMint(ModConfig.mintCropID).setStepSound(Block.soundClothFootstep).setHardness(0.05F).setUnlocalizedName("mintCrop");
		 GameRegistry.registerBlock(mintCrop);
		 LanguageRegistry.addName(mintCrop, "Mint");
		 
		//truffle
		 truffleBlock = new BlockCropTruffle(ModConfig.truffleBlockID, Material.cloth).setStepSound(Block.soundClothFootstep).setHardness(0.1F).setUnlocalizedName("truffleBlock");
		 GameRegistry.registerBlock(truffleBlock);
		 LanguageRegistry.addName(truffleBlock, "Truffle");
		 
			//truffle
		 truffleBlockWhite = new BlockCropTruffleWhite(ModConfig.truffleBlockWhiteID, Material.cloth).setStepSound(Block.soundClothFootstep).setHardness(0.1F).setUnlocalizedName("truffleBlockWhite");
		 GameRegistry.registerBlock(truffleBlockWhite);
		 LanguageRegistry.addName(truffleBlockWhite, "Truffle");
		 
		//raspberry
		 raspberryCrop = new BlockCropRaspberry(ModConfig.raspberryCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.00F).setUnlocalizedName("raspberryCrop");
		 GameRegistry.registerBlock(raspberryCrop);
		 LanguageRegistry.addName(raspberryCrop, "Raspberries");
		 
		//braspberry
		 braspberryCrop = new BlockCropBRaspberry(ModConfig.braspberryCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.00F).setUnlocalizedName("braspberryCrop");
		 GameRegistry.registerBlock(braspberryCrop);
		 LanguageRegistry.addName(braspberryCrop, "Blue Raspberries");
		 
		//blackcurrant
		 blackcurrantCrop = new BlockCropBlackcurrant(ModConfig.blackcurrantCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.04F).setUnlocalizedName("blackcurrantCrop");
		 GameRegistry.registerBlock(blackcurrantCrop);
		 LanguageRegistry.addName(blackcurrantCrop, "Blackcurrants");
		
		//blueberry
		 blueberryCrop = new BlockCropBlueberry(ModConfig.blueberryCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.04F).setUnlocalizedName("blueberryCrop");
		 GameRegistry.registerBlock(blueberryCrop);
		 LanguageRegistry.addName(blueberryCrop, "Blueberries");
		
		//hops
		 hopsCrop = new BlockCropHops(ModConfig.hopsCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("hopsCrop");
		 GameRegistry.registerBlock(hopsCrop);
		 LanguageRegistry.addName(hopsCrop, "Hop Plant");
		
		//grapePurple
		 grapePurpleCrop = new BlockCropGrapePurple(ModConfig.grapePurpleCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapePurpleCrop");
		 GameRegistry.registerBlock(grapePurpleCrop);
		 LanguageRegistry.addName(grapePurpleCrop, "Purple Grapes");
		 
		 grapePurpleCropb = new BlockCropGrapePurple2(ModConfig.grapePurpleCropbID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapePurpleCropb");
		 GameRegistry.registerBlock(grapePurpleCropb);
		 LanguageRegistry.addName(grapePurpleCropb, "Purple Grapes");
		 
		 grapePurpleCropc = new BlockCropGrapePurple3(ModConfig.grapePurpleCropcID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapePurpleCropc");
		 GameRegistry.registerBlock(grapePurpleCropc);
		 LanguageRegistry.addName(grapePurpleCropc, "Purple Grapes");
		 
		 grapePurpleCropd = new BlockCropGrapePurple4(ModConfig.grapePurpleCropdID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("grapePurpleCropd");
		 GameRegistry.registerBlock(grapePurpleCropd);
		 LanguageRegistry.addName(grapePurpleCropd, "Purple Grapes");

		 
		 
		//bean
		 beanCrop = new BlockCropBean(ModConfig.beanCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("beanCrop");
		 GameRegistry.registerBlock(beanCrop);
		 LanguageRegistry.addName(beanCrop, "Bean Stalk");
		 
		 beanCropb = new BlockCropBean2(ModConfig.beanCropbID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("beanCropb");
		 GameRegistry.registerBlock(beanCropb);
		 LanguageRegistry.addName(beanCropb, "Bean Stalk");
		 
		 beanCropc = new BlockCropBean3(ModConfig.beanCropcID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("beanCropc");
		 GameRegistry.registerBlock(beanCropc);
		 LanguageRegistry.addName(beanCropc, "Bean Stalk");
		 
		 beanCropd = new BlockCropBean4(ModConfig.beanCropdID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("beanCropd");
		 GameRegistry.registerBlock(beanCropd);
		 LanguageRegistry.addName(beanCropd, "Bean Stalk");
		
		 
		 
		//pea
		 peaCrop = new BlockCropPea(ModConfig.peaCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("peaCrop");
		 GameRegistry.registerBlock(peaCrop);
		 LanguageRegistry.addName(peaCrop, "Pea Plant");
		 
		 peaCropb = new BlockCropPea2(ModConfig.peaCropbID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("peaCropb");
		 GameRegistry.registerBlock(peaCropb);
		 LanguageRegistry.addName(peaCropb, "Pea Plant");
		 
		 peaCropc = new BlockCropPea3(ModConfig.peaCropcID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("peaCropc");
		 GameRegistry.registerBlock(peaCropc);
		 LanguageRegistry.addName(peaCropc, "Pea Plant");
		 
		 peaCropd = new BlockCropPea4(ModConfig.peaCropdID).setStepSound(Block.soundWoodFootstep).setHardness(0.2F).setUnlocalizedName("peaCropd");
		 GameRegistry.registerBlock(peaCropd);
		 LanguageRegistry.addName(peaCropd, "Pea Plant");
		
		 
		 
		//oats
		 oatsCrop = new BlockCropOats(ModConfig.oatsCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("oatsCrop");
		 GameRegistry.registerBlock(oatsCrop);
		 LanguageRegistry.addName(oatsCrop, "Oat Plant");
		
		//soy
		 soyCrop = new BlockCropSoy(ModConfig.soyCropID).setStepSound(Block.soundWoodFootstep).setHardness(0.1F).setUnlocalizedName("soyCrop");
		 GameRegistry.registerBlock(soyCrop);
		 LanguageRegistry.addName(soyCrop, "Soy Plant");
		 
		//tea
		 teaCrop = new BlockCropTea(ModConfig.teaCropID).setStepSound(Block.soundClothFootstep).setHardness(0.05F).setUnlocalizedName("teaCrop");
		 GameRegistry.registerBlock(teaCrop);
		 LanguageRegistry.addName(teaCrop, "Tea Plant");
		 
			//coffee
			 coffeeCrop = new BlockCropCoffee(ModConfig.coffeeCropID).setStepSound(Block.soundClothFootstep).setHardness(0.2F).setUnlocalizedName("coffeeCrop");
			 GameRegistry.registerBlock(coffeeCrop);
			 LanguageRegistry.addName(coffeeCrop, "Coffee Plant");
			 
			 
		 
			//oakTree
			 oakTreeCrop = new BlockCropOakTree(ModConfig.oakTreeCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.04F).setUnlocalizedName("oakTreeCrop");
			 GameRegistry.registerBlock(oakTreeCrop);
			 LanguageRegistry.addName(oakTreeCrop, "Oak Tree");
			 
			//birchTree
			 birchTreeCrop = new BlockCropBirchTree(ModConfig.birchTreeCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.04F).setUnlocalizedName("birchTreeCrop");
			 GameRegistry.registerBlock(birchTreeCrop);
			 LanguageRegistry.addName(birchTreeCrop, "Birch Tree");
			 
			//spruceTree
			 spruceTreeCrop = new BlockCropSpruceTree(ModConfig.spruceTreeCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.04F).setUnlocalizedName("spruceTreeCrop");
			 GameRegistry.registerBlock(spruceTreeCrop);
			 LanguageRegistry.addName(spruceTreeCrop, "Spruce Tree");
			 
			//jungleTree
			 jungleTreeCrop = new BlockCropJungleTree(ModConfig.jungleTreeCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.04F).setUnlocalizedName("jungleTreeCrop");
			 GameRegistry.registerBlock(jungleTreeCrop);
			 LanguageRegistry.addName(jungleTreeCrop, "Jungle Tree");
			 
			 
			 
		//lemon tree
		 lemonLeaves = new BlockLemonLeaves(ModConfig.lemonLeavesID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("lemonLeaves");
		 lemonLeaves1 = new BlockLemonLeaves1(ModConfig.lemonLeaves1ID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("lemonLeaves1");
		 lemonLeaves2 = new BlockLemonLeaves2(ModConfig.lemonLeaves2ID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("lemonLeaves2");
		 lemonLeaves3 = new BlockLemonLeaves3(ModConfig.lemonLeaves3ID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("lemonLeaves3");
		 lemonLog = new BlockLemonLog(ModConfig.lemonLogID).setStepSound(Block.soundWoodFootstep).setHardness(1.5F).setUnlocalizedName("lemonLog");
		 lemonSapling = new BlockLemonSapling(ModConfig.lemonSaplingID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("lemonSapling");
		 GameRegistry.registerBlock(lemonLeaves);
		 GameRegistry.registerBlock(lemonLeaves1);
		 GameRegistry.registerBlock(lemonLeaves2);
		 GameRegistry.registerBlock(lemonLeaves3);
		 GameRegistry.registerBlock(lemonLog);
		 GameRegistry.registerBlock(lemonSapling);
		 LanguageRegistry.addName(lemonLeaves, "Lemon Tree Leaves");
		 LanguageRegistry.addName(lemonLeaves1, "Lemon Tree Leaves");
		 LanguageRegistry.addName(lemonLeaves2, "Lemon Tree Leaves");
		 LanguageRegistry.addName(lemonLeaves3, "Lemon Tree Leaves");
			LanguageRegistry.addName(lemonLog, "Lemon Tree Wood");
		 LanguageRegistry.addName(lemonSapling, "Lemon Tree Sapling");
		 
		 
		 
		 
		//orange tree
		 orangeLeaves = new BlockOrangeLeaves(ModConfig.orangeLeavesID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("orangeLeaves");
		 orangeLeaves1 = new BlockOrangeLeaves1(ModConfig.orangeLeaves1ID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("orangeLeaves1");
		 orangeLeaves2 = new BlockOrangeLeaves2(ModConfig.orangeLeaves2ID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("orangeLeaves2");
		 orangeLeaves3 = new BlockOrangeLeaves3(ModConfig.orangeLeaves3ID).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("orangeLeaves3");
		 orangeLog = new BlockOrangeLog(ModConfig.orangeLogID).setStepSound(Block.soundWoodFootstep).setHardness(1.0F).setUnlocalizedName("orangeLog");
		 orangeSapling = new BlockOrangeSapling(ModConfig.orangeSaplingID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("orangeSapling");
		 GameRegistry.registerBlock(orangeLeaves);
		 GameRegistry.registerBlock(orangeLeaves1);
		 GameRegistry.registerBlock(orangeLeaves2);
		 GameRegistry.registerBlock(orangeLeaves3);
		 GameRegistry.registerBlock(orangeLog);
		 GameRegistry.registerBlock(orangeSapling);
		 LanguageRegistry.addName(orangeLeaves, "Orange Tree Leaves");
		 LanguageRegistry.addName(orangeLeaves1, "Orange Tree Leaves");
		 LanguageRegistry.addName(orangeLeaves2, "Orange Tree Leaves");
		 LanguageRegistry.addName(orangeLeaves3, "Orange Tree Leaves");
		 LanguageRegistry.addName(orangeLog, "Orange Tree Wood");
		 LanguageRegistry.addName(orangeSapling, "Orange Tree Sapling");
		 
		 
		 
		 
		//cherry tree
		 cherryLeaves = new BlockCherryLeaves(ModConfig.cherryLeavesID).setStepSound(Block.soundGrassFootstep).setHardness(0.06F).setUnlocalizedName("cherryLeaves");
		 cherryLeaves1 = new BlockCherryLeaves1(ModConfig.cherryLeaves1ID).setStepSound(Block.soundGrassFootstep).setHardness(0.06F).setUnlocalizedName("cherryLeaves1");
		 cherryLeaves2 = new BlockCherryLeaves2(ModConfig.cherryLeaves2ID).setStepSound(Block.soundGrassFootstep).setHardness(0.06F).setUnlocalizedName("cherryLeaves2");
		 cherryLeaves3 = new BlockCherryLeaves3(ModConfig.cherryLeaves3ID).setStepSound(Block.soundGrassFootstep).setHardness(0.06F).setUnlocalizedName("cherryLeaves3");
		 cherryLog = new BlockCherryLog(ModConfig.cherryLogID).setStepSound(Block.soundWoodFootstep).setHardness(0.7F).setUnlocalizedName("cherryLog");
		 cherrySapling = new BlockCherrySapling(ModConfig.cherrySaplingID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("cherrySapling");
		 GameRegistry.registerBlock(cherryLeaves);
		 GameRegistry.registerBlock(cherryLeaves1);
		 GameRegistry.registerBlock(cherryLeaves2);
		 GameRegistry.registerBlock(cherryLeaves3);
		 GameRegistry.registerBlock(cherryLog);
		 GameRegistry.registerBlock(cherrySapling);
		 LanguageRegistry.addName(cherryLeaves, "Cherry Tree Leaves");
		 LanguageRegistry.addName(cherryLeaves1, "Cherry Tree Leaves");
		 LanguageRegistry.addName(cherryLeaves2, "Cherry Tree Leaves");
		 LanguageRegistry.addName(cherryLeaves3, "Cherry Tree Leaves");
		 LanguageRegistry.addName(cherryLog, "Cherry Tree Wood");
		 LanguageRegistry.addName(cherrySapling, "Cherry Tree Sapling");
		 
		 
		 
		 
		//olive tree
		 oliveLeaves = new BlockOliveLeaves(ModConfig.oliveLeavesID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("oliveLeaves");
		 oliveLeaves1 = new BlockOliveLeaves1(ModConfig.oliveLeaves1ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("oliveLeaves1");
		 oliveLeaves2 = new BlockOliveLeaves2(ModConfig.oliveLeaves2ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("oliveLeaves2");
		 oliveLeaves3 = new BlockOliveLeaves3(ModConfig.oliveLeaves3ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("oliveLeaves3");
		 oliveLog = new BlockOliveLog(ModConfig.oliveLogID).setStepSound(Block.soundWoodFootstep).setHardness(1.0F).setUnlocalizedName("oliveLog");
		 oliveSapling = new BlockOliveSapling(ModConfig.oliveSaplingID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("oliveSapling");
		 GameRegistry.registerBlock(oliveLeaves);
		 GameRegistry.registerBlock(oliveLeaves1);
		 GameRegistry.registerBlock(oliveLeaves2);
		 GameRegistry.registerBlock(oliveLeaves3);
		 GameRegistry.registerBlock(oliveLog);
		 GameRegistry.registerBlock(oliveSapling);
		 LanguageRegistry.addName(oliveLeaves, "Olive Tree Leaves");
		 LanguageRegistry.addName(oliveLeaves1, "Olive Tree Leaves");
		 LanguageRegistry.addName(oliveLeaves2, "Olive Tree Leaves");
		 LanguageRegistry.addName(oliveLeaves3, "Olive Tree Leaves");
		 LanguageRegistry.addName(oliveLog, "Olive Tree Wood");
		 LanguageRegistry.addName(oliveSapling, "Olive Tree Sapling");

		 
		 
		 
		//chicle tree
		 chicleLeaves = new BlockChicleLeaves(ModConfig.chicleLeavesID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("chicleLeaves");
		 chicleLeaves1 = new BlockChicleLeaves1(ModConfig.chicleLeaves1ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("chicleLeaves1");
		 chicleLeaves2 = new BlockChicleLeaves2(ModConfig.chicleLeaves2ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("chicleLeaves2");
		 chicleLeaves3 = new BlockChicleLeaves3(ModConfig.chicleLeaves3ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("chicleLeaves3");
		 chicleLog = new BlockChicleLog(ModConfig.chicleLogID).setStepSound(Block.soundWoodFootstep).setHardness(3.5F).setUnlocalizedName("chicleLog");
		 chicleSapling = new BlockChicleSapling(ModConfig.chicleSaplingID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("chicleSapling");
		 GameRegistry.registerBlock(chicleLeaves);
		 GameRegistry.registerBlock(chicleLeaves1);
		 GameRegistry.registerBlock(chicleLeaves2);
		 GameRegistry.registerBlock(chicleLeaves3);
		 GameRegistry.registerBlock(chicleLog);
		 GameRegistry.registerBlock(chicleSapling);
		 LanguageRegistry.addName(chicleLeaves, "Chicle Tree Leaves");
		 LanguageRegistry.addName(chicleLeaves1, "Chicle Tree Leaves");
		 LanguageRegistry.addName(chicleLeaves2, "Chicle Tree Leaves");
		 LanguageRegistry.addName(chicleLeaves3, "Chicle Tree Leaves");
		 LanguageRegistry.addName(chicleLog, "Chicle Tree Wood");
		 LanguageRegistry.addName(chicleSapling, "Chicle Tree Sapling");

		 
		 
		 
		//appleRed tree
		 appleRedLeaves = new BlockAppleRedLeaves(ModConfig.appleRedLeavesID).setCreativeTab(ModCreativeTabs.tabPlants).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleRedLeaves");
		 appleRedLeaves1 = new BlockAppleRedLeaves1(ModConfig.appleRedLeaves1ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleRedLeaves1");
		 appleRedLeaves2 = new BlockAppleRedLeaves2(ModConfig.appleRedLeaves2ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleRedLeaves2");
		 appleRedLeaves3 = new BlockAppleRedLeaves3(ModConfig.appleRedLeaves3ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleRedLeaves3");
		 appleRedLog = new BlockAppleRedLog(ModConfig.appleRedLogID).setCreativeTab(ModCreativeTabs.tabPlants).setStepSound(Block.soundWoodFootstep).setHardness(1.0F).setUnlocalizedName("appleRedLog");
		 appleRedSapling = new BlockAppleRedSapling(ModConfig.appleRedSaplingID).setCreativeTab(ModCreativeTabs.tabPlants).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("appleRedSapling");
		 GameRegistry.registerBlock(appleRedLeaves);
		 GameRegistry.registerBlock(appleRedLeaves1);
		 GameRegistry.registerBlock(appleRedLeaves2);
		 GameRegistry.registerBlock(appleRedLeaves3);
		 GameRegistry.registerBlock(appleRedLog);
		 GameRegistry.registerBlock(appleRedSapling);
		 LanguageRegistry.addName(appleRedLeaves, "Red Apple Tree Leaves");
		 LanguageRegistry.addName(appleRedLeaves1, "Red Apple Tree Leaves");
		 LanguageRegistry.addName(appleRedLeaves2, "Red Apple Tree Leaves");
		 LanguageRegistry.addName(appleRedLeaves3, "Red Apple Tree Leaves");
		  LanguageRegistry.addName(appleRedLog, "Red Apple Tree Wood");
		 LanguageRegistry.addName(appleRedSapling, "Red Apple Tree Sapling");
		 
		//appleRed
		 appleRedCrop = new BlockCropAppleRed(ModConfig.appleRedCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.03F).setUnlocalizedName("appleRedCrop");
		 GameRegistry.registerBlock(appleRedCrop);
		 LanguageRegistry.addName(appleRedCrop, "Red Apple Tree");
		 
			 
			 
			//appleGreen tree
			 appleGreenLeaves = new BlockAppleGreenLeaves(ModConfig.appleGreenLeavesID).setCreativeTab(ModCreativeTabs.tabPlants).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleGreenLeaves");
			 appleGreenLeaves1 = new BlockAppleGreenLeaves1(ModConfig.appleGreenLeaves1ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleGreenLeaves1");
			 appleGreenLeaves2 = new BlockAppleGreenLeaves2(ModConfig.appleGreenLeaves2ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleGreenLeaves2");
			 appleGreenLeaves3 = new BlockAppleGreenLeaves3(ModConfig.appleGreenLeaves3ID).setStepSound(Block.soundGrassFootstep).setHardness(0.08F).setUnlocalizedName("appleGreenLeaves3");
			 appleGreenLog = new BlockAppleGreenLog(ModConfig.appleGreenLogID).setCreativeTab(ModCreativeTabs.tabPlants).setStepSound(Block.soundWoodFootstep).setHardness(1.0F).setUnlocalizedName("appleGreenLog");
			 appleGreenSapling = new BlockAppleGreenSapling(ModConfig.appleGreenSaplingID).setCreativeTab(ModCreativeTabs.tabPlants).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("appleGreenSapling");
			 GameRegistry.registerBlock(appleGreenLeaves);
			 GameRegistry.registerBlock(appleGreenLeaves1);
			 GameRegistry.registerBlock(appleGreenLeaves2);
			 GameRegistry.registerBlock(appleGreenLeaves3);
			 GameRegistry.registerBlock(appleGreenLog);
			 GameRegistry.registerBlock(appleGreenSapling);
			 LanguageRegistry.addName(appleGreenLeaves, "Green Apple Tree Leaves");
			 LanguageRegistry.addName(appleGreenLeaves1, "Green Apple Tree Leaves");
			 LanguageRegistry.addName(appleGreenLeaves2, "Green Apple Tree Leaves");
			 LanguageRegistry.addName(appleGreenLeaves3, "Green Apple Tree Leaves");
			  LanguageRegistry.addName(appleGreenLog, "Green Apple Tree Wood");
			 LanguageRegistry.addName(appleGreenSapling, "Green Apple Tree Sapling");
			 
			//appleGreen
			 appleGreenCrop = new BlockCropAppleGreen(ModConfig.appleGreenCropID).setStepSound(Block.soundGrassFootstep).setHardness(0.03F).setUnlocalizedName("appleGreenCrop");
			 GameRegistry.registerBlock(appleGreenCrop);
			 LanguageRegistry.addName(appleGreenCrop, "Green Apple Tree");
			 
		 
		 
			 
			 
		//strawberry
		 strawberryPlant = new BlockPlantStrawberry(ModConfig.strawberryPlantID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("strawberryPlant");
		 GameRegistry.registerBlock(strawberryPlant);
		 LanguageRegistry.addName(strawberryPlant, "Strawberry Plant (Flower)");
		 
		
			//weed
			 weedPlant = new BlockPlantWeed(ModConfig.weedPlantID, Material.grass).setStepSound(Block.soundClothFootstep).setHardness(0.0F).setUnlocalizedName("weedPlant");
			 GameRegistry.registerBlock(weedPlant);
			 LanguageRegistry.addName(weedPlant, "Cannabis Plant (Flower)");
			 
			
			//lettuce
			 lettucePlant = new BlockPlantLettuce(ModConfig.lettucePlantID, Material.grass).setStepSound(Block.soundSandFootstep).setHardness(0.0F).setUnlocalizedName("lettucePlant");
			 GameRegistry.registerBlock(lettucePlant);
			 LanguageRegistry.addName(lettucePlant, "Lettuce Plant (Flower)");
			 
			//corn
			 cornPlant = new BlockPlantCorn(ModConfig.cornPlantID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("cornPlant");
			 GameRegistry.registerBlock(cornPlant);
			 LanguageRegistry.addName(cornPlant, "Corn Stalk (Flower)");
			 
			//pepper
			 pepperPlant = new BlockPlantPepper(ModConfig.pepperPlantID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("pepperPlant");
			 GameRegistry.registerBlock(pepperPlant);
			 LanguageRegistry.addName(pepperPlant, "Pepper Plant (Flower)");
			 
			
				//grass 1
			 grass1 = new BlockGrass1(ModConfig.grass1ID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0F).setUnlocalizedName("grass1");
			 GameRegistry.registerBlock(grass1);
			 LanguageRegistry.addName(grass1, "Hordeum");
			 
				//grass 2
			 grass2 = new BlockGrass2(ModConfig.grass2ID, Material.grass).setStepSound(Block.soundClothFootstep).setHardness(0.1F).setUnlocalizedName("grass2");
			 GameRegistry.registerBlock(grass2);
			 LanguageRegistry.addName(grass2, "Gossypium");
			 
				//grass 3
			 grass3 = new BlockGrass3(ModConfig.grass3ID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("grass3");
			 GameRegistry.registerBlock(grass3);
			 LanguageRegistry.addName(grass3, "Solanum");

			//wet clay
			 wetClay = new BlockWetClay(ModConfig.wetClayID).setStepSound(Block.soundSnowFootstep).setHardness(0.3F).setUnlocalizedName("wetClay");
			 GameRegistry.registerBlock(wetClay);
			 LanguageRegistry.addName(wetClay, "Wet Clay");
			 
			//onion
			 onionPlant = new BlockPlantOnion(ModConfig.onionPlantID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("onionPlant");
			 GameRegistry.registerBlock(onionPlant);
			 LanguageRegistry.addName(onionPlant, "Onion (Flower)");
	 	
			//lavender
			 lavenderPlant = new BlockPlantLavender(ModConfig.lavenderPlantID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("lavenderPlant");
			 GameRegistry.registerBlock(lavenderPlant);
			 LanguageRegistry.addName(lavenderPlant, "Lavender");
	 	
			//parsley
			 parsleyPlant = new BlockPlantParsley(ModConfig.parsleyPlantID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("parsleyPlant");
			 GameRegistry.registerBlock(parsleyPlant);
			 LanguageRegistry.addName(parsleyPlant, "Parsley");
			 
			//tobacco
			 tobaccoPlant = new BlockPlantTobacco(ModConfig.tobaccoPlantID, Material.grass).setStepSound(Block.soundClothFootstep).setHardness(0.08F).setUnlocalizedName("tobaccoPlant");
			 GameRegistry.registerBlock(tobaccoPlant);
			 LanguageRegistry.addName(tobaccoPlant, "Tobacco");
			 
			//peppers
			 peppersPlant = new BlockPlantPeppers(ModConfig.peppersPlantID, Material.grass).setStepSound(Block.soundGrassFootstep).setHardness(0.05F).setUnlocalizedName("peppersPlant");
			 GameRegistry.registerBlock(peppersPlant);
			 LanguageRegistry.addName(peppersPlant, "Peppers");
			 
			//walnut
			 walnutPlant = new BlockPlantWalnut(ModConfig.walnutPlantID, Material.grass).setStepSound(Block.soundStoneFootstep).setHardness(0.15F).setUnlocalizedName("walnutPlant");
			 GameRegistry.registerBlock(walnutPlant);
			 LanguageRegistry.addName(walnutPlant, "Walnut");
	 	
			//seaweed
			 seaweed = new BlockPlantSeaweed(ModConfig.seaweedID).setStepSound(Block.soundGrassFootstep).setHardness(0.0F).setUnlocalizedName("seaweed");
			 GameRegistry.registerBlock(seaweed);
			 LanguageRegistry.addName(seaweed, "Sea Weed");
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
}


@Init
public void load (FMLInitializationEvent event)
{
	MinecraftForge.EVENT_BUS.register(new FertiliserEvent(null, null, 0, 0, 0, 0));
	
	MinecraftForge.EVENT_BUS.register(new CropEventStrawberry());
	MinecraftForge.EVENT_BUS.register(new CropEventTomato());
	MinecraftForge.EVENT_BUS.register(new CropEventLemonCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventOrangeCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventCherryCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventLettuce());
	MinecraftForge.EVENT_BUS.register(new CropEventPepper());
	MinecraftForge.EVENT_BUS.register(new CropEventRice());
	MinecraftForge.EVENT_BUS.register(new CropEventCotton());
	MinecraftForge.EVENT_BUS.register(new CropEventOnion());
	MinecraftForge.EVENT_BUS.register(new CropEventOliveCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventOliveTree());
	MinecraftForge.EVENT_BUS.register(new CropEventRose());
	MinecraftForge.EVENT_BUS.register(new CropEventDandelion());
	MinecraftForge.EVENT_BUS.register(new CropEventWeed());
	MinecraftForge.EVENT_BUS.register(new CropEventCorn());
	MinecraftForge.EVENT_BUS.register(new CropEventBarley());
	MinecraftForge.EVENT_BUS.register(new CropEventLavender());
	MinecraftForge.EVENT_BUS.register(new CropEventParsley());
	MinecraftForge.EVENT_BUS.register(new CropEventPeppers());
	MinecraftForge.EVENT_BUS.register(new CropEventTobacco());
	MinecraftForge.EVENT_BUS.register(new CropEventWalnut());
	MinecraftForge.EVENT_BUS.register(new CropEventWalnutHarder());
	MinecraftForge.EVENT_BUS.register(new CropEventWalnutHard());
	MinecraftForge.EVENT_BUS.register(new CropEventPeanut());
	MinecraftForge.EVENT_BUS.register(new CropEventGrape());
	MinecraftForge.EVENT_BUS.register(new CropEventGrape2());
	MinecraftForge.EVENT_BUS.register(new CropEventGrape3());
	MinecraftForge.EVENT_BUS.register(new CropEventGrape4());
	MinecraftForge.EVENT_BUS.register(new CropEventGarlic());
	MinecraftForge.EVENT_BUS.register(new CropEventChicle());
	MinecraftForge.EVENT_BUS.register(new CropEventChicleCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventMint());
	MinecraftForge.EVENT_BUS.register(new CropEventRaspberry());
	MinecraftForge.EVENT_BUS.register(new CropEventBRaspberry());
	MinecraftForge.EVENT_BUS.register(new CropEventBlackcurrant());
	MinecraftForge.EVENT_BUS.register(new CropEventBlueberry());
	MinecraftForge.EVENT_BUS.register(new CropEventWalnutGold());
	MinecraftForge.EVENT_BUS.register(new CropEventWalnutDiamond());
	MinecraftForge.EVENT_BUS.register(new CropEventHops());
	MinecraftForge.EVENT_BUS.register(new CropEventGrapePurple());
	MinecraftForge.EVENT_BUS.register(new CropEventGrapePurple2());
	MinecraftForge.EVENT_BUS.register(new CropEventGrapePurple3());
	MinecraftForge.EVENT_BUS.register(new CropEventGrapePurple4());
	MinecraftForge.EVENT_BUS.register(new CropEventAppleRedCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventAppleRed());
	MinecraftForge.EVENT_BUS.register(new CropEventAppleGreenCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventAppleGreen());
	MinecraftForge.EVENT_BUS.register(new CropEventBean());
	MinecraftForge.EVENT_BUS.register(new CropEventBean2());
	MinecraftForge.EVENT_BUS.register(new CropEventBean3());
	MinecraftForge.EVENT_BUS.register(new CropEventBean4());
	MinecraftForge.EVENT_BUS.register(new CropEventPea());
	MinecraftForge.EVENT_BUS.register(new CropEventPea2());
	MinecraftForge.EVENT_BUS.register(new CropEventPea3());
	MinecraftForge.EVENT_BUS.register(new CropEventPea4());
	MinecraftForge.EVENT_BUS.register(new CropEventOats());
	MinecraftForge.EVENT_BUS.register(new CropEventSoy());
	MinecraftForge.EVENT_BUS.register(new CropEventTea());
	MinecraftForge.EVENT_BUS.register(new CropEventCoffee());
	MinecraftForge.EVENT_BUS.register(new CropEventOakTreeCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventBirchTreeCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventSpruceTreeCrop());
	MinecraftForge.EVENT_BUS.register(new CropEventJungleTreeCrop());
	

	//GameRegistry.registerWorldGenerator(WorldGenPlants);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenStrawberry);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenLettuce);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenCorn);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenWeed);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenPepper);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenGrass1);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenGrass2);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenGrass3);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	//GameRegistry.registerWorldGenerator(WorldGenOnion);
		//GameRegistry.registerWorldGenerator(WorldGenGrass1);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
		//GameRegistry.registerWorldGenerator(WorldGenLavender);
		//GameRegistry.registerWorldGenerator(WorldGenParsley);
		//GameRegistry.registerWorldGenerator(WorldGenTobacco);
		//GameRegistry.registerWorldGenerator(WorldGenPeppers);
		//GameRegistry.registerWorldGenerator(WorldGenWalnut);
		
	GameRegistry.registerWorldGenerator(WorldGenTrees);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	GameRegistry.registerWorldGenerator(WorldGenPlants);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
	GameRegistry.registerWorldGenerator(WorldGenSalt);
	
	GameRegistry.registerWorldGenerator(WorldGenTruffle);
	GameRegistry.registerWorldGenerator(WorldGenSeaweed);
	
	GameRegistry.addRecipe(new ItemStack(wetClay, 8), new Object[] {"YYY", "YXY", "YYY", 'Y', new ItemStack(Block.blockClay), 'X', new ItemStack(Item.bucketWater)});
	GameRegistry.addRecipe(new ItemStack(wetClay, 8), new Object[] {"YYY", "YXY", "YYY", 'Y', new ItemStack(Block.blockClay), 'X', new ItemStack(ModFood.cupWater)});

	//GameRegistry.registerWorldGenerator(WorldGenSalt);   // Add this in your @Init method. If you haven't already, import cpw.mods.fml.common.registry.GameRegistry.      
}

@PostInit
public void postInit(FMLPostInitializationEvent event) {
// this is the post initialization.
}
}