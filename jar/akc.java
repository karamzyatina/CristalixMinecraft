import dev.xdark.feder.IOUtil;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.opengl.ARBGeometryShader4;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Vector4f;

public final class akC {
   private static boolean v = false;
   public static ContextCapabilities a;
   public static boolean a = false;
   public static int a = 0;
   private static int K = 0;
   private static int L = 0;
   public static int b = 0;
   public static int c = 0;
   public static boolean b = false;
   private static boolean w = false;
   private static boolean x = false;
   private static boolean y = false;
   public static boolean c = false;
   private static boolean z = false;
   private static boolean A;
   private static boolean B;
   private static boolean C;
   private static boolean D;
   private static boolean E;
   public static boolean d = false;
   private static boolean F = false;
   private static boolean G = false;
   private static final float[] j = new float[4];
   private static final float[] k = new float[4];
   private static final float[] l = new float[4];
   private static final float[] m = new float[4];
   static final float[] a = new float[4];
   private static final float[] n = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   private static final float[] o = new float[]{0.0F, 100.0F, 0.0F, 0.0F};
   private static final float[] p = new float[]{0.0F, -100.0F, 0.0F, 0.0F};
   private static final float[] q = new float[16];
   private static float r;
   private static float s;
   private static float t;
   private static float u;
   private static float v;
   private static float w;
   private static long a = 0L;
   private static long b = 0L;
   private static long c = 0L;
   private static float x = 0.0F;
   private static float y = 0.0F;
   private static float z = 0.0F;
   private static int M = 0;
   private static long d = 0L;
   private static long e = 0L;
   private static long f = 0L;
   private static int N = 0;
   private static float A = 0.0F;
   private static float B = 0.0F;
   private static float C = 0.0F;
   private static float D = 0.0F;
   private static float E = 600.0F;
   private static float F = 200.0F;
   private static float G = 10.0F;
   private static int O = 0;
   private static int P = 0;
   private static float H = 0.0F;
   private static float I = 0.0F;
   private static float J = 0.0F;
   private static float K = 0.0F;
   private static float L = 0.0F;
   private static float M = 1.0F;
   private static boolean H = false;
   private static int Q = 1;
   private static float N = 0.0F;
   private static float O = 0.0F;
   private static boolean I = false;
   static boolean e = true;
   public static final int d = 10;
   public static final int e = 11;
   public static final int f = 12;
   public static boolean f = false;
   public static boolean g = false;
   public static boolean h = false;
   public static boolean i = false;
   public static boolean j = false;
   public static boolean k = false;
   private static boolean J = false;
   private static int R = 3;
   private static boolean K = false;
   public static int g = 0;
   public static int h = 0;
   private static final alJ a = new alJ();
   public static final alF a;
   public static final alB a;
   public static final alB b;
   public static final alB c;
   public static final alB d;
   public static final alB e;
   public static final alB f;
   public static final alB g;
   public static final alB h;
   public static final alB i;
   public static final alB j;
   public static final alB k;
   public static final alB l;
   public static final alB m;
   public static final alB n;
   public static final alB o;
   public static final alB p;
   public static final alB q;
   public static final alB r;
   public static final alB s;
   public static final alB t;
   public static final alB u;
   public static final alB v;
   public static final alB w;
   public static final alB x;
   public static final alB y;
   public static final alB z;
   public static final alB A;
   public static final alB B;
   public static final alB C;
   public static final alB D;
   public static final alB E;
   public static final alB F;
   public static final alB G;
   public static final alB H;
   public static final alB I;
   public static final alB J;
   public static final alB K;
   public static final alB L;
   public static final alB M;
   public static final alB N;
   public static final alA a;
   public static final alE a;
   public static final alE b;
   public static final alB O;
   public static final alB P;
   public static final alB Q;
   public static final alB R;
   public static final alA b;
   public static final alA c;
   public static final alA d;
   public static final alA e;
   public static final alA f;
   public static final alA g;
   public static final alA h;
   public static final alA i;
   public static final alA j;
   public static final alA k;
   public static final alE c;
   public static final alE d;
   public static final alE e;
   public static final alE f;
   public static final alE g;
   public static final alE h;
   public static final alI a;
   public static final alI b;
   public static final alI c;
   public static final alI d;
   public static final alI e;
   public static final alI f;
   public static final alI g;
   public static final alI h;
   public static final alI i;
   public static final alI j;
   public static final alA l;
   public static final alA m;
   public static final alD a;
   public static final alD b;
   public static final alD c;
   public static final alB S;
   public static final alB T;
   public static final alA n;
   public static final alA o;
   public static final alA p;
   public static final alB U;
   public static final alA q;
   public static final alD d;
   public static final alG a;
   public static final alB V;
   static double a;
   static double b;
   static double c;
   static double d;
   static double e;
   static double f;
   static int i;
   static int j;
   static int k;
   public static boolean l;
   static int l;
   static int m;
   static int n;
   static int o;
   static float a;
   static float b;
   static boolean m;
   static float c;
   static int p;
   static int q;
   public static boolean n;
   static boolean o;
   static int r;
   static int s;
   static int t;
   static int u;
   static int v;
   static int w;
   static int x;
   static int y;
   private static final int[] e;
   public static final boolean[] a;
   public static final Vector4f[] a;
   private static final aks a;
   public static final akp a;
   public static final akp b;
   public static final akp c;
   public static final akp d;
   public static final akp e;
   public static final akp f;
   public static final akp g;
   public static final akp h;
   public static final akp i;
   public static final akp j;
   public static final akp k;
   public static final akp l;
   public static final akp m;
   public static final akp n;
   public static final akp o;
   public static final akp p;
   public static final akp q;
   public static final akp r;
   public static final akp s;
   public static final akp t;
   public static final akp u;
   public static final akp[] a;
   public static final akp v;
   public static final akp w;
   public static final akp x;
   public static final akp[] b;
   public static final akp y;
   public static final int z;
   public static final akp[] c;
   public static akp z;
   public static int A;
   private static final akq a;
   private static boolean L;
   static IntBuffer a;
   private static int S;
   public static Properties a;
   public static HA a;
   public static boolean[] b;
   public static boolean[] c;
   public static boolean[] d;
   public static boolean[] e;
   public static boolean[] f;
   public static boolean p;
   public static boolean q;
   public static float d;
   public static float e;
   public static float f;
   public static int B;
   public static int C;
   public static int D;
   public static int E;
   public static int F;
   public static int G;
   public static boolean r;
   public static boolean s;
   public static boolean t;
   public static final akQ a;
   public static final akQ b;
   public static int H;
   public static final String[] a;
   public static final String[] b;
   public static final int[] a;
   public static final int[] b;
   private static akj a;
   public static boolean u;
   public static String a;
   public static final File a;
   static File b;
   private static akX[] a;
   private static Set<String> a;
   static ali[] a;
   static Map<String, akS> a;
   static Map<String, aiQ> b;
   public static final akP a;
   public static final akQ c;
   public static final akQ d;
   public static final akQ e;
   public static final akQ f;
   public static final akQ g;
   public static final akQ h;
   public static final akQ i;
   public static final akQ j;
   public static final akQ k;
   public static final akQ l;
   public static final akQ m;
   public static final akQ n;
   public static final akQ o;
   public static final akQ p;
   public static final akQ q;
   public static final akQ r;
   private static final Map<String, String> c;
   private static final IntList a;
   private static aki[] a;
   private static aki[] b;
   private static aki[] c;
   private static String b;
   private static alt a;
   private static final String[] c;
   public static float g;
   public static float h;
   public static float i;
   public static float j;
   public static float k;
   public static float l;
   public static int I;
   public static float m;
   public static float n;
   public static float o;
   public static float p;
   public static float q;
   public static int J;
   public static int[] c;
   private static aki a;
   private static boolean M;
   private static int T;
   static final int[] d;
   private static final int U;
   private static final ByteBuffer a;
   static final float[] b;
   static final float[] c;
   static final float[] d;
   static final float[] e;
   static final float[] f;
   static final float[] g;
   static final float[] h;
   static final float[] i;
   static final FloatBuffer a;
   static final FloatBuffer b;
   static final FloatBuffer c;
   static final FloatBuffer d;
   static final FloatBuffer e;
   static final FloatBuffer f;
   static final FloatBuffer g;
   static final FloatBuffer h;
   static final FloatBuffer i;
   static final FloatBuffer j;
   static final FloatBuffer k;
   static final FloatBuffer l;
   static final IntBuffer b;
   static final IntBuffer c;
   static final IntBuffer d;
   static final IntBuffer e;
   static final IntBuffer f;
   static final IntBuffer g;
   static final IntBuffer h;
   static final IntBuffer i;
   static final akg a;
   static Object2IntMap<nh> a;
   private static final String[] d;
   private static final int[] f;
   private static final Pattern a;

   public static IntBuffer a(int var0) {
      return Bx.a(a, var0, 4).asIntBuffer();
   }

   private static FloatBuffer a(int var0) {
      return Bx.a(a, var0, 4).asFloatBuffer();
   }

   public static void a(sE var0) {
      akt.c("Load shaders configuration.");

      try {
         a.mkdir();
      } catch (Exception var9) {
         akt.a("Failed to open the shaderpacks directory: " + a);
      }

      a = new Properties();
      a.setProperty(akJ.SHADER_PACK.b(), "");
      if (b.isFile()) {
         try {
            FileReader var1 = new FileReader(b);
            a.load(var1);
            var1.close();
         } catch (Exception var8) {
         }
      } else {
         try {
            a();
         } catch (Exception var7) {
         }
      }

      akJ[] var10 = akJ.VALUES;

      for(int var2 = 0; var2 < var10.length; ++var2) {
         akJ var3 = var10[var2];
         String var4 = var3.b();
         String var5 = var3.c();
         String var6 = a.getProperty(var4, var5);
         a(var3, var6);
      }

      b(var0);
   }

   private static void a(akJ var0, String var1) {
      // $FF: Couldn't be decompiled
   }

   public static void a() {
      akt.c("Save shaders configuration.");
      if (a == null) {
         a = new Properties();
      }

      akJ[] var0 = akJ.VALUES;

      for(int var1 = 0; var1 < var0.length; ++var1) {
         akJ var2 = var0[var1];
         String var3 = var2.b();
         String var4 = a(var2);
         a.setProperty(var3, var4);
      }

      try {
         FileWriter var6 = new FileWriter(b);
         a.store(var6, (String)null);
         var6.close();
      } catch (Exception var5) {
         akt.a("Error saving configuration: " + var5.getClass().getName() + ": " + var5.getMessage());
      }

   }

   public static String a(akJ var0) {
      // $FF: Couldn't be decompiled
   }

   public static void a(sE var0, String var1) {
      a = var1;
      a.setProperty(akJ.SHADER_PACK.b(), var1);
      b(var0);
   }

   public static void b(sE var0) {
      boolean var1 = u;
      boolean var2 = c();
      Ck var3 = var0.a;
      if (var3 != null) {
         var3.g();
      }

      u = false;
      if (a != null) {
         a.a();
         a = null;
         c.clear();
         a.clear();
         a = null;
         a = null;
         a = null;
         a = null;
         b.clear();
         a.b();
         d.b();
         e.b();
         c.b();
         x();
         b = null;
      }

      boolean var4 = false;
      if (afT.M()) {
         akt.c("Shaders can not be loaded, Antialiasing is enabled: " + afT.e() + 'x');
         var4 = true;
      }

      if (afT.L()) {
         akt.c("Shaders can not be loaded, Anisotropic Filtering is enabled: " + afT.d() + 'x');
         var4 = true;
      }

      if (afT.ac()) {
         akt.c("Shaders can not be loaded, Fast Render is enabled.");
         var4 = true;
      }

      String var5 = a.getProperty(akJ.SHADER_PACK.b(), "(internal)");
      if (!var4) {
         a = a(var5);
         u = a != null;
      }

      if (u) {
         akt.c("Loaded shaderpack: " + a());
      } else {
         akt.c("No shaderpack loaded.");
         a = akz.a;
      }

      b(var0.a);
      w();
      a = b();
      a(var0, var0.a(), var0.a());
      boolean var6 = u != var1;
      boolean var7 = c() != var2;
      if (var6 || var7) {
         In.a();
         c();
      }

      if (var3 != null) {
         var3.h();
      }

      if (var6 || var7) {
         var0.m();
      }

   }

