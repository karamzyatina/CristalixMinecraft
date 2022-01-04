public final class xP extends xL {
   private float d;

   public xP(sE var1) {
      super(var1, 12, 0.0F);
      this.a = new xN(var1, this, 0, 0);
      this.a.a(-3.0F, -4.0F, -6.0F, 6, 6, 8, 0.0F);
      this.a.a(0.0F, 6.0F, -8.0F);
      this.b = new xN(var1, this, 28, 8);
      this.b.a(-4.0F, -10.0F, -7.0F, 8, 16, 6, 0.0F);
      this.b.a(0.0F, 5.0F, 2.0F);
   }

   public void a(Oh var1, float var2, float var3, float var4) {
      super.a(var1, var2, var3, var4);
      this.a.d = 6.0F + ((QU)var1).c(var4) * 9.0F;
      this.d = ((QU)var1).d(var4);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, NN var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.a.f = this.d;
   }
}
