import org.apache.logging.log4j.Logger;

public final class akt {
   private static final Logger a;

   public static void a(String var0) {
      a.error("[Shaders] " + var0);
   }

   public static void b(String var0) {
      a.warn("[Shaders] " + var0);
   }

   public static void c(String var0) {
      a.info("[Shaders] " + var0);
   }

   public static void a(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      a.warn("[Shaders] " + var2);
   }

   public static void b(String var0, Object... var1) {
      String var2 = String.format(var0, var1);
      a.info("[Shaders] " + var2);
   }

   static {
      a = sE.a;
   }
}
