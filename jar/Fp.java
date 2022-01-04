public class FP extends FU {
   private static final acC a = new acC("textures/entity/iron_golem.png");

   public FP(Ga var1) {
      super(var1, new xy(var1.a), 0.5F);
      this.a((Hn)(new Hk(this)));
   }

   protected acC a(PX var1) {
      return a;
   }

   protected void a(PX var1, float var2, float var3, float var4) {
      super.a(var1, var2, var3, var4);
      if ((double)var1.w >= 0.01D) {
         float var5 = var1.x - var1.w * (1.0F - var4) + 6.0F;
         float var6 = (Math.abs(var5 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         By.b(6.5F * var6, 0.0F, 0.0F, 1.0F);
      }

   }
}
