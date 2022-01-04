public final class agq {
   private static boolean a = false;
   private static long a = -1L;
   private static int a = 0;
   private static int b = 0;
   private static boolean b = false;
   private static boolean c = false;

   public static void a() {
      a = true;
      long var0 = System.currentTimeMillis();
      if (a < 0L) {
         a = var0;
      }

      if (var0 > a + 3000L) {
         if (b > 0) {
            afT.c("Suppressed " + a + " OpenGL errors");
         }

         b = a > 10;
         a = var0;
         a = 0;
         b = 0;
         c = true;
      }

   }

   public static boolean a() {
      if (!a) {
         return true;
      } else {
         ++a;
         if (c) {
            c = false;
            return true;
         } else {
            if (b) {
               ++b;
            }

            return !b;
         }
      }
   }
}
