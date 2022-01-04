import dev.xdark.feder.RecyclableArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class amg {
   public static String[] a(Jc var0, String var1, String var2) {
      return a(var0, new String[]{var1}, new String[]{var2});
   }

   public static String[] a(Jc var0, String[] var1, String[] var2) {
      LinkedHashSet var3 = new LinkedHashSet();
      IP[] var4 = var0.a();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         IP var6 = var4[var5];
         String[] var7 = a((IP)var6, (String[])var1, (String[])var2, (String[])null);
         var3.addAll(Arrays.asList(var7));
      }

      String[] var8 = (String[])var3.toArray(new String[0]);
      return var8;
   }

   public static String[] a(IP var0, String var1, String var2, String[] var3) {
      return a(var0, new String[]{var1}, new String[]{var2}, var3);
   }

   public static String[] a(IP var0, String[] var1, String[] var2, String[] var3) {
      if (var0 instanceof IE) {
         return a(var0, var3);
      } else {
         if (var0 instanceof IS) {
            IP var4 = ((IS)var0).a;
            if (var4 == null) {
               afT.b("LegacyV2Adapter base resource pack not found: " + var0);
               return new String[0];
            }

            var0 = var4;
         }

         if (!(var0 instanceof IC)) {
            afT.b("Unknown resource pack type: " + var0);
            return new String[0];
         } else {
            IC var6 = (IC)var0;
            File var5 = var6.a;
            if (var5 == null) {
               return new String[0];
            } else {
               return var5.isDirectory() ? a(var5, "", var1, var2) : a(var5, var1, var2);
            }
         }
      }
   }

   private static String[] a(IP var0, String[] var1) {
      if (var1 == null) {
         return new String[0];
      } else {
         ArrayList var2 = new ArrayList(var1.length);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            String var4 = var1[var3];
            if (!a(var4)) {
               afT.b("Skipping non-lowercase path: " + var4);
            } else {
               acC var5 = new acC(var4);
               if (var0.a(var5)) {
                  var2.add(var4);
               }
            }
         }

         return (String[])((String[])var2.toArray(new String[0]));
      }
   }

   private static String[] a(File var0, String var1, String[] var2, String[] var3) {
      RecyclableArrayList var4 = RecyclableArrayList.newInstance();
      String var5 = "assets/minecraft/";
      File[] var6 = var0.listFiles();
      if (var6 == null) {
         return new String[0];
      } else {
         for(int var7 = 0; var7 < var6.length; ++var7) {
            File var8 = var6[var7];
            String var9;
            if (!var8.isDirectory()) {
               var9 = var1 + var8.getName();
               if (var9.startsWith(var5)) {
                  var9 = var9.substring(var5.length());
                  if (ami.a(var9, var2) && ami.b(var9, var3)) {
                     if (!a(var9)) {
                        afT.b("Skipping non-lowercase path: " + var9);
                     } else {
                        var4.add(var9);
                     }
                  }
               }
            } else {
               var9 = var1 + var8.getName() + '/';
               String[] var10 = a(var8, var9, var2, var3);

               for(int var11 = 0; var11 < var10.length; ++var11) {
                  String var12 = var10[var11];
                  var4.add(var12);
               }
            }
         }

         String[] var13 = (String[])((String[])var4.toArray(new String[0]));
         var4.recycle();
         return var13;
      }
   }

   private static String[] a(File var0, String[] var1, String[] var2) {
      if (!var0.isFile()) {
         return new String[0];
      } else {
         ArrayList var3 = new ArrayList();
         String var4 = "assets/minecraft/";

         try {
            ZipFile var5 = new ZipFile(var0);
            Enumeration var6 = var5.entries();

            while(var6.hasMoreElements()) {
               ZipEntry var7 = (ZipEntry)var6.nextElement();
               String var8 = var7.getName();
               if (var8.startsWith(var4)) {
                  var8 = var8.substring(var4.length());
                  if (ami.a(var8, var1) && ami.b(var8, var2)) {
                     if (!a(var8)) {
                        afT.b("Skipping non-lowercase path: " + var8);
                     } else {
                        var3.add(var8);
                     }
                  }
               }
            }

            var5.close();
            String[] var10 = (String[])((String[])var3.toArray(new String[0]));
            return var10;
         } catch (IOException var9) {
            var9.printStackTrace();
            return new String[0];
         }
      }
   }

   private static boolean a(String var0) {
      return var0.equals(var0.toLowerCase(Locale.ROOT));
   }

   public static Properties a(IN var0, String var1, String var2) {
      acC var3 = new acC(var1);

      try {
         InputStream var4 = var0.b(var3);
         if (var4 == null) {
            return null;
         } else {
            Properties var5 = new Properties();
            var5.load(var4);
            var4.close();
            return var5;
         }
      } catch (FileNotFoundException var6) {
         return null;
      } catch (IOException var7) {
         afT.b(var2 + ": Error reading " + var1);
         return null;
      }
   }

   public static Properties a(InputStream var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         try {
            Properties var2 = new Properties();
            var2.load(var0);
            var0.close();
            return var2;
         } catch (IOException var3) {
            return null;
         }
      }
   }
}
