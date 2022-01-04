import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public final class alN {
   private static alO[][] a = (alO[][])null;

   public static void a() {
      a = (alO[][])null;
   }

   public static void a(IN var0, HM var1) {
      a();
      if (afT.W()) {
         a = a(var0, var1);
      }

   }

   private static alO[][] a(IN var0, HM var1) {
      alO[][] var2 = new alO[10][0];
      String var3 = "mcpatcher/sky/world";
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var2.length; ++var5) {
         String var6 = var3 + var5 + "/sky";
         ArrayList var7 = new ArrayList();

         for(int var8 = 1; var8 < 1000; ++var8) {
            String var9 = var6 + var8 + ".properties";

            try {
               acC var10 = new acC(var9);
               InputStream var11 = var0.b(var10);
               if (var11 == null) {
                  break;
               }

               Properties var12 = new Properties();
               var12.load(var11);
               var11.close();
               afT.a("CustomSky properties: " + var9);
               String var13 = var6 + var8 + ".png";
               alO var14 = new alO(var12, var13);
               if (var14.a(var9)) {
                  acC var15 = new acC(var14.a);
                  HA var16 = amj.a(var0, var1, var15);
                  if (var16 == null) {
                     afT.e("CustomSky: Texture not found: " + var15);
                  } else {
                     var14.a = var16.getGlTextureId();
                     var7.add(var14);
                     var11.close();
                  }
               }
            } catch (FileNotFoundException var17) {
               break;
            } catch (IOException var18) {
               var18.printStackTrace();
            }
         }

         if (var7.size() > 0) {
            alO[] var21 = (alO[])((alO[])var7.toArray(new alO[0]));
            var2[var5] = var21;
            var4 = var5;
         }
      }

      if (var4 < 0) {
         return (alO[][])null;
      } else {
         var5 = var4 + 1;
         alO[][] var19 = new alO[var5][0];

         for(int var20 = 0; var20 < var19.length; ++var20) {
            var19[var20] = var2[var20];
         }

         return var19;
      }
   }

   public static void a(aej var0, sE var1, Cw var2, float var3) {
      if (a != null) {
         int var4 = var0.a.a().a();
         if (var4 >= 0 && var4 < a.length) {
            alO[] var5 = a[var4];
            if (var5 != null) {
               long var6 = var0.b();
               int var8 = (int)(var6 % 24000L);
               float var9 = var0.b(var3);
               float var10 = var0.b();
               float var11 = var0.getThunderStrength(var3);
               if (var10 > 0.0F) {
                  var11 /= var10;
               }

               for(int var12 = 0; var12 < var5.length; ++var12) {
                  alO var13 = var5[var12];
                  if (var13.a(var0, var8)) {
                     var13.a(var1, var2, var0, var8, var9, var10, var11);
                  }
               }

               float var14 = 1.0F - var10;
               ajQ.a(var14);
            }
         }
      }

   }

   public static boolean a(aej var0) {
      if (a == null) {
         return false;
      } else {
         int var1 = var0.a.a().a();
         if (var1 >= 0 && var1 < a.length) {
            alO[] var2 = a[var1];
            if (var2 == null) {
               return false;
            } else {
               return var2.length > 0;
            }
         } else {
            return false;
         }
      }
   }
}
