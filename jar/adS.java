import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.Logger;

public class ads implements ado {
   private static final Logger a;
   protected final Map<K, V> b = this.a();
   private final Set<K> a;
   protected Object[] a;

   public ads() {
      this.a = Collections.unmodifiableSet(this.b.keySet());
   }

   protected Map<K, V> a() {
      return new Object2ObjectOpenHashMap();
   }

   public V a(K var1) {
      return this.b.get(var1);
   }

   public void a(K var1, V var2) {
      this.b.put(var1, var2);
      this.a = null;
   }

   public void a(K var1) {
      if (this.b.remove(var1) != null) {
         this.a = null;
      }

   }

   public Set<K> a() {
      return this.a;
   }

   public V a(Random var1) {
      if (this.a == null) {
         Collection var2 = this.b.values();
         if (var2.isEmpty()) {
            return null;
         }

         this.a = var2.toArray(new Object[0]);
      }

      return this.a[var1.nextInt(this.a.length)];
   }

   public boolean a(K var1) {
      return this.b.containsKey(var1);
   }

   public Iterator<V> iterator() {
      return this.b.values().iterator();
   }

   public int a() {
      return this.b.size();
   }

   static {
      a = sE.a;
   }
}
