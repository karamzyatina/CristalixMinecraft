import java.util.Map.Entry;
import java.util.function.Function;

final class sx implements Function {
   public String a(Entry<so<?>, Comparable<?>> var1) {
      if (var1 == null) {
         return "<NULL>";
      } else {
         so var2 = (so)var1.getKey();
         return var2.getName() + '=' + this.a(var2, (Comparable)var1.getValue());
      }
   }

   private <T extends Comparable<T>> String a(so<T> var1, Comparable<?> var2) {
      return var1.getName(var2);
   }

   // $FF: synthetic method
   public Object apply(Object var1) {
      return this.a((Entry)var1);
   }
}
