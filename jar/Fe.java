public class FE extends Ff {
   private final adm a = new adm(0.0D, 0.0D, 0.0D);

   public FE(Ga var1) {
      super(var1);
      this.a = 0.5F;
   }

   public void a(Pk var1, double var2, double var4, double var6, float var8, float var9) {
      if (var1.a() != null) {
         sD var10 = var1.a();
         if (var10.a() == abO.MODEL) {
            aej var11 = var1.b();
            if (var10 != var11.a(new acV(var1)) && var10.a() != abO.INVISIBLE) {
               this.a((Lg)HO.a);
               By.C();
               By.f();
               Cw var12 = this.a.a;
               Bh var13 = var12.a();
               if (this.a) {
                  By.g();
                  By.e(this.a((NN)var1));
               }

               var13.a(7, In.a);
               acV var14 = new acV(var1.d, var1.b().e, var1.f);
               By.c((float)(var2 - (double)var14.a - 0.5D), (float)(var4 - (double)var14.b), (float)(var6 - (double)var14.c - 0.5D));
               Bd var15 = this.a.a.a();
               var15.a().a(this.a, var11, var15.a(var10), var10, var14, var13, false, adh.a((adn)var1.b()));
               var12.draw();
               if (this.a) {
                  By.m();
                  By.h();
               }

               By.e();
               By.D();
               super.a(var1, var2, var4, var6, var8, var9);
            }
         }
      }

   }

   protected acC a(Pk var1) {
      return HO.b;
   }
}
