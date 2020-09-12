package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventCorn 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.cornCrop.blockID)
         {
          ((BlockCropCorn)ModCrops.cornCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

