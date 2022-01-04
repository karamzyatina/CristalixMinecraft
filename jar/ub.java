public final class UB extends TW {
   public UB(mY var1) {
      super(var1, false);
   }

   public abs<Vh> a(aej var1, Rn var2, abU var3) {
      Vh var4 = var2.a((abU)var3);
      adi var5 = a(var1, var2, true);
      if (var5 == null) {
         return new abs(abN.PASS, var4);
      } else {
         if (var5.a == adj.BLOCK) {
            acV var6 = var5.a();
            if (!var2.a(var6.a(var5.a), var5.a, var4)) {
               return new abs(abN.FAIL, var4);
            }

            acV var7 = var6.a();
            sD var8 = var1.a(var6);
            if (var8.a() == si.h && (Integer)var8.a((so)pj.a) == 0 && var1.a(var7)) {
               var1.a((acV)var7, (sD)RQ.aK.a(), 11);
               if (!var2.a.d) {
                  var4.shrink(1);
               }

               var1.a(var2, var6, RW.it, acI.BLOCKS, 1.0F, 1.0F);
               return new abs(abN.SUCCESS, var4);
            }
         }

         return new abs(abN.FAIL, var4);
      }
   }
}
