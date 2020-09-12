package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrape4 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapeCropd.blockID)
         {
          ((BlockCropGrape4)ModCrops.grapeCropd).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

