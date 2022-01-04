public class Ge extends FU {
   private static final acC a = new acC("textures/entity/cat/black.png");
   private static final acC b = new acC("textures/entity/cat/ocelot.png");
   private static final acC c = new acC("textures/entity/cat/red.png");
   private static final acC d = new acC("textures/entity/cat/siamese.png");

   public Ge(Ga var1) {
      super(var1, new xF(var1.a), 0.4F);
   }

   protected acC a(QN var1) {
      switch(var1.i()) {
      case 0:
      default:
         return b;
      case 1:
         return a;
      case 2:
         return c;
      case 3:
         return d;
      }
   }

   protected void a(QN var1, float var2) {
      super.a(var1, var2);
      if (var1.A()) {
         By.b(0.8F, 0.8F, 0.8F);
      }

   }
}
