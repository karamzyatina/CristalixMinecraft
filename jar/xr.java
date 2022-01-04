public class xR extends wY {
   public final xN a;
   public final xN b;
   public xN c;

   public xR(sE var1) {
      this.c = 64;
      this.b = 64;
      this.b = new xN(var1, this);
      this.a = new xN(var1, this);
      this.c = new xN(var1, this);
      this.b.a(0, 0).a(-8.0F, -16.0F, -8.0F, 16, 12, 16);
      this.b.a(0.0F, 24.0F, 0.0F);
      this.a.a(0, 28).a(-8.0F, -8.0F, -8.0F, 16, 8, 16);
      this.a.a(0.0F, 24.0F, 0.0F);
      this.c.a(0, 52).a(-3.0F, 0.0F, -3.0F, 6, 6, 6);
      this.c.a(0.0F, 12.0F, 0.0F);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      Qc var8 = (Qc)var7;
      float var9 = var3 - (float)var8.b;
      float var10 = (0.5F + var8.c(var9)) * 3.1415927F;
      float var11 = -1.0F + adh.a(var10);
      float var12 = 0.0F;
      if (var10 > 3.1415927F) {
         var12 = adh.a(var3 * 0.1F) * 0.7F;
      }

      this.b.a(0.0F, 16.0F + adh.a(var10) * 8.0F + var12, 0.0F);
      if (var8.c(var9) > 0.3F) {
         this.b.g = var11 * var11 * var11 * var11 * 3.1415927F * 0.125F;
      } else {
         this.b.g = 0.0F;
      }

      this.c.f = var5 * 0.017453292F;
      this.c.g = var4 * 0.017453292F;
   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a.a(var7);
      this.b.a(var7);
   }
}
