public enum akr {
   NONE(""),
   SHADOW("shadow"),
   GBUFFERS("gbuffers"),
   DEFERRED("deferred"),
   COMPOSITE("composite");

   private final String name;

   private akr(String var3) {
      this.name = var3;
   }

   public String a() {
      return this.name;
   }
}
