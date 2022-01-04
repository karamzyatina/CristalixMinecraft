class EJ implements EN {
   // $FF: synthetic field
   final Ey a;

   EJ(Ey var1) {
      this.a = var1;
   }

   public int a(sD var1, aec var2, acV var3, int var4) {
      pQ var5 = (pQ)var1.a((so)pC.a);
      if (var5 == pQ.SPRUCE) {
         return adU.a();
      } else if (var5 == pQ.BIRCH) {
         return adU.b();
      } else {
         return var2 != null && var3 != null ? aez.b(var2, var3) : adU.c();
      }
   }
}
