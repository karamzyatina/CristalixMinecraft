import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.util.glu.GLU;

public final class AI {
   private static final IntBuffer a;
   private static final FloatBuffer a;
   private static final FloatBuffer b;
   private static final FloatBuffer c;
   private static final adm a;
   private static float a;
   private static float b;
   private static float c;
   private static float d;
   private static float e;

   private static ByteBuffer a(ByteBuffer var0, int var1) {
      return Bx.a(var0, var1, 4);
   }

   public static void a(NN var0, boolean var1) {
      FloatBuffer var2 = a;
      FloatBuffer var3 = b;
      IntBuffer var4 = a;
      FloatBuffer var5 = c;
      By.c(2982, var2);
      By.c(2983, var3);
      By.a(2978, (IntBuffer)var4);
      float var6 = (float)((var4.get(0) + var4.get(2)) / 2);
      float var7 = (float)((var4.get(1) + var4.get(3)) / 2);
      GLU.gluUnProject(var6, var7, 0.0F, var2, var3, var4, var5);
      a.g((double)var5.get(0), (double)var5.get(1), (double)var5.get(2));
      int var8 = var1 ? 1 : 0;
      float var9 = var0.k;
      float var10 = var0.j;
      float var11 = var10 * 0.017453292F;
      float var12 = (float)(1 - var8 * 2);
      float var13 = adh.b(var11) * var12;
      float var14 = adh.a(var11) * var12;
      a = var13;
      c = var14;
      var11 = var9 * 0.017453292F;
      d = -var14 * adh.a(var11) * var12;
      e = var13 * adh.a(var11) * var12;
      b = adh.b(var9 * 0.017453292F);
   }

   public static sD a(aej var0, NN var1, float var2) {
      double var3 = (double)var2;
      double var5 = var1.a;
      double var7 = var1.b;
      double var9 = var1.c;
      double var11 = var5 + (var1.d - var5) * var3;
      double var13 = var7 + (var1.e - var7) * var3;
      double var15 = var9 + (var1.f - var9) * var3;
      adm var17 = a;
      double var18 = var11 + var17.a;
      double var20 = var13 + var17.b;
      double var22 = var15 + var17.c;
      int var24 = adh.b(var18);
      int var25 = adh.b(var20);
      int var26 = adh.b(var22);
      sD var27 = var0.a(var24, var25, var26);
      if (var27.a().isLiquid()) {
         float var28 = 0.0F;
         if (var27.a() instanceof pj) {
            var28 = pj.a((Integer)var27.a((so)pj.a)) - 0.11111111F;
         }

         float var29 = (float)(var25 + 1) - var28;
         if (var20 >= (double)var29) {
            var27 = var0.a(var24, var25 + 1, var26);
         }
      }

      return var27;
   }

   public static adm a() {
      return a;
   }

   public static float a() {
      return a;
   }

   public static float b() {
      return b;
   }

   public static float c() {
      return c;
   }

   public static float d() {
      return d;
   }

   public static float e() {
      return e;
   }

   static {
      ByteBuffer var0 = (ByteBuffer)Bx.a(204).limit(0);
      a = a(var0, 16).asIntBuffer();
      a = a(var0, 16).asFloatBuffer();
      b = a(var0, 16).asFloatBuffer();
      c = a(var0, 3).asFloatBuffer();
      a = new adm(0.0D, 0.0D, 0.0D);
   }
}
