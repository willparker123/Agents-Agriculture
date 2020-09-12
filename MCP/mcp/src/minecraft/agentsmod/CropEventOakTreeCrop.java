package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventOakTreeCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.oakTreeCrop.blockID)
         {
          ((BlockCropOakTree)ModCrops.oakTreeCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

