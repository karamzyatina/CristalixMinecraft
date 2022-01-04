public final class aaR extends aaD {
   private int d;

   public VR a(VR var1) {
      super.a(var1);
      var1.a("OutputSignal", this.d);
      return var1;
   }

   public void a(VR var1) {
      super.a(var1);
      this.d = var1.getInteger("OutputSignal");
   }

   public int e() {
      return this.d;
   }

   public void b(int var1) {
      this.d = var1;
   }
}
