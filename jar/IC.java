public final class Ic extends Ik {
   public Ic(sE var1) {
      super(var1);
   }

   public void a(abe var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      By.C();
      By.c((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      a(this.a, var1.a(), var2, var4, var6, var8);
      By.D();
   }

   private static void a(sE var0, aaC var1, double var2, double var4, double var6, float var8) {
      NN var9 = var1.a();
      if (var9 != null) {
         float var10 = 0.53125F;
         float var11 = Math.max(var9.a.a(), var9.b.a());
         if ((double)var11 > 1.0D) {
            var10 /= var11;
         }

         By.c(0.0F, 0.4F, 0.0F);
         By.b((float)(var1.b() + (var1.a() - var1.b()) * (double)var8) * 10.0F, 0.0F, 1.0F, 0.0F);
         By.c(0.0F, -0.2F, 0.0F);
         By.b(-30.0F, 1.0F, 0.0F, 0.0F);
         By.b(var10, var10, var10);
         var9.b(var2, var4, var6, 0.0F, 0.0F);
         var0.a().a(var9, 0.0D, 0.0D, 0.0D, 0.0F, var8, false);
      }

   }
}
