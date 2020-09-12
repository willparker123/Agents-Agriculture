// Date: 02/02/2013 23:48:13
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelModel extends ModelBase
{
  //fields
    ModelRenderer FRightLeg1;
    ModelRenderer FLeftLeg1;
    ModelRenderer BLeftLeg1;
    ModelRenderer BRightLeg1;
    ModelRenderer Body1;
    ModelRenderer Body2;
    ModelRenderer Body3;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Body4;
    ModelRenderer Body5;
    ModelRenderer Head2;
    ModelRenderer Head1;
    ModelRenderer Head3;
    ModelRenderer Trunk1;
    ModelRenderer Trunk2;
    ModelRenderer Trunk3;
    ModelRenderer Tusk1;
    ModelRenderer Tusk2;
    ModelRenderer Tusk1b;
    ModelRenderer Tusk2b;
    ModelRenderer Tusk2c;
    ModelRenderer Tusk1c;
    ModelRenderer Tusk1d;
    ModelRenderer Tusk2d;
  
  public ModelModel()
  {
    textureWidth = 512;
    textureHeight = 512;
    
      FRightLeg1 = new ModelRenderer(this, 0, 0);
      FRightLeg1.addBox(-12F, 2F, 0F, 12, 30, 12);
      FRightLeg1.setRotationPoint(4F, -10F, 7F);
      FRightLeg1.setTextureSize(512, 512);
      FRightLeg1.mirror = true;
      setRotation(FRightLeg1, 0F, 0.1047198F, 0F);
      FLeftLeg1 = new ModelRenderer(this, 0, 0);
      FLeftLeg1.addBox(-12F, 4F, -12F, 12, 30, 12);
      FLeftLeg1.setRotationPoint(2F, -10F, -8F);
      FLeftLeg1.setTextureSize(512, 512);
      FLeftLeg1.mirror = true;
      setRotation(FLeftLeg1, 0F, 0F, 0F);
      BLeftLeg1 = new ModelRenderer(this, 0, 0);
      BLeftLeg1.addBox(-12F, 4F, -12F, 12, 29, 12);
      BLeftLeg1.setRotationPoint(49F, -9F, -6F);
      BLeftLeg1.setTextureSize(512, 512);
      BLeftLeg1.mirror = true;
      setRotation(BLeftLeg1, 0F, -0.2094395F, 0F);
      BRightLeg1 = new ModelRenderer(this, 0, 0);
      BRightLeg1.addBox(-12F, 4F, 0F, 12, 29, 12);
      BRightLeg1.setRotationPoint(49F, -9F, 6F);
      BRightLeg1.setTextureSize(512, 512);
      BRightLeg1.mirror = true;
      setRotation(BRightLeg1, 0F, 0.2094395F, 0F);
      Body1.mirror = true;
      Body1 = new ModelRenderer(this, 0, 0);
      Body1.addBox(0F, 0F, 0F, 56, 31, 40);
      Body1.setRotationPoint(-5.933333F, -43F, -20F);
      Body1.setTextureSize(512, 512);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0.1396263F);
      Body1.mirror = false;
      Body2 = new ModelRenderer(this, 0, 0);
      Body2.addBox(0F, 0F, 0F, 64, 16, 40);
      Body2.setRotationPoint(-11F, -21F, -20F);
      Body2.setTextureSize(512, 512);
      Body2.mirror = true;
      setRotation(Body2, 0F, 0F, 0.0174533F);
      Body3 = new ModelRenderer(this, 0, 0);
      Body3.addBox(0F, 0F, 0F, 16, 5, 40);
      Body3.setRotationPoint(49F, -35F, -20F);
      Body3.setTextureSize(512, 512);
      Body3.mirror = true;
      setRotation(Body3, 0F, 0F, 1.301251F);
      Tail1 = new ModelRenderer(this, 0, 0);
      Tail1.addBox(0F, 0F, 0F, 4, 16, 4);
      Tail1.setRotationPoint(51F, -23F, -2F);
      Tail1.setTextureSize(512, 512);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, -0.1487144F);
      Tail2 = new ModelRenderer(this, 0, 0);
      Tail2.addBox(0F, 0F, 0F, 3, 16, 3);
      Tail2.setRotationPoint(53.5F, -9F, -1.5F);
      Tail2.setTextureSize(512, 512);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, -0.3717861F);
      Tail3 = new ModelRenderer(this, 0, 497);
      Tail3.addBox(0F, 0F, 0F, 2, 12, 2);
      Tail3.setRotationPoint(59F, 5F, -1F);
      Tail3.setTextureSize(512, 512);
      Tail3.mirror = true;
      setRotation(Tail3, 0F, 0F, -0.7063936F);
      Body4 = new ModelRenderer(this, 0, 0);
      Body4.addBox(0F, 0F, 0F, 8, 24, 38);
      Body4.setRotationPoint(-6F, -43F, -19F);
      Body4.setTextureSize(512, 512);
      Body4.mirror = true;
      setRotation(Body4, 0F, 0F, 0.4833219F);
      Body5 = new ModelRenderer(this, 0, 0);
      Body5.addBox(0F, 0F, 0F, 6, 20, 36);
      Body5.setRotationPoint(-18F, -24F, -18F);
      Body5.setTextureSize(512, 512);
      Body5.mirror = true;
      setRotation(Body5, 0F, 0F, -0.3717861F);
      Head2 = new ModelRenderer(this, 0, 0);
      Head2.addBox(0F, 0F, 0F, 20, 26, 24);
      Head2.setRotationPoint(-28F, -36F, -12F);
      Head2.setTextureSize(512, 512);
      Head2.mirror = true;
      setRotation(Head2, 0F, 0F, -0.1487144F);
      Head1 = new ModelRenderer(this, 0, 0);
      Head1.addBox(0F, 0F, 0F, 16, 6, 18);
      Head1.setRotationPoint(-27F, -41F, -9F);
      Head1.setTextureSize(512, 512);
      Head1.mirror = true;
      setRotation(Head1, 0F, 0F, -0.1487144F);
      Head3 = new ModelRenderer(this, 453, 463);
      Head3.addBox(0F, 0F, 0F, 5, 24, 20);
      Head3.setRotationPoint(-28F, -34F, -10F);
      Head3.setTextureSize(512, 512);
      Head3.mirror = true;
      setRotation(Head3, 0F, 0F, 0.0083652F);
      Trunk1 = new ModelRenderer(this, 0, 0);
      Trunk1.addBox(0F, 0F, 0F, 7, 16, 10);
      Trunk1.setRotationPoint(-28F, -12F, -5F);
      Trunk1.setTextureSize(512, 512);
      Trunk1.mirror = true;
      setRotation(Trunk1, 0F, 0F, 0.2047147F);
      Trunk2 = new ModelRenderer(this, 0, 0);
      Trunk2.addBox(0F, 0F, 0F, 5, 14, 8);
      Trunk2.setRotationPoint(-29F, 1F, -4F);
      Trunk2.setTextureSize(512, 512);
      Trunk2.mirror = true;
      setRotation(Trunk2, 0F, 0F, 0.7544934F);
      Trunk3 = new ModelRenderer(this, 0, 0);
      Trunk3.addBox(0F, 0F, 0F, 4, 12, 6);
      Trunk3.setRotationPoint(-36F, 10F, -3F);
      Trunk3.setTextureSize(512, 512);
      Trunk3.mirror = true;
      setRotation(Trunk3, 0F, 0F, 1.265002F);
      Tusk1 = new ModelRenderer(this, 0, 450);
      Tusk1.addBox(0F, 0F, 0F, 3, 16, 3);
      Tusk1.setRotationPoint(-27F, -12F, -9F);
      Tusk1.setTextureSize(512, 512);
      Tusk1.mirror = true;
      setRotation(Tusk1, -0.3141593F, -0.2138028F, 0.6283185F);
      Tusk2 = new ModelRenderer(this, 0, 450);
      Tusk2.addBox(0F, 0F, 0F, 3, 16, 3);
      Tusk2.setRotationPoint(-27F, -12F, 8F);
      Tusk2.setTextureSize(512, 512);
      Tusk2.mirror = true;
      setRotation(Tusk2, -0.3141593F, 1.199914F, 0.6283185F);
      Tusk1b = new ModelRenderer(this, 0, 450);
      Tusk1b.addBox(0F, 0F, 0F, 3, 11, 3);
      Tusk1b.setRotationPoint(-33F, -0.2666667F, -14.8F);
      Tusk1b.setTextureSize(512, 512);
      Tusk1b.mirror = true;
      setRotation(Tusk1b, -0.3141593F, -0.2138028F, 1.217367F);
      Tusk2b = new ModelRenderer(this, 0, 450);
      Tusk2b.addBox(0F, 0F, 0F, 3, 11, 3);
      Tusk2b.setRotationPoint(-33F, -1F, 12.3F);
      Tusk2b.setTextureSize(512, 512);
      Tusk2b.mirror = true;
      setRotation(Tusk2b, -0.3141593F, 0.9642944F, 1.217367F);
      Tusk2c = new ModelRenderer(this, 0, 450);
      Tusk2c.addBox(0F, 0F, 0F, 3, 11, 3);
      Tusk2c.setRotationPoint(-40F, 2.466667F, 17F);
      Tusk2c.setTextureSize(512, 512);
      Tusk2c.mirror = true;
      setRotation(Tusk2c, -0.3141593F, 0.9642944F, 1.924225F);
      Tusk1c = new ModelRenderer(this, 0, 450);
      Tusk1c.addBox(0F, 0F, 0F, 3, 11, 3);
      Tusk1c.setRotationPoint(-39F, 4F, -19F);
      Tusk1c.setTextureSize(512, 512);
      Tusk1c.mirror = true;
      setRotation(Tusk1c, -0.3141593F, -0.4494223F, 1.924225F);
      Tusk1d = new ModelRenderer(this, 0, 450);
      Tusk1d.addBox(0F, 0F, 0F, 3, 12, 3);
      Tusk1d.setRotationPoint(-45F, 3F, -25F);
      Tusk1d.setTextureSize(512, 512);
      Tusk1d.mirror = true;
      setRotation(Tusk1d, -0.3141593F, -0.4494223F, 2.827433F);
      Tusk2d = new ModelRenderer(this, 0, 450);
      Tusk2d.addBox(0F, 0F, 0F, 3, 12, 3);
      Tusk2d.setRotationPoint(-49F, 0.5333334F, 23F);
      Tusk2d.setTextureSize(512, 512);
      Tusk2d.mirror = true;
      setRotation(Tusk2d, -0.3141593F, 1.985312F, 2.827433F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    FRightLeg1.render(f5);
    FLeftLeg1.render(f5);
    BLeftLeg1.render(f5);
    BRightLeg1.render(f5);
    Body1.render(f5);
    Body2.render(f5);
    Body3.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Body4.render(f5);
    Body5.render(f5);
    Head2.render(f5);
    Head1.render(f5);
    Head3.render(f5);
    Trunk1.render(f5);
    Trunk2.render(f5);
    Trunk3.render(f5);
    Tusk1.render(f5);
    Tusk2.render(f5);
    Tusk1b.render(f5);
    Tusk2b.render(f5);
    Tusk2c.render(f5);
    Tusk1c.render(f5);
    Tusk1d.render(f5);
    Tusk2d.render(f5);
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
