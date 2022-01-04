import dev.xdark.clientapi.language.Locale;
import dev.xdark.feder.IOUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class IT implements Locale {
   public static final Pattern a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
   private static final Matcher a;
   public final Map<String, String> a;
   private boolean a;
   anR a;

   public IT() {
      this.a = anR.a;
      this.a = new HashMap(3303);
   }

   public synchronized void a(IN var1, List<String> var2) {
      this.a.clear();
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         String var5 = (String)var2.get(var3);
         String var6 = "lang/" + var5 + ".lang";
         Iterator var7 = var1.a().iterator();

         while(var7.hasNext()) {
            String var8 = (String)var7.next();

            try {
               this.a(var1.b(new acC(var8, var6)));
            } catch (IOException var10) {
            }
         }
      }

      this.a();
   }

   public boolean isUnicode() {
      return this.a;
   }

   private void a() {
      int var1 = 0;
      int var2 = 0;
      Iterator var3 = this.a.values().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         int var5 = var4.length();
         var2 += var5;

         for(int var6 = 0; var6 < var5; ++var6) {
            if (var4.charAt(var6) >= 256) {
               ++var1;
            }
         }
      }

      float var7 = (float)var1 / (float)var2;
      this.a = (double)var7 > 0.1D;
   }

   private void a(List<InputStream> var1) {
      int var2 = 0;

      for(int var3 = var1.size(); var2 < var3; ++var2) {
         InputStream var4 = (InputStream)var1.get(var2);

         try {
            this.a(var4);
         } finally {
            IOUtil.closeQuietly(var4);
         }
      }

   }

   private void a(InputStream var1) {
      BufferedReader var2 = IOUtil.toBufferedReader(var1, LB.a());
      Throwable var3 = null;

      try {
         String var4;
         try {
            while((var4 = var2.readLine()) != null) {
               if (!var4.isEmpty() && var4.charAt(0) != '#') {
                  String[] var5 = var4.split("=", 2);
                  if (var5.length == 2) {
                     String var6 = var5[0];
                     String var7 = a.reset(var5[1]).replaceAll("%$1s");
                     this.a.put(var6, var7);
                  }
               }
            }
         } catch (Throwable var15) {
            var3 = var15;
            throw var15;
         }
      } finally {
         if (var2 != null) {
            if (var3 != null) {
               try {
                  var2.close();
               } catch (Throwable var14) {
                  var3.addSuppressed(var14);
               }
            } else {
               var2.close();
            }
         }

      }

   }

   public String formatMessage(String var1, Object[] var2) {
      String var3 = this.a(var1);

      try {
         return String.format(var3, var2);
      } catch (IllegalFormatException var5) {
         return "Format error: " + var3;
      }
   }

   static {
      a = a.matcher("");
   }

   public String getTranslation(String var1) {
      return (String)this.a.get(var1);
   }

   public void register(String var1, String var2) {
      this.a.put(var1, var2);
   }

   private String a(String var1) {
      String var2 = (String)this.a.get(var1);
      if (var2 == null) {
         var2 = this.a.a(var1);
      }

      return var2 == null ? var1 : var2;
   }

   public boolean hasKey(String var1) {
      return this.a.containsKey(var1) || this.a.a(var1);
   }
}
