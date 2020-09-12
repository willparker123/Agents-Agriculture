package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventChicleCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.chicleCrop.blockID)
         {
          ((BlockCropChicle)ModCrops.chicleCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

