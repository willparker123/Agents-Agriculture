package agentsmod;

import cpw.mods.fml.relauncher.Side;



import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityPig;


@SideOnly(Side.CLIENT)
public class RenderWhale extends RenderLiving
{
	private static final ResourceLocation textures = new ResourceLocation("modmobs:whale.png");
	   
    public RenderWhale(ModelWhale par1ModelBase, ModelBase par2ModelBase, float par2)
    {
        super(par1ModelBase, par2);
        this.setRenderPassModel(par2ModelBase);
    }

    public void renderWhale(EntityWhale par1EntityWhale, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityWhale, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderWhale((EntityWhale)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderWhale((EntityWhale)par1Entity, par2, par4, par6, par8, par9);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return textures;
	}

}
