import java.util.Random;

public class Hc implements Hn {
   private final Cw a;

   public Hc(Cw var1) {
      this.a = var1;
   }

   public void a(OG var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1.j > 0) {
         Cw var9 = this.a;
         Bh var10 = var9.a();
         Co.a();
         float var11 = ((float)var1.j + var4) / 200.0F;
         float var12 = 0.0F;
         if (var11 > 0.8F) {
            var12 = (var11 - 0.8F) / 0.2F;
         }

         Random var13 = new Random(432L);
         By.w();
         By.j(7425);
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE);
         By.c();
         By.p();
         By.a(false);
         By.C();
         By.c(0.0F, -1.0F, -2.0F);

         for(int var14 = 0; (float)var14 < (var11 + var11 * var11) / 2.0F * 60.0F; ++var14) {
            By.b(var13.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            By.b(var13.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            By.b(var13.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
            By.b(var13.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
            By.b(var13.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
            By.b(var13.nextFloat() * 360.0F + var11 * 90.0F, 0.0F, 0.0F, 1.0F);
            float var15 = var13.nextFloat() * 20.0F + 5.0F + var12 * 10.0F;
            float var16 = var13.nextFloat() * 2.0F + 1.0F + var12 * 2.0F;
            var10.a(6, In.f);
            var10.a(0.0D, 0.0D, 0.0D).a(255, 255, 255, (int)(255.0F * (1.0F - var12))).endVertex();
            var10.a(-0.866D * (double)var16, (double)var15, (double)(-0.5F * var16)).a(255, 0, 255, 0).endVertex();
            var10.a(0.866D * (double)var16, (double)var15, (double)(-0.5F * var16)).a(255, 0, 255, 0).endVertex();
            var10.a(0.0D, (double)var15, (double)(1.0F * var16)).a(255, 0, 255, 0).endVertex();
            var10.a(-0.866D * (double)var16, (double)var15, (double)(-0.5F * var16)).a(255, 0, 255, 0).endVertex();
            var9.draw();
         }

         By.D();
         By.a(true);
         By.q();
         By.k();
         By.j(7424);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.v();
         By.d();
         Co.b();
      }

   }

   public boolean a() {
      return false;
   }
}
