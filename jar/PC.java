public final class pc extends mY {
   public static final sq a;
   protected static final acU d;
   protected static final acU e;
   protected static final acU f;
   protected static final acU g;

   public pc() {
      super(si.q);
      this.a(this.a.a().a(a, abP.NORTH));
      this.a(KC.b);
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean a(aej var1, int var2, int var3, int var4, abP var5) {
      if (this.b(var1, var2 - 1, var3, var4, var5)) {
         return true;
      } else if (this.b(var1, var2 + 1, var3, var4, var5)) {
         return true;
      } else {
         return this.b(var1, var2, var3, var4 - 1, var5) || this.b(var1, var2, var3, var4 + 1, var5);
      }
   }

   private boolean b(aej var1, int var2, int var3, int var4, abP var5) {
      sD var6 = var1.a(var2, var3, var4);
      boolean var7 = b(var6.a());
      return !var7 && var6.a(var1, var2, var3, var4, var5) == su.SOLID && !var6.canProvidePower();
   }

   private boolean b(aej var1, acV var2, abP var3) {
      return this.b(var1, var2.a, var2.b, var2.c, var3);
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      abP var11 = var5.a();
      if (var5.a().isHorizontal() && this.b(var1, var2 + var11.getXOffset(), var3 + var11.getYOffset(), var4 + var11.getZOffset(), var5)) {
         return this.a().a(a, var5);
      } else {
         abP[] var12 = abT.HORIZONTAL.a();
         int var13 = var12.length;

         for(int var14 = 0; var14 < var13; ++var14) {
            abP var15 = var12[var14];
            var11 = var15.a();
            if (this.b(var1, var2 + var11.getXOffset(), var3 + var11.getYOffset(), var4 + var11.getZOffset(), var15)) {
               return this.a().a(a, var15);
            }
         }

         return this.a();
      }
   }

   public abu a() {
      return abu.CUTOUT;
   }

   public sD a(int var1) {
      abP var2 = abP.a(var1);
      if (var2.a() == abR.Y) {
         var2 = abP.NORTH;
      }

      return this.a().a(a, var2);
   }

   public int c(sD var1) {
      return ((abP)var1.a((so)a)).getIndex();
   }

   public sD a(sD var1, acE var2) {
      return var1.a(a, var2.a((abP)var1.a((so)a)));
   }

   public sD a(sD var1, act var2) {
      return var1.a((acE)var2.a((abP)var1.a((so)a)));
   }

   public sy a() {
      return new sy(this, a);
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return su.UNDEFINED;
   }

   static {
      a = oV.a;
      d = (new acU(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D)).a();
      e = (new acU(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)).a();
      f = (new acU(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D)).a();
      g = (new acU(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D)).a();
   }
}
