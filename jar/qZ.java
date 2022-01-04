public abstract class qz extends oV {
   protected static final acU d = (new acU(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D)).a();
   protected final boolean h;

   protected qz(boolean var1) {
      super(si.q);
      this.h = var1;
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      return d;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean a(aej var1, int var2, int var3, int var4) {
      return var1.a(var2, var3 - 1, var4).isTopSolid() && super.a(var1, var2, var3, var4);
   }

   public boolean b(aej var1, acV var2) {
      return var1.a(var2.b()).isTopSolid();
   }

   public boolean a(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      return var6.a() != abR.Y;
   }

   protected boolean m(sD var1) {
      return this.h;
   }

   public int b(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      return var1.a(var2, var3, var4, var5, var6);
   }

   public int a(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      if (!this.m(var1)) {
         return 0;
      } else {
         return var1.a((so)a) == var6 ? this.a(var2, var3, var4, var5, var1) : 0;
      }
   }

   public boolean a(aec var1, int var2, int var3, int var4, sD var5) {
      return false;
   }

   public boolean a(aec var1, acV var2, sD var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   protected boolean a(aej var1, acV var2, sD var3) {
      return this.a(var1, var2, var3) > 0;
   }

   protected int a(aej var1, int var2, int var3, int var4, sD var5) {
      abP var6 = (abP)var5.a((so)a);
      int var7 = var2 + var6.getXOffset();
      int var8 = var3 + var6.getYOffset();
      int var9 = var4 + var6.getZOffset();
      int var10 = var1.b(var7, var8, var9, var6);
      if (var10 >= 15) {
         return var10;
      } else {
         sD var11 = var1.a(var7, var8, var9);
         return Math.max(var10, var11.a() == RQ.a ? (Integer)var11.a((so)qE.a) : 0);
      }
   }

   protected int a(aej var1, acV var2, sD var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   protected int b(aec var1, int var2, int var3, int var4, sD var5) {
      abP var6 = (abP)var5.a((so)a);
      abP var7 = var6.b();
      abP var8 = var6.e();
      return Math.max(this.a(var1, var2 + var7.getXOffset(), var3 + var7.getYOffset(), var4 + var7.getZOffset(), var7), this.a(var1, var2 + var8.getXOffset(), var3 + var8.getYOffset(), var4 + var8.getZOffset(), var8));
   }

   protected int a(aec var1, acV var2, sD var3) {
      return this.b(var1, var2.a, var2.b, var2.c, var3);
   }

   protected int a(aec var1, int var2, int var3, int var4, abP var5) {
      sD var6 = var1.a(var2, var3, var4);
      nh var7 = var6.a();
      if (this.n(var6)) {
         if (var7 == RQ.bm) {
            return 15;
         } else {
            return var7 == RQ.a ? (Integer)var6.a((so)qE.a) : var1.a(var2, var3, var4, var5);
         }
      } else {
         return 0;
      }
   }

   protected int a(aec var1, acV var2, abP var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   public boolean l(sD var1) {
      return true;
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      return this.a().a(a, var10.b().a());
   }

   public void a(aej var1, acV var2, sD var3, Oh var4, Vh var5) {
   }

   public void a(aej var1, acV var2, sD var3) {
      super.a(var1, var2, var3);
   }

   public boolean j(sD var1) {
      return false;
   }

   protected boolean n(sD var1) {
      return var1.canProvidePower();
   }

   protected int a(aec var1, int var2, int var3, int var4, sD var5) {
      return 15;
   }

   protected int b(aec var1, acV var2, sD var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   public static boolean o(sD var0) {
      return RQ.a.p(var0) || RQ.a.p(var0);
   }

   public boolean p(sD var1) {
      nh var2 = var1.a();
      return var2 == this.a(this.a()).a() || var2 == this.b(this.a()).a();
   }

   protected abstract int f(sD var1);

   protected abstract sD a(sD var1);

   protected abstract sD b(sD var1);

   public abu a() {
      return abu.CUTOUT;
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return var6 == abP.DOWN ? su.SOLID : su.UNDEFINED;
   }
}
