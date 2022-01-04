import org.lwjgl.opengl.ARBShaderObjects;

public final class alC extends alH {
   private float[][] a;

   public alC(String var1) {
      super(var1);
      this.a();
   }

   public void a(float var1, float var2) {
      int var3 = this.b();
      float[] var4 = this.a[var3];
      if (var4[0] != var1 || var4[1] != var2) {
         var4[0] = var1;
         var4[1] = var2;
         int var5 = this.c();
         if (var5 >= 0) {
            ARBShaderObjects.glUniform2fARB(var5, var1, var2);
            this.d();
         }
      }

   }

   public float[] a() {
      int var1 = this.b();
      float[] var2 = this.a[var1];
      return var2;
   }

   protected void a(int var1) {
      if (var1 >= this.a.length) {
         float[][] var2 = this.a;
         float[][] var3 = new float[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.a = var3;
      }

      if (this.a[var1] == null) {
         this.a[var1] = new float[]{-3.4028235E38F, -3.4028235E38F};
      }

   }

   protected void a() {
      this.a = new float[][]{{-3.4028235E38F, -3.4028235E38F}};
   }
}
