package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventPeanut 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.peanutCrop.blockID)
         {
          ((BlockCropPeanut)ModCrops.peanutCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

