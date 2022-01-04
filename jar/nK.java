public final class nk extends oV implements se {
   public static final sr<nl> a;
   public static final sp a;
   protected static final acU d;

   public nk() {
      super(si.n);
      this.a(this.a.a().a(a, nl.FOOT).a(a, Boolean.FALSE));
      this.f = true;
   }

   public sh a(sD var1, aec var2, int var3, int var4, int var5) {
      if (var1.a((so)a) == nl.FOOT) {
         aaD var6 = var2.a(var3, var4, var5);
         if (var6 instanceof aaK) {
            SW var7 = ((aaK)var6).a();
            return sh.a(var7);
         }
      }

      return sh.d;
   }

   public sh a(sD var1, aec var2, acV var3) {
      if (var1.a((so)a) == nl.FOOT) {
         aaD var4 = var2.a(var3);
         if (var4 instanceof aaK) {
            SW var5 = ((aaK)var4).a();
            return sh.a(var5);
         }
      }

      return sh.d;
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      return true;
   }

   public boolean h(sD var1) {
      return false;
   }

   public boolean j(sD var1) {
      return false;
   }

   public void a(aej var1, int var2, int var3, int var4, NN var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6 * 0.5F);
   }

   public void a(aej var1, NN var2) {
      if (var2.isSneaking()) {
         super.a(var1, var2);
      } else if (var2.b.a() < 0.0D) {
         var2.b.a(-var2.b.a() * iM.a(iM.a(-9046147683276855771L) ^ iM.a(iM.a(4787117341252032986L) ^ -1L)));
         if (!(var2 instanceof Oh)) {
            var2.b.a(var2.b.a() * iM.a(iM.a(-7248527360794456730L) ^ iM.a(iM.a(6592821955639110403L) ^ -1L)));
         }
      }

   }

   public acU a(sD var1, aec var2, int var3, int var4, int var5) {
      return d;
   }

   public boolean i(sD var1) {
      return true;
   }

   public static acV a(aej var0, acV var1, int var2) {
      int var3 = var1.a;
      int var4 = var1.b;
      int var5 = var1.c;
      abP var6 = (abP)var0.a(var3, var4, var5).a((so)a);

      for(int var7 = 0; var7 <= 1; ++var7) {
         int var8 = var3 - var6.getXOffset() * var7 - 1;
         int var9 = var5 - var6.getZOffset() * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               if (b(var0, var12, var4, var13)) {
                  if (var2 <= 0) {
                     return new acV(var12, var4, var13);
                  }

                  --var2;
               }
            }
         }
      }

      return null;
   }

   protected static boolean b(aej var0, int var1, int var2, int var3) {
      return var0.a(var1, var2 - 1, var3).isTopSolid() && !var0.a(var1, var2, var3).a().isSolid() && !var0.a(var1, var2 + 1, var3).a().isSolid();
   }

   protected static boolean b(aej var0, acV var1) {
      return var0.a(var1.b()).isTopSolid() && !var0.a(var1).a().isSolid() && !var0.a(var1.a()).a().isSolid();
   }

   public sg a(sD var1) {
      return sg.DESTROY;
   }

   public abu a() {
      return abu.CUTOUT;
   }

   public abO a(sD var1) {
      return abO.ENTITYBLOCK_ANIMATED;
   }

   public Vh a(aej var1, int var2, int var3, int var4, sD var5) {
      if (var5.a((so)a) == nl.FOOT) {
         abP var6 = (abP)var5.a((so)a);
         var2 += var6.getXOffset();
         var3 += var6.getYOffset();
         var4 += var6.getZOffset();
      }

      aaD var8 = var1.a(var2, var3, var4);
      SW var7 = var8 instanceof aaK ? ((aaK)var8).a() : SW.RED;
      return new Vh(RT.aM, 1, var7.a());
   }

   public void a(aej var1, acV var2, sD var3, Rn var4) {
      if (var4.a.d && var3.a((so)a) == nl.FOOT) {
         acV var5 = var2.a((abP)var3.a((so)a));
         if (var1.a(var5).a() == this) {
            var1.c(var5);
         }
      }

   }

   public sD a(int var1) {
      abP var2 = abP.b(var1);
      return (var1 & 8) > 0 ? this.a().a(a, nl.HEAD).a(a, var2).a(a, (var1 & 4) > 0) : this.a().a(a, nl.FOOT).a(a, var2);
   }

   public sD a(sD var1, aec var2, int var3, int var4, int var5) {
      if (var1.a((so)a) == nl.FOOT) {
         abP var6 = (abP)var1.a((so)a);
         sD var7 = var2.a(var3 + var6.getXOffset(), var4 + var6.getYOffset(), var5 + var6.getZOffset());
         if (var7.a() == this) {
            var1 = var1.a(a, var7.a((so)a));
         }
      }

      return var1;
   }

   public sD a(sD var1, acE var2) {
      return var1.a(a, var2.a((abP)var1.a((so)a)));
   }

   public sD a(sD var1, act var2) {
      return var1.a((acE)var2.a((abP)var1.a((so)a)));
   }

   public int c(sD var1) {
      byte var2 = 0;
      int var3 = var2 | ((abP)var1.a((so)a)).getHorizontalIndex();
      if (var1.a((so)a) == nl.HEAD) {
         var3 |= 8;
         if ((Boolean)var1.a((so)a)) {
            var3 |= 4;
         }
      }

      return var3;
   }

   public su a(aec var1, sD var2, int var3, int var4, int var5, abP var6) {
      return su.UNDEFINED;
   }

   public sy a() {
      return new sy(this, new so[]{a, a, a});
   }

   public aaD a(aej var1, int var2) {
      return new aaK();
   }

   public static boolean a(int var0) {
      return (var0 & 8) != 0;
   }

   static {
      a = sr.a("part", nl.class, (Enum[])nl.VALUES);
      a = sp.a("occupied");
      d = (new acU(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D)).a();
   }
}
