public final class aeW extends aeu {
   protected aeW(aev var1) {
      super(var1);
   }

   public int getGrassColorAtPos(int var1, int var2, int var3) {
      double var4 = b.a((double)var1 * 0.0225D, (double)var3 * 0.0225D);
      return var4 < -0.1D ? 5011004 : 6975545;
   }

   public int getFoliageColorAtPos(int var1, int var2, int var3) {
      return 6975545;
   }
}
