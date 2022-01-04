public enum adY {
   PEACEFUL(0, "options.difficulty.peaceful"),
   EASY(1, "options.difficulty.easy"),
   NORMAL(2, "options.difficulty.normal"),
   HARD(3, "options.difficulty.hard");

   public static final adY[] VALUES = values();
   private static final adY[] ID_MAPPING = new adY[VALUES.length];
   private final int id;
   private final String translationKey;

   private adY(int var3, String var4) {
      this.id = var3;
      this.translationKey = var4;
   }

   public int a() {
      return this.id;
   }

   public static adY a(int var0) {
      return ID_MAPPING[var0 % ID_MAPPING.length];
   }

   public String a() {
      return this.translationKey;
   }

   static {
      adY[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         adY var3 = var0[var2];
         ID_MAPPING[var3.id] = var3;
      }

   }
}
