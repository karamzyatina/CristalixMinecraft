import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

public final class agd {
   private static String a = "vanilla";
   private static agc a = null;
   private static agc b = null;
   private static agc c = null;
   private static agc d = null;
   private static agc e = null;
   private static agc[] a = null;
   private static agc[][] a = (agc[][])((agc[][])null);
   private static agc f = null;
   private static final agb a = new agb();
   private static agc g = null;
   private static final agb b = new agb();
   private static agc h = null;
   private static final agb c = new agb();
   private static agc i = null;
   private static final agb d = new agb();
   private static ajy[] a = null;
   private static int a = 0;
   private static agc j = null;
   private static agc k = null;
   private static int b = -1;
   private static agc l = null;
   private static agc m = null;
   private static agc n = null;
   private static agc o = null;
   private static agc p = null;
   private static boolean a = true;
   private static int c = -1;
   private static int d = -1;
   private static int e = -1;
   private static int f = -1;
   private static int g = -1;
   private static int h = -1;
   private static adm a = null;
   private static adm b = null;
   private static adm c = null;
   private static float[][] a = (float[][])((float[][])null);
   private static float[][] b = (float[][])((float[][])null);
   private static int[] a = null;
   private static int[] b = null;
   private static int[] c = null;
   private static final sD a;
   private static final sD b;
   public static final Random a;
   private static final agj a;
   private static final agj b;
   private static final agj c;
   private static final agj d;
   private static final agj e;

   public static void a(IN var0, Jc var1, HM var2) {
      a = "vanilla";
      a = null;
      c = null;
      b = null;
      e = null;
      d = null;
      f = null;
      g = null;
      h = null;
      i = null;
      j = null;
      k = null;
      b = -1;
      l = null;
      m = null;
      p = null;
      a = null;
      c = -1;
      d = -1;
      e = -1;
      f = -1;
      g = -1;
      h = -1;
      a = null;
      b = null;
      c = null;
      a = null;
      a = (agc[][])((agc[][])null);
      a = true;
      a = (float[][])((float[][])null);
      b = (float[][])((float[][])null);
      a = null;
      a(var2, b);
      c = null;
      a = a(var0, "mcpatcher/color.properties", "palette.format", agc.a, "vanilla");
      String var3 = "mcpatcher/colormap/";
      String[] var4 = new String[]{"water.png", "watercolorX.png"};
      a = a(var0, var3, var4, 256, 256);
      a();
      if (afT.V()) {
         String[] var5 = new String[]{"pine.png", "pinecolor.png"};
         b = a(var0, var3, var5, 256, 256);
         String[] var6 = new String[]{"birch.png", "birchcolor.png"};
         c = a(var0, var3, var6, 256, 256);
         String[] var7 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
         e = a(var0, var3, var7, 256, 256);
         String[] var8 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
         d = a(var0, var3, var8, 256, 256);
         String[] var9 = new String[]{"sky0.png", "skycolor0.png"};
         f = a(var0, var3, var9, 256, 256);
         String[] var10 = new String[]{"fog0.png", "fogcolor0.png"};
         g = a(var0, var3, var10, 256, 256);
         String[] var11 = new String[]{"underwater.png", "underwatercolor.png"};
         h = a(var0, var3, var11, 256, 256);
         String[] var12 = new String[]{"underlava.png", "underlavacolor.png"};
         i = a(var0, var3, var12, 256, 256);
         String[] var13 = new String[]{"redstone.png", "redstonecolor.png"};
         j = a(var0, var3, var13, 16, 1);
         k = a(var0, var3 + "xporb.png", -1, -1);
         l = a(var0, var3 + "durability.png", -1, -1);
         String[] var14 = new String[]{"stem.png", "stemcolor.png"};
         m = a(var0, var3, var14, 8, 1);
         o = a(var0, var3 + "pumpkinstem.png", 8, 1);
         n = a(var0, var3 + "melonstem.png", 8, 1);
         String[] var15 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
         p = a(var0, var3, var15, -1, -1);
         Entry var16 = a(var0, var1);
         a = (ajy[])var16.getKey();
         a = (Integer)var16.getValue();
         a(var0, var2, "mcpatcher/color.properties");
         a = a(var0, var1, new String[]{var3 + "custom/", var3 + "blocks/"}, a, 256, 256);
         a();
      }

   }

