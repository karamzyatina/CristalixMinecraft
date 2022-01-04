import org.lwjgl.opengl.ARBShaderObjects;

public final class alD extends alH {
   private int[][] a;

   public alD(String var1) {
      super(var1);
      this.a();
   }

   public void a(int var1, int var2) {
      int var3 = this.b();
      int[] var4 = this.a[var3];
      if (var4[0] != var1 || var4[1] != var2) {
         var4[0] = var1;
         var4[1] = var2;
         int var5 = this.c();
         if (var5 >= 0) {
            ARBShaderObjects.glUniform2iARB(var5, var1, var2);
            this.d();
         }
      }

   }

   public int[] a() {
      int var1 = this.b();
      int[] var2 = this.a[var1];
      return var2;
   }

   protected void a(int var1) {
      if (var1 >= this.a.length) {
         int[][] var2 = this.a;
         int[][] var3 = new int[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.a = var3;
      }

      if (this.a[var1] == null) {
         this.a[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
      }

   }

   protected void a() {
      this.a = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
