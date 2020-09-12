package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventPea3 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.peaCropc.blockID)
         {
          ((BlockCropPea3)ModCrops.peaCropc).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

