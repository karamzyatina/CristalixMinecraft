// $FF: synthetic class
class acY {
   // $FF: synthetic field
   static final int[] a = new int[acE.values().length];

   static {
      try {
         a[acE.CLOCKWISE_90.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[acE.CLOCKWISE_180.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[acE.COUNTERCLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
