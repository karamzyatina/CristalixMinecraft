// $FF: synthetic class
class aiI {
   // $FF: synthetic field
   static final int[] a;
   // $FF: synthetic field
   static final int[] b = new int[ajb.values().length];

   static {
      try {
         b[ajb.NUMBER.ordinal()] = 1;
      } catch (NoSuchFieldError var7) {
      }

      try {
         b[ajb.IDENTIFIER.ordinal()] = 2;
      } catch (NoSuchFieldError var6) {
      }

      try {
         b[ajb.BRACKET_OPEN.ordinal()] = 3;
      } catch (NoSuchFieldError var5) {
      }

      try {
         b[ajb.OPERATOR.ordinal()] = 4;
      } catch (NoSuchFieldError var4) {
      }

      a = new int[aiN.values().length];

      try {
         a[aiN.PLUS.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[aiN.MINUS.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[aiN.NOT.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
