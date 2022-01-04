public class Fq extends FU {
   private static final acC a = new acC("textures/entity/chicken.png");

   public Fq(Ga var1) {
      super(var1, new xj(var1.a), 0.3F);
   }

   protected acC a(QD var1) {
      return a;
   }

   protected float a(QD var1, float var2) {
      float var3 = var1.d + (var1.a - var1.d) * var2;
      float var4 = var1.c + (var1.b - var1.c) * var2;
      return (adh.a(var3) + 1.0F) * var4;
   }
}
