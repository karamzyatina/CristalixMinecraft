public final class nj extends nM {
   public nj() {
      super(si.s, sh.F);
      this.b(3.0F);
      this.a(KC.e);
   }

   public aaD a(aej var1, int var2) {
      return new aaI();
   }

   public boolean a(aej var1, int var2, int var3, int var4, sD var5, Rn var6, abU var7, abP var8, float var9, float var10, float var11) {
      return true;
   }

   public boolean j(sD var1) {
      return false;
   }

   public boolean h(sD var1) {
      return false;
   }

   public abO a(sD var1) {
      return abO.MODEL;
   }

   public void a(aej var1, acV var2, sD var3, Oh var4, Vh var5) {
      super.a(var1, var2, var3, var4, var5);
      if (var5.hasDisplayName()) {
         aaD var6 = var1.a(var2);
         if (var6 instanceof aaI) {
            ((aaI)var6).a(var5.getDisplayName());
         }
      }

   }

   public abu a() {
      return abu.CUTOUT;
   }
}
