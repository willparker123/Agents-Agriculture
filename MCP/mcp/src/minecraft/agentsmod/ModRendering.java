
package agentsmod;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
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
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ModRendering", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModRendering {
	
	public static final String modid = "ModRendering";

	
	// The instance of your mod that Forge uses.
	@Instance("ModRendering")
	public static ModRendering instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.registerSounds();
	}

	
	@Init
	public void load (FMLInitializationEvent event)
	{
		EntityRegistry.registerModEntity(EntityWalnutShell.class, "Walnut Shell", 3, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellHard.class, "Hard Walnut Shell", 4, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellHard2.class, "Hard Walnut Shell", 5, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellHard3.class, "Hard Walnut Shell", 6, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellFire.class, "Inferno Shell", 7, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellFire2.class, "Inferno Shell", 8, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellFire3.class, "Inferno Shell", 9, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellElectric.class, "Electric Shell", 10, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellElectric2.class, "Electric Shell", 11, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellElectric3.class, "Electric Shell", 12, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellBomb.class, "Explosive Walnut Shell", 13, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellBomb2.class, "Explosive Walnut Shell", 14, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellBomb3.class, "Explosive Walnut Shell", 15, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellBigBomb.class, "Large Explosive Walnut Shell", 16, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellBigBomb2.class, "Large Explosive Walnut Shell", 17, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellBigBomb3.class, "Large Explosive Walnut Shell", 18, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellNuke.class, "Nuclear Walnut Shell", 19, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellNuke2.class, "Nuclear Walnut Shell", 20, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellNuke3.class, "Nuclear Walnut Shell", 21, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellHarder.class, "Iron Walnut Shell", 22, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellHarder2.class, "Iron Walnut Shell", 23, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellHarder3.class, "Iron Walnut Shell", 24, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellWB.class, "Cataclysm Walnut Shell", 25, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellWB2.class, "Cataclysm Walnut Shell", 26, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellWB3.class, "Cataclysm Walnut Shell", 27, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellGold.class, "Golden Walnut Shell", 28, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellGold2.class, "Golden Walnut Shell", 29, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellGold3.class, "Golden Walnut Shell", 30, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellDiamond.class, "Diamond Walnut Shell", 31, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellDiamond2.class, "Diamond Walnut Shell", 32, this, 64, 10, true);
		EntityRegistry.registerModEntity(EntityWalnutShellDiamond3.class, "Diamond Walnut Shell", 33, this, 64, 10, true);
		
		MinecraftForge.EVENT_BUS.register(new EventLivingDrops());
		MinecraftForge.EVENT_BUS.register(new EventModSounds());
		}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		// this is the post initialization.
	}
}