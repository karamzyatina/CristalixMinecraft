import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class adq extends ads implements acd {
   protected final acl<V> a;
   protected final Map<V, K> a;

   public adq(int var1) {
      this.a = new acl(var1);
      this.a = ((BiMap)this.b).inverse();
   }

   public adq() {
      this.a = new acl(256);
      this.a = ((BiMap)this.b).inverse();
   }

   public void a(int var1, K var2, V var3) {
      this.a.a(var3, var1);
      this.a(var2, var3);
   }

   public void a(int var1) {
      Object var2 = this.a.b(var1);
      if (var2 != null) {
         this.a.remove(var2);
      }

   }

   public void a(K var1) {
      Object var2 = this.b.remove(var1);
      if (var2 != null) {
         this.a = null;
         this.a.remove(var2);
      }

   }

   protected Map<K, V> a() {
      return HashBiMap.create();
   }

   public V a(K var1) {
      return super.a(var1);
   }

   public K b(V var1) {
      return this.a.get(var1);
   }

   public boolean a(K var1) {
      return super.a(var1);
   }

   public int a(V var1) {
      return this.a.a(var1);
   }

   public V a(int var1) {
      return this.a.a(var1);
   }

   public Iterator<V> iterator() {
      return this.a.iterator();
   }

   public Collection<V> a() {
      return this.a.a();
   }
}
