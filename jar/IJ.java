// $FF: synthetic class
class Ij {
   // $FF: synthetic field
   static final int[] a = new int[abP.values().length];

   static {
      try {
         a[abP.NORTH.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[abP.SOUTH.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[abP.WEST.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[abP.EAST.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }

   }
}
