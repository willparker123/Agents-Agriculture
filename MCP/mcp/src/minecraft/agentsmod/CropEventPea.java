package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventPea 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.peaCrop.blockID)
         {
          ((BlockCropPea)ModCrops.peaCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

