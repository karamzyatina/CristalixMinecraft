public final class HT extends Ik {
   public wX a;

   public HT(sE var1) {
      super(var1);
      this.a = new wX(var1);
   }

   public void a(aaH var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      boolean var11 = var1.b() != null;
      boolean var12 = !var11 || var1.a() == RQ.bF;
      int var13 = var11 ? var1.a() : 0;
      long var14 = var11 ? var1.b().a() : 0L;
      By.C();
      float var16;
      if (var12) {
         By.c((float)var2 + 0.5F, (float)var4 + 0.5F, (float)var6 + 0.5F);
         var16 = (float)(var13 * 360) / 16.0F;
         By.b(-var16, 0.0F, 1.0F, 0.0F);
         this.a.b.b = true;
      } else {
         var16 = 0.0F;
         if (var13 == 2) {
            var16 = 180.0F;
         }

         if (var13 == 4) {
            var16 = 90.0F;
         }

         if (var13 == 5) {
            var16 = -90.0F;
         }

         By.c((float)var2 + 0.5F, (float)var4 - 0.16666667F, (float)var6 + 0.5F);
         By.b(-var16, 0.0F, 1.0F, 0.0F);
         By.c(0.0F, -0.3125F, -0.4375F);
         this.a.b.b = false;
      }

      int var21 = var1.b();
      int var17 = var1.c();
      int var18 = var1.d();
      float var19 = (float)(var21 * 7 + var17 * 9 + var18 * 13) + (float)var14 + var8;
      this.a.a.f = (-0.0125F + 0.01F * adh.b(var19 * 3.1415927F * 0.02F)) * 3.1415927F;
      By.z();
      acC var20 = this.a(var1);
      if (var20 != null) {
         La.a(var1.a());
         this.a(var20);
         By.C();
         By.b(0.6666667F, -0.6666667F, -0.6666667F);
         this.a.a();
         By.D();
      }

      By.c(1.0F, 1.0F, 1.0F, var10);
      By.D();
   }

   private acC a(aaH var1) {
      return AJ.a.a(this.a.a(), var1.a(), var1.a(), var1.b());
   }
}
