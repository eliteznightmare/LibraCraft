package libraCraft.models;

import libraCraft.handler.RenderTickHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class EnergyGenModel extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer base2;
    ModelRenderer base3;
    ModelRenderer base4;
    ModelRenderer base5;
    ModelRenderer Pillar_1;
    ModelRenderer Pillar_2;
    ModelRenderer Pillar_3;
    ModelRenderer Pillar_4;
    ModelRenderer CenterCube;
    ModelRenderer R1;
    ModelRenderer R2;
    ModelRenderer R3;
    ModelRenderer R4;
    ModelRenderer R5;
  
  public EnergyGenModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      base = new ModelRenderer(this, 0, 0);
      base.addBox(-7F, 10F, -7F, 14, 2, 14);
      base.setRotationPoint(0F, 12F, 0F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      base2 = new ModelRenderer(this, 0, 0);
      base2.addBox(-4F, 0F, -4F, 8, 2, 8);
      base2.setRotationPoint(0F, 12F, 0F);
      base2.setTextureSize(64, 32);
      base2.mirror = true;
      setRotation(base2, 0F, 0F, 0F);
      base3 = new ModelRenderer(this, 0, 0);
      base3.addBox(-6F, 9F, -6F, 12, 1, 12);
      base3.setRotationPoint(0F, 12F, 0F);
      base3.setTextureSize(64, 32);
      base3.mirror = true;
      setRotation(base3, 0F, 0F, 0F);
      base4 = new ModelRenderer(this, 0, 0);
      base4.addBox(-6F, -4F, -6F, 12, 1, 12);
      base4.setRotationPoint(0F, 12F, 0F);
      base4.setTextureSize(64, 32);
      base4.mirror = true;
      setRotation(base4, 0F, 0F, 0F);
      base5 = new ModelRenderer(this, 0, 0);
      base5.addBox(-4F, -4F, -4F, 8, 2, 8);
      base5.setRotationPoint(0F, 12F, 0F);
      base5.setTextureSize(64, 32);
      base5.mirror = true;
      setRotation(base5, 0F, 0F, 0F);
      Pillar_1 = new ModelRenderer(this, 0, 0);
      Pillar_1.addBox(-4F, 2F, 2F, 2, 8, 2);
      Pillar_1.setRotationPoint(0F, 12F, 0F);
      Pillar_1.setTextureSize(64, 32);
      Pillar_1.mirror = true;
      setRotation(Pillar_1, 0F, 0F, 0F);
      Pillar_2 = new ModelRenderer(this, 0, 0);
      Pillar_2.addBox(2F, 2F, 2F, 2, 8, 2);
      Pillar_2.setRotationPoint(0F, 12F, 0F);
      Pillar_2.setTextureSize(64, 32);
      Pillar_2.mirror = true;
      setRotation(Pillar_2, 0F, 0F, 0F);
      Pillar_3 = new ModelRenderer(this, 0, 0);
      Pillar_3.addBox(2F, 2F, -4F, 2, 8, 2);
      Pillar_3.setRotationPoint(0F, 12F, 0F);
      Pillar_3.setTextureSize(64, 32);
      Pillar_3.mirror = true;
      setRotation(Pillar_3, 0F, 0F, 0F);
      Pillar_4 = new ModelRenderer(this, 0, 0);
      Pillar_4.addBox(0F, 2F, 0F, 2, 8, 2);
      Pillar_4.setRotationPoint(-4F, 12F, -4F);
      Pillar_4.setTextureSize(64, 32);
      Pillar_4.mirror = true;
      setRotation(Pillar_4, 0F, 0F, 0F);
      CenterCube = new ModelRenderer(this, 0, 21);
      CenterCube.addBox(-1F, -1F, -1F, 2, 2, 2);
      CenterCube.setRotationPoint(0F, 17F, 0F);
      CenterCube.setTextureSize(64, 32);
      CenterCube.mirror = true;
      setRotation(CenterCube, 0F, 0F, 0F);
      R1 = new ModelRenderer(this, 0, 21);
      R1.addBox(10F, -4F, -1F, 2, 8, 2);
      R1.setRotationPoint(0F, 0F, 0F);
      R1.setTextureSize(64, 32);
      R1.mirror = true;
      setRotation(R1, 0F, 0F, 0F);
      R2 = new ModelRenderer(this, 0, 21);
      R2.addBox(-12F, -4F, -1F, 2, 8, 2);
      R2.setRotationPoint(0F, 0F, 0F);
      R2.setTextureSize(64, 32);
      R2.mirror = true;
      setRotation(R2, 0F, 0F, 0F);
      R3 = new ModelRenderer(this, 0, 27);
      R3.addBox(-4F, -1F, -12F, 8, 2, 2);
      R3.setRotationPoint(0F, 0F, 0F);
      R3.setTextureSize(64, 32);
      R3.mirror = true;
      setRotation(R3, 0F, 0F, 0F);
      R4 = new ModelRenderer(this, 0, 27);
      R4.addBox(-4F, -1F, 10F, 8, 2, 2);
      R4.setRotationPoint(0F, 0F, 0F);
      R4.setTextureSize(64, 32);
      R4.mirror = true;
      setRotation(R4, 0F, 0F, 0F);
      R5 = new ModelRenderer(this, 0, 25);
      R5.addBox(-2F, -2F, -2F, 4, 2, 4);
      R5.setRotationPoint(0F, 12F, 0F);
      R5.setTextureSize(64, 32);
      R5.mirror = true;
      setRotation(R5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    setAngles();
    base.render(f5);
    base2.render(f5);
    base3.render(f5);
    base4.render(f5);
    base5.render(f5);
    Pillar_1.render(f5);
    Pillar_2.render(f5);
    Pillar_3.render(f5);
    Pillar_4.render(f5);
    CenterCube.render(f5);
    R1.render(f5);
    R2.render(f5);
    R3.render(f5);
    R4.render(f5);
    R5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  private void setAngles() {
	  float E = RenderTickHandler.e;
	  float B = RenderTickHandler.b;
	  float A = RenderTickHandler.a;
	    R1.rotateAngleZ = E;
	    R2.rotateAngleZ = E;
	    R3.rotateAngleY = E;
	    R4.rotateAngleY = E;
	    R5.rotateAngleY = E;
	    CenterCube.rotateAngleX = B;
		  CenterCube.rotateAngleY = A;
		  CenterCube.rotateAngleZ = E;
  }
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
