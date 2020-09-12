package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemWhisk extends Item
{
	public ItemWhisk(int i)
	{
		super(i);
		maxStackSize =  1;
		setMaxDamage(96);
		this.setCreativeTab(CreativeTabs.tabTools);
	}

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFood.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
	
	   @SideOnly(Side.CLIENT)

	    /**
	     * Returns True is the item is renderer in full 3D when hold.
	     */
	    public boolean isFull3D()
	    {
	        return true;
	    }

}