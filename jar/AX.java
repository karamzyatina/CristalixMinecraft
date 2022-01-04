public final class Ax extends yQ {
   protected Ax(aej var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      float var14 = this.a.nextFloat() * 0.1F + 0.2F;
      this.g = var14;
      this.h = var14;
      this.i = var14;
      this.a(0);
      this.setSize(0.02F, 0.02F);
      this.e *= this.a.nextFloat() * 0.6F + 0.5F;
      this.g *= 0.019999999552965164D;
      this.h *= 0.019999999552965164D;
      this.i *= 0.019999999552965164D;
      this.e = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void move(double var1, double var3, double var5) {
      this.a().f(var1, var3, var5);
      this.c();
   }

   public void a() {
      this.a = this.d;
      this.b = this.e;
      this.c = this.f;
      this.move(this.g, this.h, this.i);
      this.g *= 0.99D;
      this.h *= 0.99D;
      this.i *= 0.99D;
      if (this.e-- <= 0) {
         this.setExpired();
      }

   }
}
