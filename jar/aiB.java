public class aib extends agV {
   public aib(sE var1) {
      super(var1, Qj.class, "snow_golem", 0.5F);
   }

   public wY a() {
      return new xY(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xY)) {
         return null;
      } else {
         xY var3 = (xY)var1;
         if (var2.equals("body")) {
            return var3.a;
         } else if (var2.equals("body_bottom")) {
            return var3.b;
         } else if (var2.equals("head")) {
            return var3.c;
         } else if (var2.equals("left_hand")) {
            return var3.e;
         } else {
            return var2.equals("right_hand") ? var3.d : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"body", "body_bottom", "head", "right_hand", "left_hand"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Gx var4 = new Gx(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
