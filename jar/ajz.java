import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public final class ajZ {
   private static ajY[][] a = (ajY[][])((ajY[][])null);
   private static Properties a = null;

   public static int a(int var0, int var1) {
      if (a == null) {
         return var0;
      } else if (var0 >= 0 && var0 < a.length) {
         ajY[] var2 = a[var0];
         if (var2 != null) {
            for(int var3 = 0; var3 < var2.length; ++var3) {
               ajY var4 = var2[var3];
               if (var4.a(var0, var1)) {
                  return var4.a();
               }
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static void a(sE var0, akj var1) {
      a();
      if (var1 != null) {
         ArrayList var2 = new ArrayList();
         String var3 = "/shaders/block.properties";
         InputStream var4 = var1.a(var3);
         if (var4 != null) {
            a(var0, var4, var3, var2);
         }

         if (var2.size() > 0) {
            a = a(var2);
         }
      }

   }

   private static void a(sE var0, InputStream var1, String var2, List<List<ajY>> var3) {
      if (var1 != null) {
         try {
            var1 = akM.a(var0, var1);
            Properties var4 = new Properties();
            var4.load(var1);
            var1.close();
            afT.a("[Shaders] Parsing block mappings: " + var2);
            agC var5 = new agC("Shaders");
            Iterator var6 = var4.keySet().iterator();

            while(true) {
               while(var6.hasNext()) {
                  String var7 = (String)var6.next();
                  String var8 = var4.getProperty(var7);
                  if (var7.startsWith("layer.")) {
                     if (a == null) {
                        a = new Properties();
                     }

                     a.put(var7, var8);
                  } else {
                     String var9 = "block.";
                     if (!var7.startsWith(var9)) {
                        afT.b("[Shaders] Invalid block ID: " + var7);
                     } else {
                        String var10 = ami.a(var7, var9);
                        int var11 = afT.a((String)var10, -1);
                        if (var11 < 0) {
                           afT.b("[Shaders] Invalid block ID: " + var7);
                        } else {
                           agH[] var12 = var5.a(var8);
                           if (var12 != null && var12.length >= 1) {
                              ajY var13 = new ajY(var11, var12);
                              a(var3, var13);
                           } else {
                              afT.b("[Shaders] Invalid block ID mapping: " + var7 + '=' + var8);
                           }
                        }
                     }
                  }
               }

               return;
            }
         } catch (IOException var14) {
            afT.b("[Shaders] Error reading: " + var2);
         }
      }

   }

   private static void a(List<List<ajY>> var0, ajY var1) {
      int[] var2 = var1.a();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         int var4 = var2[var3];

         while(var4 >= var0.size()) {
            var0.add((Object)null);
         }

         Object var5 = (List)var0.get(var4);
         if (var5 == null) {
            var5 = new ArrayList();
            var0.set(var4, var5);
         }

         ajY var6 = new ajY(var1.a(), var1.a(var4));
         ((List)var5).add(var6);
      }

   }

   private static ajY[][] a(List<List<ajY>> var0) {
      ajY[][] var1 = new ajY[var0.size()][];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            var1[var2] = (ajY[])((ajY[])var3.toArray(new ajY[0]));
         }
      }

      return var1;
   }

   public static Properties a() {
      return a;
   }

   public static void a() {
      a = (ajY[][])((ajY[][])null);
      a = null;
   }
}
