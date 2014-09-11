package libraCraft.models;

import java.util.Random;

import libraCraft.handler.RenderTickHandler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class EnergyCubeModel extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Pillar;
    ModelRenderer CenterCube;
    ModelRenderer OuterCircleP1;
    ModelRenderer OuterCircleP2;
    ModelRenderer OuterCircleP3;
    ModelRenderer OuterCircleP4;
    ModelRenderer OuterCircleP5;
    ModelRenderer OuterCircleP6;
    ModelRenderer OuterCircleP7;
    ModelRenderer OuterCircleP8;
  
  public EnergyCubeModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 18);
      Base.addBox(-3F, 12F, -3F, 6, 2, 6);
      Base.setRotationPoint(0F, 10F, 0F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Pillar = new ModelRenderer(this, 0, 8);
      Pillar.addBox(-2F, 6F, -2F, 4, 6, 4);
      Pillar.setRotationPoint(0F, 10F, 0F);
      Pillar.setTextureSize(64, 32);
      Pillar.mirror = true;
      setRotation(Pillar, 0F, 0F, 0F);
      CenterCube = new ModelRenderer(this, 7, 0);
      CenterCube.addBox(-1F, -1F, -1F, 2, 2, 2);
      CenterCube.setRotationPoint(0F, 11F, 0F);
      CenterCube.setTextureSize(64, 32);
      CenterCube.mirror = true;
      setRotation(CenterCube, 0F, 0F, 0F);
      OuterCircleP1 = new ModelRenderer(this, 0, 5);
      OuterCircleP1.addBox(-2F, 3F, -1F, 4, 1, 2);
      OuterCircleP1.setRotationPoint(0F, 11F, 0F);
      OuterCircleP1.setTextureSize(64, 32);
      OuterCircleP1.mirror = true;
      setRotation(OuterCircleP1, 0F, 0F, 0F);
      OuterCircleP2 = new ModelRenderer(this, 0, 0);
      OuterCircleP2.addBox(-3F, 2F, -1F, 1, 1, 2);
      OuterCircleP2.setRotationPoint(0F, 11F, 0F);
      OuterCircleP2.setTextureSize(64, 32);
      OuterCircleP2.mirror = true;
      setRotation(OuterCircleP2, 0F, 0F, 0F);
      OuterCircleP3 = new ModelRenderer(this, 0, 0);
      OuterCircleP3.addBox(2F, 2F, -1F, 1, 1, 2);
      OuterCircleP3.setRotationPoint(0F, 11F, 0F);
      OuterCircleP3.setTextureSize(64, 32);
      OuterCircleP3.mirror = true;
      setRotation(OuterCircleP3, 0F, 0F, 0F);
      OuterCircleP4 = new ModelRenderer(this, 16, 12);
      OuterCircleP4.addBox(3F, -2F, -1F, 1, 4, 2);
      OuterCircleP4.setRotationPoint(0F, 11F, 0F);
      OuterCircleP4.setTextureSize(64, 32);
      OuterCircleP4.mirror = true;
      setRotation(OuterCircleP4, 0F, 0F, 0F);
      OuterCircleP5 = new ModelRenderer(this, 16, 12);
      OuterCircleP5.addBox(-4F, -2F, -1F, 1, 4, 2);
      OuterCircleP5.setRotationPoint(0F, 11F, 0F);
      OuterCircleP5.setTextureSize(64, 32);
      OuterCircleP5.mirror = true;
      setRotation(OuterCircleP5, 0F, 0F, 0F);
      OuterCircleP6 = new ModelRenderer(this, 0, 5);
      OuterCircleP6.addBox(-2F, -4F, -1F, 4, 1, 2);
      OuterCircleP6.setRotationPoint(0F, 11F, 0F);
      OuterCircleP6.setTextureSize(64, 32);
      OuterCircleP6.mirror = true;
      setRotation(OuterCircleP6, 0F, 0F, 0F);
      OuterCircleP7 = new ModelRenderer(this, 0, 0);
      OuterCircleP7.addBox(2F, -3F, -1F, 1, 1, 2);
      OuterCircleP7.setRotationPoint(0F, 11F, 0F);
      OuterCircleP7.setTextureSize(64, 32);
      OuterCircleP7.mirror = true;
      setRotation(OuterCircleP7, 0F, 0F, 0F);
      OuterCircleP8 = new ModelRenderer(this, 0, 0);
      OuterCircleP8.addBox(-3F, -3F, -1F, 1, 1, 2);
      OuterCircleP8.setRotationPoint(0F, 11F, 0F);
      OuterCircleP8.setTextureSize(64, 32);
      OuterCircleP8.mirror = true;
      setRotation(OuterCircleP8, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    setAngles();
    Base.render(f5);
    Pillar.render(f5);
    CenterCube.render(f5);
    OuterCircleP1.render(f5);
    OuterCircleP2.render(f5);
    OuterCircleP3.render(f5);
    OuterCircleP4.render(f5);
    OuterCircleP5.render(f5);
    OuterCircleP6.render(f5);
    OuterCircleP7.render(f5);
    OuterCircleP8.render(f5);
  }
  
  private void setAngles() {
	  float E = RenderTickHandler.e;
	  float B = RenderTickHandler.b;
	  float A = RenderTickHandler.a;
			  OuterCircleP1.rotateAngleX = E;
			  OuterCircleP1.rotateAngleY = B;
			  OuterCircleP1.rotateAngleZ = A;
			  OuterCircleP2.rotateAngleX = E;
			  OuterCircleP2.rotateAngleY = B;
			  OuterCircleP2.rotateAngleZ = A;
			  OuterCircleP3.rotateAngleX = E;
			  OuterCircleP3.rotateAngleY = B;
			  OuterCircleP3.rotateAngleZ = A;
			  OuterCircleP4.rotateAngleX = E;
			  OuterCircleP4.rotateAngleY = B;
			  OuterCircleP4.rotateAngleZ = A;
			  OuterCircleP5.rotateAngleX = E;
			  OuterCircleP5.rotateAngleY = B;
			  OuterCircleP5.rotateAngleZ = A;
			  OuterCircleP6.rotateAngleX = E;
			  OuterCircleP6.rotateAngleY = B;
			  OuterCircleP6.rotateAngleZ = A;
			  OuterCircleP7.rotateAngleX = E;
			  OuterCircleP7.rotateAngleY = B;
			  OuterCircleP7.rotateAngleZ = A;
			  OuterCircleP8.rotateAngleX = E;
			  OuterCircleP8.rotateAngleY = B;
			  OuterCircleP8.rotateAngleZ = A;
			  CenterCube.rotateAngleX = B;
			  CenterCube.rotateAngleY = A;
			  CenterCube.rotateAngleZ = E;
}

private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
