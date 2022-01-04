public final class Id extends Ik {
   private final adm a = new adm(0.0D, 0.0D, 0.0D);

   public Id(sE var1) {
      super(var1);
   }

   public void a(abh var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      acV var11 = var1.a();
      sD var12 = var1.a();
      nh var13 = var12.a();
      if (var12.a() != si.a && var1.a(var8) < 1.0F) {
         Cw var14 = this.a.a;
         Bh var15 = var14.a();
         this.a(HO.a);
         Co.a();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA);
         By.l();
         By.q();
         if (sE.c()) {
            By.j(7425);
         } else {
            By.j(7424);
         }

         var15.a(7, In.a);
         var15.setTranslation(var2 - (double)var11.a + (double)var1.b(var8), var4 - (double)var11.b + (double)var1.c(var8), var6 - (double)var11.c + (double)var1.d(var8));
         aej var16 = this.a();
         adm var17 = this.a;
         if (var13 == RQ.a && var1.a(var8) <= 0.25F) {
            var12 = var12.a(pL.a, Boolean.TRUE);
            this.a(var17, var11, var12, var15, var16, true);
         } else if (var1.d() && !var1.c()) {
            pN var18 = var13 == RQ.a ? pN.STICKY : pN.DEFAULT;
            sD var19 = RQ.a.a().a(pL.a, var18).a(pL.a, var12.a((so)pJ.a));
            var19 = var19.a(pL.a, var1.a(var8) >= 0.5F);
            this.a(var17, var11, var19, var15, var16, true);
            var15.setTranslation(var2 - (double)var11.a, var4 - (double)var11.b, var6 - (double)var11.c);
            var12 = var12.a(pJ.a, Boolean.TRUE);
            this.a(var17, var11, var12, var15, var16, true);
         } else {
            this.a(var17, var11, var12, var15, var16, false);
         }

         var15.setTranslation(0.0D, 0.0D, 0.0D);
         var14.draw();
         Co.b();
      }

   }

   private void a(adm var1, acV var2, sD var3, Bh var4, aej var5, boolean var6) {
      Bd var7 = this.a.a();
      var7.a().a(var1, var5, var7.a(var3), var3, var2, var4, var6);
   }
}
