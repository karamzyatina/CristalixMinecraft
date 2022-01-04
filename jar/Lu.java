import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public final class LU {
   private LU() {
   }

   public static void a(float var0, float var1, float var2, float var3, Matrix4f var4) {
      float var5 = (float)Math.cos((double)var0);
      float var6 = (float)Math.sin((double)var0);
      float var7 = 1.0F - var5;
      float var8 = var1 * var2;
      float var9 = var2 * var3;
      float var10 = var1 * var3;
      float var11 = var1 * var6;
      float var12 = var2 * var6;
      float var13 = var3 * var6;
      float var14 = var1 * var1 * var7 + var5;
      float var15 = var8 * var7 + var13;
      float var16 = var10 * var7 - var12;
      float var17 = var8 * var7 - var13;
      float var18 = var2 * var2 * var7 + var5;
      float var19 = var9 * var7 + var11;
      float var20 = var10 * var7 + var12;
      float var21 = var9 * var7 - var11;
      float var22 = var3 * var3 * var7 + var5;
      float var23 = var4.m00 * var14 + var4.m10 * var15 + var4.m20 * var16;
      float var24 = var4.m01 * var14 + var4.m11 * var15 + var4.m21 * var16;
      float var25 = var4.m02 * var14 + var4.m12 * var15 + var4.m22 * var16;
      float var26 = var4.m03 * var14 + var4.m13 * var15 + var4.m23 * var16;
      float var27 = var4.m00 * var17 + var4.m10 * var18 + var4.m20 * var19;
      float var28 = var4.m01 * var17 + var4.m11 * var18 + var4.m21 * var19;
      float var29 = var4.m02 * var17 + var4.m12 * var18 + var4.m22 * var19;
      float var30 = var4.m03 * var17 + var4.m13 * var18 + var4.m23 * var19;
      var4.m20 = var4.m00 * var20 + var4.m10 * var21 + var4.m20 * var22;
      var4.m21 = var4.m01 * var20 + var4.m11 * var21 + var4.m21 * var22;
      var4.m22 = var4.m02 * var20 + var4.m12 * var21 + var4.m22 * var22;
      var4.m23 = var4.m03 * var20 + var4.m13 * var21 + var4.m23 * var22;
      var4.m00 = var23;
      var4.m01 = var24;
      var4.m02 = var25;
      var4.m03 = var26;
      var4.m10 = var27;
      var4.m11 = var28;
      var4.m12 = var29;
      var4.m13 = var30;
   }

   public static void a(float var0, float var1, float var2, Vector3f var3) {
      var3.set(var3.x + var0, var3.y + var1, var3.z + var2);
   }

   public static void a(Vector3f var0, Vector3f var1, Vector3f var2) {
      var2.set(var0.x - var1.x, var0.y - var1.y, var0.z - var1.z);
   }

   public static void b(Vector3f var0, Vector3f var1, Vector3f var2) {
      var2.set(var0.y * var1.z - var0.z * var1.y, var1.x * var0.z - var1.z * var0.x, var0.x * var1.y - var0.y * var1.x);
   }

   public static void a(Matrix4f var0, Vector4f var1, Vector4f var2) {
      float var3 = var0.m00 * var1.x + var0.m10 * var1.y + var0.m20 * var1.z + var0.m30 * var1.w;
      float var4 = var0.m01 * var1.x + var0.m11 * var1.y + var0.m21 * var1.z + var0.m31 * var1.w;
      float var5 = var0.m02 * var1.x + var0.m12 * var1.y + var0.m22 * var1.z + var0.m32 * var1.w;
      float var6 = var0.m03 * var1.x + var0.m13 * var1.y + var0.m23 * var1.z + var0.m33 * var1.w;
      var2.x = var3;
      var2.y = var4;
      var2.z = var5;
      var2.w = var6;
   }

   public static void a(Matrix4f var0, Matrix4f var1, Matrix4f var2) {
      float var3 = var0.m00 * var1.m00 + var0.m10 * var1.m01 + var0.m20 * var1.m02 + var0.m30 * var1.m03;
      float var4 = var0.m01 * var1.m00 + var0.m11 * var1.m01 + var0.m21 * var1.m02 + var0.m31 * var1.m03;
      float var5 = var0.m02 * var1.m00 + var0.m12 * var1.m01 + var0.m22 * var1.m02 + var0.m32 * var1.m03;
      float var6 = var0.m03 * var1.m00 + var0.m13 * var1.m01 + var0.m23 * var1.m02 + var0.m33 * var1.m03;
      float var7 = var0.m00 * var1.m10 + var0.m10 * var1.m11 + var0.m20 * var1.m12 + var0.m30 * var1.m13;
      float var8 = var0.m01 * var1.m10 + var0.m11 * var1.m11 + var0.m21 * var1.m12 + var0.m31 * var1.m13;
      float var9 = var0.m02 * var1.m10 + var0.m12 * var1.m11 + var0.m22 * var1.m12 + var0.m32 * var1.m13;
      float var10 = var0.m03 * var1.m10 + var0.m13 * var1.m11 + var0.m23 * var1.m12 + var0.m33 * var1.m13;
      float var11 = var0.m00 * var1.m20 + var0.m10 * var1.m21 + var0.m20 * var1.m22 + var0.m30 * var1.m23;
      float var12 = var0.m01 * var1.m20 + var0.m11 * var1.m21 + var0.m21 * var1.m22 + var0.m31 * var1.m23;
      float var13 = var0.m02 * var1.m20 + var0.m12 * var1.m21 + var0.m22 * var1.m22 + var0.m32 * var1.m23;
      float var14 = var0.m03 * var1.m20 + var0.m13 * var1.m21 + var0.m23 * var1.m22 + var0.m33 * var1.m23;
      float var15 = var0.m00 * var1.m30 + var0.m10 * var1.m31 + var0.m20 * var1.m32 + var0.m30 * var1.m33;
      float var16 = var0.m01 * var1.m30 + var0.m11 * var1.m31 + var0.m21 * var1.m32 + var0.m31 * var1.m33;
      float var17 = var0.m02 * var1.m30 + var0.m12 * var1.m31 + var0.m22 * var1.m32 + var0.m32 * var1.m33;
      float var18 = var0.m03 * var1.m30 + var0.m13 * var1.m31 + var0.m23 * var1.m32 + var0.m33 * var1.m33;
      var2.m00 = var3;
      var2.m01 = var4;
      var2.m02 = var5;
      var2.m03 = var6;
      var2.m10 = var7;
      var2.m11 = var8;
      var2.m12 = var9;
      var2.m13 = var10;
      var2.m20 = var11;
      var2.m21 = var12;
      var2.m22 = var13;
      var2.m23 = var14;
      var2.m30 = var15;
      var2.m31 = var16;
      var2.m32 = var17;
      var2.m33 = var18;
   }

   public static float a(Vector3f var0, float var1, float var2, float var3) {
      return var0.x * var1 + var0.y * var2 + var0.z * var3;
   }
}
