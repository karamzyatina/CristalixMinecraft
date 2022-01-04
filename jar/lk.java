import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;

public final class Lk {
   private final ObjectOpenCustomHashSet<T> a;
   private int a;

   public Lk(Strategy<T> var1) {
      this.a = new ObjectOpenCustomHashSet(var1);
   }

   public T a(T var1) {
      ++this.a;
      return this.a.addOrGet(var1);
   }

   public void a() {
      this.a.clear();
      this.a = 0;
   }

   public String toString() {
      return "DeduplicationCache{cache=" + this.a + ", size=" + this.a + '}';
   }
}
