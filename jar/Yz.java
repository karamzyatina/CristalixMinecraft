import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public enum YZ {
   X(0),
   Y(1),
   Z(2),
   Y_ROT(3),
   X_ROT(4);

   public static final YZ[] VALUES = values();
   private final int bit;

   private YZ(int var3) {
      this.bit = var3;
   }

   private int a() {
      return 1 << this.bit;
   }

   private boolean a(int var1) {
      return (var1 & this.a()) == this.a();
   }

   public static Set<YZ> a(int var0) {
      EnumSet var1 = EnumSet.noneOf(YZ.class);
      YZ[] var2 = VALUES;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         YZ var5 = var2[var4];
         if (var5.a(var0)) {
            var1.add(var5);
         }
      }

      return var1;
   }

   public static int a(Set<YZ> var0) {
      int var1 = 0;

      YZ var3;
      for(Iterator var2 = var0.iterator(); var2.hasNext(); var1 |= var3.a()) {
         var3 = (YZ)var2.next();
      }

      return var1;
   }
}
