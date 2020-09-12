package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventWalnutGold
 {
  @ForgeSubscribe
     public void modfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.walnutGoldCrop.blockID)
         {
          ((BlockCropWalnutGold)ModCrops.walnutGoldCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

