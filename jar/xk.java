public class xK extends xL {
   public xK(sE var1) {
      super(var1, 12, 0.0F);
      this.b = 128;
      this.c = 64;
      this.a = new xN(var1, this, 0, 0);
      this.a.a(-3.5F, -3.0F, -3.0F, 7, 7, 7, 0.0F);
      this.a.a(0.0F, 10.0F, -16.0F);
      this.a.a(0, 44).a(-2.5F, 1.0F, -6.0F, 5, 3, 3, 0.0F);
      this.a.a(26, 0).a(-4.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
      xN var2 = this.a.a(26, 0);
      var2.a = true;
      var2.a(2.5F, -4.0F, -1.0F, 2, 2, 1, 0.0F);
      this.b = new xN(var1, this);
      this.b.a(0, 19).a(-5.0F, -13.0F, -7.0F, 14, 14, 11, 0.0F);
      this.b.a(39, 0).a(-4.0F, -25.0F, -7.0F, 12, 12, 10, 0.0F);
      this.b.a(-2.0F, 9.0F, 12.0F);
      this.c = new xN(var1, this, 50, 22);
      this.c.a(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
      this.c.a(-3.5F, 14.0F, 6.0F);
      this.d = new xN(var1, this, 50, 22);
      this.d.a(-2.0F, 0.0F, -2.0F, 4, 10, 8, 0.0F);
      this.d.a(3.5F, 14.0F, 6.0F);
      this.e = new xN(var1, this, 50, 40);
      this.e.a(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
      this.e.a(-2.5F, 14.0F, -7.0F);
      this.f = new xN(var1, this, 50, 40);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, 10, 6, 0.0F);
      this.f.a(2.5F, 14.0F, -7.0F);
      --this.c.c;
      ++this.d.c;
      xN var10000 = this.c;
      var10000.e += 0.0F;
      var10000 = this.d;
      var10000.e += 0.0F;
      --this.e.c;
      ++this.f.c;
      --this.e.e;
      --this.f.e;
      this.c += 2.0F;
   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.b) {
         this.b = 16.0F;
         this.c = 4.0F;
         By.C();
         By.b(0.6666667F, 0.6666667F, 0.6666667F);
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
      super.a(var1, var2, var3, var4, var5, var6, var7);
      float var8 = var3 - (float)var7.b;
      float var9 = ((Qb)var7).c(var8);
      var9 *= var9;
      float var10 = 1.0F - var9;
      xN var11 = this.b;
      xN var12 = this.e;
      xN var13 = this.f;
      xN var14 = this.a;
      var11.f = 1.5707964F - var9 * 3.1415927F * 0.35F;
      var11.d = 9.0F * var10 + 11.0F * var9;
      var12.d = 14.0F * var10 + -6.0F * var9;
      var12.e = -8.0F * var10 + -4.0F * var9;
      var12.f -= var9 * 3.1415927F * 0.45F;
      var13.d = var12.d;
      var13.e = var12.e;
      var13.f -= var9 * 3.1415927F * 0.45F;
      var14.d = 10.0F * var10 + -12.0F * var9;
      var14.e = -16.0F * var10 + -3.0F * var9;
      var14.f += var9 * 3.1415927F * 0.15F;
   }
}
