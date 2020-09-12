package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventWeed 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.weedCrop.blockID)
         {
          ((BlockCropWeed)ModCrops.weedCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }
