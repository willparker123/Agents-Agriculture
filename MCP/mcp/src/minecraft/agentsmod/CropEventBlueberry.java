package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBlueberry 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.blueberryCrop.blockID)
         {
          ((BlockCropBlueberry)ModCrops.blueberryCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

