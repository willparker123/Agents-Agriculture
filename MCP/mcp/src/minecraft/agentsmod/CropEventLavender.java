package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventLavender 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.lavenderCrop.blockID)
         {
          ((BlockCropLavender)ModCrops.lavenderCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

