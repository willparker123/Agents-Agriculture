package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventAppleRedCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.appleRedCrop.blockID)
         {
          ((BlockCropAppleRed)ModCrops.appleRedCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

