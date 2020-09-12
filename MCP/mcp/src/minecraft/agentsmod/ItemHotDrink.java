package agentsmod;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHotDrink extends ItemFood
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
    private int potionId3;
    private int potionId4;
    private int potionId5;
    private int potionId6;
    private int potionDuration;
    private int potionDuration2;
    private int potionDuration3;
    private int potionDuration4;
    private int potionDuration5;
    private int potionDuration6;
    private int potionAmplifier;
    private int potionAmplifier2;
    private int potionAmplifier3;
    private int potionAmplifier4;
    private int potionAmplifier5;
    private int potionAmplifier6;
    private float potionEffectProbability;
    private float potionEffectProbability2;
    private float potionEffectProbability3;
    private float potionEffectProbability4;
    private float potionEffectProbability5;
    private float potionEffectProbability6;

    public ItemHotDrink(int par1, int par2, float par3, boolean par4)
    {
		super(par1, par2, par3, par4);
        this.itemUseDuration = 32;
        this.healAmount = par2;
        this.isWolfsFavoriteMeat = par4;
        this.saturationModifier = par3;
        this.setCreativeTab(ModCreativeTabs.tabDrinks);
    }

    public ItemHotDrink(int par1, int par2, boolean par3)
    {
        this(par1, par2, 0.6F, par3);
    }
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(ModFood.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        --par1ItemStack.stackSize;
        par3EntityPlayer.getFoodStats().addStats(this);
        par2World.playSoundAtEntity(par3EntityPlayer, "random.slurp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.chocolatemilk.itemID)
        {
        	par3EntityPlayer.heal(3);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.hotchocolatemilk.itemID)
        {
        	par3EntityPlayer.heal(5);
        }
        
        par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(ModFood.mug,1));
        return par1ItemStack;
    }
    
    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote && this.potionId > 0 && par2World.rand.nextFloat() < this.potionEffectProbability)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
        }
        if (!par2World.isRemote && this.potionId2 > 0 && par2World.rand.nextFloat() < this.potionEffectProbability2)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId2, this.potionDuration2 * 20, this.potionAmplifier2));
        }
        if (!par2World.isRemote && this.potionId3 > 0 && par2World.rand.nextFloat() < this.potionEffectProbability3)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId3, this.potionDuration3 * 20, this.potionAmplifier3));
        }
        if (!par2World.isRemote && this.potionId4 > 0 && par2World.rand.nextFloat() < this.potionEffectProbability4)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId4, this.potionDuration4 * 20, this.potionAmplifier4));
        }
        if (!par2World.isRemote && this.potionId5 > 0 && par2World.rand.nextFloat() < this.potionEffectProbability5)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId5, this.potionDuration5 * 20, this.potionAmplifier5));
        }
        if (!par2World.isRemote && this.potionId6 > 0 && par2World.rand.nextFloat() < this.potionEffectProbability6)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId6, this.potionDuration6 * 20, this.potionAmplifier6));
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));

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
    public ItemHotDrink setPotionEffect(int par1, int par2, int par3, float par4)
    {
        this.potionId = par1;
        this.potionDuration = par2;
        this.potionAmplifier = par3;
        this.potionEffectProbability = par4;
        return this;
    }
    
    public ItemHotDrink setPotionEffect2(int par1, int par2, int par3, float par4)
    {
        this.potionId2 = par1;
        this.potionDuration2 = par2;
        this.potionAmplifier2 = par3;
        this.potionEffectProbability2 = par4;
        return this;
    }
    
    public ItemHotDrink setPotionEffect3(int par1, int par2, int par3, float par4)
    {
        this.potionId3 = par1;
        this.potionDuration3 = par2;
        this.potionAmplifier3 = par3;
        this.potionEffectProbability3 = par4;
        return this;
    }
    
    public ItemHotDrink setPotionEffect4(int par1, int par2, int par3, float par4)
    {
        this.potionId4 = par1;
        this.potionDuration4 = par2;
        this.potionAmplifier4 = par3;
        this.potionEffectProbability4 = par4;
        return this;
    }
    
    public ItemHotDrink setPotionEffect5(int par1, int par2, int par3, float par4)
    {
        this.potionId5 = par1;
        this.potionDuration5 = par2;
        this.potionAmplifier5 = par3;
        this.potionEffectProbability5 = par4;
        return this;
    }
    
    public ItemHotDrink setPotionEffect6(int par1, int par2, int par3, float par4)
    {
        this.potionId6 = par1;
        this.potionDuration6 = par2;
        this.potionAmplifier6 = par3;
        this.potionEffectProbability6 = par4;
        return this;
    }

    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public ItemHotDrink setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }

}
