package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWalnutShellFire extends EntityThrowable
{
	public EntityWalnutShellFire(World par1World)
	{
		super(par1World);
		//"/mods/ModFruits/textures/items/walnutshell.png"
	}

	public EntityWalnutShellFire(World par1World, EntityPlayer par3EntityPlayer)
	{
		super(par1World, par3EntityPlayer);
	}

	public EntityWalnutShellFire(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
	{
		if (par1MovingObjectPosition.entityHit != null)
		{
			par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 8);
			par1MovingObjectPosition.entityHit.setFire(12);
		}

		for (int j = 0; j < 20; ++j)
		{
			this.worldObj.spawnParticle("flame", this.posX, this.posY, this.posZ, 1000.0D, 1000.0D, 1000.0D);
		}

		if (!this.worldObj.isRemote)
		{
				int i = par1MovingObjectPosition.blockX;
				int j = par1MovingObjectPosition.blockY;
				int k = par1MovingObjectPosition.blockZ;

				switch (par1MovingObjectPosition.sideHit)
				{
				case 0:
					--j;
					break;
				case 1:
					++j;
					break;
				case 2:
					--k;
					break;
				case 3:
					++k;
					break;
				case 4:
					--i;
					break;
				case 5:
					++i;
				}

				if (this.worldObj.isAirBlock(i, j, k))
				{
					this.worldObj.setBlock(i, j, k, Block.fire.blockID);
				}
			}
        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
	}

    protected float getGravityVelocity()
    {
        return 0.055F;
    }
    
}
