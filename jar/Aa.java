public final class AA extends yQ {
   private static final acC a = new acC("textures/entity/sweep.png");
   private static final Ip a;
   private int a;
   private final int f;
   private final HM a;
   private final Cw a;
   private final float m;

   protected AA(HM var1, Cw var2, aej var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      super(var3, var4, var6, var8, 0.0D, 0.0D, 0.0D);
      this.a = var1;
      this.a = var2;
      this.f = 4;
      float var16 = this.a.nextFloat() * 0.6F + 0.4F;
      this.g = var16;
      this.h = var16;
      this.i = var16;
      this.m = 1.0F - (float)var10 * 0.5F;
   }

   public void a(Bh var1, NN var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = (int)(((float)this.a + var3) * 3.0F / (float)this.f);
      if (var9 <= 7) {
         this.a.a(a);
         float var10 = (float)(var9 % 4) / 4.0F;
         float var11 = var10 + 0.24975F;
         float var12 = (float)(var9 / 2) / 2.0F;
         float var13 = var12 + 0.4995F;
         float var14 = 1.0F * this.m;
         float var15 = (float)(this.a + (this.d - this.a) * (double)var3 - j);
         float var16 = (float)(this.b + (this.e - this.b) * (double)var3 - k);
         float var17 = (float)(this.c + (this.f - this.c) * (double)var3 - l);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.f();
         Co.a();
         var1.a(7, a);
         var1.a((double)(var15 - var4 * var14 - var7 * var14), (double)(var16 - var5 * var14 * 0.5F), (double)(var17 - var6 * var14 - var8 * var14)).a((double)var11, (double)var13).a(this.g, this.h, this.i, 1.0F).a(0, 240).a(0.0F, 1.0F, 0.0F).endVertex();
         var1.a((double)(var15 - var4 * var14 + var7 * var14), (double)(var16 + var5 * var14 * 0.5F), (double)(var17 - var6 * var14 + var8 * var14)).a((double)var11, (double)var12).a(this.g, this.h, this.i, 1.0F).a(0, 240).a(0.0F, 1.0F, 0.0F).endVertex();
         var1.a((double)(var15 + var4 * var14 + var7 * var14), (double)(var16 + var5 * var14 * 0.5F), (double)(var17 + var6 * var14 + var8 * var14)).a((double)var10, (double)var12).a(this.g, this.h, this.i, 1.0F).a(0, 240).a(0.0F, 1.0F, 0.0F).endVertex();
         var1.a((double)(var15 + var4 * var14 - var7 * var14), (double)(var16 - var5 * var14 * 0.5F), (double)(var17 + var6 * var14 - var8 * var14)).a((double)var10, (double)var13).a(this.g, this.h, this.i, 1.0F).a(0, 240).a(0.0F, 1.0F, 0.0F).endVertex();
         this.a.draw();
         By.e();
      }

   }

   public int a(float var1) {
      return 61680;
   }

   public void a() {
      this.a = this.d;
      this.b = this.e;
      this.c = this.f;
      ++this.a;
      if (this.a == this.f) {
         this.setExpired();
      }

   }

   public int a() {
      return 3;
   }

   static {
      a = (new Ip()).a(In.a).a(In.c).a(In.b).a(In.d).a(In.e).a(In.f);
   }
}
