public class ahT extends agV {
   public ahT(sE var1) {
      super(var1, Qc.class, "shulker", 0.0F);
   }

   public wY a() {
      return new xR(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xR)) {
         return null;
      } else {
         xR var3 = (xR)var1;
         if (var2.equals("head")) {
            return var3.c;
         } else if (var2.equals("base")) {
            return var3.a;
         } else {
            return var2.equals("lid") ? var3.b : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"base", "lid", "head"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Gp var4 = new Gp(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
