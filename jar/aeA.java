import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class aea {
   private static final Random a = new MM();
   private final boolean a;
   private final boolean b;
   private final Random b;
   private final aej a;
   private final double a;
   private final double b;
   private final double c;
   private final float a;
   private final List<acV> a;

   public aea(aej var1, NN var2, double var3, double var5, double var7, float var9, List<acV> var10) {
      this(var1, var2, var3, var5, var7, var9, false, true, var10);
   }

   public aea(aej var1, NN var2, double var3, double var5, double var7, float var9, boolean var10, boolean var11, List<acV> var12) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.a.addAll(var12);
   }

   public aea(aej var1, NN var2, double var3, double var5, double var7, float var9, boolean var10, boolean var11) {
      this.b = a;
      this.a = new ArrayList();
      this.a = var1;
      this.a = var9;
      this.a = var3;
      this.b = var5;
      this.c = var7;
      this.a = var10;
      this.b = var11;
   }

   public void a(boolean var1) {
      List var2;
      int var3;
      aej var4;
      if (this.b) {
         var2 = this.a;
         var3 = 0;
         var4 = this.a;
         Random var5 = var4.a;

         for(int var6 = var2.size(); var3 < var6; ++var3) {
            acV var7 = (acV)var2.get(var3);
            sD var8 = var4.a(var7);
            if (var1) {
               double var9 = (double)((float)var7.a + var5.nextFloat());
               double var11 = (double)((float)var7.b + var5.nextFloat());
               double var13 = (double)((float)var7.c + var5.nextFloat());
               double var15 = var9 - this.a;
               double var17 = var11 - this.b;
               double var19 = var13 - this.c;
               double var21 = (double)adh.a(var15 * var15 + var17 * var17 + var19 * var19);
               var15 /= var21;
               var17 /= var21;
               var19 /= var21;
               double var23 = 0.5D / (var21 / (double)this.a + 0.1D);
               var23 *= (double)(var5.nextFloat() * var5.nextFloat() + 0.3F);
               var15 *= var23;
               var17 *= var23;
               var19 *= var23;
               var4.a(abW.EXPLOSION_NORMAL, (var9 + this.a) / 2.0D, (var11 + this.b) / 2.0D, (var13 + this.c) / 2.0D, var15, var17, var19);
               var4.a(abW.SMOKE_NORMAL, var9, var11, var13, var15, var17, var19);
            }

            if (var8.a() != si.a) {
               var4.a((acV)var7, (sD)afh.a, 0);
            }
         }
      }

      if (this.a) {
         var2 = this.a;
         var3 = 0;
         var4 = this.a;

         for(int var25 = var2.size(); var3 < var25; ++var3) {
            acV var26 = (acV)var2.get(var3);
            if (var4.a(var26).a() == si.a && var4.a(var26.b()).isFullBlock() && this.b.nextInt(3) == 0) {
               var4.c(var26, RQ.a.a());
            }
         }
      }

   }
}
