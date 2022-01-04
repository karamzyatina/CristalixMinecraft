public class xL extends wY {
   public xN a;
   public xN b;
   public xN c;
   public xN d;
   public xN e;
   public xN f;
   protected float b = 8.0F;
   protected float c = 4.0F;

   public xL(sE var1, int var2, float var3) {
      this.a = new xN(var1, this, 0, 0);
      this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, var3);
      this.a.a(0.0F, (float)(18 - var2), -6.0F);
      this.b = new xN(var1, this, 28, 8);
      this.b.a(-5.0F, -10.0F, -7.0F, 10, 16, 8, var3);
      this.b.a(0.0F, (float)(17 - var2), 2.0F);
      this.c = new xN(var1, this, 0, 16);
      this.c.a(-2.0F, 0.0F, -2.0F, 4, var2, 4, var3);
      this.c.a(-3.0F, (float)(24 - var2), 7.0F);
      this.d = new xN(var1, this, 0, 16);
      this.d.a(-2.0F, 0.0F, -2.0F, 4, var2, 4, var3);
      this.d.a(3.0F, (float)(24 - var2), 7.0F);
      this.e = new xN(var1, this, 0, 16);
      this.e.a(-2.0F, 0.0F, -2.0F, 4, var2, 4, var3);
      this.e.a(-3.0F, (float)(24 - var2), -5.0F);
      this.f = new xN(var1, this, 0, 16);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, var2, 4, var3);
      this.f.a(3.0F, (float)(24 - var2), -5.0F);
   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.b) {
         By.C();
         By.c(0.0F, this.b * var7, this.c * var7);
         this.a.a(var7);
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
      this.b.f = 1.5707964F;
      this.c.f = adh.b(var1 * 0.6662F) * 1.4F * var2;
      this.d.f = adh.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.e.f = adh.b(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.f.f = adh.b(var1 * 0.6662F) * 1.4F * var2;
   }
}
