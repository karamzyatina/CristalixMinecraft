import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public final class alX {
   public static Properties a(IN var0, acC var1) {
      String var2 = var1.getPath();
      Properties var3 = new Properties();
      String var4 = ".png";
      if (!var2.endsWith(var4)) {
         return var3;
      } else {
         String var5 = var2.substring(0, var2.length() - var4.length()) + ".properties";

         try {
            acC var6 = new acC(var1.getNamespace(), var5);
            InputStream var7 = var0.b(var6);
            if (var7 == null) {
               return var3;
            }

            afT.e("Loading " + var5);
            var3.load(var7);
         } catch (FileNotFoundException var8) {
         } catch (IOException var9) {
            var9.printStackTrace();
         }

         return var3;
      }
   }

   public static void a(Properties var0, float[] var1) {
      Iterator var2 = var0.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         String var4 = "width.";
         if (var3.startsWith(var4)) {
            String var5 = var3.substring(var4.length());
            int var6 = afT.a((String)var5, -1);
            if (var6 >= 0 && var6 < var1.length) {
               String var7 = var0.getProperty(var3);
               float var8 = afT.a(var7, -1.0F);
               if (var8 >= 0.0F) {
                  var1[var6] = var8;
               }
            }
         }
      }

   }

   public static float a(Properties var0, String var1, float var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         float var4 = afT.a(var3, Float.MIN_VALUE);
         if (var4 == Float.MIN_VALUE) {
            afT.b("Invalid value for " + var1 + ": " + var3);
            return var2;
         } else {
            return var4;
         }
      }
   }

   public static boolean a(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         String var4 = var3.toLowerCase().trim();
         if (!var4.equals("true") && !var4.equals("on")) {
            if (!var4.equals("false") && !var4.equals("off")) {
               afT.b("Invalid value for " + var1 + ": " + var3);
               return var2;
            } else {
               return false;
            }
         } else {
            return true;
         }
      }
   }
}
