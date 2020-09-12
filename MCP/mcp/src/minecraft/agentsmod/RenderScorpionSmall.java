package agentsmod;
 
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
 
@SideOnly(Side.CLIENT)
public class RenderScorpionSmall extends RenderLiving
 {
	private static final ResourceLocation textures = new ResourceLocation("modmobs:scorpionsmall.png");
    
  protected ModelScorpionSmall model;
  
 public RenderScorpionSmall (ModelScorpionSmall modelBase, float f)
  {
   super(modelBase, f);
   model = ((ModelScorpionSmall)mainModel);
  }
  
 public void renderScorpionSmall(EntityScorpionSmall entity, double par2, double par4, double par6, float par8, float par9)
     {
         super.doRenderLiving(entity, par2, par4, par6, par8, par9);
     }
  
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
     {
         renderScorpionSmall((EntityScorpionSmall)par1EntityLiving, par2, par4, par6, par8, par9);
     }
  
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
     {
         renderScorpionSmall((EntityScorpionSmall)par1Entity, par2, par4, par6, par8, par9);
     }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return textures;
	}
 }