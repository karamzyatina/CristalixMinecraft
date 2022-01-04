public class GB extends FU {
   private static final acC a = new acC("textures/entity/squid.png");

   public GB(Ga var1) {
      super(var1, new ya(var1.a), 0.7F);
   }

   protected acC a(QX var1) {
      return a;
   }

   protected void a(QX var1, float var2, float var3, float var4) {
      float var5 = var1.b + (var1.a - var1.b) * var4;
      float var6 = var1.d + (var1.c - var1.d) * var4;
      By.c(0.0F, 0.5F, 0.0F);
      By.b(180.0F - var3, 0.0F, 1.0F, 0.0F);
      By.b(var5, 1.0F, 0.0F, 0.0F);
      By.b(var6, 0.0F, 1.0F, 0.0F);
      By.c(0.0F, -1.2F, 0.0F);
   }

   protected float a(QX var1, float var2) {
      return var1.h + (var1.g - var1.h) * var2;
   }
}
