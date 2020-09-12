
package agentsmod;

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

@Mod(modid="mod_*", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class CoreModFile {

        // The instance of your mod that Forge uses.
@Instance("CoreModFile")
public static CoreModFile instance;
// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
public static CommonProxy proxy;
@PreInit
public void preInit(FMLPreInitializationEvent event) {
// this preinitialized your mod. when the mod gets preinted you can add things like system outputs.
}
@Init
public void load (FMLInitializationEvent event) {
	
}
@PostInit
public void postInit(FMLPostInitializationEvent event) {
// this is the post initialization.
}
}