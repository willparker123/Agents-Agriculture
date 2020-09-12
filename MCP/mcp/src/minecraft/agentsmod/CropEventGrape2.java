package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrape2 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapeCropb.blockID)
         {
          ((BlockCropGrape2)ModCrops.grapeCropb).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

