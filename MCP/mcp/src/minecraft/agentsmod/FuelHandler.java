package agentsmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		
		if(var1 == Item.book.itemID){
			return 300;
		}else if(var1 == ModBlocks.planks.blockID){
			return 300;
		}else if(var1 == ModCrops.lemonLog.blockID){
			return 400;
		}else if(var1 == ModCrops.orangeLog.blockID){
			return 350;
		}else if(var1 == ModCrops.oliveLog.blockID){
			return 400;
		}else if(var1 == ModCrops.chicleLog.blockID){
			return 500;
		}else if(var1 == ModCrops.cherryLog.blockID){
			return 300;
		}else{
			return 0;
		}
	}
}