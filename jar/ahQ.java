public class ahq extends agV {
   public ahq(sE var1) {
      super(var1, PN.class, "endermite", 0.3F);
   }

   public wY a() {
      return new xq(this.a);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof xq)) {
         return null;
      } else {
         xq var3 = (xq)var1;
         String var4 = "body";
         if (var2.startsWith(var4)) {
            xN[] var5 = var3.a;
            if (var5 == null) {
               return null;
            } else {
               String var6 = var2.substring(var4.length());
               int var7 = afT.a((String)var6, -1);
               --var7;
               return var7 >= 0 && var7 < var5.length ? var5[var7] : null;
            }
         } else {
            return null;
         }
      }
   }

   public String[] b() {
      return new String[]{"body1", "body2", "body3", "body4"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      Fy var4 = new Fy(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
