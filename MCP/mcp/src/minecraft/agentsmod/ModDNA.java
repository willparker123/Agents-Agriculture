
package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
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
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ModDNA", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModDNA {
	
	public static final String modid = "ModDNA";

	public static Item DNA;
	public static Item DNA1;
	public static Item DNA2;
	public static Item DNA3;
	public static Item DNA4;
	public static Item DNA5;
	public static Item DNA6;
	public static Item DNA7;
	public static Item DNA8;
	public static Item DNA9;
	public static Item DNA10;
	public static Item DNA11;
	public static Item DNA12;
	public static Item DNA13;
	public static Item DNA14;
	public static Item DNA15;
	public static Item DNA16;
	public static Item DNA17;
	public static Item DNA18;
	public static Item DNA19;
	public static Item DNA20;
	public static Item DNA21;
	public static Item DNA22;
	public static Item DNA23;
	public static Item DNA24;
	public static Item DNA25;
	public static Item DNA26;
	public static Item DNA27;
	public static Item DNA28;
	public static Item DNA29;
	public static Item DNA30;
	public static Item DNA31;
	public static Item DNA32;
	public static Item DNA33;
	public static Item DNA34;
	public static Item DNA35;
	public static Item DNA36;
	public static Item DNA37;
	public static Item DNA38;
	public static Item DNA39;
	public static Item DNA40;
	public static Item DNA41;
	public static Item DNA42;
	public static Item DNA43;
	public static Item DNA44;
	public static Item DNA45;
	public static Item DNA46;
	public static Item DNA47;
	public static Item DNA48;
	public static Item DNA49;
	public static Item DNA50;
	public static Item DNA51;
	public static Item DNA52;
	public static Item DNA53;
	public static Item DNA54;
	public static Item DNA55;
	public static Item DNA56;
	public static Item DNA57;
	public static Item DNA58;
	public static Item DNA59;
	public static Item DNA60;
	public static Item DNA61;
	public static Item DNA62;
	public static Item DNA63;
	public static Item DNA64;
	public static Item DNA65;
	public static Item DNA66;
	public static Item DNA67;
	public static Item DNA68;
	public static Item DNA69;
	public static Item DNA70;
	public static Item DNA71;
	public static Item DNA72;
	public static Item DNA73;
	public static Item DNA74;
	public static Item DNA75;
	public static Item DNA76;
	public static Item DNA77;
	public static Item DNA78;
	public static Item DNA79;
	public static Item DNA80;
	public static Item DNA81;
	public static Item DNA82;
	public static Item DNA83;
	public static Item DNA84;
	public static Item DNA85;
	public static Item DNA86;
	public static Item DNA87;
	
	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	

	// The instance of your mod that Forge uses.
	@Instance("ModDNA")
	public static ModDNA instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{

	    DNA = new ItemDNA(ModConfig.DNAID).setUnlocalizedName("dna");
	    DNA1 = new ItemDNA(ModConfig.DNA1ID).setUnlocalizedName("dna1");
	    DNA2 = new ItemDNA(ModConfig.DNA2ID).setUnlocalizedName("dna2");
	    DNA3 = new ItemDNA(ModConfig.DNA3ID).setUnlocalizedName("dna3");
	    DNA4 = new ItemDNA(ModConfig.DNA4ID).setUnlocalizedName("dna4");
	    DNA5 = new ItemDNA(ModConfig.DNA5ID).setUnlocalizedName("dna5");
	    DNA6 = new ItemDNA(ModConfig.DNA6ID).setUnlocalizedName("dna6");
	    DNA7 = new ItemDNA(ModConfig.DNA7ID).setUnlocalizedName("dna7");
	    DNA8 = new ItemDNA(ModConfig.DNA8ID).setUnlocalizedName("dna8");
	    DNA9 = new ItemDNA(ModConfig.DNA9ID).setUnlocalizedName("dna9");
	    DNA10 = new ItemDNA(ModConfig.DNA10ID).setUnlocalizedName("dna10");
	    DNA11 = new ItemDNA(ModConfig.DNA11ID).setUnlocalizedName("dna11");
	    DNA12 = new ItemDNA(ModConfig.DNA12ID).setUnlocalizedName("dna12");
	    DNA13 = new ItemDNA(ModConfig.DNA13ID).setUnlocalizedName("dna13");
	    DNA14 = new ItemDNA(ModConfig.DNA14ID).setUnlocalizedName("dna14");
	    DNA15 = new ItemDNA(ModConfig.DNA15ID).setUnlocalizedName("dna15");
	    DNA16 = new ItemDNA(ModConfig.DNA16ID).setUnlocalizedName("dna16");
	    DNA17 = new ItemDNA(ModConfig.DNA17ID).setUnlocalizedName("dna17");
	    DNA18 = new ItemDNA(ModConfig.DNA18ID).setUnlocalizedName("dna18");
	    DNA19 = new ItemDNA(ModConfig.DNA19ID).setUnlocalizedName("dna19");
	    DNA20 = new ItemDNA(ModConfig.DNA20ID).setUnlocalizedName("dna20");
	    DNA21 = new ItemDNA(ModConfig.DNA21ID).setUnlocalizedName("dna21");
	    DNA22 = new ItemDNA(ModConfig.DNA22ID).setUnlocalizedName("dna22");
	    DNA23 = new ItemDNA(ModConfig.DNA23ID).setUnlocalizedName("dna23");
	    DNA24 = new ItemDNA(ModConfig.DNA24ID).setUnlocalizedName("dna24");
	    DNA25 = new ItemDNA(ModConfig.DNA25ID).setUnlocalizedName("dna25");
	    DNA26 = new ItemDNA(ModConfig.DNA26ID).setUnlocalizedName("dna26");
	    DNA27 = new ItemDNA(ModConfig.DNA27ID).setUnlocalizedName("dna27");
	    DNA28 = new ItemDNA(ModConfig.DNA28ID).setUnlocalizedName("dna28");
	    DNA29 = new ItemDNA(ModConfig.DNA29ID).setUnlocalizedName("dna29");
	    DNA30 = new ItemDNA(ModConfig.DNA30ID).setUnlocalizedName("dna30");
	    DNA31 = new ItemDNA(ModConfig.DNA31ID).setUnlocalizedName("dna31");
	    DNA32 = new ItemDNA(ModConfig.DNA32ID).setUnlocalizedName("dna32");
	    DNA33 = new ItemDNA(ModConfig.DNA33ID).setUnlocalizedName("dna33");
	    DNA34 = new ItemDNA(ModConfig.DNA34ID).setUnlocalizedName("dna34");
	    DNA35 = new ItemDNA(ModConfig.DNA35ID).setUnlocalizedName("dna35");
	    DNA36 = new ItemDNA(ModConfig.DNA36ID).setUnlocalizedName("dna36");
	    DNA37 = new ItemDNA(ModConfig.DNA37ID).setUnlocalizedName("dna37");
	    DNA38 = new ItemDNA(ModConfig.DNA38ID).setUnlocalizedName("dna38");
	    DNA39 = new ItemDNA(ModConfig.DNA39ID).setUnlocalizedName("dna39");
	    DNA40 = new ItemDNA(ModConfig.DNA40ID).setUnlocalizedName("dna40");
	    DNA41 = new ItemDNA(ModConfig.DNA41ID).setUnlocalizedName("dna41");
	    DNA42 = new ItemDNA(ModConfig.DNA42ID).setUnlocalizedName("dna42");
	    DNA43 = new ItemDNA(ModConfig.DNA43ID).setUnlocalizedName("dna43");
	    DNA44 = new ItemDNA(ModConfig.DNA44ID).setUnlocalizedName("dna44");
	    DNA45 = new ItemDNA(ModConfig.DNA45ID).setUnlocalizedName("dna45");
	    DNA46 = new ItemDNA(ModConfig.DNA46ID).setUnlocalizedName("dna46");
	    DNA47 = new ItemDNA(ModConfig.DNA47ID).setUnlocalizedName("dna47");
	    DNA48 = new ItemDNA(ModConfig.DNA48ID).setUnlocalizedName("dna48");
	    DNA49 = new ItemDNA(ModConfig.DNA49ID).setUnlocalizedName("dna49");
	    DNA50 = new ItemDNA(ModConfig.DNA50ID).setUnlocalizedName("dna50");
	    DNA51 = new ItemDNA(ModConfig.DNA51ID).setUnlocalizedName("dna51");
	    DNA52 = new ItemDNA(ModConfig.DNA52ID).setUnlocalizedName("dna52");
	    DNA53 = new ItemDNA(ModConfig.DNA53ID).setUnlocalizedName("dna53");
	    DNA54 = new ItemDNA(ModConfig.DNA54ID).setUnlocalizedName("dna54");
	    DNA55 = new ItemDNA(ModConfig.DNA55ID).setUnlocalizedName("dna55");
	    DNA56 = new ItemDNA(ModConfig.DNA56ID).setUnlocalizedName("dna56");
	    DNA57 = new ItemDNA(ModConfig.DNA57ID).setUnlocalizedName("dna57");
	    DNA58 = new ItemDNA(ModConfig.DNA58ID).setUnlocalizedName("dna58");
	    DNA59 = new ItemDNA(ModConfig.DNA59ID).setUnlocalizedName("dna59");
	    DNA60 = new ItemDNA(ModConfig.DNA60ID).setUnlocalizedName("dna60");
	    DNA61 = new ItemDNA(ModConfig.DNA61ID).setUnlocalizedName("dna61");
	    DNA62 = new ItemDNA(ModConfig.DNA62ID).setUnlocalizedName("dna62");
	    DNA63 = new ItemDNA(ModConfig.DNA63ID).setUnlocalizedName("dna63");
	    DNA64 = new ItemDNA(ModConfig.DNA64ID).setUnlocalizedName("dna64");
	    DNA65 = new ItemDNA(ModConfig.DNA65ID).setUnlocalizedName("dna65");
	    DNA66 = new ItemDNA(ModConfig.DNA66ID).setUnlocalizedName("dna66");
	    DNA67 = new ItemDNA(ModConfig.DNA67ID).setUnlocalizedName("dna67");
	    DNA68 = new ItemDNA(ModConfig.DNA68ID).setUnlocalizedName("dna68");
	    DNA69 = new ItemDNA(ModConfig.DNA69ID).setUnlocalizedName("dna69");
	    DNA70 = new ItemDNA(ModConfig.DNA70ID).setUnlocalizedName("dna70");
	    DNA71 = new ItemDNA(ModConfig.DNA71ID).setUnlocalizedName("dna71");
	    DNA72 = new ItemDNA(ModConfig.DNA72ID).setUnlocalizedName("dna72");
	    DNA73 = new ItemDNA(ModConfig.DNA73ID).setUnlocalizedName("dna73");
	    DNA74 = new ItemDNA(ModConfig.DNA74ID).setUnlocalizedName("dna74");
	    DNA75 = new ItemDNA(ModConfig.DNA75ID).setUnlocalizedName("dna75");
	    DNA76 = new ItemDNA(ModConfig.DNA76ID).setUnlocalizedName("dna76");
	    DNA77 = new ItemDNA(ModConfig.DNA77ID).setUnlocalizedName("dna77");
	    DNA78 = new ItemDNA(ModConfig.DNA78ID).setUnlocalizedName("dna78");
	    DNA79 = new ItemDNA(ModConfig.DNA79ID).setUnlocalizedName("dna79");
	    DNA80 = new ItemDNA(ModConfig.DNA80ID).setUnlocalizedName("dna80");
	    DNA81 = new ItemDNA(ModConfig.DNA81ID).setUnlocalizedName("dna81");
	    DNA82 = new ItemDNA(ModConfig.DNA82ID).setUnlocalizedName("dna82");
	    DNA83 = new ItemDNA(ModConfig.DNA83ID).setUnlocalizedName("dna83");
	    DNA84 = new ItemDNA(ModConfig.DNA84ID).setUnlocalizedName("dna84");
	    DNA85 = new ItemDNA(ModConfig.DNA85ID).setUnlocalizedName("dna85");
	    DNA86 = new ItemDNA(ModConfig.DNA86ID).setUnlocalizedName("dna86");
	    DNA87 = new ItemDNA(ModConfig.DNA87ID).setUnlocalizedName("dna87");
	    
	    LanguageRegistry.addName(new ItemStack(ModDNA.DNA), "Blank \2475DNA"); //Adds the sapphire gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA1), "Rose \2475DNA"); //Adds the sapphire gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA2), "Dandelion \2475DNA"); //Adds the amethyst gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA3), "Strawberry \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA4), "Tomato \2475DNA"); //Adds the amethyst gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA5), "Lemon \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA6), "Orange \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA7), "Cherry \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA8), "Lettuce \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA9), "Corn \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA10), "Pepper \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA11), "Rice \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA12), "Barley \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA13), "Cotton \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA14), "Onion \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA15), "Olive \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA16), "Cannabis \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA17), "Salty \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA18), "Sweet \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA19), "Bitter \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA20), "Sour \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA21), "Cocoa \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA22), "Apple \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA23), "Pumpkin \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA24), "Melon \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA25), "Wheat \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA26), "Sugar Cane \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA27), "Brown Mushroom \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA28), "Red Mushroom \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA29), "Carrot \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA30), "Potato \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA31), "Oak \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA32), "Spruce \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA33), "Birch \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA34), "Jungle \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA35), "Spiny \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA36), "Cactus \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA37), "Bean \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA38), "Root \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA39), "Leaf \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA40), "Lavender \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA41), "Parsley \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA42), "Herb \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA43), "Walnut \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA44), "Nutty \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA45), "Tobacco \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA46), "Bell Pepper \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA47), "Vine \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA48), "Gold \2475(Au)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA49), "Iron \2475(Fe)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA50), "Lazurite \2475(Na3,Ca(Al3,Si3,O12)S)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA51), "Hardening \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA52), "Carbon \2475(C)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA53), "Oxygen \2475(O)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA54), "Enlarging \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA55), "Spicy \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA56), "Garlicy \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA57), "Garlic \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA58), "Grape \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA59), "Sticky \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA60), "Chicle \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA61), "Hard Nut \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA62), "Hardened Walnut \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA63), "Iron Walnut \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA64), "Peanut \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA65), "Caffeine \2475(C8,H10,N4,O2)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA66), "Minty \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA67), "Mint \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA68), "Berry \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA69), "Raspberry \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA70), "Blue Raspberry \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA71), "Blackcurrant \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA72), "Blueberry \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA73), "Golden Walnut \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA74), "Diamond Walnut \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA75), "Hops \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA76), "Purple Grape \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA77), "Hydrogen \2475(H)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA78), "Nitrogen \2475(N)"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA79), "Green Apple \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA80), "Red Apple \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA81), "Green Bean \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA82), "Pea \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA83), "Pod \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA84), "Oat \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA85), "Soy Bean \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA86), "Tea \2475DNA"); //Adds the topaz gem name (metadata sensitive)
		LanguageRegistry.addName(new ItemStack(ModDNA.DNA87), "Coffee \2475DNA"); //Adds the topaz gem name (metadata sensitive)
	}

	@Init
	public void load (FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(Item.diamond,1), new Object[] {"ZZZ", "ZXZ", "ZZZ", 'Z', ModDNA.DNA52, 'X', ModDNA.DNA51});
		GameRegistry.addRecipe(new ItemStack(Item.ingotGold,2), new Object[] {"ZZZ", "ZXZ", "ZZZ", 'Z', ModDNA.DNA48, 'X', ModDNA.DNA51});
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron,2), new Object[] {"ZZZ", "ZXZ", "ZZZ", 'Z', ModDNA.DNA49, 'X', ModDNA.DNA51});
		GameRegistry.addRecipe(new ItemStack(Item.dyePowder,4,4), new Object[] {"ZZZ", "ZXZ", "ZZZ", 'Z', ModDNA.DNA50, 'X', ModDNA.DNA51});
		
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		// this is the post initialization.
	}
}