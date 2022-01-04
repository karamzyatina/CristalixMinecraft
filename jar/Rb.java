public enum rB implements acf {
   STONE(0, sh.l, "stone"),
   SAND(1, sh.c, "sandstone", "sand"),
   WOOD(2, sh.n, "wood_old", "wood"),
   COBBLESTONE(3, sh.l, "cobblestone", "cobble"),
   BRICK(4, sh.C, "brick"),
   SMOOTHBRICK(5, sh.l, "stone_brick", "smoothStoneBrick"),
   NETHERBRICK(6, sh.J, "nether_brick", "netherBrick"),
   QUARTZ(7, sh.o, "quartz");

   public static final rB[] VALUES = values();
   private static final rB[] META_LOOKUP = new rB[VALUES.length];
   private final int meta;
   private final sh mapColor;
   private final String name;
   private final String translationKey;

   private rB(int var3, sh var4, String var5) {
      this(var3, var4, var5, var5);
   }

   private rB(int var3, sh var4, String var5, String var6) {
      this.meta = var3;
      this.mapColor = var4;
      this.name = var5;
      this.translationKey = var6;
   }

   public int a() {
      return this.meta;
   }

   public sh a() {
      return this.mapColor;
   }

   public String toString() {
      return this.name;
   }

   public static rB a(int var0) {
      if (var0 < 0 || var0 >= META_LOOKUP.length) {
         var0 = 0;
      }

      return META_LOOKUP[var0];
   }

   public String getName() {
      return this.name;
   }

   public String a() {
      return this.translationKey;
   }

   static {
      rB[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         rB var3 = var0[var2];
         META_LOOKUP[var3.a()] = var3;
      }

   }
}
