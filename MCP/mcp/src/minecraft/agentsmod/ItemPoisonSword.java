package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.src.*;

public class ItemPoisonSword extends ItemSword
{
    private int weaponDamage;
    
	public ItemPoisonSword(int i, EnumToolMaterial enumtoolmaterial)
	{
		super(i, enumtoolmaterial);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabCombat);
		}
	
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModTools.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
	 {
	         par1ItemStack.damageItem(4, par3EntityLiving);
	         par2EntityLiving.addPotionEffect(new PotionEffect(Potion.poison.id, 300, 0));
	         return true;
	 }

	}