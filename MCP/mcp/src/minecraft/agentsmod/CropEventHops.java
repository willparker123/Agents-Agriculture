package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventHops 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.hopsCrop.blockID)
         {
          ((BlockCropHops)ModCrops.hopsCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

