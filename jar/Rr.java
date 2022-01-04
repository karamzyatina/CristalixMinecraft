import com.google.common.base.MoreObjects;

public final class rR extends mY {
   public static final sq a;
   public static final sp a;
   public static final sp b;
   protected static final acU d;
   protected static final acU e;
   protected static final acU f;
   protected static final acU g;

   public rR() {
      super(si.q);
      this.a(this.a.a().a(a, abP.NORTH).a(a, Boolean.FALSE).a(b, Boolean.FALSE));
      this.a(KC.c);
      this.a(true);
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      // $FF: Couldn't be decompiled
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
      abP var6 = var5.a();
      int var7 = var2 + var6.getXOffset();
      int var8 = var3 + var6.getYOffset();
      int var9 = var4 + var6.getZOffset();
      sD var10 = var1.a(var7, var8, var9);
      boolean var11 = b(var10.a());
      return !var11 && var5.a().isHorizontal() && var10.a(var1, var7, var8, var9, var5) == su.SOLID && !var10.canProvidePower();
   }

   public boolean a(aej var1, int var2, int var3, int var4) {
      abP[] var5 = abT.HORIZONTAL.a();
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         abP var8 = var5[var7];
         if (this.a(var1, var2, var3, var4, var8)) {
            return true;
         }
      }

      return false;
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      sD var11 = this.a().a(a, Boolean.FALSE).a(b, Boolean.FALSE);
      if (var5.a().isHorizontal()) {
         var11 = var11.a(a, var5);
      }

      return var11;
   }

   public void a(aej var1, acV var2, sD var3, Oh var4, Vh var5) {
      this.a(var1, var2, var3, false, false, -1, (sD)null);
   }

   public void a(aej var1, acV var2, sD var3, boolean var4, boolean var5, int var6, sD var7) {
      abP var8 = (abP)var3.a((so)a);
      boolean var9 = (Boolean)var3.a((so)b);
      boolean var10 = (Boolean)var3.a((so)a);
      boolean var11 = !var4;
      boolean var12 = false;
      int var13 = 0;
      sD[] var14 = new sD[42];

      acV var16;
      for(int var15 = 1; var15 < 42; ++var15) {
         var16 = var2.a(var8, var15);
         sD var17 = var1.a(var16);
         if (var17.a() == RQ.a) {
            if (var17.a((so)a) == var8.a()) {
               var13 = var15;
            }
            break;
         }

         if (var17.a() != RQ.aZ && var15 != var6) {
            var14[var15] = null;
            var11 = false;
         } else {
            if (var15 == var6) {
               var17 = (sD)MoreObjects.firstNonNull(var7, var17);
            }

            boolean var18 = !(Boolean)var17.a((so)rP.c);
            boolean var19 = (Boolean)var17.a((so)rP.a);
            var12 |= var18 && var19;
            var14[var15] = var17;
            if (var15 == var6) {
               var11 &= var18;
            }
         }
      }

      var11 &= var13 > 1;
      var12 &= var11;
      sD var20 = this.a().a(b, var11).a(a, var12);
      if (var13 > 0) {
         var16 = var2.a(var8, var13);
         abP var22 = var8.a();
         var1.a((acV)var16, (sD)var20.a(a, var22), 3);
         this.a(var1, var16, var11, var12, var9, var10);
      }

      this.a(var1, var2, var11, var12, var9, var10);
      if (!var4) {
         var1.a((acV)var2, (sD)var20.a(a, var8), 3);
      }

      if (var9 != var11) {
         for(int var21 = 1; var21 < var13; ++var21) {
            acV var23 = var2.a(var8, var21);
            sD var24 = var14[var21];
            if (var24 != null && var1.a(var23).a() != si.a) {
               var1.a((acV)var23, (sD)var24.a(b, var11), 3);
            }
         }
      }

   }

   private void a(aej var1, acV var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (var4 && !var6) {
         var1.a((Rn)null, var2, RW.ia, acI.BLOCKS, 0.4F, 0.6F);
      } else if (!var4 && var6) {
         var1.a((Rn)null, var2, RW.hZ, acI.BLOCKS, 0.4F, 0.5F);
      } else if (var3 && !var5) {
         var1.a((Rn)null, var2, RW.hY, acI.BLOCKS, 0.4F, 0.7F);
      } else if (!var3 && var5) {
         var1.a((Rn)null, var2, RW.ib, acI.BLOCKS, 0.4F, 1.2F / (var1.a.nextFloat() * 0.2F + 0.9F));
      }

   }

   public int a(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      return (Boolean)var1.a((so)a) ? 15 : 0;
   }

   public int b(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      if (!(Boolean)var1.a((so)a)) {
         return 0;
      } else {
         return var1.a((so)a) == var6 ? 15 : 0;
      }
   }

   public boolean l(sD var1) {
      return true;
   }

   public abu a() {
      return abu.CUTOUT_MIPPED;
   }

   public sD a(int var1) {
      return this.a().a(a, abP.b(var1 & 3)).a(a, (var1 & 8) > 0).a(b, (var1 & 4) > 0);
   }

   public int c(sD var1) {
      byte var2 = 0;
      int var3 = var2 | ((abP)var1.a((so)a)).getHorizontalIndex();
      if ((Boolean)var1.a((so)a)) {
         var3 |= 8;
      }

      if ((Boolean)var1.a((so)b)) {
         var3 |= 4;
      }

      return var3;
   }

   public sD a(sD var1, acE var2) {
      return var1.a(a, var2.a((abP)var1.a((so)a)));
   }

   public sD a(sD var1, act var2) {
      return var1.a((acE)var2.a((abP)var1.a((so)a)));
   }

   public sy a() {
      return new sy(this, new so[]{a, a, b});
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return su.UNDEFINED;
   }

   static {
      a = oV.a;
      a = sp.a("powered");
      b = sp.a("attached");
      d = (new acU(0.3125D, 0.0D, 0.625D, 0.6875D, 0.625D, 1.0D)).a();
      e = (new acU(0.3125D, 0.0D, 0.0D, 0.6875D, 0.625D, 0.375D)).a();
      f = (new acU(0.625D, 0.0D, 0.3125D, 1.0D, 0.625D, 0.6875D)).a();
      g = (new acU(0.0D, 0.0D, 0.3125D, 0.375D, 0.625D, 0.6875D)).a();
   }
}
