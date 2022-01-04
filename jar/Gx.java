public class GX implements Hn {
   private final Gk a;

   public GX(Gk var1) {
      this.a = var1;
   }

   public void a(tC var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1.hasPlayerInfo() && !var1.isInvisible() && var1.a(Rr.CAPE) && var1.b() != null) {
         Vh var9 = var1.a(SB.CHEST);
         if (var9.a() != RT.cp) {
            By.c(1.0F, 1.0F, 1.0F, 1.0F);
            this.a.a((acC)var1.b());
            By.C();
            By.c(0.0F, 0.0F, 0.125F);
            double var10 = var1.o + (var1.r - var1.o) * (double)var4 - (var1.a + (var1.d - var1.a) * (double)var4);
            double var12 = var1.p + (var1.s - var1.p) * (double)var4 - (var1.b + (var1.e - var1.b) * (double)var4);
            double var14 = var1.q + (var1.t - var1.q) * (double)var4 - (var1.c + (var1.f - var1.c) * (double)var4);
            float var16 = var1.B + (var1.A - var1.B) * var4;
            double var17 = (double)adh.a(var16 * 0.017453292F);
            double var19 = (double)(-adh.b(var16 * 0.017453292F));
            float var21 = (float)var12 * 10.0F;
            var21 = adh.a(var21, -6.0F, 32.0F);
            float var22 = (float)(var10 * var17 + var14 * var19) * 100.0F;
            float var23 = (float)(var10 * var19 - var14 * var17) * 100.0F;
            if (var22 < 0.0F) {
               var22 = 0.0F;
            }

            if (var22 > 165.0F) {
               var22 = 165.0F;
            }

            if (var21 < -5.0F) {
               var21 = -5.0F;
            }

            float var24 = var1.I + (var1.J - var1.I) * var4;
            var21 += adh.a((var1.n + (var1.o - var1.n) * var4) * 6.0F) * 32.0F * var24;
            if (var1.isSneaking()) {
               var21 += 25.0F;
               By.c(0.0F, 0.142F, -0.0178F);
            }

            By.b(6.0F + var22 / 2.0F + var21, 1.0F, 0.0F, 0.0F);
            By.b(var23 / 2.0F, 0.0F, 0.0F, 1.0F);
            By.b(-var23 / 2.0F, 0.0F, 1.0F, 0.0F);
            By.b(180.0F, 0.0F, 1.0F, 0.0F);
            this.a.a().b(0.0625F);
            By.D();
         }
      }

   }

   public boolean a() {
      return false;
   }
}
