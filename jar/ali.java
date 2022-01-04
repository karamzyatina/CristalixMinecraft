import java.nio.FloatBuffer;
import org.lwjgl.opengl.ARBShaderObjects;

public final class alI extends alH {
   private boolean a;
   private FloatBuffer a;

   public alI(String var1) {
      super(var1);
   }

   public void a(boolean var1, FloatBuffer var2) {
      this.a = var1;
      this.a = var2;
      int var3 = this.c();
      if (var3 >= 0) {
         ARBShaderObjects.glUniformMatrix4ARB(var3, var1, var2);
         this.d();
      }

   }

   public float a(int var1, int var2) {
      FloatBuffer var3 = this.a;
      if (var3 == null) {
         return 0.0F;
      } else {
         int var4 = this.a ? var2 * 4 + var1 : var1 * 4 + var2;
         return var3.get(var4);
      }
   }

   protected void a(int var1) {
   }

   protected void a() {
      this.a = null;
   }
}
