public final class Ph extends NN {
   public Ph(aej var1) {
      super(var1);
      this.setSize(0.25F, 0.25F);
   }

   protected void l() {
   }

   public boolean a(double var1) {
      double var3 = this.b().getAverageEdgeLength() * 4.0D;
      if (Double.isNaN(var3)) {
         var3 = 4.0D;
      }

      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   public Ph(aej var1, double var2, double var4, double var6) {
      super(var1);
      this.setSize(0.25F, 0.25F);
      this.a(var2, var4, var6);
   }

   public void c(double var1, double var3, double var5) {
      this.a.a(var1);
      this.b.a(var3);
      this.c.a(var5);
      if (this.m == 0.0F && this.l == 0.0F) {
         float var7 = adh.a(var1 * var1 + var5 * var5);
         this.j = (float)(adh.c(var1, var5) * 57.29577951308232D);
         this.k = (float)(adh.c(var3, (double)var7) * 57.29577951308232D);
         this.l = this.j;
         this.m = this.k;
      }

   }

   public void a() {
      this.g = this.d;
      this.h = this.e;
      this.i = this.f;
      super.a();
      this.d += this.a.a();
      this.e += this.b.a();
      this.f += this.c.a();
      float var1 = adh.a(this.a.a() * this.a.a() + this.c.a() * this.c.a());
      this.j = (float)(adh.c(this.a.a(), this.c.a()) * 57.29577951308232D);

      for(this.k = (float)(adh.c(this.b.a(), (double)var1) * 57.29577951308232D); this.k - this.m < -180.0F; this.m -= 360.0F) {
      }

      while(this.k - this.m >= 180.0F) {
         this.m += 360.0F;
      }

      while(this.j - this.l < -180.0F) {
         this.l -= 360.0F;
      }

      while(this.j - this.l >= 180.0F) {
         this.l += 360.0F;
      }

      this.k = this.m + (this.k - this.m) * 0.2F;
      this.j = this.l + (this.j - this.l) * 0.2F;
      if (this.isInWater()) {
         for(int var2 = 0; var2 < 4; ++var2) {
            this.a.a(abW.WATER_BUBBLE, this.d - this.a.a() * 0.25D, this.e - this.b.a() * 0.25D, this.f - this.c.a() * 0.25D, this.a.a(), this.b.a(), this.c.a());
         }
      } else {
         this.a.a(abW.PORTAL, this.d - this.a.a() * 0.25D + this.a.nextDouble() * 0.6D - 0.3D, this.e - this.b.a() * 0.25D - 0.5D, this.f - this.c.a() * 0.25D + this.a.nextDouble() * 0.6D - 0.3D, this.a.a(), this.b.a(), this.c.a());
      }

   }

   public void b(VR var1) {
   }

   public float getBrightness() {
      return 1.0F;
   }

   public int getBrightnessForRender() {
      return 15728880;
   }

   public boolean j() {
      return false;
   }
}
