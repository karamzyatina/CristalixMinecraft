public class acZ extends acV {
   public acZ() {
      this(0, 0, 0);
   }

   public acZ(acV var1) {
      this(var1.a, var1.b, var1.c);
   }

   public acZ(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public final acZ a(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      return this;
   }

   public final acZ a(NN var1) {
      return this.a(var1.d, var1.e, var1.f);
   }

   public final acZ a(double var1, double var3, double var5) {
      return this.a(adh.b(var1), adh.b(var3), adh.b(var5));
   }

   public final acZ a(adn var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   public final acZ a(abP var1) {
      return this.a(var1, 1);
   }

   public final acZ a(abP var1, int var2) {
      return this.a(this.a + var1.getXOffset() * var2, this.b + var1.getYOffset() * var2, this.c + var1.getZOffset() * var2);
   }

   public final void a(int var1) {
      this.b = var1;
   }

   public final acV g() {
      return new acV(this);
   }

   // $FF: synthetic method
   public adn a(adn var1) {
      return super.c(var1);
   }
}
