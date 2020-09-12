package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWalnutShellElectric3 extends EntityThrowable
{
    public EntityWalnutShellElectric3(World par1World)
    {
        super(par1World);

        //"/mods/ModFruits/textures/items/walnutshell.png"
    }

    public EntityWalnutShellElectric3(World par1World, EntityPlayer par3EntityPlayer)
    {
        super(par1World, par3EntityPlayer);
    }

    public EntityWalnutShellElectric3(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
	protected void onImpact(MovingObjectPosition movingobjectposition)
    {
    	int i = movingobjectposition.blockX;
        int j = movingobjectposition.blockY;
        int k = movingobjectposition.blockZ;
        
        worldObj.spawnEntityInWorld(new EntityLightningBolt(worldObj, i, j, k));
        
        if (movingobjectposition.entityHit != null)
        {
            movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 8);
        }

        for (int j1 = 0; j1 < 10; ++j1)
        {
           this.worldObj.spawnParticle("magicCrit", this.posX, this.posY, this.posZ, 0.0D, 100.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
    
    protected float getGravityVelocity()
    {
        return 0.09F;
    }

}
