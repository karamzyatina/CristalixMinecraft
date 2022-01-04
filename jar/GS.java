public class Gs extends Ff {
   private static final acC a = new acC("textures/entity/shulker/spark.png");
   public xS a;

   public Gs(Ga var1) {
      super(var1);
      this.a = new xS(var1.a);
   }

   private float a(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      return var1 + var3 * var4;
   }

   public void a(RH var1, double var2, double var4, double var6, float var8, float var9) {
      By.C();
      float var10 = this.a(var1.l, var1.j, var9);
      float var11 = var1.m + (var1.k - var1.m) * var9;
      float var12 = (float)var1.b + var9;
      By.c((float)var2, (float)var4 + 0.15F, (float)var6);
      By.b(adh.a(var12 * 0.1F) * 180.0F, 0.0F, 1.0F, 0.0F);
      By.b(adh.b(var12 * 0.1F) * 180.0F, 1.0F, 0.0F, 0.0F);
      By.b(adh.a(var12 * 0.15F) * 360.0F, 0.0F, 0.0F, 1.0F);
      By.z();
      By.b(-1.0F, -1.0F, 1.0F);
      this.b(var1);
      this.a.a(var1, 0.0F, 0.0F, 0.0F, var10, var11, 0.03125F);
      By.l();
      By.c(1.0F, 1.0F, 1.0F, 0.5F);
      By.b(1.5F, 1.5F, 1.5F);
      this.a.a(var1, 0.0F, 0.0F, 0.0F, var10, var11, 0.03125F);
      By.k();
      By.D();
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected acC a(RH var1) {
      return a;
   }
}
