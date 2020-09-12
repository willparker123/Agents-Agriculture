package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBarley 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.barleyCrop.blockID)
         {
          ((BlockCropBarley)ModCrops.barleyCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

