public class Hs implements Hn {
   private static final acC a = new acC("textures/entity/spider_eyes.png");
   private final GA<T> a;

   public Hs(GA<T> var1) {
      this.a = var1;
   }

   public void a(T var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.a.a((acC)a);
      By.l();
      By.c();
      By.a(BU.ONE, BL.ONE);
      By.a(!var1.isInvisible());
      char var9 = '\uf0f0';
      int var10 = var9 % 65536;
      int var11 = var9 / 65536;
      Ci.a(Ci.o, (float)var10, (float)var11);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      sE var12 = this.a.a().a;
      Ck var13 = var12.a;
      var12.a.a(true);
      if (afT.ad()) {
         akC.m(var12);
      }

      var13.c = true;
      this.a.a().a(var1, var2, var3, var5, var6, var7, var8);
      var13.c = false;
      if (afT.ad()) {
         akC.n(var12);
      }

      var12.a.a(false);
      int var14 = var1.getBrightnessForRender();
      var10 = var14 % 65536;
      var11 = var14 / 65536;
      Ci.a(Ci.o, (float)var10, (float)var11);
      this.a.a((Of)var1);
      By.k();
      By.d();
   }

   public boolean a() {
      return false;
   }
}
