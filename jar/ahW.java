public class ahw extends agV {
   public ahw(sE var1) {
      super(var1, abo.class, "head_humanoid", 0.0F);
   }

   public wY a() {
      return new xw(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xw)) {
         return null;
      } else {
         xw var3 = (xw)var1;
         if (var2.equals("head")) {
            return var3.b;
         } else {
            return var2.equals("head2") ? var3.a : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head"};
   }

   public agU a(wY var1, float var2) {
      Ie var3 = this.a.a;
      Object var4 = var3.a(abo.class);
      if (!(var4 instanceof Ii)) {
         return null;
      } else {
         if (((Ik)var4).a() == null) {
            var4 = new Ii(this.a);
            ((Ik)var4).a(var3);
         }

         ((Ii)var4).b = (xW)var1;
         return (agU)var4;
      }
   }
}
