package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventOnion 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.onionCrop.blockID)
         {
          ((BlockCropOnion)ModCrops.onionCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

