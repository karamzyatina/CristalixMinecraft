public final class agb {
   private adm a = null;
   private long a = System.currentTimeMillis();

   public adm a(double var1, double var3, double var5) {
      if (this.a == null) {
         this.a = new adm(var1, var3, var5);
         return this.a;
      } else {
         long var7 = System.currentTimeMillis();
         long var9 = var7 - this.a;
         if (var9 == 0L) {
            return this.a;
         } else {
            this.a = var7;
            if (Math.abs(var1 - this.a.a) < 0.004D && Math.abs(var3 - this.a.b) < 0.004D && Math.abs(var5 - this.a.c) < 0.004D) {
               return this.a;
            } else {
               double var11 = (double)var9 * 0.001D;
               var11 = afT.a(var11, 0.0D, 1.0D);
               double var13 = var1 - this.a.a;
               double var15 = var3 - this.a.b;
               double var17 = var5 - this.a.c;
               double var19 = this.a.a + var13 * var11;
               double var21 = this.a.b + var15 * var11;
               double var23 = this.a.c + var17 * var11;
               this.a = new adm(var19, var21, var23);
               return this.a;
            }
         }
      }
   }
}
