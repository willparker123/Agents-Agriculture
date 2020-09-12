package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrapePurple3 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapePurpleCropc.blockID)
         {
          ((BlockCropGrapePurple3)ModCrops.grapePurpleCropc).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

