import dev.xdark.feder.collection.CompactIterators;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class abx implements Iterable {
   // $FF: synthetic field
   final Class a;
   // $FF: synthetic field
   final abw a;

   abx(abw var1, Class var2) {
      this.a = var1;
      this.a = var2;
   }

   public Iterator<S> iterator() {
      List var1 = (List)abw.a(this.a).get(this.a.a(this.a));
      if (var1 == null) {
         return Collections.emptyIterator();
      } else {
         Iterator var2 = var1.iterator();
         return CompactIterators.filterInstanceof(var2, this.a);
      }
   }
}
