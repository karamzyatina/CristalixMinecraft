public enum pm implements acf {
   X("x"),
   Y("y"),
   Z("z"),
   NONE("none");

   public static final pm[] VALUES = values();
   private final String name;

   private pm(String var3) {
      this.name = var3;
   }

   public String toString() {
      return this.name;
   }

   public static pm a(abR var0) {
      // $FF: Couldn't be decompiled
   }

   public String getName() {
      return this.name;
   }
}
