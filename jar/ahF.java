public class ahf extends agV {
   public ahf(sE var1) {
      super(var1, aaM.class, "chest", 0.0F);
   }

   public wY a() {
      return new xi(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xi)) {
         return null;
      } else {
         xi var3 = (xi)var1;
         if (var2.equals("lid")) {
            return var3.a;
         } else if (var2.equals("base")) {
            return var3.b;
         } else {
            return var2.equals("knob") ? var3.c : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"lid", "base", "knob"};
   }

   public agU a(wY var1, float var2) {
      Ie var3 = this.a.a;
      Object var4 = var3.a(aaM.class);
      if (!(var4 instanceof HW)) {
         return null;
      } else {
         if (((Ik)var4).a() == null) {
            var4 = new HW(this.a);
            ((Ik)var4).a(var3);
         }

         ((HW)var4).a = (xi)var1;
         return (agU)var4;
      }
   }
}
