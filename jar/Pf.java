public final class pf extends mY {
   public static final sr<ph> a;
   public static final sp a;
   protected static final acU d;
   protected static final acU e;
   protected static final acU f;
   protected static final acU g;
   protected static final acU h;
   protected static final acU i;

   public pf() {
      super(si.q);
      this.a(this.a.a().a(a, ph.NORTH).a(a, Boolean.FALSE));
      this.a(KC.c);
   }

   public acU b(sD var1, aec var2, int var3, int var4, int var5) {
      return c;
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean a(aej var1, int var2, int var3, int var4, abP var5) {
      return b(var1, var2, var3, var4, var5);
   }

   public boolean a(aej var1, int var2, int var3, int var4) {
      abP[] var5 = abP.VALUES;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         abP var8 = var5[var7];
         if (b(var1, var2, var3, var4, var8)) {
            return true;
         }
      }

      return false;
   }

   protected static boolean b(aej var0, int var1, int var2, int var3, abP var4) {
      return ns.b(var0, var1, var2, var3, var4);
   }

   protected static boolean b(aej var0, acV var1, abP var2) {
      return b(var0, var1.a, var1.b, var1.c, var2);
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      sD var11 = this.a().a(a, Boolean.FALSE);
      if (b(var1, var2, var3, var4, var5)) {
         return var11.a(a, ph.a(var5, var10.b()));
      } else {
         abP[] var12 = abT.HORIZONTAL.a();
         int var13 = var12.length;

         for(int var14 = 0; var14 < var13; ++var14) {
            abP var15 = var12[var14];
            if (var15 != var5 && b(var1, var2, var3, var4, var15)) {
               return var11.a(a, ph.a(var15, var10.b()));
            }
         }

         if (var1.a(var2, var3 - 1, var4).isTopSolid()) {
            return var11.a(a, ph.a(abP.UP, var10.b()));
         } else {
            return var11;
         }
      }
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      return true;
   }

   public int a(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      return (Boolean)var1.a((so)a) ? 15 : 0;
   }

   public int b(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      if (!(Boolean)var1.a((so)a)) {
         return 0;
      } else {
         return ((ph)var1.a((so)a)).a() == var6 ? 15 : 0;
      }
   }

   public boolean l(sD var1) {
      return true;
   }

   public sD a(int var1) {
      return this.a().a(a, ph.a(var1 & 7)).a(a, (var1 & 8) > 0);
   }

   public int c(sD var1) {
      byte var2 = 0;
      int var3 = var2 | ((ph)var1.a((so)a)).a();
      if ((Boolean)var1.a((so)a)) {
         var3 |= 8;
      }

      return var3;
   }

   public sD a(sD var1, acE var2) {
      // $FF: Couldn't be decompiled
   }

   public sD a(sD var1, act var2) {
      return var1.a((acE)var2.a(((ph)var1.a((so)a)).a()));
   }

   public sy a() {
      return new sy(this, new so[]{a, a});
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return su.UNDEFINED;
   }

   static {
      a = sr.a("facing", ph.class, (Enum[])ph.VALUES);
      a = sp.a("powered");
      d = (new acU(0.3125D, 0.20000000298023224D, 0.625D, 0.6875D, 0.800000011920929D, 1.0D)).a();
      e = (new acU(0.3125D, 0.20000000298023224D, 0.0D, 0.6875D, 0.800000011920929D, 0.375D)).a();
      f = (new acU(0.625D, 0.20000000298023224D, 0.3125D, 1.0D, 0.800000011920929D, 0.6875D)).a();
      g = (new acU(0.0D, 0.20000000298023224D, 0.3125D, 0.375D, 0.800000011920929D, 0.6875D)).a();
      h = (new acU(0.25D, 0.0D, 0.25D, 0.75D, 0.6000000238418579D, 0.75D)).a();
      i = (new acU(0.25D, 0.4000000059604645D, 0.25D, 0.75D, 1.0D, 0.75D)).a();
   }
}
