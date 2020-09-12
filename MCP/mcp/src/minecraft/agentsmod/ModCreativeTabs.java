
package agentsmod;

import net.minecraft.creativetab.CreativeTabs;
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

@Mod(modid="CreativeTabs.modid", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModCreativeTabs {
	
	public static final String modid = "Agents Agriculture: Creative Tabs";
	
	public static CreativeTabs tabPlants = new TabPlants(CreativeTabs.getNextID(), "\2472(Agent's Agriculture) Plants + Seeds");
	public static CreativeTabs tabDrinks = new TabDrinks(CreativeTabs.getNextID(), "\2472(Agent's Agriculture) Drinks + Sauces");
	public static CreativeTabs tabFood = new TabFood(CreativeTabs.getNextID(), "\2472(Agent's Agriculture) Food + Fruits");
	public static CreativeTabs tabOther = new TabOther(CreativeTabs.getNextID(), "\2472(Agent's Agriculture) Other Items");
	public static CreativeTabs tabDNA = new TabDNA(CreativeTabs.getNextID(), "\2472(Agent's Agriculture) DNA");
	public static CreativeTabs tabFuels = new TabFuels(CreativeTabs.getNextID(), "\2472(Agent's Agriculture) Fuels");
	
	
        // The instance of your mod that Forge uses.
@Instance("Creative Tabs")
public static ModCreativeTabs instance;
// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
public static CommonProxy proxy;

@PreInit
public void preInit(FMLPreInitializationEvent event) {
// this preinitialized your mod. when the mod gets preinted you can add things like system outputs.
}

@PostInit
public void postInit(FMLPostInitializationEvent event) {
// this is the post initialization.
}
}