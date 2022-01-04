import dev.xdark.feder.IOUtil;
import dev.xdark.feder.RecyclableArrayList;
import dev.xdark.feder.array.CompactArrays;
import dev.xdark.feder.array.EmptyArrays;
import dev.xdark.feder.text.CompactCharSequences;
import java.awt.Dimension;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public final class afT {
   public static String a = null;
   public static String b = null;
   public static String c = null;
   public static String[] a = null;
   public static agE a = null;
   public static agE b = null;
   public static boolean a = false;
   public static boolean b = false;
   private static Thread a = null;
   private static DisplayMode a = null;
   private static DisplayMode[] b = null;
   private static int a = 0;
   private static int b = 0;
   public static boolean c = false;
   private static int c = 0;
   private static final Logger a;
   public static DisplayMode[] a;

   public static String a() {
      return "OptiFine_1.12.2_HD_U_F6_pre1";
   }

   public static void a() {
      a = Display.getAvailableDisplayModes();
   }

   public static void a(JI var0) {
      a = Display.getAvailableDisplayModes();
      a = Display.getDesktopDisplayMode();
      a = Thread.currentThread();
      a = JI.o;
      JI.ak = Ci.e();
      c();
      ContextCapabilities var1 = Ci.a;
      a(var1);
      sE var2 = var0.a;
      b();
      akC.a(var2, var1);
   }

   private static void a(ContextCapabilities var0) {
      e("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      e("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      a = GL11.glGetString(7938);
      b = GL11.glGetString(7937);
      c = GL11.glGetString(7936);
      if (!var0.OpenGL12) {
         e("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      a = var0.GL_NV_fog_distance;
      if (!a) {
         e("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      b = var0.GL_ARB_occlusion_query;
      if (!b) {
         e("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

   }

   public static boolean a() {
      return a;
   }

   public static int a() {
      return 11202;
   }

   private static agE c() {
      ContextCapabilities var0 = Lw.a;
      if (var0.OpenGL44) {
         return new agE(4, 4);
      } else if (var0.OpenGL43) {
         return new agE(4, 3);
      } else if (var0.OpenGL42) {
         return new agE(4, 2);
      } else if (var0.OpenGL41) {
         return new agE(4, 1);
      } else if (var0.OpenGL40) {
         return new agE(4, 0);
      } else if (var0.OpenGL33) {
         return new agE(3, 3);
      } else if (var0.OpenGL32) {
         return new agE(3, 2);
      } else if (var0.OpenGL31) {
         return new agE(3, 1);
      } else if (var0.OpenGL30) {
         return new agE(3, 0);
      } else if (var0.OpenGL21) {
         return new agE(2, 1);
      } else if (var0.OpenGL20) {
         return new agE(2, 0);
      } else if (var0.OpenGL15) {
         return new agE(1, 5);
      } else if (var0.OpenGL14) {
         return new agE(1, 4);
      } else if (var0.OpenGL13) {
         return new agE(1, 3);
      } else if (var0.OpenGL12) {
         return new agE(1, 2);
      } else {
         return var0.OpenGL11 ? new agE(1, 1) : new agE(1, 0);
      }
   }

   public static agE a() {
      if (a == null) {
         String var0 = GL11.glGetString(7938);
         a = a((String)var0, (agE)null);
         if (a == null) {
            a = c();
         }
      }

      return a;
   }

   public static agE b() {
      if (b == null) {
         String var0 = GL11.glGetString(35724);
         b = a((String)var0, (agE)null);
         if (b == null) {
            b = new agE(1, 10);
         }
      }

      return b;
   }

   public static agE a(String var0, agE var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            Pattern var2 = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
            Matcher var3 = var2.matcher(var0);
            if (!var3.matches()) {
               return var1;
            } else {
               int var4 = Integer.parseInt(var3.group(1));
               int var5 = Integer.parseInt(var3.group(2));
               int var6 = var3.group(4) != null ? Integer.parseInt(var3.group(4)) : 0;
               String var7 = var3.group(5);
               return new agE(var4, var5, var6, var7);
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
         return var1;
      }
   }

   public static String[] a() {
      String[] var0 = a;
      return var0 == null ? (a = c()) : var0;
   }

   private static String[] c() {
      try {
         agE var0 = a();
         if (var0.a() >= 3) {
            int var1 = GL11.glGetInteger(33309);
            if (var1 > 0) {
               String[] var2 = new String[var1];

               for(int var3 = 0; var3 < var1; ++var3) {
                  var2[var3] = GL30.glGetStringi(7939, var3);
               }

               return var2;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      try {
         String var6 = GL11.glGetString(7939);
         String[] var7 = var6.split(" ");
         return var7;
      } catch (Exception var4) {
         var4.printStackTrace();
         return new String[0];
      }
   }

   public static void b() {
      c();
      a.setPriority(!ae() ? 10 : (af() ? 10 : 5));
   }

   public static boolean b() {
      return Thread.currentThread() == a;
   }

   public static boolean c() {
      return JI.h > 0;
   }

   public static int b() {
      switch(JI.n) {
      case 2:
         if (O()) {
            return 9985;
         }

         return 9986;
      case 3:
         if (O()) {
            return 9987;
         }

         return 9986;
      default:
         return 9986;
      }
   }

   public static boolean d() {
      if (!a()) {
         return false;
      } else {
         return JI.m == 2;
      }
   }

   public static boolean e() {
      return JI.m == 1;
   }

   public static boolean f() {
      return JI.m == 3;
   }

   public static boolean g() {
      return JI.m != 3;
   }

   public static float a() {
      return JI.i;
   }

   public static void a(String var0) {
      a.info("[OptiFine] " + var0);
   }

   public static void b(String var0) {
      a.warn("[OptiFine] " + var0);
   }

   public static void c(String var0) {
      a.error("[OptiFine] " + var0);
   }

   public static void d(String var0) {
      a.fatal("[OptiFine] " + var0);
   }

   public static void e(String var0) {
      a.info("[OptiFine] " + var0);
   }

   public static int c() {
      return JI.w;
   }

   public static boolean h() {
      if (JI.s == 0) {
         return JI.d;
      } else {
         return JI.s == 2;
      }
   }

   public static boolean i() {
      return JI.s == 3;
   }

   public static boolean j() {
      if (JI.q != 0) {
         return JI.q == 2;
      } else if (ad() && !akC.a.a()) {
         return akC.a.c();
      } else if (c != 0) {
         return c == 2;
      } else {
         return JI.d;
      }
   }

   public static boolean k() {
      if (JI.q != 0) {
         return JI.q == 3;
      } else if (ad() && !akC.a.a()) {
         return akC.a.d();
      } else if (c != 0) {
         return c == 3;
      } else {
         return false;
      }
   }

   public static void a(IN var0) {
      c = 0;

      try {
         InputStream var1 = var0.b(new acC("mcpatcher/color.properties"));
         Throwable var2 = null;

         try {
            if (var1 == null) {
               return;
            }

            Properties var3 = new Properties();
            var3.load(var1);
            String var4 = var3.getProperty("clouds");
            if (var4 != null) {
               a("Texture pack clouds: " + var4);
               var4 = var4.toLowerCase();
               if (var4.equals("fast")) {
                  c = 1;
               }

               if (var4.equals("fancy")) {
                  c = 2;
               }

               if (var4.equals("off")) {
                  c = 3;
               }

               return;
            }
         } catch (Throwable var16) {
            var2 = var16;
            throw var16;
         } finally {
            if (var1 != null) {
               if (var2 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var15) {
                     var2.addSuppressed(var15);
                  }
               } else {
                  var1.close();
               }
            }

         }

      } catch (Exception var18) {
      }
   }

   public static boolean l() {
      if (JI.r == 0) {
         return JI.d;
      } else {
         return JI.r != 1;
      }
   }

   public static boolean m() {
      return JI.r == 4;
   }

   public static boolean n() {
      if (JI.t == 0) {
         return JI.d;
      } else {
         return JI.t == 2;
      }
   }

   public static int a(int var0, int var1, int var2) {
      return adh.a(var0, var1, var2);
   }

   public static float a(float var0, float var1, float var2) {
      return adh.a(var0, var1, var2);
   }

   public static double a(double var0, double var2, double var4) {
      return adh.a(var0, var2, var4);
   }

   public static float a(float var0) {
      return var0 < 0.0F ? 0.0F : Math.min(var0, 1.0F);
   }

   public static boolean o() {
      return JI.C != 2;
   }

   public static boolean p() {
      return JI.W;
   }

   public static boolean q() {
      return JI.D != 2;
   }

   public static boolean r() {
      return JI.V;
   }

   public static boolean s() {
      return JI.X;
   }

   public static boolean t() {
      return JI.Y;
   }

   public static boolean u() {
      return JI.Z;
   }

   public static boolean v() {
      return JI.aa;
   }

   public static boolean w() {
      return JI.ab;
   }

   public static boolean x() {
      return JI.ac;
   }

   public static boolean y() {
      return JI.ad;
   }

   public static boolean z() {
      return JI.ae;
   }

   public static boolean A() {
      return JI.af;
   }

   public static boolean B() {
      return JI.ag;
   }

   public static float b() {
      return ad() && akC.j >= 0.0F ? akC.j : JI.j;
   }

   public static String a(List var0) {
      return a(var0, ", ");
   }

   public static String a(List var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(var0.size() * 5);

         for(int var3 = 0; var3 < var0.size(); ++var3) {
            Object var4 = var0.get(var3);
            if (var3 > 0) {
               var2.append(var1);
            }

            var2.append(var4);
         }

         return var2.toString();
      }
   }

   public static String a(Object[] var0) {
      return a(var0, ", ");
   }

   public static String a(Object[] var0, String var1) {
      if (var0 != null && var0.length != 0) {
         StringBuilder var2 = new StringBuilder(var0.length * 5);
         var2.append(var0[0]);
         int var3 = 1;

         for(int var4 = var0.length; var3 < var4; ++var3) {
            var2.append(var1).append(var0[var3]);
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static String a(int[] var0) {
      return a(var0, ", ");
   }

   public static String a(int[] var0, String var1) {
      if (var0 != null && var0.length != 0) {
         StringBuilder var2 = new StringBuilder(var0.length * 5);
         var2.append(var0[0]);
         int var3 = 1;

         for(int var4 = var0.length; var3 < var4; ++var3) {
            var2.append(var1).append(var0[var3]);
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static String a(float[] var0) {
      return a(var0, ", ");
   }

   public static String a(float[] var0, String var1) {
      if (var0 != null && var0.length != 0) {
         StringBuilder var2 = new StringBuilder(var0.length * 5);
         var2.append(var0[0]);
         int var3 = 1;

         for(int var4 = var0.length; var3 < var4; ++var3) {
            var2.append(var1).append(var0[var3]);
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static boolean C() {
      return JI.u != 3;
   }

   public static boolean D() {
      return JI.u == 2;
   }

   public static boolean E() {
      return JI.D;
   }

   public static boolean F() {
      return JI.F;
   }

   public static boolean G() {
      if (!F()) {
         return false;
      } else {
         return !ad() || akC.f();
      }
   }

   public static boolean H() {
      if (!F()) {
         return false;
      } else {
         return !ad() || akC.g();
      }
   }

   public static boolean I() {
      if (ad() && !akC.h()) {
         return false;
      } else if (JI.v == 0) {
         return JI.d;
      } else {
         return JI.v == 2;
      }
   }

   public static boolean J() {
      return JI.E;
   }

   public static boolean K() {
      return JI.G;
   }

   public static int d() {
      return JI.p;
   }

   public static boolean L() {
      return d() > 1;
   }

   public static int e() {
      return a;
   }

   public static boolean M() {
      return e() > 0;
   }

   public static boolean N() {
      return JI.o > 0;
   }

   public static boolean O() {
      return d() > 1 | e() > 0;
   }

   public static boolean a(float var0, float var1, float var2) {
      return var0 >= var1 && var0 <= var2;
   }

   public static boolean P() {
      return JI.ah;
   }

   public static boolean Q() {
      return JI.H;
   }

   public static Dimension a() {
      if (a == null) {
         return null;
      } else {
         String var0 = JI.c;
         if (var0.equals("Default")) {
            return new Dimension(a.getWidth(), a.getHeight());
         } else {
            String[] var1 = a(var0, " x");
            return var1.length < 2 ? new Dimension(a.getWidth(), a.getHeight()) : new Dimension(a((String)var1[0], -1), a((String)var1[1], -1));
         }
      }
   }

   public static int a(String var0, int var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Integer.parseInt(var0);
         }
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static float a(String var0, float var1) {
      try {
         if (var0 == null) {
            return var1;
         } else {
            var0 = var0.trim();
            return Float.parseFloat(var0);
         }
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static boolean a(String var0, boolean var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();
         return Boolean.parseBoolean(var0);
      }
   }

   public static Boolean a(String var0, Boolean var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim().toLowerCase();
         if (var0.equals("true")) {
            return Boolean.TRUE;
         } else {
            return var0.equals("false") ? Boolean.FALSE : var1;
         }
      }
   }

   public static String[] a(String var0, String var1) {
      StringTokenizer var2 = new StringTokenizer(var0, var1);
      ArrayList var3 = new ArrayList();

      while(var2.hasMoreTokens()) {
         String var4 = var2.nextToken();
         var3.add(var4);
      }

      String[] var5 = (String[])((String[])var3.toArray(new String[0]));
      return var5;
   }

   public static DisplayMode[] a() {
      if (b == null) {
         RecyclableArrayList var0 = RecyclableArrayList.newInstance();

         try {
            DisplayMode[] var1 = a;
            Set var2 = a(var1);
            Iterator var3 = var2.iterator();

            while(var3.hasNext()) {
               Dimension var4 = (Dimension)var3.next();
               DisplayMode[] var5 = a(var1, var4);
               DisplayMode var6 = a(var5, a);
               if (var6 != null) {
                  var0.add(var6);
               }
            }

            DisplayMode[] var12 = (DisplayMode[])var0.toArray(new DisplayMode[0]);
            Arrays.sort(var12, alV.a);
            DisplayMode[] var13 = var12;
            return var13;
         } catch (Exception var10) {
            var10.printStackTrace();
            b = new DisplayMode[]{a};
            return b;
         } finally {
            var0.recycle();
         }
      } else {
         return b;
      }
   }

   public static DisplayMode a() {
      DisplayMode[] var0 = a();
      DisplayMode var1 = a;
      if (var0 != null && var0.length >= 1) {
         DisplayMode var2 = var0[var0.length - 1];
         if (var1.getWidth() > var2.getWidth()) {
            return var1;
         } else {
            return var1.getWidth() == var2.getWidth() && var1.getHeight() > var2.getHeight() ? var1 : var2;
         }
      } else {
         return var1;
      }
   }

   private static Set<Dimension> a(DisplayMode[] var0) {
      HashSet var1 = new HashSet();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         DisplayMode var3 = var0[var2];
         Dimension var4 = new Dimension(var3.getWidth(), var3.getHeight());
         var1.add(var4);
      }

      return var1;
   }

   private static DisplayMode[] a(DisplayMode[] var0, Dimension var1) {
      RecyclableArrayList var2 = RecyclableArrayList.newInstance();

      for(int var3 = 0; var3 < var0.length; ++var3) {
         DisplayMode var4 = var0[var3];
         if ((double)var4.getWidth() == var1.getWidth() && (double)var4.getHeight() == var1.getHeight()) {
            var2.add(var4);
         }
      }

      DisplayMode[] var5 = (DisplayMode[])var2.toArray(new DisplayMode[0]);
      var2.recycle();
      return var5;
   }

   private static DisplayMode a(DisplayMode[] var0, DisplayMode var1) {
      if (var1 != null) {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            DisplayMode var3 = var0[var2];
            if (var3.getBitsPerPixel() == var1.getBitsPerPixel() && var3.getFrequency() == var1.getFrequency()) {
               return var3;
            }
         }
      }

      if (var0.length <= 0) {
         return null;
      } else {
         Arrays.sort(var0, alV.a);
         return var0[var0.length - 1];
      }
   }

   public static String[] b() {
      DisplayMode[] var0 = a();
      String[] var1 = new String[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         DisplayMode var3 = var0[var2];
         String var4 = acm.a(var3.getWidth()) + 'x' + acm.a(var3.getHeight());
         var1[var2] = var4;
      }

      return var1;
   }

   public static DisplayMode a(Dimension var0) {
      DisplayMode[] var1 = a();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         DisplayMode var3 = var1[var2];
         if (var3.getWidth() == var0.width && var3.getHeight() == var0.height) {
            return var3;
         }
      }

      return a;
   }

   public static boolean R() {
      return JI.ai;
   }

   public static boolean S() {
      return JI.aj;
   }

   public static boolean T() {
      return JI.I;
   }

   public static void f(String var0) {
      int var1 = By.b();
      if (var1 != 0 && agq.a()) {
         String var2 = a(var1);
         String var3 = String.format("OpenGL error: %s (%s), at: %s", var1, var2, var0);
         c(var3);
         if (ao() && amn.a("ShowGlError", 10000L)) {
            String var4 = IK.a("of.message.openglError", var1, var2);
            c(var4);
         }
      }

   }

   public static boolean U() {
      return JI.J;
   }

   public static boolean V() {
      return JI.K;
   }

   public static boolean W() {
      return JI.L;
   }

   public static boolean X() {
      return JI.M;
   }

   public static boolean Y() {
      return JI.y != 3;
   }

   public static boolean Z() {
      return JI.N;
   }

   public static boolean aa() {
      return JI.O;
   }

   public static boolean ab() {
      return JI.y == 2;
   }

   public static boolean ac() {
      return JI.P;
   }

   public static boolean ad() {
      return akC.u;
   }

   public static String[] a(InputStream var0) {
      return (String[])IOUtil.readLines(var0, LB.a()).toArray(EmptyArrays.STRING);
   }

   public static String a(InputStream var0) {
      return a(var0, StandardCharsets.US_ASCII);
   }

   public static String a(InputStream var0, Charset var1) {
      return IOUtil.toString(var0, var1, LB.a());
   }

   public static int a(String var0, String var1) {
      String[] var2 = a(var0);
      String[] var3 = a(var1);
      String var4 = var2[0];
      String var5 = var3[0];
      if (!var4.equals(var5)) {
         return var4.compareTo(var5);
      } else {
         int var6 = a((String)var2[1], -1);
         int var7 = a((String)var3[1], -1);
         if (var6 != var7) {
            return var6 - var7;
         } else {
            String var8 = var2[2];
            String var9 = var3[2];
            if (!var8.equals(var9)) {
               if (var8.isEmpty()) {
                  return 1;
               }

               if (var9.isEmpty()) {
                  return -1;
               }
            }

            return var8.compareTo(var9);
         }
      }
   }

   private static String[] a(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         Pattern var1 = Pattern.compile("([A-Z])([0-9]+)(.*)");
         Matcher var2 = var1.matcher(var0);
         if (!var2.matches()) {
            return new String[]{"", "", ""};
         } else {
            String var3 = a(var2.group(1));
            String var4 = a(var2.group(2));
            String var5 = a(var2.group(3));
            return new String[]{var3, var4, var5};
         }
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static int a(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      var0 ^= var0 >> 15;
      return var0;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      int var4 = a(var3 + 37);
      var4 = a(var4 + var0);
      var4 = a(var4 + var2);
      var4 = a(var4 + var1);
      return var4;
   }

   public static int a(acV var0, int var1) {
      return a(var0.a, var0.b, var0.c, var1);
   }

   public static int f() {
      return b;
   }

   public static void c() {
      b = Runtime.getRuntime().availableProcessors();
   }

   public static boolean ae() {
      return f() <= 1;
   }

   public static boolean af() {
      return JI.y;
   }

   public static boolean ag() {
      return JI.Q;
   }

   public static boolean ah() {
      return JI.R;
   }

   public static boolean a(Object var0, Object[] var1) {
      return var1 != null && CompactArrays.indexOf(var1, var0) != -1;
   }

   public static boolean a(int var0, int[] var1) {
      return CompactArrays.indexOf(var1, var0) != -1;
   }

   public static boolean b(Object var0, Object[] var1) {
      if (var1 != null) {
         int var2 = 0;

         for(int var3 = var1.length; var2 < var3; ++var2) {
            if (var0 == var1[var2]) {
               return true;
            }
         }
      }

      return false;
   }

   public static String a(String var0) {
      return CompactCharSequences.orEmpty(var0);
   }

   public static void a(sE var0) {
      var0.a().createBindFramebuffer(var0.a, var0.b);
      if (var0.a != null) {
         var0.a.a(var0.a, var0.b);
      }

   }

   public static Object[] a(Object[] var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException("The given array is NULL");
      } else {
         int var2 = var0.length;
         int var3 = var2 + 1;
         Object[] var4 = (Object[])((Object[])Array.newInstance(var0.getClass().getComponentType(), var3));
         System.arraycopy(var0, 0, var4, 0, var2);
         var4[var2] = var1;
         return var4;
      }
   }

   public static Object[] a(Object[] var0, Object var1, int var2) {
      ArrayList var3 = new ArrayList(Arrays.asList(var0));
      var3.add(var2, var1);
      Object[] var4 = (Object[])((Object[])Array.newInstance(var0.getClass().getComponentType(), var3.size()));
      return var3.toArray(var4);
   }

   public static Object[] a(Object[] var0, Object[] var1) {
      if (var0 == null) {
         throw new NullPointerException("The given array is NULL");
      } else if (var1.length == 0) {
         return var0;
      } else {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         Object[] var4 = (Object[])((Object[])Array.newInstance(var0.getClass().getComponentType(), var3));
         System.arraycopy(var0, 0, var4, 0, var2);
         System.arraycopy(var1, 0, var4, var2, var1.length);
         return var4;
      }
   }

   public static Object[] b(Object[] var0, Object var1) {
      ArrayList var2 = new ArrayList(Arrays.asList(var0));
      var2.remove(var1);
      Object[] var3 = a((Collection)var2, (Class)var0.getClass().getComponentType());
      return var3;
   }

   public static Object[] a(Collection var0, Class var1) {
      if (var0 == null) {
         return null;
      } else if (var1 == null) {
         return null;
      } else if (var1.isPrimitive()) {
         throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + var1);
      } else {
         Object[] var2 = (Object[])((Object[])Array.newInstance(var1, var0.size()));
         return var0.toArray(var2);
      }
   }

   public static void b(sE var0) {
      var0.a.a(var0.a, 2, 2, -2039584);
   }

   public static void a(sE var0, String var1, String var2) {
      aje var3 = new aje(var0.a, var1, var2);
      var0.a((uI)var3);
   }

   public static int[] a(int[] var0, int var1) {
      return a(var0, new int[]{var1});
   }

   public static int[] a(int[] var0, int[] var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.length;
         int var3 = var2 + var1.length;
         int[] var4 = new int[var3];
         System.arraycopy(var0, 0, var4, 0, var2);
         System.arraycopy(var1, 0, var4, var2, var1.length);
         return var4;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static boolean ai() {
      return JI.A != 3;
   }

   public static boolean aj() {
      return JI.A == 1;
   }

   public static boolean ak() {
      if (!ai()) {
         return false;
      } else {
         return !ad() || akC.b();
      }
   }

   public static boolean al() {
      return JI.S;
   }

   public static boolean am() {
      return JI.T;
   }

   public static int g() {
      return JI.B;
   }

   public static boolean an() {
      return JI.z;
   }

   public static boolean ao() {
      return JI.U;
   }

   public static String a(boolean[] var0, String var1) {
      if (var0 != null && var0.length != 0) {
         StringBuilder var2 = new StringBuilder(var0.length * 5);
         var2.append(var0[0]);
         int var3 = 1;

         for(int var4 = var0.length; var3 < var4; ++var3) {
            var2.append(var1).append(var0[var3]);
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static String a(int var0) {
      switch(var0) {
      case 0:
         return "No error";
      case 1280:
         return "Invalid enum";
      case 1281:
         return "Invalid value";
      case 1282:
         return "Invalid operation";
      case 1283:
         return "Stack overflow";
      case 1284:
         return "Stack underflow";
      case 1285:
         return "Out of memory";
      case 1286:
         return "Invalid framebuffer operation";
      default:
         return "<unknown>: " + var0;
      }
   }

   public static boolean a(Boolean var0) {
      return var0 != null && var0;
   }

   public static boolean ap() {
      if (!ad()) {
         return false;
      } else {
         return !akC.t();
      }
   }

   static {
      a = sE.a;
   }
}
