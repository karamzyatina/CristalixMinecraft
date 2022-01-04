import java.util.List;

public final class os extends mY {
   public static final sp a = sp.a("north");
   public static final sp b = sp.a("east");
   public static final sp c = sp.a("south");
   public static final sp d = sp.a("west");
   protected static final acU[] a = new acU[]{(new acU(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 0.625D, 1.0D, 1.0D)).a(), (new acU(0.0D, 0.0D, 0.375D, 0.625D, 1.0D, 0.625D)).a(), (new acU(0.0D, 0.0D, 0.375D, 0.625D, 1.0D, 1.0D)).a(), (new acU(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D)).a(), (new acU(0.0D, 0.0D, 0.0D, 0.625D, 1.0D, 0.625D)).a(), (new acU(0.0D, 0.0D, 0.0D, 0.625D, 1.0D, 1.0D)).a(), (new acU(0.375D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.375D, 1.0D, 1.0D, 1.0D)).a(), (new acU(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 0.625D)).a(), (new acU(0.0D, 0.0D, 0.375D, 1.0D, 1.0D, 1.0D)).a(), (new acU(0.375D, 0.0D, 0.0D, 1.0D, 1.0D, 0.625D)).a(), (new acU(0.375D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)).a(), (new acU(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.625D)).a(), (new acU(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)).a()};
   public static final acU d = (new acU(0.375D, 0.0D, 0.375D, 0.625D, 1.5D, 0.625D)).a();
   public static final acU e = (new acU(0.375D, 0.0D, 0.625D, 0.625D, 1.5D, 1.0D)).a();
   public static final acU f = (new acU(0.0D, 0.0D, 0.375D, 0.375D, 1.5D, 0.625D)).a();
   public static final acU g = (new acU(0.375D, 0.0D, 0.0D, 0.625D, 1.5D, 0.375D)).a();
   public static final acU h = (new acU(0.625D, 0.0D, 0.375D, 1.0D, 1.5D, 0.625D)).a();

   public os(si var1, sh var2) {
      super(var1, var2);
      this.a(this.a.a().a(a, Boolean.FALSE).a(b, Boolean.FALSE).a(c, Boolean.FALSE).a(d, Boolean.FALSE));
      this.a(KC.b);
   }

   public void a(sD var1, aej var2, int var3, int var4, int var5, acU var6, List<acU> var7, NN var8, boolean var9) {
      if (!var9) {
         var1 = var1.a(var2, var3, var4, var5);
      }

      a(var3, var4, var5, var6, var7, d);
      if ((Boolean)var1.a((so)a)) {
         a(var3, var4, var5, var6, var7, g);
      }

      if ((Boolean)var1.a((so)b)) {
         a(var3, var4, var5, var6, var7, h);
      }

      if ((Boolean)var1.a((so)c)) {
         a(var3, var4, var5, var6, var7, e);
      }

      if ((Boolean)var1.a((so)d)) {
         a(var3, var4, var5, var6, var7, f);
      }

   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      var1 = this.a(var1, var2, var3, var4, var5);
      return a[f(var1)];
   }

   private static int f(sD var0) {
      int var1 = 0;
      if ((Boolean)var0.a((so)a)) {
         var1 |= 1 << abP.NORTH.getHorizontalIndex();
      }

      if ((Boolean)var0.a((so)b)) {
         var1 |= 1 << abP.EAST.getHorizontalIndex();
      }

      if ((Boolean)var0.a((so)c)) {
         var1 |= 1 << abP.SOUTH.getHorizontalIndex();
      }

      if ((Boolean)var0.a((so)d)) {
         var1 |= 1 << abP.WEST.getHorizontalIndex();
      }

      return var1;
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean a(aec var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean a(aec var1, int var2, int var3, int var4, abP var5) {
      sD var6 = var1.a(var2, var3, var4);
      su var7 = var6.a(var1, var2, var3, var4, var5);
      nh var8 = var6.a();
      boolean var9 = var7 == su.MIDDLE_POLE && (var6.a() == this.a || var8 instanceof ou);
      return !c(var8) && var7 == su.SOLID || var9;
   }

   public boolean a(aec var1, acV var2, abP var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   protected static boolean c(nh var0) {
      return mY.b(var0) || var0 == RQ.bt || var0 == RQ.ay || var0 == RQ.al || var0 == RQ.ap;
   }

   public boolean a(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      return true;
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      Vh var12 = var6.a((abU)var7);
      return var12.a() == RT.bV || var12.isEmpty();
   }

   public int c(sD var1) {
      return 0;
   }

   public sD a(sD var1, aec var2, int var3, int var4, int var5) {
      return var1.a(a, this.a(var2, var3, var4, var5 - 1, abP.SOUTH)).a(b, this.a(var2, var3 + 1, var4, var5, abP.WEST)).a(c, this.a(var2, var3, var4, var5 + 1, abP.NORTH)).a(d, this.a(var2, var3 - 1, var4, var5, abP.EAST));
   }

   public sD a(sD var1, acE var2) {
      // $FF: Couldn't be decompiled
   }

   public sD a(sD var1, act var2) {
      // $FF: Couldn't be decompiled
   }

   public sy a() {
      return new sy(this, new so[]{a, b, d, c});
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return var6 != abP.UP && var6 != abP.DOWN ? su.MIDDLE_POLE : su.CENTER;
   }
}
