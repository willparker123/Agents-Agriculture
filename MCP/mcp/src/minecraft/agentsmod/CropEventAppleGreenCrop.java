package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventAppleGreenCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.appleGreenCrop.blockID)
         {
          ((BlockCropAppleGreen)ModCrops.appleGreenCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

