
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

@Mod(modid="modGuiSeedExtractor", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiSeedExtractor {

	public static final String modid = "modGuiSeedExtractor";

	public static Block seedextractorIdle;
	public static Block seedextractorActive;
	public static final int guiIdSeedExtractor = 0;

	private GuiHandlerSeedExtractor guiHandlerSeedExtractor = new GuiHandlerSeedExtractor();



	// The instance of your mod that Forge uses.
	@Instance("modGuiSeedExtractor")
	public static ModGuiSeedExtractor instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//seed extractor
		seedextractorIdle = new BlockSeedExtractor(ModConfig.seedextractorIdleID, false).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0F).setResistance(3.0F).setUnlocalizedName("seedextractorIdle");
		seedextractorActive = new BlockSeedExtractor(ModConfig.seedextractorActiveID, true).setStepSound(Block.soundStoneFootstep).setHardness(1.0F).setResistance(3.0F).setLightValue(0.8F).setUnlocalizedName("seedextractorActive");
		GameRegistry.registerBlock(seedextractorIdle);
		GameRegistry.registerBlock(seedextractorActive);
		LanguageRegistry.addName(seedextractorIdle, "Seed Extractor");
		LanguageRegistry.addName(seedextractorActive, "Seed Extractor");
		GameRegistry.registerTileEntity(TileEntitySeedExtractor.class, "tileEntitySeedExtractor");
		LanguageRegistry.instance().addStringLocalization("container.seedExtractor", "Seed Extractor");
		

		GuiHandlerSeedExtractor guiHandlerSeedExtractor = new GuiHandlerSeedExtractor();
	}

	@Init
	public void load (FMLInitializationEvent event)
	{

	}
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// this is the post initialization.
	}
}