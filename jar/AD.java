public class Ad extends yQ {
   private final int a;
   private final int f;
   private final float m;
   private float n = 0.91F;
   private float o;
   private float p;
   private float q;
   private boolean d;

   public Ad(aej var1, double var2, double var4, double var6, int var8, int var9, float var10) {
      super(var1, var2, var4, var6);
      this.a = var8;
      this.f = var9;
      this.m = var10;
   }

   public void b(int var1) {
      float var2 = (float)((var1 & 16711680) >> 16) / 255.0F;
      float var3 = (float)((var1 & '\uff00') >> 8) / 255.0F;
      float var4 = (float)((var1 & 255) >> 0) / 255.0F;
      this.a(var2 * 1.0F, var3 * 1.0F, var4 * 1.0F);
   }

   public void c(int var1) {
      this.o = (float)((var1 & 16711680) >> 16) / 255.0F;
      this.p = (float)((var1 & '\uff00') >> 8) / 255.0F;
      this.q = (float)((var1 & 255) >> 0) / 255.0F;
      this.d = true;
   }

   public boolean a() {
      return true;
   }

   public void a() {
      this.a = this.d;
      this.b = this.e;
      this.c = this.f;
      if (this.d++ >= this.e) {
         this.setExpired();
      }

      if (this.d > this.e / 2) {
         this.a(1.0F - ((float)this.d - (float)(this.e / 2)) / (float)this.e);
         if (this.d) {
            this.g += (this.o - this.g) * 0.2F;
            this.h += (this.p - this.h) * 0.2F;
            this.i += (this.q - this.i) * 0.2F;
         }
      }

      this.a(this.a + (this.f - 1 - this.d * this.f / this.e));
      this.h += (double)this.m;
      this.move(this.g, this.h, this.i);
      this.g *= (double)this.n;
      this.h *= (double)this.n;
      this.i *= (double)this.n;
      if (this.a) {
         this.g *= 0.699999988079071D;
         this.i *= 0.699999988079071D;
      }

   }

   public int a(float var1) {
      return 15728880;
   }

   protected void b(float var1) {
      this.n = var1;
   }
}
