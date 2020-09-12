package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventBlackcurrant 
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.blackcurrantCrop.blockID)
         {
          ((BlockCropBlackcurrant)ModCrops.blackcurrantCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

