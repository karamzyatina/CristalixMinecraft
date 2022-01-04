import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public final class agp {
   private static String a = null;
   private static String b = null;
   private static boolean a = false;
   private static boolean b = false;
   private static boolean c = false;
   private static boolean d = false;
   private static float a;
   private static float b;
   private static final acC a = new acC("mcpatcher/ctm/default/empty.png");

   public static boolean a() {
      return a;
   }

   public static String a() {
      return a;
   }

   public static void a() {
      b = true;
      c = false;
   }

   public static HA a(HM var0, HA var1, Map<acC, HA> var2) {
      if (!b) {
         return var1;
      } else if (!(var1 instanceof HG)) {
         return var1;
      } else {
         HG var3 = (HG)var1;
         acC var4 = var3.b;
         if (!d) {
            if (var4 != null) {
               c = true;
            }

            return var1;
         } else {
            if (var4 == null) {
               var4 = a;
            }

            Object var5 = (HA)var2.get(var4);
            if (var5 == null) {
               var5 = new HG(var4);
               var0.a((acC)var4, (HA)var5);
            }

            return (HA)var5;
         }
      }
   }

   public static boolean b() {
      return c;
   }

   public static void b() {
      a = Ci.a;
      b = Ci.b;
      Ci.a(Ci.o, 240.0F, b);
      d = true;
   }

   public static void c() {
      d = false;
      Ci.a(Ci.o, a, b);
   }

   public static void d() {
      b = false;
      c = false;
   }

   public static void a(IN var0) {
      a = false;
      a = null;
      b = null;
      if (afT.aa()) {
         try {
            String var1 = "optifine/emissive.properties";
            acC var2 = new acC(var1);
            InputStream var3 = var0.b(var2);
            if (var3 == null) {
               return;
            }

            a("Loading " + var1);
            Properties var4 = new Properties();
            var4.load(var3);
            var3.close();
            a = var4.getProperty("suffix.emissive");
            if (a != null) {
               b = a + ".png";
            }

            a = a != null;
         } catch (FileNotFoundException var5) {
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }

   }

   private static void a(String var0) {
      afT.a("EmissiveTextures: " + var0);
   }

   private static void b(String var0) {
      afT.b("EmissiveTextures: " + var0);
   }

   public static boolean a(acC var0) {
      return b != null && var0.getPath().endsWith(b);
   }

   public static void a(IN var0, acC var1, HG var2) {
      if (var1 != null && var2 != null) {
         var2.e = false;
         var2.b = null;
         if (b != null) {
            String var3 = var1.getPath();
            if (var3.endsWith(".png")) {
               if (var3.endsWith(b)) {
                  var2.e = true;
               } else {
                  String var4 = var3.substring(0, var3.length() - ".png".length()) + b;
                  acC var5 = new acC(var1.getNamespace(), var4);
                  if (var0.a(var5)) {
                     var2.b = var5;
                  }
               }
            }
         }
      }

   }
}
