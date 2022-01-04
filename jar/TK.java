public enum tk {
   MENU(RW.es, 20, 600),
   GAME(RW.er, 12000, 24000),
   CREATIVE(RW.en, 1200, 3600),
   CREDITS(RW.eo, 0, 0),
   NETHER(RW.et, 1200, 3600),
   END_BOSS(RW.ep, 0, 0),
   END(RW.eq, 6000, 24000);

   private final acJ musicLocation;
   private final int minDelay;
   private final int maxDelay;

   private tk(acJ var3, int var4, int var5) {
      this.musicLocation = var3;
      this.minDelay = var4;
      this.maxDelay = var5;
   }

   public acJ a() {
      return this.musicLocation;
   }

   public int a() {
      return this.minDelay;
   }

   public int b() {
      return this.maxDelay;
   }
}
