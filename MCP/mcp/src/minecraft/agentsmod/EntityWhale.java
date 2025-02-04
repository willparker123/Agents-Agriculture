package agentsmod;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWhale extends EntityWaterMob
{
	/*/
	
    public float tailAngle;

    
    public float prevTailAngle;

    public float whalePitch = 4.0F; //
    public float prevwhalePitch = 0.0F; //
    public float whaleYaw = 4.0F; //
    public float prevWhaleYaw = 0.0F; //
    public float field_70867_h = 0.0F; //
    public float field_70868_i = 0.0F; //

    private float field_70864_bA = 0.0F; //
    private float field_70871_bB = 0.0F; //
    
    private float randomMotionSpeed = 0.3F;
    private float randomMotionVecX = 0.4F;
    private float randomMotionVecY = 0.0F;
    private float randomMotionVecZ = 0.4F;
    /*/

    public float whalePitch;
    public float prevwhalePitch;
    public float whaleYaw;
    public float prevWhaleYaw;
    public float field_70867_h;
    public float field_70868_i;

    /** angle of the tentacles in radians */
    public float tailAngle;

    /** the last calculated angle of the tentacles in radians */
    public float prevTailAngle;
    private float randomMotionSpeed;
    private float field_70864_bA;
    private float field_70871_bB;
    private float randomMotionVecX;
    private float randomMotionVecY;
    private float randomMotionVecZ;

    public EntityWhale(World par1World)
    {
        super(par1World);
        this.setSize(6.0F, 6.0F);
        //this.tasks.addTask(0, new EntityAISwimming(this));
    }
    
    public boolean canBreatheUnderwater()
    {
        return true;
    }
    
    @Override
    public void onEntityUpdate()
    {
        int i = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !this.isInsideOfMaterial(Material.water))
        {
            --i;
            this.setAir(i);

            if (this.getAir() == -20)
            {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.drown, 2);
            }
        }
        else
        {
            this.setAir(300);
        }
    }
    
    protected String getLivingSound()
    {
        return "modsounds:whalecry";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "modsounds:whalehurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "modsounds:whaledeath";
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(120.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.1D);
    }
    
    public double getMountedYOffset()
    {
    	return (double)height * 15.0D;
    	}
    
    public int getAttackStrength(EntityMammoth par1Entity)
    {
        return 8;
    }
    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    public boolean isAIEnabled()
    {
        return true;
    }
    
    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 1.6F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected int getDropItemId()
    {
        return ModTools.whalefat.itemID;
    }
    
    protected void dropFewItems(boolean par1, int par2)
    {
     if(this.rand.nextInt(1) == 0)
     {
      this.dropItem(ModTools.whalefat.itemID, 16);
     }
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    public boolean getCanSpawnHere()
    {
        return this.posY > 40.0D && this.posY < 60.0D && super.getCanSpawnHere();
    }
    
    //public boolean isInWater()
    //{
    //    return this.worldObj.handleMaterialAcceleration(this.boundingBox.expand(0.0D, 0.0D, 0.0D), Material.water, this);
    //}
    @Override
	 public int getMaxSpawnedInChunk()
	 {
		 return 1;
	 }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float par1, float par2)
    {
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
    }
    
    /*/
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.prevSquidPitch = this.squidPitch;
        this.prevSquidYaw = this.squidYaw;
        this.field_70868_i = this.field_70867_h;
        this.field_70867_h += this.field_70864_bA;

        if (this.field_70867_h > ((float)Math.PI * 2F))
        {
            this.field_70867_h -= ((float)Math.PI * 2F);

            if (this.rand.nextInt(10) == 0)
            {
                this.field_70864_bA = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
            }
        }

        if (this.isInWater())
        {
            float f;

            if (this.field_70867_h < (float)Math.PI)
            {
                f = this.field_70867_h / (float)Math.PI;
                this.tentacleAngle = MathHelper.sin(f * f * (float)Math.PI) * (float)Math.PI * 0.25F;

                if ((double)f > 0.75D)
                {
                    this.randomMotionSpeed = 1.0F;
                    this.field_70871_bB = 1.0F;
                }
                else
                {
                    this.field_70871_bB *= 0.8F;
                }
            }
            else
            {
              this.randomMotionSpeed *= 0.9F;
                this.field_70871_bB *= 0.99F;
            }

            if (!this.worldObj.isRemote)
            {
                this.motionX = (double)(this.randomMotionVecX * this.randomMotionSpeed);
                this.motionY = (double)(this.randomMotionVecY * this.randomMotionSpeed);
                this.motionZ = (double)(this.randomMotionVecZ * this.randomMotionSpeed);
            }

            f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.renderYawOffset += (-((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float)Math.PI - this.renderYawOffset) * 0.1F;
            this.rotationYaw = this.renderYawOffset;
            this.squidYaw += (float)Math.PI * this.field_70871_bB * 1.5F;
            this.squidPitch += (-((float)Math.atan2((double)f, this.motionY)) * 180.0F / (float)Math.PI - this.squidPitch) * 0.1F;
        }
        else
        {
           
            if (!this.worldObj.isRemote)
            {
                this.motionX = 0.0D;
                this.motionY -= 0.08D;
                this.motionY *= 0.9800000190734863D;
                this.motionZ = 0.0D;
            }

            this.squidPitch = (float)((double)this.squidPitch + (double)(-90.0F - this.squidPitch) * 0.02D);
        }

    }
           /*/
    
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.prevwhalePitch = this.whalePitch;
        this.prevWhaleYaw = this.whaleYaw;
        this.field_70868_i = this.field_70867_h;
        this.prevTailAngle = this.tailAngle;
        this.field_70867_h += this.field_70864_bA;

        if (this.field_70867_h > ((float)Math.PI * 2F))
        {
            this.field_70867_h -= ((float)Math.PI * 2F);

            if (this.rand.nextInt(10) == 0)
            {
                this.field_70864_bA = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
            }
        }

        if (this.isInWater())
        {
            float f;

            if (this.field_70867_h < (float)Math.PI)
            {
                f = this.field_70867_h / (float)Math.PI;

                if ((double)f > 0.75D)
                {
                    this.randomMotionSpeed = 0.7F; //0.7F
                    this.field_70871_bB = 1.0F;
                }
                else
                {
                   this.randomMotionSpeed = 0.7F; //0.7F
                    this.field_70871_bB *= 1.0F;
                }
            }
            else
            {
                this.randomMotionSpeed *= 0.7F; //0.7F
                this.field_70871_bB *= 1.0F;
            }

            if (!this.worldObj.isRemote)
            {
                this.motionX = (double)(this.randomMotionVecX * this.randomMotionSpeed);
                this.motionY = (double)(this.randomMotionVecY * this.randomMotionSpeed);
                this.motionZ = (double)(this.randomMotionVecZ * this.randomMotionSpeed);
            }

            f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.renderYawOffset += (-((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / (float)Math.PI - this.renderYawOffset) * 0.1F;
            this.rotationYaw = this.renderYawOffset;
            this.whaleYaw += (float)Math.PI * this.field_70871_bB * 1.5F;
            this.whalePitch += (-((float)Math.atan2((double)f, this.motionY)) * 180.0F / (float)Math.PI - this.whalePitch) * 0.1F;
        }
        else
        {

            if (!this.worldObj.isRemote)
            {
                this.motionX = 0.0D;
                this.motionY -= 0.5D;
                this.motionY *= 0.9800000190734863D;
                this.motionZ = 0.0D;
            }

            this.whalePitch = (float)((double)this.whalePitch + (double)(-90.0F - this.whalePitch) * 0.02D);
        }
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    
    protected void updateEntityActionState()
    {
        ++this.entityAge;

        if (this.entityAge > 100)
        {
            this.randomMotionVecX = this.randomMotionVecY = this.randomMotionVecZ = 0.0F;
        }
        else if (this.rand.nextInt(50) == 0 || !this.inWater || this.randomMotionVecX == 0.0F && this.randomMotionVecY == 0.0F && this.randomMotionVecZ == 0.0F)
        {
            float f = this.rand.nextFloat() * (float)Math.PI * 2.0F;
            this.randomMotionVecX = MathHelper.cos(f) * 0.2F;
            this.randomMotionVecY = -0.1F + this.rand.nextFloat() * 0.2F;
            this.randomMotionVecZ = MathHelper.sin(f) * 0.2F;
        }

        this.despawnEntity();
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */


}
