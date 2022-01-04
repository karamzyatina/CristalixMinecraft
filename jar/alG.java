import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class alg {
   private static final Pattern a = Pattern.compile("^\\s*#version\\s+.*$");
   private static final Pattern b = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
   private static final Set<String> a = a();
   private static final Object2IntMap<String> a = a();
   private static final Object2IntMap<String> b = b();

   public static akX[] a(akj var0, String[] var1, IntList var2) {
      if (var0 == null) {
         return new akX[0];
      } else {
         HashMap var3 = new HashMap();
         a((akj)var0, (String)"/shaders", (String[])var1, (Map)var3);
         IntListIterator var4 = var2.iterator();

         while(var4.hasNext()) {
            int var5 = var4.nextInt();
            String var6 = "/shaders/world" + var5;
            a((akj)var0, (String)var6, (String[])var1, (Map)var3);
         }

         Collection var8 = var3.values();
         akX[] var9 = (akX[])((akX[])var8.toArray(new akX[0]));
         Comparator var7 = (var0x, var1x) -> {
            return var0x.a().compareToIgnoreCase(var1x.a());
         };
         Arrays.sort(var9, var7);
         return var9;
      }
   }

   private static void a(akj var0, String var1, String[] var2, Map<String, akX> var3) {
      for(int var4 = 0; var4 < var2.length; ++var4) {
         String var5 = var2[var4];
         if (!var5.equals("")) {
            String var6 = var1 + '/' + var5 + ".vsh";
            String var7 = var1 + '/' + var5 + ".fsh";
            a(var0, var6, var3);
            a(var0, var7, var3);
         }
      }

   }

   private static void a(akj var0, String var1, Map<String, akX> var2) {
      String[] var3 = a(var0, var1);

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         akX var6 = a(var5, var1);
         if (var6 != null && !var6.a().startsWith(akV.d()) && (!var6.d() || a(var6, var3))) {
            String var7 = var6.a();
            akX var8 = (akX)var2.get(var7);
            if (var8 != null) {
               if (!Objects.equals(var8.e(), var6.e())) {
                  afT.b("Ambiguous shader option: " + var6.a());
                  afT.b(" - in " + afT.a((Object[])var8.a()) + ": " + var8.e());
                  afT.b(" - in " + afT.a((Object[])var6.a()) + ": " + var6.e());
                  var8.a(false);
               }

               if (var8.b() == null || var8.b().length() <= 0) {
                  var8.a(var6.b());
               }

               var8.a(var6.a());
            } else {
               var2.put(var7, var6);
            }
         }
      }

   }

   private static boolean a(akX var0, String[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         String var3 = var1[var2];
         if (var0.d(var3)) {
            return true;
         }
      }

      return false;
   }

   private static String[] a(akj var0, String var1) {
      try {
         ArrayList var2 = new ArrayList();
         String var3 = a(var1, var0, 0, var2, 0);
         if (var3 == null) {
            return new String[0];
         } else {
            ByteArrayInputStream var4 = new ByteArrayInputStream(var3.getBytes());
            String[] var5 = afT.a((InputStream)var4);
            return var5;
         }
      } catch (IOException var6) {
         afT.a(var6.getClass().getName() + ": " + var6.getMessage());
         return new String[0];
      }
   }

   private static akX a(String var0, String var1) {
      akX var2 = alc.a(var0, var1);
      if (var2 == null) {
         var2 = ale.a(var0, var1);
      }

      if (var2 != null) {
         return var2;
      } else {
         var2 = ald.b(var0, var1);
         if (var2 == null) {
            var2 = alf.b(var0, var1);
         }

         return var2 != null && a.contains(var2.a()) ? var2 : null;
      }
   }

   private static Set<String> a() {
      HashSet var0 = new HashSet();
      var0.add("shadowMapResolution");
      var0.add("shadowMapFov");
      var0.add("shadowDistance");
      var0.add("shadowDistanceRenderMul");
      var0.add("shadowIntervalSize");
      var0.add("generateShadowMipmap");
      var0.add("generateShadowColorMipmap");
      var0.add("shadowHardwareFiltering");
      var0.add("shadowHardwareFiltering0");
      var0.add("shadowHardwareFiltering1");
      var0.add("shadowtex0Mipmap");
      var0.add("shadowtexMipmap");
      var0.add("shadowtex1Mipmap");
      var0.add("shadowcolor0Mipmap");
      var0.add("shadowColor0Mipmap");
      var0.add("shadowcolor1Mipmap");
      var0.add("shadowColor1Mipmap");
      var0.add("shadowtex0Nearest");
      var0.add("shadowtexNearest");
      var0.add("shadow0MinMagNearest");
      var0.add("shadowtex1Nearest");
      var0.add("shadow1MinMagNearest");
      var0.add("shadowcolor0Nearest");
      var0.add("shadowColor0Nearest");
      var0.add("shadowColor0MinMagNearest");
      var0.add("shadowcolor1Nearest");
      var0.add("shadowColor1Nearest");
      var0.add("shadowColor1MinMagNearest");
      var0.add("wetnessHalflife");
      var0.add("drynessHalflife");
      var0.add("eyeBrightnessHalflife");
      var0.add("centerDepthHalflife");
      var0.add("sunPathRotation");
      var0.add("ambientOcclusionLevel");
      var0.add("superSamplingLevel");
      var0.add("noiseTextureResolution");
      return var0;
   }

   public static ali[] a(Properties var0, akX[] var1) {
      String var2 = "profile.";
      ArrayList var3 = new ArrayList();
      Iterator var4 = var0.keySet().iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if (var5.startsWith(var2)) {
            String var6 = var5.substring(var2.length());
            var0.getProperty(var5);
            HashSet var7 = new HashSet();
            ali var8 = a((String)var6, (Properties)var0, (Set)var7, (akX[])var1);
            if (var8 != null) {
               var3.add(var8);
            }
         }
      }

      if (var3.size() <= 0) {
         return null;
      } else {
         ali[] var9 = (ali[])((ali[])var3.toArray(new ali[0]));
         return var9;
      }
   }

   public static Map<String, aiQ> a(Properties var0, akX[] var1) {
      Pattern var2 = Pattern.compile("program\\.([^.]+)\\.enabled");
      HashMap var3 = new HashMap();
      Iterator var4 = var0.keySet().iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         Matcher var6 = var2.matcher(var5);
         if (var6.matches()) {
            String var7 = var6.group(1);
            String var8 = var0.getProperty(var5).trim();
            aiQ var9 = a(var8, var1);
            if (var9 == null) {
               akt.a("Error parsing program condition: " + var5);
            } else {
               var3.put(var7, var9);
            }
         }
      }

      return var3;
   }

   private static aiQ a(String var0, akX[] var1) {
      try {
         akZ var2 = new akZ(var1);
         aiH var3 = new aiH(var2);
         aiQ var4 = var3.a(var0);
         return var4;
      } catch (aiY var5) {
         akt.b(var5.getClass().getName() + ": " + var5.getMessage());
         return null;
      }
   }

   public static Set<String> a(Properties var0, akX[] var1) {
      HashSet var2 = new HashSet();
      String var3 = var0.getProperty("sliders");
      if (var3 == null) {
         return var2;
      } else {
         String[] var4 = afT.a(var3, " ");

         for(int var5 = 0; var5 < var4.length; ++var5) {
            String var6 = var4[var5];
            akX var7 = akB.a(var6, var1);
            if (var7 == null) {
               afT.b("Invalid shader option: " + var6);
            } else {
               var2.add(var6);
            }
         }

         return var2;
      }
   }

   private static ali a(String var0, Properties var1, Set<String> var2, akX[] var3) {
      String var4 = "profile.";
      String var5 = var4 + var0;
      if (var2.contains(var5)) {
         afT.b("[Shaders] Profile already parsed: " + var0);
         return null;
      } else {
         var2.add(var0);
         ali var6 = new ali(var0);
         String var7 = var1.getProperty(var5);
         String[] var8 = afT.a(var7, " ");

         for(int var9 = 0; var9 < var8.length; ++var9) {
            String var10 = var8[var9];
            if (var10.startsWith(var4)) {
               String var11 = var10.substring(var4.length());
               ali var12 = a(var11, var1, var2, var3);
               if (var6 != null) {
                  var6.a(var12);
                  var6.a(var12.a());
               }
            } else {
               String[] var16 = afT.a(var10, ":=");
               String var17;
               if (var16.length == 1) {
                  var17 = var16[0];
                  boolean var13 = true;
                  if (!var17.isEmpty() && var17.charAt(0) == '!') {
                     var13 = false;
                     var17 = var17.substring(1);
                  }

                  String var14 = "program.";
                  if (var17.startsWith(var14)) {
                     String var15 = var17.substring(var14.length());
                     if (!akC.b(var15)) {
                        afT.b("Invalid program: " + var15 + " in profile: " + var6.a());
                     } else if (var13) {
                        var6.b(var15);
                     } else {
                        var6.a(var15);
                     }
                  } else {
                     akX var20 = akB.a(var17, var3);
                     if (!(var20 instanceof alc)) {
                        afT.b("[Shaders] Invalid option: " + var17);
                     } else {
                        var6.a(var17, String.valueOf(var13));
                        var20.b(true);
                     }
                  }
               } else if (var16.length != 2) {
                  afT.b("[Shaders] Invalid option value: " + var10);
               } else {
                  var17 = var16[0];
                  String var18 = var16[1];
                  akX var19 = akB.a(var17, var3);
                  if (var19 == null) {
                     afT.b("[Shaders] Invalid option: " + var10);
                  } else if (!var19.b(var18)) {
                     afT.b("[Shaders] Invalid value: " + var10);
                  } else {
                     var19.b(true);
                     var6.a(var17, var18);
                  }
               }
            }
         }

         return var6;
      }
   }

   public static Map<String, akS> a(Properties var0, ali[] var1, akX[] var2) {
      HashMap var3 = new HashMap();
      a("screen", (Properties)var0, (Map)var3, (ali[])var1, (akX[])var2);
      return var3.isEmpty() ? null : var3;
   }

   private static boolean a(String var0, Properties var1, Map<String, akS> var2, ali[] var3, akX[] var4) {
      String var5 = var1.getProperty(var0);
      if (var5 == null) {
         return false;
      } else {
         ArrayList var6 = new ArrayList();
         HashSet var7 = new HashSet();
         String[] var8 = afT.a(var5, " ");

         String var10;
         for(int var9 = 0; var9 < var8.length; ++var9) {
            var10 = var8[var9];
            if (var10.equals("<empty>")) {
               var6.add((Object)null);
            } else if (var7.contains(var10)) {
               afT.b("[Shaders] Duplicate option: " + var10 + ", key: " + var0);
            } else {
               var7.add(var10);
               if (var10.equals("<profile>")) {
                  if (var3 == null) {
                     afT.b("[Shaders] Option profile can not be used, no profiles defined: " + var10 + ", key: " + var0);
                  } else {
                     akY var16 = new akY(var3, var4);
                     var6.add(var16);
                  }
               } else if (var10.equals("*")) {
                  ala var15 = new ala("<rest>");
                  var6.add(var15);
               } else if (!var10.isEmpty() && var10.charAt(0) == '[' && !var10.isEmpty() && var10.charAt(var10.length() - 1) == ']') {
                  String var14 = ami.c(var10, "[", "]");
                  if (!var14.matches("^[a-zA-Z0-9_]+$")) {
                     afT.b("[Shaders] Invalid screen: " + var10 + ", key: " + var0);
                  } else if (!a("screen." + var14, var1, var2, var3, var4)) {
                     afT.b("[Shaders] Invalid screen: " + var10 + ", key: " + var0);
                  } else {
                     alb var12 = new alb(var14);
                     var6.add(var12);
                  }
               } else {
                  akX var11 = akB.a(var10, var4);
                  if (var11 == null) {
                     afT.b("[Shaders] Invalid option: " + var10 + ", key: " + var0);
                     var6.add((Object)null);
                  } else {
                     var11.b(true);
                     var6.add(var11);
                  }
               }
            }
         }

         akX[] var13 = (akX[])((akX[])var6.toArray(new akX[0]));
         var10 = var1.getProperty(var0 + ".columns");
         int var17 = afT.a((String)var10, 2);
         akS var18 = new akS(var0, var13, var17);
         var2.put(var0, var18);
         return true;
      }
   }

   public static BufferedReader a(BufferedReader var0, String var1, akj var2, int var3, List<String> var4, int var5) {
      String var6 = "/";
      int var7 = var1.lastIndexOf("/");
      if (var7 >= 0) {
         var6 = var1.substring(0, var7);
      }

      CharArrayWriter var8 = new CharArrayWriter();
      int var9 = -1;
      LinkedHashSet var10 = new LinkedHashSet();
      int var11 = 1;

      while(true) {
         String var12 = var0.readLine();
         String var15;
         akU var26;
         if (var12 == null) {
            char[] var19 = var8.toCharArray();
            if (var9 >= 0 && var10.size() > 0) {
               StringBuilder var21 = new StringBuilder();
               Iterator var25 = var10.iterator();

               while(var25.hasNext()) {
                  var26 = (akU)var25.next();
                  var21.append("#define ");
                  var21.append(var26.a());
                  var21.append(' ');
                  var21.append(var26.b());
                  var21.append('\n');
               }

               var15 = var21.toString();
               StringBuilder var27 = new StringBuilder(new String(var19));
               var27.insert(var9, var15);
               String var28 = var27.toString();
               var19 = var28.toCharArray();
            }

            CharArrayReader var22 = new CharArrayReader(var19);
            return new BufferedReader(var22);
         }

         Matcher var13;
         String var14;
         String var16;
         if (var9 < 0) {
            var13 = a.matcher(var12);
            if (var13.matches()) {
               var14 = akV.e() + akV.f();
               var15 = var12 + '\n' + var14;
               var16 = "#line " + (var11 + 1) + ' ' + var3;
               var12 = var15 + var16;
               var9 = var8.size() + var15.length();
            }
         }

         var13 = b.matcher(var12);
         if (var13.matches()) {
            var14 = var13.group(1);
            boolean var23 = !var14.isEmpty() && var14.charAt(0) == '/';
            var16 = var23 ? "/shaders" + var14 : var6 + '/' + var14;
            if (!var4.contains(var16)) {
               var4.add(var16);
            }

            int var17 = var4.indexOf(var16) + 1;
            var12 = a(var16, var2, var17, var4, var5);
            if (var12 == null) {
               throw new IOException("Included file not found: " + var1);
            }

            if (!var12.isEmpty() && var12.charAt(var12.length() - 1) == '\n') {
               var12 = var12.substring(0, var12.length() - 1);
            }

            String var18 = "#line 1 " + var17 + '\n';
            if (var12.startsWith("#version ")) {
               var18 = "";
            }

            var12 = var18 + var12 + "\n#line " + (var11 + 1) + ' ' + var3;
         }

         if (var9 >= 0 && var12.contains(akV.d())) {
            akU[] var20 = a(var12, akV.a());

            for(int var24 = 0; var24 < var20.length; ++var24) {
               var26 = var20[var24];
               var10.add(var26);
            }
         }

         var8.write(var12);
         var8.write("\n");
         ++var11;
      }
   }

   private static akU[] a(String var0, akU[] var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         akU var4 = var1[var3];
         if (var0.contains(var4.a())) {
            var2.add(var4);
         }
      }

      akU[] var5 = (akU[])((akU[])var2.toArray(new akU[0]));
      return var5;
   }

   private static String a(String var0, akj var1, int var2, List<String> var3, int var4) {
      if (var4 >= 10) {
         throw new IOException("#include depth exceeded: " + var4 + ", file: " + var0);
      } else {
         ++var4;
         InputStream var5 = var1.a(var0);
         if (var5 == null) {
            return null;
         } else {
            InputStreamReader var6 = new InputStreamReader(var5, StandardCharsets.US_ASCII);
            BufferedReader var7 = new BufferedReader(var6);
            var7 = a(var7, var0, var1, var2, var3, var4);
            CharArrayWriter var8 = new CharArrayWriter();

            while(true) {
               String var9 = var7.readLine();
               if (var9 == null) {
                  return var8.toString();
               }

               var8.write(var9);
               var8.write("\n");
            }
         }
      }
   }

   public static alt a(Properties var0) {
      String var1 = "uniform";
      String var2 = "variable";
      HashMap var3 = new HashMap();
      ArrayList var4 = new ArrayList();
      Iterator var5 = var0.keySet().iterator();

      while(true) {
         while(true) {
            String var6;
            String[] var7;
            do {
               if (!var5.hasNext()) {
                  if (var4.size() <= 0) {
                     return null;
                  }

                  als[] var13 = (als[])((als[])var4.toArray(new als[0]));
                  alt var14 = new alt(var13, var3);
                  return var14;
               }

               var6 = (String)var5.next();
               var7 = afT.a(var6, ".");
            } while(var7.length != 3);

            String var8 = var7[0];
            String var9 = var7[1];
            String var10 = var7[2];
            String var11 = var0.getProperty(var6).trim();
            if (var3.containsKey(var10)) {
               akt.b("Expression already defined: " + var10);
            } else if (var8.equals(var1) || var8.equals(var2)) {
               akt.c("Custom " + var8 + ": " + var10);
               als var12 = a(var8, (String)var10, (String)var9, (String)var11, (Map)var3);
               if (var12 != null) {
                  var3.put(var10, var12.a());
                  if (!var8.equals(var2)) {
                     var4.add(var12);
                  }
               } else {
                  akt.b("Unknown custom uniform: " + var8 + '/' + var10);
               }
            }
         }
      }
   }

   private static als a(String var0, String var1, String var2, String var3, Map<String, aiP> var4) {
      try {
         alL var5 = alL.a(var2);
         if (var5 == null) {
            akt.b("Unknown " + var0 + " type: " + var5);
            return null;
         } else {
            alu var6 = new alu(var4);
            aiH var7 = new aiH(var6);
            aiP var8 = var7.a(var3);
            aiJ var9 = var8.a();
            if (!var5.a(var9)) {
               akt.b("Expression type does not match " + var0 + " type, expression: " + var9 + ", " + var0 + ": " + var5 + ' ' + var1);
               return null;
            } else {
               var8 = a(var8);
               als var10 = new als(var1, var5, var8);
               return var10;
            }
         }
      } catch (aiY var11) {
         akt.b(var11.getClass().getName() + ": " + var11.getMessage());
         return null;
      }
   }

   private static aiP a(aiP var0) {
      if (var0 instanceof aiS) {
         return new aiG((aiS)var0);
      } else {
         return (aiP)(var0 instanceof aiT ? new aiF((aiT)var0) : var0);
      }
   }

   public static void a(Properties var0) {
      Iterator var1 = var0.keySet().iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         String[] var3 = afT.a(var2, ".");
         if (var3.length == 2) {
            String var4 = var3[0];
            String var5 = var3[1];
            if (var4.equals("alphaTest")) {
               akp var6 = akC.a(var5);
               if (var6 == null) {
                  akt.a("Invalid program name: " + var5);
               } else {
                  String var7 = var0.getProperty(var2).trim();
                  ajT var8 = a(var7);
                  if (var8 != null) {
                     var6.a(var8);
                  }
               }
            }
         }
      }

   }

   private static ajT a(String var0) {
      String[] var1 = afT.a(var0, " ");
      if (var1.length == 1) {
         String var2 = var1[0];
         if (var2.equals("off") || var2.equals("false")) {
            return new ajT(false);
         }
      } else if (var1.length == 2) {
         int var4 = a.getInt(var1[0]);
         float var3;
         if (var4 != 0 && (var3 = afT.a(var1[1], -1.0F)) >= 0.0F) {
            return new ajT(true, var4, var3);
         }
      }

      akt.a("Invalid alpha test: " + var0);
      return null;
   }

   public static void b(Properties var0) {
      Iterator var1 = var0.keySet().iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         String[] var3 = afT.a(var2, ".");
         if (var3.length == 2) {
            String var4 = var3[0];
            String var5 = var3[1];
            if (var4.equals("blend")) {
               akp var6 = akC.a(var5);
               if (var6 == null) {
                  akt.a("Invalid program name: " + var5);
               } else {
                  String var7 = var0.getProperty(var2).trim();
                  ajU var8 = a(var7);
                  if (var8 != null) {
                     var6.a(var8);
                  }
               }
            }
         }
      }

   }

   private static ajU a(String var0) {
      String[] var1 = afT.a(var0, " ");
      String var2;
      if (var1.length == 1) {
         var2 = var1[0];
         if (var2.equals("off") || var2.equals("false")) {
            return new ajU(false);
         }
      } else if (var1.length == 2 || var1.length == 4) {
         var2 = var1[0];
         String var3 = var1[1];
         String var4 = var2;
         String var5 = var3;
         if (var1.length == 4) {
            var4 = var1[2];
            var5 = var1[3];
         }

         int var6 = b.getInt(var2);
         int var7 = b.getInt(var3);
         int var8 = b.getInt(var4);
         int var9 = b.getInt(var5);
         if (var6 != -1 && var7 != -1 && var8 != -1 && var9 != -1) {
            return new ajU(true, var6, var7, var8, var9);
         }
      }

      akt.a("Invalid blend mode: " + var0);
      return null;
   }

   public static void c(Properties var0) {
      Iterator var1 = var0.keySet().iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         String[] var3 = afT.a(var2, ".");
         if (var3.length == 2) {
            String var4 = var3[0];
            String var5 = var3[1];
            if (var4.equals("scale")) {
               akp var6 = akC.a(var5);
               if (var6 == null) {
                  akt.a("Invalid program name: " + var5);
               } else {
                  String var7 = var0.getProperty(var2).trim();
                  akR var8 = a(var7);
                  if (var8 != null) {
                     var6.a(var8);
                  }
               }
            }
         }
      }

   }

   private static akR a(String var0) {
      String[] var1 = afT.a(var0, " ");
      float var2 = afT.a(var1[0], -1.0F);
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (var1.length > 1) {
         if (var1.length != 3) {
            akt.a("Invalid render scale: " + var0);
            return null;
         }

         var3 = afT.a(var1[1], -1.0F);
         var4 = afT.a(var1[2], -1.0F);
      }

      if (afT.a(var2, 0.0F, 1.0F) && afT.a(var3, 0.0F, 1.0F) && afT.a(var4, 0.0F, 1.0F)) {
         return new akR(var2, var3, var4);
      } else {
         akt.a("Invalid render scale: " + var0);
         return null;
      }
   }

   public static void d(Properties var0) {
      Iterator var1 = var0.keySet().iterator();

      while(true) {
         while(true) {
            String var2;
            String var4;
            String var5;
            String var6;
            do {
               String[] var3;
               do {
                  if (!var1.hasNext()) {
                     return;
                  }

                  var2 = (String)var1.next();
                  var3 = afT.a(var2, ".");
               } while(var3.length != 3);

               var4 = var3[0];
               var5 = var3[1];
               var6 = var3[2];
            } while(!var4.equals("flip"));

            akp var7 = akC.a(var5);
            if (var7 == null) {
               akt.a("Invalid program name: " + var5);
            } else {
               Boolean[] var8 = var7.a();
               int var9 = akC.c(var6);
               if (var9 >= 0 && var9 < var8.length) {
                  String var10 = var0.getProperty(var2).trim();
                  Boolean var11 = afT.a(var10, (Boolean)null);
                  if (var11 == null) {
                     akt.a("Invalid boolean value: " + var10);
                  } else {
                     var8[var9] = var11;
                  }
               } else {
                  akt.a("Invalid buffer name: " + var6);
               }
            }
         }
      }
   }

   private static Object2IntMap<String> a() {
      Object2IntOpenHashMap var0 = new Object2IntOpenHashMap();
      var0.put("NEVER", 512);
      var0.put("LESS", 513);
      var0.put("EQUAL", 514);
      var0.put("LEQUAL", 515);
      var0.put("GREATER", 516);
      var0.put("NOTEQUAL", 517);
      var0.put("GEQUAL", 518);
      var0.put("ALWAYS", 519);
      return var0;
   }

   private static Object2IntMap<String> b() {
      Object2IntOpenHashMap var0 = new Object2IntOpenHashMap();
      var0.put("ZERO", 0);
      var0.put("ONE", 1);
      var0.put("SRC_COLOR", 768);
      var0.put("ONE_MINUS_SRC_COLOR", 769);
      var0.put("DST_COLOR", 774);
      var0.put("ONE_MINUS_DST_COLOR", 775);
      var0.put("SRC_ALPHA", 770);
      var0.put("ONE_MINUS_SRC_ALPHA", 771);
      var0.put("DST_ALPHA", 772);
      var0.put("ONE_MINUS_DST_ALPHA", 773);
      var0.put("CONSTANT_COLOR", 32769);
      var0.put("ONE_MINUS_CONSTANT_COLOR", 32770);
      var0.put("CONSTANT_ALPHA", 32771);
      var0.put("ONE_MINUS_CONSTANT_ALPHA", 32772);
      var0.put("SRC_ALPHA_SATURATE", 776);
      var0.defaultReturnValue(-1);
      return var0;
   }
}
