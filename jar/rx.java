public enum Rx {
   DISALLOWED,
   ALLOWED,
   CREATIVE_ONLY;

   public static Rx a(int var0) {
      if (var0 < 0 || var0 > values().length) {
         var0 = 0;
      }

      return values()[var0];
   }
}
