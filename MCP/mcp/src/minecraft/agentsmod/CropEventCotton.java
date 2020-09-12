package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventCotton 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.cottonCrop.blockID)
         {
          ((BlockCropCotton)ModCrops.cottonCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

