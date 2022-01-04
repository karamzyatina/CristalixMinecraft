public class Ft extends FU {
   public static final Lg a = new Lg("textures/entity/endercrystal/endercrystal_beam.png");
   public static final acC a;
   private static final Lg b;
   private static final acC b;
   private static final acC c;

   public Ft(Ga var1) {
      super(var1, new xm(var1.a), 0.5F);
      this.a((Hn)(new Hd(this)));
      this.a((Hn)(new Hc(var1.a)));
   }

   protected void a(OG var1, float var2, float var3, float var4) {
      float var5 = (float)var1.a(7, var4)[0];
      float var6 = (float)(var1.a(5, var4)[1] - var1.a(10, var4)[1]);
      By.b(-var5, 0.0F, 1.0F, 0.0F);
      By.b(var6 * 10.0F, 1.0F, 0.0F, 0.0F);
      By.c(0.0F, 0.0F, 1.0F);
      if (var1.q > 0) {
         float var7 = ((float)var1.q + var4 - 1.0F) / 20.0F * 1.6F;
         var7 = adh.c(var7);
         if (var7 > 1.0F) {
            var7 = 1.0F;
         }

         By.b(var7 * this.a((Oh)var1), 0.0F, 0.0F, 1.0F);
      }

   }

   protected void a(OG var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1.j > 0) {
         float var8 = (float)var1.j / 200.0F;
         By.c(515);
         By.d();
         By.a(516, var8);
         this.a((Lg)b);
         this.a.a(var1, var2, var3, var4, var5, var6, var7);
         By.a(516, 0.1F);
         By.c(514);
      }

      this.b(var1);
      this.a.a(var1, var2, var3, var4, var5, var6, var7);
      if (var1.o > 0) {
         By.c(514);
         By.w();
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA);
         By.c(1.0F, 0.0F, 0.0F, 0.5F);
         this.a.a(var1, var2, var3, var4, var5, var6, var7);
         By.v();
         By.k();
         By.c(515);
      }

   }

   public void a(OG var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((Of)var1, var2, var4, var6, var8, var9);
      if (var1.a != null) {
         this.a((Lg)a);
         float var10 = adh.a(((float)var1.a.b + var9) * 0.2F) / 2.0F + 0.5F;
         var10 = (var10 * var10 + var10) * 0.2F;
         a(this.a.a, var2, var4, var6, var9, var1.d + (var1.a - var1.d) * (double)(1.0F - var9), var1.e + (var1.b - var1.e) * (double)(1.0F - var9), var1.f + (var1.c - var1.f) * (double)(1.0F - var9), var1.b, var1.a.d, (double)var10 + var1.a.e, var1.a.f);
      }

   }

   public static void a(Cw var0, double var1, double var3, double var5, float var7, double var8, double var10, double var12, int var14, double var15, double var17, double var19) {
      float var21 = (float)(var15 - var8);
      float var22 = (float)(var17 - 1.0D - var10);
      float var23 = (float)(var19 - var12);
      float var24 = adh.c(var21 * var21 + var23 * var23);
      float var25 = adh.c(var21 * var21 + var22 * var22 + var23 * var23);
      By.C();
      By.c((float)var1, (float)var3 + 2.0F, (float)var5);
      By.b((float)(-Math.atan2((double)var23, (double)var21)) * 57.295776F - 90.0F, 0.0F, 1.0F, 0.0F);
      By.b((float)(-Math.atan2((double)var24, (double)var22)) * 57.295776F - 90.0F, 1.0F, 0.0F, 0.0F);
      Bh var26 = var0.a();
      Co.a();
      By.q();
      By.j(7425);
      float var27 = 0.0F - ((float)var14 + var7) * 0.01F;
      float var28 = adh.c(var21 * var21 + var22 * var22 + var23 * var23) / 32.0F - ((float)var14 + var7) * 0.01F;
      var26.a(5, In.i);

      for(int var29 = 0; var29 <= 8; ++var29) {
         float var30 = adh.a((float)(var29 % 8) * 6.2831855F / 8.0F) * 0.75F;
         float var31 = adh.b((float)(var29 % 8) * 6.2831855F / 8.0F) * 0.75F;
         float var32 = (float)(var29 % 8) / 8.0F;
         var26.a((double)(var30 * 0.2F), (double)(var31 * 0.2F), 0.0D).a((double)var32, (double)var27).a(0, 0, 0, 255).endVertex();
         var26.a((double)var30, (double)var31, (double)var25).a((double)var32, (double)var28).a(255, 255, 255, 255).endVertex();
      }

      var0.draw();
      By.p();
      By.j(7424);
      Co.b();
      By.D();
   }

   protected acC a(OG var1) {
      return c;
   }

   static {
      a = a;
      b = new Lg("textures/entity/enderdragon/dragon_exploding.png");
      b = b;
      c = new acC("textures/entity/enderdragon/dragon.png");
   }
}
