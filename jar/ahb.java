public class ahB extends agV {
   public ahB(sE var1) {
      super(var1, PX.class, "iron_golem", 0.5F);
   }

   public wY a() {
      return new xy(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xy)) {
         return null;
      } else {
         xy var3 = (xy)var1;
         if (var2.equals("head")) {
            return var3.a;
         } else if (var2.equals("body")) {
            return var3.b;
         } else if (var2.equals("left_arm")) {
            return var3.d;
         } else if (var2.equals("right_arm")) {
            return var3.c;
         } else if (var2.equals("left_leg")) {
            return var3.e;
         } else {
            return var2.equals("right_leg") ? var3.f : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head", "body", "right_arm", "left_arm", "left_leg", "right_leg"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      FP var4 = new FP(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
