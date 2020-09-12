package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventCherryCrop 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.cherryCrop.blockID)
         {
          ((BlockCropCherry)ModCrops.cherryCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

