public final class Aj extends yQ {
   float m;

   protected Aj(aej var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 1.0F);
   }

   protected Aj(aej var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.g *= 0.10000000149011612D;
      this.h *= 0.10000000149011612D;
      this.i *= 0.10000000149011612D;
      this.g += var8;
      this.h += var10;
      this.i += var12;
      float var15 = 1.0F - (float)(Math.random() * 0.30000001192092896D);
      this.g = var15;
      this.h = var15;
      this.i = var15;
      this.e *= 0.75F;
      this.e *= var14;
      this.m = this.e;
      this.e = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.e = (int)((float)this.e * var14);
   }

   public void a(Bh var1, NN var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.d + var3) / (float)this.e * 32.0F;
      var9 = adh.a(var9, 0.0F, 1.0F);
      this.e = this.m * var9;
      super.a(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void a() {
      this.a = this.d;
      this.b = this.e;
      this.c = this.f;
      if (this.d++ >= this.e) {
         this.setExpired();
      }

      this.a(7 - this.d * 8 / this.e);
      this.h -= 0.03D;
      this.move(this.g, this.h, this.i);
      this.g *= 0.9900000095367432D;
      this.h *= 0.9900000095367432D;
      this.i *= 0.9900000095367432D;
      if (this.a) {
         this.g *= 0.699999988079071D;
         this.i *= 0.699999988079071D;
      }

   }
}
