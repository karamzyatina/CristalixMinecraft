import java.util.Random;
import org.lwjgl.util.vector.Vector3f;

public class FA extends Ff {
   private final Cp a;
   private final Random a = new Random();

   public FA(Ga var1, Cp var2) {
      super(var1);
      this.a = var2;
      this.a = 0.15F;
      this.b = 0.75F;
   }

   private int a(Vh var1) {
      int var2 = var1.d();
      byte var3 = 1;
      if (var2 > 48) {
         var3 = 5;
      } else if (var2 > 32) {
         var3 = 4;
      } else if (var2 > 16) {
         var3 = 3;
      } else if (var2 > 1) {
         var3 = 2;
      }

      return var3;
   }

   public void a(Pm var1, double var2, double var4, double var6, float var8, float var9) {
      Vh var10 = var1.a();
      Random var11 = this.a;
      int var12 = var10.isEmpty() ? 187 : SZ.a(var10.a()) + var10.getMetadata();
      var11.setSeed((long)var12);
      HA var13 = null;
      if (this.b(var1)) {
         var13 = this.a.a.a(this.a(var1));
         var13.setBlurMipmap(false, false);
      }

      Cp var14 = this.a;
      By.z();
      By.a(516, 0.1F);
      By.l();
      Co.b();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      By.C();
      CV var15 = var14.a(var10, var1.a, (Oh)null);
      int var16 = this.a(var1, var2, var4, var6, var9, var15);
      CW var17 = var15.a();
      Vector3f var18 = var17.g.c;
      float var19 = var18.x;
      float var20 = var18.y;
      float var21 = var18.z;
      boolean var22 = var15.isGui3d();
      float var24;
      float var25;
      if (!var22) {
         float var23 = -0.0F * (float)(var16 - 1) * 0.5F * var19;
         var24 = -0.0F * (float)(var16 - 1) * 0.5F * var20;
         var25 = -0.09375F * (float)(var16 - 1) * 0.5F * var21;
         By.c(var23, var24, var25);
      }

      if (this.a) {
         By.g();
         By.e(this.a((NN)var1));
      }

      for(int var27 = 0; var27 < var16; ++var27) {
         By.C();
         if (var22) {
            if (var27 > 0) {
               var24 = (var11.nextFloat() * 2.0F - 1.0F) * 0.15F;
               var25 = (var11.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var26 = (var11.nextFloat() * 2.0F - 1.0F) * 0.15F;
               By.c(var24, var25, var26);
            }

            var17.a(CZ.GROUND);
            var14.a(var10, var15);
            By.D();
         } else {
            if (var27 > 0) {
               var24 = (var11.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               var25 = (var11.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               By.c(var24, var25, 0.0F);
            }

            var17.a(CZ.GROUND);
            var14.a(var10, var15);
            By.D();
            By.c(0.0F * var19, 0.0F * var20, 0.09375F * var21);
         }
      }

      if (this.a) {
         By.m();
         By.h();
      }

      By.D();
      By.A();
      By.k();
      this.b(var1);
      if (var13 != null) {
         var13.restoreLastBlurMipmap();
      }

      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected Lg a(Pm var1) {
      return HO.a;
   }

   private int a(Pm var1, double var2, double var4, double var6, float var8, CV var9) {
      Vh var10 = var1.a();
      if (var10.isEmpty()) {
         return 0;
      } else {
         boolean var11 = var9.isGui3d();
         int var12 = this.a(var10);
         boolean var13 = !((ata)this.a.a).a().c;
         float var14 = var13 ? adh.a(((float)var1.getAge() + var8) / 10.0F + var1.a) * 0.1F + 0.1F : 0.0F;
         float var15 = var9.a().a(CZ.GROUND).c.y;
         if (var13) {
            By.c((float)var2, (float)var4 + var14 + 0.25F * var15, (float)var6);
         } else {
            By.c((float)var2, (float)var4, (float)var6);
         }

         if (var11 || this.a.a != null) {
            if (var13) {
               float var16 = (((float)var1.getAge() + var8) / 20.0F + var1.a) * 57.295776F;
               By.b(var16, 0.0F, 1.0F, 0.0F);
            } else {
               By.c(0.0F, 0.05F, 0.0F);
               By.b(90.0F, 1.0F, 0.0F, 0.0F);
               By.b(var1.a * 360.0F, 0.0F, 0.0F, 1.0F);
            }
         }

         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         return var12;
      }
   }
}
