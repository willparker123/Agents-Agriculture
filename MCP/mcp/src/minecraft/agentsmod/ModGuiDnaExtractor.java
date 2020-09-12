
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

@Mod(modid="modGuiDnaExtractor", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiDnaExtractor {

	public static final String modid = "modGuiDnaExtractor";

	public static Block dnaextractorIdle;
	public static Block dnaextractorActive;
    public static final int guiIdDnaExtractor = 0;
    
    private GuiHandlerDnaExtractor guiHandlerDnaExtractor = new GuiHandlerDnaExtractor();
	
	


	// The instance of your mod that Forge uses.
	@Instance("modGuiDnaExtractor")
	public static ModGuiDnaExtractor instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//dna extractor
		dnaextractorIdle = new BlockDnaExtractor(ModConfig.dnaextractorIdleID, false).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(1.5F).setResistance(4.0F).setUnlocalizedName("dnaextractorIdle");
		dnaextractorActive = new BlockDnaExtractor(ModConfig.dnaextractorActiveID, true).setStepSound(Block.soundStoneFootstep).setHardness(1.5F).setResistance(4.0F).setLightValue(0.8F).setUnlocalizedName("dnaextractorActive");
		GameRegistry.registerBlock(dnaextractorIdle);
		GameRegistry.registerBlock(dnaextractorActive);
		LanguageRegistry.addName(dnaextractorIdle, "DNA Extractor");
		LanguageRegistry.addName(dnaextractorActive, "DNA Extractor");
		GameRegistry.registerTileEntity(TileEntityDnaExtractor.class, "tileEntityDnaExtractor");
		LanguageRegistry.instance().addStringLocalization("container.dnaExtractor", "DNA Extractor");
		

		GuiHandlerDnaExtractor guiHandlerDnaExtractor = new GuiHandlerDnaExtractor();}

	public void networkRegisters()
	{
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerDnaExtractor);
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