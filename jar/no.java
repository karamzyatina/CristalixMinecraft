public final class No extends MT {
   protected No(MU var1, SB... var2) {
      super(var1, NA.WEAPON, var2);
      this.b("knockback");
   }

   public int a(int var1) {
      return 5 + 20 * (var1 - 1);
   }

   public int b(int var1) {
      return super.a(var1) + 50;
   }

   public int b() {
      return 2;
   }
}
