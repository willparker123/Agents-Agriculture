package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import agentsmod.ModFood;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityMammothZombie extends EntityAnimal
{
    /** AI task for player control. */
    private final EntityAIControlledByPlayer aiControlledByPlayer;

    public EntityMammothZombie(World par1World)
    {
    	super(par1World);
    	this.isImmuneToFire = true;
		this.setSize(3F, 4F);
		this.getNavigator().setAvoidsWater(false);

		this.tasks.addTask(0, new EntityAIMate(this, 1D));
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.6F));
		this.tasks.addTask(3, new EntityAITempt(this, 0.6F, ModTools.watch.itemID, false));
		this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityVillager.class, 8.0F));
		
		this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, true));
		this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, EntityMammoth.class, 0, true));
		this.tasks.addTask(9, new EntityAIAttackOnCollide(this, EntityMammoth.class, 1.0D, true));
		this.tasks.addTask(10, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
		this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
		
		//this.targetTasks.addTask(9, new EntityAIHurtByTarget(this, true));
		this.tasks.addTask(12, new EntityAIFollowParent(this, 1D));
		this.tasks.addTask(13, new EntityAIWander(this, 1D));
		this.tasks.addTask(14, new EntityAILookIdle(this));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */


    /**
     * returns true if all the conditions for steering the entity are met. For pigs, this is true if it is being ridden
     * by a player and the player is holding a carrot-on-a-stick
     */
    @Override
	public boolean canBeSteered()
	{
		ItemStack itemstack = ((EntityPlayer)this.riddenByEntity).getHeldItem();
		return itemstack != null && itemstack.itemID == ModTools.watch.itemID;
	}
    @Override
	public boolean isBreedingItem(ItemStack par1ItemStack)
	{
		return par1ItemStack != null && par1ItemStack.itemID == ModFood.straw.itemID;
	}

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    @Override
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setBoolean("Saddle", this.getSaddled());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);
        this.setSaddled(par1NBTTagCompound.getBoolean("Saddle"));
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
	 public int getAttackStrength(EntityMammothZombie par1Entity)
	 {
		 return 14;
	 }
	 /**
	  * Returns true if the newer Entity AI code should be run
	  */
	 @Override
	 public boolean isAIEnabled()
	 {
		 return true;
	 }

	 protected void updateAITasks()
	 {
		 super.updateAITasks();
	 }
	 

	    @Override
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(120.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
	    }

	 /**
	  * Returns the sound this mob makes while it's alive.
	  */
	 @Override
	 protected String getLivingSound()
	 {
		 return "modsounds:mammothzombiecry";
	 }

	 /**
	  * Returns the sound this mob makes when it is hurt.
	  */
	 @Override
	 protected String getHurtSound()
	 {
		 return "modsounds:mammothzombiehurt";
	 }

	 /**
	  * Returns the sound this mob makes on death.
	  */
	 @Override
	 protected String getDeathSound()
	 {
		 return "modsounds:mammothzombiedeath";
	 }

	 /**
	  * Plays step sound at given x, y, z for the entity
	  */
	 @Override
	 protected void playStepSound(int par1, int par2, int par3, int par4)
	 {
		 this.playSound("mob.cow.step", 0.15F, 1.0F);
	 }

	 /**
	  * Returns the volume for the sounds this mob makes.
	  */
	 @Override
	 protected float getSoundVolume()
	 {
		 return 1.2F;
	 }
    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
    	if (par1EntityPlayer.getCurrentEquippedItem() != null && par1EntityPlayer.getCurrentEquippedItem().itemID == Item.saddle.itemID)
		{
			par1EntityPlayer.inventory.consumeInventoryItem(Item.saddle.itemID);
			this.setSaddled(true);
			return true;
		}
        if (super.interact(par1EntityPlayer))
        {
            return true;
        }
        else if (this.getSaddled() && !this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == par1EntityPlayer))
        {
            par1EntityPlayer.mountEntity(this);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId2()
	{
		return ModTools.mammothfur.itemID;
	}

	protected int getDropItemId3()
	{
		return Item.leather.itemID;
	}
	
	protected int getDropItemId4()
	{
		return  this.isBurning() ? Item.rottenFlesh.itemID : Item.rottenFlesh.itemID;
	}
	
	protected int getDropItemId5()
	{
		return ModTools.tusk.itemID;
	}

    @Override
	 public double getMountedYOffset()
	 {
		 return (double)height * 1.0D;
	 }
    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    
	public void setAttackTarget(EntityLiving par1EntityLiving)
	{
		super.setAttackTarget(par1EntityLiving);
	}

	
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	{
		if (this.isEntityInvulnerable())
		{
			return false;
		}
		else
		{
			Entity entity = par1DamageSource.getEntity();
			
				if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
				{
					par2 = (par2 + 1) / 2;
				}

			return super.attackEntityFrom(par1DamageSource, par2);
		}
	}

    @Override
	public boolean attackEntityAsMob(Entity par1Entity)
	{
		return par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), 8);
	}

	@Override
	protected void attackEntity(Entity par1Entity, float par2)
	{
			par1Entity.attackEntityFrom(DamageSource.causeMobDamage(this), 8);
	}
	
    @Override
	protected boolean canDespawn()
	 {
		 return false;
	 }

	 @SideOnly(Side.CLIENT)
	 public String getTexture()
	 {
		 if (this.getSaddled())
		 {
			 return "modmobs:mammothzombie_saddled.png";
		 }
		 
		 return null;
	 }

	 @Override
	protected void dropFewItems(boolean par1, int par2)
	{
		if(this.rand.nextInt(2) == 0)
		{
			this.dropItem(Item.leather.itemID, 1);
		}

		if(this.rand.nextInt(1) == 0)
		{
			this.dropItem(Item.leather.itemID, 4);
		}

		if(this.rand.nextInt(3) == 0)
		{
			this.dropItem(Item.leather.itemID, 1);
		}


		if(this.rand.nextInt(2) == 0)
		{
			this.entityDropItem(new ItemStack(ModTools.mammothfur,1), 0.0F);
		}

		if(this.rand.nextInt(1) == 0)
		{
			this.entityDropItem(new ItemStack(ModTools.mammothfur,2), 0.0F);
		}

		if(this.rand.nextInt(3) == 0)
		{
			this.entityDropItem(new ItemStack(ModTools.mammothfur,2), 0.0F);
		}
		
		
		if(this.rand.nextInt(1) == 0)
		{
			if (this.isBurning())
			{
				this.entityDropItem(new ItemStack(Item.rottenFlesh,4), 0.0F);
			}
			else
			{
				this.entityDropItem(new ItemStack(Item.rottenFlesh,4), 0.0F);
			}
		}
		
		if(this.rand.nextInt(1) == 0)
		{
			this.entityDropItem(new ItemStack(ModTools.tusk,2), 0.0F);
		}
		
		if (this.getSaddled())
		{
			this.dropItem(Item.saddle.itemID, 1);
		}
	}

    /**
     * Returns true if the pig is saddled.
     */
    public boolean getSaddled()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    /**
     * Set or remove the saddle of the pig.
     */
    
    public void setSaddled(boolean par1)
    {
        if (par1)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)1));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)0));
        }
    }

    /**
     * Called when a lightning bolt hits the entity.
     */

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityMammothZombie spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityMammothZombie(this.worldObj);
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */

    /**
     * Return the AI task for player control.
     */
    
    public EntityAIControlledByPlayer getAIControlledByPlayer()
    {
        return this.aiControlledByPlayer;
    }

	 @Override
	 public int getMaxSpawnedInChunk()
	 {
		 return 4;
	 }

	 @Override
	 public boolean canMateWith(EntityAnimal par1EntityAnimal)
	 {
		 if (par1EntityAnimal == this)
		 {
			 return false;
		 }
		 else if (!(par1EntityAnimal instanceof EntityMammothZombie))
		 {
			 return false;
		 }
		 else
		 {
			 EntityMammothZombie var2 = (EntityMammothZombie)par1EntityAnimal;
			 return !this.isInLove() && var2.isInLove();
		 }
	 }

	 public boolean func_70922_bv()
	 {
		 return this.dataWatcher.getWatchableObjectByte(19) == 1;
	 }

	 //public boolean isBreedingItem(Item par1ItemStack)
	 //{
		 //return hasAttacked;
		 //return par1ItemStack(ModFood.cheese);
	 //}
	    @Override
	 public EnumCreatureAttribute getCreatureAttribute()
	 {
		 return EnumCreatureAttribute.UNDEAD;
	 }
	    @Override
    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
}
