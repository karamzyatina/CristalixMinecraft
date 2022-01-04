final class wG {
   private final T a;
   private long a;
   private long b;
   private wI a;
   // $FF: synthetic field
   final wE a;

   private wG(wE var1, wH var2) {
      this.a = var1;
      this.a = -1L;
      this.b = -1L;
      this.a = wI.SHOW;
      this.a = var2;
   }

   public T a() {
      return this.a;
   }

   private float a(long var1) {
      float var3 = adh.a((float)(var1 - this.a) / 600.0F, 0.0F, 1.0F);
      var3 *= var3;
      return this.a == wI.HIDE ? 1.0F - var3 : var3;
   }

   public boolean a(int var1, int var2) {
      long var3 = sE.a();
      if (this.a == -1L) {
         this.a = var3;
         this.a.a(wE.a(this.a).a());
      }

      if (this.a == wI.SHOW && var3 - this.a <= 600L) {
         this.b = var3;
      }

      By.C();
      By.c((float)var1 - 160.0F * this.a(var3), (float)(var2 * 32), (float)(500 + var2));
      wI var5 = this.a.a(this.a, var3 - this.b);
      By.D();
      if (var5 != this.a) {
         this.a = var3 - (long)((int)((1.0F - this.a(var3)) * 600.0F));
         this.a = var5;
         this.a.a(wE.a(this.a).a());
      }

      return this.a == wI.HIDE && var3 - this.a > 600L;
   }

   // $FF: synthetic method
   wG(wE var1, wH var2, wF var3) {
      this(var1, var2);
   }
}
