// $FF: synthetic class
class Sy {
   // $FF: synthetic field
   static final int[] a = new int[MU.values().length];

   static {
      try {
         a[MU.COMMON.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[MU.UNCOMMON.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[MU.RARE.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[MU.VERY_RARE.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }

   }
}
