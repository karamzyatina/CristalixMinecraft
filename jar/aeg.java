public class aeG extends aeu {
   private final aeH a;

   public aeG(aeH var1, aev var2) {
      super(var2);
      this.a = var1;
   }

   public int getGrassColorAtPos(int var1, int var2, int var3) {
      int var4 = super.getGrassColorAtPos(var1, var2, var3);
      return this.a == aeH.ROOFED ? (var4 & 16711422) + 2634762 >> 1 : var4;
   }
}
