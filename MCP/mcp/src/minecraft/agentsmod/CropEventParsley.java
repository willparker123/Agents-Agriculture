package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventParsley 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.parsleyCrop.blockID)
         {
          ((BlockCropParsley)ModCrops.parsleyCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