   private static String a(IN var0, String var1, String var2, String[] var3, String var4) {
      try {
         acC var5 = new acC(var1);
         InputStream var6 = var0.b(var5);
         if (var6 == null) {
            return var4;
         } else {
            Properties var7 = new Properties();
            var7.load(var6);
            var6.close();
            String var8 = var7.getProperty(var2);
            if (var8 == null) {
               return var4;
            } else {
               List var9 = Arrays.asList(var3);
               if (!var9.contains(var8)) {
                  b("Invalid value: " + var2 + '=' + var8);
                  b("Expected values: " + afT.a((Object[])var3));
                  return var4;
               } else {
                  a(var2 + '=' + var8);
                  return var8;
               }
            }
         }
      } catch (FileNotFoundException var10) {
         return var4;
      } catch (IOException var11) {
         var11.printStackTrace();
         return var4;
      }
   }

   private static Entry<ajy[], Integer> a(IN var0, Jc var1) {
      String var2 = "mcpatcher/lightmap/world";
      String var3 = ".png";
      String[] var4 = amg.a(var1, var2, var3);
      if (var4.length == 0) {
         return new SimpleEntry(new ajy[0], 0);
      } else {
         Int2ObjectOpenHashMap var5 = new Int2ObjectOpenHashMap();

         int var9;
         for(int var6 = 0; var6 < var4.length; ++var6) {
            String var7 = var4[var6];
            String var8 = ami.c(var7, var2, var3);
            var9 = afT.a(var8, Integer.MIN_VALUE);
            if (var9 == Integer.MIN_VALUE) {
               b("Invalid dimension ID: " + var8 + ", path: " + var7);
            } else {
               var5.put(var9, var7);
            }
         }

         if (var5.size() <= 0) {
            return new SimpleEntry((Object)null, 0);
         } else {
            IntSet var23 = var5.keySet();
            int[] var24 = var23.toIntArray();
            Arrays.sort(var24);
            int var25 = var24[0];
            var9 = var24[var24.length - 1];
            int var10 = var9 - var25 + 1;
            agc[] var11 = new agc[var10];

            int var13;
            for(int var12 = 0; var12 < var24.length; ++var12) {
               var13 = var24[var12];
               String var14 = (String)var5.get(var13);
               agc var15 = a(var0, var14, -1, -1);
               if (var15 != null) {
                  if (var15.c() < 16) {
                     b("Invalid lightmap width: " + var15.c() + ", path: " + var14);
                  } else {
                     int var16 = var13 - var25;
                     var11[var16] = var15;
                  }
               }
            }

            ajy[] var26 = new ajy[var11.length];

            for(var13 = 0; var13 < var11.length; ++var13) {
               agc var27 = var11[var13];
               if (var27 != null) {
                  String var28 = var27.a;
                  String var29 = var27.b;
                  agc var17 = a(var0, var29 + '/' + var28 + "_rain.png", -1, -1);
                  agc var18 = a(var0, var29 + '/' + var28 + "_thunder.png", -1, -1);
                  ajx var19 = new ajx(var27);
                  ajx var20 = var17 != null ? new ajx(var17) : null;
                  ajx var21 = var18 != null ? new ajx(var18) : null;
                  ajy var22 = new ajy(var19, var20, var21);
                  var26[var13] = var22;
               }
            }

            return new SimpleEntry(var26, var25);
         }
      }
   }

   private static void a(IN var0, HM var1, String var2) {
      try {
         acC var3 = new acC(var2);
         InputStream var4 = var0.b(var3);
         if (var4 == null) {
            return;
         }

         a("Loading " + var2);
         Properties var5 = new Properties();
         var5.load(var4);
         var4.close();
         c = a(var5, new String[]{"particle.water", "drop.water"});
         d = a(var5, "particle.portal");
         e = a(var5, "lilypad");
         f = a(var5, "text.xpbar");
         g = a(var5, "text.boss");
         h = a(var5, "text.sign");
         a = a(var5, "fog.nether");
         b = a(var5, "fog.end");
         c = a(var5, "sky.end");
         a = a(var0, var5, var2);
         a = a(var5, var2, "collar.", "Wolf collar");
         b = a(var5, var2, "sheep.", "Sheep");
         a = a(var5, var2, "text.code.", "Text");
         int[] var6 = b(var5, var2, "map.", "Map");
         if (var6 != null) {
            if (b == null) {
               b = a();
            }

            a(var1, var6);
         }

         c = c(var5, var2, "potion.", "Potion");
         b = afT.a((String)var5.getProperty("xporb.time"), -1);
      } catch (FileNotFoundException var7) {
         return;
      } catch (IOException var8) {
         var8.printStackTrace();
      }

   }

