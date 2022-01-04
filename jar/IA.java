public final class Ia extends Ik {
   private static final Lg a = new Lg("textures/entity/chest/ender.png");
   private static final acC a;
   public xi a;

   public Ia(sE var1) {
      super(var1);
      this.a = new xi(var1);
   }

   public void a(aaY var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      int var11 = 0;
      if (var1.a()) {
         var11 = var1.a();
      }

      if (var9 >= 0) {
         this.a(a[var9]);
         By.l(5890);
         By.C();
         By.b(4.0F, 4.0F, 1.0F);
         By.c(0.0625F, 0.0625F, 0.0625F);
         By.l(5888);
      } else {
         this.a(a);
      }

      By.C();
      By.z();
      By.c(1.0F, 1.0F, 1.0F, var10);
      By.c((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
      By.b(1.0F, -1.0F, -1.0F);
      By.c(0.5F, 0.5F, 0.5F);
      short var12 = 0;
      if (var11 == 2) {
         var12 = 180;
      } else if (var11 == 4) {
         var12 = 90;
      } else if (var11 == 5) {
         var12 = -90;
      }

      By.b((float)var12, 0.0F, 1.0F, 0.0F);
      By.c(-0.5F, -0.5F, -0.5F);
      float var13 = var1.b + (var1.a - var1.b) * var8;
      var13 = 1.0F - var13;
      var13 = 1.0F - var13 * var13 * var13;
      this.a.a.f = -(var13 * 1.5707964F);
      this.a.a();
      By.A();
      By.D();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      if (var9 >= 0) {
         By.l(5890);
         By.D();
         By.l(5888);
      }

   }

   static {
      a = a;
   }
}
