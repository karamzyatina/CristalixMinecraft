class EH implements EN {
   // $FF: synthetic field
   final Ey a;

   EH(Ey var1) {
      this.a = var1;
   }

   public int a(sD var1, aec var2, acV var3, int var4) {
      if (var2 != null && var3 != null) {
         aaD var5 = var2.a(var3);
         if (var5 instanceof aaZ) {
            SZ var6 = ((aaZ)var5).a();
            nh var7 = mY.a(var6);
            sD var8 = var7.a();
            if (var7 == var1.a()) {
               ((aaZ)var5).a(Vh.a);
               sE.a.warn("Detected invalid tile entity at {}", var3);
            }

            return this.a.a(var8, var2, var3, var4);
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }
}
