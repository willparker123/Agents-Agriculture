package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventStrawberry 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.strawberryCrop.blockID)
         {
          ((BlockCropStrawberry)ModCrops.strawberryCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

