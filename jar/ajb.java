import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Arrays;
import java.util.List;

public final class ajB {
   private final List<CD> a = new ReferenceArrayList();
   private final List<sD> b = new ReferenceArrayList();
   private final List<CD> c = Arrays.asList(null);

   public void a(CD var1, sD var2) {
      if (var1 != null) {
         this.a.add(var1);
         this.b.add(var2);
      }

   }

   public List<CD> a() {
      return this.a;
   }

   public int a() {
      return this.a.size();
   }

   public CD a(int var1) {
      return (CD)this.a.get(var1);
   }

   public sD a(int var1) {
      return var1 >= 0 && var1 < this.b.size() ? (sD)this.b.get(var1) : afh.a;
   }

   public List<CD> a(CD var1) {
      List var2 = this.c;
      var2.set(0, var1);
      return var2;
   }

   public void a() {
      this.a.clear();
      this.b.clear();
   }
}
