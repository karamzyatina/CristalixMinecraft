public final class MQ {
   public static final int[] a = a();

   private MQ() {
   }

   private static int[] a() {
      int[] var0 = new int[32];

      for(int var1 = 0; var1 < 32; ++var1) {
         int var2 = (var1 >> 3 & 1) * 85;
         int var3 = (var1 >> 2 & 1) * 170 + var2;
         int var4 = (var1 >> 1 & 1) * 170 + var2;
         int var5 = (var1 >> 0 & 1) * 170 + var2;
         if (var1 == 6) {
            var3 += 85;
         }

         if (var1 >= 16) {
            var3 /= 4;
            var4 /= 4;
            var5 /= 4;
         }

         var0[var1] = (var3 & 255) << 16 | (var4 & 255) << 8 | var5 & 255;
      }

      return var0;
   }
}
