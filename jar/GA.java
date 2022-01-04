import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.renderer.culling.Camera;
import dev.xdark.clientapi.renderer.entity.Render;
import dev.xdark.clientapi.renderer.entity.RenderManager;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.Collections;
import java.util.Map;
import ru.cristalix.core.datasync.EntityScaleData;

public final class Ga implements RenderManager {
   private final Map<Class<? extends NN>, Ff<? extends NN>> a = new Reference2ReferenceOpenHashMap(82, 1.0F);
   private final Map<String, Gk> b = new Object2ObjectArrayMap(3);
   public final sE a;
   private final Gk a;
   private final tI a;
   public final Cw a;
   private double d;
   private double e;
   private double f;
   public final HM a;
   public aej a;
   public NN a;
   public NN b;
   public float a;
   public float b;
   public final JI a;
   public double a;
   public double b;
   public double c;
   private boolean a;
   private boolean b = true;
   private boolean c;
   public Ff a = null;

   public Ga(sE var1, HM var2, Cp var3) {
      this.a = var1;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var1.a;
      this.a = var2;
      Map var4 = this.a;
      var4.put(PJ.class, new Fp(this));
      var4.put(Qm.class, new GA(this));
      var4.put(QQ.class, new Gh(this));
      var4.put(QU.class, new Go(this));
      var4.put(QE.class, new Fr(this));
      var4.put(QL.class, new Gd(this));
      var4.put(Rj.class, new GO(this));
      var4.put(QD.class, new Fq(this));
      var4.put(QN.class, new Ge(this));
      var4.put(QR.class, new Gn(this));
      var4.put(QO.class, new Gg(this));
      var4.put(Qf.class, new Gt(this));
      var4.put(PN.class, new Fy(this));
      var4.put(PK.class, new Fs(this));
      var4.put(PM.class, new Fx(this));
      var4.put(Qj.class, new Gx(this));
      var4.put(Qg.class, new Gu(this));
      var4.put(Qt.class, new GM(this));
      var4.put(Qo.class, new GC(this));
      var4.put(Qs.class, new GK(this));
      var4.put(PI.class, new Fn(this));
      var4.put(Qa.class, new Gi(this));
      var4.put(Qu.class, new GQ(this));
      var4.put(Qw.class, new GS(this));
      var4.put(PV.class, new FM(this));
      var4.put(Qh.class, new Gw(this));
      var4.put(PY.class, new FZ(this));
      var4.put(PR.class, new FI(this, 6.0F));
      var4.put(PP.class, new FH(this));
      var4.put(QX.class, new GB(this));
      var4.put(QZ.class, new GH(this));
      var4.put(PX.class, new FP(this));
      var4.put(QC.class, new Fl(this));
      var4.put(PT.class, new FK(this));
      var4.put(PL.class, new Fv(this));
      var4.put(Qc.class, new Gp(this));
      var4.put(Qb.class, new Gl(this));
      var4.put(PO.class, new FB(this));
      var4.put(Qr.class, new GI(this));
      var4.put(Qp.class, new GG(this));
      var4.put(PW.class, new FN(this));
      var4.put(OG.class, new Ft(this));
      var4.put(Pg.class, new Fw(this));
      var4.put(OH.class, new GL(this));
      var4.put(NN.class, new Fz(this));
      var4.put(PB.class, new Gf(this));
      var4.put(Pn.class, new FQ(this, var3));
      var4.put(Ob.class, new FR(this));
      var4.put(RM.class, new GE(this));
      var4.put(RK.class, new Gz(this));
      var4.put(RJ.class, new Gy(this, RT.al, var3));
      var4.put(Pi.class, new Gy(this, RT.be, var3));
      var4.put(Ph.class, new Gy(this, RT.br, var3));
      var4.put(Rz.class, new Gy(this, RT.aC, var3));
      var4.put(RG.class, new Gm(this, var3));
      var4.put(Pj.class, new Gy(this, RT.bu, var3));
      var4.put(Pl.class, new Gy(this, RT.bK, var3));
      var4.put(RE.class, new FF(this, 2.0F));
      var4.put(RI.class, new FF(this, 0.5F));
      var4.put(Ry.class, new Fu(this));
      var4.put(RN.class, new GN(this));
      var4.put(RH.class, new Gs(this));
      var4.put(Pm.class, new FA(this, var3));
      var4.put(PE.class, new GP(this));
      var4.put(PD.class, new GD(this));
      var4.put(Pk.class, new FE(this));
      var4.put(Pa.class, new Fi(this));
      var4.put(RA.class, new FD(this));
      var4.put(PA.class, new GF(this));
      var4.put(Py.class, new Gc(this));
      var4.put(Po.class, new Gb(this));
      var4.put(Pc.class, new Fo(this));
      var4.put(RC.class, new FG(this));
      var4.put(NU.class, new Fh(this));
      var4.put(QH.class, new FL(this));
      var4.put(QW.class, new Fg(this));
      var4.put(Rk.class, new Fg(this));
      var4.put(QM.class, new Fg(this, 0.92F));
      var4.put(QF.class, new Fg(this, 0.87F));
      var4.put(QJ.class, new FX(this));
      var4.put(RF.class, new FY(this));
      var4.put(OY.class, new FT(this));
      this.a = new Gk(this);
      this.b.put("default", this.a);
      this.b.put("slim", new Gk(this, true));
   }

