public final class wV extends wW {
   public xN a;
   public xN b;
   public xN c;
   public xN d;

   public wV(sE var1) {
      this(var1, 0.0F);
   }

   public wV(sE var1, float var2) {
      super(var1, var2, 64, 64);
      this.e = new xN(var1, this, 0, 0);
      this.e.a(-1.0F, -7.0F, -1.0F, 2, 7, 2, var2);
      this.e.a(0.0F, 0.0F, 0.0F);
      this.g = new xN(var1, this, 0, 26);
      this.g.a(-6.0F, 0.0F, -1.5F, 12, 3, 3, var2);
      this.g.a(0.0F, 0.0F, 0.0F);
      this.h = new xN(var1, this, 24, 0);
      this.h.a(-2.0F, -2.0F, -1.0F, 2, 12, 2, var2);
      this.h.a(-5.0F, 2.0F, 0.0F);
      this.i = new xN(var1, this, 32, 16);
      this.i.a = true;
      this.i.a(0.0F, -2.0F, -1.0F, 2, 12, 2, var2);
      this.i.a(5.0F, 2.0F, 0.0F);
      this.j = new xN(var1, this, 8, 0);
      this.j.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, var2);
      this.j.a(-1.9F, 12.0F, 0.0F);
      this.k = new xN(var1, this, 40, 16);
      this.k.a = true;
      this.k.a(-1.0F, 0.0F, -1.0F, 2, 11, 2, var2);
      this.k.a(1.9F, 12.0F, 0.0F);
      this.a = new xN(var1, this, 16, 0);
      this.a.a(-3.0F, 3.0F, -1.0F, 2, 7, 2, var2);
      this.a.a(0.0F, 0.0F, 0.0F);
      this.a.b = true;
      this.b = new xN(var1, this, 48, 16);
      this.b.a(1.0F, 3.0F, -1.0F, 2, 7, 2, var2);
      this.b.a(0.0F, 0.0F, 0.0F);
      this.c = new xN(var1, this, 0, 48);
      this.c.a(-4.0F, 10.0F, -1.0F, 8, 2, 2, var2);
      this.c.a(0.0F, 0.0F, 0.0F);
      this.d = new xN(var1, this, 0, 32);
      this.d.a(-6.0F, 11.0F, -6.0F, 12, 1, 12, var2);
      this.d.a(0.0F, 12.0F, 0.0F);
      this.f.b = false;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      if (var7 instanceof Pa) {
         Pa var8 = (Pa)var7;
         this.i.b = var8.a();
         this.h.b = var8.a();
         this.d.b = !var8.hasNoBasePlate();
         this.k.a(1.9F, 12.0F, 0.0F);
         this.j.a(-1.9F, 12.0F, 0.0F);
         xN var9 = this.a;
         adk var10 = var8.b();
         float var11 = 0.017453292F * var10.getX();
         float var12 = 0.017453292F * var10.getY();
         float var13 = 0.017453292F * var10.getZ();
         var9.f = var11;
         var9.g = var12;
         var9.h = var13;
         xN var14 = this.b;
         var14.f = var11;
         var14.g = var12;
         var14.h = var13;
         xN var15 = this.c;
         var15.f = var11;
         var15.g = var12;
         var15.h = var13;
         xN var16 = this.d;
         var16.f = 0.0F;
         var16.g = 0.017453292F * -var7.j;
         var16.h = 0.0F;
      }

   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      By.C();
      if (this.b) {
         By.b(0.5F, 0.5F, 0.5F);
         By.c(0.0F, 24.0F * var7, 0.0F);
      } else if (var1.isSneaking()) {
         By.c(0.0F, 0.2F, 0.0F);
      }

      this.a.a(var7);
      this.b.a(var7);
      this.c.a(var7);
      this.d.a(var7);
      By.D();
   }

   public void a(float var1, abV var2) {
      xN var3 = this.a(var2);
      boolean var4 = var3.b;
      var3.b = true;
      super.a(var1, var2);
      var3.b = var4;
   }
}
