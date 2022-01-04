// $FF: synthetic class
class pI {
   // $FF: synthetic field
   static final int[] a;
   // $FF: synthetic field
   static final int[] b = new int[act.values().length];

   static {
      try {
         b[act.LEFT_RIGHT.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         b[act.FRONT_BACK.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      a = new int[acE.values().length];

      try {
         a[acE.CLOCKWISE_180.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[acE.COUNTERCLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[acE.CLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
