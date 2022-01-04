import dev.xdark.feder.RecyclableArrayList;

public final class nB extends nM {
   public static final sq a;
   protected static final acU d;
   protected static final acU e;
   protected static final acU f;
   protected static final acU g;
   protected static final acU h;
   public final nC a;

   public nB(nC var1) {
      super(si.d);
      this.a(this.a.a().a(a, abP.NORTH));
      this.a = var1;
      this.a(var1 == nC.TRAP ? KC.c : KC.b);
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean i(sD var1) {
      return true;
   }

   public abO a(sD var1) {
      return abO.ENTITYBLOCK_ANIMATED;
   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      if (var2.a(var3, var4, var5 - 1).a() == this) {
         return d;
      } else if (var2.a(var3, var4, var5 + 1).a() == this) {
         return e;
      } else if (var2.a(var3 - 1, var4, var5).a() == this) {
         return f;
      } else {
         return var2.a(var3 + 1, var4, var5).a() == this ? g : h;
      }
   }

   public sD a(aej var1, int var2, int var3, int var4, abP var5, float var6, float var7, float var8, int var9, Oh var10) {
      return this.a().a(a, var10.b());
   }

   public void a(aej var1, acV var2, sD var3, Oh var4, Vh var5) {
      abP var6 = abP.b(adh.b((double)(var4.j * 4.0F / 360.0F) + 0.5D) & 3).a();
      var3 = var3.a(a, var6);
      acV var7 = var2.c();
      acV var8 = var2.d();
      acV var9 = var2.e();
      acV var10 = var2.f();
      boolean var11 = this == var1.a(var7).a();
      boolean var12 = this == var1.a(var8).a();
      boolean var13 = this == var1.a(var9).a();
      boolean var14 = this == var1.a(var10).a();
      if (!var11 && !var12 && !var13 && !var14) {
         var1.a((acV)var2, (sD)var3, 3);
      } else if (var6.a() == abR.X && (var11 || var12)) {
         if (var11) {
            var1.a((acV)var7, (sD)var3, 3);
         } else {
            var1.a((acV)var8, (sD)var3, 3);
         }

         var1.a((acV)var2, (sD)var3, 3);
      } else if (var6.a() == abR.Z && (var13 || var14)) {
         if (var13) {
            var1.a((acV)var9, (sD)var3, 3);
         } else {
            var1.a((acV)var10, (sD)var3, 3);
         }

         var1.a((acV)var2, (sD)var3, 3);
      }

      if (var5.hasDisplayName()) {
         aaD var15 = var1.a(var2);
         if (var15 instanceof aaM) {
            ((aaM)var15).a((String)var5.getDisplayName());
         }
      }

   }

   public boolean a(aej var1, int var2, int var3, int var4) {
      int var5 = 0;
      if (var1.a(var2 - 1, var3, var4).a() == this) {
         if (this.c(var1, var2 - 1, var3, var4)) {
            return false;
         }

         ++var5;
      }

      if (var1.a(var2 + 1, var3, var4).a() == this) {
         if (this.c(var1, var2 + 1, var3, var4)) {
            return false;
         }

         ++var5;
      }

      if (var1.a(var2, var3, var4 - 1).a() == this) {
         if (this.c(var1, var2, var3, var4 - 1)) {
            return false;
         }

         ++var5;
      }

      if (var1.a(var2, var3, var4 + 1).a() == this) {
         if (this.c(var1, var2, var3, var4 + 1)) {
            return false;
         }

         ++var5;
      }

      return var5 <= 1;
   }

   private boolean c(aej var1, int var2, int var3, int var4) {
      if (var1.a(var2, var3, var4).a() == this) {
         abP[] var5 = abT.HORIZONTAL.a();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            abP var8 = var5[var7];
            if (var1.a(var2 + var8.getXOffset(), var3 + var8.getYOffset(), var4 + var8.getZOffset()).a() == this) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean c(aej var1, acV var2) {
      return this.c(var1, var2.a, var2.b, var2.c);
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      return true;
   }

   public aee a(aej var1, int var2, int var3, int var4) {
      return this.a(var1, var2, var3, var4, false);
   }

   public aee a(aej var1, acV var2) {
      return this.a(var1, var2, false);
   }

   public aee a(aej var1, int var2, int var3, int var4, boolean var5) {
      aaD var6 = var1.a(var2, var3, var4);
      if (!(var6 instanceof aaM)) {
         return null;
      } else {
         Object var7 = (aaM)var6;
         if (!var5 && this.d(var1, var2, var3, var4)) {
            return null;
         } else {
            abP[] var8 = abT.HORIZONTAL.a();
            int var9 = var8.length;

            for(int var10 = 0; var10 < var9; ++var10) {
               abP var11 = var8[var10];
               int var12 = var2 + var11.getXOffset();
               int var13 = var3 + var11.getYOffset();
               int var14 = var4 + var11.getZOffset();
               nh var15 = var1.a(var12, var13, var14).a();
               if (var15 == this) {
                  if (this.d(var1, var12, var13, var14)) {
                     return null;
                  }

                  aaD var16 = var1.a(var12, var13, var14);
                  if (var16 instanceof aaM) {
                     if (var11 != abP.WEST && var11 != abP.NORTH) {
                        var7 = new SM("container.chestDouble", (aee)var7, (aaM)var16);
                     } else {
                        var7 = new SM("container.chestDouble", (aaM)var16, (aee)var7);
                     }
                  }
               }
            }

            return (aee)var7;
         }
      }
   }

   public aee a(aej var1, acV var2, boolean var3) {
      return this.a(var1, var2.a, var2.b, var2.c, var3);
   }

   public aaD a(aej var1, int var2) {
      return new aaM();
   }

   public boolean l(sD var1) {
      return this.a == nC.TRAP;
   }

   public int a(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      if (!var1.canProvidePower()) {
         return 0;
      } else {
         int var7 = 0;
         aaD var8 = var2.a(var3, var4, var5);
         if (var8 instanceof aaM) {
            var7 = ((aaM)var8).d;
         }

         return adh.a(var7, 0, 15);
      }
   }

   public int b(sD var1, aec var2, int var3, int var4, int var5, abP var6) {
      return var6 == abP.UP ? var1.a(var2, var3, var4, var5, var6) : 0;
   }

   private boolean d(aej var1, int var2, int var3, int var4) {
      return e(var1, var2, var3, var4) || f(var1, var2, var3, var4);
   }

   private boolean d(aej var1, acV var2) {
      return e(var1, var2) || f(var1, var2);
   }

   private static boolean e(aej var0, int var1, int var2, int var3) {
      return var0.a(var1, var2 + 1, var3).isNormalCube();
   }

   private static boolean e(aej var0, acV var1) {
      return var0.a(var1.a()).isNormalCube();
   }

   private static boolean f(aej var0, int var1, int var2, int var3) {
      RecyclableArrayList var4 = var0.a(QN.class, new acU((double)var1, (double)(var2 + 1), (double)var3, (double)(var1 + 1), (double)(var2 + 2), (double)(var3 + 1)));
      int var5 = 0;

      for(int var6 = var4.size(); var5 < var6; ++var5) {
         QN var7 = (QN)var4.get(var5);
         if (var7.B()) {
            var4.recycle();
            return true;
         }
      }

      var4.recycle();
      return false;
   }

   private static boolean f(aej var0, acV var1) {
      return f(var0, var1.a, var1.b, var1.c);
   }

   public boolean k(sD var1) {
      return true;
   }

   public int a(sD var1, aej var2, int var3, int var4, int var5) {
      return RY.a((SE)this.a(var2, var3, var4, var5));
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
      d = (new acU(0.0625D, 0.0D, 0.0D, 0.9375D, 0.875D, 0.9375D)).a();
      e = (new acU(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.875D, 1.0D)).a();
      f = (new acU(0.0D, 0.0D, 0.0625D, 0.9375D, 0.875D, 0.9375D)).a();
      g = (new acU(0.0625D, 0.0D, 0.0625D, 1.0D, 0.875D, 0.9375D)).a();
      h = (new acU(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.875D, 0.9375D)).a();
   }
}
