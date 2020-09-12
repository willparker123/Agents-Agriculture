// Date: 13/01/2013 10:37:34
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelNew extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer RightArm;
    ModelRenderer Head;
    ModelRenderer Float1;
    ModelRenderer Float2;
    ModelRenderer Float3;
    ModelRenderer Float4;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Body4;
    ModelRenderer RightArm2;
    ModelRenderer LeftArm;
    ModelRenderer LeftArm2;
  
  public ModelNew()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Body = new ModelRenderer(this, 0, 238);
      Body.addBox(0F, 0F, 0F, 10, 10, 8);
      Body.setRotationPoint(-5F, 0F, 0F);
      Body.setTextureSize(256, 256);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      RightArm = new ModelRenderer(this, 0, 172);
      RightArm.addBox(0F, 0F, 0F, 4, 10, 6);
      RightArm.setRotationPoint(-12.5F, -12F, 1F);
      RightArm.setTextureSize(256, 256);
      RightArm.mirror = true;
      setRotation(RightArm, -0.0349066F, -0.0349066F, 0.1047198F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 0F, 0F, 10, 10, 10);
      Head.setRotationPoint(-5F, -23F, -1F);
      Head.setTextureSize(256, 256);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Float1 = new ModelRenderer(this, 228, 0);
      Float1.addBox(0F, 0F, 0F, 8, 1, 6);
      Float1.setRotationPoint(-4F, 11.5F, 1F);
      Float1.setTextureSize(256, 256);
      Float1.mirror = true;
      setRotation(Float1, 0F, 0F, 0F);
      Float2 = new ModelRenderer(this, 233, 7);
      Float2.addBox(0F, 0F, 0F, 6, 1, 5);
      Float2.setRotationPoint(-3F, 13.5F, 1F);
      Float2.setTextureSize(256, 256);
      Float2.mirror = true;
      setRotation(Float2, 0F, 0F, 0F);
      Float3 = new ModelRenderer(this, 239, 13);
      Float3.addBox(0F, 0F, 0F, 4, 1, 4);
      Float3.setRotationPoint(-2F, 15.5F, 1F);
      Float3.setTextureSize(256, 256);
      Float3.mirror = true;
      setRotation(Float3, 0F, 0F, 0F);
      Float4 = new ModelRenderer(this, 245, 18);
      Float4.addBox(0F, 0F, 0F, 2, 1, 3);
      Float4.setRotationPoint(-1F, 17.5F, 1F);
      Float4.setTextureSize(256, 256);
      Float4.mirror = true;
      setRotation(Float4, 0F, 0F, 0F);
      Body2 = new ModelRenderer(this, 0, 222);
      Body2.addBox(0F, 0F, 0F, 12, 4, 10);
      Body2.setRotationPoint(-6F, -4F, -1F);
      Body2.setTextureSize(256, 256);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0F);
      Body3 = new ModelRenderer(this, 0, 206);
      Body3.addBox(0F, 0F, 0F, 14, 4, 12);
      Body3.setRotationPoint(-7F, -8F, -2F);
      Body3.setTextureSize(256, 256);
      Body3.mirror = true;
      setRotation(Body3, 0F, 0F, 0F);
      Body4 = new ModelRenderer(this, 0, 188);
      Body4.addBox(0F, 0F, 0F, 16, 4, 14);
      Body4.setRotationPoint(-8F, -12F, -3F);
      Body4.setTextureSize(256, 256);
      Body4.mirror = true;
      setRotation(Body4, 0F, 0F, 0F);
      RightArm2 = new ModelRenderer(this, 20, 169);
      RightArm2.addBox(0F, 0F, 0F, 4, 13, 6);
      RightArm2.setRotationPoint(-13.5F, -2F, 0.6F);
      RightArm2.setTextureSize(256, 256);
      RightArm2.mirror = true;
      setRotation(RightArm2, 0F, -0.0349066F, -0.0349066F);
      LeftArm = new ModelRenderer(this, 0, 156);
      LeftArm.addBox(0F, 0F, 0F, 4, 10, 6);
      LeftArm.setRotationPoint(8.8F, -12F, 1F);
      LeftArm.setTextureSize(256, 256);
      LeftArm.mirror = true;
      setRotation(LeftArm, -0.0349066F, -0.0349066F, -0.1047198F);
      LeftArm2 = new ModelRenderer(this, 20, 150);
      LeftArm2.addBox(0F, 0F, 0F, 4, 13, 6);
      LeftArm2.setRotationPoint(9.8F, -2.5F, 0.7F);
      LeftArm2.setTextureSize(256, 256);
      LeftArm2.mirror = true;
      setRotation(LeftArm2, 0F, -0.0349066F, 0.0349066F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    RightArm.render(f5);
    Head.render(f5);
    Float1.render(f5);
    Float2.render(f5);
    Float3.render(f5);
    Float4.render(f5);
    Body2.render(f5);
    Body3.render(f5);
    Body4.render(f5);
    RightArm2.render(f5);
    LeftArm.render(f5);
    LeftArm2.render(f5);
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
