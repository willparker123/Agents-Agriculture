package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBean2 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.beanCropb.blockID)
         {
          ((BlockCropBean2)ModCrops.beanCropb).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

