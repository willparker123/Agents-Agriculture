package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrape 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapeCrop.blockID)
         {
          ((BlockCropGrape)ModCrops.grapeCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

