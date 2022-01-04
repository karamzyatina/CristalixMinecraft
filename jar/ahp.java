public abstract class ahP extends agV {
   public ahP(sE var1, Class var2, String var3, float var4) {
      super(var1, var2, var3, var4);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xL)) {
         return null;
      } else {
         xL var3 = (xL)var1;
         if (var2.equals("head")) {
            return var3.a;
         } else if (var2.equals("body")) {
            return var3.b;
         } else if (var2.equals("leg1")) {
            return var3.c;
         } else if (var2.equals("leg2")) {
            return var3.d;
         } else if (var2.equals("leg3")) {
            return var3.e;
         } else {
            return var2.equals("leg4") ? var3.f : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4"};
   }
}
