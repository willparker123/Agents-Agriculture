package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrape3 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapeCropc.blockID)
         {
          ((BlockCropGrape3)ModCrops.grapeCropc).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

