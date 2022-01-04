public enum Ql {
   NONE(0, 0.0D, 0.0D, 0.0D),
   SUMMON_VEX(1, 0.7D, 0.7D, 0.8D),
   FANGS(2, 0.4D, 0.3D, 0.35D),
   WOLOLO(3, 0.7D, 0.5D, 0.2D),
   DISAPPEAR(4, 0.3D, 0.3D, 0.8D),
   BLINDNESS(5, 0.1D, 0.1D, 0.2D);

   public static final Ql[] VALUES = values();
   private final int id;
   private final double[] particleSpeed;

   private Ql(int var3, double var4, double var6, double var8) {
      this.id = var3;
      this.particleSpeed = new double[]{var4, var6, var8};
   }

   public static Ql a(int var0) {
      Ql[] var1 = VALUES;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Ql var4 = var1[var3];
         if (var0 == var4.id) {
            return var4;
         }
      }

      return NONE;
   }

   // $FF: synthetic method
   static int a(Ql var0) {
      return var0.id;
   }

   // $FF: synthetic method
   static double[] a(Ql var0) {
      return var0.particleSpeed;
   }
}
