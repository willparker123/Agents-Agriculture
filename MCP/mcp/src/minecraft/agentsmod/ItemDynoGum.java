package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ItemDynoGum extends ItemFood
{
    /** Number of ticks to run while 'EnumAction'ing until result. */
    public final int itemUseDuration;

    /** The amount this food item heals the player. */
    private final int healAmount;
    private final float saturationModifier;

    /** Whether wolves like this food (true for raw and cooked porkchop). */
    private final boolean isWolfsFavoriteMeat;

    /**
     * If this field is true, the food can be consumed even if the player don't need to eat.
     */
    private boolean alwaysEdible;

    /**
     * represents the potion effect that will occurr upon eating this food. Set by setPotionEffect
     */
    private int potionId;
    private int potionId2;
    private int potionDuration;
    private int potionDuration2;
    private int potionAmplifier;
    private int potionAmplifier2;
    private float potionEffectProbability;
    private float potionEffectProbability2;
    
    private int explosionRadius = 4;

    public ItemDynoGum(int par1, int par2, float par3, boolean par4)
    {
		super(par1, par2, par3, par4);
        this.itemUseDuration = 32;
        this.healAmount = par2;
        this.isWolfsFavoriteMeat = par4;
        this.saturationModifier = par3;
        this.setCreativeTab(ModCreativeTabs.tabFood);
    }

    public ItemDynoGum(int par1, int par2, boolean par3)
    {
        this(par1, par2, 0.6F, par3);
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFood.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 40;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.eat;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityDynoGum(par2World, par3EntityPlayer));
        }
        
        --par1ItemStack.stackSize;

        return par1ItemStack;
    }

    public int getHealAmount()
    {
        return this.healAmount;
    }

    /**
     * gets the saturationModifier of the ItemFood
     */
    public float getSaturationModifier()
    {
        return this.saturationModifier;
    }

    /**
     * Whether wolves like this food (true for raw and cooked porkchop).
     */
    public boolean isWolfsFavoriteMeat()
    {
        return this.isWolfsFavoriteMeat;
    }
    
    public boolean isMammothsFavoriteMeat()
    {
        return this.isMammothsFavoriteMeat();
    }

    /**
     * sets a potion effect on the item. Args: int potionId, int duration (will be multiplied by 20), int amplifier,
     * float probability of effect happening
     */
    public ItemDynoGum setPotionEffect(int par1, int par2, int par3, float par4)
    {
        this.potionId = par1;
        this.potionDuration = par2;
        this.potionAmplifier = par3;
        this.potionEffectProbability = par4;
        return this;
    }
    
    public ItemDynoGum setPotionEffect2(int par1, int par2, int par3, float par4)
    {
        this.potionId2 = par1;
        this.potionDuration2 = par2;
        this.potionAmplifier2 = par3;
        this.potionEffectProbability2 = par4;
        return this;
    }

    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ItemDynoGum setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
}
