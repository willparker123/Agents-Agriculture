package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventSoy 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.soyCrop.blockID)
         {
          ((BlockCropSoy)ModCrops.soyCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

