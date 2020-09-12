package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemScorpionTail extends ItemSword
{
	public ItemScorpionTail(int i)
	{
		super(i, ModTools.TAIL);
		maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setCreativeTab(ModCreativeTabs.tabOther);
	}

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFood.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
    
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
	 {
	         par2EntityLiving.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 1));
	         return true;
	 }
}