public final class amc {
   public static final float a = 3.1415927F;
   private static final float[] a = new float[65536];

   public static float a(float var0) {
      return a[(int)((double)(var0 + 1.0F) * 32767.5D) & '\uffff'];
   }

   public static float b(float var0) {
      return 1.5707964F - a[(int)((double)(var0 + 1.0F) * 32767.5D) & '\uffff'];
   }

   public static int a(int[] var0) {
      if (var0.length == 0) {
         return 0;
      } else {
         int var1 = b(var0);
         return var1 / var0.length;
      }
   }

   public static int b(int[] var0) {
      if (var0.length == 0) {
         return 0;
      } else {
         int var1 = 0;

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1 += var0[var2];
         }

         return var1;
      }
   }

   public static int a(int var0) {
      int var1 = adh.b(var0);
      return var0 == var1 ? var1 : var1 / 2;
   }

   public static float c(float var0) {
      return var0 * 180.0F / adh.a;
   }

   public static float d(float var0) {
      return var0 / 180.0F * adh.a;
   }

   public static float a(double var0) {
      return (float)((double)Math.round(var0 * 1.0E8D) / 1.0E8D);
   }

   static {
      int var0;
      for(var0 = 0; var0 < 65536; ++var0) {
         a[var0] = (float)Math.asin((double)var0 / 32767.5D - 1.0D);
      }

      for(var0 = -1; var0 < 2; ++var0) {
         a[(int)(((double)var0 + 1.0D) * 32767.5D) & '\uffff'] = (float)Math.asin((double)var0);
      }

   }
}
