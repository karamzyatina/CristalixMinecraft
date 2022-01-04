public final class ajS {
   private final sE a;
   private boolean a = false;
   private boolean b = false;
   int a;
   private adm a;
   float a;
   private boolean c = false;
   private int b = 0;
   private adm b = new adm(-1.0D, -1.0D, -1.0D);
   private double a = 0.0D;
   private double b = 0.0D;
   private double c = 0.0D;
   private final int c;

   public ajS(sE var1) {
      this.a = var1;
      this.c = Bx.a(1);
   }

   public void a(boolean var1, int var2, float var3, adm var4) {
      this.b = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
   }

   public boolean a() {
      if (!this.a) {
         return true;
      } else if (this.b != this.c) {
         return true;
      } else if (this.a >= this.b + 20) {
         return true;
      } else {
         adm var1 = this.a;
         adm var2 = this.b;
         if (Math.abs(var1.a - var2.a) > 0.003D) {
            return true;
         } else if (Math.abs(var1.b - var2.b) > 0.003D) {
            return true;
         } else if (Math.abs(var1.c - var2.c) > 0.003D) {
            return true;
         } else {
            NN var3 = this.a.a();
            boolean var4 = this.b + (double)var3.getEyeHeight() < 128.0D + (double)(JI.k * 128.0F);
            boolean var5 = var3.b + (double)var3.getEyeHeight() < 128.0D + (double)(JI.k * 128.0F);
            return var5 != var4;
         }
      }
   }

   public void a() {
      Lw.k(this.c, 4864);
   }

   public void b() {
      Lw.g();
      this.c = this.b;
      this.b = this.a;
      this.b = this.a;
      NN var1 = this.a.a();
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.a = true;
      By.E();
   }

   public void c() {
      NN var1 = this.a.a();
      double var2 = (double)this.a;
      double var4 = var1.a + (var1.d - var1.a) * var2;
      double var6 = var1.b + (var1.e - var1.b) * var2;
      double var8 = var1.c + (var1.f - var1.c) * var2;
      double var10 = (double)((float)(this.a - this.b)) + var2;
      float var12 = (float)(var4 - this.a + var10 * 0.03D);
      float var13 = (float)(var6 - this.b);
      float var14 = (float)(var8 - this.c);
      By.C();
      if (this.b) {
         By.c(-var12 / 12.0F, -var13, -var14 / 12.0F);
      } else {
         By.c(-var12, -var13, -var14);
      }

      By.p(this.c);
      By.D();
      By.E();
   }

   public void d() {
      this.a = false;
   }
}
