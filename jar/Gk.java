public class GK extends FU {
   private static final acC a = new acC("textures/entity/witch.png");

   public GK(Ga var1) {
      super(var1, new yd(var1.a, 0.0F), 0.5F);
      this.a((Hn)(new Hj(this)));
   }

   public yd a() {
      return (yd)super.a();
   }

   public void a(Qs var1, double var2, double var4, double var6, float var8, float var9) {
      ((yd)this.a).c = !var1.a().isEmpty();
      super.a((Of)var1, var2, var4, var6, var8, var9);
   }

   protected acC a(Qs var1) {
      return a;
   }

   public void a() {
      By.c(0.0F, 0.1875F, 0.0F);
   }

   protected void a(Qs var1, float var2) {
      By.b(0.9375F, 0.9375F, 0.9375F);
   }
}
