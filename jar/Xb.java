public final class xB extends xL {
   private final xN g;
   private final xN h;

   public xB(sE var1, float var2) {
      super(var1, 15, var2);
      this.b = 128;
      this.c = 64;
      this.a = new xN(var1, this, 0, 0);
      this.a.a(-2.0F, -14.0F, -10.0F, 4, 4, 9, var2);
      this.a.a(0.0F, 7.0F, -6.0F);
      this.a.a(0, 14).a(-4.0F, -16.0F, -6.0F, 8, 18, 6, var2);
      this.a.a(17, 0).a(-4.0F, -19.0F, -4.0F, 3, 3, 2, var2);
      this.a.a(17, 0).a(1.0F, -19.0F, -4.0F, 3, 3, 2, var2);
      this.b = new xN(var1, this, 29, 0);
      this.b.a(-6.0F, -10.0F, -7.0F, 12, 18, 10, var2);
      this.b.a(0.0F, 5.0F, 2.0F);
      this.g = new xN(var1, this, 45, 28);
      this.g.a(-3.0F, 0.0F, 0.0F, 8, 8, 3, var2);
      this.g.a(-8.5F, 3.0F, 3.0F);
      this.g.g = 1.5707964F;
      this.h = new xN(var1, this, 45, 41);
      this.h.a(-3.0F, 0.0F, 0.0F, 8, 8, 3, var2);
      this.h.a(5.5F, 3.0F, 3.0F);
      this.h.g = 1.5707964F;
      boolean var3 = true;
      boolean var4 = true;
      this.c = new xN(var1, this, 29, 29);
      this.c.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, var2);
      this.c.a(-2.5F, 10.0F, 6.0F);
      this.d = new xN(var1, this, 29, 29);
      this.d.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, var2);
      this.d.a(2.5F, 10.0F, 6.0F);
      this.e = new xN(var1, this, 29, 29);
      this.e.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, var2);
      this.e.a(-2.5F, 10.0F, -4.0F);
      this.f = new xN(var1, this, 29, 29);
      this.f.a(-2.0F, 0.0F, -2.0F, 4, 14, 4, var2);
      this.f.a(2.5F, 10.0F, -4.0F);
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
      Qy var8 = (Qy)var1;
      boolean var9 = !var8.isChild() && var8.x();
      this.a(var2, var3, var4, var5, var6, var7, var1);
      if (this.b) {
         float var10 = 2.0F;
         By.C();
         By.c(0.0F, this.b * var7, this.c * var7);
         By.D();
         By.C();
         float var11 = 0.7F;
         By.b(0.71428573F, 0.64935064F, 0.7936508F);
         By.c(0.0F, 21.0F * var7, 0.22F);
         this.a.a(var7);
         By.D();
         By.C();
         float var12 = 1.1F;
         By.b(0.625F, 0.45454544F, 0.45454544F);
         By.c(0.0F, 33.0F * var7, 0.0F);
         this.b.a(var7);
         By.D();
         By.C();
         By.b(0.45454544F, 0.41322312F, 0.45454544F);
         By.c(0.0F, 33.0F * var7, 0.0F);
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

      if (var9) {
         this.g.a(var7);
         this.h.a(var7);
      }

   }
}
