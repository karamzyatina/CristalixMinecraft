public enum mW {
   TASK("task", 0, adH.GREEN),
   CHALLENGE("challenge", 26, adH.DARK_PURPLE),
   GOAL("goal", 52, adH.GREEN);

   public static final mW[] VALUES = values();
   private final String name;
   private final int icon;
   private final adH format;

   private mW(String var3, int var4, adH var5) {
      this.name = var3;
      this.icon = var4;
      this.format = var5;
   }

   public String a() {
      return this.name;
   }

   public int a() {
      return this.icon;
   }

   public static mW a(String var0) {
      mW[] var1 = VALUES;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         mW var4 = var1[var3];
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Unknown frame type '" + var0 + '\'');
   }

   public adH a() {
      return this.format;
   }
}
