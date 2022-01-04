public class ahh extends agV {
   public ahh(sE var1) {
      super(var1, QD.class, "chicken", 0.3F);
   }

   public wY a() {
      return new xj(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xj)) {
         return null;
      } else {
         xj var3 = (xj)var1;
         if (var2.equals("head")) {
            return var3.a;
         } else if (var2.equals("body")) {
            return var3.b;
         } else if (var2.equals("right_leg")) {
            return var3.c;
         } else if (var2.equals("left_leg")) {
            return var3.d;
         } else if (var2.equals("right_wing")) {
            return var3.e;
         } else if (var2.equals("left_wing")) {
            return var3.f;
         } else if (var2.equals("bill")) {
            return var3.g;
         } else {
            return var2.equals("chin") ? var3.h : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Fq var4 = new Fq(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
