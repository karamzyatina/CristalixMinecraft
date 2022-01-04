// $FF: synthetic class
class abj {
   // $FF: synthetic field
   static final int[] a;
   // $FF: synthetic field
   static final int[] b = new int[abP.values().length];

   static {
      try {
         b[abP.WEST.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         b[abP.EAST.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         b[abP.DOWN.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      try {
         b[abP.UP.ordinal()] = 4;
      } catch (NoSuchFieldError var6) {
      }

      try {
         b[abP.NORTH.ordinal()] = 5;
      } catch (NoSuchFieldError var5) {
      }

      try {
         b[abP.SOUTH.ordinal()] = 6;
      } catch (NoSuchFieldError var4) {
      }

      a = new int[abR.values().length];

      try {
         a[abR.X.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[abR.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[abR.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
