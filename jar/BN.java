import com.google.gson.JsonSyntaxException;
import dev.xdark.clientapi.entity.EntityLivingBase;
import dev.xdark.clientapi.event.render.HandRender;
import dev.xdark.clientapi.event.render.NameTemplateRender;
import dev.xdark.clientapi.event.render.OrientCamera;
import dev.xdark.clientapi.render.EntityRenderer;
import dev.xdark.clientapi.render.FontRenderer;
import dev.xdark.clientapi.renderer.culling.Camera;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.feder.RecyclableArrayList;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.glu.Project;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.cristalix.core.datasync.EntityScaleData;

public final class Bn implements IO, EntityRenderer {
   private static final Logger a;
   private static final Lg a;
   private static final Lg b;
   public final sE a;
   private final IN a;
   private final Random a;
   private float e;
   public Cg a;
   private final vh a;
   private int c;
   private acv a;
   private acv b;
   private float f;
   private float g;
   private float h;
   private float i;
   private float j;
   private float k;
   private float l;
   private float m;
   private float n;
   private float o;
   private boolean b;
   private final boolean c;
   private final boolean d;
   private long a;
   private final Hy a;
   private final int[] a;
   private final Lg c;
   private boolean e;
   private float p;
   private float q;
   private int d;
   private final float[] a;
   private final float[] b;
   private final FloatBuffer a;
   public float a;
   public float b;
   public float c;
   private float r;
   private float s;
   private final double a;
   private Vh a;
   private int e;
   private float t;
   private float u;
   private JR a;
   private static final acC[] a;
   public static final int a;
   private int f;
   private boolean f;
   public int b;
   public boolean a;
   private float v;
   private final Fb a;
   private final JR[] a;
   private boolean g;
   private final adi a;
   private final adi b;
   private final aqT a;
   private int g;
   float d;

   public Bn(sE var1, IN var2) {
      this.a = aqR.a().a;
      this.a = new Random();
      this.a = new acv();
      this.b = new acv();
      this.f = 4.0F;
      this.c = true;
      this.d = true;
      this.a = sE.a();
      this.a = new float[1024];
      this.b = new float[1024];
      this.a = Bx.a(16);
      this.a = 1.0D;
      this.a = false;
      this.v = 128.0F;
      this.a = new JR[10];
      this.g = false;
      this.a = new adi();
      this.b = new adi();
      this.f = a;
      this.a = var1;
      this.a = var2;
      this.a = var1.a();
      this.a = new vh(var1.a(), var1.a);
      this.a = new Hy(16, 16);
      this.c = var1.a().a("lightMap", this.a);
      this.a = this.a.getTextureData();
      this.a = null;

      for(int var3 = 0; var3 < 32; ++var3) {
         for(int var4 = 0; var4 < 32; ++var4) {
            float var5 = (float)(var4 - 16);
            float var6 = (float)(var3 - 16);
            float var7 = adh.c(var5 * var5 + var6 * var6);
            this.a[var3 << 5 | var4] = -var6 / var7;
            this.b[var3 << 5 | var4] = var5 / var7;
         }
      }

      this.a = new Fa(EZ.b());
   }

   public boolean isShaderActive() {
      return this.a != null;
   }

   public void stopUseShader() {
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      this.f = a;
   }

   public void switchUseShader() {
      this.f = !this.f;
   }

   public void a(NN var1) {
      if (Ci.f) {
         if (this.a != null) {
            this.a.a();
         }

         this.a = null;
         if (var1 instanceof PK) {
            this.a(new acC("shaders/post/creeper.json"));
         } else if (var1 instanceof Qm) {
            this.a(new acC("shaders/post/spider.json"));
         } else if (var1 instanceof PM) {
            this.a(new acC("shaders/post/invert.json"));
         }
      }

   }

   public boolean a(acC var1) {
      if (Ci.d()) {
         try {
            this.a = new JR(this.a.a(), this.a, this.a.a(), var1, this.a, this.a.a);
            this.a.a(this.a.a, this.a.b);
            this.f = true;
            return true;
         } catch (JsonSyntaxException | IOException var3) {
            a.warn("Failed to load shader: {}", var1, var3);
            this.f = a;
            this.f = false;
         }
      }

      return false;
   }

   public void onResourceManagerReload(IN var1) {
      if (this.a != null) {
         this.a.a();
      }

      this.a = null;
      if (this.f == a) {
         this.a(this.a.a());
      } else {
         this.a(a[this.f]);
      }

   }

   public void a() {
      this.c();
      this.d();
      this.r = this.s;
      this.f = 4.0F;
      if (JI.u) {
         float var1 = JI.a * 0.6F + 0.2F;
         float var2 = var1 * var1 * var1 * 8.0F;
         this.i = this.a.a(this.g, 0.05F * var2);
         this.j = this.b.a(this.h, 0.05F * var2);
         this.k = 0.0F;
         this.g = 0.0F;
         this.h = 0.0F;
      } else {
         this.i = 0.0F;
         this.j = 0.0F;
         this.a.a();
         this.b.a();
      }

      if (this.a.a() == null) {
         this.a.a((NN)this.a.a);
      }

      NN var11 = this.a.a();
      double var12 = var11.d;
      double var4 = var11.e + (double)var11.getEyeHeight();
      double var6 = var11.f;
      float var8 = this.a.a.a(var12, var4, var6);
      float var9 = (float)JI.b() / 16.0F;
      var9 = adh.a(var9, 0.0F, 1.0F);
      float var10 = var8 * (1.0F - var9) + var9;
      this.s += (var10 - this.s) * 0.1F;
      ++this.c;
      this.a.a();
      this.f();
      this.o = this.n;
      if (this.a.a.a().b()) {
         this.n += 0.05F;
         if (this.n > 1.0F) {
            this.n = 1.0F;
         }
      } else if (this.n > 0.0F) {
         this.n -= 0.0125F;
      }

      if (this.e > 0) {
         --this.e;
         if (this.e == 0) {
            this.a = null;
         }
      }

   }

   public JR a() {
      return this.a;
   }

   public void a(int var1, int var2) {
      if (Ci.f) {
         if (this.a != null) {
            this.a.a(var1, var2);
         }

         this.a.a.a(var1, var2);
      }

   }

   public void a(float var1) {
      sE var2 = this.a;
      NN var3 = var2.a();
      if (var3 != null) {
         yw var4 = var2.a;
         if (var4 != null) {
            var2.a = null;
            yr var25 = var2.a;
            double var5 = (double)this.a(var25);
            var2.a = var3.a(this.a, var5, var1);
            adm var7 = var3.b(var1);
            boolean var8 = false;
            double var9 = var5;
            if (var2.a.extendedReach()) {
               var9 = iM.a(iM.a(6941979448791735479L) ^ iM.a(iM.a(-2328041630550662328L) ^ -1L));
               var5 = var9;
            } else if (var5 > this.a(iM.a(iM.a(-7129113031231322152L) ^ iM.a(iM.a(2515175212990248999L) ^ -1L)))) {
               var8 = true;
            }

            if (var2.a != null) {
               var9 = var2.a.a.b(var7);
            }

            adm var11 = var3.a(iM.a(iM.a(-402887053) ^ iM.a(~iM.a(662933900))));
            adm var12 = var7.e(var11.a * var5, var11.b * var5, var11.c * var5);
            NN var13 = null;
            adm var14 = null;
            RecyclableArrayList var15 = var4.a(var3, var3.d().g(var11.a * var5, var11.b * var5, var11.c * var5).c(iM.a(iM.a(-1050425209103746059L) ^ iM.a(iM.a(3558930201549112330L) ^ -1L)), iM.a(iM.a(3652364977880208602L) ^ iM.a(iM.a(-963716000340022491L) ^ -1L)), iM.a(iM.a(7535167500707431754L) ^ iM.a(iM.a(-6296677603180545355L) ^ -1L))), MR.a((Predicate)abH.e, (Predicate)(new Bo(this))));
            double var16 = var9;
            adi var18 = this.b;

            for(int var19 = 0; var19 < var15.size(); ++var19) {
               NN var20 = (NN)var15.get(var19);
               acU var21 = var20.d().b((double)var20.b());
               adi var22 = var21.a(var18, var7, var12);
               if (var21.a(var7)) {
                  if (var16 >= 0.0D) {
                     var13 = var20;
                     var14 = var22 == null ? var7 : var22.a;
                     var16 = 0.0D;
                  }
               } else if (var22 != null) {
                  double var23 = var7.b(var22.a);
                  if (var23 < var16 || var16 == 0.0D) {
                     if (var20.b() == var3.b()) {
                        if (var16 == 0.0D) {
                           var13 = var20;
                           var14 = var22.a;
                        }
                     } else {
                        var13 = var20;
                        var14 = var22.a;
                        var16 = var23;
                     }
                  }
               }
            }

            var15.recycle();
            adi var26;
            if (var13 != null && var8 && var7.c(var14) > this.a(iM.a(iM.a(-2401401200617039575L) ^ iM.a(iM.a(7021531468345747158L) ^ -1L)))) {
               var13 = null;
               var26 = this.a;
               La.a((Object)var26.a());
               var2.a = adi.a(var26, adj.MISS, var14, (abP)null, ada.a(var7));
            }

            if (var13 != null && (var16 < var9 || var2.a == null)) {
               var26 = this.a;
               La.a((Object)var26.a());
               var2.a = adi.a(var26, var13, var14);
               if (var13 instanceof Oh || var13 instanceof Pn) {
                  var2.a = var13;
               }
            }
         }
      }

   }

