public class xu extends wY {
   public final xN a;
   public final xN b;
   public final xN[] a;
   public final xN[] b;
   private final sE a;

   public xu(sE var1) {
      this.a = var1;
      this.b = 64;
      this.c = 64;
      this.a = new xN[12];
      this.a = new xN(var1, this);
      this.a.a(0, 0).a(-6.0F, 10.0F, -8.0F, 12, 12, 16);
      this.a.a(0, 28).a(-8.0F, 10.0F, -6.0F, 2, 12, 12);
      this.a.a(0, 28).a(6.0F, 10.0F, -6.0F, 2, 12, 12, true);
      this.a.a(16, 40).a(-6.0F, 8.0F, -6.0F, 12, 2, 12);
      this.a.a(16, 40).a(-6.0F, 22.0F, -6.0F, 12, 2, 12);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = new xN(var1, this, 0, 0);
         this.a[var2].a(-1.0F, -4.5F, -1.0F, 2, 9, 2);
         this.a.a(this.a[var2]);
      }

      this.b = new xN(var1, this, 8, 0);
      this.b.a(-1.0F, 15.0F, 0.0F, 2, 2, 1);
      this.a.a(this.b);
      this.b = new xN[3];
      this.b[0] = new xN(var1, this, 40, 0);
      this.b[0].a(-2.0F, 14.0F, 7.0F, 4, 4, 8);
      this.b[1] = new xN(var1, this, 0, 54);
      this.b[1].a(0.0F, 14.0F, 0.0F, 3, 3, 7);
      this.b[2] = new xN(var1, this);
      this.b[2].a(41, 32).a(0.0F, 14.0F, 0.0F, 2, 2, 6);
      this.b[2].a(25, 19).a(1.0F, 10.5F, 3.0F, 1, 9, 9);
      this.a.a(this.b[0]);
      this.b[0].a(this.b[1]);
      this.b[1].a(this.b[2]);
   }

   public void a(NN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.a.a(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      PT var8 = (PT)var7;
      float var9 = var3 - (float)var8.b;
      this.a.g = var4 * 0.017453292F;
      this.a.f = var5 * 0.017453292F;
      float[] var10 = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
      float[] var11 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
      float[] var12 = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
      float[] var13 = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
      float[] var14 = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
      float[] var15 = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
      float var16 = (1.0F - var8.d(var9)) * 0.55F;

      for(int var17 = 0; var17 < 12; ++var17) {
         this.a[var17].f = 3.1415927F * var10[var17];
         this.a[var17].g = 3.1415927F * var11[var17];
         this.a[var17].h = 3.1415927F * var12[var17];
         this.a[var17].c = var13[var17] * (1.0F + adh.b(var3 * 1.5F + (float)var17) * 0.01F - var16);
         this.a[var17].d = 16.0F + var14[var17] * (1.0F + adh.b(var3 * 1.5F + (float)var17) * 0.01F - var16);
         this.a[var17].e = var15[var17] * (1.0F + adh.b(var3 * 1.5F + (float)var17) * 0.01F - var16);
      }

      this.b.e = -8.25F;
      Object var26 = this.a.a();
      if (var8.y()) {
         var26 = var8.d();
      }

      if (var26 != null) {
         adm var18 = ((NN)var26).b(0.0F);
         adm var19 = var7.b(0.0F);
         double var20 = var18.b - var19.b;
         if (var20 > 0.0D) {
            this.b.d = 0.0F;
         } else {
            this.b.d = 1.0F;
         }

         adm var22 = var7.a(0.0F);
         var22 = new adm(var22.a, 0.0D, var22.c);
         adm var23 = (new adm(var19.a - var18.a, 0.0D, var19.c - var18.c)).a().b(1.5707964F);
         double var24 = var22.a(var23);
         this.b.c = adh.c((float)Math.abs(var24)) * 2.0F * (float)Math.signum(var24);
      }

      this.b.b = true;
      float var27 = var8.c(var9);
      this.b[0].g = adh.a(var27) * 3.1415927F * 0.05F;
      this.b[1].g = adh.a(var27) * 3.1415927F * 0.1F;
      this.b[1].c = -1.5F;
      this.b[1].d = 0.5F;
      this.b[1].e = 14.0F;
      this.b[2].g = adh.a(var27) * 3.1415927F * 0.15F;
      this.b[2].c = 0.5F;
      this.b[2].d = 0.5F;
      this.b[2].e = 6.0F;
   }
}