   public <T extends NN> void a(Class<? extends T> var1, Ff<? extends T> var2) {
      this.a.put(var1, var2);
   }

   public void a(double var1, double var3, double var5) {
      this.d = var1;
      this.e = var3;
      this.f = var5;
   }

   public <T extends NN> Ff<T> a(Class var1) {
      Ff var2 = (Ff)this.a.get(var1);
      if (var2 == null && var1 != NN.class) {
         var2 = this.a(var1.getSuperclass());
         this.a.put(var1, var2);
      }

      return var2;
   }

   public <T extends NN> Ff<T> a(T var1) {
      Ff var2 = var1.a;
      return var2 == null ? (var1.a = this.b(var1)) : var2;
   }

   private <T extends NN> Ff<T> b(T var1) {
      if (var1 instanceof tC) {
         String var2 = ((tC)var1).getSkinType();
         Gk var3 = (Gk)this.b.get(var2);
         return var3 != null ? var3 : this.a;
      } else {
         return this.a(var1.getClass());
      }
   }

   public void a(aej var1, NN var2, NN var3, float var4) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      if (var2 instanceof Oh && ((Oh)var2).isPlayerSleeping()) {
         sD var5 = var1.a(var2.d, var2.e, var2.f);
         nh var6 = var5.a();
         if (var6 == RQ.a) {
            int var7 = ((abP)var5.a((so)nk.a)).getHorizontalIndex();
            this.a = (float)(var7 * 90 + 180);
            this.b = 0.0F;
         }
      } else {
         this.a = var2.l + (var2.j - var2.l) * var4;
         this.b = var2.m + (var2.k - var2.m) * var4;
      }

      if (JI.j == 2) {
         this.a += 180.0F;
      }

