public final class Ny extends MT {
   public Ny(MU var1, SB... var2) {
      super(var1, NA.ARMOR_FEET, var2);
      this.b("waterWalker");
   }

   public int a(int var1) {
      return var1 * 10;
   }

   public int b(int var1) {
      return this.a(var1) + 15;
   }

   public int b() {
      return 3;
   }

   public boolean b(MT var1) {
      return super.b(var1) && var1 != RS.j;
   }
}
