public final class RH extends NN {
   public RH(aej var1) {
      super(var1);
      this.setSize(0.3125F, 0.3125F);
      this.f.a(true);
   }

   public acI a() {
      return acI.HOSTILE;
   }

   public RH(aej var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1);
      this.b(var2, var4, var6, this.j, this.k);
      this.a.a(var8);
      this.b.a(var10);
      this.c.a(var12);
   }

   protected void b(VR var1) {
   }

   protected void l() {
   }

   public void a() {
      super.a();
      this.a(this.d + this.a.a(), this.e + this.b.a(), this.f + this.c.a());
      RO.a(this, 0.5F);
      this.a.a(abW.END_ROD, this.d - this.a.a(), this.e - this.b.a() + 0.15D, this.f - this.c.a(), 0.0D, 0.0D, 0.0D);
   }

   public boolean isBurning() {
      return false;
   }

   public boolean a(double var1) {
      return var1 < 16384.0D;
   }

   public float getBrightness() {
      return 1.0F;
   }

   public int getBrightnessForRender() {
      return 15728880;
   }

   public boolean g() {
      return true;
   }

   public boolean a(abD var1, float var2) {
      return true;
   }
}
