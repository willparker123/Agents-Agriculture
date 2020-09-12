
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

@Mod(modid="modGuiTailorTable", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiTailorTable {

	public static final String modid = "modGuiTailorTable";

	public static Block TailorTableIdle;
	public static final int guiIdTailorTable = 0;

	private GuiHandlerTailorTable guiHandlerTailorTable = new GuiHandlerTailorTable();



	// The instance of your mod that Forge uses.
	@Instance("modGuiTailorTable")
	public static ModGuiTailorTable instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//seed extractor
		TailorTableIdle = new BlockTailorTable(ModConfig.TailorTableIdleID).setStepSound(Block.soundWoodFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(0.8F).setResistance(1.0F).setUnlocalizedName("TailorTableIdle");
		GameRegistry.registerBlock(TailorTableIdle);
		LanguageRegistry.addName(TailorTableIdle, "Tailor's Workbench");
		LanguageRegistry.instance().addStringLocalization("container.TailorTable", "\247fTailor's Workbench");
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerTailorTable);

		GuiHandlerTailorTable guiHandlerTailorTable = new GuiHandlerTailorTable();
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