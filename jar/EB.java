import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Collections;
import java.util.List;

public final class Eb {
   private so<?> a;
   private String a;
   private final ObjectList<so<?>> a = new ObjectArrayList(2);

   public Eb a() {
      this.a = null;
      this.a = null;
      this.a.clear();
      return this;
   }

   public Eb a(so<?> var1) {
      this.a = var1;
      return this;
   }

   public Eb a(String var1) {
      this.a = var1;
      return this;
   }

   public Eb b(so<?> var1) {
      this.a.add(var1);
      return this;
   }

   public Eb a(so<?> var1, so<?> var2) {
      ObjectList var3 = this.a;
      var3.add(var1);
      var3.add(var2);
      return this;
   }

   public Eb a(so<?>... var1) {
      Collections.addAll(this.a, var1);
      return this;
   }

   public DZ a() {
      return new DZ(this.a, this.a, a(this.a), (Ea)null);
   }

   private static List<so<?>> a(ObjectList<so<?>> var0) {
      return (List)(var0.isEmpty() ? Collections.emptyList() : new ObjectArrayList(var0));
   }
}
