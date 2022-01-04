public class Gn extends FU {
   private static final acC a = new acC("textures/entity/rabbit/brown.png");
   private static final acC b = new acC("textures/entity/rabbit/white.png");
   private static final acC c = new acC("textures/entity/rabbit/black.png");
   private static final acC d = new acC("textures/entity/rabbit/gold.png");
   private static final acC e = new acC("textures/entity/rabbit/salt.png");
   private static final acC f = new acC("textures/entity/rabbit/white_splotched.png");
   private static final acC g = new acC("textures/entity/rabbit/toast.png");
   private static final acC h = new acC("textures/entity/rabbit/caerbannog.png");

   public Gn(Ga var1) {
      super(var1, new xM(var1.a), 0.3F);
   }

   protected acC a(QR var1) {
      String var2 = adH.a(var1.getName());
      if (var2 != null && "Toast".equals(var2)) {
         return g;
      } else {
         switch(var1.i()) {
         case 0:
         default:
            return a;
         case 1:
            return b;
         case 2:
            return c;
         case 3:
            return f;
         case 4:
            return d;
         case 5:
            return e;
         case 99:
            return h;
         }
      }
   }
}
