import java.util.Random;

public class GU implements Hn {
   private final FV<?> a;

   public GU(FV<?> var1) {
      this.a = var1;
   }

   public void a(Oh var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = var1.getArrowCountInEntity();
      if (var9 > 0) {
         RM var10 = new RM(var1.a, var1.d, var1.e, var1.f);
         Random var11 = new Random((long)var1.getEntityId());
         Co.a();

         for(int var12 = 0; var12 < var9; ++var12) {
            By.C();
            xN var13 = this.a.a().a(var11);
            xh var14 = (xh)var13.a.get(var11.nextInt(var13.a.size()));
            var13.c(0.0625F);
            float var15 = var11.nextFloat();
            float var16 = var11.nextFloat();
            float var17 = var11.nextFloat();
            float var18 = (var14.a + (var14.d - var14.a) * var15) / 16.0F;
            float var19 = (var14.b + (var14.e - var14.b) * var16) / 16.0F;
            float var20 = (var14.c + (var14.f - var14.c) * var17) / 16.0F;
            By.c(var18, var19, var20);
            var15 = var15 * 2.0F - 1.0F;
            var16 = var16 * 2.0F - 1.0F;
            var17 = var17 * 2.0F - 1.0F;
            var15 *= -1.0F;
            var16 *= -1.0F;
            var17 *= -1.0F;
            float var21 = adh.c(var15 * var15 + var17 * var17);
            var10.j = (float)(Math.atan2((double)var15, (double)var17) * 57.29577951308232D);
            var10.k = (float)(Math.atan2((double)var16, (double)var21) * 57.29577951308232D);
            var10.l = var10.j;
            var10.m = var10.k;
            this.a.a().a(var10, 0.0D, 0.0D, 0.0D, 0.0F, var4, false);
            By.D();
         }

         Co.b();
      }

   }

   public boolean a() {
      return false;
   }
}
