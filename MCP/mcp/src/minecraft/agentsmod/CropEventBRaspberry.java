package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBRaspberry 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.braspberryCrop.blockID)
         {
          ((BlockCropBRaspberry)ModCrops.braspberryCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

