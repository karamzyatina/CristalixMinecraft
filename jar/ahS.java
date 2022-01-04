public class ahs extends agV {
   public ahs(sE var1) {
      super(var1, RA.class, "evocation_fangs", 0.0F);
   }

   public wY a() {
      return new xs(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xs)) {
         return null;
      } else {
         xs var3 = (xs)var1;
         if (var2.equals("base")) {
            return var3.a;
         } else if (var2.equals("upper_jaw")) {
            return var3.b;
         } else {
            return var2.equals("lower_jaw") ? var3.c : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"base", "upper_jaw", "lower_jaw"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      FD var4 = new FD(var3);
      var4.a = (xs)var1;
      return var4;
   }
}
