import it.unimi.dsi.fastutil.ints.Int2ReferenceMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.List;

public final class ajw {
   private final Int2ReferenceMap<aju> a = new Int2ReferenceOpenHashMap();
   private final List<aju> a = new ReferenceArrayList();
   private boolean a;

   public void a(int var1, aju var2) {
      this.a.put(var1, var2);
      this.b();
   }

   public aju a(int var1) {
      return (aju)this.a.get(var1);
   }

   public int a() {
      return this.a.size();
   }

   public aju b(int var1) {
      aju var2 = (aju)this.a.remove(var1);
      if (var2 != null) {
         this.b();
      }

      return var2;
   }

   public void a() {
      this.a.clear();
      this.a.clear();
      this.b();
   }

   private void b() {
      this.a = true;
   }

   public List<aju> a() {
      if (this.a) {
         this.a.clear();
         this.a.addAll(this.a.values());
         this.a = false;
      }

      return this.a;
   }
}
