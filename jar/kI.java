import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Iterator;

final class Ki extends AbstractIterator {
   private final Iterator<T> a;
   private final Iterator<T> b;
   private final Object2IntMap<T> a;
   private T a;
   private T b;

   public Ki(Iterator<T> var1, Iterator<T> var2, Object2IntMap<T> var3) {
      this.a = var1;
      this.b = var2;
      this.a = var3;
      this.a = var1.hasNext() ? var1.next() : null;
      this.b = var2.hasNext() ? var2.next() : null;
   }

   protected T computeNext() {
      Object var1 = this.a;
      Object var2 = this.b;
      if (var1 == null && var2 == null) {
         return this.endOfData();
      } else {
         int var3;
         if (var1 == var2) {
            var3 = 0;
         } else if (var1 == null) {
            var3 = 1;
         } else if (var2 == null) {
            var3 = -1;
         } else {
            Object2IntMap var4 = this.a;
            var3 = Integer.compare(var4.getInt(var1), var4.getInt(var2));
         }

         Object var6 = var3 <= 0 ? var1 : var2;
         Iterator var5;
         if (var3 <= 0) {
            var5 = this.a;
            this.a = var5.hasNext() ? var5.next() : null;
         }

         if (var3 >= 0) {
            var5 = this.b;
            this.b = var5.hasNext() ? var5.next() : null;
         }

         return var6;
      }
   }
}
