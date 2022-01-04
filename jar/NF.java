public final class Nf extends MT {
   protected Nf(MU var1, NA var2, SB... var3) {
      super(var1, var2, var3);
      this.b("fishingSpeed");
   }

   public int a(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 3;
   }
}
