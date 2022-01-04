import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.renderer.culling.Camera;
import dev.xdark.clientapi.renderer.entity.Render;
import java.util.Iterator;
import java.util.OptionalInt;
import ru.cristalix.core.datasync.EntityScaleData;

public abstract class Ff implements agU, Render {
   private static final Lg a = new Lg("textures/misc/shadow.png");
   protected final Ga a;
   public float a;
   protected float b = 1.0F;
   protected boolean a;
   private Class a = null;
   private acC a = null;
   protected final Cw a;

   protected Ff(Ga var1) {
      this.a = var1;
      this.a = var1.a.a;
   }

   public void setRenderOutlines(boolean var1) {
      this.a = var1;
   }

   public boolean a(T var1, Fb var2, double var3, double var5, double var7) {
      if (var1.h) {
         return true;
      } else if (!var1.c(var3, var5, var7)) {
         return false;
      } else {
         acU var9 = var1.c().b(0.5D);
         if (var9.hasNaN() || var9.getAverageEdgeLength() == 0.0D) {
            var9.b(var1.d - 2.0D, var1.e - 2.0D, var1.f - 2.0D, var1.d + 2.0D, var1.e + 2.0D, var1.f + 2.0D);
         }

         return var2.a(var9);
      }
   }

   public void a(T var1, double var2, double var4, double var6, float var8, float var9) {
      if (!this.a) {
         this.a(var1, var2, var4, var6);
      }

   }

   protected int a(T var1) {
      OptionalInt var2 = var1.a;
      if (var2.isPresent()) {
         return var2.getAsInt();
      } else {
         int var3 = 16777215;
         aan var4 = (aan)var1.a();
         if (var4 != null) {
            String var5 = tI.a(var4.c());
            if (var5.length() >= 2) {
               var3 = this.a().a(var5.charAt(1));
            }
         }

         return var3;
      }
   }

   protected void a(T var1, double var2, double var4, double var6) {
      if (this.a(var1)) {
         this.a(var1, var1.getDisplayNameForRendering(), var2, var4, var6, 64);
      }

   }

   protected boolean a(T var1) {
      return var1.getAlwaysRenderNameTagForRender() && var1.hasCustomName();
   }

   protected void a(T var1, double var2, double var4, double var6, String var8, double var9) {
      this.a(var1, var8, var2, var4, var6, 64);
   }

   protected abstract acC a(T var1);

   protected boolean b(T var1) {
      acC var2 = var1.a;
      if (var2 == null) {
         var2 = this.a;
         if (var2 == null) {
            var2 = this.a(var1);
         }
      }

      if (var2 != null) {
         this.a(var2);
         return true;
      } else {
         return false;
      }
   }

   public void a(acC var1) {
      this.a.a.b(var1);
   }

   public void a(Lg var1) {
      this.a.a.a(var1);
   }

   private void a(NN var1, double var2, double var4, double var6, float var8) {
      By.f();
      HO var9 = this.a.a.a();
      HK var10 = var9.a("minecraft:blocks/fire_layer_0");
      HK var11 = var9.a("minecraft:blocks/fire_layer_1");
      By.C();
      By.c((float)var2, (float)var4, (float)var6);
      float var12 = var1.a.a() * 1.4F;
      By.b(var12, var12, var12);
      Cw var13 = this.a;
      Bh var14 = var13.a();
      float var15 = 0.5F;
      float var16 = var1.b.a() / var12;
      float var17 = (float)(var1.e - var1.b().b);
      By.b(-this.a.a, 0.0F, 1.0F, 0.0F);
      By.c(0.0F, 0.0F, -0.3F + (float)((int)var16) * 0.02F);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      float var18 = 0.0F;
      int var19 = 0;
      boolean var20 = afT.O();
      if (var20) {
         var14.a(abu.SOLID);
      }

      var14.a(7, In.g);

      while(var16 > 0.0F) {
         HK var21 = var19 % 2 == 0 ? var10 : var11;
         var14.b(var21);
         this.a(HO.a);
         float var22 = var21.getMinU();
         float var23 = var21.getMinV();
         float var24 = var21.getMaxU();
         float var25 = var21.getMaxV();
         if (var19 / 2 % 2 == 0) {
            float var26 = var24;
            var24 = var22;
            var22 = var26;
         }

         var14.a((double)(var15 - 0.0F), (double)(0.0F - var17), (double)var18).a((double)var24, (double)var25).endVertex();
         var14.a((double)(-var15 - 0.0F), (double)(0.0F - var17), (double)var18).a((double)var22, (double)var25).endVertex();
         var14.a((double)(-var15 - 0.0F), (double)(1.4F - var17), (double)var18).a((double)var22, (double)var23).endVertex();
         var14.a((double)(var15 - 0.0F), (double)(1.4F - var17), (double)var18).a((double)var24, (double)var23).endVertex();
         var16 -= 0.45F;
         var17 -= 0.45F;
         var15 *= 0.9F;
         var18 += 0.03F;
         ++var19;
      }

      var13.draw();
      if (var20) {
         var14.a((abu)null);
         By.H();
      }

      By.D();
      By.e();
   }

