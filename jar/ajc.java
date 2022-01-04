public final class ajC {
   private final xN a;
   private final float a;
   private final float b;
   private final float c;
   private final int a;
   private final int b;
   private final int c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;

   public ajC(xN var1, int var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9) {
      this.a = var1;
      this.a = var4;
      this.b = var5;
      this.c = var6;
      this.a = var7;
      this.b = var8;
      this.c = var9;
      this.d = (float)var2 / var1.a;
      this.e = (float)var3 / var1.b;
      this.f = (float)(var2 + var7) / var1.a;
      this.g = (float)(var3 + var8) / var1.b;
   }

   public void a(Cw var1, float var2) {
      By.c(this.a * var2, this.b * var2, this.c * var2);
      float var3 = this.d;
      float var4 = this.f;
      float var5 = this.e;
      float var6 = this.g;
      if (this.a.a) {
         var3 = this.f;
         var4 = this.d;
      }

      if (this.a.d) {
         var5 = this.g;
         var6 = this.e;
      }

      a(var1, var3, var5, var4, var6, this.a, this.b, var2 * (float)this.c, this.a.a, this.a.b);
      By.c(-this.a * var2, -this.b * var2, -this.c * var2);
   }

   public static void a(Cw var0, float var1, float var2, float var3, float var4, int var5, int var6, float var7, float var8, float var9) {
      if (var7 < 6.25E-4F) {
         var7 = 6.25E-4F;
      }

      float var10 = var3 - var1;
      float var11 = var4 - var2;
      double var12 = (double)(Math.abs(var10) * (var8 / 16.0F));
      double var14 = (double)(Math.abs(var11) * (var9 / 16.0F));
      Bh var16 = var0.a();
      By.a(0.0F, 0.0F, -1.0F);
      var16.a(7, In.g);
      var16.a(0.0D, var14, 0.0D).a((double)var1, (double)var4).endVertex();
      var16.a(var12, var14, 0.0D).a((double)var3, (double)var4).endVertex();
      var16.a(var12, 0.0D, 0.0D).a((double)var3, (double)var2).endVertex();
      var16.a(0.0D, 0.0D, 0.0D).a((double)var1, (double)var2).endVertex();
      var0.draw();
      By.a(0.0F, 0.0F, 1.0F);
      var16.a(7, In.g);
      var16.a(0.0D, 0.0D, (double)var7).a((double)var1, (double)var2).endVertex();
      var16.a(var12, 0.0D, (double)var7).a((double)var3, (double)var2).endVertex();
      var16.a(var12, var14, (double)var7).a((double)var3, (double)var4).endVertex();
      var16.a(0.0D, var14, (double)var7).a((double)var1, (double)var4).endVertex();
      var0.draw();
      float var17 = 0.5F * var10 / (float)var5;
      float var18 = 0.5F * var11 / (float)var6;
      By.a(-1.0F, 0.0F, 0.0F);
      var16.a(7, In.g);

      int var19;
      float var20;
      float var21;
      for(var19 = 0; var19 < var5; ++var19) {
         var20 = (float)var19 / (float)var5;
         var21 = var1 + var10 * var20 + var17;
         var16.a((double)var20 * var12, var14, (double)var7).a((double)var21, (double)var4).endVertex();
         var16.a((double)var20 * var12, var14, 0.0D).a((double)var21, (double)var4).endVertex();
         var16.a((double)var20 * var12, 0.0D, 0.0D).a((double)var21, (double)var2).endVertex();
         var16.a((double)var20 * var12, 0.0D, (double)var7).a((double)var21, (double)var2).endVertex();
      }

      var0.draw();
      By.a(1.0F, 0.0F, 0.0F);
      var16.a(7, In.g);

      float var22;
      for(var19 = 0; var19 < var5; ++var19) {
         var20 = (float)var19 / (float)var5;
         var21 = var1 + var10 * var20 + var17;
         var22 = var20 + 1.0F / (float)var5;
         var16.a((double)var22 * var12, 0.0D, (double)var7).a((double)var21, (double)var2).endVertex();
         var16.a((double)var22 * var12, 0.0D, 0.0D).a((double)var21, (double)var2).endVertex();
         var16.a((double)var22 * var12, var14, 0.0D).a((double)var21, (double)var4).endVertex();
         var16.a((double)var22 * var12, var14, (double)var7).a((double)var21, (double)var4).endVertex();
      }

      var0.draw();
      By.a(0.0F, 1.0F, 0.0F);
      var16.a(7, In.g);

      for(var19 = 0; var19 < var6; ++var19) {
         var20 = (float)var19 / (float)var6;
         var21 = var2 + var11 * var20 + var18;
         var22 = var20 + 1.0F / (float)var6;
         var16.a(0.0D, (double)var22 * var14, (double)var7).a((double)var1, (double)var21).endVertex();
         var16.a(var12, (double)var22 * var14, (double)var7).a((double)var3, (double)var21).endVertex();
         var16.a(var12, (double)var22 * var14, 0.0D).a((double)var3, (double)var21).endVertex();
         var16.a(0.0D, (double)var22 * var14, 0.0D).a((double)var1, (double)var21).endVertex();
      }

      var0.draw();
      By.a(0.0F, -1.0F, 0.0F);
      var16.a(7, In.g);

      for(var19 = 0; var19 < var6; ++var19) {
         var20 = (float)var19 / (float)var6;
         var21 = var2 + var11 * var20 + var18;
         var16.a(var12, (double)var20 * var14, (double)var7).a((double)var3, (double)var21).endVertex();
         var16.a(0.0D, (double)var20 * var14, (double)var7).a((double)var1, (double)var21).endVertex();
         var16.a(0.0D, (double)var20 * var14, 0.0D).a((double)var1, (double)var21).endVertex();
         var16.a(var12, (double)var20 * var14, 0.0D).a((double)var3, (double)var21).endVertex();
      }

      var0.draw();
   }
}
