package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;

public class ItemMagicYeast extends Item
{
	public ItemMagicYeast(int i)
	{
		super(i);
		maxStackSize = 64;
		this.setCreativeTab(ModCreativeTabs.tabFood);
	}

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFood.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}

}