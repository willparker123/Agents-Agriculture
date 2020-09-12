
//again, another package change it to client.yourname.yourmod
package agentsmod;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.RenderFallingSand;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy
{
	
	@Override
	public void registerRenderThings()
	{
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrinder.class, new RenderTileEntityGrinder());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball.class, new RenderTileEntityGumball());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball2.class, new RenderTileEntityGumball2());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball3.class, new RenderTileEntityGumball3());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball4.class, new RenderTileEntityGumball4());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball5.class, new RenderTileEntityGumball5());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball6.class, new RenderTileEntityGumball6());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball7.class, new RenderTileEntityGumball7());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGumball8.class, new RenderTileEntityGumball8());
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShell.class, new RenderWalnutShell(ModFruits.walnutshell));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellHard.class, new RenderWalnutShellHard(ModFruits.walnutshellHard));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellHard2.class, new RenderWalnutShellHard(ModFruits.walnutshellHard));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellHard3.class, new RenderWalnutShellHard(ModFruits.walnutshellHard));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellHarder.class, new RenderWalnutShellHarder(ModFruits.walnutshellHarder));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellHarder2.class, new RenderWalnutShellHarder(ModFruits.walnutshellHarder));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellHarder3.class, new RenderWalnutShellHarder(ModFruits.walnutshellHarder));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellFire.class, new RenderWalnutShellFire(ModFruits.walnutshellFire));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellFire2.class, new RenderWalnutShellFire(ModFruits.walnutshellFire));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellFire3.class, new RenderWalnutShellFire(ModFruits.walnutshellFire));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellElectric.class, new RenderWalnutShellElectric(ModFruits.walnutshellElectric));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellElectric2.class, new RenderWalnutShellElectric(ModFruits.walnutshellElectric));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellElectric3.class, new RenderWalnutShellElectric(ModFruits.walnutshellElectric));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellBomb.class, new RenderWalnutShellBomb(ModFruits.walnutshellBomb));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellBomb2.class, new RenderWalnutShellBomb(ModFruits.walnutshellBomb));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellBomb3.class, new RenderWalnutShellBomb(ModFruits.walnutshellBomb));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellBigBomb.class, new RenderWalnutShellBigBomb(ModFruits.walnutshellBigBomb));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellBigBomb2.class, new RenderWalnutShellBigBomb(ModFruits.walnutshellBigBomb));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellBigBomb3.class, new RenderWalnutShellBigBomb(ModFruits.walnutshellBigBomb));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellNuke.class, new RenderWalnutShellNuke(ModFruits.walnutshellNuke));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellNuke2.class, new RenderWalnutShellNuke(ModFruits.walnutshellNuke));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellNuke3.class, new RenderWalnutShellNuke(ModFruits.walnutshellNuke));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellWB.class, new RenderWalnutShellWB(ModFruits.walnutshellWB));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellWB2.class, new RenderWalnutShellWB(ModFruits.walnutshellWB));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellWB3.class, new RenderWalnutShellWB(ModFruits.walnutshellWB));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellGold.class, new RenderWalnutShellGold(ModFruits.walnutshellGold));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellGold2.class, new RenderWalnutShellGold(ModFruits.walnutshellGold));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellGold3.class, new RenderWalnutShellGold(ModFruits.walnutshellGold));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellDiamond.class, new RenderWalnutShellDiamond(ModFruits.walnutshellDiamond));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellDiamond2.class, new RenderWalnutShellDiamond(ModFruits.walnutshellDiamond));
        RenderingRegistry.registerEntityRenderingHandler(EntityWalnutShellDiamond3.class, new RenderWalnutShellDiamond(ModFruits.walnutshellDiamond));
        RenderingRegistry.registerEntityRenderingHandler(EntityDynoGum.class, new RenderDynoGum(ModFood.gumExplosive));
         RenderingRegistry.registerEntityRenderingHandler(EntityMammoth.class, new RenderMammoth(new ModelMammoth(), null, 0.1F));
         RenderingRegistry.registerEntityRenderingHandler(EntityMammothZombie.class, new RenderMammothZombie(new ModelMammoth(), null, 0.1F));
 		RenderingRegistry.registerEntityRenderingHandler(EntityScorpionSmall.class, new RenderScorpionSmall(new ModelScorpionSmall(), 0.1F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderWhale(new ModelWhale(), null, 0.1F));
	}
	
	public void registerSounds()
	{
		MinecraftForge.EVENT_BUS.register(new EventModSounds());
	}
	
	// your render class
}