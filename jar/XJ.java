public final class xj extends wY {
   public xN a;
   public xN b;
   public xN c;
   public xN d;
   public xN e;
   public xN f;
   public xN g;
   public xN h;

   public xj(sE var1) {
      this.a = new xN(var1, this, 0, 0);
      this.a.a(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.a.a(0.0F, 15.0F, -4.0F);
      this.g = new xN(var1, this, 14, 0);
      this.g.a(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.g.a(0.0F, 15.0F, -4.0F);
      this.h = new xN(var1, this, 14, 4);
      this.h.a(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this.h.a(0.0F, 15.0F, -4.0F);
      this.b = new xN(var1, this, 0, 9);
      this.b.a(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.b.a(0.0F, 16.0F, 0.0F);
      this.c = new xN(var1, this, 26, 0);
      this.c.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.c.a(-2.0F, 19.0F, 1.0F);
      this.d = new xN(var1, this, 26, 0);
      this.d.a(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.d.a(1.0F, 19.0F, 1.0F);
      this.e = new xN(var1, this, 24, 13);
      this.e.a(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.e.a(-4.0F, 13.0F, 0.0F);
      this.f = new xN(var1, this, 24, 13);
      this.f.a(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.f.a(4.0F, 13.0F, 0.0F);
   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.b) {
         float var8 = 2.0F;
         By.C();
         By.c(0.0F, 5.0F * var7, 2.0F * var7);
         this.a.a(var7);
         this.g.a(var7);
         this.h.a(var7);
         By.D();
         By.C();
         By.b(0.5F, 0.5F, 0.5F);
         By.c(0.0F, 24.0F * var7, 0.0F);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
         By.D();
      } else {
         this.a.a(var7);
         this.g.a(var7);
         this.h.a(var7);
         this.b.a(var7);
         this.c.a(var7);
         this.d.a(var7);
         this.e.a(var7);
         this.f.a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      this.a.f = var5 * 0.017453292F;
      this.a.g = var4 * 0.017453292F;
      this.g.f = this.a.f;
      this.g.g = this.a.g;
      this.h.f = this.a.f;
      this.h.g = this.a.g;
      this.b.f = 1.5707964F;
      this.c.f = adh.b(var1 * 0.6662F) * 1.4F * var2;
      this.d.f = adh.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.e.h = var3;
      this.f.h = -var3;
   }
}
