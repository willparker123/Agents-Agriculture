package agentsmod;
 
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
@Mod(modid = "MobMammothZombie.modid", name = "Agent's Mod", version = "Alpha")
 @NetworkMod(clientSideRequired = true, serverSideRequired = true)
 public class ModMobMammothZombie
 {
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
  public static CommonProxy proxy;
	
	public static final String modid = "Agents Agriculture: Mob";
  
 static int startEntityId = 1408;
  
 @Init
  public void load(FMLInitializationEvent event)
  {
	 proxy.registerRenderThings();
	 
	 EntityRegistry.registerModEntity(EntityMammothZombie.class, "MammothZombie", 1, this, 20, 1, true);
	  
  LanguageRegistry.instance().addStringLocalization("entity.MobMammothZombie.modid.MammothZombie.name", "Zombie Mammoth");
  
  registerEntityEgg(EntityMammothZombie.class, 0x348A0C, 0x99631C);
  }
  
 public static int getUniqueEntityId() 
  {
   do 
   {
    startEntityId++;
   } 
   while (EntityList.getStringFromID(startEntityId) != null);
 
  return startEntityId;
  }
  
 public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
  {
   int id = getUniqueEntityId();
   EntityList.IDtoClassMapping.put(id, entity);
   EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
  }
 }
 

