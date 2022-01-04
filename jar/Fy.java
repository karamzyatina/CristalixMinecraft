public class FY extends Ff {
   private static final acC a = new acC("textures/entity/llama/spit.png");
   private final xC a;

   public FY(Ga var1) {
      super(var1);
      this.a = new xC(var1.a);
   }

   public void a(RF var1, double var2, double var4, double var6, float var8, float var9) {
      By.C();
      By.c((float)var2, (float)var4 + 0.15F, (float)var6);
      By.b(var1.l + (var1.j - var1.l) * var9 - 90.0F, 0.0F, 1.0F, 0.0F);
      By.b(var1.m + (var1.k - var1.m) * var9, 0.0F, 0.0F, 1.0F);
      this.b(var1);
      if (this.a) {
         By.g();
         By.e(this.a((NN)var1));
      }

      this.a.a(var1, var9, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      if (this.a) {
         By.m();
         By.h();
      }

      By.D();
      super.a(var1, var2, var4, var6, var8, var9);
   }

   protected acC a(RF var1) {
      return a;
   }
}
