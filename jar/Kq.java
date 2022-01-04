public final class KQ {
   private static final Thread a = Thread.currentThread();

   private KQ() {
   }

   public static void a(String var0) {
      if (a != Thread.currentThread()) {
         throw new IllegalStateException("Asynchronous " + var0 + '!');
      }
   }

   public static void a() {
   }
}
