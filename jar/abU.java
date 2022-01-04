import dev.xdark.clientapi.util.BlockRenderLayer;

public enum abu implements BlockRenderLayer {
   SOLID("Solid"),
   CUTOUT_MIPPED("Mipped Cutout"),
   CUTOUT("Cutout"),
   TRANSLUCENT("Translucent");

   public static final abu[] VALUES = values();
   private final String layerName;

   private abu(String var3) {
      this.layerName = var3;
   }

   public String toString() {
      return this.layerName;
   }
}
