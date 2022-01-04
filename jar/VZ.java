// $FF: synthetic class
class vZ {
   // $FF: synthetic field
   static final int[] a;
   // $FF: synthetic field
   static final int[] b;
   // $FF: synthetic field
   static final int[] c = new int[abr.values().length];

   static {
      try {
         c[abr.SAVE.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         c[abr.LOAD.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         c[abr.CORNER.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         c[abr.DATA.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      b = new int[acE.values().length];

      try {
         b[acE.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         b[acE.CLOCKWISE_180.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         b[acE.COUNTERCLOCKWISE_90.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         b[acE.CLOCKWISE_90.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      a = new int[act.values().length];

      try {
         a[act.NONE.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[act.LEFT_RIGHT.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[act.FRONT_BACK.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
