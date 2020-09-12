package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventTomato 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.tomatoCrop.blockID)
         {
          ((BlockCropTomato)ModCrops.tomatoCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }
