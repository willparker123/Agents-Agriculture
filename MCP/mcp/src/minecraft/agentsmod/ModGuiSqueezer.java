
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

@Mod(modid="modGuiSqueezer", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiSqueezer {

	public static final String modid = "modGuiSqueezer";

	public static Block squeezerIdle;
	public static Block squeezerActive;
	public static final int guiIdSqueezer = 0;

	private GuiHandlerSqueezer guiHandlerSqueezer = new GuiHandlerSqueezer();



	// The instance of your mod that Forge uses.
	@Instance("modGuiSqueezer")
	public static ModGuiSqueezer instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//seed extractor
		squeezerIdle = new BlockSqueezer(ModConfig.squeezerIdleID, false).setStepSound(Block.soundMetalFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(4.0F).setResistance(10.0F).setUnlocalizedName("squeezerIdle");
		squeezerActive = new BlockSqueezer(ModConfig.squeezerActiveID, true).setStepSound(Block.soundMetalFootstep).setHardness(4.0F).setResistance(10.0F).setLightValue(0.6F).setUnlocalizedName("squeezerActive");
		GameRegistry.registerBlock(squeezerIdle);
		GameRegistry.registerBlock(squeezerActive);
		LanguageRegistry.addName(squeezerIdle, "Squeezer");
		LanguageRegistry.addName(squeezerActive, "Squeezer");
		GameRegistry.registerTileEntity(TileEntitySqueezer.class, "tileEntitySqueezer");
		LanguageRegistry.instance().addStringLocalization("container.squeezer", "Squeezer");
		

		GuiHandlerSqueezer guiHandlerSqueezer = new GuiHandlerSqueezer();
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