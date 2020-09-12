package agentsmod;
 
import net.minecraftforge.event.ForgeSubscribe;

 import net.minecraftforge.event.entity.player.BonemealEvent;
 
public class CropEventGrapePurple4 
 {
  @ForgeSubscribe
     public void modmodfertiliserUsed(FertiliserEvent event)
     {
   if(event.world.getBlockId(event.X, event.Y, event.Z)== ModCrops.grapePurpleCropd.blockID)
         {
          ((BlockCropGrapePurple4)ModCrops.grapePurpleCropd).modfertilize(event.world, event.X, event.Y, event.Z);
         }
     }
 }

