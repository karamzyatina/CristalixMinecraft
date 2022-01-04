// $FF: synthetic class
class CX {
   // $FF: synthetic field
   static final int[] a = new int[CZ.values().length];

   static {
      try {
         a[CZ.THIRD_PERSON_LEFT_HAND.ordinal()] = 1;
      } catch (NoSuchFieldError var8) {
      }

      try {
         a[CZ.THIRD_PERSON_RIGHT_HAND.ordinal()] = 2;
      } catch (NoSuchFieldError var7) {
      }

      try {
         a[CZ.FIRST_PERSON_LEFT_HAND.ordinal()] = 3;
      } catch (NoSuchFieldError var6) {
      }

      try {
         a[CZ.FIRST_PERSON_RIGHT_HAND.ordinal()] = 4;
      } catch (NoSuchFieldError var5) {
      }

      try {
         a[CZ.HEAD.ordinal()] = 5;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[CZ.GUI.ordinal()] = 6;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[CZ.GROUND.ordinal()] = 7;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[CZ.FIXED.ordinal()] = 8;
      } catch (NoSuchFieldError var1) {
      }

   }
}
