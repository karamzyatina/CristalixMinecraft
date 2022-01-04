public enum MU {
   COMMON(10),
   UNCOMMON(5),
   RARE(2),
   VERY_RARE(1);

   private final int weight;

   private MU(int var3) {
      this.weight = var3;
   }

   public int a() {
      return this.weight;
   }
}
