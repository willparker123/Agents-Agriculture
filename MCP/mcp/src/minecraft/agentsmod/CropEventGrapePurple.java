package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrapePurple 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapePurpleCrop.blockID)
         {
          ((BlockCropGrapePurple)ModCrops.grapePurpleCrop).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

