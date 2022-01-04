public final class UR extends Us {
   private final nh a;
   private final nh b;

   public UR(int var1, float var2, nh var3, nh var4) {
      super(var1, var2, false);
      this.a = var3;
      this.b = var4;
   }

   public abN a(Rn var1, aej var2, acV var3, abU var4, abP var5, float var6, float var7, float var8) {
      Vh var9 = var1.a((abU)var4);
      if (var5 == abP.UP && var1.a(var3.a(var5), var5, var9) && var2.a(var3).a() == this.b && var2.a(var3.a())) {
         var2.a((acV)var3.a(), (sD)this.a.a(), 11);
         var9.shrink(1);
         return abN.SUCCESS;
      } else {
         return abN.FAIL;
      }
   }
}
