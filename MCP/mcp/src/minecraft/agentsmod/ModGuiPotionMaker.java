
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

@Mod(modid="modGuiPotionMaker", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiPotionMaker {

	public static final String modid = "modGuiPotionMaker";

	public static Block potionMakerIdle;
	public static final int guiIdPotionMaker = 0;

	private GuiHandlerPotionMaker guiHandlerPotionMaker = new GuiHandlerPotionMaker();



	// The instance of your mod that Forge uses.
	@Instance("modGuiPotionMaker")
	public static ModGuiPotionMaker instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//seed extractor
		potionMakerIdle = new BlockPotionMaker(ModConfig.potionMakerIdleID).setStepSound(Block.soundStoneFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("potionMakerIdle");
		GameRegistry.registerBlock(potionMakerIdle);
		LanguageRegistry.addName(potionMakerIdle, "Potion Mixer");
		LanguageRegistry.instance().addStringLocalization("container.potionMaker", "Potion Mixer");
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerPotionMaker);

		GuiHandlerPotionMaker guiHandlerPotionMaker = new GuiHandlerPotionMaker();
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