import java.util.Random;

public class afs {
   private final aft[] a;
   private final int a;

   public afs(Random var1, int var2) {
      this.a = var2;
      aft[] var3 = new aft[var2];
      this.a = var3;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = new aft(var1);
      }

   }

   public double a(double var1, double var3) {
      double var5 = 0.0D;
      double var7 = 1.0D;
      int var9 = this.a;
      aft[] var10 = this.a;

      for(int var11 = 0; var11 < var9; ++var11) {
         var5 += var10[var11].a(var1 * var7, var3 * var7) / var7;
         var7 /= 2.0D;
      }

      return var5;
   }
}
