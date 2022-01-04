public class Hv implements Hn {
   private static final acC a = new acC("textures/entity/wither/wither_armor.png");
   private final GL a;
   private final ye a;

   public Hv(GL var1) {
      this.a = var1;
      this.a = new ye(var1.a().a, 0.5F);
   }

   public void a(OH var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1.x()) {
         By.a(!var1.isInvisible());
         this.a.a((acC)a);
         By.l(5890);
         By.B();
         float var9 = (float)var1.b + var4;
         float var10 = adh.b(var9 * 0.02F) * 3.0F;
         float var11 = var9 * 0.01F;
         By.c(var10, var11, 0.0F);
         By.l(5888);
         By.l();
         By.c(0.5F, 0.5F, 0.5F, 1.0F);
         By.f();
         By.a(BU.ONE, BL.ONE);
         this.a.a(var1, var2, var3, var4);
         this.a.a(this.a.a());
         sE var12 = this.a.a().a;
         var12.a.a(true);
         this.a.a(var1, var2, var3, var5, var6, var7, var8);
         var12.a.a(false);
         By.l(5890);
         By.B();
         By.l(5888);
         By.e();
         By.k();
      }

   }

   public boolean a() {
      return false;
   }
}
