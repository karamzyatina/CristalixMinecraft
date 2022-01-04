public final class zG extends yQ {
   private static final Lg a = new Lg("textures/particle/footprint.png");
   private static final acC a;
   private int a;
   private final int f;
   private final HM a;
   private final Cw a;

   protected zG(HM var1, Cw var2, aej var3, double var4, double var6, double var8) {
      super(var3, var4, var6, var8, 0.0D, 0.0D, 0.0D);
      this.a = var1;
      this.a = var2;
      this.g = 0.0D;
      this.h = 0.0D;
      this.i = 0.0D;
      this.f = 200;
   }

   public void a(Bh var1, NN var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.a + var3) / (float)this.f;
      var9 *= var9;
      float var10 = 2.0F - var9 * 2.0F;
      if (var10 > 1.0F) {
         var10 = 1.0F;
      }

      var10 *= 0.2F;
      By.f();
      float var11 = (float)(this.d - j);
      float var12 = (float)(this.e - k);
      float var13 = (float)(this.f - l);
      float var14 = this.a.a(this.d, this.e, this.f);
      this.a.a(a);
      By.l();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA);
      var1.a(7, In.i);
      var1.a((double)(var11 - 0.125F), (double)var12, (double)(var13 + 0.125F)).a(0.0D, 1.0D).a(var14, var14, var14, var10).endVertex();
      var1.a((double)(var11 + 0.125F), (double)var12, (double)(var13 + 0.125F)).a(1.0D, 1.0D).a(var14, var14, var14, var10).endVertex();
      var1.a((double)(var11 + 0.125F), (double)var12, (double)(var13 - 0.125F)).a(1.0D, 0.0D).a(var14, var14, var14, var10).endVertex();
      var1.a((double)(var11 - 0.125F), (double)var12, (double)(var13 - 0.125F)).a(0.0D, 0.0D).a(var14, var14, var14, var10).endVertex();
      this.a.draw();
      By.k();
      By.e();
   }

   public void a() {
      ++this.a;
      if (this.a == this.f) {
         this.setExpired();
      }

   }

   public int a() {
      return 3;
   }

   static {
      a = a;
   }
}