   public static akj a(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.trim();
         if (!var0.isEmpty() && !var0.equals("OFF")) {
            if (var0.equals("(internal)")) {
               return new akx();
            } else {
               try {
                  File var1 = new File(a, var0);
                  if (var1.isDirectory()) {
                     return new aky(var0, var1);
                  } else {
                     return var1.isFile() && var0.toLowerCase().endsWith(".zip") ? new akA(var0, var1) : null;
                  }
               } catch (Exception var2) {
                  var2.printStackTrace();
                  return null;
               }
            }
         } else {
            return null;
         }
      }
   }

   public static akj a() {
      return a;
   }

   private static void w() {
      a.clear();

      for(int var0 = -1; var0 <= 1; ++var0) {
         String var1 = "/shaders/world" + var0;
         if (a.a(var1)) {
            a.add(var0);
         }
      }

      if (!a.isEmpty()) {
         afT.a("[Shaders] Worlds: " + a);
      }

   }

   private static void a(sE var0, HM var1, IN var2) {
      a.b();
      d.b();
      e.b();
      c.b();
      f.b();
      g.b();
      h.b();
      i.b();
      j.b();
      k.b();
      l.b();
      m.b();
      n.b();
      o.b();
      p.b();
      q.b();
      r.b();
      ajZ.a();
      akk.a();
      akf.a();
      a = null;
      akp[] var3 = c;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4].a();
      }

      if (a != null) {
         ajZ.a(var0, a);
         akk.a(var0, a);
         akf.a(var0, a);
         String var8 = "/shaders/shaders.properties";

         try {
            InputStream var5 = a.a(var8);
            if (var5 == null) {
               return;
            }

            var5 = akM.a(var0, var5);
            Properties var6 = new Properties();
            var6.load(var5);
            var5.close();
            a.a(var6);
            d.a(var6);
            e.a(var6);
            c.a(var6);
            f.a(var6);
            g.a(var6);
            h.a(var6);
            j.a(var6);
            i.a(var6);
            k.a(var6);
            l.a(var6);
            m.a(var6);
            n.a(var6);
            o.a(var6);
            p.a(var6);
            q.a(var6);
            r.a(var6);
            a = alg.a(var6, a);
            a = alg.a(var6, a);
            a = alg.a(var6, a, a);
            b = alg.a(var6, a);
            a = a(var1, var2, var6, 0);
            b = a(var1, var2, var6, 1);
            c = a(var1, var2, var6, 2);
            b = var6.getProperty("texture.noise");
            if (b != null) {
               M = true;
            }

            a = alg.a(var6);
            alg.a(var6);
            alg.b(var6);
            alg.c(var6);
            alg.d(var6);
         } catch (IOException var7) {
            akt.b("Error reading: " + var8);
         }
      }

   }

   private static aki[] a(HM var0, IN var1, Properties var2, int var3) {
      String var4 = "texture." + c[var3] + '.';
      Set var5 = var2.keySet();
      ArrayList var6 = new ArrayList();
      Iterator var7 = var5.iterator();

      while(var7.hasNext()) {
         String var8 = (String)var7.next();
         if (var8.startsWith(var4)) {
            String var9 = ami.a(var8, var4);
            var9 = ami.a(var9, new String[]{".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9"});
            String var10 = var2.getProperty(var8).trim();
            int var11 = a(var3, var9);
            if (var11 < 0) {
               akt.b("Invalid texture name: " + var8);
            } else {
               aki var12 = a(var0, var1, var11, var10);
               if (var12 != null) {
                  akt.c("Custom texture: " + var8 + " = " + var10);
                  var6.add(var12);
               } else {
                  akt.b("Unknown custom texture: " + var8 + '=' + var10);
               }
            }
         }
      }

      if (var6.size() <= 0) {
         return null;
      } else {
         aki[] var13 = (aki[])((aki[])var6.toArray(new aki[0]));
         return var13;
      }
   }

   private static aki a(HM var0, IN var1, int var2, String var3) {
      if (var3 == null) {
         return null;
      } else {
         var3 = var3.trim();
         if (var3.indexOf(58) >= 0) {
            return a(var0, var2, var3);
         } else {
            return var3.indexOf(32) >= 0 ? a(var2, var3) : a(var1, var2, var3);
         }
      }
   }

   private static aki a(HM var0, int var1, String var2) {
      String var3 = var2.trim();
      byte var4 = 0;
      if (var3.startsWith("minecraft:textures/")) {
         var3 = ami.c(var3, ".png");
         if (var3.endsWith("_n.png")) {
            var3 = ami.a(var3, "_n.png", ".png");
            var4 = 1;
         } else if (var3.endsWith("_s.png")) {
            var3 = ami.a(var3, "_s.png", ".png");
            var4 = 2;
         }
      }

      acC var5 = new acC(var3);
      akc var6 = new akc(var0, var1, var5, var4);
      return var6;
   }

   private static aki a(int var0, String var1) {
      // $FF: Couldn't be decompiled
   }

   private static aki a(int var0, String var1, String var2, alT var3, alQ var4, int var5, int var6, int var7, alR var8, alS var9) {
      try {
         String var10 = "shaders/" + ami.a(var2, "/");
         InputStream var11 = a.a(var10);
         if (var11 == null) {
            akt.b("Raw texture not found: " + var2);
            return null;
         } else {
            byte[] var12;
            try {
               var12 = La.a(var11);
            } finally {
               IOUtil.closeQuietly(var11);
            }

            ByteBuffer var13 = Bx.a(var12.length);
            var13.put(var12);
            var13.flip();
            return new akd(var3, var4, var5, var6, var7, var8, var9, var13, var0);
         }
      } catch (IOException var17) {
         akt.b("Error loading raw texture: " + var2);
         akt.b(var17.getClass().getName() + ": " + var17.getMessage());
         return null;
      }
   }

   private static aki a(IN var0, int var1, String var2) {
      var2 = var2.trim();
      if (var2.indexOf(46) < 0) {
         var2 = var2 + ".png";
      }

      try {
         String var3 = "shaders/" + ami.a(var2, "/");
         InputStream var4 = a.a(var3);
         if (var4 == null) {
            akt.b("Texture not found: " + var2);
            return null;
         } else {
            IOUtil.closeQuietly(var4);
            akI var5 = new akI(var3);
            var5.a(var0);
            akb var6 = new akb(var1, var3, var5);
            return var6;
         }
      } catch (IOException var7) {
         akt.b("Error loading texture: " + var2);
         akt.b(var7.getClass().getName() + ": " + var7.getMessage());
         return null;
      }
   }

   private static int a(int var0, String var1) {
      if (var0 == 0) {
         label225: {
            if (var1.equals("texture")) {
               return 0;
            }

            if (var1.equals("lightmap")) {
               return 1;
            }

            if (var1.equals("normals")) {
               return 2;
            }

            if (var1.equals("specular")) {
               return 3;
            }

            if (!var1.equals("shadowtex0") && !var1.equals("watershadow")) {
               if (var1.equals("shadow")) {
                  return o ? 5 : 4;
               }

               if (var1.equals("shadowtex1")) {
                  return 5;
               }

               if (var1.equals("depthtex0")) {
                  return 6;
               }

               if (var1.equals("gaux1")) {
                  return 7;
               }

               if (var1.equals("gaux2")) {
                  return 8;
               }

               if (var1.equals("gaux3")) {
                  return 9;
               }

               if (var1.equals("gaux4")) {
                  return 10;
               }

               if (var1.equals("depthtex1")) {
                  return 12;
               }

               if (!var1.equals("shadowcolor0") && !var1.equals("shadowcolor")) {
                  if (var1.equals("shadowcolor1")) {
                     return 14;
                  }

                  if (var1.equals("noisetex")) {
                     return 15;
                  }
                  break label225;
               }

               return 13;
            }

            return 4;
         }
      }

      if (var0 == 1 || var0 == 2) {
         if (var1.equals("colortex0") || var1.equals("colortex0")) {
            return 0;
         }

         if (var1.equals("colortex1") || var1.equals("gdepth")) {
            return 1;
         }

         if (var1.equals("colortex2") || var1.equals("gnormal")) {
            return 2;
         }

         if (var1.equals("colortex3") || var1.equals("composite")) {
            return 3;
         }

         if (var1.equals("shadowtex0") || var1.equals("watershadow")) {
            return 4;
         }

         if (var1.equals("shadow")) {
            return o ? 5 : 4;
         }

         if (var1.equals("shadowtex1")) {
            return 5;
         }

         if (var1.equals("depthtex0") || var1.equals("gdepthtex")) {
            return 6;
         }

         if (var1.equals("colortex4") || var1.equals("gaux1")) {
            return 7;
         }

         if (var1.equals("colortex5") || var1.equals("gaux2")) {
            return 8;
         }

         if (var1.equals("colortex6") || var1.equals("gaux3")) {
            return 9;
         }

         if (var1.equals("colortex7") || var1.equals("gaux4")) {
            return 10;
         }

         if (var1.equals("depthtex1")) {
            return 11;
         }

         if (var1.equals("depthtex2")) {
            return 12;
         }

         if (var1.equals("shadowcolor0") || var1.equals("shadowcolor")) {
            return 13;
         }

         if (var1.equals("shadowcolor1")) {
            return 14;
         }

         if (var1.equals("noisetex")) {
            return 15;
         }
      }

      return -1;
   }

   private static void a(aki[] var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            aki var2 = var0[var1];
            By.g('蓀' + var2.a());
            int var3 = var2.b();
            int var4 = var2.c();
            if (var4 == 3553) {
               By.i(var3);
            } else {
               Lw.a(var4, var3);
            }
         }
      }

   }

   private static void x() {
      b(a);
      b(b);
      b(c);
      a = null;
      b = null;
      c = null;
   }

   private static void b(aki[] var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            aki var2 = var0[var1];
            var2.a();
         }
      }

   }

   public static akX[] a(String var0) {
      akX[] var1 = (akX[])((akX[])a.clone());
      if (a == null) {
         if (a != null) {
            akY var9 = new akY(a, var1);
            var1 = (akX[])((akX[])afT.a(var1, var9, 0));
         }

         var1 = b(var1);
         return var1;
      } else {
         String var2 = var0 != null ? "screen." + var0 : "screen";
         akS var3 = (akS)a.get(var2);
         if (var3 == null) {
            return new akX[0];
         } else {
            akX[] var4 = var3.a();
            ArrayList var5 = new ArrayList();

            for(int var6 = 0; var6 < var4.length; ++var6) {
               akX var7 = var4[var6];
               if (var7 == null) {
                  var5.add((Object)null);
               } else if (var7 instanceof ala) {
                  akX[] var8 = a(a, var1);
                  var5.addAll(Arrays.asList(var8));
               } else {
                  var5.add(var7);
               }
            }

            akX[] var10 = (akX[])((akX[])var5.toArray(new akX[0]));
            return var10;
         }
      }
   }

   public static int a(String var0, int var1) {
      String var2 = var0 != null ? "screen." + var0 : "screen";
      if (a == null) {
         return var1;
      } else {
         akS var3 = (akS)a.get(var2);
         return var3 == null ? var1 : var3.a();
      }
   }

   private static akX[] a(Map<String, akS> var0, akX[] var1) {
      HashSet var2 = new HashSet();
      Iterator var3 = var0.keySet().iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         akS var5 = (akS)var0.get(var4);
         akX[] var6 = var5.a();

         for(int var7 = 0; var7 < var6.length; ++var7) {
            akX var8 = var6[var7];
            if (var8 != null) {
               var2.add(var8.a());
            }
         }
      }

      ArrayList var9 = new ArrayList();

      for(int var10 = 0; var10 < var1.length; ++var10) {
         akX var12 = var1[var10];
         if (var12.c()) {
            String var13 = var12.a();
            if (!var2.contains(var13)) {
               var9.add(var12);
            }
         }
      }

      akX[] var11 = (akX[])((akX[])var9.toArray(new akX[0]));
      return var11;
   }

   public static akX a(String var0) {
      return akB.a(var0, a);
   }

   public static akX[] a() {
      return a;
   }

   public static boolean a(String var0) {
      return a != null && a.contains(var0);
   }

   private static akX[] b(akX[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         akX var3 = var0[var2];
         if (var3.c()) {
            var1.add(var3);
         }
      }

      akX[] var4 = (akX[])((akX[])var1.toArray(new akX[0]));
      return var4;
   }

   public static void b() {
      a(a, a);
   }

   private static void a(akX[] var0, akj var1) {
      Properties var2 = new Properties();
      if (a != null) {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            akX var4 = var0[var3];
            if (var4.b() && var4.a()) {
               var2.setProperty(var4.a(), var4.d());
            }
         }
      }

      try {
         a(var1, var2);
      } catch (IOException var5) {
         afT.b("[Shaders] Error saving configuration for " + a.a());
         var5.printStackTrace();
      }

   }

   private static void a(akj var0, Properties var1) {
      String var2 = "shaderpacks/" + var0.a() + ".txt";
      File var3 = new File(sE.b, var2);
      if (var1.isEmpty()) {
         var3.delete();
      } else {
         FileOutputStream var4 = new FileOutputStream(var3);
         var1.store(var4, (String)null);
         var4.flush();
         var4.close();
      }

   }

   private static akX[] b() {
      try {
         String[] var0 = a.a();
         akX[] var1 = alg.a(a, var0, a);
         Properties var2 = a(a);

         for(int var3 = 0; var3 < var1.length; ++var3) {
            akX var4 = var1[var3];
            String var5 = var2.getProperty(var4.a());
            if (var5 != null) {
               var4.a();
               if (!var4.a(var5)) {
                  afT.b("[Shaders] Invalid value, option: " + var4.a() + ", value: " + var5);
               }
            }
         }

         return var1;
      } catch (IOException var6) {
         afT.b("[Shaders] Error reading configuration for " + a.a());
         var6.printStackTrace();
         return null;
      }
   }

   private static Properties a(akj var0) {
      Properties var1 = new Properties();
      String var2 = "shaderpacks/" + var0.a() + ".txt";
      File var3 = new File(sE.b, var2);
      if (var3.exists() && var3.isFile() && var3.canRead()) {
         FileInputStream var4 = new FileInputStream(var3);
         var1.load(var4);
         var4.close();
      }

      return var1;
   }

   public static akX[] a(akX[] var0) {
      ArrayList var1 = new ArrayList();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         akX var3 = var0[var2];
         if (var3.a() && var3.b()) {
            var1.add(var3);
         }
      }

      akX[] var4 = (akX[])((akX[])var1.toArray(new akX[0]));
      return var4;
   }

   private static String a(String var0, akX[] var1) {
      if (var1 != null && var1.length > 0) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            akX var3 = var1[var2];
            if (var3.c(var0)) {
               var0 = var3.g();
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static ArrayList a() {
      ArrayList var0 = new ArrayList();
      var0.add("OFF");
      var0.add("(internal)");
      int var1 = var0.size();

      try {
         if (!a.isDirectory()) {
            a.mkdir();
         } else {
            File[] var2 = a.listFiles();

            for(int var3 = 0; var3 < var2.length; ++var3) {
               File var4 = var2[var3];
               String var5 = var4.getName();
               if (var4.isDirectory()) {
                  if (!var5.equals("debug")) {
                     File var6 = new File(var4, "shaders");
                     if (var6.exists() && var6.isDirectory()) {
                        var0.add(var5);
                     }
                  }
               } else if (var4.isFile() && var5.toLowerCase().endsWith(".zip")) {
                  var0.add(var5);
               }
            }
         }
      } catch (Exception var7) {
      }

      List var8 = var0.subList(var1, var0.size());
      var8.sort(String.CASE_INSENSITIVE_ORDER);
      return var0;
   }

   public static int a(String var0) {
      int var1 = Lt.a(36160);
      if (var1 != 36053) {
         System.err.printf("FramebufferStatus 0x%04X at %s\n", var1, var0);
      }

      return var1;
   }

   public static int b(String var0) {
      if (!afT.ao()) {
         return 0;
      } else {
         int var1 = By.b();
         if (var1 != 0 && agq.a()) {
            String var2 = afT.a(var1);
            String var3 = a(var1, var0);
            String var4 = String.format("OpenGL error: %s (%s)%s, at: %s", var1, var2, var3, var0);
            akt.a(var4);
         }

         return var1;
      }
   }

   private static String a(int var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      String var5;
      if (var0 == 1286) {
         int var3 = Lt.a(36160);
         String var4 = a(var3);
         var5 = ", fbStatus: " + var3 + " (" + var4 + ')';
         var2.append(var5);
      }

      String var6 = z.a();
      if (var6.isEmpty()) {
         var6 = "none";
      }

      var2.append(", program: ").append(var6);
      akp var7 = a(A);
      if (var7 != z) {
         var5 = var7.a();
         if (var5.isEmpty()) {
            var5 = "none";
         }

         var2.append(" (").append(var5).append(')');
      }

      if (var1.equals("setDrawBuffers")) {
         var2.append(", drawBuffers: ").append(z.b());
      }

      return var2.toString();
   }

   private static akp a(int var0) {
      for(int var1 = 0; var1 < c.length; ++var1) {
         akp var2 = c[var1];
         if (var2.b() == var0) {
            return var2;
         }
      }

      return a;
   }

   private static String a(int var0) {
      switch(var0) {
      case 33305:
         return "Undefined";
      case 36053:
         return "Complete";
      case 36054:
         return "Incomplete attachment";
      case 36055:
         return "Incomplete missing attachment";
      case 36059:
         return "Incomplete draw buffer";
      case 36060:
         return "Incomplete read buffer";
      case 36061:
         return "Unsupported";
      case 36182:
         return "Incomplete multisample";
      case 36264:
         return "Incomplete layer targets";
      default:
         return "Unknown";
      }
   }

   private static void a(String var0) {
      akt.a(var0);
   }

   public static void a(String var0, IntBuffer var1) {
      StringBuilder var2 = new StringBuilder(128);
      var2.append(var0).append(" [pos ").append(var1.position()).append(" lim ").append(var1.limit()).append(" cap ").append(var1.capacity()).append(" :");
      int var3 = var1.limit();

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.append(' ').append(var1.get(var4));
      }

      var2.append(']');
      akt.c(var2.toString());
   }

   public static void a(sE var0, ContextCapabilities var1) {
      a = var1;
      a = var1.OpenGL30;
   }

   public static void c() {
      if (c()) {
         g = 0.5F;
         h = 0.6F;
         i = 0.8F;
      } else {
         g = 1.0F;
         h = 1.0F;
         i = 1.0F;
      }

   }

   public static boolean a() {
      if (!b.a()) {
         return b.b();
      } else {
         return d.a() || d.b();
      }
   }

   public static boolean b() {
      return e.a() || e.b();
   }

   public static boolean c() {
      if (!a.a()) {
         return a.b();
      } else {
         return c.a() || c.b();
      }
   }

   public static boolean d() {
      return !f.c();
   }

   public static boolean e() {
      return !g.c();
   }

   public static boolean f() {
      return !h.c();
   }

   public static boolean g() {
      return !i.c();
   }

   public static boolean h() {
      return !j.c();
   }

   public static boolean a(abu var0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean i() {
      return o.b();
   }

   public static boolean j() {
      return p.b();
   }

   public static boolean k() {
      return q.b();
   }

   public static boolean l() {
      return !r.c();
   }

   public static void a(Ck var0) {
      akt.c("Init");
      b("Shaders.init pre");
      if (!a.OpenGL20) {
         a("No OpenGL 2.0");
      }

      if (!a.GL_EXT_framebuffer_object) {
         a("No EXT_framebuffer_object");
      }

      f.position(0).limit(8);
      b.position(0).limit(16);
      c.position(0).limit(3);
      g.position(0).limit(8);
      e.position(0).limit(2);
      d.position(0).limit(8);
      r = 4;
      s = 1;
      t = 0;
      u = 0;
      v = 1;
      w = 1;
      Arrays.fill(e, 6408);
      Arrays.fill(a, true);
      Arrays.fill(a, (Object)null);
      Arrays.fill(b, false);
      Arrays.fill(c, false);
      Arrays.fill(d, false);
      Arrays.fill(e, false);
      Arrays.fill(f, false);
      H = false;
      M = false;
      k = 0.0F;
      q = 2.0F;
      l = 1024;
      m = 1024;
      n = 1024;
      o = 1024;
      a = 90.0F;
      b = 160.0F;
      m = true;
      c = -1.0F;
      j = -1.0F;
      f = false;
      g = false;
      h = false;
      o = false;
      K = false;
      c();
      alK.a();
      a.a();
      if (a != null) {
         a.a();
      }

      ali var1 = akB.a(a, a, false);
      String var2 = "";
      sE var3 = var0.a;
      yw var4 = var3.a;
      int var5;
      if (var4 != null) {
         var5 = var4.a.a().a();
         if (a.contains(var5)) {
            var2 = "world" + var5 + '/';
         }
      }

      for(var5 = 0; var5 < c.length; ++var5) {
         akp var6 = c[var5];
         var6.b();
         var6.c();
         if (var6.a() != akr.NONE) {
            String var7 = var6.a();
            String var8 = var2 + var7;
            boolean var9 = true;
            if (b.containsKey(var8)) {
               var9 = var9 && ((aiQ)b.get(var8)).a(var3);
            }

            if (var1 != null) {
               var9 = var9 && !var1.a(var8);
            }

            if (!var9) {
               akt.c("Program disabled: " + var8);
               var7 = "<disabled>";
               var8 = var2 + var7;
            }

            String var10 = "/shaders/" + var8;
            String var11 = var10 + ".vsh";
            String var12 = var10 + ".gsh";
            String var13 = var10 + ".fsh";
            a(var3, var6, var11, var12, var13);
            int var14 = var6.b();
            if (var14 > 0) {
               akt.c("Program loaded: " + var8);
            }

            a(var6);
            b(var6);
         }
      }

      L = false;

      for(var5 = 0; var5 < a.length; ++var5) {
         if (a[var5].b() != 0) {
            L = true;
            break;
         }
      }

      v = r;
      k = u > 0 ? 1 : 0;
      n = u > 0;
      akt.c("usedColorBuffers: " + r);
      akt.c("usedDepthBuffers: " + s);
      akt.c("usedShadowColorBuffers: " + t);
      akt.c("usedShadowDepthBuffers: " + u);
      akt.c("usedColorAttachs: " + v);
      akt.c("usedDrawBuffers: " + w);
      f.position(0).limit(w);
      b.position(0).limit(r * 2);
      a.a();

      for(var5 = 0; var5 < w; ++var5) {
         f.put(var5, '賠' + var5);
      }

      var5 = GL11.glGetInteger(34852);
      if (w > var5) {
         akt.a("[Shaders] Error: Not enough draw buffers, needed: " + w + ", available: " + var5);
      }

      g.position(0).limit(t);

      int var15;
      for(var15 = 0; var15 < t; ++var15) {
         g.put(var15, '賠' + var15);
      }

      for(var15 = 0; var15 < c.length; ++var15) {
         akp var16 = c[var15];

         akp var17;
         for(var17 = var16; var17.b() == 0 && var17.a() != var17; var17 = var17.a()) {
         }

         if (var17 != var16 && var16 != b) {
            var16.a(var17);
         }
      }

      G(var3);
      z();
      if (M) {
         a(var3.a(), var3.a());
      }

      if (a == null) {
         a = akG.a();
      }

      By.C();
      By.b(-90.0F, 0.0F, 1.0F, 0.0F);
      h();
      c(var3);
      By.D();
      v = true;
      y();
      b(var0);
      b("Shaders.init");
   }

   private static void a(akp var0) {
      int var1 = GL11.glGetInteger(34852);
      Arrays.fill(var0.a(), false);
      if (var0 == y) {
         var0.a((IntBuffer)null);
      } else if (var0.b() == 0) {
         if (var0 == b) {
            var0.a(h);
         } else {
            var0.a(i);
         }
      } else {
         String var2 = var0.b();
         if (var2 == null) {
            if (var0 != b && var0 != c && var0 != d) {
               var0.a(f);
               w = r;
               Arrays.fill(var0.a(), 0, r, true);
            } else {
               var0.a(g);
            }
         } else {
            IntBuffer var3 = var0.b();
            int var4 = var2.length();
            w = Math.max(w, var4);
            var4 = Math.min(var4, var1);
            var0.a(var3);
            var3.limit(var4);

            for(int var5 = 0; var5 < var4; ++var5) {
               int var6 = a(var0, var2, var5);
               var3.put(var5, var6);
            }
         }
      }

   }

   private static int a(akp var0, String var1, int var2) {
      if (var2 >= var1.length()) {
         return 0;
      } else {
         int var3 = 0;
         int var4 = var1.charAt(var2) - 48;
         if (var0 == b) {
            if (var4 >= 0 && var4 <= 1) {
               var3 = var4 + '賠';
               t = Math.max(t, var4);
            }

            return var3;
         } else {
            if (var4 >= 0 && var4 <= 7) {
               var0.a()[var4] = true;
               var3 = var4 + '賠';
               v = Math.max(v, var4);
               r = Math.max(r, var4);
            }

            return var3;
         }
      }
   }

   private static void b(akp var0) {
      boolean[] var1 = var0.a();
      Boolean[] var2 = var0.a();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Boolean var4 = var2[var3];
         if (var4 != null) {
            var1[var3] = var4;
         }
      }

   }

   public static void b(Ck var0) {
      akt.c("Reset model renderers");
      ++a;
      akt.c("Reset world renderers");
      var0.loadRenderers();
   }

   private static void a(sE var0, akp var1, String var2, String var3, String var4) {
      b("pre setupProgram");
      int var5 = ARBShaderObjects.glCreateProgramObjectARB();
      b("create");
      if (var5 != 0) {
         i = false;
         j = false;
         k = false;
         int var6 = a(var0, var1, var2);
         int var7 = b(var0, var1, var3);
         int var8 = c(var0, var1, var4);
         b("create");
         boolean var11;
         if (var6 == 0 && var7 == 0 && var8 == 0) {
            ARBShaderObjects.glDeleteObjectARB(var5);
            var11 = false;
            var1.b();
         } else {
            if (var6 != 0) {
               ARBShaderObjects.glAttachObjectARB(var5, var6);
               b("attach");
            }

            if (var7 != 0) {
               ARBShaderObjects.glAttachObjectARB(var5, var7);
               b("attach");
               if (J) {
                  ARBGeometryShader4.glProgramParameteriARB(var5, 36315, 4);
                  ARBGeometryShader4.glProgramParameteriARB(var5, 36316, 5);
                  ARBGeometryShader4.glProgramParameteriARB(var5, 36314, R);
                  b("arbGeometryShader4");
               }

               K = true;
            }

            if (var8 != 0) {
               ARBShaderObjects.glAttachObjectARB(var5, var8);
               b("attach");
            }

            if (i) {
               ARBVertexShader.glBindAttribLocationARB(var5, 10, "mc_Entity");
               b("mc_Entity");
            }

            if (j) {
               ARBVertexShader.glBindAttribLocationARB(var5, 11, "mc_midTexCoord");
               b("mc_midTexCoord");
            }

            if (k) {
               ARBVertexShader.glBindAttribLocationARB(var5, 12, "at_tangent");
               b("at_tangent");
            }

            ARBShaderObjects.glLinkProgramARB(var5);
            if (GL20.glGetProgrami(var5, 35714) != 1) {
               akt.a("Error linking program: " + var5 + " (" + var1.a() + ')');
            }

            if (var6 != 0) {
               ARBShaderObjects.glDetachObjectARB(var5, var6);
               ARBShaderObjects.glDeleteObjectARB(var6);
            }

            if (var7 != 0) {
               ARBShaderObjects.glDetachObjectARB(var5, var7);
               ARBShaderObjects.glDeleteObjectARB(var7);
            }

            if (var8 != 0) {
               ARBShaderObjects.glDetachObjectARB(var5, var8);
               ARBShaderObjects.glDeleteObjectARB(var8);
            }

            var1.a(var5);
            var1.b(var5);
            a(var0, var1);
            ARBShaderObjects.glValidateProgramARB(var5);
            a(var0, a);
            int var9 = GL20.glGetProgrami(var5, 35715);
            if (var9 != 1) {
               String var10 = "\"";
               a("[Shaders] Error: Invalid program " + var10 + var1.a() + var10);
               ARBShaderObjects.glDeleteObjectARB(var5);
               var11 = false;
               var1.b();
            }
         }
      }

   }

   private static int a(sE var0, akp var1, String var2) {
      int var3 = ARBShaderObjects.glCreateShaderObjectARB(35633);
      if (var3 == 0) {
         return 0;
      } else {
         StringBuilder var4 = new StringBuilder(131072);
         BufferedReader var5 = null;

         try {
            var5 = new BufferedReader(a(var2));
         } catch (Exception var11) {
            ARBShaderObjects.glDeleteObjectARB(var3);
            return 0;
         }

         akX[] var6 = a(a);
         ArrayList var7 = new ArrayList();
         if (var5 != null) {
            try {
               var5 = alg.a(var5, var2, a, 0, var7, 0);
               akN var8 = new akN();

               while(true) {
                  String var9 = var5.readLine();
                  if (var9 == null) {
                     var5.close();
                     break;
                  }

                  var9 = a(var9, var6);
                  var4.append(var9).append('\n');
                  if (var8.a(var0, var9)) {
                     akT var10 = alh.a(var9);
                     if (var10 != null) {
                        if (var10.a("mc_Entity")) {
                           f = true;
                           i = true;
                        } else if (var10.a("mc_midTexCoord")) {
                           g = true;
                           j = true;
                        } else if (var10.a("at_tangent")) {
                           h = true;
                           k = true;
                        }

                        if (var10.c("countInstances")) {
                           var1.d(var10.b());
                           akt.c("countInstances: " + var1.e());
                        }
                     }
                  }
               }
            } catch (Exception var12) {
               akt.a("Couldn't read " + var2 + '!');
               var12.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var3);
               return 0;
            }
         }

         ARBShaderObjects.glShaderSourceARB(var3, var4);
         ARBShaderObjects.glCompileShaderARB(var3);
         if (GL20.glGetShaderi(var3, 35713) != 1) {
            akt.a("Error compiling vertex shader: " + var2);
         }

         return var3;
      }
   }

   private static int b(sE var0, akp var1, String var2) {
      int var3 = ARBShaderObjects.glCreateShaderObjectARB(36313);
      if (var3 == 0) {
         return 0;
      } else {
         StringBuilder var4 = new StringBuilder(131072);
         BufferedReader var5 = null;

         try {
            var5 = new BufferedReader(a(var2));
         } catch (Exception var12) {
            ARBShaderObjects.glDeleteObjectARB(var3);
            return 0;
         }

         akX[] var6 = a(a);
         ArrayList var7 = new ArrayList();
         J = false;
         R = 3;
         if (var5 != null) {
            try {
               var5 = alg.a(var5, var2, a, 0, var7, 0);
               akN var8 = new akN();

               label56:
               while(true) {
                  akT var10;
                  do {
                     String var9;
                     do {
                        var9 = var5.readLine();
                        if (var9 == null) {
                           var5.close();
                           break label56;
                        }

                        var9 = a(var9, var6);
                        var4.append(var9).append('\n');
                     } while(!var8.a(var0, var9));

                     var10 = alh.a(var9);
                  } while(var10 == null);

                  if (var10.g("GL_ARB_geometry_shader4")) {
                     String var11 = afT.a(var10.b());
                     if (var11.equals("enable") || var11.equals("require") || var11.equals("warn")) {
                        J = true;
                     }
                  }

                  if (var10.c("maxVerticesOut")) {
                     R = var10.b();
                  }
               }
            } catch (Exception var13) {
               akt.a("Couldn't read " + var2 + '!');
               var13.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var3);
               return 0;
            }
         }

         ARBShaderObjects.glShaderSourceARB(var3, var4);
         ARBShaderObjects.glCompileShaderARB(var3);
         if (GL20.glGetShaderi(var3, 35713) != 1) {
            akt.a("Error compiling geometry shader: " + var2);
         }

         return var3;
      }
   }

   private static int c(sE var0, akp var1, String var2) {
      int var3 = ARBShaderObjects.glCreateShaderObjectARB(35632);
      if (var3 == 0) {
         return 0;
      } else {
         StringBuilder var4 = new StringBuilder(131072);
         BufferedReader var5 = null;

         try {
            var5 = new BufferedReader(a(var2));
         } catch (Exception var15) {
            ARBShaderObjects.glDeleteObjectARB(var3);
            return 0;
         }

         akX[] var6 = a(a);
         ArrayList var7 = new ArrayList();
         if (var5 != null) {
            try {
               var5 = alg.a(var5, var2, a, 0, var7, 0);
               akN var8 = new akN();

               label261:
               while(true) {
                  while(true) {
                     while(true) {
                        akT var10;
                        do {
                           String var9;
                           do {
                              var9 = var5.readLine();
                              if (var9 == null) {
                                 var5.close();
                                 break label261;
                              }

                              var9 = a(var9, var6);
                              var4.append(var9).append('\n');
                           } while(!var8.a(var0, var9));

                           var10 = alh.a(var9);
                        } while(var10 == null);

                        String var11;
                        int var12;
                        if (var10.a()) {
                           var11 = var10.a();
                           if ((var12 = alh.a(var11)) >= 0) {
                              u = Math.max(u, var12 + 1);
                           } else if ((var12 = alh.b(var11)) >= 0) {
                              t = Math.max(t, var12 + 1);
                           } else if ((var12 = alh.c(var11)) >= 0) {
                              s = Math.max(s, var12 + 1);
                           } else if (var11.equals("gdepth") && e[1] == 6408) {
                              e[1] = 34836;
                           } else if ((var12 = alh.d(var11)) >= 0) {
                              r = Math.max(r, var12 + 1);
                           } else if (var11.equals("centerDepthSmooth")) {
                              H = true;
                           }
                        } else if (!var10.c("shadowMapResolution") && !var10.b("SHADOWRES")) {
                           if (!var10.e("shadowMapFov") && !var10.b("SHADOWFOV")) {
                              if (!var10.e("shadowDistance") && !var10.b("SHADOWHPL")) {
                                 if (var10.e("shadowDistanceRenderMul")) {
                                    c = var10.a();
                                    akt.c("Shadow distance render mul: " + c);
                                 } else if (var10.e("shadowIntervalSize")) {
                                    q = var10.a();
                                    akt.c("Shadow map interval size: " + q);
                                 } else if (var10.b("generateShadowMipmap", true)) {
                                    Arrays.fill(c, true);
                                    akt.c("Generate shadow mipmap");
                                 } else if (var10.b("generateShadowColorMipmap", true)) {
                                    Arrays.fill(e, true);
                                    akt.c("Generate shadow color mipmap");
                                 } else if (var10.b("shadowHardwareFiltering", true)) {
                                    Arrays.fill(b, true);
                                    akt.c("Hardware shadow filtering enabled.");
                                 } else if (var10.b("shadowHardwareFiltering0", true)) {
                                    b[0] = true;
                                    akt.c("shadowHardwareFiltering0");
                                 } else if (var10.b("shadowHardwareFiltering1", true)) {
                                    b[1] = true;
                                    akt.c("shadowHardwareFiltering1");
                                 } else if (var10.a("shadowtex0Mipmap", "shadowtexMipmap", true)) {
                                    c[0] = true;
                                    akt.c("shadowtex0Mipmap");
                                 } else if (var10.b("shadowtex1Mipmap", true)) {
                                    c[1] = true;
                                    akt.c("shadowtex1Mipmap");
                                 } else if (var10.a("shadowcolor0Mipmap", "shadowColor0Mipmap", true)) {
                                    e[0] = true;
                                    akt.c("shadowcolor0Mipmap");
                                 } else if (var10.a("shadowcolor1Mipmap", "shadowColor1Mipmap", true)) {
                                    e[1] = true;
                                    akt.c("shadowcolor1Mipmap");
                                 } else if (var10.a("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", true)) {
                                    d[0] = true;
                                    akt.c("shadowtex0Nearest");
                                 } else if (var10.a("shadowtex1Nearest", "shadow1MinMagNearest", true)) {
                                    d[1] = true;
                                    akt.c("shadowtex1Nearest");
                                 } else if (var10.a("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", true)) {
                                    f[0] = true;
                                    akt.c("shadowcolor0Nearest");
                                 } else if (var10.a("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", true)) {
                                    f[1] = true;
                                    akt.c("shadowcolor1Nearest");
                                 } else if (!var10.e("wetnessHalflife") && !var10.b("WETNESSHL")) {
                                    if (!var10.e("drynessHalflife") && !var10.b("DRYNESSHL")) {
                                       if (var10.e("eyeBrightnessHalflife")) {
                                          G = var10.a();
                                          akt.c("Eye brightness halflife: " + G);
                                       } else if (var10.e("centerDepthHalflife")) {
                                          M = var10.a();
                                          akt.c("Center depth halflife: " + M);
                                       } else if (var10.e("sunPathRotation")) {
                                          k = var10.a();
                                          akt.c("Sun path rotation: " + k);
                                       } else if (var10.e("ambientOcclusionLevel")) {
                                          j = afT.a(var10.a(), 0.0F, 1.0F);
                                          akt.c("AO Level: " + j);
                                       } else if (var10.c("superSamplingLevel")) {
                                          int var17 = var10.b();
                                          if (var17 > 1) {
                                             akt.c("Super sampling level: " + var17 + 'x');
                                             Q = var17;
                                          } else {
                                             Q = 1;
                                          }
                                       } else if (var10.c("noiseTextureResolution")) {
                                          T = var10.b();
                                          M = true;
                                          akt.c("Noise texture enabled");
                                          akt.c("Noise texture resolution: " + T);
                                       } else {
                                          int var13;
                                          if (var10.d("Format")) {
                                             var11 = ami.b(var10.a(), "Format");
                                             String var18 = var10.b();
                                             var13 = c(var11);
                                             int var14 = d(var18);
                                             if (var13 >= 0 && var14 != 0) {
                                                e[var13] = var14;
                                                akt.b("%s format: %s", var11, var18);
                                             }
                                          } else if (var10.a("Clear", false)) {
                                             if (alh.b(var2) || alh.a(var2)) {
                                                var11 = ami.b(var10.a(), "Clear");
                                                var12 = c(var11);
                                                if (var12 >= 0) {
                                                   a[var12] = false;
                                                   akt.b("%s clear disabled", var11);
                                                }
                                             }
                                          } else if (var10.i("ClearColor")) {
                                             if (alh.b(var2) || alh.a(var2)) {
                                                var11 = ami.b(var10.a(), "ClearColor");
                                                var12 = c(var11);
                                                if (var12 >= 0) {
                                                   Vector4f var19 = var10.a();
                                                   if (var19 != null) {
                                                      a[var12] = var19;
                                                      akt.b("%s clear color: %s %s %s %s", var11, var19.getX(), var19.getY(), var19.getZ(), var19.getW());
                                                   } else {
                                                      akt.b("Invalid color value: " + var10.b());
                                                   }
                                                }
                                             }
                                          } else if (var10.a("GAUX4FORMAT", "RGBA32F")) {
                                             e[7] = 34836;
                                             akt.c("gaux4 format : RGB32AF");
                                          } else if (var10.a("GAUX4FORMAT", "RGB32F")) {
                                             e[7] = 34837;
                                             akt.c("gaux4 format : RGB32F");
                                          } else if (var10.a("GAUX4FORMAT", "RGB16")) {
                                             e[7] = 32852;
                                             akt.c("gaux4 format : RGB16");
                                          } else if (var10.a("MipmapEnabled", true)) {
                                             if (alh.b(var2) || alh.a(var2) || alh.c(var2)) {
                                                var11 = ami.b(var10.a(), "MipmapEnabled");
                                                var12 = c(var11);
                                                if (var12 >= 0) {
                                                   var13 = var1.d();
                                                   var13 |= 1 << var12;
                                                   var1.c(var13);
                                                   akt.b("%s mipmap enabled", var11);
                                                }
                                             }
                                          } else if (var10.b("DRAWBUFFERS")) {
                                             var11 = var10.b();
                                             if (alh.d(var11)) {
                                                var1.a(var11);
                                             } else {
                                                akt.b("Invalid draw buffers: " + var11);
                                             }
                                          }
                                       }
                                    } else {
                                       F = var10.a();
                                       akt.c("Dryness halflife: " + F);
                                    }
                                 } else {
                                    E = var10.a();
                                    akt.c("Wetness halflife: " + E);
                                 }
                              } else {
                                 b = var10.a();
                                 m = true;
                                 akt.c("Shadow map distance: " + b);
                              }
                           } else {
                              a = var10.a();
                              m = false;
                              akt.c("Shadow map field of view: " + a);
                           }
                        } else {
                           n = o = var10.b();
                           l = m = Math.round((float)n * f);
                           akt.c("Shadow map resolution: " + n);
                        }
                     }
                  }
               }
            } catch (Exception var16) {
               akt.a("Couldn't read " + var2 + '!');
               var16.printStackTrace();
               ARBShaderObjects.glDeleteObjectARB(var3);
               return 0;
            }
         }

         ARBShaderObjects.glShaderSourceARB(var3, var4);
         ARBShaderObjects.glCompileShaderARB(var3);
         if (GL20.glGetShaderi(var3, 35713) != 1) {
            akt.a("Error compiling fragment shader: " + var2);
         }

         return var3;
      }
   }

   private static Reader a(String var0) {
      return new InputStreamReader(a.a(var0), StandardCharsets.UTF_8);
   }

   public static void a(IntBuffer var0) {
      if (var0 == null) {
         var0 = h;
      }

      if (a != var0) {
         a = var0;
         Lw.c(var0);
         b("setDrawBuffers");
      }

   }

   public static void a(sE var0, akp var1) {
      // $FF: Couldn't be decompiled
   }

   private static void a(akp var0, akp var1) {
      if (var0.a() != null) {
         By.J();
      }

      if (var0.a() != null) {
         By.K();
      }

      ajT var2 = var1.a();
      if (var2 != null) {
         By.a(var2);
      }

      ajU var3 = var1.a();
      if (var3 != null) {
         By.a(var3);
      }

   }

   private static void a(alB var0, int var1) {
      var0.b(var1);
   }

   private static void a(alD var0, int var1, int var2) {
      var0.a(var1, var2);
   }

   private static void a(alA var0, float var1) {
      var0.a(var1);
   }

   private static void a(alE var0, float var1, float var2, float var3) {
      var0.a(var1, var2, var3);
   }

   private static void a(alI var0, boolean var1, FloatBuffer var2) {
      var0.a(var1, var2);
   }

   public static int c(String var0) {
      if (!var0.equals("colortex0") && !var0.equals("gcolor")) {
         if (!var0.equals("colortex1") && !var0.equals("gdepth")) {
            if (!var0.equals("colortex2") && !var0.equals("gnormal")) {
               if (!var0.equals("colortex3") && !var0.equals("composite")) {
                  if (!var0.equals("colortex4") && !var0.equals("gaux1")) {
                     if (!var0.equals("colortex5") && !var0.equals("gaux2")) {
                        if (!var0.equals("colortex6") && !var0.equals("gaux3")) {
                           return !var0.equals("colortex7") && !var0.equals("gaux4") ? -1 : 7;
                        } else {
                           return 6;
                        }
                     } else {
                        return 5;
                     }
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 0;
      }
   }

   private static int d(String var0) {
      var0 = var0.trim();

      for(int var1 = 0; var1 < d.length; ++var1) {
         String var2 = d[var1];
         if (var0.equals(var2)) {
            return f[var1];
         }
      }

      return 0;
   }

   private static void a(HM var0, IN var1) {
      if (a == null && b != null) {
         a = a(var0, var1, 15, b);
      }

      if (a == null) {
         a = new akh(T, T);
      }

   }

   private static void y() {
      a = new Object2IntOpenCustomHashMap(254, 1.0F, new akD());
      Iterator var0 = mY.a.a().iterator();

      while(var0.hasNext()) {
         acC var1 = (acC)var0.next();
         nh var2 = (nh)mY.a.a((Object)var1);
         int var3 = mY.a.a((Object)var2);
         a.put(var2, var3);
      }

      try {
         BufferedReader var20 = IOUtil.toBufferedReader(a.a("/mc_Entity_x.txt"), LB.a());
         Throwable var21 = null;

         try {
            if (var20 != null) {
               String var22;
               while((var22 = var20.readLine()) != null) {
                  Matcher var23 = a.matcher(var22);
                  if (var23.matches()) {
                     String var4 = var23.group(1);
                     String var5 = var23.group(2);
                     int var6 = Integer.parseInt(var5);
                     nh var7 = mY.a(var4);
                     if (var7 != null) {
                        a.put(var7, var6);
                     } else {
                        akt.a("Unknown block name %s", var4);
                     }
                  } else {
                     akt.a("unmatched %s\n", var22);
                  }
               }

               return;
            }
         } catch (Throwable var17) {
            var21 = var17;
            throw var17;
         } finally {
            if (var20 != null) {
               if (var21 != null) {
                  try {
                     var20.close();
                  } catch (Throwable var16) {
                     var21.addSuppressed(var16);
                  }
               } else {
                  var20.close();
               }
            }

         }

      } catch (Exception var19) {
         sE.a.warn("[Shaders] Error parsing mc_Entity_x.txt", var19);
      }
   }

   private static IntBuffer a(IntBuffer var0) {
      int var1 = var0.limit();
      if (var0.hasArray()) {
         int[] var2 = var0.array();
         Arrays.fill(var2, var0.position(), var1, 0);
      } else {
         int var3 = var0.position();

         while(var3 < var1) {
            var0.put(var3++, 0);
         }
      }

      return var0;
   }

   public static void d() {
      if (v) {
         b("Shaders.uninit pre");

         for(int var0 = 0; var0 < c.length; ++var0) {
            akp var1 = c[var0];
            if (var1.c() != 0) {
               ARBShaderObjects.glDeleteObjectARB(var1.c());
               b("del programRef");
            }

            var1.b(0);
            var1.a(0);
            var1.a((String)null);
            var1.a((IntBuffer)null);
            var1.c(0);
         }

         L = false;
         if (x != 0) {
            Lt.b(x);
            x = 0;
            b("del dfb");
         }

         if (y != 0) {
            Lt.b(y);
            y = 0;
            b("del sfb");
         }

         By.b(c);
         a(c);
         b("del dfbDepthTextures");
         By.b(b);
         a(b);
         b("del dfbTextures");
         By.b(e);
         a(e);
         b("del shadow depth");
         By.b(d);
         a(d);
         b("del shadow color");
         a(f);
         if (a != null) {
            a.a();
            a = null;
         }

         akt.c("Uninit");
         k = 0;
         n = false;
         v = false;
         b("Shaders.uninit");
      }

   }

   public static void e() {
      L = 0;
   }

   public static void f() {
      l = true;
   }

   private static void G(sE var0) {
      K = var0.a;
      L = var0.b;
      b = Math.round((float)K * e);
      c = Math.round((float)L * e);
      A();
   }

   private static void z() {
      l = false;
      l = Math.round((float)n * f);
      m = Math.round((float)o * f);
      B();
   }

   private static void A() {
      if (x != 0) {
         Lt.b(x);
         By.b(c);
         By.b(b);
      }

      x = Lt.a();
      Lw.b((IntBuffer)c.clear().limit(s));
      Lw.b((IntBuffer)b.clear().limit(16));
      c.position(0);
      b.position(0);
      Lt.a(36160, x);
      Lw.u(0);
      Lw.y(0);

      int var0;
      for(var0 = 0; var0 < s; ++var0) {
         By.i(c.get(var0));
         Lw.a(3553, 10242, 33071);
         Lw.a(3553, 10243, 33071);
         Lw.a(3553, 10241, 9728);
         Lw.a(3553, 10240, 9728);
         Lw.a(3553, 34891, 6409);
         Lw.b(3553, 0, 6402, b, c, 0, 6402, 5126, (FloatBuffer)((FloatBuffer)null));
      }

      Lt.a(36160, 36096, 3553, c.get(0), 0);
      Lw.c(f);
      Lw.y(0);
      b("FT d");

      for(var0 = 0; var0 < r; ++var0) {
         By.i(a.a(var0));
         Lw.a(3553, 10242, 33071);
         Lw.a(3553, 10243, 33071);
         Lw.a(3553, 10241, 9729);
         Lw.a(3553, 10240, 9729);
         Lw.b(3553, 0, e[var0], b, c, 0, a(e[var0]), 33639, (ByteBuffer)((ByteBuffer)null));
         Lt.a(36160, '賠' + var0, 3553, a.a(var0), 0);
         b("FT c");
      }

      for(var0 = 0; var0 < r; ++var0) {
         By.i(a.b(var0));
         Lw.a(3553, 10242, 33071);
         Lw.a(3553, 10243, 33071);
         Lw.a(3553, 10241, 9729);
         Lw.a(3553, 10240, 9729);
         Lw.b(3553, 0, e[var0], b, c, 0, a(e[var0]), 33639, (ByteBuffer)((ByteBuffer)null));
         b("FT ca");
      }

      var0 = Lt.a(36160);
      if (var0 == 36058) {
         a("[Shaders] Error: Failed framebuffer incomplete formats");

         for(int var1 = 0; var1 < r; ++var1) {
            By.i(a.a(var1));
            Lw.b(3553, 0, 6408, b, c, 0, 32993, 33639, (ByteBuffer)((ByteBuffer)null));
            Lt.a(36160, '賠' + var1, 3553, a.a(var1), 0);
            b("FT c");
         }

         var0 = Lt.a(36160);
         if (var0 == 36053) {
            akt.c("complete");
         }
      }

      By.i(0);
      if (var0 != 36053) {
         a("[Shaders] Error: Failed creating framebuffer! (Status " + var0 + ')');
      } else {
         akt.c("Framebuffer created.");
      }

   }

   private static int a(int var0) {
      switch(var0) {
      case 33333:
      case 33334:
      case 33339:
      case 33340:
      case 36208:
      case 36209:
      case 36226:
      case 36227:
         return 36251;
      default:
         return 32993;
      }
   }

   private static void B() {
      if (u != 0) {
         if (y != 0) {
            Lt.b(y);
            By.b(e);
            By.b(d);
         }

         y = Lt.a();
         Lt.a(36160, y);
         Lw.z(0);
         Lw.y(0);
         Lw.b((IntBuffer)e.clear().limit(u));
         Lw.b((IntBuffer)d.clear().limit(t));
         e.position(0);
         d.position(0);

         int var0;
         int var1;
         for(var0 = 0; var0 < u; ++var0) {
            By.i(e.get(var0));
            Lw.a(3553, 10242, 33071.0F);
            Lw.a(3553, 10243, 33071.0F);
            var1 = d[var0] ? 9728 : 9729;
            Lw.a(3553, 10241, var1);
            Lw.a(3553, 10240, var1);
            if (b[var0]) {
               Lw.a(3553, 34892, 34894);
            }

            Lw.b(3553, 0, 6402, l, m, 0, 6402, 5126, (FloatBuffer)((FloatBuffer)null));
         }

         Lt.a(36160, 36096, 3553, e.get(0), 0);
         b("FT sd");

         for(var0 = 0; var0 < t; ++var0) {
            By.i(d.get(var0));
            Lw.a(3553, 10242, 33071.0F);
            Lw.a(3553, 10243, 33071.0F);
            var1 = f[var0] ? 9728 : 9729;
            Lw.a(3553, 10241, var1);
            Lw.a(3553, 10240, var1);
            Lw.b(3553, 0, 6408, l, m, 0, 32993, 33639, (ByteBuffer)((ByteBuffer)null));
            Lt.a(36160, '賠' + var0, 3553, d.get(var0), 0);
            b("FT sc");
         }

         By.i(0);
         if (t > 0) {
            Lw.c(g);
         }

         var0 = Lt.a(36160);
         if (var0 != 36053) {
            a("[Shaders] Error: Failed creating shadow framebuffer! (Status " + var0 + ')');
         } else {
            akt.c("Shadow framebuffer created.");
         }
      }

   }

   public static void a(sE var0, float var1, long var2) {
      b("pre beginRender");
      if (!v) {
         try {
            a(var0.a);
         } catch (IllegalStateException var12) {
            var12.printStackTrace();
            if (afT.a(var12.getMessage()).equals("Function is not supported")) {
               a("[Shaders] Error: " + var12.getMessage());
               a(var0, "OFF");
               return;
            }
         }
      }

      if (var0.a != K || var0.b != L) {
         G(var0);
      }

      if (l) {
         z();
      }

      a = var0.a.b();
      c = (a - b) % 24000L;
      if (c < 0L) {
         c += 24000L;
      }

      b = a;
      M = var0.a.a();
      ++N;
      if (N >= 720720) {
         N = 0;
      }

      d = System.currentTimeMillis();
      if (e == 0L) {
         e = d;
      }

      f = d - e;
      e = d;
      A = (float)f / 1000.0F;
      B += A;
      B %= 3600.0F;
      C = var0.a.b();
      float var4 = (float)f * 0.01F;
      float var5 = (float)Math.exp(Math.log(0.5D) * (double)var4 / (double)(D < C ? F : E));
      D = D * var5 + C * (1.0F - var5);
      NN var6 = var0.a();
      if (var6 != null) {
         J = (float)var6.e * var1 + (float)var6.h * (1.0F - var1);
         P = var6.getBrightnessForRender();
         var5 = (float)f * 0.01F;
         float var7 = (float)Math.exp(Math.log(0.5D) * (double)var5 / (double)G);
         H = H * var7 + (float)(P & '\uffff') * (1.0F - var7);
         I = I * var7 + (float)(P >> 16) * (1.0F - var7);
         sD var8 = AI.a(var0.a, var6, var1);
         si var9 = var8.a();
         if (var9 == si.h) {
            O = 1;
         } else if (var9 == si.i) {
            O = 2;
         } else {
            O = 0;
         }

         if (var0.a != null) {
            N = 0.0F;
            if (var0.a.a((ZV)RU.p)) {
               N = var0.a.a(var0.a, var1);
            }

            O = 0.0F;
            if (var0.a.a((ZV)RU.o)) {
               int var10 = var0.a.b((ZV)RU.o).getDuration();
               O = afT.a((float)var10 / 20.0F, 0.0F, 1.0F);
            }
         }

         yw var14 = var0.a;
         adm var11 = var14.a(var6, var1);
         var11 = agd.a(var0, var11, var14, var6, var1);
         u = (float)var11.a;
         v = (float)var11.b;
         w = (float)var11.c;
      }

      b = true;
      x = false;
      c = false;
      B = false;
      C = false;
      D = false;
      E = false;
      C();
      a = d;
      b = e;
      c = f;
      i.position(0);
      a.position(0);
      i.put(a);
      i.position(0);
      a.position(0);
      j.position(0);
      c.position(0);
      j.put(c);
      j.position(0);
      c.position(0);
      b("beginRender");
      akF.a(var0.a, var1);
      Lt.a(36160, x);

      for(int var13 = 0; var13 < r; ++var13) {
         Lt.a(36160, '賠' + var13, 3553, a.a(var13), 0);
      }

      b("end beginRender");
   }

   private static void C() {
      if (u >= 1) {
         By.g(33988);
         By.i(e.get(0));
         if (u >= 2) {
            By.g(33989);
            By.i(e.get(1));
         }
      }

      By.g(33984);

      int var0;
      for(var0 = 0; var0 < r; ++var0) {
         By.i(a.a(var0));
         Lw.a(3553, 10240, 9729);
         Lw.a(3553, 10241, 9729);
         By.i(a.b(var0));
         Lw.a(3553, 10240, 9729);
         Lw.a(3553, 10241, 9729);
      }

      By.i(0);

      for(var0 = 0; var0 < 4 && 4 + var0 < r; ++var0) {
         By.g('蓇' + var0);
         By.i(a.a(4 + var0));
      }

      By.g(33990);
      By.i(c.get(0));
      if (s >= 2) {
         By.g(33995);
         By.i(c.get(1));
         if (s >= 3) {
            By.g(33996);
            By.i(c.get(2));
         }
      }

      for(var0 = 0; var0 < t; ++var0) {
         By.g('蓍' + var0);
         By.i(d.get(var0));
      }

      if (M) {
         By.g('蓀' + a.a());
         By.i(a.b());
      }

      a(a);
      By.g(33984);
   }

   public static void a(sE var0, aej var1, aej var2) {
      c(var0.a());
      if (var2 == null || !a.contains(var2.a.a().a())) {
         d();
      }

      alK.a();
   }

   public static void a(sE var0, int var1, float var2, long var3) {
      if (!c) {
         Lt.a(36160, x);
         Lw.a(0, 0, b, c);
         a = null;
         akG.a(a.a());
         a(var0, f);
         b("end beginRenderPass");
      }

   }

   public static void a(sE var0, int var1, int var2, int var3, int var4) {
      By.a(true, true, true, true);
      if (c) {
         Lw.a(0, 0, l, m);
      } else {
         Lw.a(0, 0, b, c);
         Lt.a(36160, x);
         y = true;
         By.p();
         By.j();
         a(h);
         a(var0, f);
         b("beginRenderPass");
      }

   }

   public static void a(int var0) {
      I = var0;
      if (e) {
         a(N, var0);
      }

   }

   public static void a(float var0, float var1, float var2) {
      n = var0;
      o = var1;
      p = var2;
      a(a, var0, var1, var2);
   }

   public static void a(float var0, float var1, float var2, float var3) {
      By.a(var0, var1, var2, var3);
      r = var0;
      s = var1;
      t = var2;
   }

   public static void g() {
      if (c) {
         b("shadow clear pre");
         Lt.a(36160, 36096, 3553, e.get(0), 0);
         Lw.b(1.0F, 1.0F, 1.0F, 1.0F);
         Lw.c(b.a());
         a("shadow clear");
         Lw.b(16640);
         b("shadow clear");
      } else {
         b("clear pre");
         Vector4f var0;
         if (a[0]) {
            var0 = a[0];
            if (var0 != null) {
               Lw.b(var0.getX(), var0.getY(), var0.getZ(), var0.getW());
            }

            if (a.a(0)) {
               Lt.a(36160, 36064, 3553, a.b(0), 0);
               Lw.u(36064);
               Lw.b(16384);
               Lt.a(36160, 36064, 3553, a.a(0), 0);
            }

            Lw.u(36064);
            Lw.b(16384);
         }

         if (a[1]) {
            Lw.b(1.0F, 1.0F, 1.0F, 1.0F);
            var0 = a[1];
            if (var0 != null) {
               Lw.b(var0.getX(), var0.getY(), var0.getZ(), var0.getW());
            }

            if (a.a(1)) {
               Lt.a(36160, 36065, 3553, a.b(1), 0);
               Lw.u(36065);
               Lw.b(16384);
               Lt.a(36160, 36065, 3553, a.a(1), 0);
            }

            Lw.u(36065);
            Lw.b(16384);
         }

         for(int var2 = 2; var2 < r; ++var2) {
            if (a[var2]) {
               Lw.b(0.0F, 0.0F, 0.0F, 0.0F);
               Vector4f var1 = a[var2];
               if (var1 != null) {
                  Lw.b(var1.getX(), var1.getY(), var1.getZ(), var1.getW());
               }

               if (a.a(var2)) {
                  Lt.a(36160, '賠' + var2, 3553, a.b(var2), 0);
                  Lw.u('賠' + var2);
                  Lw.b(16384);
                  Lt.a(36160, '賠' + var2, 3553, a.a(var2), 0);
               }

               Lw.u('賠' + var2);
               Lw.b(16384);
            }
         }

         a(f);
         a("clear");
         b("clear");
      }

   }

   public static void a(sE var0, float var1) {
      NN var2 = var0.a();
      double var3 = var2.g + (var2.d - var2.g) * (double)var1;
      double var5 = var2.h + (var2.e - var2.h) * (double)var1;
      double var7 = var2.i + (var2.f - var2.i) * (double)var1;
      b(var2);
      d = var3 - (double)i;
      e = var5;
      f = var7 - (double)j;
      Lw.a(2983, (FloatBuffer)((FloatBuffer)a.position(0)));
      aku.a((FloatBuffer)b.position(0), (FloatBuffer)a.position(0), c, b);
      a.position(0);
      b.position(0);
      Lw.a(2982, (FloatBuffer)((FloatBuffer)c.position(0)));
      aku.a((FloatBuffer)d.position(0), (FloatBuffer)c.position(0), e, d);
      c.position(0);
      d.position(0);
      b("setCamera");
   }

   private static void b(NN var0) {
      double var1 = Math.abs(d - a);
      double var3 = Math.abs(f - c);
      double var5 = Math.abs(d);
      double var7 = Math.abs(f);
      if (var1 > 1000.0D || var3 > 1000.0D || var5 > 1000000.0D || var7 > 1000000.0D) {
         c(var0);
      }

   }

   private static void c(NN var0) {
      if (var0 == null) {
         i = 0;
         j = 0;
      } else {
         i = (int)var0.d / 1000 * 1000;
         j = (int)var0.f / 1000 * 1000;
      }

   }

   public static void b(sE var0, float var1) {
      NN var2 = var0.a();
      double var3 = var2.g + (var2.d - var2.g) * (double)var1;
      double var5 = var2.h + (var2.e - var2.h) * (double)var1;
      double var7 = var2.i + (var2.f - var2.i) * (double)var1;
      b(var2);
      d = var3 - (double)i;
      e = var5;
      f = var7 - (double)j;
      Lw.a(2983, (FloatBuffer)((FloatBuffer)a.position(0)));
      aku.a((FloatBuffer)b.position(0), (FloatBuffer)a.position(0), c, b);
      a.position(0);
      b.position(0);
      Lw.a(2982, (FloatBuffer)((FloatBuffer)c.position(0)));
      aku.a((FloatBuffer)d.position(0), (FloatBuffer)c.position(0), e, d);
      c.position(0);
      d.position(0);
      Lw.a(0, 0, l, m);
      Lw.a(5889);
      Lw.c();
      if (m) {
         Lw.a((double)(-b), (double)b, (double)(-b), (double)b, 0.05000000074505806D, 256.0D);
      } else {
         GLU.gluPerspective(a, (float)l / (float)m, 0.05F, 256.0F);
      }

      Lw.a(5888);
      Lw.c();
      Lw.b(0.0F, 0.0F, -100.0F);
      Lw.a(90.0F, 1.0F, 0.0F, 0.0F);
      x = var0.a.b(var1);
      y = x < 0.75F ? x + 0.25F : x - 0.75F;
      float var9 = x * -360.0F;
      float var10 = l > 0.0F ? var9 % l - l * 0.5F : 0.0F;
      if ((double)y <= 0.5D) {
         Lw.a(var9 - var10, 0.0F, 0.0F, 1.0F);
         Lw.a(k, 1.0F, 0.0F, 0.0F);
         z = y;
      } else {
         Lw.a(var9 + 180.0F - var10, 0.0F, 0.0F, 1.0F);
         Lw.a(k, 1.0F, 0.0F, 0.0F);
         z = y - 0.5F;
      }

      float var11;
      float var12;
      if (m) {
         var11 = q;
         var12 = var11 / 2.0F;
         Lw.b((float)var3 % var11 - var12, (float)var5 % var11 - var12, (float)var7 % var11 - var12);
      }

      var11 = y * 6.2831855F;
      var12 = (float)Math.cos((double)var11);
      float var13 = (float)Math.sin((double)var11);
      float var14 = k * 6.2831855F;
      float var15 = var12;
      float var16 = var13 * (float)Math.cos((double)var14);
      float var17 = var13 * (float)Math.sin((double)var14);
      if ((double)y > 0.5D) {
         var15 = -var12;
         var16 = -var16;
         var17 = -var17;
      }

      a[0] = var15;
      a[1] = var16;
      a[2] = var17;
      a[3] = 0.0F;
      Lw.a(2983, (FloatBuffer)((FloatBuffer)e.position(0)));
      aku.a((FloatBuffer)f.position(0), (FloatBuffer)e.position(0), g, f);
      e.position(0);
      f.position(0);
      Lw.a(2982, (FloatBuffer)((FloatBuffer)g.position(0)));
      aku.a((FloatBuffer)h.position(0), (FloatBuffer)g.position(0), i, h);
      g.position(0);
      h.position(0);
      a(d, false, a);
      a(e, false, b);
      a(c, false, i);
      a(a, false, c);
      a(b, false, d);
      a(f, false, j);
      a(g, false, e);
      a(h, false, f);
      a(i, false, g);
      a(j, false, h);
      JI var10000 = var0.a;
      JI.j = 1;
      b("setCamera");
   }

   public static void h() {
      Lw.a(k * 1.0F, 0.0F, 0.0F, 1.0F);
      b("preCelestialRotate");
   }

   public static void c(sE var0) {
      FloatBuffer var1 = k;
      var1.clear();
      Lw.a(2982, (FloatBuffer)var1);
      var1.get(q, 0, 16);
      aku.b(j, q, o);
      aku.b(k, q, p);
      System.arraycopy(z == y ? j : k, 0, l, 0, 3);
      a(c, j[0], j[1], j[2]);
      a(d, k[0], k[1], k[2]);
      a(e, l[0], l[1], l[2]);
      if (a != null) {
         a.a(var0);
      }

      b("postCelestialRotate");
   }

   public static void d(sE var0) {
      FloatBuffer var1 = k;
      var1.clear();
      Lw.a(2982, (FloatBuffer)var1);
      var1.get(q, 0, 16);
      aku.b(m, q, n);
      a(f, m[0], m[1], m[2]);
      if (a != null) {
         a.a(var0);
      }

   }

   public static void i() {
      if (a) {
         for(int var0 = 0; var0 < r; ++var0) {
            if ((S & 1 << var0) != 0) {
               By.g('蓀' + d[var0]);
               Lw.a(3553, 10241, 9987);
               Lw.x(3553);
            }
         }

         By.g(33984);
      }

   }

   public static void j() {
      Lw.c(1.0F, 1.0F, 1.0F, 1.0F);
      D();
      int var0 = z.e();
      if (var0 > 1) {
         for(int var1 = 1; var1 < var0; ++var1) {
            V.b(var1);
            D();
         }

         V.b(0);
      }

   }

   private static void D() {
      if (!t()) {
         Lw.j(5);
         Lw.b(0.0F, 0.0F);
         Lw.c(0.0F, 0.0F, 0.0F);
         Lw.b(1.0F, 0.0F);
         Lw.c(1.0F, 0.0F, 0.0F);
         Lw.b(0.0F, 1.0F);
         Lw.c(0.0F, 1.0F, 0.0F);
         Lw.b(1.0F, 1.0F);
         Lw.c(1.0F, 1.0F, 0.0F);
         Lw.e();
      } else {
         Lw.j(7);
         Lw.b(0.0F, 0.0F);
         Lw.c(0.0F, 0.0F, 0.0F);
         Lw.b(1.0F, 0.0F);
         Lw.c(1.0F, 0.0F, 0.0F);
         Lw.b(1.0F, 1.0F);
         Lw.c(1.0F, 1.0F, 0.0F);
         Lw.b(0.0F, 1.0F);
         Lw.c(0.0F, 1.0F, 0.0F);
         Lw.e();
      }

   }

   public static void e(sE var0) {
      if (!c) {
         boolean var1 = a(u);
         if (L) {
            b("pre-render Deferred");
            a(var0, a, false);
            var1 = true;
         }

         if (var1) {
            C();

            for(int var2 = 0; var2 < r; ++var2) {
               Lt.a(36160, '賠' + var2, 3553, a.a(var2), 0);
            }

            if (v.a() != null) {
               a(v.a());
            } else {
               a(f);
            }

            By.g(33984);
            var0.a().a(HO.a);
         }
      }

   }

   public static void f(sE var0) {
      if (!c) {
         a(x);
         b("pre-render CompositeFinal");
         a(var0, b, true);
      }

   }

   private static boolean a(akp var0) {
      boolean var1 = false;
      Boolean[] var2 = var0.a();

      for(int var3 = 0; var3 < r; ++var3) {
         if (afT.a(var2[var3])) {
            a.a(var3);
            var1 = true;
         }
      }

      return var1;
   }

   private static void a(sE var0, akp[] var1, boolean var2) {
      if (!c) {
         Lw.a();
         Lw.c();
         Lw.a(5889);
         Lw.a();
         Lw.c();
         Lw.a(0.0D, 1.0D, 0.0D, 1.0D, 0.0D, 1.0D);
         Lw.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.v();
         By.c();
         By.k();
         By.j();
         By.c(519);
         By.a(false);
         By.f();
         if (u >= 1) {
            By.g(33988);
            By.i(e.get(0));
            if (u >= 2) {
               By.g(33989);
               By.i(e.get(1));
            }
         }

         int var3;
         for(var3 = 0; var3 < r; ++var3) {
            By.g('蓀' + d[var3]);
            By.i(a.a(var3));
         }

         By.g(33990);
         By.i(c.get(0));
         if (s >= 2) {
            By.g(33995);
            By.i(c.get(1));
            if (s >= 3) {
               By.g(33996);
               By.i(c.get(2));
            }
         }

         for(var3 = 0; var3 < t; ++var3) {
            By.g('蓍' + var3);
            By.i(d.get(var3));
         }

         if (M) {
            By.g('蓀' + a.a());
            By.i(a.b());
         }

         a(var2 ? b : c);
         By.g(33984);

         for(var3 = 0; var3 < r; ++var3) {
            Lt.a(36160, '賠' + var3, 3553, a.b(var3), 0);
         }

         Lt.a(36160, 36096, 3553, c.get(0), 0);
         Lw.c(f);
         b("pre-composite");

         for(var3 = 0; var3 < var1.length; ++var3) {
            akp var4 = var1[var3];
            if (var4.b() != 0) {
               a(var0, var4);
               b(var4.a());
               if (S != 0) {
                  i();
               }

               E();
               j();
               F();

               for(int var5 = 0; var5 < r; ++var5) {
                  if (var4.a()[var5]) {
                     a.a(var5);
                     By.g('蓀' + d[var5]);
                     By.i(a.a(var5));
                     Lt.a(36160, '賠' + var5, 3553, a.b(var5), 0);
                  }
               }

               By.g(33984);
            }
         }

         b("composite");
         if (var2) {
            H(var0);
            x = true;
         }

         By.e();
         By.v();
         By.d();
         By.l();
         By.c(515);
         By.a(true);
         Lw.b();
         Lw.a(5888);
         Lw.b();
         a(var0, a);
      }

   }

   private static void E() {
      akR var0 = z.a();
      if (var0 != null) {
         int var1 = (int)((float)b * var0.b());
         int var2 = (int)((float)c * var0.c());
         int var3 = (int)((float)b * var0.a());
         int var4 = (int)((float)c * var0.a());
         Lw.a(var1, var2, var3, var4);
      }

   }

   private static void F() {
      akR var0 = z.a();
      if (var0 != null) {
         Lw.a(0, 0, b, c);
      }

   }

   private static void H(sE var0) {
      y = false;
      var0.a().bindFramebuffer(true);
      Ci.a(Ci.a, Ci.c, 3553, var0.a().f, 0);
      Lw.a(0, 0, var0.a, var0.b);
      By.a(true);
      Lw.b(r, s, t, 1.0F);
      Lw.b(16640);
      Lw.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.v();
      By.c();
      By.k();
      By.j();
      By.c(519);
      By.a(false);
      b("pre-final");
      a(var0, y);
      b("final");
      if (S != 0) {
         i();
      }

      j();
      b("renderCompositeFinal");
   }

   public static void g(sE var0) {
      if (c) {
         b("shadow endRender");
      } else {
         if (!x) {
            f(var0);
         }

         b = false;
         By.a(true, true, true, true);
         a(var0, a);
         Co.a();
         b("endRender end");
      }

   }

   public static void h(sE var0) {
      w = true;
      e = true;
      a(f);
      a(var0, i);
   }

   public static void b(float var0, float var1, float var2) {
      u = var0;
      v = var1;
      w = var2;
      a(b, var0, var1, var2);
   }

   public static void a(Cw var0) {
      Bh var1 = var0.a();
      float var2 = (float)(JI.b() * 16);
      double var3 = (double)var2 * 0.9238D;
      double var5 = (double)var2 * 0.3826D;
      double var7 = -var5;
      double var9 = -var3;
      double var11 = 16.0D;
      double var13 = -e;
      var1.a(7, In.e);
      var1.a(var7, var13, var9).endVertex();
      var1.a(var7, var11, var9).endVertex();
      var1.a(var9, var11, var7).endVertex();
      var1.a(var9, var13, var7).endVertex();
      var1.a(var9, var13, var7).endVertex();
      var1.a(var9, var11, var7).endVertex();
      var1.a(var9, var11, var5).endVertex();
      var1.a(var9, var13, var5).endVertex();
      var1.a(var9, var13, var5).endVertex();
      var1.a(var9, var11, var5).endVertex();
      var1.a(var7, var11, var3).endVertex();
      var1.a(var7, var13, var3).endVertex();
      var1.a(var7, var13, var3).endVertex();
      var1.a(var7, var11, var3).endVertex();
      var1.a(var5, var11, var3).endVertex();
      var1.a(var5, var13, var3).endVertex();
      var1.a(var5, var13, var3).endVertex();
      var1.a(var5, var11, var3).endVertex();
      var1.a(var3, var11, var5).endVertex();
      var1.a(var3, var13, var5).endVertex();
      var1.a(var3, var13, var5).endVertex();
      var1.a(var3, var11, var5).endVertex();
      var1.a(var3, var11, var7).endVertex();
      var1.a(var3, var13, var7).endVertex();
      var1.a(var3, var13, var7).endVertex();
      var1.a(var3, var11, var7).endVertex();
      var1.a(var5, var11, var9).endVertex();
      var1.a(var5, var13, var9).endVertex();
      var1.a(var5, var13, var9).endVertex();
      var1.a(var5, var11, var9).endVertex();
      var1.a(var7, var11, var9).endVertex();
      var1.a(var7, var13, var9).endVertex();
      var0.draw();
   }

   public static void a(JI var0, Cw var1) {
      d(var0.a);
      Lw.e(n, o, p);
      a(var1);
      Lw.e(u, v, w);
   }

   public static void i(sE var0) {
      w = false;
      a(f);
      a(var0, I ? g : f);
   }

   public static boolean a(JI var0) {
      if (!u) {
         return true;
      } else {
         b("shouldRenderClouds");
         return c ? q : JI.c > 0;
      }
   }

   public static void j(sE var0) {
      e = true;
      a(var0, j);
   }

   public static void k(sE var0) {
      u();
      a(var0, I ? g : f);
   }

   public static void l(sE var0) {
      if (b) {
         a(var0, o);
      }

   }

   public static void a(sE var0, NN var1) {
      if (b) {
         a(var0, o);
         a(var1);
      }

   }

   public static void a(NN var0) {
      if (a.a()) {
         int var1 = alW.a(var0);
         int var2 = akf.a(var1);
         if (var2 >= 0) {
            var1 = var2;
         }

         a.b(var1);
      }

   }

   public static void m(sE var0) {
      if (b && r.b() != a.b()) {
         a(var0, r);
         By.d();
         By.a(516, 0.0F);
         By.b(770, 771);
      }

   }

   public static void n(sE var0) {
      if (b && r.b() != a.b()) {
         a(var0, o);
         By.c();
      }

   }

   public static void o(sE var0) {
      if (b) {
         a((NN)null);
         a(var0, I ? g : f);
      }

   }

   public static void k() {
      if (b) {
         z = true;
      }

   }

   public static void l() {
      if (b) {
         z = false;
      }

   }

   public static void b(float var0, float var1, float var2, float var3) {
      if (b && !c) {
         a.a(var0, var1, var2, var3);
      }

   }

   public static void m() {
      if (b) {
         akG.a(a);
         if (!c) {
            a(i);
         }
      }

   }

   public static void n() {
      if (b && !c) {
         a(o.a());
      }

   }

   public static void p(sE var0) {
      if (b) {
         b("beginBlockEntities");
         a(var0, m);
      }

   }

   public static void a(sE var0, aaD var1) {
      if (b) {
         b("nextBlockEntity");
         a(var0, m);
         a(var1);
      }

   }

   public static void a(aaD var0) {
      if (b.a()) {
         int var1 = a(var0);
         b.b(var1);
      }

   }

   private static int a(aaD var0) {
      if (var0 == null) {
         return -1;
      } else {
         nh var1 = var0.a();
         if (var1 == null) {
            return 0;
         } else {
            int var2 = mY.a(var1);
            int var3 = var0.a();
            int var4 = ajZ.a(var2, var3);
            if (var4 >= 0) {
               var2 = var4;
            }

            return var2;
         }
      }
   }

   public static void q(sE var0) {
      if (b) {
         b("endBlockEntities");
         a((aaD)null);
         a(var0, I ? g : f);
         akG.a(a.a());
      }

   }

   public static void r(sE var0) {
      a(var0, g);
   }

   public static void s(sE var0) {
      a(var0, f);
   }

   public static void t(sE var0) {
      a(var0, g);
   }

   public static void o() {
      if (!c && H) {
         l.clear();
         Lw.a(b / 2, c / 2, 1, 1, 6402, 5126, (FloatBuffer)l);
         K = l.get(0);
         float var0 = (float)f * 0.01F;
         float var1 = (float)Math.exp(Math.log(0.5D) * (double)var0 / (double)M);
         L = L * var1 + K * (1.0F - var1);
      }

   }

   public static void u(sE var0) {
      if (!c) {
         if (s >= 3) {
            By.g(33996);
            Lw.a(3553, 0, 0, 0, 0, 0, b, c);
            By.g(33984);
         }

         By.j();
         By.l();
         By.b(770, 771);
         By.d();
         a(var0, t);
      }

   }

   public static void v(sE var0) {
      By.k();
      a(var0, g);
   }

   public static void p() {
      if (s >= 2) {
         By.g(33995);
         b("pre copy depth");
         Lw.a(3553, 0, 0, 0, 0, 0, b, c);
         b("copy depth");
         By.g(33984);
      }

      akG.a(a.a());
   }

   public static void w(sE var0) {
      if (b) {
         if (!c) {
            e(var0);
            a(var0, v);
            By.l();
         }

         By.a(true);
      }

   }

   public static void x(sE var0) {
      if (b) {
         a(var0, I ? g : f);
      }

   }

   public static void q() {
      if ((double)d != 1.0D) {
         Lw.a(1.0D, 1.0D, (double)d);
      }

   }

   public static void a(sE var0, boolean var1) {
      Lw.a(5888);
      Lw.a();
      Lw.a(5889);
      Lw.a();
      Lw.a(5888);
      if (var1) {
         a(var0, w);
      } else {
         a(var0, s);
      }

      b("beginHand");
      a("beginHand");
   }

   public static void r() {
      b("pre endHand");
      a("pre endHand");
      Lw.a(5889);
      Lw.b();
      Lw.a(5888);
      Lw.b();
      By.b(770, 771);
      b("endHand");
   }

   public static void s() {
      By.f();
      By.k();
   }

   public static void y(sE var0) {
      if (w) {
         a(var0, i);
      } else if (z == e) {
         a(var0, I ? g : f);
      }

   }

   public static void z(sE var0) {
      if (w) {
         a(var0, h);
      } else if (z == f || z == g) {
         a(var0, e);
      }

   }

   public static void A(sE var0) {
      a.a(z);
      a(var0, e);
   }

   public static void B(sE var0) {
      a(var0, a.a());
   }

   public static void t() {
      e = true;
      a(N, I);
      a(a, m);
   }

   public static void u() {
      e = false;
      a((alB)N, 0);
   }

   public static void a(BM var0) {
      a(var0.capabilityId);
   }

   public static void a(float var0) {
      m = var0;
      if (e) {
         a(a, var0);
      }

   }

   public static void C(sE var0) {
      I = true;
      if (z == f) {
         a(var0, g);
      }

   }

   public static void D(sE var0) {
      I = false;
      if (z == g) {
         a(var0, f);
      }

   }

   public static String a() {
      if (a == null) {
         return null;
      } else {
         return a instanceof akz ? null : a.a();
      }
   }

   public static InputStream a(String var0) {
      return a == null ? null : a.a(var0);
   }

   public static void v() {
      H += 2;
      H = H / 2 * 2;
      if (H > 4) {
         H = 0;
      }

      H = afT.a(H, 0, 4);
   }

   public static void a(JI var0) {
      b(var0);
      if (u) {
         ajZ.a(var0.a, a);
      }

   }

   private static void b(JI var0) {
      c.clear();
      if (u) {
         ArrayList var1 = new ArrayList(2);
         String var2 = "/shaders/lang/";
         String var3 = "en_US";
         String var4 = ".lang";
         var1.add(var2 + var3 + var4);
         if (!var0.b.equals(var3)) {
            var1.add(var2 + var0.b + var4);
         }

         try {
            Iterator var5 = var1.iterator();

            while(true) {
               InputStream var7;
               do {
                  if (!var5.hasNext()) {
                     return;
                  }

                  String var6 = (String)var5.next();
                  var7 = a.a(var6);
               } while(var7 == null);

               Properties var8 = new Properties();
               agt.a((InputStream)var7, (Map)var8);
               var7.close();
               Iterator var9 = var8.keySet().iterator();

               while(var9.hasNext()) {
                  String var10 = (String)var9.next();
                  String var11 = var8.getProperty(var10);
                  c.put(var10, var11);
               }
            }
         } catch (IOException var12) {
            var12.printStackTrace();
         }
      }

   }

   public static String a(String var0, String var1) {
      String var2 = (String)c.get(var0);
      return var2 == null ? var1 : var2;
   }

   public static boolean b(String var0) {
      if (var0 == null) {
         return false;
      } else if (var0.length() <= 0) {
         return false;
      } else {
         int var1 = var0.lastIndexOf("/");
         if (var1 >= 0) {
            var0 = var0.substring(var1 + 1);
         }

         akp var2 = a(var0);
         return var2 != null;
      }
   }

   public static akp a(String var0) {
      return a.d(var0);
   }

   public static void a(Vh var0) {
      F = a(var0);
   }

   public static void b(Vh var0) {
      G = a(var0);
   }

   public static boolean m() {
      return F;
   }

   public static boolean n() {
      return G;
   }

   public static boolean o() {
      return B && C;
   }

   private static boolean a(Vh var0) {
      if (var0 == null) {
         return false;
      } else {
         SZ var1 = var0.a();
         return var1 instanceof TH && ((TH)var1).a().a() == abu.TRANSLUCENT;
      }
   }

   public static boolean a(abU var0) {
      if (var0 == abU.MAIN_HAND && D) {
         return true;
      } else {
         return var0 == abU.OFF_HAND && E;
      }
   }

   public static boolean p() {
      return !D && !E;
   }

   public static void a(boolean var0, boolean var1) {
      D = var0;
      E = var1;
   }

   public static void b(boolean var0, boolean var1) {
      B = var0;
      C = var1;
   }

   public static boolean q() {
      return B;
   }

   public static boolean r() {
      return C;
   }

   public static float a() {
      return c < 0.0F ? -1.0F : b * c;
   }

   public static void a(boolean var0) {
      A = var0;
   }

   public static boolean s() {
      return A;
   }

   public static void E(sE var0) {
      if (b) {
         a(var0, n);
      }

   }

   public static void F(sE var0) {
      if (b) {
         a(var0, m);
      }

   }

   public static acV a() {
      return new acV(d, e, f);
   }

   public static boolean t() {
      return !K || a.GL_NV_geometry_shader4;
   }

   static {
      a = a.a("entityColor");
      a = a.a("entityId");
      b = a.a("blockEntityId");
      c = a.a("texture");
      d = a.a("lightmap");
      e = a.a("normals");
      f = a.a("specular");
      g = a.a("shadow");
      h = a.a("watershadow");
      i = a.a("shadowtex0");
      j = a.a("shadowtex1");
      k = a.a("depthtex0");
      l = a.a("depthtex1");
      m = a.a("shadowcolor");
      n = a.a("shadowcolor0");
      o = a.a("shadowcolor1");
      p = a.a("noisetex");
      q = a.a("gcolor");
      r = a.a("gdepth");
      s = a.a("gnormal");
      t = a.a("composite");
      u = a.a("gaux1");
      v = a.a("gaux2");
      w = a.a("gaux3");
      x = a.a("gaux4");
      y = a.a("colortex0");
      z = a.a("colortex1");
      A = a.a("colortex2");
      B = a.a("colortex3");
      C = a.a("colortex4");
      D = a.a("colortex5");
      E = a.a("colortex6");
      F = a.a("colortex7");
      G = a.a("gdepthtex");
      H = a.a("depthtex2");
      I = a.a("tex");
      J = a.a("heldItemId");
      K = a.a("heldBlockLightValue");
      L = a.a("heldItemId2");
      M = a.a("heldBlockLightValue2");
      N = a.a("fogMode");
      a = a.a("fogDensity");
      a = a.a("fogColor");
      b = a.a("skyColor");
      O = a.a("worldTime");
      P = a.a("worldDay");
      Q = a.a("moonPhase");
      R = a.a("frameCounter");
      b = a.a("frameTime");
      c = a.a("frameTimeCounter");
      d = a.a("sunAngle");
      e = a.a("shadowAngle");
      f = a.a("rainStrength");
      g = a.a("aspectRatio");
      h = a.a("viewWidth");
      i = a.a("viewHeight");
      j = a.a("near");
      k = a.a("far");
      c = a.a("sunPosition");
      d = a.a("moonPosition");
      e = a.a("shadowLightPosition");
      f = a.a("upPosition");
      g = a.a("previousCameraPosition");
      h = a.a("cameraPosition");
      a = a.a("gbufferModelView");
      b = a.a("gbufferModelViewInverse");
      c = a.a("gbufferPreviousProjection");
      d = a.a("gbufferProjection");
      e = a.a("gbufferProjectionInverse");
      f = a.a("gbufferPreviousModelView");
      g = a.a("shadowProjection");
      h = a.a("shadowProjectionInverse");
      i = a.a("shadowModelView");
      j = a.a("shadowModelViewInverse");
      l = a.a("wetness");
      m = a.a("eyeAltitude");
      a = a.a("eyeBrightness");
      b = a.a("eyeBrightnessSmooth");
      c = a.a("terrainTextureSize");
      S = a.a("terrainIconSize");
      T = a.a("isEyeInWater");
      n = a.a("nightVision");
      o = a.a("blindness");
      p = a.a("screenBrightness");
      U = a.a("hideGUI");
      q = a.a("centerDepthSmooth");
      d = a.a("atlasSize");
      a = a.a("blendFunc");
      V = a.a("instanceId");
      k = 0;
      l = false;
      l = 1024;
      m = 1024;
      n = 1024;
      o = 1024;
      a = 90.0F;
      b = 160.0F;
      m = true;
      c = -1.0F;
      p = 0;
      n = false;
      o = false;
      r = 0;
      s = 0;
      t = 0;
      u = 0;
      v = 0;
      w = 0;
      x = 0;
      y = 0;
      e = new int[8];
      a = new boolean[8];
      a = new Vector4f[8];
      a = new aks();
      a = a.a();
      b = a.b("shadow", a);
      c = a.b("shadow_solid", b);
      d = a.b("shadow_cutout", b);
      e = a.a("gbuffers_basic", a);
      f = a.a("gbuffers_textured", e);
      g = a.a("gbuffers_textured_lit", f);
      h = a.a("gbuffers_skybasic", e);
      i = a.a("gbuffers_skytextured", f);
      j = a.a("gbuffers_clouds", f);
      k = a.a("gbuffers_terrain", g);
      l = a.a("gbuffers_damagedblock", k);
      m = a.a("gbuffers_block", k);
      n = a.a("gbuffers_beaconbeam", f);
      o = a.a("gbuffers_entities", g);
      p = a.a("gbuffers_entities_glowing", o);
      q = a.a("gbuffers_armor_glint", f);
      r = a.a("gbuffers_spidereyes", f);
      s = a.a("gbuffers_hand", g);
      t = a.a("gbuffers_weather", g);
      u = a.c("deferred_pre");
      a = a.b("deferred", 16);
      v = a.a("gbuffers_water", k);
      w = a.a("gbuffers_hand_water", s);
      x = a.c("composite_pre");
      b = a.a("composite", 16);
      y = a.a("final");
      z = a.a();
      c = a.a();
      z = a;
      A = 0;
      a = new akq();
      L = false;
      a = null;
      S = 0;
      a = null;
      a = null;
      b = new boolean[2];
      c = new boolean[2];
      d = new boolean[2];
      e = new boolean[8];
      f = new boolean[8];
      p = false;
      q = false;
      d = 0.125F;
      e = 1.0F;
      f = 1.0F;
      B = 0;
      C = 0;
      D = 0;
      E = 0;
      F = 0;
      G = 0;
      r = true;
      s = true;
      t = true;
      a = new akQ("oldLighting", "Classic Lighting", 0);
      b = new akQ("oldHandLight", "Old Hand Light", 0);
      H = 0;
      a = new String[]{"Nearest", "Nearest-Nearest", "Nearest-Linear"};
      b = new String[]{"Nearest", "Linear"};
      a = new int[]{9728, 9984, 9986};
      b = new int[]{9728, 9729};
      a = null;
      u = false;
      a = null;
      a = null;
      a = null;
      a = null;
      b = new HashMap();
      a = new akP("clouds", "Clouds", 0);
      c = new akQ("oldLighting", "Classic Lighting", 0);
      d = new akQ("oldHandLight", "Old Hand Light", 0);
      e = new akQ("dynamicHandLight", "Dynamic Hand Light", 0);
      f = new akQ("shadowTranslucent", "Shadow Translucent", 0);
      g = new akQ("underwaterOverlay", "Underwater Overlay", 0);
      h = new akQ("sun", "Sun", 0);
      i = new akQ("moon", "Moon", 0);
      j = new akQ("vignette", "Vignette", 0);
      k = new akQ("backFace.solid", "Back-face Solid", 0);
      l = new akQ("backFace.cutout", "Back-face Cutout", 0);
      m = new akQ("backFace.cutoutMipped", "Back-face Cutout Mipped", 0);
      n = new akQ("backFace.translucent", "Back-face Translucent", 0);
      o = new akQ("rain.depth", "Rain Depth", 0);
      p = new akQ("beacon.beam.depth", "Rain Depth", 0);
      q = new akQ("separateAo", "Separate AO", 0);
      r = new akQ("frustum.culling", "Frustum Culling", 0);
      c = new HashMap();
      a = new IntArrayList();
      a = null;
      b = null;
      c = null;
      b = null;
      a = null;
      c = new String[]{"gbuffers", "composite", "deferred"};
      g = 0.5F;
      h = 0.6F;
      i = 0.8F;
      j = -1.0F;
      k = 0.0F;
      l = 0.0F;
      I = 0;
      m = 0.0F;
      q = 2.0F;
      J = 16;
      c = new int[2];
      M = false;
      T = 256;
      d = new int[]{0, 1, 2, 3, 7, 8, 9, 10};
      U = (285 + 8 * z) * 4;
      a = (ByteBuffer)Bx.a(U).limit(0);
      b = new float[16];
      c = new float[16];
      d = new float[16];
      e = new float[16];
      f = new float[16];
      g = new float[16];
      h = new float[16];
      i = new float[16];
      a = a(16);
      b = a(16);
      c = a(16);
      d = a(16);
      e = a(16);
      f = a(16);
      g = a(16);
      h = a(16);
      i = a(16);
      j = a(16);
      k = a(16);
      l = a(16);
      b = a(16);
      c = a(3);
      d = a(8);
      e = a(2);
      f = a(8);
      g = a(8);
      h = (IntBuffer)a(8).limit(0);
      i = (IntBuffer)a(8).put(36064).position(0).limit(1);
      a = new akg(b, 8);
      d = new String[]{"R8", "RG8", "RGB8", "RGBA8", "R8_SNORM", "RG8_SNORM", "RGB8_SNORM", "RGBA8_SNORM", "R16", "RG16", "RGB16", "RGBA16", "R16_SNORM", "RG16_SNORM", "RGB16_SNORM", "RGBA16_SNORM", "R16F", "RG16F", "RGB16F", "RGBA16F", "R32F", "RG32F", "RGB32F", "RGBA32F", "R32I", "RG32I", "RGB32I", "RGBA32I", "R32UI", "RG32UI", "RGB32UI", "RGBA32UI", "R3_G3_B2", "RGB5_A1", "RGB10_A2", "R11F_G11F_B10F", "RGB9_E5"};
      f = new int[]{33321, 33323, 32849, 32856, 36756, 36757, 36758, 36759, 33322, 33324, 32852, 32859, 36760, 36761, 36762, 36763, 33325, 33327, 34843, 34842, 33326, 33328, 34837, 34836, 33333, 33339, 36227, 36226, 33334, 33340, 36209, 36208, 10768, 32855, 32857, 35898, 35901};
      a = Pattern.compile("\\s*([\\w:]+)\\s*=\\s*([-]?\\d+)\\s*");
      a = new File(sE.b, "shaderpacks");
      b = new File(sE.b, "optionsshaders.txt");
   }
}
