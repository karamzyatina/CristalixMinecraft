public enum qg implements acf {
   DEFAULT(0, "default", "default"),
   CHISELED(1, "chiseled", "chiseled"),
   LINES_Y(2, "lines_y", "lines"),
   LINES_X(3, "lines_x", "lines"),
   LINES_Z(4, "lines_z", "lines");

   public static final qg[] VALUES = values();
   private static final qg[] META_LOOKUP = new qg[VALUES.length];
   private final int meta;
   private final String serializedName;
   private final String translationKey;

   private qg(int var3, String var4, String var5) {
      this.meta = var3;
      this.serializedName = var4;
      this.translationKey = var5;
   }

   public int a() {
      return this.meta;
   }

   public String toString() {
      return this.translationKey;
   }

   public static qg a(int var0) {
      if (var0 < 0 || var0 >= META_LOOKUP.length) {
         var0 = 0;
      }

      return META_LOOKUP[var0];
   }

   public String getName() {
      return this.serializedName;
   }

   static {
      qg[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         qg var3 = var0[var2];
         META_LOOKUP[var3.a()] = var3;
      }

   }
}
