public class ahx extends agV {
   public ahx(sE var1) {
      super(var1, abo.class, "head_skeleton", 0.0F);
   }

   public wY a() {
      return new xW(this.a, 0, 0, 64, 32);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xW)) {
         return null;
      } else {
         xW var3 = (xW)var1;
         return var2.equals("head") ? var3.b : null;
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

         ((Ii)var4).a = (xW)var1;
         return (agU)var4;
      }
   }
}
