public abstract class PZ extends NW implements Qx {
   public PZ(aej var1) {
      super(var1);
      this.m = 5;
   }

   public acI a() {
      return acI.HOSTILE;
   }

   public void b() {
      this.A();
      float var1 = this.getBrightness();
      if (var1 > 0.5F) {
         this.u += 2;
      }

      super.b();
   }

   public void a() {
      super.a();
   }

   protected acJ a() {
      return RW.cX;
   }

   protected acJ b() {
      return RW.cW;
   }

   public boolean a(abD var1, float var2) {
      return false;
   }

   protected acJ a(abD var1) {
      return RW.cU;
   }

   protected acJ d() {
      return RW.cT;
   }

   protected acJ a(int var1) {
      return var1 > 4 ? RW.cS : RW.cV;
   }

   protected void a_() {
      super.a_();
      this.a().b(Ot.f);
   }
}
