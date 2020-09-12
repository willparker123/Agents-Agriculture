package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemBlockPlanks extends ItemBlock
{
	public ItemBlockPlanks(int par1)
	{
		super(par1);
		setHasSubtypes(true);
	}
    
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch(itemstack.getItemDamage())
		{
		case 0:
		{
			name = "Chicle Wood Planks";
			break;
		}
		case 1:
		{
			name = "Cherry Wood Planks";
			break;
		}
		case 2:
		{
			name = "Orange Wood Planks";
			break;
		}
		case 3:
		{
			name = "Lemon Wood Planks";
			break;
		}
		case 4:
		{
			name = "Olive Wood Planks";
			break;
		}
		default:
			name = "Unknown Wood Planks";
		}
		return getUnlocalizedName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}
