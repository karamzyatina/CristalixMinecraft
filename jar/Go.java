public class GO extends FU {
   private static final acC a = new acC("textures/entity/wolf/wolf.png");
   private static final acC b = new acC("textures/entity/wolf/wolf_tame.png");
   private static final acC c = new acC("textures/entity/wolf/wolf_angry.png");

   public GO(Ga var1) {
      super(var1, new yf(var1.a), 0.5F);
      this.a((Hn)(new Hw(this)));
   }

   protected float a(Rj var1, float var2) {
      return var1.g();
   }

   public void a(Rj var1, double var2, double var4, double var6, float var8, float var9) {
      if (var1.x()) {
         float var10 = var1.getBrightness() * var1.c(var9);
         By.d(var10, var10, var10);
      }

      super.a((Of)var1, var2, var4, var6, var8, var9);
   }

   protected acC a(Rj var1) {
      if (var1.A()) {
         return b;
      } else {
         return var1.y() ? c : a;
      }
   }
}
