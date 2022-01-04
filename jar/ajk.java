import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;

public class ajK {
   private static final acC a = new acC((Void)null, "minecraft", "mcpatcher/mob_properties");
   private static final Map<String, ajM> a = new HashMap();
   private static boolean a = false;
   private static final ajL a = new ajL();
   private static final ajO a = new ajO();
   private static boolean b = false;
   private static final String[] a = new String[]{"_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar"};

   public static void a(sE var0, NN var1, aej var2) {
      if (var2 != null) {
         WS var3 = var1.a();
         var3.a = var1.a_();
         var3.a = var2.a(var3.a);
         if (var1 instanceof QV) {
            QV var4 = (QV)var1;
            a(var0, var4, false);
         }
      }

   }

   public static void a(sE var0, NN var1) {
      if (var1 instanceof QV) {
         QV var2 = (QV)var1;
         a(var0, var2, true);
      }

   }

   private static void a(sE var0, QV var1, boolean var2) {
      Object var3 = var1.d();
      if (var3 == null) {
         var3 = var0.a;
      }

      if (var3 instanceof tC) {
         tC var4 = (tC)var3;
         UUID var5 = var1.getUniqueID();
         if (var2) {
            VR var6 = var4.a();
            if (var6 != null && Objects.equals(var6.a("UUID"), var5)) {
               var4.a = var1;
            }

            VR var7 = var4.b();
            if (var7 != null && Objects.equals(var7.a("UUID"), var5)) {
               var4.b = var1;
            }
         } else {
            WS var8 = var1.a();
            WS var9;
            if (var4.a != null && Objects.equals(var4.a.getUniqueID(), var5)) {
               var9 = var4.a.a();
               var8.a = var9.a;
               var8.a = var9.a;
               var4.a = null;
            }

            if (var4.b != null && Objects.equals(var4.b.getUniqueID(), var5)) {
               var9 = var4.b.a();
               var8.a = var9.a;
               var8.a = var9.a;
               var4.b = null;
            }
         }
      }

   }

   public static void a() {
      a.a((NN)null);
      a.a((aaD)null);
   }

   public static acC a(Ck var0, acC var1) {
      if (!a) {
         return var1;
      } else if (b) {
         return var1;
      } else {
         acC var6;
         try {
            b = true;
            ajJ var3 = a(var0);
            if (var3 == null) {
               acC var2 = var1;
               return var2;
            }

            String var4 = var1.getPath();
            if (var4.startsWith("horse/")) {
               var4 = a(var4, "horse/".length());
            }

            if (!var4.startsWith("textures/entity/") && !var4.startsWith("textures/painting/")) {
               acC var10 = var1;
               return var10;
            }

            ajM var5 = (ajM)a.get(var4);
            if (var5 != null) {
               var6 = var5.a(var1, var3);
               return var6;
            }

            var6 = var1;
         } finally {
            b = false;
         }

         return var6;
      }
   }

   private static String a(String var0, int var1) {
      for(int var2 = 0; var2 < QH.b.length; ++var2) {
         String var3 = QH.b[var2];
         if (var0.startsWith(var3, var1)) {
            return QH.a[var2];
         }
      }

      return var0;
   }

   private static ajJ a(Ck var0) {
      if (var0.a != null) {
         a.a(var0.a);
         return a;
      } else {
         Ie var1 = var0.a.a;
         if (var1.a != null) {
            aaD var2 = var1.a;
            if (var2.b() != null) {
               a.a(var2);
               return a;
            }
         }

         return null;
      }
   }

   private static ajM a(IN var0, acC var1, boolean var2) {
      String var3 = var1.getPath();
      acC var4 = a(var0, var1, var2);
      if (var4 != null) {
         ajM var5 = a(var0, var4, var1);
         if (var5 != null) {
            return var5;
         }
      }

      acC[] var6 = a(var0, var1, var2);
      return var6 == null ? null : new ajM(var3, var6);
   }

   private static ajM a(IN var0, acC var1, acC var2) {
      try {
         String var3 = var1.getPath();
         a(var2.getPath() + ", properties: " + var3);
         InputStream var4 = var0.b(var1);
         if (var4 == null) {
            b("Properties not found: " + var3);
            return null;
         } else {
            Properties var5 = new Properties();
            var5.load(var4);
            var4.close();
            ajM var6 = new ajM(var0, var5, var3, var2);
            return !var6.a(var0, var3) ? null : var6;
         }
      } catch (FileNotFoundException var7) {
         b("File not found: " + var2.getPath());
         return null;
      } catch (IOException var8) {
         var8.printStackTrace();
         return null;
      }
   }

   private static acC a(IN var0, acC var1, boolean var2) {
      acC var3 = a(var1, var2);
      if (var3 == null) {
         return null;
      } else {
         String var4 = var3.getNamespace();
         String var5 = var3.getPath();
         String var6 = ami.b(var5, ".png");
         String var7 = var6 + ".properties";
         acC var8 = new acC(var4, var7);
         if (var0.a(var8)) {
            return var8;
         } else {
            String var9 = b(var6);
            if (var9 == null) {
               return null;
            } else {
               acC var10 = new acC(var4, var9 + ".properties");
               return var0.a(var10) ? var10 : null;
            }
         }
      }
   }

   protected static acC a(acC var0, boolean var1) {
      String var2 = var0.getNamespace();
      String var3 = var0.getPath();
      String var4 = "textures/";
      String var5 = "optifine/random/";
      if (var1) {
         var4 = "textures/entity/";
         var5 = "mcpatcher/mob/";
      }

      if (!var3.startsWith(var4)) {
         return null;
      } else {
         String var6 = ami.b(var3, var4, var5);
         return new acC(var2, var6);
      }
   }

   private static String a(String var0) {
      if (var0.startsWith("optifine/random/")) {
         return ami.b(var0, "optifine/random/", "textures/");
      } else {
         return var0.startsWith("mcpatcher/mob/") ? ami.b(var0, "mcpatcher/mob/", "textures/entity/") : null;
      }
   }

   protected static acC a(acC var0, int var1) {
      if (var0 == null) {
         return null;
      } else {
         String var2 = var0.getPath();
         int var3 = var2.lastIndexOf(46);
         if (var3 < 0) {
            return null;
         } else {
            String var4 = var2.substring(0, var3);
            String var5 = var2.substring(var3);
            String var6 = var4 + var1 + var5;
            return new acC(var0.getNamespace(), var6);
         }
      }
   }

   private static String b(String var0) {
      String[] var1 = a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1[var3];
         if (var0.endsWith(var4)) {
            return ami.b(var0, var4);
         }
      }

      return null;
   }

   private static acC[] a(IN var0, acC var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      var3.add(var1);
      acC var4 = a(var1, var2);
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 1; var5 < var3.size() + 10; ++var5) {
            int var6 = var5 + 1;
            acC var7 = a(var4, var6);
            if (var0.a(var7)) {
               var3.add(var7);
            }
         }

         if (var3.size() <= 1) {
            return null;
         } else {
            acC[] var8 = (acC[])((acC[])var3.toArray(new acC[0]));
            a(var1.getPath() + ", variants: " + var8.length);
            return var8;
         }
      }
   }

   public static void a(Ck var0) {
      a.clear();
      a = false;
      b(var0);
   }

   private static void b(Ck var0) {
   }

   public static void a(String var0) {
      afT.a("RandomEntities: " + var0);
   }

   public static void b(String var0) {
      afT.b("RandomEntities: " + var0);
   }
}
