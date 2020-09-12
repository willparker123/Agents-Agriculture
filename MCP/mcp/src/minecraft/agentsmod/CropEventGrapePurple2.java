package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrapePurple2 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapePurpleCropb.blockID)
         {
          ((BlockCropGrapePurple2)ModCrops.grapePurpleCropb).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

