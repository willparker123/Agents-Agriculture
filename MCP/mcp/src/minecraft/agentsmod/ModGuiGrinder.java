
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

@Mod(modid="modGuiGrinder", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiGrinder {

	public static final String modid = "modGuiGrinder";

	public static Block GrinderIdle;
	public static Block GrinderActive;
	public static final int guiIdGrinder = 0;
	
	private GuiHandlerGrinder guiHandlerGrinder = new GuiHandlerGrinder();



	// The instance of your mod that Forge uses.
	@Instance("modGuiGrinder")
	public static ModGuiGrinder instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//Mill Stone
		GrinderIdle = new BlockGrinder(ModConfig.GrinderIdleID, false).setCreativeTab(CreativeTabs.tabBlock).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(8.0F).setUnlocalizedName("GrinderIdle");
		GrinderActive = new BlockGrinder(ModConfig.GrinderActiveID, true).setStepSound(Block.soundStoneFootstep).setHardness(2.0F).setResistance(8.0F).setUnlocalizedName("GrinderActive");
		GameRegistry.registerBlock(GrinderIdle);
		GameRegistry.registerBlock(GrinderActive);
		LanguageRegistry.addName(GrinderIdle, "Mill Stone");
		LanguageRegistry.addName(GrinderActive, "Mill Stone");
		GameRegistry.registerTileEntity(TileEntityGrinder.class, "tileEntityGrinder");
		LanguageRegistry.instance().addStringLocalization("container.Grinder", "Mill Stone");
		

		GuiHandlerGrinder guiHandlerGrinder = new GuiHandlerGrinder();
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