package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBean 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.beanCrop.blockID)
         {
          ((BlockCropBean)ModCrops.beanCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

