// $FF: synthetic class
class acF {
   // $FF: synthetic field
   static final int[] a = new int[acE.values().length];

   static {
      try {
         a[acE.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[acE.CLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[acE.CLOCKWISE_180.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[acE.COUNTERCLOCKWISE_90.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }

   }
}
