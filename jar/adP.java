import java.util.HashMap;
import java.util.Map;

public class adp extends ads {
   private final V a;

   public adp(V var1) {
      this.a = var1;
   }

   public V a(K var1) {
      Object var2 = super.a(var1);
      return var2 == null ? this.a : var2;
   }

   protected Map<K, V> a() {
      return new HashMap(69, 1.0F);
   }
}
