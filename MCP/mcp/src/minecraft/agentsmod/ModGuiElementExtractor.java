
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

@Mod(modid="modGuiElementExtractor", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiElementExtractor {

	public static final String modid = "modGuiElementExtractor";

	public static Block elementextractorIdle;
	public static Block elementextractorActive;
	  public static final int guiIdElementExtractor = 0;
    
    private GuiHandlerElementExtractor guiHandlerElementExtractor = new GuiHandlerElementExtractor();
	
	


	// The instance of your mod that Forge uses.
	@Instance("modGuiElementExtractor")
	public static ModGuiElementExtractor instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		
		//Element extractor
		elementextractorIdle = new BlockElementExtractor(ModConfig.elementextractorIdleID, false).setStepSound(Block.soundMetalFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(2.6F).setResistance(8.0F).setUnlocalizedName("elementextractorIdle");
		elementextractorActive = new BlockElementExtractor(ModConfig.elementextractorActiveID, true).setStepSound(Block.soundMetalFootstep).setHardness(2.6F).setResistance(8.0F).setLightValue(1.2F).setUnlocalizedName("elementextractorActive");
		GameRegistry.registerBlock(elementextractorIdle);
		GameRegistry.registerBlock(elementextractorActive);
		LanguageRegistry.addName(elementextractorIdle, "Chemical Extractor");
		LanguageRegistry.addName(elementextractorActive, "Chemical Extractor");
		GameRegistry.registerTileEntity(TileEntityElementExtractor.class, "tileEntityElementExtractor");
		LanguageRegistry.instance().addStringLocalization("container.elementExtractor", "Chemical Extractor");
		

		GuiHandlerElementExtractor guiHandlerElementExtractor = new GuiHandlerElementExtractor();}

	public void networkRegisters()
	{
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerElementExtractor);
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