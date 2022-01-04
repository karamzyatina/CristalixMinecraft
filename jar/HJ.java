public class Hj implements Hn {
   private final GK a;

   public Hj(GK var1) {
      this.a = var1;
   }

   public void a(Qs var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      Vh var9 = var1.a();
      if (!var9.isEmpty()) {
         By.d(1.0F, 1.0F, 1.0F);
         By.C();
         if (this.a.a().b) {
            By.c(0.0F, 0.625F, 0.0F);
            By.b(-20.0F, -1.0F, 0.0F, 0.0F);
            float var10 = 0.5F;
            By.b(0.5F, 0.5F, 0.5F);
         }

         this.a.a().f.c(0.0625F);
         By.c(-0.0625F, 0.53125F, 0.21875F);
         SZ var13 = var9.a();
         sE var11 = this.a.a().a;
         if (mY.a(var13).a().a() == abO.ENTITYBLOCK_ANIMATED) {
            By.c(0.0F, 0.0625F, -0.25F);
            By.b(30.0F, 1.0F, 0.0F, 0.0F);
            By.b(-5.0F, 0.0F, 1.0F, 0.0F);
            float var12 = 0.375F;
            By.b(0.375F, -0.375F, 0.375F);
         } else if (var13 == RT.a) {
            By.c(0.0F, 0.125F, -0.125F);
            By.b(-45.0F, 0.0F, 1.0F, 0.0F);
            By.b(0.625F, -0.625F, 0.625F);
            By.b(-100.0F, 1.0F, 0.0F, 0.0F);
            By.b(-20.0F, 0.0F, 1.0F, 0.0F);
         } else if (var13.isFull3D()) {
            if (var13.shouldRotateAroundWhenRendering()) {
               By.b(180.0F, 0.0F, 0.0F, 1.0F);
               By.c(0.0F, -0.0625F, 0.0F);
            }

            this.a.a();
            By.c(0.0625F, -0.125F, 0.0F);
            By.b(0.625F, -0.625F, 0.625F);
            By.b(0.0F, 1.0F, 0.0F, 0.0F);
            By.b(0.0F, 0.0F, 1.0F, 0.0F);
         } else {
            By.c(0.1875F, 0.1875F, 0.0F);
            By.b(0.875F, 0.875F, 0.875F);
            By.b(-20.0F, 0.0F, 0.0F, 1.0F);
            By.b(-60.0F, 1.0F, 0.0F, 0.0F);
            By.b(-30.0F, 0.0F, 0.0F, 1.0F);
         }

         By.b(-15.0F, 1.0F, 0.0F, 0.0F);
         By.b(40.0F, 0.0F, 0.0F, 1.0F);
         var11.a().a(var1, var9, CZ.THIRD_PERSON_RIGHT_HAND);
         By.D();
      }

   }

   public boolean a() {
      return false;
   }
}
