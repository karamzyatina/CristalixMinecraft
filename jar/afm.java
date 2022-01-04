import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public final class afM {
   private static boolean a = true;
   private static boolean b = true;
   private static boolean c = true;
   private static boolean d = true;
   private static boolean e = true;
   private static boolean f = true;
   private static boolean g = true;
   private static boolean h = false;
   private static HK a = null;
   private static HK b = null;
   private static HK c = null;
   private static HK d = null;
   private static HK e = null;
   private static HK f = null;
   private static HK g = null;
   private static boolean i = false;
   private static CV a = null;
   private static CV b = null;
   private static CV c = null;
   private static CV d = null;
   private static CV e = null;
   private static CV f = null;
   private static boolean j = false;

   public static void a(IN var0, Jc var1, HO var2) {
      i = false;
      j = false;
      b(var0, var1, var2);
   }

   public static void a(HO var0, Du var1) {
      if (i) {
         a = ajA.a(var0, a, 0);
         if (h) {
            CV var2 = ajA.a(var0, b, -1);
            a = ajA.a(var2, a);
         }

         b = ajA.a(var0, var1, "grass_path", d, c);
         c = ajA.a(var0, c, -1);
         d = ajA.a(var0, e, -1);
         e = ajA.a(var0, f, 0);
         f = ajA.a(var0, g, -1);
         j = true;
      }

   }

   private static void b(IN var0, Jc var1, HO var2) {
      a = true;
      b = true;
      c = true;
      d = true;
      e = true;
      f = true;
      g = true;
      a = var2.a(new acC("blocks/grass_top"));
      b = var2.a(new acC("blocks/grass_side"));
      c = var2.a(new acC("blocks/grass_path_top"));
      d = var2.a(new acC("blocks/grass_path_side"));
      e = var2.a(new acC("blocks/mycelium_top"));
      f = var2.a(new acC("blocks/dirt_podzol_top"));
      g = var2.a(new acC("blocks/snow"));
      i = true;
      String var3 = "optifine/bettergrass.properties";

      try {
         acC var4 = new acC(var3);
         InputStream var5 = var0.b(var4);
         if (var5 == null) {
            return;
         }

         boolean var6 = var1.a(var4);
         if (var6) {
            afT.a("BetterGrass: Parsing default configuration " + var3);
         } else {
            afT.a("BetterGrass: Parsing configuration " + var3);
         }

         Properties var7 = new Properties();
         var7.load(var5);
         var5.close();
         a = a(var7, "grass", true);
         b = a(var7, "grass_path", true);
         c = a(var7, "mycelium", true);
         d = a(var7, "podzol", true);
         e = a(var7, "grass.snow", true);
         f = a(var7, "mycelium.snow", true);
         g = a(var7, "podzol.snow", true);
         h = a(var7, "grass.multilayer", false);
         a = a(var0, var7, "texture.grass", "blocks/grass_top", var2);
         b = a(var0, var7, "texture.grass_side", "blocks/grass_side", var2);
         c = a(var0, var7, "texture.grass_path", "blocks/grass_path_top", var2);
         d = a(var0, var7, "texture.grass_path_side", "blocks/grass_path_side", var2);
         e = a(var0, var7, "texture.mycelium", "blocks/mycelium_top", var2);
         f = a(var0, var7, "texture.podzol", "blocks/dirt_podzol_top", var2);
         g = a(var0, var7, "texture.snow", "blocks/snow", var2);
      } catch (IOException var8) {
         afT.b("Error reading: " + var3 + ", " + var8.getClass().getName() + ": " + var8.getMessage());
      }

   }

   private static HK a(IN var0, Properties var1, String var2, String var3, HO var4) {
      String var5 = var1.getProperty(var2);
      if (var5 == null) {
         var5 = var3;
      }

      acC var6 = new acC("textures/" + var5 + ".png");
      if (!var0.a(var6)) {
         afT.b("BetterGrass texture not found: " + var6);
         var5 = var3;
      }

      acC var7 = new acC(var5);
      HK var8 = var4.a(var7);
      return var8;
   }

   public static List a(aec var0, sD var1, acV var2, abP var3, List var4) {
      if (var3 != abP.UP && var3 != abP.DOWN && j) {
         nh var5 = var1.a();
         if (var5 instanceof pr) {
            return b(var0, var1, var2, var3, var4);
         } else if (var5 instanceof oL) {
            return c(var0, var1, var2, var3, var4);
         } else if (var5 instanceof nR) {
            return d(var0, var1, var2, var3, var4);
         } else {
            return var5 instanceof oK ? e(var0, var1, var2, var3, var4) : var4;
         }
      } else {
         return var4;
      }
   }

   private static List b(aec var0, sD var1, acV var2, abP var3, List var4) {
      nh var5 = var0.a(var2.a()).a();
      boolean var6 = var5 == RQ.ac || var5 == RQ.aa;
      if (afT.D()) {
         if (var6) {
            if (f && a(var2, var3, var0) == RQ.aa) {
               return f.a(var1, var3, 0L);
            }
         } else if (c && a(var2.b(), var3, var0) == RQ.a) {
            return d.a(var1, var3, 0L);
         }
      } else if (var6) {
         if (f) {
            return f.a(var1, var3, 0L);
         }
      } else if (c) {
         return d.a(var1, var3, 0L);
      }

      return var4;
   }

   private static List c(aec var0, sD var1, acV var2, abP var3, List var4) {
      if (!b) {
         return var4;
      } else if (afT.D()) {
         return a(var2.b(), var3, var0) == RQ.bP ? b.a(var1, var3, 0L) : var4;
      } else {
         return b.a(var1, var3, 0L);
      }
   }

   private static List d(aec var0, sD var1, acV var2, abP var3, List var4) {
      nh var5 = a(var2, abP.UP, var0);
      if (var1.a((so)nR.a) != nS.PODZOL) {
         if (var5 != RQ.bP) {
            return var4;
         } else {
            return b && a(var2, var3, var0) == RQ.bP ? c.a(var1, var3, 0L) : var4;
         }
      } else {
         boolean var6 = var5 == RQ.ac || var5 == RQ.aa;
         if (afT.D()) {
            if (var6) {
               if (g && a(var2, var3, var0) == RQ.aa) {
                  return f.a(var1, var3, 0L);
               }
            } else if (d) {
               acV var7 = var2.b().a(var3);
               sD var8 = var0.a(var7);
               if (var8.a() == RQ.c && var8.a((so)nR.a) == nS.PODZOL) {
                  return e.a(var1, var3, 0L);
               }
            }
         } else if (var6) {
            if (g) {
               return f.a(var1, var3, 0L);
            }
         } else if (d) {
            return e.a(var1, var3, 0L);
         }

         return var4;
      }
   }

   private static List e(aec var0, sD var1, acV var2, abP var3, List var4) {
      nh var5 = var0.a(var2.a()).a();
      boolean var6 = var5 == RQ.ac || var5 == RQ.aa;
      if (afT.D()) {
         if (var6) {
            if (e && a(var2, var3, var0) == RQ.aa) {
               return f.a(var1, var3, 0L);
            }
         } else if (a && a(var2.b(), var3, var0) == RQ.a) {
            return a.a(var1, var3, 0L);
         }
      } else if (var6) {
         if (e) {
            return f.a(var1, var3, 0L);
         }
      } else if (a) {
         return a.a(var1, var3, 0L);
      }

      return var4;
   }

   private static nh a(acV var0, abP var1, aec var2) {
      acV var3 = var0.a(var1);
      nh var4 = var2.a(var3).a();
      return var4;
   }

   private static boolean a(Properties var0, String var1, boolean var2) {
      String var3 = var0.getProperty(var1);
      return var3 == null ? var2 : Boolean.parseBoolean(var3);
   }
}
