public final class TZ extends SZ {
   private final mY a;

   public TZ(mY var1) {
      this.a = var1;
      this.a(KC.c);
   }

   public abN a(Rn var1, aej var2, acV var3, abU var4, abP var5, float var6, float var7, float var8) {
      if (var5 != abP.UP) {
         return abN.FAIL;
      } else {
         sD var9 = var2.a(var3);
         nh var10 = var9.a();
         if (!var10.a((aec)var2, (acV)var3)) {
            var3 = var3.a(var5);
         }

         Vh var11 = var1.a((abU)var4);
         if (var1.a(var3, var5, var11) && this.a.a(var2, var3)) {
            abP var12 = abP.a((double)var1.j);
            int var13 = var12.getXOffset();
            int var14 = var12.getZOffset();
            boolean var15 = var13 < 0 && var8 < 0.5F || var13 > 0 && var8 > 0.5F || var14 < 0 && var6 > 0.5F || var14 > 0 && var6 < 0.5F;
            a(var2, var3, var12, this.a, var15);
            sf var16 = this.a.a();
            var2.a(var1, var3, var16.c(), acI.BLOCKS, (var16.getVolume() + 1.0F) / 2.0F, var16.getPitch() * 0.8F);
            var11.shrink(1);
            return abN.SUCCESS;
         } else {
            return abN.FAIL;
         }
      }
   }

   public static void a(aej var0, acV var1, abP var2, nh var3, boolean var4) {
      acV var5 = var1.a(var2.b());
      acV var6 = var1.a(var2.e());
      int var7 = (var0.a(var6).isNormalCube() ? 1 : 0) + (var0.a(var6.a()).isNormalCube() ? 1 : 0);
      int var8 = (var0.a(var5).isNormalCube() ? 1 : 0) + (var0.a(var5.a()).isNormalCube() ? 1 : 0);
      boolean var9 = var0.a(var6).a() == var3 || var0.a(var6.a()).a() == var3;
      boolean var10 = var0.a(var5).a() == var3 || var0.a(var5.a()).a() == var3;
      if ((!var9 || var10) && var8 <= var7) {
         if (var10 && !var9 || var8 < var7) {
            var4 = false;
         }
      } else {
         var4 = true;
      }

      acV var11 = var1.a();
      boolean var12 = var0.h(var1) || var0.h(var11);
      sD var13 = var3.a().a(nU.a, var2).a(nU.a, var4 ? nX.RIGHT : nX.LEFT).a(nU.b, var12).a(nU.a, var12);
      var0.a((acV)var1, (sD)var13.a(nU.b, nW.LOWER), 2);
      var0.a((acV)var11, (sD)var13.a(nU.b, nW.UPPER), 2);
   }
}
