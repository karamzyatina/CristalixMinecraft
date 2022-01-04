import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.function.Predicate;

public final class DM implements DN {
   private static final Splitter a = Splitter.on('|').omitEmptyStrings();
   private final String a;
   private final String b;

   public DM(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public Predicate<sD> a(sy var1) {
      so var2 = var1.a(this.a);
      if (var2 == null) {
         throw new RuntimeException(this.toString() + ": Definition: " + var1 + " has no property: " + this.a);
      } else {
         String var3 = this.b;
         boolean var4 = !var3.isEmpty() && var3.charAt(0) == '!';
         if (var4) {
            var3 = var3.substring(1);
         }

         List var5 = a.splitToList(var3);
         if (var5.isEmpty()) {
            throw new RuntimeException(this + ": has an empty value: " + this.b);
         } else {
            Predicate var6;
            if (var5.size() == 1) {
               var6 = this.a(var2, var3);
            } else {
               var6 = MR.a(var5, (var2x) -> {
                  return this.a(var2, var2x);
               });
            }

            return var4 ? var6.negate() : var6;
         }
      }
   }

   private Predicate<sD> a(so<?> var1, String var2) {
      Comparable var3 = var1.a(var2);
      if (var3 == null) {
         throw new RuntimeException(this + ": has an unknown value: " + this.b);
      } else {
         return (var2x) -> {
            return var2x != null && var2x.a(var1).equals(var3);
         };
      }
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("key", this.a).add("value", this.b).toString();
   }
}
