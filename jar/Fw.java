// $FF: synthetic class
class FW {
   // $FF: synthetic field
   static final int[] a = new int[aar.values().length];

   static {
      try {
         a[aar.NEVER.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[aar.HIDE_FOR_OTHER_TEAMS.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[aar.HIDE_FOR_OWN_TEAM.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
