package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBean4 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.beanCropd.blockID)
         {
          ((BlockCropBean4)ModCrops.beanCropd).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