      this.a = var2.g + (var2.d - var2.g) * (double)var4;
      this.b = var2.h + (var2.e - var2.h) * (double)var4;
      this.c = var2.i + (var2.f - var2.i) * (double)var4;
   }

   public void setPlayerViewY(float var1) {
      this.a = var1;
   }

   public boolean a() {
      return this.b;
   }

   public void setRenderShadow(boolean var1) {
      this.b = var1;
   }

   public void setDebugBoundingBox(boolean var1) {
      this.c = var1;
   }

   public boolean isDebugBoundingBox() {
      return this.c;
   }

   public boolean a(NN var1) {
      return this.a(var1).isMultipass();
   }

   public boolean a(NN var1, Fb var2, double var3, double var5, double var7) {
      Ff var9 = this.a(var1);
      return var9 != null && var9.a(var1, var2, var3, var5, var7);
   }

   public void a(NN var1, float var2, boolean var3) {
      var1 = var1.d();
      if (var1.b == 0) {
         var1.g = var1.d;
         var1.h = var1.e;
         var1.i = var1.f;
      }

      double var4 = var1.g + (var1.d - var1.g) * (double)var2;
      double var6 = var1.h + (var1.e - var1.h) * (double)var2;
      double var8 = var1.i + (var1.f - var1.i) * (double)var2;
      float var10 = var1.l + (var1.j - var1.l) * var2;
      int var11 = var1.getBrightnessForRender();
      if (var1.isBurning()) {
         var11 = 15728880;
      }

      int var12 = var11 % 65536;
      int var13 = var11 / 65536;
      Ci.a(Ci.o, (float)var12, (float)var13);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a(var1, var4 - this.d, var6 - this.e, var8 - this.f, var10, var2, var3);
   }

   public void a(NN var1, double var2, double var4, double var6, float var8, float var9, boolean var10) {
      var1 = var1.d();
      Ff var11 = null;

      try {
         var11 = this.a(var1);
         if (var11 != null) {
            this.b(var1, var2, var4, var6, var8, var9, var11);
            this.a(var1, var2, var4, var6, var8, var9, var11);
            this.b(var1, var2, var4, var6, var8, var9, var10);
         }
      } catch (Throwable var13) {
         this.a(var1, var2, var4, var6, var8, var9, var11, var13);
      }

   }

   private void a(NN var1, double var2, double var4, double var6, float var8, float var9, Ff<NN> var10, Throwable var11) {
      Kn var12 = Kn.a(var11, "Rendering entity in world");
      Ku var13 = var12.a("Entity being rendered");
      var1.a(var13);
      Ku var14 = var12.a("Renderer details");
      var14.a((String)"Assigned renderer", (Object)var10);
      var14.a((String)"Location", (Object)Ku.a(var2, var4, var6));
      var14.a((String)"Rotation", (Object)var8);
      var14.a((String)"Delta", (Object)var9);
      throw new acB(var12);
   }

   private void b(NN var1, double var2, double var4, double var6, float var8, float var9, boolean var10) {
      if (this.c && !var1.isInvisible() && !var10 && !this.a.f()) {
         try {
            this.a(var1, var2, var4, var6, var8, var9);
         } catch (Throwable var12) {
            throw new acB(Kn.a(var12, "Rendering entity hitbox in world"));
         }
      }

   }

   private void a(NN var1, double var2, double var4, double var6, float var8, float var9, Ff<NN> var10) {
      try {
         if (!this.a) {
            this.a(var10, var1, var2, var4, var6, var8, var9);
         }

      } catch (Throwable var22) {
         throw new acB(Kn.a(var22, "Post-rendering entity in world"));
      }
   }

   private void b(NN var1, double var2, double var4, double var6, float var8, float var9, Ff<NN> var10) {
      try {
         var10.setRenderOutlines(this.a);
         if (agQ.a()) {
            this.a = var10;
         }

         var10.a(var1, var2, var4, var6, var8, var9);
      } catch (Throwable var12) {
         throw new acB(Kn.a(var12, "Rendering entity in world"));
      }
   }

   public void a(NN var1, float var2) {
      var1 = var1.d();
      if (var1.b == 0) {
         var1.g = var1.d;
         var1.h = var1.e;
         var1.i = var1.f;
      }

      double var3 = var1.g + (var1.d - var1.g) * (double)var2;
      double var5 = var1.h + (var1.e - var1.h) * (double)var2;
      double var7 = var1.i + (var1.f - var1.i) * (double)var2;
      float var9 = var1.l + (var1.j - var1.l) * var2;
      int var10 = var1.getBrightnessForRender();
      if (var1.isBurning()) {
         var10 = 15728880;
      }

      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      Ci.a(Ci.o, (float)var11, (float)var12);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      Ff var13 = this.a(var1);
      if (var13 != null) {
         var13.c(var1, var3 - this.d, var5 - this.e, var7 - this.f, var9, var2);
      }

   }

   public void a(NN var1, double var2, double var4, double var6, float var8, float var9) {
      By.a(false);
      By.w();
      By.f();
      By.q();
      By.k();
      float var10 = var1.a.a() / 2.0F;
      Cw var11 = this.a;
      acU var12 = var1.b();
      Ck.a(var11, var12.a - var1.d + var2, var12.b - var1.e + var4, var12.c - var1.f + var6, var12.d - var1.d + var2, var12.e - var1.e + var4, var12.f - var1.f + var6, 1.0F, 1.0F, 1.0F, 1.0F);
      NN[] var13 = var1.a();
      if (var13 != null) {
         NN[] var14 = var13;
         int var15 = var13.length;

         for(int var16 = 0; var16 < var15; ++var16) {
            NN var17 = var14[var16];
            double var18 = (var17.d - var17.a) * (double)var9;
            double var20 = (var17.e - var17.b) * (double)var9;
            double var22 = (var17.f - var17.c) * (double)var9;
            acU var24 = var17.b();
            Ck.a(var11, var24.a - this.d + var18, var24.b - this.e + var20, var24.c - this.f + var22, var24.d - this.d + var18, var24.e - this.e + var20, var24.f - this.f + var22, 0.25F, 1.0F, 0.0F, 1.0F);
         }
      }

      if (var1 instanceof Oh) {
         Ck.a(var11, var2 - (double)var10, var4 + (double)var1.getEyeHeight() - 0.009999999776482582D, var6 - (double)var10, var2 + (double)var10, var4 + (double)var1.getEyeHeight() + 0.009999999776482582D, var6 + (double)var10, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      Bh var25 = var11.a();
      adm var26 = var1.a(var9);
      var25.a(3, In.f);
      var25.a(var2, var4 + (double)var1.getEyeHeight(), var6).a(0, 0, 255, 255).endVertex();
      var25.a(var2 + var26.a * 2.0D, var4 + (double)var1.getEyeHeight() + var26.b * 2.0D, var6 + var26.c * 2.0D).a(0, 0, 255, 255).endVertex();
      var11.draw();
      By.v();
      By.e();
      By.p();
      By.k();
      By.a(true);
   }

   public void a(aej var1) {
      this.a = var1;
      if (var1 == null) {
         this.a = null;
      }

   }

   public double getDistanceToCamera(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public tI a() {
      return this.a;
   }

   public void setRenderOutlines(boolean var1) {
      this.a = var1;
   }

   public Map<Class, Ff> a() {
      return this.a;
   }

   public Map<String, Gk> b() {
      return Collections.unmodifiableMap(this.b);
   }

   private void a(Ff var1, NN var2, double var3, double var5, double var7, float var9, float var10) {
      if (!(var2 instanceof Oh)) {
         var1.b(var2, var3, var5, var7, var9, var10);
      } else {
         EntityScaleData var11 = (EntityScaleData)((asW)var2.a()).b(asJ.a);
         if (!var11.shouldApply()) {
            var1.b(var2, var3, var5, var7, var9, var10);
         } else {
            double var12 = var11.getX();
            double var14 = var11.getY();
            double var16 = var11.getZ();
            By.a(var12, var14, var16);
            var1.b(var2, var3 / var12, var5 / var14, var7 / var16, var9, var10);
            By.a(1.0D / var12, 1.0D / var14, 1.0D / var16);
         }
      }
   }

   public void setPosition(double var1, double var3, double var5) {
      this.a(var1, var3, var5);
   }

   public Render getEntityRender(Entity var1) {
      return (Render)d.a(this.a((NN)d.a(var1)));
   }

   public boolean shouldRenderShadow() {
      return this.a();
   }

   public boolean isRenderMultipass(Entity var1) {
      return this.a((NN)d.a(var1));
   }

   public boolean shouldRender(Entity var1, Camera var2, double var3, double var5, double var7) {
      return this.a((NN)d.a(var1), (Fb)d.a(var2), var3, var5, var7);
   }

   public void renderEntityStatic(Entity var1, float var2, boolean var3) {
      this.a((NN)d.a(var1), var2, var3);
   }

   public void renderEntity(Entity var1, double var2, double var4, double var6, float var8, float var9, boolean var10) {
      this.a((NN)d.a(var1), var2, var4, var6, var8, var9, var10);
   }

   public void renderDebugBoundingBox(Entity var1, double var2, double var4, double var6, float var8, float var9) {
      this.a((NN)d.a(var1), var2, var4, var6, var8, var9);
   }
}
