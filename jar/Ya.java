public class ya extends wY {
   public xN a;
   public xN[] a = new xN[8];

   public ya(sE var1) {
      this.a = new xN(var1, this, 0, 0);
      this.a.a(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      xN var10000 = this.a;
      var10000.d += 8.0F;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = new xN(var1, this, 48, 0);
         double var3 = (double)var2 * 3.141592653589793D * 2.0D / (double)this.a.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.a[var2].a(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.a[var2].c = var5;
         this.a[var2].e = var6;
         this.a[var2].d = 15.0F;
         var3 = (double)var2 * 3.141592653589793D * -2.0D / (double)this.a.length + 1.5707963267948966D;
         this.a[var2].g = (float)var3;
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      xN[] var8 = this.a;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         xN var11 = var8[var10];
         var11.f = var3;
      }

   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.a.a(var7);
      xN[] var8 = this.a;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         xN var11 = var8[var10];
         var11.a(var7);
      }

   }
}