   private void c() {
      float var1 = 1.0F;
      if (this.a.a() instanceof tC) {
         tC var2 = (tC)this.a.a();
         var1 = var2.getFovModifier();
      }

      this.m = this.l;
      this.l += (var1 - this.l) * 0.5F;
      if (this.l > 1.5F) {
         this.l = 1.5F;
      }

      if (this.l < 0.1F) {
         this.l = 0.1F;
      }

   }

   private float a(float var1, boolean var2) {
      NN var3 = this.a.a();
      float var4 = iM.a(iM.a(391190107) ^ iM.a(~iM.a(-1440552540)));
      if (var2) {
         var4 = JI.g;
         if (afT.ag()) {
            var4 *= this.m + (this.l - this.m) * var1;
         }
      }

      boolean var5 = false;
      if (this.a.a == null) {
         var5 = JI.a(this.a.a.y);
      }

      if (var5) {
         if (!afT.c) {
            c = true;
            JI.u = true;
            this.a.a.a = true;
         }

         var4 /= 4.0F;
      } else if (afT.c) {
         c = false;
         JI.u = false;
         this.a = new acv();
         this.b = new acv();
         this.a.a.a = true;
      }

      if (var3 instanceof Oh && ((Oh)var3).getHealth() <= 0.0F) {
         float var6 = (float)((Oh)var3).q + var1;
         var4 /= (1.0F - 500.0F / (var6 + 500.0F)) * 2.0F + 1.0F;
      }

      sD var7 = AI.a(this.a.a, var3, var1);
      if (var7.a() == si.h) {
         var4 = var4 * 60.0F / iM.a(iM.a(-33927191) ^ iM.a(~iM.a(1082765334)));
      }

      return var4;
   }

   private void c(float var1) {
      NN var2 = this.a.a();
      if (var2 instanceof Oh) {
         Oh var3 = (Oh)var2;
         float var4 = (float)var3.o - var1;
         float var5;
         if (var3.getHealth() <= 0.0F) {
            var5 = (float)var3.q + var1;
            By.b(40.0F - 8000.0F / (var5 + 200.0F), 0.0F, 0.0F, 1.0F);
         }

         if (var4 < 0.0F) {
            return;
         }

         var4 /= (float)var3.p;
         var4 = adh.a(var4 * var4 * var4 * var4 * 3.1415927F);
         var5 = var3.s;
         By.b(-var5, 0.0F, 1.0F, 0.0F);
         By.b(-var4 * 14.0F, 0.0F, 0.0F, 1.0F);
         By.b(var5, 0.0F, 1.0F, 0.0F);
      }

   }

   private void d(float var1) {
      NN var2 = this.a.a();
      if (var2 instanceof Rn) {
         Rn var3 = (Rn)var2;
         float var4 = var3.o - var3.n;
         float var5 = -(var3.o + var4 * var1);
         float var6 = var3.I + (var3.J - var3.I) * var1;
         float var7 = var3.y + (var3.z - var3.y) * var1;
         By.c(adh.a(var5 * 3.1415927F) * var6 * 0.5F, -Math.abs(adh.b(var5 * 3.1415927F) * var6), 0.0F);
         By.b(adh.a(var5 * 3.1415927F) * var6 * 3.0F, 0.0F, 0.0F, 1.0F);
         By.b(Math.abs(adh.b(var5 * 3.1415927F - 0.2F) * var6) * 5.0F, 1.0F, 0.0F, 0.0F);
         By.b(var7, 1.0F, 0.0F, 0.0F);
      }

   }

