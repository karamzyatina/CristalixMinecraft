import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.vector.Matrix4f;

public class JW {
   private static final Logger a;
   private int a;
   private final int b;
   private final int c;
   private final IntBuffer a;
   private final FloatBuffer a;
   private final String a;
   private final JV a;

   public JW(String var1, int var2, int var3, JV var4) {
      this.a = var1;
      this.b = var3;
      this.c = var2;
      this.a = var4;
      if (var2 <= 3) {
         this.a = Bx.a(var3);
         this.a = null;
      } else {
         this.a = null;
         this.a = Bx.a(var3);
      }

      this.a = -1;
      this.b();
   }

   private void b() {
      if (this.a != null) {
         this.a.d();
      }

   }

   public static int a(String var0) {
      byte var1 = -1;
      if ("int".equals(var0)) {
         var1 = 0;
      } else if ("float".equals(var0)) {
         var1 = 4;
      } else if (var0.startsWith("matrix")) {
         if (var0.endsWith("2x2")) {
            var1 = 8;
         } else if (var0.endsWith("3x3")) {
            var1 = 9;
         } else if (var0.endsWith("4x4")) {
            var1 = 10;
         }
      }

      return var1;
   }

   public void a(int var1) {
      this.a = var1;
   }

   public String a() {
      return this.a;
   }

   public void a(float var1) {
      FloatBuffer var2 = this.a;
      var2.position(0);
      var2.put(0, var1);
      this.b();
   }

   public void a(float var1, float var2) {
      FloatBuffer var3 = this.a;
      var3.position(0);
      var3.put(0, var1).put(1, var2);
      this.b();
   }

   public void a(float var1, float var2, float var3) {
      FloatBuffer var4 = this.a;
      var4.position(0);
      var4.put(0, var1).put(1, var2).put(2, var3);
      this.b();
   }

   public void a(float var1, float var2, float var3, float var4) {
      FloatBuffer var5 = this.a;
      var5.position(0);
      var5.put(var1).put(var2).put(var3).put(var4).flip();
      this.b();
   }

   public void b(float var1, float var2, float var3, float var4) {
      this.a.position(0);
      if (this.c >= 4) {
         this.a.put(0, var1);
      }

      if (this.c >= 5) {
         this.a.put(1, var2);
      }

      if (this.c >= 6) {
         this.a.put(2, var3);
      }

      if (this.c >= 7) {
         this.a.put(3, var4);
      }

      this.b();
   }

   public void a(int var1, int var2, int var3, int var4) {
      IntBuffer var5 = this.a;
      var5.position(0);
      if (this.c >= 0) {
         var5.put(0, var1);
      }

      if (this.c >= 1) {
         var5.put(1, var2);
      }

      if (this.c >= 2) {
         var5.put(2, var3);
      }

      if (this.c >= 3) {
         var5.put(3, var4);
      }

      this.b();
   }

   public void a(float[] var1) {
      if (var1.length < this.b) {
         a.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.b, var1.length);
      } else {
         FloatBuffer var2 = this.a;
         var2.position(0);
         var2.put(var1).position(0);
         this.b();
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      FloatBuffer var17 = this.a;
      var17.position(0);
      var17.put(0, var1).put(1, var2).put(2, var3).put(3, var4).put(4, var5).put(5, var6).put(6, var7).put(7, var8).put(8, var9).put(9, var10).put(10, var11).put(11, var12).put(12, var13).put(13, var14).put(14, var15).put(15, var16);
      this.b();
   }

   public void a(Matrix4f var1) {
      this.a(var1.m00, var1.m01, var1.m02, var1.m03, var1.m10, var1.m11, var1.m12, var1.m13, var1.m20, var1.m21, var1.m22, var1.m23, var1.m30, var1.m31, var1.m32, var1.m33);
   }

   public void a() {
      if (this.c <= 3) {
         this.c();
      } else if (this.c <= 7) {
         this.d();
      } else {
         if (this.c > 10) {
            a.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.c);
            return;
         }

         this.e();
      }

   }

   private void c() {
      switch(this.c) {
      case 0:
         Ci.a(this.a, this.a);
         break;
      case 1:
         Ci.b(this.a, this.a);
         break;
      case 2:
         Ci.c(this.a, this.a);
         break;
      case 3:
         Ci.d(this.a, this.a);
         break;
      default:
         a.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.b);
      }

   }

   private void d() {
      switch(this.c) {
      case 4:
         Ci.a(this.a, this.a);
         break;
      case 5:
         Ci.b(this.a, this.a);
         break;
      case 6:
         Ci.c(this.a, this.a);
         break;
      case 7:
         Ci.d(this.a, this.a);
         break;
      default:
         a.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.b);
      }

   }

   private void e() {
      switch(this.c) {
      case 8:
         Ci.a(this.a, true, this.a);
         break;
      case 9:
         Ci.b(this.a, true, this.a);
         break;
      case 10:
         Ci.c(this.a, true, this.a);
      }

   }

   static {
      a = sE.a;
   }
}
