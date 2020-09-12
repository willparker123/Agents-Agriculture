package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventPea4 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.peaCropd.blockID)
         {
          ((BlockCropPea4)ModCrops.peaCropd).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

