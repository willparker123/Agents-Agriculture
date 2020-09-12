
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

@Mod(modid="modGuiDnaFabricator", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModGuiDnaFabricator {

	public static final String modid = "modGuiDnaFabricator";

	public static Block dnafabricatorIdle;
	public static Block dnafabricatorActive;
    public static final int guiIdDnaFabricator = 0;
    
    private GuiHandlerDnaFabricator guiHandlerDnaFabricator = new GuiHandlerDnaFabricator();
	
	


	// The instance of your mod that Forge uses.
	@Instance("modGuiDnaFabricator")
	public static ModGuiDnaFabricator instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		//dna fabricator
		dnafabricatorIdle = new BlockDnaFabricator(ModConfig.dnafabricatorIdleID, false).setStepSound(Block.soundMetalFootstep).setCreativeTab(CreativeTabs.tabBlock).setHardness(2.0F).setResistance(6.0F).setUnlocalizedName("dnafabricatorIdle");
		dnafabricatorActive = new BlockDnaFabricator(ModConfig.dnafabricatorActiveID, true).setStepSound(Block.soundMetalFootstep).setHardness(2.0F).setResistance(6.0F).setLightValue(1.0F).setUnlocalizedName("dnafabricatorActive");
		GameRegistry.registerBlock(dnafabricatorIdle);
		GameRegistry.registerBlock(dnafabricatorActive);
		LanguageRegistry.addName(dnafabricatorIdle, "DNA Fabricator");
		LanguageRegistry.addName(dnafabricatorActive, "DNA Fabricator");
		GameRegistry.registerTileEntity(TileEntityDnaFabricator.class, "tileEntityDnafabricator");
		LanguageRegistry.instance().addStringLocalization("container.dnafabricator", "DNA Fabricator");
		

		GuiHandlerDnaFabricator guiHandlerDnaFabricator = new GuiHandlerDnaFabricator();}

	public void networkRegisters()
	{
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerDnaFabricator);
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