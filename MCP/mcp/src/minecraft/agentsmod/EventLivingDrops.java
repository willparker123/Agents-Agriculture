package agentsmod;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventLivingDrops
{
	public static double rand;

	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {

		rand = Math.random(); //Initializes double "rand"

		if (event.entityLiving instanceof EntityHorse) { //Checks the entity killed.
			if (rand < 1D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.horsemeatCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.horsemeatRaw.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}

			if (rand < 1D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.horsemeatCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.horsemeatRaw.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}
			
			if (rand < 0.2D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.horsemeatCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.horsemeatRaw.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}
		}
		
		
		
		if (event.entityLiving instanceof EntitySheep) { //Checks the entity killed.
			if (rand < 1D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.lambCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.lambRaw.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}

			if (rand < 0.3D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.lambCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.lambRaw.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}
		}



		if (event.entityLiving instanceof EntityPig) { //Checks the entity killed.
			if (rand < 1D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.ribsCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.ribs.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}

			if (rand < 0.15D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.ribsCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.ribs.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}

			if (rand < 1D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.porkscratching.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.pigskin.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}
		}



		if (event.entityLiving instanceof EntityCow) { //Checks the entity killed.
			if (rand < 1D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.ribsCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.ribs.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}

			if (rand < 0.3D) { //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				if (event.entityLiving.isBurning())
				{
					event.entityLiving.dropItem(ModFood.ribsCooked.itemID,1); //Use "itemID" not "shiftedIndex"
				}
				else
				{
					event.entityLiving.dropItem(ModFood.ribs.itemID,1); //Use "itemID" not "shiftedIndex"
				}
			}
		}



		if (event.entityLiving instanceof EntityWolf) { //Checks the entity killed.
			if (rand < 1D)
			{ //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				event.entityLiving.dropItem(ModTools.wolffur.itemID,1); //Use "itemID" not "shiftedIndex"
			}

			if (rand < 0.3D)
			{ //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				event.entityLiving.dropItem(ModTools.wolffur.itemID,1); //Use "itemID" not "shiftedIndex"
			}

			if (rand < 0.1D)
			{ //Makes drop 100% drop chance. Example: (0.25D = 25%, 1D = 100%, etc.);
				event.entityLiving.dropItem(ModTools.wolffur.itemID,1); //Use "itemID" not "shiftedIndex"
			}
		}
	}
}

