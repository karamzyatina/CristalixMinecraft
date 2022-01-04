public class GL extends FU {
   private static final acC a = new acC("textures/entity/wither/wither_invulnerable.png");
   private static final acC b = new acC("textures/entity/wither/wither.png");

   public GL(Ga var1) {
      super(var1, new ye(var1.a, 0.0F), 1.0F);
      this.a((Hn)(new Hv(this)));
   }

   protected acC a(OH var1) {
      int var2 = var1.d();
      return var2 > 0 && (var2 > 80 || var2 / 5 % 2 != 1) ? a : b;
   }

   protected void a(OH var1, float var2) {
      float var3 = 2.0F;
      int var4 = var1.d();
      if (var4 > 0) {
         var3 -= ((float)var4 - var2) / 220.0F * 0.5F;
      }

      By.b(var3, var3, var3);
   }
}
