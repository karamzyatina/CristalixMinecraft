public class aim extends agV {
   public aim(sE var1) {
      super(var1, Rj.class, "wolf", 0.5F);
   }

   public wY a() {
      return new yf(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof yf)) {
         return null;
      } else {
         yf var3 = (yf)var1;
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
         } else if (var2.equals("leg4")) {
            return var3.f;
         } else if (var2.equals("tail")) {
            return var3.g;
         } else {
            return var2.equals("mane") ? var3.h : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      GO var4 = new GO(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
