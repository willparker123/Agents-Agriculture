package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.EnumHelper;
import net.minecraft.potion.Potion;
import net.minecraft.src.*;
import net.minecraft.stats.Achievement;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.*;
import net.minecraftforge.*;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="ModTools", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModTools {

	public static final String modid = "ModTools";
	
	public static  Item baseballbat;
	
	public static  Item pironsword;
	public static  Item pgoldsword;
	public static  Item pstonesword;
	public static  Item pwoodsword;
	public static  Item pdiamondsword;
	
	public static  Item watch;
	public static  Item chain;
	
	public static  Item analyser;
	public static  Item scrollBarley;
	public static  Item scrollBlackcurrant;
	public static  Item scrollBlueberry;
	public static  Item scrollBRaspberry;
	public static  Item scrollCherry;
	public static  Item scrollChicle;
	public static  Item scrollCorn;
	public static  Item scrollCotton;
	public static  Item scrollCarrot;
	public static  Item scrollDandelion;
	public static  Item scrollGarlic;
	public static  Item scrollGrape;
	public static  Item scrollHops;
	public static  Item scrollLavender;
	public static  Item scrollLemon;
	public static  Item scrollLettuce;
	public static  Item scrollMint;
	public static  Item scrollMelon;
	public static  Item scrollOlive;
	public static  Item scrollOnion;
	public static  Item scrollOrange;
	public static  Item scrollOats;
	public static  Item scrollParsley;
	public static  Item scrollPeanut;
	public static  Item scrollPepper;
	public static  Item scrollPeppers;
	public static  Item scrollPumpkin;
	public static  Item scrollPotato;
	public static  Item scrollRaspberry;
	public static  Item scrollRice;
	public static  Item scrollRose;
	public static  Item scrollStrawberry;
	public static  Item scrollTobacco;
	public static  Item scrollTomato;
	public static  Item scrollWalnut;
	public static  Item scrollWalnutHard;
	public static  Item scrollWalnutHarder;
	public static  Item scrollWalnutGold;
	public static  Item scrollWalnutDiamond;
	public static  Item scrollWeed;
	public static  Item scrollWheat;
	public static  Item scrollApple;
	public static  Item scrollPea;
	public static  Item scrollBean;
	public static  Item scrollSoy;
	public static  Item scrollTea;
	public static  Item scrollCoffee;
	
	public static  Item moneyone;
	public static  Item moneytwo;
	public static  Item moneythree;
	public static  Item moneyfour;
	public static  Item moneyfive;
	public static  Item moneysix;
	public static  Item moneyseven;
	public static  Item moneyeight;
	public static  Item moneynine;
	public static  Item moneyten;
	public static  Item moneyeleven;
	public static  Item moneytwelve;
	public static  Item moneythirteen;
	
	public static Item poison;
	public static Item scorpiontail;
	public static Item wolffur;
	public static Item mammothfur;
	public static Item stonecog;
	public static Item woodcog;
	public static Item grindingmech;
	public static Item core;
	public static Item core2;
	public static Item tusk;
	public static Item whalefat;
	public static Item oilseed;
	public static Item oilolive;
	public static Item oilwhale;
	public static Item oilfish;
	
	public static Item potionhunger;
	public static Item potionhungerLong;
	public static Item potionhungerStrong;
	public static Item potionvenomLong;
	public static Item potionvenomStrong;

	public static Item knife;
	public static Item whisk;
	public static Item foodgrinder;
	public static Item destalker;
	public static Item cheesemold;
	public static Item cheesemoldFilled;
	public static Item cheesemoldSet;
	
	public static Item sack;
	public static Item sackWeed;
	public static Item sackTobacco;
	public static Item sackYeast;
	public static Item sackGrapes;
	public static Item sackHops;
	public static Item sackBarleyGrain;
	public static Item sackBarleyMalt;
	public static Item sackPotato;
	public static Item sackbig;
	public static Item sackbigWeed;
	public static Item sackbigTobacco;
	public static Item sackbigYeast;
	public static Item sackbigGrapes;
	public static Item sackbigHops;
	public static Item sackbigBarleyGrain;
	public static Item sackbigBarleyMalt;
	public static Item sackbigPotato;
	public static Item sackSugar;
	public static Item sackbigSugar;
	public static Item sackApples;
	public static Item sackbigApples;
	public static Item sackEggs;
	public static Item sackbigEggs;
	public static Item sackPurpleGrapes;
	public static Item sackbigPurpleGrapes;
	public static Item sackOnion;
	public static Item sackbigOnion;
	public static Item sackTea;
	public static Item sackbigTea;
	public static Item sackTeaDry;
	public static Item sackbigTeaDry;
	
	public static Item cloth;
	public static Item clothRough;
	public static Item silk;
	public static Item fabric;
	public static Item tailorItem;
	public static  Item millstoneItem;
	
	
	
	
	public static Achievement pbjtAchieve;
	
	
	
	static EnumToolMaterial CHEF = EnumHelper.addToolMaterial("CHEF", 1, 50, 5.3F, 1, 0);
	static EnumToolMaterial GRINDER = EnumHelper.addToolMaterial("GRINDER", 0, 50, 0.2F, 0, 0);
	static EnumToolMaterial TAIL = EnumHelper.addToolMaterial("TAIL", 0, 1, 0.0F, 6, 14);
	static EnumToolMaterial BASEBALL = EnumHelper.addToolMaterial("BASEBALL", 0, 4, 0.0F, 10, 10);
	
	
	// The instance of your mod that Forge uses.
	@Instance("ModTools")
	public static ModTools instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup


	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{


		baseballbat = (new ItemBaseballBat(ModConfig.baseballbatID)).setUnlocalizedName("baseballbat");
		
		chain = new ItemTool2(ModConfig.chainID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("chain");
		LanguageRegistry.instance().addName(chain, "Iron Chain");
		
		watch = new ItemWatch(ModConfig.watchID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("watch");
		LanguageRegistry.instance().addName(watch, "\2475Hypnotising Watch");
		
		analyser = new ItemAnalyser(ModConfig.analyserID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("analyser");
		LanguageRegistry.instance().addName(analyser, "\247eSeed Analyser");
		
		scrollBarley = new ItemScrollBarley(ModConfig.scrollBarleyID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollBarley");
		LanguageRegistry.instance().addName(scrollBarley, "Fact File (Barley)");
		scrollBlackcurrant = new ItemScrollBlackcurrant(ModConfig.scrollBlackcurrantID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollBlackcurrant");
		LanguageRegistry.instance().addName(scrollBlackcurrant, "Fact File (Blackcurrant)");
		scrollBlueberry = new ItemScrollBlueberry(ModConfig.scrollBlueberryID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollBlueberry");
		LanguageRegistry.instance().addName(scrollBlueberry, "Fact File (Blueberry)");
		scrollBRaspberry = new ItemScrollBRaspberry(ModConfig.scrollBRaspberryID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollBRaspberry");
		LanguageRegistry.instance().addName(scrollBRaspberry, "Fact File (Blue Raspberry)");
		scrollCherry = new ItemScrollCherry(ModConfig.scrollCherryID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollCherry");
		LanguageRegistry.instance().addName(scrollCherry, "Fact File (Cherry)");
		scrollChicle = new ItemScrollChicle(ModConfig.scrollChicleID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollChicle");
		LanguageRegistry.instance().addName(scrollChicle, "Fact File (Chicle)");
		scrollLemon = new ItemScrollLemon(ModConfig.scrollLemonID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollLemon");
		LanguageRegistry.instance().addName(scrollLemon, "Fact File (Lemon)");
		scrollOlive = new ItemScrollOlive(ModConfig.scrollOliveID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollOlive");
		LanguageRegistry.instance().addName(scrollOlive, "Fact File (Olive)");
		scrollOrange = new ItemScrollOrange(ModConfig.scrollOrangeID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollOrange");
		LanguageRegistry.instance().addName(scrollOrange, "Fact File (Orange)");
		scrollCorn = new ItemScrollCorn(ModConfig.scrollCornID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollCorn");
		LanguageRegistry.instance().addName(scrollCorn, "Fact File (Corn)");
		scrollCotton = new ItemScrollCotton(ModConfig.scrollCottonID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollCotton");
		LanguageRegistry.instance().addName(scrollCotton, "Fact File (Cotton)");
		scrollDandelion = new ItemScrollDandelion(ModConfig.scrollDandelionID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollDandelion");
		LanguageRegistry.instance().addName(scrollDandelion, "Fact File (Dandelion)");
		scrollGarlic = new ItemScrollGarlic(ModConfig.scrollGarlicID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollGarlic");
		LanguageRegistry.instance().addName(scrollGarlic, "Fact File (Garlic)");
		scrollGrape = new ItemScrollGrape(ModConfig.scrollGrapeID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollGrape");
		LanguageRegistry.instance().addName(scrollGrape, "Fact File (Grape)");
		scrollHops = new ItemScrollHops(ModConfig.scrollHopsID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollHops");
		LanguageRegistry.instance().addName(scrollHops, "Fact File (Hops)");
		scrollLavender = new ItemScrollLavender(ModConfig.scrollLavenderID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollLavender");
		LanguageRegistry.instance().addName(scrollLavender, "Fact File (Lavender)");
		scrollLettuce = new ItemScrollLettuce(ModConfig.scrollLettuceID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollLettuce");
		LanguageRegistry.instance().addName(scrollLettuce, "Fact File (Lettuce)");
		scrollMint = new ItemScrollMint(ModConfig.scrollMintID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollMint");
		LanguageRegistry.instance().addName(scrollMint, "Fact File (Mint)");
		scrollOnion = new ItemScrollOnion(ModConfig.scrollOnionID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollOnion");
		LanguageRegistry.instance().addName(scrollOnion, "Fact File (Onion)");
		scrollParsley = new ItemScrollParsley(ModConfig.scrollParsleyID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollParsley");
		LanguageRegistry.instance().addName(scrollParsley, "Fact File (Parsley)");
		scrollPeanut = new ItemScrollPeanut(ModConfig.scrollPeanutID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollPeanut");
		LanguageRegistry.instance().addName(scrollPeanut, "Fact File (Peanut)");
		scrollPepper = new ItemScrollPepper(ModConfig.scrollPepperID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollPepper");
		LanguageRegistry.instance().addName(scrollPepper, "Fact File (Pepper)");
		scrollPeppers = new ItemScrollPeppers(ModConfig.scrollPeppersID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollPeppers");
		LanguageRegistry.instance().addName(scrollPeppers, "Fact File (Bell Peppers)");
		scrollRaspberry = new ItemScrollRaspberry(ModConfig.scrollRaspberryID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollRaspberry");
		LanguageRegistry.instance().addName(scrollRaspberry, "Fact File (Raspberry)");
		scrollRice = new ItemScrollRice(ModConfig.scrollRiceID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollRice");
		LanguageRegistry.instance().addName(scrollRice, "Fact File (Rice)");
		scrollRose = new ItemScrollRose(ModConfig.scrollRoseID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollRose");
		LanguageRegistry.instance().addName(scrollRose, "Fact File (Rose)");
		scrollStrawberry = new ItemScrollStrawberry(ModConfig.scrollStrawberryID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollStrawberry");
		LanguageRegistry.instance().addName(scrollStrawberry, "Fact File (Strawberry)");
		scrollTobacco = new ItemScrollTobacco(ModConfig.scrollTobaccoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollTobacco");
		LanguageRegistry.instance().addName(scrollTobacco, "Fact File (Tobacco)");
		scrollTomato = new ItemScrollTomato(ModConfig.scrollTomatoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollTomato");
		LanguageRegistry.instance().addName(scrollTomato, "Fact File (Tomato)");
		scrollWalnut = new ItemScrollWalnut(ModConfig.scrollWalnutID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollWalnut");
		LanguageRegistry.instance().addName(scrollWalnut, "Fact File (Walnut)");
		scrollWalnutHard = new ItemScrollWalnutHard(ModConfig.scrollWalnutHardID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollWalnutHard");
		LanguageRegistry.instance().addName(scrollWalnutHard, "Fact File (Hardened Walnut)");
		scrollWalnutHarder = new ItemScrollWalnutHarder(ModConfig.scrollWalnutHarderID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollWalnutHarder");
		LanguageRegistry.instance().addName(scrollWalnutHarder, "Fact File (Iron Walnut)");
		scrollWalnutGold = new ItemScrollWalnutGold(ModConfig.scrollWalnutGoldID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollWalnutGold");
		LanguageRegistry.instance().addName(scrollWalnutGold, "Fact File (Golden Walnut)");
		scrollWalnutDiamond = new ItemScrollWalnutDiamond(ModConfig.scrollWalnutDiamondID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollWalnutDiamond");
		LanguageRegistry.instance().addName(scrollWalnutDiamond, "Fact File (Diamond Walnut)");
		scrollWeed = new ItemScrollWeed(ModConfig.scrollWeedID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollWeed");
		LanguageRegistry.instance().addName(scrollWeed, "Fact File (Cannabis)");
		scrollWheat = new ItemScrollWheat(ModConfig.scrollWheatID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollWheat");
		LanguageRegistry.instance().addName(scrollWheat, "Fact File (Wheat)");
		scrollCarrot = new ItemScrollCarrot(ModConfig.scrollCarrotID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollCarrot");
		LanguageRegistry.instance().addName(scrollCarrot, "Fact File (Carrot)");
		scrollPotato = new ItemScrollPotato(ModConfig.scrollPotatoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollPotato");
		LanguageRegistry.instance().addName(scrollPotato, "Fact File (Potato)");
		scrollMelon = new ItemScrollMelon(ModConfig.scrollMelonID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollMelon");
		LanguageRegistry.instance().addName(scrollMelon, "Fact File (Melon)");
		scrollPumpkin = new ItemScrollPumpkin(ModConfig.scrollPumpkinID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollPumpkin");
		LanguageRegistry.instance().addName(scrollPumpkin, "Fact File (Pumpkin)");
		scrollApple = new ItemScrollApple(ModConfig.scrollAppleID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollApple");
		LanguageRegistry.instance().addName(scrollApple, "Fact File (Apple)");
		scrollBean = new ItemScrollBean(ModConfig.scrollBeanID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollBean");
		LanguageRegistry.instance().addName(scrollBean, "Fact File (Bean)");
		scrollPea = new ItemScrollPea(ModConfig.scrollPeaID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollPea");
		LanguageRegistry.instance().addName(scrollPea, "Fact File (Pea)");
		scrollOats = new ItemScrollOats(ModConfig.scrollOatsID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollOats");
		LanguageRegistry.instance().addName(scrollOats, "Fact File (Oats)");
		scrollSoy = new ItemScrollSoy(ModConfig.scrollSoyID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollSoy");
		LanguageRegistry.instance().addName(scrollSoy, "Fact File (Soy Bean)");
		scrollTea = new ItemScrollTea(ModConfig.scrollTeaID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollTea");
		LanguageRegistry.instance().addName(scrollTea, "Fact File (Tea)");
		scrollCoffee = new ItemScrollCoffee(ModConfig.scrollCoffeeID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("scrollCoffee");
		LanguageRegistry.instance().addName(scrollCoffee, "Fact File (Coffee)");
		
		
		
pironsword = (new ItemPoisonSword(ModConfig.pironswordID, EnumToolMaterial.IRON)).setUnlocalizedName("pironsword");
		pgoldsword = (new ItemPoisonSword(ModConfig.pgoldswordID, EnumToolMaterial.GOLD)).setUnlocalizedName("pgoldsword");
		pdiamondsword = (new ItemPoisonSword(ModConfig.pdiamondswordID, EnumToolMaterial.EMERALD)).setUnlocalizedName("pdiamondsword");
		pstonesword = (new ItemPoisonSword(ModConfig.pstoneswordID, EnumToolMaterial.STONE)).setUnlocalizedName("pstonesword");
		pwoodsword = (new ItemPoisonSword(ModConfig.pwoodswordID, EnumToolMaterial.WOOD)).setUnlocalizedName("pwoodsword");
		
		moneyone = new ItemTool2(ModConfig.moneyoneID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneyone");
		LanguageRegistry.instance().addName(moneyone, "$1 Coin");
		moneytwo = new ItemTool2(ModConfig.moneytwoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneytwo");
		LanguageRegistry.instance().addName(moneytwo, "$5 Coin");
		moneythree = new ItemTool2(ModConfig.moneythreeID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneythree");
		LanguageRegistry.instance().addName(moneythree, "$10 Coin");
		moneyfour = new ItemTool2(ModConfig.moneyfourID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneyfour");
		LanguageRegistry.instance().addName(moneyfour, "$50 Coin");
		moneyfive = new ItemTool2(ModConfig.moneyfiveID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneyfive");
		LanguageRegistry.instance().addName(moneyfive, "$100 Coin");
		moneysix = new ItemTool2(ModConfig.moneysixID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneysix");
		LanguageRegistry.instance().addName(moneysix, "$500 Bill");
		moneyseven = new ItemTool2(ModConfig.moneysevenID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneyseven");
		LanguageRegistry.instance().addName(moneyseven, "$1,000 Bill");
		moneyeight = new ItemTool2(ModConfig.moneyeightID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneyeight");
		LanguageRegistry.instance().addName(moneyeight, "$5,000 Bill");
		moneynine = new ItemTool2(ModConfig.moneynineID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneynine");
		LanguageRegistry.instance().addName(moneynine, "$10,000 Bill");
		moneyten = new ItemTool2(ModConfig.moneytenID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneyten");
		LanguageRegistry.instance().addName(moneyten, "$50,000 Bill");
		moneyeleven = new ItemTool2(ModConfig.moneyelevenID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneyeleven");
		LanguageRegistry.instance().addName(moneyeleven, "$100,000 Bill");
		moneytwelve = new ItemTool2(ModConfig.moneytwelveID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneytwelve");
		LanguageRegistry.instance().addName(moneytwelve, "$500,000 Bill");
		moneythirteen = new ItemTool2(ModConfig.moneythirteenID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("moneythirteen");
		LanguageRegistry.instance().addName(moneythirteen, "$1,000,000 Bill");
		
		sack = new ItemMiscItem(ModConfig.sackID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sack");
		sackGrapes = new ItemMiscItem(ModConfig.sackGrapesID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackGrapes").setContainerItem(sack);
		sackYeast = new ItemMiscItem(ModConfig.sackYeastID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackYeast").setContainerItem(sack);
		sackHops = new ItemMiscItem(ModConfig.sackHopsID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackHops").setContainerItem(sack);
		sackBarleyGrain = new ItemMiscItem(ModConfig.sackBarleyGrainID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackBarleyGrain").setContainerItem(sack);
		sackBarleyMalt = new ItemMiscItem(ModConfig.sackBarleyMaltID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackBarleyMalt").setContainerItem(sack);
		sackWeed = new ItemMiscItem(ModConfig.sackWeedID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackWeed").setContainerItem(sack);
		sackTobacco = new ItemMiscItem(ModConfig.sackTobaccoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackTobacco").setContainerItem(sack);
		sackPotato = new ItemMiscItem(ModConfig.sackPotatoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackPotato").setContainerItem(sack);
		sackbig = new ItemMiscItem(ModConfig.sackbigID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbig");
		sackbigGrapes = new ItemMiscItem(ModConfig.sackbigGrapesID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigGrapes").setContainerItem(sackbig);
		sackbigYeast = new ItemMiscItem(ModConfig.sackbigYeastID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigYeast").setContainerItem(sackbig);
		sackbigHops = new ItemMiscItem(ModConfig.sackbigHopsID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigHops").setContainerItem(sackbig);
		sackbigBarleyGrain = new ItemMiscItem(ModConfig.sackbigBarleyGrainID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigBarleyGrain").setContainerItem(sackbig);
		sackbigBarleyMalt = new ItemMiscItem(ModConfig.sackbigBarleyMaltID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigBarleyMalt").setContainerItem(sackbig);
		sackbigWeed = new ItemMiscItem(ModConfig.sackbigWeedID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigWeed").setContainerItem(sackbig);
		sackbigTobacco = new ItemMiscItem(ModConfig.sackbigTobaccoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigTobacco").setContainerItem(sackbig);
		sackbigPotato = new ItemMiscItem(ModConfig.sackbigPotatoID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigPotato").setContainerItem(sack);
		sackSugar = new ItemMiscItem(ModConfig.sackSugarID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackSugar").setContainerItem(sack);
		sackbigSugar = new ItemMiscItem(ModConfig.sackbigSugarID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigSugar").setContainerItem(sackbig);
		sackApples = new ItemMiscItem(ModConfig.sackApplesID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackApples").setContainerItem(sack);
		sackbigApples = new ItemMiscItem(ModConfig.sackbigApplesID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigApples").setContainerItem(sackbig);
		sackEggs = new ItemMiscItem(ModConfig.sackEggsID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackEggs").setContainerItem(sack);
		sackbigEggs = new ItemMiscItem(ModConfig.sackbigEggsID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigEggs").setContainerItem(sackbig);
		sackPurpleGrapes = new ItemMiscItem(ModConfig.sackPurpleGrapesID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackPurpleGrapes").setContainerItem(sack);
		sackbigPurpleGrapes = new ItemMiscItem(ModConfig.sackbigPurpleGrapesID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigPurpleGrapes").setContainerItem(sackbig);
		sackOnion = new ItemMiscItem(ModConfig.sackOnionID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackOnion").setContainerItem(sack);
		sackbigOnion = new ItemMiscItem(ModConfig.sackbigOnionID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigOnion").setContainerItem(sackbig);
		sackTea = new ItemMiscItem(ModConfig.sackTeaID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackTea").setContainerItem(sack);
		sackbigTea = new ItemMiscItem(ModConfig.sackbigTeaID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigTea").setContainerItem(sackbig);
		sackTeaDry = new ItemMiscItem(ModConfig.sackTeaDryID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackTeaDry").setContainerItem(sack);
		sackbigTeaDry = new ItemMiscItem(ModConfig.sackbigTeaDryID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("sackbigTeaDry").setContainerItem(sackbig);
		
		scorpiontail = (new ItemScorpionTail(ModConfig.scorpiontailID)).setUnlocalizedName("scorpiontail").setCreativeTab(ModCreativeTabs.tabOther);
		poison = (new ItemDrink(ModConfig.poisonID, 0, true)).setPotionEffect(Potion.poison.id, 60, 5, 1F).setPotionEffect2(Potion.poison.id, 60, 5, 1F).setUnlocalizedName("poison").setCreativeTab(CreativeTabs.tabBrewing);
		wolffur = new ItemMiscItem(ModConfig.wolffurID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("wolffur");
		mammothfur = new ItemMiscItem(ModConfig.mammothfurID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("mammothfur");
		stonecog = new ItemMiscItem(ModConfig.stonecogID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("stonecog");
		woodcog = new ItemMiscItem(ModConfig.woodcogID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("woodcog");
		grindingmech = new ItemMiscItem(ModConfig.grindingmechID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("grindingmech");
		core = new ItemMiscItem(ModConfig.coreID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("core");
		core2 = new ItemMiscItem(ModConfig.core2ID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("core2");
		tusk = new ItemMiscItem(ModConfig.tuskID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("tusk");
		whalefat = new ItemMiscItem(ModConfig.whalefatID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("whalefat");
		oilseed = new ItemMiscItem(ModConfig.oilseedID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("oilseed");
		oilolive = new ItemMiscItem(ModConfig.oiloliveID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("oilolive");
		oilwhale = new ItemMiscItem(ModConfig.oilwhaleID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("oilwhale");
		oilfish = new ItemMiscItem(ModConfig.oilfishID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("oilfish");

		potionhunger = (new ItemPotionGlowing(ModConfig.potionhungerID, 0, true)).setPotionEffect(Potion.hunger.id, 60, 2, 1F).setPotionEffect2(Potion.poison.id, 0, 0, 0F).setUnlocalizedName("potionhunger").setCreativeTab(CreativeTabs.tabBrewing);
		potionhungerLong = (new ItemPotionGlowing(ModConfig.potionhungerLongID, 0, true)).setPotionEffect(Potion.hunger.id, 180, 2, 1F).setPotionEffect2(Potion.poison.id, 0, 0, 1F).setUnlocalizedName("potionhungerLong").setCreativeTab(CreativeTabs.tabBrewing);
		potionhungerStrong = (new ItemPotionGlowing(ModConfig.potionhungerStrongID, 0, true)).setPotionEffect(Potion.hunger.id, 60, 6, 1F).setPotionEffect2(Potion.poison.id, 0, 0, 1F).setUnlocalizedName("potionhungerStrong").setCreativeTab(CreativeTabs.tabBrewing);
		potionvenomLong = (new ItemPotionGlowing(ModConfig.potionvenomLongID, 0, true)).setPotionEffect(Potion.poison.id, 180, 5, 1F).setPotionEffect2(Potion.poison.id, 0, 0, 1F).setUnlocalizedName("potionvenomLong").setCreativeTab(CreativeTabs.tabBrewing);
		potionvenomStrong = (new ItemPotionGlowing(ModConfig.potionvenomStrongID, 0, true)).setPotionEffect(Potion.poison.id, 60, 8, 1F).setPotionEffect2(Potion.poison.id, 0, 0, 1F).setUnlocalizedName("potionvenomStrong").setCreativeTab(CreativeTabs.tabBrewing);
		
		knife = new ItemKnife(ModConfig.knifeID).setUnlocalizedName("knife");
		whisk = new ItemWhisk(ModConfig.whiskID).setUnlocalizedName("whisk");
		foodgrinder = new ItemFoodGrinder(ModConfig.foodgrinderID).setUnlocalizedName("foodgrinder");
		destalker = new ItemDestalker(ModConfig.destalkerID).setUnlocalizedName("destalker");
		cheesemold = new ItemCheeseMold(ModConfig.cheesemoldID).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("cheesemold");
		cheesemoldFilled = new ItemCheeseMoldFilled(ModConfig.cheesemoldFilledID).setCreativeTab(ModCreativeTabs.tabFood).setUnlocalizedName("cheesemoldFilled");
		cheesemoldSet = new ItemCheeseMoldSet(ModConfig.cheesemoldSetID).setCreativeTab(ModCreativeTabs.tabFood).setUnlocalizedName("cheesemoldSet");

		cloth = new ItemMiscItem(ModConfig.clothID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("cloth");
		clothRough = new ItemMiscItem(ModConfig.clothRoughID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("clothRough");
		fabric = new ItemMiscItem(ModConfig.fabricID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("fabric");
		silk = new ItemMiscItem(ModConfig.silkID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("silk");
		tailorItem = new ItemMiscItem(ModConfig.tailorItemID).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("tailorItem");
		millstoneItem = new ItemMiscItem(ModConfig.millstoneItemID).setCreativeTab(ModCreativeTabs.tabOther).setUnlocalizedName("millstoneItem");
		
		
		
		LanguageRegistry.addName(pironsword, "Iron Sword \2472(Poisoned)");	
		LanguageRegistry.addName(pwoodsword, "Wooden Sword \2472(Poisoned)");
		LanguageRegistry.addName(pstonesword, "Stone Sword \2472(Poisoned)");
		LanguageRegistry.addName(pgoldsword, "Golden Sword \2472(Poisoned)");
		LanguageRegistry.addName(pdiamondsword, "Diamond Sword \2472(Poisoned)");
		
		LanguageRegistry.addName(baseballbat, "\247ePeanut-Butter-Jelly-Time Baseball Bat");
		LanguageRegistry.instance().addName(scorpiontail, "Scorpion Tail");
		LanguageRegistry.instance().addName(poison, "Venom");
		LanguageRegistry.instance().addName(wolffur, "Wolf Fur");
		LanguageRegistry.instance().addName(mammothfur, "Thick Fur");
		LanguageRegistry.instance().addName(stonecog, "Stone Cog");
		LanguageRegistry.instance().addName(woodcog, "Wooden Cog");
		LanguageRegistry.instance().addName(grindingmech, "Grinding Mechanism");
		LanguageRegistry.instance().addName(core, "\247dOrganic Core");
		LanguageRegistry.instance().addName(core2, "\247dOrganic Crystal");
		LanguageRegistry.instance().addName(tusk, "Tusk");
		LanguageRegistry.instance().addName(whalefat, "Whale Fat");
		LanguageRegistry.instance().addName(oilseed, "Seed Oil");
		LanguageRegistry.instance().addName(oilolive, "Olive Oil");
		LanguageRegistry.instance().addName(oilwhale, "Whale Fat Oil");
		LanguageRegistry.instance().addName(oilfish, "Fish Oil");

		LanguageRegistry.instance().addName(potionhunger, "Potion of Hunger");
		LanguageRegistry.instance().addName(potionhungerLong, "Potion of Starvation");
		LanguageRegistry.instance().addName(potionhungerStrong, "Potion of Hunger II");
		LanguageRegistry.instance().addName(potionvenomLong, "Potion of Venom");
		LanguageRegistry.instance().addName(potionvenomStrong, "Potion of Venom II");

		
		LanguageRegistry.addName(knife, "Chef's Knife");	
		LanguageRegistry.addName(whisk, "Whisk");	
		LanguageRegistry.addName(foodgrinder, "Food Grinder");	
		LanguageRegistry.addName(destalker, "Stalk Remover");	
		LanguageRegistry.addName(cheesemold, "Cheese Mould");	
		LanguageRegistry.addName(cheesemoldFilled, "Cheese Mould (Filled)");	
		LanguageRegistry.addName(cheesemoldSet, "Cheese Mould");	
		
		
		LanguageRegistry.addName(sack, "Empty Sack");
		LanguageRegistry.addName(sackGrapes, "Sack of Grapes (4)");
		LanguageRegistry.addName(sackYeast, "Sack of Yeast (4)");
		LanguageRegistry.addName(sackHops, "Sack of Hops (4)");
		LanguageRegistry.addName(sackBarleyGrain, "Sack of Barley Grain (4)");
		LanguageRegistry.addName(sackBarleyMalt, "Sack of Malt Barley (4)");
		LanguageRegistry.addName(sackWeed, "Sack of Cannabis (4)");
		LanguageRegistry.addName(sackTobacco, "Sack of Tobacco (4)");
		LanguageRegistry.addName(sackPotato, "Sack of Potatoes (4)");
		LanguageRegistry.addName(sackbig, "Large Empty Sack");
		LanguageRegistry.addName(sackbigGrapes, "Large Sack of Grapes (16)");
		LanguageRegistry.addName(sackbigYeast, "Large Sack of Yeast (16)");
		LanguageRegistry.addName(sackbigHops, "Large Sack of Hops (16)");
		LanguageRegistry.addName(sackbigBarleyGrain, "Large Sack of Barley Grain (16)");
		LanguageRegistry.addName(sackbigBarleyMalt, "Large Sack of Malt Barley (16)");
		LanguageRegistry.addName(sackbigWeed, "Large Sack of Cannabis (16)");
		LanguageRegistry.addName(sackbigTobacco, "Large Sack of Tobacco (16)");
		LanguageRegistry.addName(sackbigPotato, "Large Sack of Potatoes (16)");
		LanguageRegistry.addName(sackSugar, "Sack of Sugar (4)");
		LanguageRegistry.addName(sackbigSugar, "Large Sack of Sugar (16)");
		LanguageRegistry.addName(sackApples, "Sack of Apples (4)");
		LanguageRegistry.addName(sackbigApples, "Large Sack of Apples (16)");
		LanguageRegistry.addName(sackEggs, "Sack of Eggs (4)");
		LanguageRegistry.addName(sackbigEggs, "Large Sack of Eggs (16)");
		LanguageRegistry.addName(sackPurpleGrapes, "Sack of Purple Grapes (4)");
		LanguageRegistry.addName(sackbigPurpleGrapes, "Large Sack of Purple Grapes (16)");
		LanguageRegistry.addName(sackOnion, "Sack of Onions (4)");
		LanguageRegistry.addName(sackbigOnion, "Large Sack of Onions (16)");
		LanguageRegistry.addName(sackTea, "Sack of Tea Leaves (4)");
		LanguageRegistry.addName(sackbigTea, "Large Sack of Tea Leaves (16)");
		LanguageRegistry.addName(sackTeaDry, "Sack of Dried Tea Leaves (4)");
		LanguageRegistry.addName(sackbigTeaDry, "Large Sack of Dried Tea Leaves (16)");
		
		LanguageRegistry.addName(cloth, "Cloth");
		LanguageRegistry.addName(clothRough, "Rough Fabric");
		LanguageRegistry.addName(fabric, "Fabric");
		LanguageRegistry.addName(silk, "Silk");
		LanguageRegistry.addName(tailorItem, "Needle + Thread");
		LanguageRegistry.addName(millstoneItem, "Mill Stone");
		
		
		
		pbjtAchieve = (new Achievement(62, "pbjtAchieve", 8, 8, ModTools.baseballbat, (Achievement)null)).setIndependent().registerAchievement();
		
	}

	@Init
	public void load (FMLInitializationEvent event)
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.tailorItem, 1), new Object[]{new ItemStack(Item.ingotIron), new ItemStack(Item.silk)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModGuiTailorTable.TailorTableIdle, 1), new Object[]{new ItemStack(Block.workbench), new ItemStack(ModTools.tailorItem)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.baseballbat, 1), new Object[]{new ItemStack(Item.pocketSundial), new ItemStack(ModFood.peanutbutter), new ItemStack(ModFood.jam)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.baseballbat, 1), new Object[]{new ItemStack(Item.pocketSundial), new ItemStack(ModFood.peanutbutter), new ItemStack(ModFood.jamRaspberry)});  
		GameRegistry.addRecipe(new ItemStack(ModTools.millstoneItem, 1), new Object[] {"XXX", "XYX", "XXX", 'X', new ItemStack(Block.stone), 'Y', new ItemStack(ModTools.stonecog)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.pstonesword, 1), new Object[]{new ItemStack(Item.swordStone), new ItemStack(ModTools.poison)});    
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.pwoodsword, 1), new Object[]{new ItemStack(Item.swordWood), new ItemStack(ModTools.poison)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.pironsword, 1), new Object[]{new ItemStack(Item.swordIron), new ItemStack(ModTools.poison)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.pgoldsword, 1), new Object[]{new ItemStack(Item.swordGold), new ItemStack(ModTools.poison)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.pdiamondsword, 1), new Object[]{new ItemStack(Item.swordDiamond), new ItemStack(ModTools.poison)});  
	
		GameRegistry.addRecipe(new ItemStack(Item.saddle, 1), new Object[] {"XXX", "XYX", "VSV", 'Y', new ItemStack(Item.ingotGold), 'X', new ItemStack(Item.leather), 'V', new ItemStack(Item.ingotIron), 'S', new ItemStack(Item.silk)});
		
		GameRegistry.addRecipe(new ItemStack(chain, 2), new Object[] {" X ", "X X", " X ", 'X', new ItemStack(Item.ingotIron)});
		GameRegistry.addRecipe(new ItemStack(Item.helmetChain, 1), new Object[] {"XXX", "X X", 'X', new ItemStack(ModTools.chain)});
		GameRegistry.addRecipe(new ItemStack(Item.plateChain, 1), new Object[] {"X X", "XXX", "XXX", 'X', new ItemStack(ModTools.chain)});
		GameRegistry.addRecipe(new ItemStack(Item.legsChain, 1), new Object[] {"XXX", "X X", "X X", 'X', new ItemStack(ModTools.chain)});
		GameRegistry.addRecipe(new ItemStack(Item.bootsChain, 1), new Object[] {"X X", "X X", 'X', new ItemStack(ModTools.chain)});
		
		GameRegistry.addRecipe(new ItemStack(watch, 1), new Object[] {"YXY", "XVX", "YXY", 'X', new ItemStack(Item.ingotGold), 'V', new ItemStack(Item.pocketSundial), 'Y', new ItemStack(chain)});
		GameRegistry.addRecipe(new ItemStack(analyser, 1), new Object[] {" R ", "IPI", "IGI", 'G', new ItemStack(Item.ingotGold), 'I', new ItemStack(Item.ingotIron), 'R', new ItemStack(Item.redstone), 'P', new ItemStack(Item.paper), 'G', new ItemStack(Block.thinGlass)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyone, 5), new Object[]{new ItemStack(moneytwo)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneytwo, 2), new Object[]{new ItemStack(moneythree)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneythree, 5), new Object[]{new ItemStack(moneyfour)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyfour, 2), new Object[]{new ItemStack(moneyfive)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyfive, 5), new Object[]{new ItemStack(moneysix)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneysix, 2), new Object[]{new ItemStack(moneyseven)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyseven, 5), new Object[]{new ItemStack(moneyeight)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyeight, 2), new Object[]{new ItemStack(moneynine)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneynine, 5), new Object[]{new ItemStack(moneyten)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyten, 2), new Object[]{new ItemStack(moneyeleven)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyeleven, 5), new Object[]{new ItemStack(moneytwelve)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneytwelve, 2), new Object[]{new ItemStack(moneythirteen)});  
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneytwo, 1), new Object[]{new ItemStack(moneyone), new ItemStack(moneyone), new ItemStack(moneyone), new ItemStack(moneyone), new ItemStack(moneyone)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneythree, 1), new Object[]{new ItemStack(moneytwo), new ItemStack(moneytwo)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyfour, 1), new Object[]{new ItemStack(moneythree), new ItemStack(moneythree), new ItemStack(moneythree), new ItemStack(moneythree), new ItemStack(moneythree)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyfive, 1), new Object[]{new ItemStack(moneyfour), new ItemStack(moneyfour)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneysix, 1), new Object[]{new ItemStack(moneyfive), new ItemStack(moneyfive), new ItemStack(moneyfive), new ItemStack(moneyfive), new ItemStack(moneyfive)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyseven, 1), new Object[]{new ItemStack(moneysix), new ItemStack(moneysix)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyeight, 1), new Object[]{new ItemStack(moneyseven), new ItemStack(moneyseven), new ItemStack(moneyseven), new ItemStack(moneyseven), new ItemStack(moneyseven)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneynine, 1), new Object[]{new ItemStack(moneyeight), new ItemStack(moneyeight)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyten, 1), new Object[]{new ItemStack(moneynine), new ItemStack(moneynine), new ItemStack(moneynine), new ItemStack(moneynine), new ItemStack(moneynine)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneyeleven, 1), new Object[]{new ItemStack(moneyten), new ItemStack(moneyten)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneytwelve, 1), new Object[]{new ItemStack(moneyeleven), new ItemStack(moneyeleven), new ItemStack(moneyeleven), new ItemStack(moneyeleven), new ItemStack(moneyeleven)});  
		GameRegistry.addShapelessRecipe(new ItemStack(ModTools.moneythirteen, 1), new Object[]{new ItemStack(moneytwelve), new ItemStack(moneytwelve)});  
		
		GameRegistry.addRecipe(new ItemStack(moneyone, 5), new Object[] {" X ", "XXX", " X ", 'X', new ItemStack(Item.ingotIron)});
		GameRegistry.addRecipe(new ItemStack(moneyfour, 5), new Object[] {" X ", "XXX", " X ", 'X', new ItemStack(Item.ingotGold)});
		GameRegistry.addRecipe(new ItemStack(moneysix, 1), new Object[] {"YXY", 'X', new ItemStack(Item.diamond), 'Y', new ItemStack(Item.paper)});
		GameRegistry.addRecipe(new ItemStack(moneyseven, 1), new Object[] {"YXY", 'X', new ItemStack(Item.emerald), 'Y', new ItemStack(Item.paper)});
		
		
		
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
		addAchievementName("pbjtAchieve", "It's Peanut Butter Jelly Time");
		addAchievementDesc("pbjtAchieve", "Peanut-butter-jelly, Peanut-butter-jelly, Peanut-butter-jelly and a Baseball Bat");
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// this is the post initialization.
	}
}