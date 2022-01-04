import dev.xdark.clientapi.block.properties.IntegerProperty;
import dev.xdark.feder.collection.IntRangeSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Collection;
import java.util.Optional;

public final class st extends ss implements IntegerProperty {
   private final IntSet a;

   protected st(String var1, int var2, int var3) {
      super(var1, Integer.class);
      this.a = new IntRangeSet(var2, var3);
   }

   protected st(String var1, IntSet var2) {
      super(var1, Integer.class);
      this.a = var2;
   }

   public Collection<Integer> getAllowedValues() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof st && super.equals(var1)) {
         st var2 = (st)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   protected int a() {
      return 31 * super.a() + this.a.hashCode();
   }

   public static st a(String var0, IntSet var1) {
      return new st(var0, var1);
   }

   public static st a(String var0, int var1, int var2) {
      return new st(var0, var1, var2);
   }

   public Optional<Integer> parseValue(String var1) {
      return Optional.ofNullable(this.a(var1));
   }

   public Integer a(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         return this.a.contains(var2) ? acm.a(var2) : null;
      } catch (NumberFormatException var3) {
         return null;
      }
   }

   public String a(Integer var1) {
      return var1.toString();
   }

   // $FF: synthetic method
   public String getName(Comparable var1) {
      return this.a((Integer)var1);
   }
}
