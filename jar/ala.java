import java.util.Arrays;
import org.lwjgl.opengl.ARBShaderObjects;

public final class alA extends alH {
   private float[] a;

   public alA(String var1) {
      super(var1);
      this.a();
   }

   public void a(float var1) {
      int var2 = this.b();
      float[] var3 = this.a;
      float var4 = var3[var2];
      if (var1 != var4) {
         var3[var2] = var1;
         int var5 = this.c();
         if (var5 >= 0) {
            ARBShaderObjects.glUniform1fARB(var5, var1);
            this.d();
         }
      }

   }

   public float a() {
      int var1 = this.b();
      return this.a[var1];
   }

   protected void a(int var1) {
      float[] var2 = this.a;
      if (var1 >= var2.length) {
         float[] var3 = new float[var1 + 10];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         Arrays.fill(var3, var2.length, var3.length, -3.4028235E38F);
         this.a = var3;
      }

   }

   protected void a() {
      this.a = new float[]{-3.4028235E38F};
   }
}
