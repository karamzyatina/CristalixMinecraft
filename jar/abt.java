import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.util.EnumFacing.Plane;
import dev.xdark.feder.collection.CompactIterators;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public enum abT implements Plane, Iterable, Predicate {
   HORIZONTAL,
   VERTICAL;

   public abP[] a() {
      // $FF: Couldn't be decompiled
   }

   public abP a(Random var1) {
      abP[] var2 = this.a();
      return var2[var1.nextInt(var2.length)];
   }

   public boolean a(abP var1) {
      return var1 != null && var1.a().a() == this;
   }

   public Iterator<abP> iterator() {
      return CompactIterators.forArray(this.a());
   }

   // $FF: synthetic method
   public boolean test(Object var1) {
      return this.a((abP)var1);
   }

   public EnumFacing[] facings() {
      return (EnumFacing[])((Object[])this.a());
   }
}
