package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventLemonCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.lemonCrop.blockID)
         {
          ((BlockCropLemon)ModCrops.lemonCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

