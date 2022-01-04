public class ahU extends agV {
   public ahU(sE var1) {
      super(var1, abk.class, "shulker_box", 0.0F);
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
      Ie var3 = this.a.a;
      Object var4 = var3.a(abk.class);
      if (!(var4 instanceof If)) {
         return null;
      } else {
         if (((Ik)var4).a() == null) {
            var4 = new If(this.a, (xR)var1);
            ((Ik)var4).a(var3);
         }

         ((If)var4).a = (xR)var1;
         return (agU)var4;
      }
   }
}
