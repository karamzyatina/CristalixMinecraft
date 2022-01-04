import dev.xdark.clientapi.util.EnumFacing.AxisDirection;

public enum abS implements AxisDirection {
   POSITIVE(1, "Towards positive"),
   NEGATIVE(-1, "Towards negative");

   private final int offset;
   private final String description;

   private abS(int var3, String var4) {
      this.offset = var3;
      this.description = var4;
   }

   public int getOffset() {
      return this.offset;
   }

   public String toString() {
      return this.description;
   }
}
