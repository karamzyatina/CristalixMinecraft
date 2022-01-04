public class GF extends Gb {
   public GF(Ga var1) {
      super(var1);
   }

   protected void a(PA var1, float var2, sD var3) {
      int var4 = var1.h();
      if (var4 > -1 && (float)var4 - var2 + 1.0F < 10.0F) {
         float var5 = 1.0F - ((float)var4 - var2 + 1.0F) / 10.0F;
         var5 = adh.a(var5, 0.0F, 1.0F);
         var5 *= var5;
         var5 *= var5;
         float var6 = 1.0F + var5 * 0.3F;
         By.b(var6, var6, var6);
      }

      super.a(var1, var2, var3);
      if (var4 > -1 && var4 / 5 % 2 == 0) {
         Bd var7 = this.a.a.a();
         By.w();
         By.f();
         By.l();
         By.a(BU.SRC_ALPHA, BL.DST_ALPHA);
         By.c(1.0F, 1.0F, 1.0F, (1.0F - ((float)var4 - var2 + 1.0F) / 100.0F) * 0.8F);
         By.C();
         var7.a(RQ.B.a(), 1.0F);
         By.D();
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.k();
         By.e();
         By.v();
      }

   }
}