   private void d(NN var1, double var2, double var4, double var6, float var8, float var9) {
      if (!afT.ad() || !akC.n) {
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA);
         this.a.a.a(a);
         aej var10 = this.a();
         By.a(false);
         float var11 = this.a;
         if (var1 instanceof Of) {
            Of var12 = (Of)var1;
            var11 *= var12.a();
            if (var12.isChild()) {
               var11 *= 0.5F;
            }
         }

         double var38 = var1.g + (var1.d - var1.g) * (double)var9;
         double var14 = var1.h + (var1.e - var1.h) * (double)var9;
         double var16 = var1.i + (var1.f - var1.i) * (double)var9;
         int var18 = adh.b(var38 - (double)var11);
         int var19 = adh.b(var38 + (double)var11);
         int var20 = adh.b(var14 - (double)var11);
         int var21 = adh.b(var14);
         int var22 = adh.b(var16 - (double)var11);
         int var23 = adh.b(var16 + (double)var11);
         double var24 = var2 - var38;
         double var26 = var4 - var14;
         double var28 = var6 - var16;
         Cw var30 = this.a;
         Bh var31 = var30.a();
         var31.a(7, In.i);
         Iterator var32 = acV.a(var18, var20, var22, var19, var21, var23).iterator();

         while(var32.hasNext()) {
            acV var33 = (acV)var32.next();
            int var34 = var33.a;
            int var35 = var33.b;
            int var36 = var33.c;
            sD var37 = var10.a(var34, var35 - 1, var36);
            if (var37.a() != abO.INVISIBLE && var10.a(var34, var35, var36) > 3) {
               this.a(var37, var2, var4, var6, var33, var8, var11, var24, var26, var28);
            }
         }

         var30.draw();
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.k();
         By.a(true);
      }

   }

   private aej a() {
      return this.a.a;
   }

   private void a(sD var1, double var2, double var4, double var6, acV var8, float var9, float var10, double var11, double var13, double var15) {
      if (var1.isFullCube()) {
         Cw var17 = this.a;
         Bh var18 = var17.a();
         int var19 = var8.b;
         double var20 = ((double)var9 - (var4 - ((double)var19 + var13)) / 2.0D) * 0.5D * (double)this.a().a(var8);
         if (var20 >= 0.0D) {
            if (var20 > 1.0D) {
               var20 = 1.0D;
            }

            int var22 = var8.a;
            int var23 = var8.c;
            acU var24 = var1.b(this.a(), var22, var19, var23);
            double var25 = (double)var22 + var24.a + var11;
            double var27 = (double)var22 + var24.d + var11;
            double var29 = (double)var19 + var24.b + var13 + 0.015625D;
            double var31 = (double)var23 + var24.c + var15;
            double var33 = (double)var23 + var24.f + var15;
            float var35 = (float)((var2 - var25) / 2.0D / (double)var10 + 0.5D);
            float var36 = (float)((var2 - var27) / 2.0D / (double)var10 + 0.5D);
            float var37 = (float)((var6 - var31) / 2.0D / (double)var10 + 0.5D);
            float var38 = (float)((var6 - var33) / 2.0D / (double)var10 + 0.5D);
            var18.a(var25, var29, var31).a((double)var35, (double)var37).a(1.0F, 1.0F, 1.0F, (float)var20).endVertex();
            var18.a(var25, var29, var33).a((double)var35, (double)var38).a(1.0F, 1.0F, 1.0F, (float)var20).endVertex();
            var18.a(var27, var29, var33).a((double)var36, (double)var38).a(1.0F, 1.0F, 1.0F, (float)var20).endVertex();
            var18.a(var27, var29, var31).a((double)var36, (double)var37).a(1.0F, 1.0F, 1.0F, (float)var20).endVertex();
         }
      }

   }

   public static void a(Cw var0, acU var1, double var2, double var4, double var6) {
      By.w();
      Bh var8 = var0.a();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      var8.setTranslation(var2, var4, var6);
      var8.a(7, In.h);
      var8.a(var1.a, var1.e, var1.c).a(0.0F, 0.0F, -1.0F).endVertex();
      var8.a(var1.d, var1.e, var1.c).a(0.0F, 0.0F, -1.0F).endVertex();
      var8.a(var1.d, var1.b, var1.c).a(0.0F, 0.0F, -1.0F).endVertex();
      var8.a(var1.a, var1.b, var1.c).a(0.0F, 0.0F, -1.0F).endVertex();
      var8.a(var1.a, var1.b, var1.f).a(0.0F, 0.0F, 1.0F).endVertex();
      var8.a(var1.d, var1.b, var1.f).a(0.0F, 0.0F, 1.0F).endVertex();
      var8.a(var1.d, var1.e, var1.f).a(0.0F, 0.0F, 1.0F).endVertex();
      var8.a(var1.a, var1.e, var1.f).a(0.0F, 0.0F, 1.0F).endVertex();
      var8.a(var1.a, var1.b, var1.c).a(0.0F, -1.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.b, var1.c).a(0.0F, -1.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.b, var1.f).a(0.0F, -1.0F, 0.0F).endVertex();
      var8.a(var1.a, var1.b, var1.f).a(0.0F, -1.0F, 0.0F).endVertex();
      var8.a(var1.a, var1.e, var1.f).a(0.0F, 1.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.e, var1.f).a(0.0F, 1.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.e, var1.c).a(0.0F, 1.0F, 0.0F).endVertex();
      var8.a(var1.a, var1.e, var1.c).a(0.0F, 1.0F, 0.0F).endVertex();
      var8.a(var1.a, var1.b, var1.f).a(-1.0F, 0.0F, 0.0F).endVertex();
      var8.a(var1.a, var1.e, var1.f).a(-1.0F, 0.0F, 0.0F).endVertex();
      var8.a(var1.a, var1.e, var1.c).a(-1.0F, 0.0F, 0.0F).endVertex();
      var8.a(var1.a, var1.b, var1.c).a(-1.0F, 0.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.b, var1.c).a(1.0F, 0.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.e, var1.c).a(1.0F, 0.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.e, var1.f).a(1.0F, 0.0F, 0.0F).endVertex();
      var8.a(var1.d, var1.b, var1.f).a(1.0F, 0.0F, 0.0F).endVertex();
      var0.draw();
      var8.setTranslation(0.0D, 0.0D, 0.0D);
      By.v();
   }

   public void b(NN var1, double var2, double var4, double var6, float var8, float var9) {
      Ga var10 = this.a;
      if (JI.p && this.a > 0.0F && !var1.isInvisible() && var10.a()) {
         double var11 = var10.getDistanceToCamera(var1.d, var1.e, var1.f);
         float var13 = (float)((1.0D - var11 / 256.0D) * (double)this.b);
         if (var13 > 0.0F) {
            this.d(var1, var2, var4, var6, var13, var9);
         }
      }

      if (var1.n() && (!(var1 instanceof Rn) || !((Rn)var1).isSpectator())) {
         this.a(var1, var2, var4, var6, var9);
      }

   }

   public tI a() {
      return this.a.a();
   }

   protected void a(T var1, String var2, double var3, double var5, double var7, int var9) {
      Ga var10 = this.a;
      double var11 = var1.a(var10.a);
      if (var11 <= (double)(var9 * var9)) {
         boolean var13 = var1.isSneaking();
         float var14 = var10.a;
         float var15 = var10.b;
         boolean var16 = JI.j == 2;
         float var17 = var1.b.a() + this.a(var1) - (var13 ? 0.25F : 0.0F);
         int var18 = "deadmau5".equals(var2) ? -10 : 0;
         var10.a.a.a(var1, var10.a(), var2, (float)var3, (float)var5 + var17, (float)var7, var18, var14, var15, var16, var13);
      }

   }

   public Ga a() {
      return this.a;
   }

   public boolean isMultipass() {
      return false;
   }

   public void c(T var1, double var2, double var4, double var6, float var8, float var9) {
   }

   public Class a() {
      return this.a;
   }

   public void a(Class var1) {
      this.a = var1;
   }

   public void b(acC var1) {
      this.a = var1;
   }

   protected float a(NN var1) {
      if (!(var1 instanceof Oh)) {
         return 0.5F;
      } else {
         EntityScaleData var2 = (EntityScaleData)var1.a().a(asJ.a);
         if (var2.shouldApply()) {
            double var3 = var2.getY();
            if (var3 > 1.0D) {
               return (float)(0.5D * var3 * 0.800000011920929D);
            }
         }

         return 0.5F;
      }
   }

   public boolean shouldRender(Entity var1, Camera var2, double var3, double var5, double var7) {
      return this.a((NN)d.a(var1), (Fb)d.a(var2), var3, var5, var7);
   }

   public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.a((NN)d.a(var1), var2, var4, var6, var8, var9);
   }

   public void renderMultipass(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.c((NN)d.a(var1), var2, var4, var6, var8, var9);
   }
}
