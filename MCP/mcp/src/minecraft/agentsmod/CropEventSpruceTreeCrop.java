package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventSpruceTreeCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.spruceTreeCrop.blockID)
         {
          ((BlockCropSpruceTree)ModCrops.spruceTreeCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

