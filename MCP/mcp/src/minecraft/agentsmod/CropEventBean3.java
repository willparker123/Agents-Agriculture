package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBean3 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.beanCropc.blockID)
         {
          ((BlockCropBean3)ModCrops.beanCropc).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

