// $FF: synthetic class
class abq {
   // $FF: synthetic field
   static final int[] a = new int[abr.values().length];

   static {
      try {
         a[abr.SAVE.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[abr.LOAD.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[abr.CORNER.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[abr.DATA.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
      }

   }
}