   private static agc[] a(IN var0, Properties var1, String var2) {
      ArrayList var3 = new ArrayList();
      String var4 = "palette.block.";
      HashMap var5 = new HashMap();
      Iterator var6 = var1.keySet().iterator();

      String var8;
      while(var6.hasNext()) {
         String var7 = (String)var6.next();
         var8 = var1.getProperty(var7);
         if (var7.startsWith(var4)) {
            var5.put(var7, var8);
         }
      }

      String[] var17 = (String[])((String[])var5.keySet().toArray(new String[0]));

      for(int var18 = 0; var18 < var17.length; ++var18) {
         var8 = var17[var18];
         String var9 = var1.getProperty(var8);
         a("Block palette: " + var8 + " = " + var9);
         String var10 = var8.substring(var4.length());
         String var11 = amj.a(var2);
         var10 = amj.a(var10, var11);
         agc var12 = a(var0, var10, 256, 256);
         if (var12 == null) {
            b("Colormap not found: " + var10);
         } else {
            agC var13 = new agC("CustomColors");
            agH[] var14 = var13.a(var9);
            if (var14 != null && var14.length > 0) {
               for(int var15 = 0; var15 < var14.length; ++var15) {
                  agH var16 = var14[var15];
                  var12.a(var16);
               }

               var3.add(var12);
            } else {
               b("Invalid match blocks: " + var9);
            }
         }
      }

      if (var3.size() <= 0) {
         return null;
      } else {
         agc[] var19 = (agc[])((agc[])var3.toArray(new agc[0]));
         return var19;
      }
   }

   private static agc[][] a(IN var0, Jc var1, String[] var2, agc[] var3, int var4, int var5) {
      String[] var6 = amg.a(var1, var2, new String[]{".properties"});
      Arrays.sort(var6);
      ArrayList var7 = new ArrayList();

      int var8;
      for(var8 = 0; var8 < var6.length; ++var8) {
         String var9 = var6[var8];
         a("Block colormap: " + var9);

         try {
            acC var10 = new acC("minecraft", var9);
            InputStream var11 = var0.b(var10);
            if (var11 == null) {
               b("File not found: " + var9);
            } else {
               Properties var12 = new Properties();
               var12.load(var11);
               agc var13 = new agc(var12, var9, var4, var5, a);
               if (var13.a(var0, var9) && var13.a(var9)) {
                  a((agc)var13, (List)var7);
               }
            }
         } catch (FileNotFoundException var14) {
            b("File not found: " + var9);
         } catch (Exception var15) {
            var15.printStackTrace();
         }
      }

      if (var3 != null) {
         for(var8 = 0; var8 < var3.length; ++var8) {
            agc var17 = var3[var8];
            a((agc)var17, (List)var7);
         }
      }

      if (var7.size() <= 0) {
         return (agc[][])((agc[][])null);
      } else {
         agc[][] var16 = a((List)var7);
         return var16;
      }
   }

