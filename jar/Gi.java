public class GI extends FU {
   private static final acC a = new acC("textures/entity/illager/vindicator.png");

   public GI(Ga var1) {
      super(var1, new xx(var1.a, 0.0F, 0.0F, 64, 64), 0.5F);
      this.a((Hn)(new GJ(this, this)));
   }

   public void a(PZ var1, double var2, double var4, double var6, float var8, float var9) {
      super.a((Of)var1, var2, var4, var6, var8, var9);
   }

   protected acC a(PZ var1) {
      return a;
   }

   protected void a(PZ var1, float var2) {
      By.b(0.9375F, 0.9375F, 0.9375F);
   }
}
