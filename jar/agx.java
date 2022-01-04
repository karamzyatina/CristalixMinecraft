public final class agX extends agV {
   public agX(sE var1) {
      super(var1, aaH.class, "banner", 0.0F);
   }

   public wY a() {
      return new wX(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof wX)) {
         return null;
      } else {
         wX var3 = (wX)var1;
         if (var2.equals("slate")) {
            return var3.a;
         } else if (var2.equals("stand")) {
            return var3.b;
         } else {
            return var2.equals("top") ? var3.c : null;
         }
      }
   }

   public String[] b() {
      return new String[]{"slate", "stand", "top"};
   }

   public agU a(wY var1, float var2) {
      Ie var3 = this.a.a;
      Object var4 = var3.a(aaH.class);
      if (!(var4 instanceof HT)) {
         return null;
      } else {
         if (((Ik)var4).a() == null) {
            var4 = new HT(this.a);
            ((Ik)var4).a(var3);
         }

         ((HT)var4).a = (wX)var1;
         return (agU)var4;
      }
   }
}