   private static void a(agc var0, List var1) {
      int[] var2 = var0.a();
      if (var2 != null && var2.length > 0) {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            if (var4 < 0) {
               b("Invalid block ID: " + var4);
            } else {
               a(var0, var1, var4);
            }
         }
      } else {
         b("No match blocks: " + afT.a(var2));
      }

   }

   private static void a(agc var0, List var1, int var2) {
      while(var2 >= var1.size()) {
         var1.add((Object)null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      ((List)var3).add(var0);
   }

   private static agc[][] a(List var0) {
      agc[][] var1 = new agc[var0.size()][];

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            agc[] var4 = (agc[])((agc[])var3.toArray(new agc[0]));
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static int a(Properties var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         int var4 = a(var0, var3);
         if (var4 >= 0) {
            return var4;
         }
      }

      return -1;
   }

   private static int a(Properties var0, String var1) {
      String var2 = var0.getProperty(var1);
      if (var2 == null) {
         return -1;
      } else {
         var2 = var2.trim();
         int var3 = a(var2);
         if (var3 < 0) {
            b("Invalid color: " + var1 + " = " + var2);
            return var3;
         } else {
            a(var1 + " = " + var2);
            return var3;
         }
      }
   }

   private static int a(String var0) {
      if (var0 == null) {
         return -1;
      } else {
         var0 = var0.trim();

         try {
            int var1 = Integer.parseInt(var0, 16) & 16777215;
            return var1;
         } catch (NumberFormatException var2) {
            return -1;
         }
      }
   }

   private static adm a(Properties var0, String var1) {
      int var2 = a(var0, var1);
      if (var2 < 0) {
         return null;
      } else {
         int var3 = var2 >> 16 & 255;
         int var4 = var2 >> 8 & 255;
         int var5 = var2 & 255;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         float var8 = (float)var5 / 255.0F;
         return new adm((double)var6, (double)var7, (double)var8);
      }
   }

   private static agc a(IN var0, String var1, String[] var2, int var3, int var4) {
      for(int var5 = 0; var5 < var2.length; ++var5) {
         String var6 = var2[var5];
         var6 = var1 + var6;
         agc var7 = a(var0, var6, var3, var4);
         if (var7 != null) {
            return var7;
         }
      }

      return null;
   }

   public static agc a(IN var0, String var1, int var2, int var3) {
      try {
         acC var4 = new acC(var1);
         if (!var0.a(var4)) {
            return null;
         } else {
            a("Colormap " + var1);
            Properties var5 = new Properties();
            String var6 = ami.a(var1, ".png", ".properties");
            acC var7 = new acC(var6);
            if (var0.a(var7)) {
               InputStream var8 = var0.a(var7);
               var5.load(var8);
               var8.close();
               a("Colormap properties: " + var6);
            } else {
               var5.put("format", a);
               var5.put("source", var1);
               var6 = var1;
            }

            agc var10 = new agc(var5, var6, var2, var3, a);
            return !var10.a(var0, var6) ? null : var10;
         }
      } catch (Exception var9) {
         var9.printStackTrace();
         return null;
      }
   }

   public static void a() {
      a = c == null && b == null && e == null && d == null && afT.T() && afT.U();
   }

   public static int a(Ey var0, CD var1, sD var2, aec var3, acV var4, ajV var5) {
      nh var6 = var2.a();
      sD var7 = var5.a();
      if (a != null) {
         if (!var1.hasTintIndex()) {
            if (var6 == RQ.a) {
               var7 = a;
            }

            if (var6 == RQ.a) {
               return -1;
            }
         }

         if (var6 == RQ.a && var5.b() >= 8) {
            var4 = var4.b();
            var7 = var3.a(var4);
         }

         agc var8 = a(var7);
         if (var8 != null) {
            if (afT.U() && !var8.a()) {
               return a((sD)var2, (aec)var3, (acV)var4, (agj)var8, (afP)var5.a());
            }

            return var8.a(var3, var4);
         }
      }

      if (!var1.hasTintIndex()) {
         return -1;
      } else if (var6 == RQ.aK) {
         return a(var0, var3, var4);
      } else if (var6 == RQ.a) {
         return a(var5.a());
      } else if (var6 instanceof rv) {
         return a(var6, var3, var4, var5);
      } else if (a) {
         return -1;
      } else {
         int var10 = var5.b();
         agj var9;
         if (var6 != RQ.a && var6 != RQ.a && var6 != RQ.a) {
            if (var6 == RQ.a) {
               switch(var10 & 3) {
               case 0:
                  var9 = b;
                  break;
               case 1:
                  var9 = c;
                  break;
               case 2:
                  var9 = d;
                  break;
               default:
                  var9 = b;
               }
            } else if (var6 == RQ.b) {
               var9 = b;
            } else {
               if (var6 != RQ.aB) {
                  return -1;
               }

               var9 = b;
            }
         } else {
            var9 = a;
         }

         return afT.U() && !var9.a() ? a(var2, var3, var4, var9, var5.a()) : var9.a(var7, var3, var4);
      }
   }

   protected static aeu a(aec var0, acV var1) {
      aeu var2 = var0.a(var1);
      if (var2 == RP.h && !afT.T()) {
         var2 = RP.c;
      }

      return var2;
   }

   private static agc a(sD var0) {
      if (a == null) {
         return null;
      } else if (!(var0 instanceof sw)) {
         return null;
      } else {
         sw var1 = (sw)var0;
         int var2 = var1.a();
         if (var2 >= 0 && var2 < a.length) {
            agc[] var3 = a[var2];
            if (var3 == null) {
               return null;
            } else {
               for(int var4 = 0; var4 < var3.length; ++var4) {
                  agc var5 = var3[var4];
                  if (var5.a(var1)) {
                     return var5;
                  }
               }

               return null;
            }
         } else {
            return null;
         }
      }
   }

   private static int a(sD var0, aec var1, acV var2, agj var3, afP var4) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = var2.a;
      int var9 = var2.b;
      int var10 = var2.c;

      int var11;
      int var12;
      int var13;
      for(var11 = var8 - 1; var11 <= var8 + 1; ++var11) {
         for(var12 = var10 - 1; var12 <= var10 + 1; ++var12) {
            var4.a(var11, var9, var12);
            var13 = var3.a(var0, var1, var4);
            var5 += var13 >> 16 & 255;
            var6 += var13 >> 8 & 255;
            var7 += var13 & 255;
         }
      }

      var11 = var5 / 9;
      var12 = var6 / 9;
      var13 = var7 / 9;
      return var11 << 16 | var12 << 8 | var13;
   }

   public static int a(Ey var0, aec var1, sD var2, acV var3, ajV var4) {
      Object var5 = a(var2);
      if (var5 == null && var2.a() == si.h) {
         var5 = e;
      }

      if (var5 == null) {
         return var0.a(var2, var1, var3, 0);
      } else {
         return afT.U() && !((agj)var5).a() ? a((sD)var2, (aec)var1, (acV)var3, (agj)var5, (afP)var4.a()) : ((agj)var5).a(var2, var1, var3);
      }
   }

   public static void a(yQ var0) {
      if (d >= 0) {
         int var1 = d;
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.a(var5, var6, var7);
      }

   }

   public static void b(yQ var0) {
      if (p != null) {
         int var1 = p.a();
         int var2 = var1 >> 16 & 255;
         int var3 = var1 >> 8 & 255;
         int var4 = var1 & 255;
         float var5 = (float)var2 / 255.0F;
         float var6 = (float)var3 / 255.0F;
         float var7 = (float)var4 / 255.0F;
         var0.a(var5, var6, var7);
      }

   }

   private static int a(sD var0) {
      if (j == null) {
         return -1;
      } else {
         int var1 = a((sD)var0, 15);
         int var2 = j.a(var1);
         return var2;
      }
   }

   public static void a(yQ var0, aec var1, double var2, double var4, double var6) {
      if (j != null) {
         sD var8 = var1.a(var2, var4, var6);
         int var9 = a((sD)var8, 15);
         int var10 = j.a(var9);
         int var11 = var10 >> 16 & 255;
         int var12 = var10 >> 8 & 255;
         int var13 = var10 & 255;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         var0.a(var14, var15, var16);
      }

   }

   private static int a(sD var0, int var1) {
      nh var2 = var0.a();
      if (!(var2 instanceof qE)) {
         return var1;
      } else {
         Comparable var3 = var0.a((so)qE.a);
         if (!(var3 instanceof Integer)) {
            return var1;
         } else {
            Integer var4 = (Integer)var3;
            return var4;
         }
      }
   }

   public static float a(float var0) {
      if (b <= 0) {
         return var0;
      } else {
         float var1 = 628.0F / (float)b;
         return var0 * var1;
      }
   }

   public static int a(float var0) {
      if (k == null) {
         return -1;
      } else {
         int var1 = (int)Math.round((double)((adh.a(var0) + 1.0F) * (float)(k.b() - 1)) / 2.0D);
         int var2 = k.a(var1);
         return var2;
      }
   }

   public static int a(float var0, int var1) {
      if (l == null) {
         return var1;
      } else {
         int var2 = (int)(var0 * (float)l.b());
         int var3 = l.a(var2);
         return var3;
      }
   }

   public static void a(Ey var0, yQ var1, aec var2, double var3, double var5, double var7, ajV var9) {
      if (a != null || a != null || c >= 0) {
         acV var10 = new acV(var3, var5, var7);
         var9.a(b, var10);
         int var11 = a(var0, var2, b, var10, var9);
         int var12 = var11 >> 16 & 255;
         int var13 = var11 >> 8 & 255;
         int var14 = var11 & 255;
         float var15 = (float)var12 / 255.0F;
         float var16 = (float)var13 / 255.0F;
         float var17 = (float)var14 / 255.0F;
         if (c >= 0) {
            int var18 = c >> 16 & 255;
            int var19 = c >> 8 & 255;
            int var20 = c & 255;
            var15 *= (float)var18 / 255.0F;
            var16 *= (float)var19 / 255.0F;
            var17 *= (float)var20 / 255.0F;
         }

         var1.a(var15, var16, var17);
      }

   }

   private static int a(Ey var0, aec var1, acV var2) {
      return e < 0 ? var0.a(RQ.aK.a(), var1, var2, 0) : e;
   }

   private static adm a(adm var0) {
      return a == null ? var0 : a;
   }

   private static adm b(adm var0) {
      return b == null ? var0 : b;
   }

   private static adm c(adm var0) {
      return c == null ? var0 : c;
   }

   public static adm a(adm var0, aec var1, double var2, double var4, double var6) {
      if (f == null) {
         return var0;
      } else {
         int var8 = f.a(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.a / 0.5F;
         float var16 = (float)var0.b / 0.66275F;
         float var17 = (float)var0.c;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         return a.a((double)var12, (double)var13, (double)var14);
      }
   }

   private static adm b(adm var0, aec var1, double var2, double var4, double var6) {
      if (g == null) {
         return var0;
      } else {
         int var8 = g.a(var1, var2, var4, var6, 3);
         int var9 = var8 >> 16 & 255;
         int var10 = var8 >> 8 & 255;
         int var11 = var8 & 255;
         float var12 = (float)var9 / 255.0F;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var0.a / 0.753F;
         float var16 = (float)var0.b / 0.8471F;
         float var17 = (float)var0.c;
         var12 *= var15;
         var13 *= var16;
         var14 *= var17;
         adm var18 = b.a((double)var12, (double)var13, (double)var14);
         return var18;
      }
   }

   public static adm a(aec var0, double var1, double var3, double var5) {
      return a(var0, var1, var3, var5, h, c);
   }

   public static adm b(aec var0, double var1, double var3, double var5) {
      return a(var0, var1, var3, var5, i, d);
   }

   public static adm a(aec var0, double var1, double var3, double var5, agc var7, agb var8) {
      if (var7 == null) {
         return null;
      } else {
         int var9 = var7.a(var0, var1, var3, var5, 3);
         int var10 = var9 >> 16 & 255;
         int var11 = var9 >> 8 & 255;
         int var12 = var9 & 255;
         float var13 = (float)var10 / 255.0F;
         float var14 = (float)var11 / 255.0F;
         float var15 = (float)var12 / 255.0F;
         adm var16 = var8.a((double)var13, (double)var14, (double)var15);
         return var16;
      }
   }

   private static int a(nh var0, aec var1, acV var2, ajV var3) {
      agc var4 = m;
      if (var0 == RQ.az && o != null) {
         var4 = o;
      }

      if (var0 == RQ.aA && n != null) {
         var4 = n;
      }

      if (var4 == null) {
         return -1;
      } else {
         int var5 = var3.b();
         return var4.a(var5);
      }
   }

   public static boolean a(aej var0, float var1, int[] var2, boolean var3, float var4) {
      if (var0 == null) {
         return false;
      } else if (a == null) {
         return false;
      } else {
         int var5 = var0.a.a().a();
         int var6 = var5 - a;
         if (var6 >= 0 && var6 < a.length) {
            ajy var7 = a[var6];
            return var7 != null && var7.a(var0, var1, var2, var3, var4);
         } else {
            return false;
         }
      }
   }

   public static adm a(sE var0, adm var1, aej var2, NN var3) {
      adX var4 = var2.a.a();
      if (var4 == adX.NETHER) {
         return a(var1);
      } else if (var4 == adX.OVERWORLD) {
         return b(var1, var0.a, var3.d, var3.e + 1.0D, var3.f);
      } else {
         return var4 == adX.THE_END ? b(var1) : var1;
      }
   }

   public static adm a(sE var0, adm var1, aej var2, NN var3, float var4) {
      adX var5 = var2.a.a();
      if (var5 == adX.OVERWORLD) {
         return a((adm)var1, var0.a, var3.d, var3.e + 1.0D, var3.f);
      } else {
         return var5 == adX.THE_END ? c(var1) : var1;
      }
   }

   private static float[][] a(Properties var0, String var1, String var2, String var3) {
      SW[] var4 = SW.VALUES;
      HashMap var5 = new HashMap();

      for(int var6 = 0; var6 < var4.length; ++var6) {
         SW var7 = var4[var6];
         var5.put(var7.getName(), var7);
      }

      float[][] var15 = new float[var4.length][];
      int var16 = 0;
      Iterator var8 = var0.keySet().iterator();

      while(true) {
         while(true) {
            String var9;
            String var10;
            do {
               if (!var8.hasNext()) {
                  if (var16 <= 0) {
                     return (float[][])((float[][])null);
                  }

                  a(var3 + " colors: " + var16);
                  return var15;
               }

               var9 = (String)var8.next();
               var10 = var0.getProperty(var9);
            } while(!var9.startsWith(var2));

            String var11 = ami.a(var9, var2);
            if (var11.equals("lightBlue")) {
               var11 = "light_blue";
            }

            SW var12 = (SW)var5.get(var11);
            int var13 = a(var10);
            if (var12 != null && var13 >= 0) {
               float[] var14 = new float[]{(float)(var13 >> 16 & 255) / 255.0F, (float)(var13 >> 8 & 255) / 255.0F, (float)(var13 & 255) / 255.0F};
               var15[var12.ordinal()] = var14;
               ++var16;
            } else {
               b("Invalid color: " + var9 + " = " + var10);
            }
         }
      }
   }

   private static float[] a(SW var0, float[][] var1, float[] var2) {
      if (var1 == null) {
         return var2;
      } else if (var0 == null) {
         return var2;
      } else {
         float[] var3 = var1[var0.ordinal()];
         return var3 == null ? var2 : var3;
      }
   }

   public static float[] a(SW var0, float[] var1) {
      return a(var0, a, var1);
   }

   public static float[] b(SW var0, float[] var1) {
      return a(var0, b, var1);
   }

   private static int[] a(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[32];
      Arrays.fill(var4, -1);
      int var5 = 0;
      Iterator var6 = var0.keySet().iterator();

      while(true) {
         while(true) {
            String var7;
            String var8;
            do {
               if (!var6.hasNext()) {
                  if (var5 <= 0) {
                     return null;
                  }

                  a(var3 + " colors: " + var5);
                  return var4;
               }

               var7 = (String)var6.next();
               var8 = var0.getProperty(var7);
            } while(!var7.startsWith(var2));

            String var9 = ami.a(var7, var2);
            int var10 = afT.a((String)var9, -1);
            int var11 = a(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               ++var5;
            } else {
               b("Invalid color: " + var7 + " = " + var8);
            }
         }
      }
   }

   public static int a(int var0, int var1) {
      if (a == null) {
         return var1;
      } else if (var0 >= 0 && var0 < a.length) {
         int var2 = a[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   private static int[] b(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[sh.a.length];
      Arrays.fill(var4, -1);
      int var5 = 0;
      Iterator var6 = var0.keySet().iterator();

      while(true) {
         while(true) {
            String var7;
            String var8;
            do {
               if (!var6.hasNext()) {
                  if (var5 <= 0) {
                     return null;
                  }

                  a(var3 + " colors: " + var5);
                  return var4;
               }

               var7 = (String)var6.next();
               var8 = var0.getProperty(var7);
            } while(!var7.startsWith(var2));

            String var9 = ami.a(var7, var2);
            int var10 = c(var9);
            int var11 = a(var8);
            if (var10 >= 0 && var10 < var4.length && var11 >= 0) {
               var4[var10] = var11;
               ++var5;
            } else {
               b("Invalid color: " + var7 + " = " + var8);
            }
         }
      }
   }

   private static int[] c(Properties var0, String var1, String var2, String var3) {
      int[] var4 = new int[a()];
      Arrays.fill(var4, -1);
      int var5 = 0;
      Iterator var6 = var0.keySet().iterator();

      while(true) {
         while(true) {
            String var7;
            String var8;
            do {
               if (!var6.hasNext()) {
                  if (var5 <= 0) {
                     return null;
                  }

                  a(var3 + " colors: " + var5);
                  return var4;
               }

               var7 = (String)var6.next();
               var8 = var0.getProperty(var7);
            } while(!var7.startsWith(var2));

            int var9 = b(var7);
            int var10 = a(var8);
            if (var9 >= 0 && var9 < var4.length && var10 >= 0) {
               var4[var9] = var10;
               ++var5;
            } else {
               b("Invalid color: " + var7 + " = " + var8);
            }
         }
      }
   }

   private static int a() {
      int var0 = 0;
      Iterator var1 = ZV.a.a().iterator();

      while(var1.hasNext()) {
         acC var2 = (acC)var1.next();
         ZV var3 = (ZV)ZV.a.a(var2);
         int var4 = ZV.a(var3);
         if (var4 > var0) {
            var0 = var4;
         }
      }

      return var0;
   }

   private static int b(String var0) {
      if (var0.equals("potion.water")) {
         return 0;
      } else {
         var0 = ami.b(var0, "potion.", "effect.");
         Iterator var1 = ZV.a.a().iterator();

         ZV var3;
         do {
            if (!var1.hasNext()) {
               return -1;
            }

            acC var2 = (acC)var1.next();
            var3 = (ZV)ZV.a.a(var2);
         } while(!var3.getName().equals(var0));

         return ZV.a(var3);
      }
   }

   public static int a(ZV var0, int var1) {
      int var2 = 0;
      if (var0 != null) {
         var2 = ZV.a(var0);
      }

      return b(var2, var1);
   }

   public static int b(int var0, int var1) {
      if (c == null) {
         return var1;
      } else if (var0 >= 0 && var0 < c.length) {
         int var2 = c[var0];
         return var2 < 0 ? var1 : var2;
      } else {
         return var1;
      }
   }

   private static int c(String var0) {
      if (var0 == null) {
         return -1;
      } else if (var0.equals("air")) {
         return sh.a.b;
      } else if (var0.equals("grass")) {
         return sh.b.b;
      } else if (var0.equals("sand")) {
         return sh.c.b;
      } else if (var0.equals("cloth")) {
         return sh.d.b;
      } else if (var0.equals("tnt")) {
         return sh.e.b;
      } else if (var0.equals("ice")) {
         return sh.f.b;
      } else if (var0.equals("iron")) {
         return sh.g.b;
      } else if (var0.equals("foliage")) {
         return sh.h.b;
      } else if (var0.equals("clay")) {
         return sh.j.b;
      } else if (var0.equals("dirt")) {
         return sh.k.b;
      } else if (var0.equals("stone")) {
         return sh.l.b;
      } else if (var0.equals("water")) {
         return sh.m.b;
      } else if (var0.equals("wood")) {
         return sh.n.b;
      } else if (var0.equals("quartz")) {
         return sh.o.b;
      } else if (var0.equals("gold")) {
         return sh.E.b;
      } else if (var0.equals("diamond")) {
         return sh.F.b;
      } else if (var0.equals("lapis")) {
         return sh.G.b;
      } else if (var0.equals("emerald")) {
         return sh.H.b;
      } else if (var0.equals("podzol")) {
         return sh.I.b;
      } else if (var0.equals("netherrack")) {
         return sh.J.b;
      } else if (!var0.equals("snow") && !var0.equals("white")) {
         if (!var0.equals("adobe") && !var0.equals("orange")) {
            if (var0.equals("magenta")) {
               return sh.q.b;
            } else if (!var0.equals("light_blue") && !var0.equals("lightBlue")) {
               if (var0.equals("yellow")) {
                  return sh.s.b;
               } else if (var0.equals("lime")) {
                  return sh.t.b;
               } else if (var0.equals("pink")) {
                  return sh.u.b;
               } else if (var0.equals("gray")) {
                  return sh.v.b;
               } else if (var0.equals("silver")) {
                  return sh.w.b;
               } else if (var0.equals("cyan")) {
                  return sh.x.b;
               } else if (var0.equals("purple")) {
                  return sh.y.b;
               } else if (var0.equals("blue")) {
                  return sh.z.b;
               } else if (var0.equals("brown")) {
                  return sh.A.b;
               } else if (var0.equals("green")) {
                  return sh.B.b;
               } else if (var0.equals("red")) {
                  return sh.C.b;
               } else {
                  return var0.equals("black") ? sh.D.b : -1;
               }
            } else {
               return sh.r.b;
            }
         } else {
            return sh.p.b;
         }
      } else {
         return sh.i.b;
      }
   }

   private static int[] a() {
      sh[] var0 = sh.a;
      int[] var1 = new int[var0.length];
      Arrays.fill(var1, -1);

      for(int var2 = 0; var2 < var0.length && var2 < var1.length; ++var2) {
         sh var3 = var0[var2];
         if (var3 != null) {
            var1[var2] = var3.a;
         }
      }

      return var1;
   }

   private static void a(HM var0, int[] var1) {
      if (var1 != null) {
         sh[] var2 = sh.a;
         boolean var3 = false;

         for(int var4 = 0; var4 < var2.length && var4 < var1.length; ++var4) {
            sh var5 = var2[var4];
            if (var5 != null) {
               int var6 = var1[var4];
               if (var6 >= 0 && var5.a != var6) {
                  var5.a = var6;
                  var3 = true;
               }
            }
         }

         if (var3) {
            var0.a();
         }
      }

   }

   private static void a(String var0) {
      afT.a("CustomColors: " + var0);
   }

   private static void b(String var0) {
      afT.b("CustomColors: " + var0);
   }

   public static int a(int var0) {
      return f < 0 ? var0 : f;
   }

   public static int b(int var0) {
      return g < 0 ? var0 : g;
   }

   public static int c(int var0) {
      return h < 0 ? var0 : h;
   }

   // $FF: synthetic method
   static agc a() {
      return e;
   }

   // $FF: synthetic method
   static agc b() {
      return d;
   }

   // $FF: synthetic method
   static agc c() {
      return b;
   }

   // $FF: synthetic method
   static agc d() {
      return c;
   }

   // $FF: synthetic method
   static agc e() {
      return a;
   }

   static {
      a = RQ.c.a();
      b = RQ.a.a();
      a = new MM();
      a = new age();
      b = new agf();
      c = new agg();
      d = new agh();
      e = new agi();
   }
}
