public class FD extends Ff {
   private static final acC a = new acC("textures/entity/illager/fangs.png");
   public xs a;

   public FD(Ga var1) {
      super(var1);
      this.a = new xs(var1.a);
   }

   public void a(RA var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = var1.b(var9);
      if (var10 != 0.0F) {
         float var11 = 2.0F;
         if (var10 > 0.9F) {
            var11 = (float)((double)var11 * ((1.0D - (double)var10) / 0.10000000149011612D));
         }

         By.C();
         By.q();
         By.d();
         this.b(var1);
         By.c((float)var2, (float)var4, (float)var6);
         By.b(90.0F - var1.j, 0.0F, 1.0F, 0.0F);
         By.b(-var11, -var11, var11);
         float var12 = 0.03125F;
         By.c(0.0F, -0.626F, 0.0F);
         this.a.a(var1, var10, 0.0F, 0.0F, var1.j, var1.k, 0.03125F);
         By.D();
         By.p();
         super.a(var1, var2, var4, var6, var8, var9);
      }

   }

   protected acC a(RA var1) {
      return a;
   }
}
