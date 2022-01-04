import java.util.Arrays;
import org.lwjgl.opengl.ARBShaderObjects;

public final class alB extends alH {
   private int[] a;

   public alB(String var1) {
      super(var1);
      this.a();
   }

   public void b(int var1) {
      int var2 = this.b();
      int[] var3 = this.a;
      int var4 = var3[var2];
      if (var1 != var4) {
         var3[var2] = var1;
         int var5 = this.c();
         if (var5 >= 0) {
            ARBShaderObjects.glUniform1iARB(var5, var1);
            this.d();
         }
      }

   }

   public int a() {
      int var1 = this.b();
      return this.a[var1];
   }

   protected void a(int var1) {
      int[] var2 = this.a;
      if (var1 >= var2.length) {
         int[] var3 = new int[var1 + 10];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         Arrays.fill(var3, var2.length, var3.length, Integer.MIN_VALUE);
         this.a = var3;
      }

   }

   protected void a() {
      this.a = new int[]{Integer.MIN_VALUE};
   }
}
