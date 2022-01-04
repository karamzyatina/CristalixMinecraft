// $FF: synthetic class
class alM {
   // $FF: synthetic field
   static final int[] a = new int[alL.values().length];

   static {
      try {
         a[alL.BOOL.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         a[alL.INT.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         a[alL.FLOAT.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[alL.VEC2.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[alL.VEC3.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[alL.VEC4.ordinal()] = 6;
      } catch (NoSuchFieldError var1) {
      }

   }
}
