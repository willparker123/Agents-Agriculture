package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventRose 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.roseCrop.blockID)
         {
          ((BlockCropRose)ModCrops.roseCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

