public class ahv extends agV {
   public ahv(sE var1) {
      super(var1, abo.class, "head_dragon", 0.0F);
   }

   public wY a() {
      return new xn(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xn)) {
         return null;
      } else {
         xn var3 = (xn)var1;
         if (var2.equals("head")) {
            return var3.a;
         } else {
            return var2.equals("jaw") ? var3.b : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"head", "jaw"};
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

         ((Ii)var4).a = (xn)var1;
         return (agU)var4;
      }
   }
}
