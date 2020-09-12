package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventRice 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.riceCrop.blockID)
         {
          ((BlockCropRice)ModCrops.riceCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

