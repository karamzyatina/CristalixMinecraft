public final class EP {
   public static final EO a = new EQ();

   public final void a(Ey var1) {
      this.a(new ER(this), (SZ[])(RT.a, RT.b, RT.c, RT.d, RT.e, RT.f, RT.g, RT.h, RT.i, RT.j, RT.k, RT.l, RT.m, RT.n, RT.o, RT.p, RT.q, RT.r, RT.s, RT.t));
      this.a(new ES(this), (nh)RQ.a);
      this.a(new ET(this), (SZ)RT.bL);
      this.a(new EU(this), (SZ[])(RT.a, RT.b, RT.c));
      this.a(new EV(this, var1), (nh[])(RQ.a, RQ.a, RQ.aB, RQ.a, RQ.b, RQ.aK));
      this.a(new EW(this), (SZ)RT.i);
      this.a(new EX(this), (SZ)RT.a);
   }

   public int a(Vh var1, int var2) {
      VR var3 = var1.a();
      return var3 != null && var3.a("color", (int)3) ? var3.getInteger("color") : var1.a().a.a(var1, var2);
   }

   public void a(EO var1, nh var2) {
      SZ.a(var2).a = var1;
   }

   public void a(EO var1, nh... var2) {
      nh[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         nh var6 = var3[var5];
         SZ.a(var6).a = var1;
      }

   }

   public void a(EO var1, SZ var2) {
      var2.a = var1;
   }

   public void a(EO var1, SZ... var2) {
      SZ[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         SZ var6 = var3[var5];
         var6.a = var1;
      }

   }
}
