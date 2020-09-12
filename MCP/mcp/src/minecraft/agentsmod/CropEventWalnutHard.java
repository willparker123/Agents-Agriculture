package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventWalnutHard 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.walnutHardCrop.blockID)
         {
          ((BlockCropWalnutHard)ModCrops.walnutHardCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

