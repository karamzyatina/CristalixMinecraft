import java.util.Map;

public final class IK {
   private static IT a;

   static void a(IT var0) {
      a = var0;
   }

   public static String a(String var0, Object... var1) {
      return a.formatMessage(var0, var1);
   }

   public static boolean a(String var0) {
      return a.hasKey(var0);
   }

   public static Map a() {
      return a.a;
   }
}
