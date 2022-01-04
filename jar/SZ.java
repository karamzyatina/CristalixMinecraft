public final class sZ extends tg {
   private final tE a;
   private int b;

   public sZ(tE var1) {
      super(RW.aQ, acI.PLAYERS);
      this.a = var1;
      this.b = true;
      this.a = 0;
      this.a = 0.1F;
   }

   public void a() {
      ++this.b;
      tE var1 = this.a;
      if (var1.c || this.b > 20 && !var1.isElytraFlying()) {
         this.a = true;
      } else {
         this.c = (float)var1.d;
         this.d = (float)var1.e;
         this.e = (float)var1.f;
         double var2 = var1.a.a();
         double var4 = var1.b.a();
         double var6 = var1.c.a();
         float var8 = adh.a(var2 * var2 + var6 * var6 + var4 * var4);
         float var9 = var8 / 2.0F;
         if ((double)var8 >= 0.01D) {
            this.a = adh.a(var9 * var9, 0.0F, 1.0F);
         } else {
            this.a = 0.0F;
         }

         if (this.b < 20) {
            this.a = 0.0F;
         } else if (this.b < 40) {
            this.a = (float)((double)this.a * ((double)(this.b - 20) / 20.0D));
         }

         float var10 = 0.8F;
         if (this.a > 0.8F) {
            this.b = 1.0F + (this.a - 0.8F);
         } else {
            this.b = 1.0F;
         }
      }

   }
}
