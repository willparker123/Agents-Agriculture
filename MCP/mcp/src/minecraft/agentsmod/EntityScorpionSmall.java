package agentsmod;
 
import java.util.Random;

import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
 

public class EntityScorpionSmall extends EntityMob
 {
  public EntityScorpionSmall(World par1World) 
  {
   super(par1World);
   this.setSize(0.5F, 0.3F);
   this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 20.0D, false));
        this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 20.0D));
        this.tasks.addTask(5, new EntityAIWander(this, 20.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
  }
 

public int getAttackStrength(Entity par1Entity)
     {
      return 3;
     }

@Override
public boolean attackEntityAsMob(Entity par1Entity)
{
    if (super.attackEntityAsMob(par1Entity))
    {
        if (par1Entity instanceof EntityLiving)
        {
            byte var2 = 0;

            if (this.worldObj.difficultySetting > 1)
            {
                if (this.worldObj.difficultySetting == 2)
                {
                    var2 = 3;
                }
                else if (this.worldObj.difficultySetting == 3)
                {
                    var2 = 4;
                }
            }

            if (var2 > 0)
            {
                ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, var2 * 8, 0));
            }
        }

        return true;
    }
    else
    {
        return false;
    }
}
 
 
@Override
protected void applyEntityAttributes()
{
    super.applyEntityAttributes();
    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(5.0D);
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(1.6D);
}
  
 /*/
 @Override
 public EnumCreatureAttribute getCreatureAttribute()
     {
         return EnumCreatureAttribute.UNDEFINED;
     }
  /*/
 
 protected String getLivingSound()
 {
     return "mob.spider.say";
 }

 /**
  * Returns the sound this mob makes when it is hurt.
  */
 protected String getHurtSound()
 {
     return "mob.spider.say";
 }

 /**
  * Returns the sound this mob makes on death.
  */
 protected String getDeathSound()
 {
     return "mob.spider.death";
 }

 /**
  * Plays step sound at given x, y, z for the entity
  */
 protected void playStepSound(int par1, int par2, int par3, int par4)
 {
     this.playSound("mob.spider.step", 0.15F, 1.0F);
 }
 
 
 
 protected int getDropItemId()
 {
     return ModTools.scorpiontail.itemID;
 }

 /**
  * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
  * par2 - Level of Looting used to kill this mob.
  */
 protected void dropFewItems(boolean par1, int par2)
 {
  if(this.rand.nextInt(2) == 0)
  {
   this.dropItem(ModTools.poison.itemID, 1);
  }

  if(this.rand.nextInt(1) == 0)
  {
   this.dropItem(ModTools.scorpiontail.itemID, 1);
  }
 }
 }
 
