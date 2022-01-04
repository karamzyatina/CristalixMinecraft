import dev.xdark.clientapi.util.EnumFacing.Axis;
import dev.xdark.clientapi.util.EnumFacing.Plane;
import it.unimi.dsi.fastutil.objects.Object2ReferenceArrayMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

public enum abR implements acf, Axis, Predicate {
   X("x", abT.HORIZONTAL),
   Y("y", abT.VERTICAL),
   Z("z", abT.HORIZONTAL);

   public static final abR[] VALUES = values();
   private static final Map<String, abR> NAME_LOOKUP = new Object2ReferenceArrayMap(VALUES.length);
   private final String name;
   private final abT plane;

   private abR(String var3, abT var4) {
      this.name = var3;
      this.plane = var4;
   }

   public static abR a(String var0) {
      return var0 == null ? null : (abR)NAME_LOOKUP.get(var0.toLowerCase(Locale.ROOT));
   }

   public String a() {
      return this.name;
   }

   public boolean isVertical() {
      return this.plane == abT.VERTICAL;
   }

   public boolean isHorizontal() {
      return this.plane == abT.HORIZONTAL;
   }

   public String toString() {
      return this.name;
   }

   public boolean a(abP var1) {
      return var1 != null && var1.a() == this;
   }

   public abT a() {
      return this.plane;
   }

   public String getName() {
      return this.name;
   }

   // $FF: synthetic method
   public boolean test(Object var1) {
      return this.a((abP)var1);
   }

   static {
      abR[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         abR var3 = var0[var2];
         NAME_LOOKUP.put(var3.a().toLowerCase(Locale.ROOT), var3);
      }

   }

   public Plane getPlane() {
      return (Plane)d.a(this.plane);
   }
}