   private void e(float var1) {
      CallbackInfo var31 = new CallbackInfo("orientCamera", true);
      this.a(var1, var31);
      if (!var31.isCancelled()) {
         if (!this.a(var1)) {
            NN var2 = this.a.a();
            float var3 = var2.getEyeHeight();
            double var4 = (double)var1;
            double var6 = var2.a + (var2.d - var2.a) * var4;
            double var8 = var2.b + (var2.e - var2.b) * var4 + (double)var3;
            double var10 = var2.c + (var2.f - var2.c) * var4;
            double var12;
            if (var2 instanceof Oh && ((Oh)var2).isPlayerSleeping()) {
               var3 = (float)((double)var3 + 1.0D);
               By.c(0.0F, 0.3F, 0.0F);
               sD var32 = this.a.a.a(adh.b(var2.d), adh.b(var2.e), adh.b(var2.f));
               nh var13 = var32.a();
               if (var13 == RQ.a) {
                  int var34 = ((abP)var32.a((so)nk.a)).getHorizontalIndex();
                  By.b((float)(var34 * 90), 0.0F, 1.0F, 0.0F);
               }

               By.b(var2.l + (var2.j - var2.l) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
               By.b(var2.m + (var2.k - var2.m) * var1, -1.0F, 0.0F, 0.0F);
            } else if (JI.j > 0) {
               var12 = (double)(this.f + (4.0F - this.f) * var1);
               float var14 = var2.j;
               float var15 = var2.k;
               if (JI.j == 2) {
                  var15 += 180.0F;
               }

               float var16 = var14 * 0.017453292F;
               float var17 = var15 * 0.017453292F;
               double var18 = (double)(-adh.a(var16) * adh.b(var17)) * var12;
               double var20 = (double)(adh.b(var16) * adh.b(var17)) * var12;
               double var22 = (double)(-adh.a(var17)) * var12;

               for(int var24 = 0; var24 < 8; ++var24) {
                  float var25 = (float)((var24 & 1) * 2 - 1);
                  float var26 = (float)((var24 >> 1 & 1) * 2 - 1);
                  float var27 = (float)((var24 >> 2 & 1) * 2 - 1);
                  var25 *= 0.1F;
                  var26 *= 0.1F;
                  var27 *= 0.1F;
                  adi var28 = this.a.a.a(new adm(var6 + (double)var25, var8 + (double)var26, var10 + (double)var27), new adm(var6 - var18 + (double)var25 + (double)var27, var8 - var22 + (double)var26, var10 - var20 + (double)var27), false, true, true);
                  if (var28 != null) {
                     double var29 = var28.a.distanceTo(var6, var8, var10);
                     if (var29 < var12) {
                        var12 = var29;
                     }
                  }
               }

               if (JI.j == 2) {
                  By.b(180.0F, 0.0F, 1.0F, 0.0F);
               }

               By.b(var2.k - var15, 1.0F, 0.0F, 0.0F);
               By.b(var2.j - var14, 0.0F, 1.0F, 0.0F);
               By.c(0.0F, 0.0F, (float)(-var12));
               By.b(var14 - var2.j, 0.0F, 1.0F, 0.0F);
               By.b(var15 - var2.k, 1.0F, 0.0F, 0.0F);
            } else {
               By.c(0.0F, 0.0F, 0.05F);
            }

            By.b(var2.m + (var2.k - var2.m) * var1, 1.0F, 0.0F, 0.0F);
            if (var2 instanceof QB) {
               QB var33 = (QB)var2;
               By.b(var33.D + (var33.C - var33.D) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
            } else {
               By.b(var2.l + (var2.j - var2.l) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
            }

            By.c(0.0F, -var3, 0.0F);
            var12 = var2.a;
            double var35 = var2.b;
            double var36 = var2.c;
            var6 = var12 + (var2.d - var12) * (double)var1;
            var8 = var35 + (var2.e - var35) * (double)var1 + (double)var3;
            var10 = var36 + (var2.f - var36) * (double)var1;
            this.b = this.a.a.a(var6, var8, var10, var1);
         }
      }
   }

   public void a(float var1, int var2) {
      this.e = (float)(JI.b() * 16);
      if (afT.d()) {
         this.e *= 0.95F;
      }

      if (afT.e()) {
         this.e *= 0.83F;
      }

      By.l(5889);
      By.B();
      this.v = this.e * 2.0F;
      if (this.v < 173.0F) {
         this.v = 173.0F;
      }

      this.getClass();
      if (1.0D != 1.0D) {
         By.c(0.0F, 0.0F, 0.0F);
         this.getClass();
         this.getClass();
         By.a(1.0D, 1.0D, 1.0D);
      }

      Project.gluPerspective(this.a(var1, true), (float)this.a.a / (float)this.a.b, 0.05F, this.v);
      By.l(5888);
      By.B();
      this.c(var1);
      if (JI.b) {
         this.d(var1);
      }

      float var3 = this.a.a.i + (this.a.a.h - this.a.a.i) * var1;
      if (var3 > 0.0F) {
         byte var4 = 20;
         if (this.a.a.a((ZV)RU.i)) {
            var4 = 7;
         }

         float var5 = 5.0F / (var3 * var3 + 5.0F) - var3 * 0.04F;
         var5 *= var5;
         By.b(((float)this.c + var1) * (float)var4, 0.0F, 1.0F, 1.0F);
         By.b(1.0F / var5, 1.0F, 1.0F);
         By.b(-((float)this.c + var1) * (float)var4, 0.0F, 1.0F, 1.0F);
      }

      this.e(var1);
   }

   private void b(float var1, int var2) {
      this.a(var1, var2, new CallbackInfo("renderHand", false));
      this.a(var1, var2, true, true, false);
      this.b(var1, var2, new CallbackInfo("renderHand", false));
   }

   public void a(float var1, int var2, boolean var3, boolean var4, boolean var5) {
      By.l(5889);
      By.B();
      if (afT.ad()) {
         akC.q();
      }

      Project.gluPerspective(this.a(var1, false), (float)this.a.a / (float)this.a.b, 0.05F, this.e * 2.0F);
      By.l(5888);
      By.B();
      boolean var6 = false;
      if (var3) {
         By.C();
         this.c(var1);
         if (JI.b) {
            this.d(var1);
         }

         var6 = this.a.a() instanceof Oh && ((Oh)this.a.a()).isPlayerSleeping();
         if (JI.j == 0 && !var6 && !JI.s && !this.a.a.a()) {
            this.enableLightmap();
            if (afT.ad()) {
               akF.a(this.a, var1, var5);
            } else {
               this.a.a(var1);
            }

            this.disableLightmap();
         }

         By.D();
      }

      if (var4) {
         this.disableLightmap();
         if (JI.j == 0 && !var6) {
            this.a.b(var1);
            this.c(var1);
         }

         if (JI.b) {
            this.d(var1);
         }
      }

   }

   public void disableLightmap() {
      By.g(Ci.o);
      By.w();
      By.g(Ci.n);
      if (afT.ad()) {
         akC.D(this.a);
      }

   }

   public void enableLightmap() {
      By.g(Ci.o);
      By.l(5890);
      By.B();
      By.b(0.00390625F, 0.00390625F, 0.00390625F);
      By.c(8.0F, 8.0F, 8.0F);
      By.l(5888);
      this.a.a().a(this.c);
      By.b(3553, 10241, 9729);
      By.b(3553, 10240, 9729);
      By.b(3553, 10242, 33071);
      By.b(3553, 10243, 33071);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.v();
      By.g(Ci.n);
      if (afT.ad()) {
         akC.C(this.a);
      }

   }

   private void d() {
      this.q = (float)((double)this.q + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.q = (float)((double)this.q * 0.9D);
      this.p += this.q - this.p;
      this.e = true;
   }

   private void f(float var1) {
      if (this.e) {
         yw var2 = this.a.a;
         if (var2 != null) {
            if (afT.V() && agd.a(var2, this.p, this.a, this.a.a.a((ZV)RU.p), var1)) {
               this.a.updateDynamicTexture();
               this.e = false;
               return;
            }

            float var3 = var2.a(1.0F);
            float var4 = var3 * 0.95F + 0.05F;
            float[] var5 = var2.a.a();

            for(int var6 = 0; var6 < 256; ++var6) {
               float var7 = var5[var6 / 16] * var4;
               float var8 = var5[var6 % 16] * (this.p * 0.1F + 1.5F);
               if (var2.d() > 0) {
                  var7 = var5[var6 / 16];
               }

               float var9 = var7 * (var3 * 0.65F + 0.35F);
               float var10 = var7 * (var3 * 0.65F + 0.35F);
               float var11 = var8 * ((var8 * 0.6F + 0.4F) * 0.6F + 0.4F);
               float var12 = var8 * (var8 * var8 * 0.6F + 0.4F);
               float var13 = var9 + var8;
               float var14 = var10 + var11;
               float var15 = var7 + var12;
               var13 = var13 * 0.96F + 0.03F;
               var14 = var14 * 0.96F + 0.03F;
               var15 = var15 * 0.96F + 0.03F;
               float var16;
               if (this.n > 0.0F) {
                  var16 = this.o + (this.n - this.o) * var1;
                  var13 = var13 * (1.0F - var16) + var13 * 0.7F * var16;
                  var14 = var14 * (1.0F - var16) + var14 * 0.6F * var16;
                  var15 = var15 * (1.0F - var16) + var15 * 0.6F * var16;
               }

               if (var2.a.a().a() == 1) {
                  var13 = 0.22F + var8 * 0.75F;
                  var14 = 0.28F + var11 * 0.75F;
                  var15 = 0.25F + var12 * 0.75F;
               }

               var13 = adh.a(var13, 0.0F, 1.0F);
               var14 = adh.a(var14, 0.0F, 1.0F);
               var15 = adh.a(var15, 0.0F, 1.0F);
               float var17;
               if (this.a.a.a((ZV)RU.p)) {
                  var16 = this.a(this.a.a, var1);
                  var17 = 1.0F / var13;
                  if (var17 > 1.0F / var14) {
                     var17 = 1.0F / var14;
                  }

                  if (var17 > 1.0F / var15) {
                     var17 = 1.0F / var15;
                  }

                  var13 = var13 * (1.0F - var16) + var13 * var17 * var16;
                  var14 = var14 * (1.0F - var16) + var14 * var17 * var16;
                  var15 = var15 * (1.0F - var16) + var15 * var17 * var16;
               }

               var13 = Math.min(var13, 1.0F);
               var14 = Math.min(var14, 1.0F);
               var15 = Math.min(var15, 1.0F);
               var16 = JI.h;
               var17 = 1.0F - var13;
               float var18 = 1.0F - var14;
               float var19 = 1.0F - var15;
               var17 = 1.0F - var17 * var17 * var17 * var17;
               var18 = 1.0F - var18 * var18 * var18 * var18;
               var19 = 1.0F - var19 * var19 * var19 * var19;
               var13 = var13 * (1.0F - var16) + var17 * var16;
               var14 = var14 * (1.0F - var16) + var18 * var16;
               var15 = var15 * (1.0F - var16) + var19 * var16;
               var13 = var13 * 0.96F + 0.03F;
               var14 = var14 * 0.96F + 0.03F;
               var15 = var15 * 0.96F + 0.03F;
               var13 = adh.a(var13, 0.0F, 1.0F);
               var14 = adh.a(var14, 0.0F, 1.0F);
               var15 = adh.a(var15, 0.0F, 1.0F);
               int var20 = (int)(var13 * 255.0F);
               int var21 = (int)(var14 * 255.0F);
               int var22 = (int)(var15 * 255.0F);
               this.a[var6] = -16777216 | var20 << 16 | var21 << 8 | var22;
            }

            this.a.updateDynamicTexture();
            this.e = false;
         }
      }

   }

   public float a(Oh var1, float var2) {
      int var3 = var1.b(RU.p).getDuration();
      return var3 > 200 ? 1.0F : 0.7F + adh.a(((float)var3 - var2) * 3.1415927F * 0.2F) * 0.3F;
   }

   public void a(float var1, long var2) {
      this.g();
      boolean var4 = Ls.c();
      this.c(var4);
      this.b(var4);
      this.a(var4, var1);
      sE var5 = this.a;
      if (!var5.c) {
         vk var6 = var5.b();
         int var7 = var6.getScaledWidth();
         int var8 = var6.getScaledHeight();
         int var9 = Lv.g() * var7 / var5.a;
         int var10 = var8 - Lv.h() * var8 / var5.b - 1;
         if (var5.a == null) {
            this.e();
         } else {
            this.a(JI.b, var7, var8, var2, var1);
         }

         this.a(var9, var10, var6);
      }

      this.h();
   }

   private void b(boolean var1) {
      if (var1 && sE.a && this.a.d && !Lv.f()) {
         Lv.a(false);
         Lv.a(Ls.c() / 2, Ls.d() / 2 - 20);
         Lv.a(true);
      }

   }

   private void a(boolean var1, float var2) {
      if (this.a.d && var1) {
         this.a.a.a();
         float var3 = JI.a * 0.6F + 0.2F;
         float var4 = var3 * var3 * var3 * 8.0F;
         float var5 = (float)this.a.a.a * var4;
         float var6 = (float)this.a.a.b * var4;
         byte var7 = 1;
         if (JI.a) {
            var7 = -1;
         }

         if (JI.u) {
            this.g += var5;
            this.h += var6;
            float var8 = var2 - this.k;
            this.k = var2;
            var5 = this.i * var8;
            var6 = this.j * var8;
         } else {
            this.g = 0.0F;
            this.h = 0.0F;
         }

         this.a.a.turn(var5, var6 * (float)var7);
      }

   }

   private void c(boolean var1) {
      if (!var1 && JI.m && (!JI.n || !Lv.a(1))) {
         if (sE.a() - this.a > 500L) {
            this.a.j();
         }
      } else {
         this.a = sE.a();
      }

   }

   private void e() {
      By.b(0, 0, this.a.a, this.a.b);
      By.l(5889);
      By.B();
      By.l(5888);
      By.B();
      this.setupOverlayRendering();
   }

   private void a(int var1, int var2, int var3, long var4, float var6) {
      int var7 = adh.a(var1, 60, sE.b());
      long var8 = System.nanoTime() - var4;
      long var10 = Math.max((long)(1000000000 / var7 / 4) - var8, 0L);
      this.b(var6, System.nanoTime() + var10);
      if (Ci.f) {
         this.a.a.b();
         if (this.a != null && this.f) {
            By.l(5890);
            By.C();
            By.B();
            this.a.a(var6);
            By.D();
         }

         this.a.a().bindFramebuffer(true);
      }

      if (!JI.s || this.a.a != null) {
         By.a(516, 0.1F);
         this.setupOverlayRendering();
         this.a(var2, var3, var6);
         this.a.a.a(var6);
         if (JI.B && !JI.t) {
            afT.b(this.a);
         }
      }

   }

   private void a(int var1, int var2, vk var3) {
      sE var4 = this.a;
      uI var5 = var4.a;
      if (var5 != null) {
         By.k(256);

         try {
            var5.drawScreen(var1, var2, var4.b());
         } catch (Throwable var9) {
            Kn var7 = Kn.a(var9, "Rendering screen");
            Ku var8 = var7.a("Screen render details");
            var8.a((String)"Screen name", (KB)(new Bp(this)));
            var8.a((String)"Mouse location", (KB)(new Bq(this, var1, var2)));
            var8.a((String)"Screen size", (KB)(new Br(this, var3)));
            throw new acB(var7);
         }
      }

   }

   private boolean a() {
      this.getClass();
      NN var1 = this.a.a();
      boolean var2 = var1 instanceof Rn && !JI.s;
      if (var2 && !((Rn)var1).a.a.a()) {
         Vh var3 = ((Rn)var1).a();
         if (this.a.a != null && this.a.a.a == adj.BLOCK) {
            acV var4 = this.a.a.a();
            sD var5 = this.a.a.a((acV)var4);
            nh var6 = var5.a();
            if (this.a.a.a() == aeb.SPECTATOR) {
               nh var7 = var5.a();
               var2 = var7.hasTileEntity() && this.a.a.a((acV)var4) instanceof SE;
            } else {
               var2 = !var3.isEmpty() && (var3.a(var6) || var3.b(var6));
            }
         }
      }

      return var2;
   }

   public void b(float var1, long var2) {
      this.f(var1);
      if (this.a.a() == null) {
         this.a.a((NN)this.a.a);
      }

      this.a(var1);
      if (afT.ad()) {
         akC.a(this.a, var1, var2);
      }

      By.j();
      By.d();
      By.a(516, 0.1F);
      this.a(2, var1, var2);
   }

   private void a(int var1, float var2, long var3) {
      boolean var5 = afT.ad();
      sE var6 = this.a;
      if (var5) {
         akC.a(var6, var1, var2, var3);
      }

      Ck var7 = var6.a;
      zO var8 = var6.a;
      tE var9 = var6.a;
      boolean var10 = this.a();
      By.p();
      int var11 = var6.a;
      int var12 = var6.b;
      if (var5) {
         akC.a(var6, 0, 0, var11, var12);
      } else {
         By.b(0, 0, var11, var12);
      }

      this.g(var2);
      By.k(17664);
      if (var5) {
         akC.g();
      }

      this.a(var2, var1);
      if (var5) {
         akC.a(var6, var2);
      }

      AI.a(var6.a(), JI.j == 2);
      EY var13 = EZ.a();
      var13.a = var5 && !akC.l();
      Fb var14 = this.a;
      NN var15 = var6.a();
      double var16 = var15.g + (var15.d - var15.g) * (double)var2;
      double var18 = var15.h + (var15.e - var15.h) * (double)var2;
      double var20 = var15.i + (var15.f - var15.i) * (double)var2;
      if (var5) {
         akF.a(var14, var16, var18, var20);
      } else {
         var14.setPosition(var16, var18, var20);
      }

      if ((afT.E() || afT.F() || afT.J()) && !akC.c) {
         this.a(-1, var2);
         By.l(5889);
         By.B();
         Project.gluPerspective(this.a(var2, true), (float)var11 / (float)var12, 0.05F, this.v);
         By.l(5888);
         if (var5) {
            akC.h(var6);
         }

         var7.a(var2, var1);
         if (var5) {
            akC.i(var6);
         }

         By.l(5889);
         By.B();
         Project.gluPerspective(this.a(var2, true), (float)var11 / (float)var12, 0.05F, this.v);
         By.l(5888);
      } else {
         By.k();
      }

      this.a(0, var2);
      By.j(7425);
      if (var15.e + (double)var15.getEyeHeight() < 128.0D + (double)(JI.k * 128.0F)) {
         this.a(var7, var2, var1, var16, var18, var20);
      }

      this.a(0, var2);
      HM var22 = var6.a();
      var22.a(HO.a);
      Co.a();
      this.a(var15, var2, var14, var6.a.isSpectator());
      if (var5) {
         akF.a(var7, var15, (double)var2, var14, this.b++, var9.isSpectator());
      } else {
         var7.a(var15, (double)var2, var14, this.b++, var9.isSpectator());
      }

      if (var1 == 0 || var1 == 2) {
         var6.a.a(var3);
      }

      if (JI.x && var1 > 0) {
         Lw.d();
      }

      By.l(5888);
      By.C();
      By.c();
      if (var5) {
         akF.a(var6);
      }

      var7.a(abu.SOLID, (double)var2, var1, var15);
      By.d();
      if (var5) {
         akF.b(var6);
      }

      HA var23 = HO.a.a();
      var23.setBlurMipmap(false, JI.h > 0);
      var7.a(abu.CUTOUT_MIPPED, (double)var2, var1, var15);
      var23.restoreLastBlurMipmap();
      var23.setBlurMipmap(false, false);
      if (var5) {
         akF.c(var6);
      }

      var7.a(abu.CUTOUT, (double)var2, var1, var15);
      var23.restoreLastBlurMipmap();
      if (var5) {
         akF.d(var6);
      }

      By.j(7424);
      By.a(516, 0.1F);
      By.l(5888);
      By.D();
      By.C();
      Co.b();
      var7.a(var15, var14, var2);
      Co.a();
      this.disableLightmap();
      By.l(5888);
      By.D();
      adi var24;
      if (var10 && (var24 = var6.a) != null && !var15.a(si.h)) {
         By.c();
         var7.a(var15, var24, 0, var2);
         By.d();
      }

      if (var6.a.a()) {
         boolean var25 = By.a();
         By.o();
         var6.a.a(var2, var3);
         By.b(var25);
      }

      if (!var7.a.isEmpty()) {
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE, BU.ONE, BL.ZERO);
         var23.setBlurMipmap(false, false);
         Cw var26 = var6.a;
         var7.a(var26, var26.a(), var15, var2);
         var23.restoreLastBlurMipmap();
         By.k();
      }

      By.a(770, 771, 1, 0);
      By.k();
      this.enableLightmap();
      if (var5) {
         akC.r(var6);
      }

      var8.b(var15, var2);
      Co.a();
      this.a(0, var2);
      if (var5) {
         akC.s(var6);
      }

      var8.a(var15, var2);
      if (var5) {
         akC.t(var6);
      }

      this.disableLightmap();
      By.a(false);
      if (afT.ad()) {
         By.a(akC.i());
      }

      By.p();
      if (var5) {
         akC.u(var6);
      }

      this.b(var2);
      if (var5) {
         akC.v(var6);
      }

      By.a(true);
      var7.a(var15, var2);
      if (var5) {
         akF.a(this, var2, var1);
         akC.p();
      }

      By.k();
      By.p();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      By.a(516, 0.1F);
      this.a(0, var2);
      By.l();
      By.a(false);
      var22.a(HO.a);
      By.j(7425);
      if (var5) {
         akC.w(var6);
      }

      var7.a(abu.TRANSLUCENT, (double)var2, var1, var15);
      if (var5) {
         akC.x(var6);
      }

      By.j(7424);
      By.a(true);
      By.p();
      By.k();
      By.o();
      if (var15.e + (double)var15.getEyeHeight() >= 128.0D + (double)(JI.k * 128.0F)) {
         this.a(var7, var2, var1, var16, var18, var20);
      }

      if (this.a(var1, var2, var3)) {
         this.getClass();
         if (!akC.c) {
            if (var5) {
               akF.b(this, var2, var1);
               akC.f(var6);
            }

            By.k(256);
            if (var5) {
               akF.c(this, var2, var1);
            } else {
               this.b(var2, var1);
            }
         }
      }

      if (var5) {
         akC.g(var6);
      }

   }

   private void a(Ck var1, float var2, int var3, double var4, double var6, double var8) {
      if (JI.b() >= 4 && !afT.k() && akC.a(this.a.a)) {
         By.l(5889);
         By.B();
         Project.gluPerspective(this.a(var2, true), (float)this.a.a / (float)this.a.b, 0.05F, this.v * 4.0F);
         By.l(5888);
         By.C();
         this.a(0, var2);
         var1.a(var2, var3, var4, var6, var8);
         By.o();
         By.D();
         By.l(5889);
         By.B();
         Project.gluPerspective(this.a(var2, true), (float)this.a.a / (float)this.a.b, 0.05F, this.v);
         By.l(5888);
      }

   }

   private void f() {
      sE var1 = this.a;
      yw var2 = var1.a;
      float var3 = var2.b();
      if (!afT.h()) {
         var3 /= 2.0F;
      }

      Random var4 = this.a;
      if (var3 != 0.0F && afT.y()) {
         var4.setSeed((long)this.c * 312987231L);
         NN var5 = var1.a();
         int var6 = adh.b(var5.d);
         int var7 = adh.b(var5.e);
         int var8 = adh.b(var5.f);
         double var9 = 0.0D;
         double var11 = 0.0D;
         double var13 = 0.0D;
         int var15 = 0;
         int var16 = (int)(100.0F * var3 * var3);
         if (JI.l == 1) {
            var16 >>= 1;
         } else if (JI.l == 2) {
            var16 = 0;
         }

         for(int var17 = 0; var17 < var16; ++var17) {
            int var18 = var6 + var4.nextInt(10) - var4.nextInt(10);
            int var19 = var8 + var4.nextInt(10) - var4.nextInt(10);
            int var20 = var2.a(var18, var19);
            aeu var21 = var2.a(var18, var20, var19);
            sD var22 = var2.a(var18, var7 - 1, var19);
            if (var20 <= var7 + 10 && var20 >= var7 - 10 && var21.canRain() && var21.getTemperature(var18, var20, var19) >= 0.15F) {
               double var23 = var4.nextDouble();
               double var25 = var4.nextDouble();
               acU var27 = var22.b(var2, var18, var7 - 1, var19);
               if (var22.a() != si.i && var22.a() != RQ.bS) {
                  if (var22.a() != si.a) {
                     ++var15;
                     if (var4.nextInt(var15) == 0) {
                        var9 = (double)var18 + var23;
                        var11 = (double)((float)var7 - 1.0F + 0.1F) + var27.e - 1.0D;
                        var13 = (double)var19 + var25;
                     }

                     var2.a(abW.WATER_DROP, (double)var18 + var23, (double)((float)var20 - 1.0F + 0.1F) + var27.e, (double)var19 + var25, 0.0D, 0.0D, 0.0D);
                  }
               } else {
                  var2.a(abW.SMOKE_NORMAL, (double)var6 + var23, (double)((float)var20 + 0.1F) - var27.b, (double)var19 + var25, 0.0D, 0.0D, 0.0D);
               }
            }
         }

         if (var15 > 0 && var4.nextInt(3) < this.d++) {
            this.d = 0;
            if (var11 > (double)(var7 + 1) && var2.a(var6, var8) > var7) {
               var2.a(var9, var11, var13, RW.iw, acI.WEATHER, 0.1F, 0.5F, false);
            } else {
               var2.a(var9, var11, var13, RW.iv, acI.WEATHER, 0.2F, 1.0F, false);
            }
         }
      }

   }

   protected void b(float var1) {
      sE var2 = this.a;
      yw var3 = var2.a;
      float var4 = var3.b();
      if (var4 > 0.0F) {
         if (afT.i()) {
            return;
         }

         this.enableLightmap();
         NN var5 = var2.a();
         int var6 = adh.b(var5.d);
         int var7 = adh.b(var5.e);
         int var8 = adh.b(var5.f);
         Cw var9 = var2.a;
         Bh var10 = var9.a();
         By.q();
         By.a(0.0F, 1.0F, 0.0F);
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         By.a(516, 0.1F);
         double var11 = var5.g + (var5.d - var5.g) * (double)var1;
         double var13 = var5.h + (var5.e - var5.h) * (double)var1;
         double var15 = var5.i + (var5.f - var5.i) * (double)var1;
         int var17 = adh.b(var13);
         byte var18 = 5;
         if (afT.h()) {
            var18 = 10;
         }

         byte var19 = -1;
         float var20 = (float)this.c + var1;
         var10.setTranslation(-var11, -var13, -var15);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         float[] var21 = this.a;
         float[] var22 = this.b;
         Random var23 = this.a;
         HM var24 = var2.a();

         for(int var25 = var8 - var18; var25 <= var8 + var18; ++var25) {
            for(int var26 = var6 - var18; var26 <= var6 + var18; ++var26) {
               int var27 = (var25 - var8 + 16) * 32 + var26 - var6 + 16;
               double var28 = (double)var21[var27] * 0.5D;
               double var30 = (double)var22[var27] * 0.5D;
               aeu var32 = var3.a(var26, 0, var25);
               if (var32.canRain() || var32.b()) {
                  int var33 = var3.a(var26, var25);
                  int var34 = var7 - var18;
                  int var35 = var7 + var18;
                  if (var34 < var33) {
                     var34 = var33;
                  }

                  if (var35 < var33) {
                     var35 = var33;
                  }

                  int var36 = Math.max(var33, var17);
                  if (var34 != var35) {
                     var23.setSeed((long)(var26 * var26 * 3121 + var26 * 45238971 ^ var25 * var25 * 418711 + var25 * 13761));
                     float var37 = var32.getTemperature(var26, var34, var25);
                     double var38;
                     double var40;
                     double var42;
                     if (var37 >= 0.15F) {
                        if (var19 != 0) {
                           if (var19 >= 0) {
                              var9.draw();
                           }

                           var19 = 0;
                           var24.b(a);
                           var10.a(7, In.d);
                        }

                        var38 = -((double)(this.c + var26 * var26 * 3121 + var26 * 45238971 + var25 * var25 * 418711 + var25 * 13761 & 31) + (double)var1) / 32.0D * (3.0D + this.a.nextDouble());
                        var40 = (double)((float)var26 + 0.5F) - var5.d;
                        var42 = (double)((float)var25 + 0.5F) - var5.f;
                        float var44 = adh.a(var40 * var40 + var42 * var42) / (float)var18;
                        float var45 = ((1.0F - var44 * var44) * 0.5F + 0.5F) * var4;
                        int var46 = var3.getCombinedLight(var26, var36, var25, 0);
                        int var47 = var46 >> 16 & '\uffff';
                        int var48 = var46 & '\uffff';
                        var10.a((double)var26 - var28 + 0.5D, (double)var35, (double)var25 - var30 + 0.5D).a(0.0D, (double)var34 * 0.25D + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).endVertex();
                        var10.a((double)var26 + var28 + 0.5D, (double)var35, (double)var25 + var30 + 0.5D).a(1.0D, (double)var34 * 0.25D + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).endVertex();
                        var10.a((double)var26 + var28 + 0.5D, (double)var34, (double)var25 + var30 + 0.5D).a(1.0D, (double)var35 * 0.25D + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).endVertex();
                        var10.a((double)var26 - var28 + 0.5D, (double)var34, (double)var25 - var30 + 0.5D).a(0.0D, (double)var35 * 0.25D + var38).a(1.0F, 1.0F, 1.0F, var45).a(var47, var48).endVertex();
                     } else {
                        if (var19 != 1) {
                           if (var19 >= 0) {
                              var9.draw();
                           }

                           var19 = 1;
                           var2.a().b(b);
                           var10.a(7, In.d);
                        }

                        var38 = (double)(-((float)(this.c & 511) + var1) / 512.0F);
                        var40 = var23.nextDouble() + (double)var20 * 0.01D * (double)((float)var23.nextGaussian());
                        var42 = var23.nextDouble() + (double)(var20 * (float)var23.nextGaussian()) * 0.001D;
                        double var53 = (double)((float)var26 + 0.5F) - var5.d;
                        double var54 = (double)((float)var25 + 0.5F) - var5.f;
                        float var55 = adh.a(var53 * var53 + var54 * var54) / (float)var18;
                        float var49 = ((1.0F - var55 * var55) * 0.3F + 0.5F) * var4;
                        int var50 = (var3.getCombinedLight(var26, var36, var25, 0) * 3 + 15728880) / 4;
                        int var51 = var50 >> 16 & '\uffff';
                        int var52 = var50 & '\uffff';
                        var10.a((double)var26 - var28 + 0.5D, (double)var35, (double)var25 - var30 + 0.5D).a(0.0D + var40, (double)var34 * 0.25D + var38 + var42).a(1.0F, 1.0F, 1.0F, var49).a(var51, var52).endVertex();
                        var10.a((double)var26 + var28 + 0.5D, (double)var35, (double)var25 + var30 + 0.5D).a(1.0D + var40, (double)var34 * 0.25D + var38 + var42).a(1.0F, 1.0F, 1.0F, var49).a(var51, var52).endVertex();
                        var10.a((double)var26 + var28 + 0.5D, (double)var34, (double)var25 + var30 + 0.5D).a(1.0D + var40, (double)var35 * 0.25D + var38 + var42).a(1.0F, 1.0F, 1.0F, var49).a(var51, var52).endVertex();
                        var10.a((double)var26 - var28 + 0.5D, (double)var34, (double)var25 - var30 + 0.5D).a(0.0D + var40, (double)var35 * 0.25D + var38 + var42).a(1.0F, 1.0F, 1.0F, var49).a(var51, var52).endVertex();
                     }
                  }
               }
            }
         }

         if (var19 >= 0) {
            var9.draw();
         }

         var10.setTranslation(0.0D, 0.0D, 0.0D);
         By.p();
         By.k();
         By.a(516, 0.1F);
         this.disableLightmap();
      }

   }

   public void setupOverlayRendering() {
      vk var1 = this.a.b();
      By.k(256);
      By.l(5889);
      By.B();
      By.a(0.0D, var1.getScaledWidth_double(), var1.getScaledHeight_double(), 0.0D, 1000.0D, 3000.0D);
      By.l(5888);
      By.B();
      By.c(0.0F, 0.0F, -2000.0F);
   }

   private void g(float var1) {
      sE var2 = this.a;
      yw var3 = var2.a;
      NN var4 = var2.a();
      float var5 = 0.25F + 0.75F * (float)JI.b() / 32.0F;
      var5 = 1.0F - (float)Math.pow((double)var5, 0.25D);
      adm var6 = var3.a(var4, var1);
      var6 = agd.a(var2, var6, var3, var4, var1);
      float var7 = (float)var6.a;
      float var8 = (float)var6.b;
      float var9 = (float)var6.c;
      adm var10 = var3.b(var1);
      var10 = agd.a((sE)var2, (adm)var10, (aej)var3, (NN)var4);
      this.a = (float)var10.a;
      this.b = (float)var10.b;
      this.c = (float)var10.c;
      float var13;
      if (JI.b() >= 4) {
         double var11 = adh.a(var3.c(var1)) > 0.0F ? -1.0D : 1.0D;
         var13 = (float)var4.a(var1).dotProduct(var11, 0.0D, 0.0D);
         if (var13 < 0.0F) {
            var13 = 0.0F;
         }

         if (var13 > 0.0F) {
            float[] var14 = var3.a.a(var3.b(var1), var1);
            if (var14 != null) {
               var13 *= var14[3];
               this.a = this.a * (1.0F - var13) + var14[0] * var13;
               this.b = this.b * (1.0F - var13) + var14[1] * var13;
               this.c = this.c * (1.0F - var13) + var14[2] * var13;
            }
         }
      }

      this.a += (var7 - this.a) * var5;
      this.b += (var8 - this.b) * var5;
      this.c += (var9 - this.c) * var5;
      float var19 = var3.b();
      float var12;
      if (var19 > 0.0F) {
         var12 = 1.0F - var19 * 0.5F;
         var13 = 1.0F - var19 * 0.4F;
         this.a *= var12;
         this.b *= var12;
         this.c *= var13;
      }

      var12 = var3.getThunderStrength(var1);
      if (var12 > 0.0F) {
         var13 = 1.0F - var12 * 0.5F;
         this.a *= var13;
         this.b *= var13;
         this.c *= var13;
      }

      sD var22 = AI.a(var3, var4, var1);
      adm var20;
      float var21;
      if (this.b) {
         var20 = var3.a(var1);
         this.a = (float)var20.a;
         this.b = (float)var20.b;
         this.c = (float)var20.c;
      } else if (var22.a() == si.h) {
         var21 = 0.0F;
         if (var4 instanceof Oh) {
            var21 = (float)Nh.c((Oh)var4) * 0.2F;
            var21 = afT.a(var21, 0.0F, 0.6F);
            if (((Oh)var4).a(RU.m)) {
               var21 = var21 * 0.3F + 0.6F;
            }
         }

         this.a = 0.02F + var21;
         this.b = 0.02F + var21;
         this.c = 0.2F + var21;
      } else if (var22.a() == si.i) {
         this.a = 0.6F;
         this.b = 0.1F;
         this.c = 0.0F;
      }

      if (var22.a() == si.h) {
         var20 = agd.a(var3, var4.d, var4.e + 1.0D, var4.f);
         if (var20 != null) {
            this.a = (float)var20.a;
            this.b = (float)var20.b;
            this.c = (float)var20.c;
         }
      } else if (var22.a() == si.i) {
         var20 = agd.b(var3, var4.d, var4.e + 1.0D, var4.f);
         if (var20 != null) {
            this.a = (float)var20.a;
            this.b = (float)var20.b;
            this.c = (float)var20.c;
         }
      }

      var21 = this.r + (this.s - this.r) * var1;
      this.a *= var21;
      this.b *= var21;
      this.c *= var21;
      double var15 = (var4.h + (var4.e - var4.h) * (double)var1) * var3.a.a();
      if (var4 instanceof Oh && ((Oh)var4).a(RU.o)) {
         int var17 = ((Oh)var4).b(RU.o).getDuration();
         if (var17 < 20) {
            var15 *= (double)(1.0F - (float)var17 / 20.0F);
         } else {
            var15 = 0.0D;
         }
      }

      if (var15 < 1.0D) {
         if (var15 < 0.0D) {
            var15 = 0.0D;
         }

         var15 *= var15;
         this.a = (float)((double)this.a * var15);
         this.b = (float)((double)this.b * var15);
         this.c = (float)((double)this.c * var15);
      }

      float var23;
      if (this.n > 0.0F) {
         var23 = this.o + (this.n - this.o) * var1;
         this.a = this.a * (1.0F - var23) + this.a * 0.7F * var23;
         this.b = this.b * (1.0F - var23) + this.b * 0.6F * var23;
         this.c = this.c * (1.0F - var23) + this.c * 0.6F * var23;
      }

      if (var4 instanceof Oh && ((Oh)var4).a(RU.p)) {
         var23 = this.a((Oh)var4, var1);
         float var18 = 1.0F / this.a;
         if (var18 > 1.0F / this.b) {
            var18 = 1.0F / this.b;
         }

         if (var18 > 1.0F / this.c) {
            var18 = 1.0F / this.c;
         }

         if (Float.isInfinite(var18)) {
            var18 = Math.nextAfter(var18, 0.0D);
         }

         this.a = this.a * (1.0F - var23) + this.a * var18 * var23;
         this.b = this.b * (1.0F - var23) + this.b * var18 * var23;
         this.c = this.c * (1.0F - var23) + this.c * var18 * var23;
      }

      akC.a(this.a, this.b, this.c, 0.0F);
   }

   private void a(int var1, float var2) {
      this.a = false;
      sE var3 = this.a;
      yw var4 = var3.a;
      NN var5 = var3.a();
      this.a(false);
      By.a(0.0F, -1.0F, 0.0F);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      sD var6 = AI.a(var4, var5, var2);
      float var7;
      if (var5 instanceof Oh && ((Oh)var5).a(RU.o)) {
         var7 = 5.0F;
         int var9 = ((Oh)var5).b(RU.o).getDuration();
         if (var9 < 20) {
            var7 = 5.0F + (this.e - 5.0F) * (1.0F - (float)var9 / 20.0F);
         }

         By.a(BM.LINEAR);
         if (var1 == -1) {
            By.b(0.0F);
            By.c(var7 * 0.8F);
         } else {
            By.b(var7 * 0.25F);
            By.c(var7);
         }

         if (Lw.a.GL_NV_fog_distance && afT.d()) {
            By.c(34138, 34139);
         }
      } else if (this.b) {
         By.a(BM.EXP);
         By.a(0.1F);
      } else if (var6.a() == si.h) {
         By.a(BM.EXP);
         var7 = afT.K() ? 0.02F : 0.1F;
         if (var5 instanceof Oh) {
            if (((Oh)var5).a(RU.m)) {
               By.a(0.01F);
            } else {
               float var8 = 0.1F - (float)Nh.c((Oh)var5) * 0.03F;
               By.a(afT.a(var8, 0.0F, var7));
            }
         } else {
            By.a(var7);
         }
      } else if (var6.a() == si.i) {
         By.a(BM.EXP);
         By.a(2.0F);
      } else {
         var7 = this.e;
         this.a = true;
         By.a(BM.LINEAR);
         if (var1 == -1) {
            By.b(0.0F);
         } else {
            By.b(var7 * afT.a());
         }

         By.c(var7);
         if (Lw.a.GL_NV_fog_distance) {
            if (afT.d()) {
               By.c(34138, 34139);
            }

            if (afT.e()) {
               By.c(34138, 34140);
            }
         }

         if (var4.a.a((int)var5.d, (int)var5.f) || var3.a.a().c()) {
            By.b(var7 * 0.05F);
            By.c(var7);
         }
      }

      By.g();
      By.n();
      By.a(1028, 4608);
   }

   public void a(boolean var1) {
      if (var1) {
         By.b(2918, this.a(0.0F, 0.0F, 0.0F, 1.0F));
      } else {
         By.b(2918, this.a(this.a, this.b, this.c, 1.0F));
      }

   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      if (afT.ad()) {
         akC.a(var1, var2, var3);
      }

      this.a.clear();
      this.a.put(var1).put(var2).put(var3).put(var4);
      this.a.flip();
      return this.a;
   }

   public void b() {
      this.a = null;
      this.a.a();
   }

   public vh a() {
      return this.a;
   }

   private void g() {
      agq.a();
      if (!this.setFxaaShader(akC.H)) {
         akC.H = 0;
      }

   }

   private void h() {
      if (this.a.a != null && afT.ao() && amn.a("CheckGlErrorFrameFinish", 10000L)) {
         int var1 = By.b();
         if (var1 != 0 && agq.a()) {
            String var2 = afT.a(var1);
            adD var3 = new adD(IK.a("of.message.openglError", var1, var2));
            this.a.a.a().a((adu)var3);
         }
      }

   }

   public boolean setFxaaShader(int var1) {
      if (!Ci.d()) {
         return false;
      } else if (this.a != null && this.a != this.a[2] && this.a != this.a[4]) {
         return true;
      } else if (var1 != 2 && var1 != 4) {
         if (this.a != null) {
            this.a.a();
            this.a = null;
         }

         return true;
      } else if (this.a != null && this.a == this.a[var1]) {
         return true;
      } else if (this.a.a == null) {
         return true;
      } else {
         this.a(new acC("shaders/post/fxaa_of_" + var1 + "x.json"));
         this.a[var1] = this.a;
         return this.f;
      }
   }

   private void a(NN var1, float var2, Fb var3, boolean var4) {
      int var5 = 201435902;
      if (this.g) {
         this.g = false;
         this.a(var1, (double)var2, var3, var4);
         this.a.a.a().deleteChatLine(var5);
      }

      if (Lu.a(61) && Lu.a(38)) {
         if (this.a.a.v.getKeyCode() == 38) {
            if (this.a.a instanceof vC) {
               this.a.a((uI)null);
            }

            while(Lu.b()) {
            }
         }

         if (this.a.a != null) {
            return;
         }

         this.g = true;
         adD var6 = new adD(IK.a("of.message.loadingVisibleChunks"));
         this.a.a.a().a(var6, var5);
         this.a.g = true;
      }

   }

   private void a(NN var1, double var2, Fb var4, boolean var5) {
      int var6 = JI.w;

      try {
         JI.w = 1000;
         Ck var7 = this.a.a;
         int var8 = var7.f();
         long var9 = System.currentTimeMillis();
         long var11 = System.currentTimeMillis() + 5000L;
         int var13 = 0;
         boolean var14 = false;

         do {
            var14 = false;

            for(int var15 = 0; var15 < 100; ++var15) {
               var7.a = true;
               var7.a(var1, var2, var4, this.b++, var5);
               if (!var7.b()) {
                  var14 = true;
               }

               var13 += var7.g();

               while(!var7.b()) {
                  var7.a(System.nanoTime() + 1000000000L);
               }

               var13 -= var7.g();
               if (!var14) {
                  break;
               }
            }

            if (var7.f() != var8) {
               var14 = true;
               var8 = var7.f();
            }

            if (System.currentTimeMillis() > var11) {
               afT.e("Chunks loaded: " + var13);
               var11 = System.currentTimeMillis() + 5000L;
            }
         } while(var14);

         afT.e("Chunks loaded: " + var13);
         afT.e("Finished loading visible chunks");
         Et.a.reset();
      } finally {
         JI.w = var6;
      }

   }

   public void a(Object var1, tI var2, String var3, float var4, float var5, float var6, int var7, float var8, float var9, boolean var10, boolean var11) {
      if (this.a(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11)) {
         this.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   public void b(Object var1, tI var2, String var3, float var4, float var5, float var6, int var7, float var8, float var9, boolean var10, boolean var11) {
      By.C();
      By.c(var4, var5, var6);
      By.a(0.0F, 1.0F, 0.0F);
      By.b(-var8, 0.0F, 1.0F, 0.0F);
      By.b((float)(var10 ? -1 : 1) * var9, 1.0F, 0.0F, 0.0F);
      a(var1);
      By.f();
      By.a(false);
      if (!var11) {
         By.i();
      }

      By.l();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      int var12 = var2.getStringWidth(var3) / 2;
      By.w();
      Cw var13 = var2.a.a;
      Bh var14 = var13.a();
      var14.a(7, In.f);
      var14.a((double)(-var12 - 1), (double)(-1 + var7), 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
      var14.a((double)(-var12 - 1), (double)(8 + var7), 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
      var14.a((double)(var12 + 1), (double)(8 + var7), 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
      var14.a((double)(var12 + 1), (double)(-1 + var7), 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
      var13.draw();
      By.v();
      if (!var11) {
         var2.a(var3, -var2.getStringWidth(var3) / 2, var7, 553648127);
         By.j();
      }

      By.a(true);
      var2.a(var3, -var2.getStringWidth(var3) / 2, var7, var11 ? 553648127 : -1);
      By.e();
      By.k();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.D();
   }

   @Deprecated
   public static void a(tI var0, String var1, float var2, float var3, float var4, int var5, float var6, float var7, boolean var8, boolean var9) {
      sE.a().a.a((Object)null, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void a(Vh var1) {
      this.a = var1;
      this.e = 40;
      this.t = this.a.nextFloat() * 2.0F - 1.0F;
      this.u = this.a.nextFloat() * 2.0F - 1.0F;
   }

   private void a(int var1, int var2, float var3) {
      if (this.a != null && this.e > 0) {
         int var4 = 40 - this.e;
         float var5 = ((float)var4 + var3) / 40.0F;
         float var6 = var5 * var5;
         float var7 = var5 * var6;
         float var8 = 10.25F * var7 * var6 + -24.95F * var6 * var6 + 25.5F * var7 + -13.8F * var6 + 4.0F * var5;
         float var9 = var8 * 3.1415927F;
         float var10 = this.t * (float)(var1 / 4);
         float var11 = this.u * (float)(var2 / 4);
         By.d();
         By.C();
         By.a();
         By.j();
         By.q();
         Co.b();
         By.c((float)(var1 / 2) + var10 * Math.abs(adh.a(var9 * 2.0F)), (float)(var2 / 2) + var11 * Math.abs(adh.a(var9 * 2.0F)), -50.0F);
         float var12 = 50.0F + 175.0F * adh.a(var9);
         By.b(var12, -var12, var12);
         By.b(900.0F * Math.abs(adh.a(var9)), 0.0F, 1.0F, 0.0F);
         By.b(6.0F * adh.b(var5 * 8.0F), 1.0F, 0.0F, 0.0F);
         By.b(6.0F * adh.b(var5 * 8.0F), 0.0F, 0.0F, 1.0F);
         this.a.a().a(this.a, CZ.FIXED);
         By.b();
         By.D();
         Co.a();
         By.p();
         By.i();
      }

   }

   static {
      a = sE.a;
      a = new Lg("textures/environment/rain.png");
      b = new Lg("textures/environment/snow.png");
      a = new acC[]{new acC("shaders/post/notch.json"), new acC("shaders/post/fxaa.json"), new acC("shaders/post/art.json"), new acC("shaders/post/bumpy.json"), new acC("shaders/post/blobs2.json"), new acC("shaders/post/pencil.json"), new acC("shaders/post/color_convolve.json"), new acC("shaders/post/deconverge.json"), new acC("shaders/post/flip.json"), new acC("shaders/post/invert.json"), new acC("shaders/post/ntsc.json"), new acC("shaders/post/outline.json"), new acC("shaders/post/phosphor.json"), new acC("shaders/post/scan_pincushion.json"), new acC("shaders/post/sobel.json"), new acC("shaders/post/bits.json"), new acC("shaders/post/desaturate.json"), new acC("shaders/post/green.json"), new acC("shaders/post/blur.json"), new acC("shaders/post/wobble.json"), new acC("shaders/post/blobs.json"), new acC("shaders/post/antialias.json"), new acC("shaders/post/creeper.json"), new acC("shaders/post/spider.json")};
      a = a.length;
   }

   public boolean a(int var1, float var2, long var3) {
      sE var5 = this.a;
      asE var6 = ((ata)var5).a();
      var6.a(var5, var2);
      aF.BUS.fireAndForget(aF.a(var1, var2));
      var6.a.a(var2);
      return !((HandRender)av.BUS.fire(av.a.a())).isCancelled();
   }

   private float a(yr var1) {
      float var2 = var1.getBlockReachDistance();
      EntityScaleData var3 = (EntityScaleData)this.a.a.a().a(asJ.a);
      if (!var3.shouldApply()) {
         return var2;
      } else {
         double var4 = var3.getY();
         return var4 < 1.0D ? var2 : (float)((double)var2 * (var4 / 2.0D));
      }
   }

   private double a(double var1) {
      EntityScaleData var3 = (EntityScaleData)this.a.a.a().a(asJ.a);
      if (!var3.shouldApply()) {
         return var1;
      } else {
         double var4 = var3.getY();
         return var4 < 1.0D ? var1 : var1 * (var4 / 2.0D);
      }
   }

   public static void a(Object var0) {
      if (!(var0 instanceof Oh)) {
         By.b(-0.025F, -0.025F, 0.025F);
      } else {
         EntityScaleData var1 = (EntityScaleData)((Oh)var0).a().a(asJ.a);
         if (!var1.shouldApply()) {
            By.b(-0.025F, -0.025F, 0.025F);
         } else {
            double var2 = var1.getY();
            if (var2 <= 1.0D) {
               By.b(-0.025F, -0.025F, 0.025F);
            } else {
               By.a(-0.02500000037252903D * var1.getX(), -0.02500000037252903D * var1.getY(), 0.02500000037252903D * var1.getZ());
            }
         }
      }
   }

   public void drawNameplate(FontRenderer var1, String var2, float var3, float var4, float var5, int var6, float var7, float var8, boolean var9, boolean var10) {
      this.b((Object)null, (tI)d.a(var1), var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public void drawNameplate(Object var1, FontRenderer var2, String var3, float var4, float var5, float var6, int var7, float var8, float var9, boolean var10, boolean var11) {
      this.b(var1, (tI)d.a(var2), var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public Camera getCamera() {
      return (Camera)d.a(this.a);
   }

   public boolean loadShader(ResourceLocation var1) {
      return this.a((acC)d.a(var1));
   }

   public float getNightVisionBrightness(EntityLivingBase var1, float var2) {
      return this.a((Oh)d.a(var1), var2);
   }

   protected boolean a(float var1) {
      return ((OrientCamera)aC.BUS.fire(aC.a(var1))).isCancelled();
   }

   protected boolean a(Object var1, String var2, float var3, float var4, float var5, int var6, float var7, float var8, boolean var9, boolean var10) {
      NameTemplateRender var11 = (NameTemplateRender)aB.BUS.fire(aB.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10));
      return !var11.isCancelled();
   }

   private void a(float var1, CallbackInfo var2) {
      NN var3 = (NN)Objects.requireNonNull(this.a.a(), "getRenderViewEntity");
      if (this.a.d()) {
         var2.cancel();
         float var4 = var3.getEyeHeight();
         apO var11 = this.a.a();
         By.b(var11.c, 0.0F, 0.0F, 1.0F);
         By.b(var11.b, 1.0F, 0.0F, 0.0F);
         By.b(var11.a, 0.0F, 1.0F, 0.0F);
         apP var12 = this.a.a();
         By.c(var12.a, var12.b, var12.c);
         float var13 = this.a.a();
         By.c(0.0F, 0.0F, -var13);
         apO var14 = this.a.b();
         var3.k = var14.b;
         var3.j = var14.a;
         float var15 = var3.m + (var3.k - var3.m) * var1;
         float var16 = var3.l + (var3.j - var3.l) * var1 + 180.0F;
         apO var17 = this.a.c();
         By.b(var17.b(), 1.0F, 0.0F, 0.0F);
         By.b(var15, 1.0F, 0.0F, 0.0F);
         By.b(var16, 0.0F, 1.0F, 0.0F);
         By.b(var17.a(), 0.0F, 1.0F, 0.0F);
         By.c(0.0F, -var4, 0.0F);
         double var5 = var3.a + (var3.d - var3.a) * (double)var1;
         double var7 = var3.b + (var3.e - var3.b) * (double)var1 + (double)var4;
         double var9 = var3.c + (var3.f - var3.c) * (double)var1;
         this.b = this.a.a.a(var5, var7, var9, var1);
      } else {
         this.d = var3.k;
      }
   }

   private void a(float var1, int var2, CallbackInfo var3) {
      if (this.a.c()) {
         this.g = JI.j;
         JI.j = 1;
      }

   }

   private void b(float var1, int var2, CallbackInfo var3) {
      if (this.a.c()) {
         JI.j = this.g;
      }

   }
}
