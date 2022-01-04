import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.net.Proxy;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public final class aca {
   private static final Logger a;

   public static ListenableFuture<Object> a(File var0, String var1, Map<String, String> var2, int var3, ace var4, Proxy var5) {
      ListenableFuture var6 = La.a((Runnable)(new acb(var4, var1, var5, var2, var0, var3)));
      return var6;
   }

   // $FF: synthetic method
   static Logger a() {
      return a;
   }

   static {
      a = sE.a;
   }
}
