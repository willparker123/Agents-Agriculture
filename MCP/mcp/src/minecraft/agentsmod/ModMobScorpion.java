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
 
@Mod(modid = "MobScorpion.modid", name = "Agent's Mod", version = "Alpha")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ModMobScorpion 
{
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
 public static CommonProxy proxy;
	
	public static final String modid = "Agents Agriculture: Mob";
  
 static int startEntityId = 1410;
  
 @Init
  public void load(FMLInitializationEvent event)
  {
	 proxy.registerRenderThings();
	 
  EntityRegistry.registerModEntity(EntityScorpionSmall.class, "ScorpionSmall", 3, this, 20, 1, true);
   
  EntityRegistry.addSpawn(EntityScorpionSmall.class, 10, 1, 5, EnumCreatureType.ambient, BiomeGenBase.desert, BiomeGenBase.desertHills);
   
  LanguageRegistry.instance().addStringLocalization("entity.MobScorpion.modid.ScorpionSmall.name", "Scorpion");
   
  registerEntityEgg(EntityScorpionSmall.class, 0x520F48, 0xAB37AB);
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
 

