public class GD extends Ff {
   public GD(Ga var1) {
      super(var1);
      this.a = 0.5F;
   }

   public void a(PD var1, double var2, double var4, double var6, float var8, float var9) {
      Bd var10 = this.a.a.a();
      By.C();
      By.c((float)var2, (float)var4 + 0.5F, (float)var6);
      float var11;
      if ((float)var1.e() - var9 + 1.0F < 10.0F) {
         var11 = 1.0F - ((float)var1.e() - var9 + 1.0F) / 10.0F;
         var11 = adh.a(var11, 0.0F, 1.0F);
         var11 *= var11;
         var11 *= var11;
         float var12 = 1.0F + var11 * 0.3F;
         By.b(var12, var12, var12);
      }

      var11 = (1.0F - ((float)var1.e() - var9 + 1.0F) / 100.0F) * 0.8F;
      this.b(var1);
      By.b(-90.0F, 0.0F, 1.0F, 0.0F);
      By.c(-0.5F, -0.5F, 0.5F);
      var10.a(RQ.B.a(), var1.getBrightness());
      By.c(0.0F, 0.0F, 1.0F);
      if (this.a) {
         By.g();
         By.e(this.a((NN)var1));
         var10.a(RQ.B.a(), 1.0F);
         By.m();
         By.h();
      } else if (var1.e() / 5 % 2 == 0) {
         By.w();
         By.f();
         By.l();
         By.a(BU.SRC_ALPHA, BL.DST_ALPHA);
         By.c(1.0F, 1.0F, 1.0F, var11);
         By.a(-3.0F, -3.0F);
         By.r();
         var10.a(RQ.B.a(), 1.0F);
         By.a(0.0F, 0.0F);
         By.s();
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.k();
         By.e();
         By.v();
      }

      By.D();
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected acC a(PD var1) {
      return HO.b;
   }
}
