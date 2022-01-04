public enum JZ implements JY {
   NORMAL(false),
   ADVANCED(true);

   public static final JZ[] VALUES = values();
   final boolean isAdvanced;

   private JZ(boolean var3) {
      this.isAdvanced = var3;
   }

   public boolean a() {
      return this.isAdvanced;
   }
}
