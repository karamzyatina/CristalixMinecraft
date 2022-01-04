// $FF: synthetic class
class aly {
   // $FF: synthetic field
   static final int[] a = new int[alx.values().length];

   static {
      try {
         a[alx.BIOME.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[alx.TEMPERATURE.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[alx.RAINFALL.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
