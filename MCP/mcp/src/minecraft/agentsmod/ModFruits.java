
package agentsmod;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.stats.Achievement;
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
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ModFruits", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModFruits {
	
	public static final String modid = "ModFruits";

	public static Item strawberrySeed;
	public static Item strawberry;
	public static Item tomatoSeed;
	public static Item tomato;
	public static Item lemon;
	public static Item lemonSeed;
	public static Item orange;
	public static Item orangeSeed;
	public static Item cherry;
	public static Item cherrySeed;
	public static Item lettuceSeed;
	public static Item lettuce;
	public static Item cornSeed;
	public static Item corn;
	public static Item pepperSeed;
	public static Item riceSeed;
	public static Item rice;
	public static Item barleySeed;
	public static Item barley;
	public static Item cottonSeed;
	public static Item cotton;
	public static Item onion;
	public static Item olive;
	public static Item oliveSeed;
	public static Item lavenderSeed;
	public static Item parsleySeed;
	public static Item pepperGreen;
	public static Item pepperYellow;
	public static Item pepperRed;
	public static Item peppersSeed;
	public static Item walnut;
	public static Item walnutHard;
	public static Item walnutHarder;
	public static Item walnutGold;
	public static Item walnutDiamond;
	public static Item grape;
	public static Item grapeSeed;
	public static Item garlic;
	public static Item chicle;
	public static Item chicleSeed;
	public static Item peanut;
	public static Item mint;
	public static Item mintSeed;
	public static Item truffle;
	public static Item truffleWhite;
	public static Item raspberrySeed;
	public static Item raspberry;
	public static Item braspberrySeed;
	public static Item braspberry;
	public static Item blackcurrantSeed;
	public static Item blackcurrant;
	public static Item blueberrySeed;
	public static Item blueberry;
	public static Item hopSeed;
	public static Item hops;
	public static Item grapePurple;
	public static Item grapePurpleSeed;
	public static Item appleGreen;
	public static Item appleGreenSeed;
	public static Item appleRedSeed;
	public static Item beanPod;
	public static Item bean;
	public static Item peaPod;
	public static Item pea;
	public static Item oatsSeed;
	public static Item oats;
	public static Item soyPod;
	public static Item soy;
	public static Item tea;
	public static Item teaDry;
	public static Item teaSeed;
	public static Item coffee;
	public static Item coffeeDry;
	public static Item coffeeCrushed;
	
	public static Item roseSeed;
	public static Item dandelionSeed;
	public static Item oakTreeSeed;
	public static Item birchTreeSeed;
	public static Item spruceTreeSeed;
	public static Item jungleTreeSeed;
	
	public static Item weedSeed;
	public static Item weed;
	public static Item weedDry;
	public static Item weedCrushed;
	public static Item weedPaper;
	public static Item weedInPaper;
	public static Item weedJoint;
	public static Item weedLitJoint;
	
	public static Item tobaccoSeed;
	public static Item tobacco;
	public static Item tobaccoDry;
	public static Item tobaccoCrushed;
	public static Item tobaccoInPaper;
	public static Item tobaccoCigarette;
	public static Item tobaccoLitCigarette;
	public static Item tobaccoCigaretteFilter;
	public static Item tobaccoLitCigaretteFilter;
	public static Item tobaccoCigar;
	public static Item tobaccoLitCigar;
	public static Item filter;
	
	public static Item walnutshell;
	public static Item walnutshellHard;
	public static Item walnutshellHarder;
	public static Item walnutshellGold;
	public static Item walnutshellDiamond;
	public static Item walnutshellCluster;
	public static Item walnutshellClusterHard;
	public static Item walnutshellClusterHarder;
	public static Item walnutshellClusterGold;
	public static Item walnutshellClusterDiamond;
	public static Item walnutshellFire;
	public static Item walnutshellFireCluster;
	public static Item walnutshellElectric;
	public static Item walnutshellElectricCluster;
	public static Item walnutshellBomb;
	public static Item walnutshellBombCluster;
	public static Item walnutshellBigBomb;
	public static Item walnutshellBigBombCluster;
	public static Item walnutshellNuke;
	public static Item walnutshellNukeCluster;
	public static Item walnutshellWB;
	public static Item walnutshellWBCluster;
	
	public static Item fertiliser;
	public static Item ash;
	
	
	
	public static Achievement weedAchieve;
	public static Achievement ashAchieve;
	
	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	// The instance of your mod that Forge uses.
	@Instance("ModFruits")
	public static ModFruits instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		
		
		strawberry = new ItemFruit2(ModConfig.strawberryID, 2, false).setPotionEffect(Potion.regeneration.id, 2, 2, 0.4F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("strawberry");
		LanguageRegistry.addName(strawberry, "Strawberry");
		strawberrySeed = new ItemSeed(ModConfig.strawberrySeedID, ModConfig.strawberryCropID, Block.tilledField.blockID).setUnlocalizedName("strawberrySeed");
		LanguageRegistry.addName(strawberrySeed, "Strawberry Seeds");
		tomato = new ItemFruit2(ModConfig.tomatoID, 2, false).setPotionEffect(Potion.fireResistance.id, 6, 1, 0F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("tomato");
		LanguageRegistry.addName(tomato, "Tomato");
		tomatoSeed = new ItemSeed(ModConfig.tomatoSeedID, ModConfig.tomatoCropID, Block.tilledField.blockID).setUnlocalizedName("tomatoSeed");
		LanguageRegistry.addName(tomatoSeed, "Tomato Seeds");
		lemon = new ItemFruit2(ModConfig.lemonID, 2, false).setPotionEffect(Potion.moveSpeed.id, 6, 2, 1F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("lemon");
		LanguageRegistry.addName(lemon, "Lemon");
		lemonSeed = new ItemSeed(ModConfig.lemonSeedID, ModConfig.lemonCropID, Block.tilledField.blockID).setUnlocalizedName("lemonSeed");
		LanguageRegistry.addName(lemonSeed, "Lemon Seeds");
		orange = new ItemFruit2(ModConfig.orangeID, 3, false).setPotionEffect(Potion.moveSpeed.id, 6, 1, 1F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("orange");
		LanguageRegistry.addName(orange, "Orange");
		orangeSeed = new ItemSeed(ModConfig.orangeSeedID, ModConfig.orangeCropID, Block.tilledField.blockID).setUnlocalizedName("orangeSeed");
		LanguageRegistry.addName(orangeSeed, "Orange Pips");
		cherry = new ItemFruit2(ModConfig.cherryID, 1, false).setPotionEffect(Potion.digSpeed.id, 6, 2, 1F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("cherry");
		LanguageRegistry.addName(cherry, "Cherry");
		cherrySeed = new ItemSeed(ModConfig.cherrySeedID, ModConfig.cherryCropID, Block.tilledField.blockID).setUnlocalizedName("cherrySeed");
		LanguageRegistry.addName(cherrySeed, "Cherry Pips");
		lettuce = new ItemFruit2(ModConfig.lettuceID, 5, false).setPotionEffect(Potion.regeneration.id, 0, 0, 0F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("lettuce");
		LanguageRegistry.addName(lettuce, "Lettuce");
		lettuceSeed = new ItemSeed(ModConfig.lettuceSeedID, ModConfig.lettuceCropID, Block.tilledField.blockID).setUnlocalizedName("lettuceSeed");
		LanguageRegistry.addName(lettuceSeed, "Lettuce Seeds");
		corn = new ItemFruit2(ModConfig.cornID, 3, false).setPotionEffect(Potion.nightVision.id, 6, 1, 0F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("corn");
		LanguageRegistry.addName(corn, "Corn Cob");
		cornSeed = new ItemSeed(ModConfig.cornSeedID, ModConfig.cornCropID, Block.tilledField.blockID).setUnlocalizedName("cornSeed");
		LanguageRegistry.addName(cornSeed, "Corn Kernels");
		pepperSeed = new ItemSeed(ModConfig.pepperSeedID, ModConfig.pepperCropID, Block.tilledField.blockID).setUnlocalizedName("pepperSeed");
		LanguageRegistry.addName(pepperSeed, "Pepper Corns");
		barley = new ItemFruit(ModConfig.barleyID).setUnlocalizedName("barley");
		LanguageRegistry.addName(barley, "Barley");
		barleySeed = new ItemSeed(ModConfig.barleySeedID, ModConfig.barleyCropID, Block.tilledField.blockID).setUnlocalizedName("barleySeed");
		LanguageRegistry.addName(barleySeed, "Barley Seeds");
		rice = new ItemFruit2(ModConfig.riceID, 2, false).setUnlocalizedName("rice");
		LanguageRegistry.addName(rice, "Rice");
		riceSeed = new ItemSeed(ModConfig.riceSeedID, ModConfig.riceCropID, ModConfig.wetClayID).setUnlocalizedName("riceSeed");
		LanguageRegistry.addName(riceSeed, "Rice Seeds");
		cottonSeed = new ItemSeed(ModConfig.cottonSeedID, ModConfig.cottonCropID, Block.tilledField.blockID).setUnlocalizedName("cottonSeed");
		LanguageRegistry.addName(cottonSeed, "Cotton Seeds");
		cotton = new ItemFruit(ModConfig.cottonID).setUnlocalizedName("cotton");
		LanguageRegistry.addName(cotton, "Cotton");
		onion = new ItemSeedFood2(ModConfig.onionID, 3, 0.2F, ModConfig.onionCropID, Block.tilledField.blockID).setPotionEffect(Potion.confusion.id, 10, 1, 1F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("onion");
		LanguageRegistry.addName(onion, "Onion");
		olive = new ItemFruit2(ModConfig.oliveID, 1, 0.1F, false).setPotionEffect(Potion.confusion.id, 8, 1, 1F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("olive");
		LanguageRegistry.addName(olive, "Olive");
		oliveSeed = new ItemSeed(ModConfig.oliveSeedID, ModConfig.oliveCropID, Block.tilledField.blockID).setUnlocalizedName("oliveSeed");
		LanguageRegistry.addName(oliveSeed, "Olive Tree Seeds");
		lavenderSeed = new ItemSeed(ModConfig.lavenderSeedID, ModConfig.lavenderCropID, Block.tilledField.blockID).setUnlocalizedName("lavenderSeed");
		LanguageRegistry.addName(lavenderSeed, "Lavender Seeds");
		parsleySeed = new ItemSeed(ModConfig.parsleySeedID, ModConfig.parsleyCropID, Block.tilledField.blockID).setUnlocalizedName("parsleySeed");
		LanguageRegistry.addName(parsleySeed, "Parsley Seeds");
		walnut = new ItemWalnut(ModConfig.walnutID, 1, 0.2F, ModConfig.walnutCropID, Block.tilledField.blockID).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("walnut");
		LanguageRegistry.addName(walnut, "Walnut");
		walnutHard = new ItemWalnut(ModConfig.walnutHardID, 1, 0.2F, ModConfig.walnutHardCropID, Block.tilledField.blockID).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("walnutHard");
		LanguageRegistry.addName(walnutHard, "Hardened Walnut");
		walnutHarder = new ItemWalnut(ModConfig.walnutHarderID, 1, 0.2F, ModConfig.walnutHarderCropID, Block.tilledField.blockID).setPotionEffect(Potion.resistance.id, 30, 1, 1F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("walnutHarder");
		LanguageRegistry.addName(walnutHarder, "Iron Walnut");
		walnutGold = new ItemWalnut(ModConfig.walnutGoldID, 1, 0.2F, ModConfig.walnutGoldCropID, Block.tilledField.blockID).setPotionEffect(Potion.resistance.id, 45, 2, 1F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("walnutGold");
		LanguageRegistry.addName(walnutGold, "Golden Walnut");
		walnutDiamond = new ItemWalnut(ModConfig.walnutDiamondID, 2, 0.2F, ModConfig.walnutDiamondCropID, Block.tilledField.blockID).setPotionEffect(Potion.resistance.id, 60, 3, 1F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("walnutDiamond");
		LanguageRegistry.addName(walnutDiamond, "Diamond Walnut");
		peanut = new ItemSeedFood2(ModConfig.peanutID, 1, 0.6F, ModConfig.peanutCropID, Block.tilledField.blockID).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("peanut");
		LanguageRegistry.addName(peanut, "Peanut");
		pepperGreen = new ItemFruit2(ModConfig.pepperGreenID, 3, false).setUnlocalizedName("pepperGreen");
		LanguageRegistry.addName(pepperGreen, "Green Bell Pepper");
		pepperYellow = new ItemFruit2(ModConfig.pepperYellowID, 3, false).setUnlocalizedName("pepperYellow");
		LanguageRegistry.addName(pepperYellow, "Yellow Bell Pepper");
		pepperRed = new ItemFruit2(ModConfig.pepperRedID, 4, false).setPotionEffect(Potion.fireResistance.id, 10, 1, 1F).setUnlocalizedName("pepperRed");
		LanguageRegistry.addName(pepperRed, "Red Bell Pepper");
		peppersSeed = new ItemSeed(ModConfig.peppersSeedID, ModConfig.peppersCropID, Block.tilledField.blockID).setUnlocalizedName("peppersSeed");
		LanguageRegistry.addName(peppersSeed, "Bell Pepper Seeds");
		grape = new ItemFruit2(ModConfig.grapeID, 3, 0.0F, false).setUnlocalizedName("grape");
		LanguageRegistry.addName(grape, "Grapes");
		grapeSeed = new ItemFruit(ModConfig.grapeSeedID).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("grapeSeed");
		LanguageRegistry.addName(grapeSeed, "Grape Seeds");
		garlic = new ItemSeedFood2(ModConfig.garlicID, 2, 0.0F, ModConfig.garlicCropID, Block.tilledField.blockID).setPotionEffect(Potion.confusion.id, 12, 1, 1F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("garlic");
		LanguageRegistry.addName(garlic, "Garlic");
		chicle = new ItemFruit2(ModConfig.chicleID, 3, 0.0F, false).setUnlocalizedName("chicle");
		LanguageRegistry.addName(chicle, "Chicle");
		chicleSeed = new ItemSeed(ModConfig.chicleSeedID, ModConfig.chicleCropID, Block.tilledField.blockID).setUnlocalizedName("chicleSeed");
		LanguageRegistry.addName(chicleSeed, "Chicle Tree Seeds");
		mint = new ItemFruit(ModConfig.mintID).setUnlocalizedName("mint");
		LanguageRegistry.addName(mint, "Mint Leaf");
		mintSeed = new ItemSeed(ModConfig.mintSeedID, ModConfig.mintCropID, Block.tilledField.blockID).setUnlocalizedName("mintSeed");
		LanguageRegistry.addName(mintSeed, "Mint Seeds");
		truffle = new ItemFruit2(ModConfig.truffleID, 20, 2.0F, true).setPotionEffect(Potion.jump.id, 600, 1, 1F).setPotionEffect2(Potion.regeneration.id, 300, 3, 0F).setCreativeTab(ModCreativeTabs.tabFood).setUnlocalizedName("truffle");
		LanguageRegistry.addName(truffle, "Black Truffle");
		truffleWhite = new ItemFruit2(ModConfig.truffleWhiteID, 20, 2.0F, true).setPotionEffect(Potion.jump.id, 1200, 1, 1F).setPotionEffect2(Potion.regeneration.id, 600, 3, 0F).setCreativeTab(ModCreativeTabs.tabFood).setUnlocalizedName("truffleWhite");
		LanguageRegistry.addName(truffleWhite, "White Truffle");
		raspberry = new ItemFruit2(ModConfig.raspberryID, 2, false).setPotionEffect(Potion.regeneration.id, 4, 1, 0.3F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("raspberry");
		LanguageRegistry.addName(raspberry, "Raspberry");
		raspberrySeed = new ItemSeed(ModConfig.raspberrySeedID, ModConfig.raspberryCropID, Block.tilledField.blockID).setUnlocalizedName("raspberrySeed");
		LanguageRegistry.addName(raspberrySeed, "Raspberry Seeds");
		braspberry = new ItemFruit2(ModConfig.braspberryID, 2, false).setPotionEffect(Potion.regeneration.id, 4, 1, 0.4F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("braspberry");
		LanguageRegistry.addName(braspberry, "Blue Raspberry");
		braspberrySeed = new ItemSeed(ModConfig.braspberrySeedID, ModConfig.braspberryCropID, Block.tilledField.blockID).setUnlocalizedName("braspberrySeed");
		LanguageRegistry.addName(braspberrySeed, "Blue Raspberry Seeds");
		blackcurrant = new ItemFruit2(ModConfig.blackcurrantID, 1, true).setPotionEffect(Potion.regeneration.id, 3, 0, 0.4F).setPotionEffect2(Potion.moveSpeed.id, 6, 1, 0.8F).setUnlocalizedName("blackcurrant");
		LanguageRegistry.addName(blackcurrant, "Blackcurrant");
		blackcurrantSeed = new ItemSeed(ModConfig.blackcurrantSeedID, ModConfig.blackcurrantCropID, Block.tilledField.blockID).setUnlocalizedName("blackcurrantSeed");
		LanguageRegistry.addName(blackcurrantSeed, "Blackcurrant Seeds");
		blueberry = new ItemFruit2(ModConfig.blueberryID, 1, true).setPotionEffect(Potion.regeneration.id, 3, 0, 0.4F).setPotionEffect2(Potion.digSpeed.id, 6, 1, 0.8F).setUnlocalizedName("blueberry");
		LanguageRegistry.addName(blueberry, "Blueberry");
		blueberrySeed = new ItemSeed(ModConfig.blueberrySeedID, ModConfig.blueberryCropID, Block.tilledField.blockID).setUnlocalizedName("blueberrySeed");
		LanguageRegistry.addName(blueberrySeed, "Blueberry Seeds");
		hops = new ItemFruit(ModConfig.hopsID).setUnlocalizedName("hops");
		LanguageRegistry.addName(hops, "Hops");
		hopSeed = new ItemSeed(ModConfig.hopSeedID, ModConfig.hopsCropID, Block.tilledField.blockID).setUnlocalizedName("hopSeed");
		LanguageRegistry.addName(hopSeed, "Hop Seeds");
		grapePurple = new ItemFruit2(ModConfig.grapePurpleID, 3, 1.0F, false).setUnlocalizedName("grapePurple");
		LanguageRegistry.addName(grapePurple, "Purple Grapes");
		grapePurpleSeed = new ItemFruit(ModConfig.grapePurpleSeedID).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("grapePurpleSeed");
		LanguageRegistry.addName(grapePurpleSeed, "Purple Grape Seeds");
		appleGreen = new ItemFruit2(ModConfig.appleGreenID, 1, false).setPotionEffect(Potion.damageBoost.id, 8, 1, 1F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setUnlocalizedName("appleGreen");
		LanguageRegistry.addName(appleGreen, "Green Apple");
		appleGreenSeed = new ItemSeed(ModConfig.appleGreenSeedID, ModConfig.appleGreenCropID, Block.tilledField.blockID).setUnlocalizedName("appleGreenSeed");
		LanguageRegistry.addName(appleGreenSeed, "Green Apple Pips");
		appleRedSeed = new ItemSeed(ModConfig.appleRedSeedID, ModConfig.appleRedCropID, Block.tilledField.blockID).setUnlocalizedName("appleRedSeed");
		LanguageRegistry.addName(appleRedSeed, "Red Apple Pips");
		beanPod = new ItemFruit(ModConfig.beanPodID).setCreativeTab(ModCreativeTabs.tabFood).setUnlocalizedName("beanPod");
		LanguageRegistry.addName(beanPod, "Bean Pod");
		peaPod = new ItemFruit(ModConfig.peaPodID).setCreativeTab(ModCreativeTabs.tabFood).setUnlocalizedName("peaPod");
		LanguageRegistry.addName(peaPod, "Pea Pod");
		bean = new ItemFruit2(ModConfig.beanID, 0, false).setPotionEffect(Potion.moveSpeed.id, 6, 0, 0.1F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("bean");
		LanguageRegistry.addName(bean, "Bean");
		pea = new ItemFruit2(ModConfig.peaID, 0, false).setPotionEffect(Potion.digSpeed.id, 5, 0, 0.1F).setPotionEffect2(Potion.regeneration.id, 0, 0, 0F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("pea");
		LanguageRegistry.addName(pea, "Pea");
		oats = new ItemFruit(ModConfig.oatsID).setUnlocalizedName("oats");
		LanguageRegistry.addName(oats, "Oats");
		oatsSeed = new ItemSeed(ModConfig.oatsSeedID, ModConfig.oatsCropID, Block.tilledField.blockID).setUnlocalizedName("oatsSeed");
		LanguageRegistry.addName(oatsSeed, "Oat Seeds");
		soyPod = new ItemFruit(ModConfig.soyPodID).setCreativeTab(ModCreativeTabs.tabFood).setUnlocalizedName("soyPod");
		LanguageRegistry.addName(soyPod, "Soy Bean Pod");
		soy = new ItemSeedFood2(ModConfig.soyID, 1, 0.6F, ModConfig.soyCropID, Block.tilledField.blockID).setPotionEffect(Potion.resistance.id, 6, 1, 0.4F).setCreativeTab(ModCreativeTabs.tabPlants).setUnlocalizedName("soy");
		LanguageRegistry.addName(soy, "Soy Bean");
		tea = new ItemFruit(ModConfig.teaID).setUnlocalizedName("tea");
		LanguageRegistry.addName(tea, "Tea Leaf");
		teaSeed = new ItemSeed(ModConfig.teaSeedID, ModConfig.teaCropID, Block.tilledField.blockID).setUnlocalizedName("teaSeed");
		LanguageRegistry.addName(teaSeed, "Tea Seeds");
		teaDry = new ItemFruit(ModConfig.teaDryID).setUnlocalizedName("teaDry");
		LanguageRegistry.addName(teaDry, "Dried Tea Leaf");
		coffee = new ItemSeed(ModConfig.coffeeID, ModConfig.coffeeCropID, Block.tilledField.blockID).setUnlocalizedName("coffee");
		LanguageRegistry.addName(coffee, "Coffee Beans");
		coffeeDry = new ItemFruit(ModConfig.coffeeDryID).setUnlocalizedName("coffeeDry");
		LanguageRegistry.addName(coffeeDry, "Dried Coffee Beans");
		coffeeCrushed = new ItemFruit(ModConfig.coffeeCrushedID).setUnlocalizedName("coffeeCrushed");
		LanguageRegistry.addName(coffeeCrushed, "Ground Coffee");
		
		
		
		roseSeed = new ItemSeed(ModConfig.roseSeedID, ModConfig.roseCropID, Block.tilledField.blockID).setUnlocalizedName("roseSeed");
		LanguageRegistry.addName(roseSeed, "Rose Seeds");
		dandelionSeed = new ItemSeed(ModConfig.dandelionSeedID, ModConfig.dandelionCropID, Block.tilledField.blockID).setUnlocalizedName("dandelionSeed");
		LanguageRegistry.addName(dandelionSeed, "Dandelion Seeds");
		oakTreeSeed = new ItemSeed(ModConfig.oakTreeSeedID, ModConfig.oakTreeCropID, Block.tilledField.blockID).setUnlocalizedName("oakTreeSeed");
		LanguageRegistry.addName(oakTreeSeed, "Acorn");
		birchTreeSeed = new ItemSeed(ModConfig.birchTreeSeedID, ModConfig.birchTreeCropID, Block.tilledField.blockID).setUnlocalizedName("birchTreeSeed");
		LanguageRegistry.addName(birchTreeSeed, "Birch Seeds");
		spruceTreeSeed = new ItemSeed(ModConfig.spruceTreeSeedID, ModConfig.spruceTreeCropID, Block.tilledField.blockID).setUnlocalizedName("spruceTreeSeed");
		LanguageRegistry.addName(spruceTreeSeed, "Pinecone");
		jungleTreeSeed = new ItemSeed(ModConfig.jungleTreeSeedID, ModConfig.jungleTreeCropID, Block.tilledField.blockID).setUnlocalizedName("jungleTreeSeed");
		LanguageRegistry.addName(jungleTreeSeed, "Jungle Tree Seeds");
		
		

		weed = new ItemFruit2(ModConfig.weedID, 1, true).setPotionEffect(Potion.blindness.id, 20, 0, 0.6F).setPotionEffect2(Potion.confusion.id, 30, 6, 1F).setPotionEffect3(Potion.hunger.id, 30, 1, 1F).setPotionEffect4(Potion.regeneration.id, 5, 0, 1F).setUnlocalizedName("weed");
		LanguageRegistry.addName(weed, "Cannabis Leaf");
		weedSeed = new ItemSeed(ModConfig.weedSeedID, ModConfig.weedCropID, Block.tilledField.blockID).setUnlocalizedName("weedSeed");
		LanguageRegistry.addName(weedSeed, "Cannabis Seeds");
		weedDry = new ItemFruit(ModConfig.weedDryID).setUnlocalizedName("weedDry");
		LanguageRegistry.addName(weedDry, "Dried Cannabis Leaf");
		weedCrushed = new ItemFruit(ModConfig.weedCrushedID).setUnlocalizedName("weedCrushed");
		LanguageRegistry.addName(weedCrushed, "Crushed Cannabis Leaves");
		weedPaper = new ItemFruit(ModConfig.weedPaperID).setUnlocalizedName("weedPaper");
		LanguageRegistry.addName(weedPaper, "Smoking Paper");
		weedInPaper = new ItemFruit(ModConfig.weedInPaperID).setUnlocalizedName("weedInPaper");
		LanguageRegistry.addName(weedInPaper, "Smoking Paper (Cannabis)");
		weedJoint = new ItemFruit(ModConfig.weedJointID).setUnlocalizedName("weedJoint");
		LanguageRegistry.addName(weedJoint, "Cannabis Cigarette");
		weedLitJoint = new ItemJoint(ModConfig.weedLitJointID, 1, false).setPotionEffect(Potion.regeneration.id, 10, 0, 1F).setPotionEffect2(Potion.confusion.id, 45, 10, 1F).setPotionEffect3(Potion.moveSlowdown.id, 30, 2, 0.7F).setPotionEffect4(Potion.digSlowdown.id, 35, 3, 1F).setPotionEffect5(Potion.damageBoost.id, 40, 2, 1F).setPotionEffect6(Potion.hunger.id, 40, 2, 0.8F).setUnlocalizedName("weedLitJoint");
		LanguageRegistry.addName(weedLitJoint, "Cannabis Cigarette");
		
		
		
		tobacco = new ItemFruit2(ModConfig.tobaccoID, 1, true).setPotionEffect(Potion.blindness.id, 10, 0, 0.5F).setPotionEffect2(Potion.confusion.id, 20, 6, 1F).setPotionEffect3(Potion.hunger.id, 20, 1, 1F).setPotionEffect4(Potion.regeneration.id, 5, 0, 1F).setUnlocalizedName("tobacco");
		LanguageRegistry.addName(tobacco, "Tobacco Leaf");
		tobaccoSeed = new ItemSeed(ModConfig.tobaccoSeedID, ModConfig.tobaccoCropID, Block.tilledField.blockID).setUnlocalizedName("tobaccoSeed");
		LanguageRegistry.addName(tobaccoSeed, "Tobacco Seeds");
		tobaccoDry = new ItemFruit(ModConfig.tobaccoDryID).setUnlocalizedName("tobaccoDry");
		LanguageRegistry.addName(tobaccoDry, "Dried Tobacco Leaf");
		tobaccoCrushed = new ItemFruit(ModConfig.tobaccoCrushedID).setUnlocalizedName("tobaccoCrushed");
		LanguageRegistry.addName(tobaccoCrushed, "Crushed Tobacco Leaves");
		tobaccoInPaper = new ItemFruit(ModConfig.tobaccoInPaperID).setUnlocalizedName("tobaccoInPaper");
		LanguageRegistry.addName(tobaccoInPaper, "Smoking Paper (Tobacco)");
		tobaccoCigarette = new ItemFruit(ModConfig.tobaccoCigaretteID).setUnlocalizedName("tobaccoCigarette");
		LanguageRegistry.addName(tobaccoCigarette, "Cigarette");
		tobaccoCigaretteFilter = new ItemFruit(ModConfig.tobaccoCigaretteFilterID).setUnlocalizedName("tobaccoCigaretteFilter");
		LanguageRegistry.addName(tobaccoCigaretteFilter, "Cigarette (With Filter)");
		tobaccoLitCigarette = new ItemJoint(ModConfig.tobaccoLitCigaretteID, 0, false).setPotionEffect(Potion.regeneration.id, 6, 1, 1F).setPotionEffect4(Potion.moveSlowdown.id, 30, 2, 1F).setPotionEffect5(Potion.digSlowdown.id, 50, 4, 1F).setPotionEffect2(Potion.damageBoost.id, 22, 3, 1F).setUnlocalizedName("tobaccoLitCigarette");
		LanguageRegistry.addName(tobaccoLitCigarette, "Cigarette");
		tobaccoLitCigaretteFilter = new ItemJoint(ModConfig.tobaccoLitCigaretteFilterID, 0, false).setPotionEffect(Potion.regeneration.id, 8, 1, 1F).setPotionEffect4(Potion.moveSlowdown.id, 20, 2, 1F).setPotionEffect5(Potion.digSlowdown.id, 35, 4, 1F).setPotionEffect2(Potion.damageBoost.id, 24, 3, 1F).setUnlocalizedName("tobaccoLitCigaretteFilter");
		LanguageRegistry.addName(tobaccoLitCigaretteFilter, "Cigarette (With Filter)");
		tobaccoCigar = new ItemFruit(ModConfig.tobaccoCigarID).setUnlocalizedName("tobaccoCigar");
		LanguageRegistry.addName(tobaccoCigar, "Cigar");
		tobaccoLitCigar = new ItemJoint(ModConfig.tobaccoLitCigarID, 2, false).setPotionEffect(Potion.regeneration.id, 20, 1, 1F).setPotionEffect3(Potion.confusion.id, 8, 0, 1F).setPotionEffect4(Potion.moveSlowdown.id, 80, 2, 1F).setPotionEffect5(Potion.digSlowdown.id, 60, 4, 1F).setPotionEffect2(Potion.damageBoost.id, 35, 4, 1F).setUnlocalizedName("tobaccoLitCigar");
		LanguageRegistry.addName(tobaccoLitCigar, "Cigar");
		filter = new ItemFruit(ModConfig.filterID).setUnlocalizedName("filter");
		LanguageRegistry.addName(filter, "Filter Paper");
		
		walnutshell = new ItemWalnutShell(ModConfig.walnutshellID).setUnlocalizedName("walnutshell");
		LanguageRegistry.addName(walnutshell, "Walnut Shell");
		walnutshellCluster = new ItemWalnutShellCluster(ModConfig.walnutshellClusterID).setUnlocalizedName("walnutshellCluster");
		LanguageRegistry.addName(walnutshellCluster, "Walnut Shell Cluster");
		walnutshellHard = new ItemWalnutShellHard(ModConfig.walnutshellHardID).setUnlocalizedName("walnutshellHard");
		LanguageRegistry.addName(walnutshellHard, "Hard Walnut Shell");
		walnutshellClusterHard = new ItemWalnutShellClusterHard(ModConfig.walnutshellClusterHardID).setUnlocalizedName("walnutshellClusterHard");
		LanguageRegistry.addName(walnutshellClusterHard, "Hard Walnut Shell Cluster");
		walnutshellHarder = new ItemWalnutShellHarder(ModConfig.walnutshellHarderID).setUnlocalizedName("walnutshellHarder");
		LanguageRegistry.addName(walnutshellHarder, "Iron Walnut Shell");
		walnutshellClusterHarder = new ItemWalnutShellClusterHarder(ModConfig.walnutshellClusterHarderID).setUnlocalizedName("walnutshellClusterHarder");
		LanguageRegistry.addName(walnutshellClusterHarder, "Iron Walnut Shell Cluster");
		walnutshellGold = new ItemWalnutShellGold(ModConfig.walnutshellGoldID).setUnlocalizedName("walnutshellGold");
		LanguageRegistry.addName(walnutshellGold, "Golden Walnut Shell");
		walnutshellClusterGold = new ItemWalnutShellClusterGold(ModConfig.walnutshellClusterGoldID).setUnlocalizedName("walnutshellClusterGold");
		LanguageRegistry.addName(walnutshellClusterGold, "Golden Walnut Shell Cluster");
		walnutshellDiamond = new ItemWalnutShellDiamond(ModConfig.walnutshellDiamondID).setUnlocalizedName("walnutshellDiamond");
		LanguageRegistry.addName(walnutshellDiamond, "Diamond Walnut Shell");
		walnutshellClusterDiamond = new ItemWalnutShellClusterDiamond(ModConfig.walnutshellClusterDiamondID).setUnlocalizedName("walnutshellClusterDiamond");
		LanguageRegistry.addName(walnutshellClusterDiamond, "Diamond Walnut Shell Cluster");
		walnutshellFire = new ItemWalnutShellFire(ModConfig.walnutshellFireID).setUnlocalizedName("walnutshellFire");
		LanguageRegistry.addName(walnutshellFire, "Inferno Shell");
		walnutshellFireCluster = new ItemWalnutShellFireCluster(ModConfig.walnutshellFireClusterID).setUnlocalizedName("walnutshellFireCluster");
		LanguageRegistry.addName(walnutshellFireCluster, "Inferno Shell Cluster");
		walnutshellElectric = new ItemWalnutShellElectric(ModConfig.walnutshellElectricID).setUnlocalizedName("walnutshellElectric");
		LanguageRegistry.addName(walnutshellElectric, "Electric Shell");
		walnutshellElectricCluster = new ItemWalnutShellElectricCluster(ModConfig.walnutshellElectricClusterID).setUnlocalizedName("walnutshellElectricCluster");
		LanguageRegistry.addName(walnutshellElectricCluster, "Electric Shell Cluster");
		walnutshellBomb = new ItemWalnutShellBomb(ModConfig.walnutshellBombID).setUnlocalizedName("walnutshellBomb");
		LanguageRegistry.addName(walnutshellBomb, "Explosive Walnut Shell");
		walnutshellBombCluster = new ItemWalnutShellBombCluster(ModConfig.walnutshellBombClusterID).setUnlocalizedName("walnutshellBombCluster");
		LanguageRegistry.addName(walnutshellBombCluster, "Explosive Walnut Shell Cluster");
		walnutshellBigBomb = new ItemWalnutShellBigBomb(ModConfig.walnutshellBigBombID).setUnlocalizedName("walnutshellBigBomb");
		LanguageRegistry.addName(walnutshellBigBomb, "Large Explosive Walnut Shell");
		walnutshellBigBombCluster = new ItemWalnutShellBigBombCluster(ModConfig.walnutshellBigBombClusterID).setUnlocalizedName("walnutshellBigBombCluster");
		LanguageRegistry.addName(walnutshellBigBombCluster, "Large Explosive Walnut Shell Cluster");
		walnutshellNuke = new ItemWalnutShellNuke(ModConfig.walnutshellNukeID).setUnlocalizedName("walnutshellNuke");
		LanguageRegistry.addName(walnutshellNuke, "\247eNuclear Walnut Shell");
		walnutshellNukeCluster = new ItemWalnutShellNukeCluster(ModConfig.walnutshellNukeClusterID).setUnlocalizedName("walnutshellNukeCluster");
		LanguageRegistry.addName(walnutshellNukeCluster, "\247eNuclear Walnut Shell Cluster");
		walnutshellWB = new ItemWalnutShellWB(ModConfig.walnutshellWBID).setUnlocalizedName("walnutshellWB");
		LanguageRegistry.addName(walnutshellWB, "\247cCataclysmic Walnut Shell");
		walnutshellWBCluster = new ItemWalnutShellWBCluster(ModConfig.walnutshellWBClusterID).setUnlocalizedName("walnutshellWBCluster");
		LanguageRegistry.addName(walnutshellWBCluster, "\247cCataclysmic Walnut Shell Cluster");
		
		fertiliser = new ItemFertiliser(ModConfig.fertiliserID).setUnlocalizedName("fertiliser");
		LanguageRegistry.addName(fertiliser, "Plant Fertiliser");
		
		ash = new ItemMiscItem2(ModConfig.ashID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("ash");
		LanguageRegistry.addName(ash, "Ash");

		
		

		weedAchieve = (new Achievement(66, "weedAchieve", 9, 9, ModFruits.weed, (Achievement)null)).setIndependent().registerAchievement();
		ashAchieve = (new Achievement(69, "ashAchieve", 10, 10, ModFruits.ash, (Achievement)null)).setIndependent().registerAchievement();
		
	}

	@Init
	public void load (FMLInitializationEvent event)
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.weedCrushed, 1), new Object[]{new ItemStack(ModTools.foodgrinder, 1, WILDCARD_VALUE), new ItemStack(ModFruits.weedDry)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.tobaccoCrushed, 1), new Object[]{new ItemStack(ModTools.foodgrinder, 1, WILDCARD_VALUE), new ItemStack(ModFruits.tobaccoDry)}); 
		
		GameRegistry.addRecipe(new ItemStack(weedPaper, 4), new Object[] {"XXX", 'X', Item.paper});
		GameRegistry.addRecipe(new ItemStack(weedInPaper), new Object[] {"X", "Y", 'X', weedCrushed, 'Y', weedPaper});
		GameRegistry.addRecipe(new ItemStack(weedJoint), new Object[] {"X", 'X', weedInPaper});
		GameRegistry.addShapelessRecipe(new ItemStack(weedLitJoint, 1), new Object[]{new ItemStack(weedJoint), new ItemStack(Item.flintAndSteel, 1, WILDCARD_VALUE)}); 
		GameRegistry.addRecipe(new ItemStack(tobaccoInPaper), new Object[] {"X", "Y", 'X', tobaccoCrushed, 'Y', weedPaper});
		GameRegistry.addRecipe(new ItemStack(tobaccoCigarette), new Object[] {"X", 'X', tobaccoInPaper});
		GameRegistry.addShapelessRecipe(new ItemStack(tobaccoLitCigarette, 1), new Object[]{new ItemStack(tobaccoCigarette), new ItemStack(Item.flintAndSteel, 1, WILDCARD_VALUE)}); 
		GameRegistry.addRecipe(new ItemStack(tobaccoCigaretteFilter), new Object[] {"X", "Y", 'X', tobaccoInPaper, 'Y', filter});
		GameRegistry.addShapelessRecipe(new ItemStack(tobaccoLitCigaretteFilter, 1), new Object[]{new ItemStack(tobaccoCigaretteFilter), new ItemStack(Item.flintAndSteel, 1, WILDCARD_VALUE)}); 
		GameRegistry.addRecipe(new ItemStack(tobaccoCigar), new Object[] {"YYY", "XXX","YYY", 'X', tobaccoCrushed, 'Y', weedPaper});
		GameRegistry.addShapelessRecipe(new ItemStack(tobaccoLitCigar, 1), new Object[]{new ItemStack(tobaccoCigar), new ItemStack(Item.flintAndSteel, 1, WILDCARD_VALUE)}); 
		GameRegistry.addRecipe(new ItemStack(filter, 4), new Object[] {"YYY", "YXY", "YYY", 'X', new ItemStack(Item.dyePowder,1,3), 'Y', Item.paper});
		
		GameRegistry.addSmelting(ModFruits.coffee.itemID, new ItemStack(ModFruits.coffeeDry), 1.6f);
		GameRegistry.addShapelessRecipe(new ItemStack(coffeeCrushed, 1), new Object[]{new ItemStack(coffeeDry), new ItemStack(ModTools.foodgrinder, 1, WILDCARD_VALUE)}); 
		
		GameRegistry.addSmelting(Block.planks.blockID, new ItemStack(ModFruits.ash), 0.4f);
		GameRegistry.addSmelting(ModBlocks.planks.blockID, new ItemStack(ModFruits.ash), 0.4f);
		GameRegistry.addSmelting(Block.woodSingleSlab.blockID, new ItemStack(ModFruits.ash), 0.2f);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.oliveSeed, 1), new Object[]{new ItemStack(ModFruits.olive)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.lemonSeed, 1), new Object[]{new ItemStack(ModFruits.lemon)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.orangeSeed, 1), new Object[]{new ItemStack(ModFruits.orange)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.cherrySeed, 1), new Object[]{new ItemStack(ModFruits.cherry)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.cottonSeed, 1), new Object[]{new ItemStack(ModFruits.cotton)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.cornSeed, 2), new Object[]{new ItemStack(ModFruits.corn)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.strawberrySeed, 1), new Object[]{new ItemStack(ModFruits.strawberry)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.tomatoSeed, 1), new Object[]{new ItemStack(ModFruits.tomato)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.lavenderSeed, 1), new Object[]{new ItemStack(ModCrops.lavenderPlant)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.parsleySeed, 1), new Object[]{new ItemStack(ModCrops.parsleyPlant)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.peppersSeed, 1), new Object[]{new ItemStack(ModFruits.pepperGreen)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.peppersSeed, 1), new Object[]{new ItemStack(ModFruits.pepperYellow)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.peppersSeed, 1), new Object[]{new ItemStack(ModFruits.pepperRed)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.grapeSeed, 1), new Object[]{new ItemStack(ModFruits.grape)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.chicleSeed, 1), new Object[]{new ItemStack(ModFruits.chicle)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.raspberrySeed, 1), new Object[]{new ItemStack(ModFruits.raspberry)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.braspberrySeed, 1), new Object[]{new ItemStack(ModFruits.braspberry)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.blackcurrantSeed, 1), new Object[]{new ItemStack(ModFruits.blackcurrant)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.blueberrySeed, 1), new Object[]{new ItemStack(ModFruits.blueberry)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.grapePurpleSeed, 1), new Object[]{new ItemStack(ModFruits.grapePurple)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.appleRedSeed, 1), new Object[]{new ItemStack(Item.appleRed)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.appleGreenSeed, 1), new Object[]{new ItemStack(ModFruits.appleGreen)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.pea, 6), new Object[]{new ItemStack(ModFruits.peaPod)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.bean, 4), new Object[]{new ItemStack(ModFruits.beanPod)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.soy, 3), new Object[]{new ItemStack(ModFruits.soyPod)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshell, 1), new Object[]{new ItemStack(ModFruits.walnut)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellHard, 1), new Object[]{new ItemStack(ModFruits.walnutshell), new ItemStack(Item.slimeBall)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellHarder, 1), new Object[]{new ItemStack(ModFruits.walnutHarder)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellGold, 1), new Object[]{new ItemStack(ModFruits.walnutGold)});	
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellDiamond, 1), new Object[]{new ItemStack(ModFruits.walnutDiamond)});	
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellHard, 1), new Object[]{new ItemStack(ModFruits.walnutHard)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellCluster, 1), new Object[]{new ItemStack(ModFruits.walnutshell), new ItemStack(ModFruits.walnutshell), new ItemStack(ModFruits.walnutshell)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellClusterHard, 1), new Object[]{new ItemStack(ModFruits.walnutshellHard), new ItemStack(ModFruits.walnutshellHard), new ItemStack(ModFruits.walnutshellHard)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellClusterHarder, 1), new Object[]{new ItemStack(ModFruits.walnutshellHarder), new ItemStack(ModFruits.walnutshellHarder), new ItemStack(ModFruits.walnutshellHarder)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellClusterGold, 1), new Object[]{new ItemStack(ModFruits.walnutshellGold), new ItemStack(ModFruits.walnutshellGold), new ItemStack(ModFruits.walnutshellGold)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellClusterDiamond, 1), new Object[]{new ItemStack(ModFruits.walnutshellDiamond), new ItemStack(ModFruits.walnutshellDiamond), new ItemStack(ModFruits.walnutshellDiamond)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellFire, 1), new Object[]{new ItemStack(ModFruits.walnutshellHard), new ItemStack(Item.fireballCharge)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellFireCluster, 1), new Object[]{new ItemStack(ModFruits.walnutshellFire), new ItemStack(ModFruits.walnutshellFire), new ItemStack(ModFruits.walnutshellFire)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellElectric, 1), new Object[]{new ItemStack(ModFruits.walnutshellHard), new ItemStack(Item.redstone), new ItemStack(Item.redstone), new ItemStack(Item.redstone), new ItemStack(Item.ingotIron)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellElectricCluster, 1), new Object[]{new ItemStack(ModFruits.walnutshellElectric), new ItemStack(ModFruits.walnutshellElectric), new ItemStack(ModFruits.walnutshellElectric)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellBomb, 1), new Object[]{new ItemStack(ModFruits.walnutshellHard), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellBombCluster, 1), new Object[]{new ItemStack(ModFruits.walnutshellBomb), new ItemStack(ModFruits.walnutshellBomb), new ItemStack(ModFruits.walnutshellBomb)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellBigBomb, 1), new Object[]{new ItemStack(ModFruits.walnutshellBomb), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt), new ItemStack(Block.tnt)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellBigBombCluster, 1), new Object[]{new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellNuke, 1), new Object[]{new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(Block.tnt), new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb), new ItemStack(ModFruits.walnutshellBigBomb)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellNukeCluster, 1), new Object[]{new ItemStack(ModFruits.walnutshellNuke), new ItemStack(ModFruits.walnutshellNuke), new ItemStack(ModFruits.walnutshellNuke)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellWB, 1), new Object[]{new ItemStack(ModFruits.walnutshellNuke), new ItemStack(ModFruits.walnutshellNuke), new ItemStack(ModFruits.walnutshellNuke), new ItemStack(ModFruits.walnutshellNuke)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.walnutshellWBCluster, 1), new Object[]{new ItemStack(ModFruits.walnutshellWB), new ItemStack(ModFruits.walnutshellWB), new ItemStack(ModFruits.walnutshellWB)});
		
        Item.flintAndSteel.setContainerItem(Item.flintAndSteel);
        
        GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.grape, 1), new Object[]{new ItemStack(Block.vine,9)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.fertiliser, 2), new Object[]{new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.dyePowder, 1, 15),  new ItemStack(ModFruits.ash),  new ItemStack(ModFruits.ash)});
		
		addAchievementLocalizations();
	}
	
	public void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	public void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}

	public void addAchievementLocalizations()
	{
		addAchievementName("ashAchieve", "Gotta Ketch'um All");
		addAchievementDesc("ashAchieve", "Make Ash");
		addAchievementName("weedAchieve", "Higher than the Empire State");
		addAchievementDesc("weedAchieve", "I was gonna clean mah room, but then I got high!");
	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// this is the post initialization.
	}

}