// $FF: synthetic class
class Bc {
   // $FF: synthetic field
   static final int[] a = new int[qg.values().length];

   static {
      try {
         a[qg.DEFAULT.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         a[qg.CHISELED.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[qg.LINES_Y.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[qg.LINES_X.ordinal()] = 4;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[qg.LINES_Z.ordinal()] = 5;
      } catch (NoSuchFieldError var1) {
      }

   }
}
