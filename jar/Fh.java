public class FH extends FU {
   private static final acC a = new acC("textures/entity/ghast/ghast.png");
   private static final acC b = new acC("textures/entity/ghast/ghast_shooting.png");

   public FH(Ga var1) {
      super(var1, new xt(var1.a), 0.5F);
   }

   protected acC a(PP var1) {
      return var1.x() ? b : a;
   }

   protected void a(PP var1, float var2) {
      By.b(4.5F, 4.5F, 4.5F);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
