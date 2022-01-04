// $FF: synthetic class
class pl {
   // $FF: synthetic field
   static final int[] a;
   // $FF: synthetic field
   static final int[] b;
   // $FF: synthetic field
   static final int[] c = new int[abR.values().length];

   static {
      try {
         c[abR.X.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         c[abR.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         c[abR.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      b = new int[acE.values().length];

      try {
         b[acE.COUNTERCLOCKWISE_90.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         b[acE.CLOCKWISE_90.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      a = new int[pm.values().length];

      try {
         a[pm.X.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[pm.Z.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }

   }
}
