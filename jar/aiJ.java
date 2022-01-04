public class aij extends agV {
   public aij(sE var1) {
      super(var1, OH.class, "wither", 0.5F);
   }

   public wY a() {
      return new ye(this.a, 0.0F);
   }

   public xN a(wY var1, String var2) {
      if (!(var1 instanceof ye)) {
         return null;
      } else {
         ye var3 = (ye)var1;
         String var4 = "body";
         if (var2.startsWith(var4)) {
            xN[] var9 = var3.a;
            if (var9 == null) {
               return null;
            } else {
               String var10 = var2.substring(var4.length());
               int var11 = afT.a((String)var10, -1);
               --var11;
               return var11 >= 0 && var11 < var9.length ? var9[var11] : null;
            }
         } else {
            String var5 = "head";
            if (var2.startsWith(var5)) {
               xN[] var6 = var3.b;
               if (var6 == null) {
                  return null;
               } else {
                  String var7 = var2.substring(var5.length());
                  int var8 = afT.a((String)var7, -1);
                  --var8;
                  return var8 >= 0 && var8 < var6.length ? var6[var8] : null;
               }
            } else {
               return null;
            }
         }
      }
   }

   public String[] b() {
      return new String[]{"body1", "body2", "body3", "head1", "head2", "head3"};
   }

   public agU a(wY var1, float var2) {
      Ga var3 = this.a.a();
      GL var4 = new GL(var3);
      var4.a = var1;
      var4.a = var2;
      return var4;
   }
}
