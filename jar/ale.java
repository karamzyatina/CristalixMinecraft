import org.lwjgl.opengl.ARBShaderObjects;

public final class alE extends alH {
   private float[][] a;

   public alE(String var1) {
      super(var1);
      this.a();
   }

   public void a(float var1, float var2, float var3) {
      int var4 = this.b();
      float[] var5 = this.a[var4];
      if (var5[0] != var1 || var5[1] != var2 || var5[2] != var3) {
         var5[0] = var1;
         var5[1] = var2;
         var5[2] = var3;
         int var6 = this.c();
         if (var6 >= 0) {
            ARBShaderObjects.glUniform3fARB(var6, var1, var2, var3);
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
         this.a[var1] = new float[]{-3.4028235E38F, -3.4028235E38F, -3.4028235E38F};
      }

   }

   protected void a() {
      this.a = new float[][]{{-3.4028235E38F, -3.4028235E38F, -3.4028235E38F}};
   }
}
