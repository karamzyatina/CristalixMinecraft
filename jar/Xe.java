public final class xe extends wY {
   public final xN[] a = new xN[12];
   public final xN a;

   public xe(sE var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = new xN(var1, this, 0, 16);
         this.a[var2].a(0.0F, 0.0F, 0.0F, 2, 8, 2);
      }

      this.a = new xN(var1, this, 0, 0);
      this.a.a(-4.0F, -4.0F, -4.0F, 8, 8, 8);
   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.a.a(var7);
      xN[] var8 = this.a;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         xN var11 = var8[var10];
         var11.a(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      float var8 = var3 * 3.1415927F * -0.1F;
      xN[] var9 = this.a;

      int var10;
      xN var11;
      for(var10 = 0; var10 < 4; ++var10) {
         var11 = var9[var10];
         var11.d = -2.0F + adh.b(((float)(var10 * 2) + var3) * 0.25F);
         var11.c = adh.b(var8) * 9.0F;
         var11.e = adh.a(var8) * 9.0F;
         ++var8;
      }

      var8 = 0.7853982F + var3 * 3.1415927F * 0.03F;

      for(var10 = 4; var10 < 8; ++var10) {
         var11 = var9[var10];
         var11.d = 2.0F + adh.b(((float)(var10 * 2) + var3) * 0.25F);
         var11.c = adh.b(var8) * 7.0F;
         var11.e = adh.a(var8) * 7.0F;
         ++var8;
      }

      var8 = 0.47123894F + var3 * 3.1415927F * -0.05F;

      for(var10 = 8; var10 < 12; ++var10) {
         var11 = var9[var10];
         var11.d = 11.0F + adh.b(((float)var10 * 1.5F + var3) * 0.5F);
         var11.c = adh.b(var8) * 5.0F;
         var11.e = adh.a(var8) * 5.0F;
         ++var8;
      }

      xN var12 = this.a;
      var12.g = var4 * 0.017453292F;
      var12.f = var5 * 0.017453292F;
   }
}
