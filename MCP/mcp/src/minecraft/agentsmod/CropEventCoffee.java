package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventCoffee 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.coffeeCrop.blockID)
         {
          ((BlockCropCoffee)ModCrops.coffeeCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

