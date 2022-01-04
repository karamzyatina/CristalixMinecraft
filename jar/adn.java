import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import dev.xdark.feder.IOUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class adN {
   public static final Pattern a;
   private static final Splitter a;
   private static final adN a;
   private final Map<String, String> a = new HashMap();
   private long a;

   public adN() {
      try {
         InputStream var1 = adN.class.getResourceAsStream("/assets/minecraft/lang/en_us.lang");
         Iterator var2 = IOUtil.readLines(var1, StandardCharsets.UTF_8).iterator();

         while(var2.hasNext()) {
            String var3 = (String)var2.next();
            if (!var3.isEmpty() && var3.charAt(0) != '#') {
               String[] var4 = (String[])((String[])Iterables.toArray(a.split(var3), String.class));
               if (var4 != null && var4.length == 2) {
                  String var5 = var4[0];
                  String var6 = a.matcher(var4[1]).replaceAll("%$1s");
                  this.a.put(var5, var6);
               }
            }
         }

         this.a = System.currentTimeMillis();
      } catch (IOException var7) {
      }

   }

   static adN a() {
      return a;
   }

   public static void a(Map<String, String> var0) {
      adN var1 = a;
      var1.a.clear();
      var1.a.putAll(var0);
      var1.a = System.currentTimeMillis();
   }

   public synchronized String a(String var1) {
      return this.b(var1);
   }

   public synchronized String a(String var1, Object... var2) {
      String var3 = this.b(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }

   private String b(String var1) {
      String var2 = (String)this.a.get(var1);
      return var2 == null ? var1 : var2;
   }

   public synchronized boolean a(String var1) {
      return this.a.containsKey(var1);
   }

   public long a() {
      return this.a;
   }

   static {
      a = IT.a;
      a = Splitter.on('=').limit(2);
      a = new adN();
   }
}
