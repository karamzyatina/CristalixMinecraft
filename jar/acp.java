import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.apache.logging.log4j.Logger;

public final class acP {
   private static final acQ a = b();

   private static acQ b() {
      String var0 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if (var0.contains("win")) {
         return acQ.WINDOWS;
      } else if (var0.contains("mac")) {
         return acQ.OSX;
      } else if (var0.contains("linux")) {
         return acQ.LINUX;
      } else {
         return var0.contains("unix") ? acQ.LINUX : acQ.UNKNOWN;
      }
   }

   public static acQ a() {
      return a;
   }

   public static void a(FutureTask<?> var0, Logger var1) {
      try {
         var0.run();
         var0.get();
      } catch (ExecutionException var3) {
         var1.fatal("Error executing task", var3);
         if (var3.getCause() instanceof OutOfMemoryError) {
            throw (OutOfMemoryError)var3.getCause();
         }
      } catch (InterruptedException var4) {
         var1.fatal("Error executing task", var4);
      }

   }

   public static <T> T a(List<T> var0) {
      return var0.get(var0.size() - 1);
   }
}
