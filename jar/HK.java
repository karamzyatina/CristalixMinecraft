public class Hk implements Hn {
   private final FP a;

   public Hk(FP var1) {
      this.a = var1;
   }

   public void a(PX var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1.i() != 0) {
         Bd var9 = this.a.a().a.a();
         By.z();
         By.C();
         By.b(5.0F + 180.0F * ((xy)this.a.a()).c.f / 3.1415927F, 1.0F, 0.0F, 0.0F);
         By.b(90.0F, 1.0F, 0.0F, 0.0F);
         By.c(-0.9375F, -0.625F, -0.9375F);
         By.b(0.5F, -0.5F, 0.5F);
         int var10 = var1.getBrightnessForRender();
         int var11 = var10 % 65536;
         int var12 = var10 / 65536;
         Ci.a(Ci.o, (float)var11, (float)var12);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         this.a.a((Lg)HO.a);
         var9.a(RQ.b.a(), 1.0F);
         By.D();
         By.A();
      }

   }

   public boolean a() {
      return false;
   }
}
