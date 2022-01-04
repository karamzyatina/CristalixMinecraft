public class Gw extends FU {
   private static final acC a = new acC("textures/entity/slime/slime.png");

   public Gw(Ga var1) {
      super(var1, new xX(var1.a, 16), 0.25F);
      this.a((Hn)(new Hq(this)));
   }

   public void a(Qh var1, double var2, double var4, double var6, float var8, float var9) {
      this.a = 0.25F * (float)var1.j();
      super.a((Of)var1, var2, var4, var6, var8, var9);
   }

   protected void a(Qh var1, float var2) {
      By.b(0.999F, 0.999F, 0.999F);
      float var3 = (float)var1.j();
      float var4 = (var1.c + (var1.b - var1.c) * var2) / (var3 * 0.5F + 1.0F);
      float var5 = 1.0F / (var4 + 1.0F);
      By.b(var5 * var3, 1.0F / var5 * var3, var5 * var3);
   }

   protected acC a(Qh var1) {
      return a;
   }
}
