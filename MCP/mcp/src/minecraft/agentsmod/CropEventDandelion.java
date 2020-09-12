package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventDandelion 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.dandelionCrop.blockID)
         {
          ((BlockCropDandelion)ModCrops.dandelionCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

