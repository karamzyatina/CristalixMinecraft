import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

public abstract class kw extends RuntimeException {
   private static final long a = -1L;
   private final List<String> a = new ArrayList();

   protected kw(List<String> var1) {
      this.a.addAll(var1);
   }

   protected kw(Collection<? extends kD<?>> var1) {
      this.a.addAll(this.a(var1));
   }

   protected kw(Collection<? extends kD<?>> var1, Throwable var2) {
      super(var2);
      this.a.addAll(this.a(var1));
   }

   private List<String> a(Collection<? extends kD<?>> var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         kD var4 = (kD)var3.next();
         var2.add(this.a(var4));
      }

      return var2;
   }

   private String a(kD<?> var1) {
      return la.a((Iterable)(new ArrayList(var1.a())), "/");
   }

   public List<String> a() {
      return Collections.unmodifiableList(this.a);
   }

   protected final String a() {
      return this.a((String)this.a.get(0));
   }

   protected final String a(String var1) {
      return var1;
   }

   protected final String b() {
      StringBuilder var1 = new StringBuilder("[");
      LinkedHashSet var2 = new LinkedHashSet(this.a);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         var1.append(this.a((String)var3.next()));
         if (var3.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append(']');
      return var1.toString();
   }

   static kw a(String var0) {
      return new kL(var0);
   }

   public final String getMessage() {
      return this.a(Locale.getDefault());
   }

   final String a(Locale var1) {
      return this.b(var1);
   }

   private String b(Locale var1) {
      return kS.a(var1, "joptsimple.ExceptionMessages", this.getClass(), "message", this.a());
   }

   abstract Object[] a();
}
