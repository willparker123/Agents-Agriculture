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

public class ItemFood2 extends ItemFood
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

    public ItemFood2(int par1, int par2, float par3, boolean par4)
    {
		super(par1, par2, par3, par4);
        this.itemUseDuration = 32;
        this.healAmount = par2;
        this.isWolfsFavoriteMeat = par4;
        this.saturationModifier = par3;
        this.setCreativeTab(ModCreativeTabs.tabFood);
    }

    public ItemFood2(int par1, int par2, boolean par3)
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
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.cheese.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.buttiebeef.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.buttiechicken.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.buttiefish.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.buttiepork.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.buttiesalami.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.buttiecheese.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.buttiebacon.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.jamtoast.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.porkscratching.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pizzaveg.itemID)
        {
        	par3EntityPlayer.heal(8);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pizzavegstuffed.itemID)
        {
        	par3EntityPlayer.heal(10);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pizzacheese.itemID)
        {
        	par3EntityPlayer.heal(7);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pizzacheesestuffed.itemID)
        {
        	par3EntityPlayer.heal(9);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.burgerRegular.itemID)
        {
        	par3EntityPlayer.heal(3);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.burgerCheese.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.burgerBacon.itemID)
        {
        	par3EntityPlayer.heal(8);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.burgerBaconCheese.itemID)
        {
        	par3EntityPlayer.heal(12);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.biscuitfruit.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.minticecream.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.cminticecream.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.goldcookie.itemID)
        {
        	par3EntityPlayer.heal(10);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.ribsCookedK.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.lambCookedK.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.beefCookedK.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.chickenCookedK.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.porkCookedK.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.fishCookedK.itemID)
        {
        	par3EntityPlayer.heal(7);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.sushi.itemID)
        {
        	par3EntityPlayer.heal(3);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pancake.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pancakeChocolate.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pancakeJam.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.pancakeTreacle.itemID)
        {
        	par3EntityPlayer.heal(6);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.waffle.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.waffleChocolate.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.waffleJam.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.waffleTreacle.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.frenchtoast.itemID)
        {
        	par3EntityPlayer.heal(3);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.croissant.itemID)
        {
        	par3EntityPlayer.heal(3);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.croissantChocolate.itemID)
        {
        	par3EntityPlayer.heal(3);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.crumpet.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.scone.itemID)
        {
        	par3EntityPlayer.heal(5);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.sconeJam.itemID)
        {
        	par3EntityPlayer.heal(8);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.tomatoCooked.itemID)
        {
        	par3EntityPlayer.heal(2);
        }
        
        if (par3EntityPlayer.getCurrentEquippedItem() != null && par3EntityPlayer.getCurrentEquippedItem().itemID == ModFood.blackpudding.itemID)
        {
        	par3EntityPlayer.heal(4);
        }
        
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
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
        return EnumAction.eat;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.canEat(this.alwaysEdible))
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

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
    public ItemFood2 setPotionEffect(int par1, int par2, int par3, float par4)
    {
        this.potionId = par1;
        this.potionDuration = par2;
        this.potionAmplifier = par3;
        this.potionEffectProbability = par4;
        return this;
    }
    
    public ItemFood2 setPotionEffect2(int par1, int par2, int par3, float par4)
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
    public ItemFood2 setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }

}
