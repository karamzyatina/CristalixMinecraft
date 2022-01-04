public enum rO implements acf {
   TOP("top"),
   BOTTOM("bottom");

   public static final rO[] VALUES = values();
   private final String name;

   private rO(String var3) {
      this.name = var3;
   }

   public String toString() {
      return this.name;
   }

   public String getName() {
      return this.name;
   }
}
