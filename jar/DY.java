import it.unimi.dsi.fastutil.objects.Reference2ObjectLinkedOpenHashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Dy {
   private final Map<Predicate<sD>, CV> a = new Reference2ObjectLinkedOpenHashMap();

   public void a(Predicate<sD> var1, CV var2) {
      this.a.put(var1, var2);
   }

   public CV a() {
      return new Dx(this.a);
   }
}
