public final class RE extends RB {
   public int i = 1;

   public RE(aej var1) {
      super(var1);
   }

   public RE(aej var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   public RE(aej var1, Oh var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
   }

   protected void a(adi var1) {
   }

   public void b(VR var1) {
      super.b(var1);
      if (var1.a("ExplosionPower", (int)99)) {
         this.i = var1.getInteger("ExplosionPower");
      }

   }

   public void a(int var1) {
      this.i = var1;
   }
}
