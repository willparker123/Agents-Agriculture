package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventLettuce 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.lettuceCrop.blockID)
         {
          ((BlockCropLettuce)ModCrops.lettuceCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

