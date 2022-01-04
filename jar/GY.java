public class Gy extends Ff {
   protected final SZ a;
   private final Cp a;

   public Gy(Ga var1, SZ var2, Cp var3) {
      super(var1);
      this.a = var2;
      this.a = var3;
   }

   public void a(T var1, double var2, double var4, double var6, float var8, float var9) {
      By.C();
      By.c((float)var2, (float)var4, (float)var6);
      By.z();
      By.b(-this.a.a, 0.0F, 1.0F, 0.0F);
      By.b((float)(JI.j == 2 ? -1 : 1) * this.a.b, 1.0F, 0.0F, 0.0F);
      By.b(180.0F, 0.0F, 1.0F, 0.0F);
      this.a((Lg)HO.a);
      if (this.a) {
         By.g();
         By.e(this.a(var1));
      }

      this.a.a(this.a(var1), CZ.GROUND);
      if (this.a) {
         By.m();
         By.h();
      }

      By.A();
      By.D();
      super.a(var1, var2, var4, var6, var8, var9);
   }

   public Vh a(T var1) {
      return new Vh(this.a);
   }

   protected acC a(NN var1) {
      return HO.b;
   }
}
