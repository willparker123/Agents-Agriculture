// Date: 10/02/2013 16:15:28
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelModel extends ModelBase
{
  //fields
    ModelRenderer Body1;
    ModelRenderer Tail1;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Tail5;
    ModelRenderer Tail3;
    ModelRenderer Tail2;
    ModelRenderer Tail4;
  
  public ModelModel()
  {
    textureWidth = 2000;
    textureHeight = 2000;
    
      Body1 = new ModelRenderer(this, 0, 650);
      Body1.addBox(-70F, -120F, -130F, 80, 92, 150);
      Body1.setRotationPoint(31F, 50F, 59F);
      Body1.setTextureSize(64, 32);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 0, 0);
      Tail1.addBox(-38F, 0F, 0F, 40, 32, 200);
      Tail1.setRotationPoint(-1F, -70F, 75F);
      Tail1.setTextureSize(64, 32);
      Tail1.mirror = true;
      setRotation(Tail1, -0.1047198F, 0.1047198F, 0F);
      Head1 = new ModelRenderer(this, 0, 240);
      Head1.addBox(-70F, -120F, -200F, 80, 45, 140);
      Head1.setRotationPoint(31F, 52F, -11F);
      Head1.setTextureSize(64, 32);
      Head1.mirror = true;
      setRotation(Head1, -0.0371786F, 0F, 0F);
      Head2 = new ModelRenderer(this, 0, 440);
      Head2.addBox(-70F, -121F, -130F, 74, 44, 150);
      Head2.setRotationPoint(34F, 86F, -114F);
      Head2.setTextureSize(64, 32);
      Head2.mirror = true;
      setRotation(Head2, -0.3665191F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 0, 0);
      Tail5.addBox(-20F, 60F, -23F, 40, 32, 200);
      Tail5.setRotationPoint(1F, -71F, 79F);
      Tail5.setTextureSize(64, 32);
      Tail5.mirror = true;
      setRotation(Tail5, 0.2094395F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 0, 0);
      Tail3.addBox(-36F, 31F, -26F, 36, 59, 125);
      Tail3.setRotationPoint(0F, -70F, 79F);
      Tail3.setTextureSize(64, 32);
      Tail3.mirror = true;
      setRotation(Tail3, 0.2094395F, 0.1047198F, 0F);
      Tail2 = new ModelRenderer(this, 0, 0);
      Tail2.addBox(0F, 0F, 0F, 40, 32, 200);
      Tail2.setRotationPoint(1F, -70F, 75F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, -0.1047198F, -0.1047198F, 0F);
      Tail4 = new ModelRenderer(this, 0, 0);
      Tail4.addBox(0F, 32F, -27F, 36, 58, 124);
      Tail4.setRotationPoint(2F, -71F, 80F);
      Tail4.setTextureSize(64, 32);
      Tail4.mirror = true;
      setRotation(Tail4, 0.2094395F, -0.1047198F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body1.render(f5);
    Tail1.render(f5);
    Head1.render(f5);
    Head2.render(f5);
    Tail5.render(f5);
    Tail3.render(f5);
    Tail2.render(f5);
    Tail4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
