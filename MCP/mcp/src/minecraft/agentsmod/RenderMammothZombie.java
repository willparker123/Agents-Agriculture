package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderPig;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

@SideOnly(Side.CLIENT)
public class RenderMammothZombie extends RenderLiving
{
    private static final ResourceLocation saddledTextures = new ResourceLocation("modmobs:mammothzombie_saddled.png");
    private static final ResourceLocation textures = new ResourceLocation("modmobs:mammothzombie.png");

    public RenderMammothZombie(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
    {
        super(par1ModelBase, par3);
        this.setRenderPassModel(par2ModelBase);
    }

    protected int renderSaddledMammothZombie(EntityMammothZombie par1EntityMammothZombie, int par2, float par3)
    {
        if (par2 == 0 && par1EntityMammothZombie.getSaddled())
        {
            this.bindTexture(saddledTextures);
            return 1;
        }
        else
        {
            return -1;
        }
    }

    protected ResourceLocation func_110886_a(EntityMammothZombie par1EntityMammothZombie)
    {
        return textures;
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.renderSaddledMammothZombie((EntityMammothZombie)par1EntityLivingBase, par2, par3);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return textures;
	}
}
