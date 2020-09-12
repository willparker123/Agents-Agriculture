package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventJungleTreeCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.jungleTreeCrop.blockID)
         {
          ((BlockCropJungleTree)ModCrops.jungleTreeCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

