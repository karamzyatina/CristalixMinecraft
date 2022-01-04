public final class ti extends tg {
   private final Rn a;
   private final Po a;

   public ti(Rn var1, Po var2) {
      super(RW.eg, acI.NEUTRAL);
      this.a = var1;
      this.a = var2;
      this.a = tc.NONE;
      this.b = true;
      this.a = 0;
   }

   public void a() {
      Po var1 = this.a;
      Rn var2;
      if (!var1.c && (var2 = this.a).isRiding() && var2.c() == var1) {
         double var3 = var1.a.a();
         double var5 = var1.c.a();
         float var7 = adh.a(var3 * var3 + var5 * var5);
         if ((double)var7 >= 0.01D) {
            this.a = 0.0F + adh.a(var7, 0.0F, 1.0F) * 0.75F;
         } else {
            this.a = 0.0F;
         }
      } else {
         this.a = true;
      }

   }
}
