import java.util.List;

public final class KS {
   private KS() {
   }

   public static int a(sD var0, aec var1, int var2, int var3, int var4) {
      int var5 = var1.getCombinedLight(var2, var3, var4, var0.getLightValue());
      if (var5 == 0 && var0.a() instanceof re) {
         --var3;
         var0 = var1.a(var2, var3, var4);
         return var1.getCombinedLight(var2, var3, var4, var0.getLightValue());
      } else {
         return var5;
      }
   }

   public static boolean a(sD var0, aec var1, int var2, int var3, int var4, abP var5) {
      // $FF: Couldn't be decompiled
   }

   public static void a(sD var0, aej var1, int var2, int var3, int var4, acU var5, List<acU> var6) {
      mY.a(var2, var3, var4, var5, var6, var0.a(var1, var2, var3, var4));
   }

   public static float a(sD var0, Rn var1, aej var2, int var3, int var4, int var5) {
      float var6 = var0.a(var2, var3, var4, var5);
      if (var6 < 0.0F) {
         return 0.0F;
      } else {
         return !var1.a(var0) ? var1.a(var0) / var6 / iM.a(iM.a(1122205648) ^ iM.a(~iM.a(-2850769))) : var1.a(var0) / var6 / iM.a(iM.a(-61685857) ^ iM.a(~iM.a(1113407584)));
      }
   }

   public static adi a(int var0, int var1, int var2, adm var3, adm var4, acU var5) {
      adm var6 = var3.c((double)var0, (double)var1, (double)var2);
      adm var7 = var4.c((double)var0, (double)var1, (double)var2);
      adi var8 = var5.a(var6, var7);
      return var8 == null ? null : new adi(var8.a.e((double)var0, (double)var1, (double)var2), var8.a, new acV(var0, var1, var2));
   }

   public static adi a(sD var0, aej var1, int var2, int var3, int var4, adm var5, adm var6) {
      return a(var2, var3, var4, var5, var6, var0.b(var1, var2, var3, var4));
   }

   public static boolean a(aej var0, int var1, int var2, int var3) {
      return var0.a(var1, var2, var3).a().isReplaceable();
   }

   public static float a(sD var0) {
      return var0.isBlockNormalCube() ? 0.2F : 1.0F;
   }

   public static Vh a(nh var0, sD var1) {
      return new Vh(SZ.a(var0), 1, var0.d(var1));
   }

   public static boolean a(sD var0) {
      return var0.a().blocksMovement() && var0.isFullCube();
   }
}
