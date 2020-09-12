
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

@Mod(modid="modGuiDnaMaker", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiDnaMaker {

	public static final String modid = "modGuiDnaMaker";

	public static Block dnaMakerIdle;
	public static final int guiIdDnaMaker = 0;

	private GuiHandlerDnaMaker guiHandlerDnaMaker = new GuiHandlerDnaMaker();



	// The instance of your mod that Forge uses.
	@Instance("modGuiDnaMaker")
	public static ModGuiDnaMaker instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//seed extractor
		dnaMakerIdle = new BlockDnaMaker(ModConfig.dnaMakerIdleID).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(1.6F).setResistance(2.0F).setUnlocalizedName("dnaMakerIdle");
		GameRegistry.registerBlock(dnaMakerIdle);
		LanguageRegistry.addName(dnaMakerIdle, "DNA Synthesizer");
		LanguageRegistry.instance().addStringLocalization("container.dnaMaker", "DNA Synthesizer");
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerDnaMaker);

		GuiHandlerDnaMaker guiHandlerDnaMaker = new GuiHandlerDnaMaker();
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