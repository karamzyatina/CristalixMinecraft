import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class abz {
   private final Map<SZ, abB> a = new Reference2ObjectOpenHashMap();
   private int a;

   public boolean a(SZ var1) {
      return this.a(var1, 0.0F) > 0.0F;
   }

   public float a(SZ var1, float var2) {
      Map var6 = this.a;
      abB var3 = (abB)this.a(var6, var1);
      if (var3 != null) {
         float var4 = (float)(var3.b - var3.a);
         float var5 = (float)var3.b - ((float)this.a + var2);
         return adh.a(var5 / var4, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   public void a() {
      ++this.a;
      if (!this.a.isEmpty()) {
         Iterator var1 = this.a.entrySet().iterator();

         while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            if (((abB)var2.getValue()).b <= this.a) {
               var1.remove();
            }
         }
      }

   }

   public void a(SZ var1, int var2) {
      this.a.put(var1, new abB(this.a, this.a + var2, (abA)null));
   }

   public void a(SZ var1) {
      this.a.remove(var1);
   }

   private Object a(Map var1, Object var2) {
      return asE.a ? null : var1.get(var2);
   }
}
