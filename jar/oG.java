// $FF: synthetic class
class Og {
   // $FF: synthetic field
   static final int[] a;
   // $FF: synthetic field
   static final int[] b = new int[SB.values().length];

   static {
      try {
         b[SB.HEAD.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         b[SB.CHEST.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         b[SB.LEGS.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         b[SB.FEET.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      a = new int[SC.values().length];

      try {
         a[SC.HAND.ordinal()] = 1;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[SC.ARMOR.ordinal()] = 2;
      } catch (NoSuchFieldError var1) {
      }

   }
}
