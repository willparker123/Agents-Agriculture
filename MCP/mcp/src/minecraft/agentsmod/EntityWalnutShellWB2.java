
package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWalnutShellWB2 extends EntityThrowable
{
    public int field_92057_e = 500;
    
    public EntityWalnutShellWB2(World par1World)
    {
        super(par1World);

        //"/mods/ModFruits/textures/items/walnutshell.png"
    }

    public EntityWalnutShellWB2(World par1World, EntityPlayer par3EntityPlayer)
    {
        super(par1World, par3EntityPlayer);
    }

    public EntityWalnutShellWB2(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
    	boolean flag = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");

    	this.worldObj.newExplosion((Entity)null, this.posX, this.posY, this.posZ, (float)this.field_92057_e, true, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
        
        if (par1MovingObjectPosition.entityHit != null)
        {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 6);
        }

        for (int j = 0; j < 30; ++j)
        {
            this.worldObj.spawnParticle("largeExplode", this.posX, this.posY, this.posZ, 1300.0D, 510.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
    
    public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeEntityToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setInteger("ExplosionPower", this.field_92057_e);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readEntityFromNBT(par1NBTTagCompound);

        if (par1NBTTagCompound.hasKey("ExplosionPower"))
        {
            this.field_92057_e = par1NBTTagCompound.getInteger("ExplosionPower");
        }
    }
    
    protected float getGravityVelocity()
    {
        return 0.085F;
    }
}
