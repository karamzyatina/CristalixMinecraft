import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class Kj implements IO {
   public static final Kk<Vh> a = new Kk();
   public static final Kk<wo> b = new Kk();
   private final Map<Kk<?>, Kh<?>> a = new Reference2ObjectArrayMap(2);

   public void a() {
      Collection var1 = this.a.values();
      int var2 = var1.size();
      Iterator var3 = var1.iterator();

      CompletableFuture[] var4;
      Kh var5;
      for(var4 = new CompletableFuture[var2]; var2-- > 0; var4[var2] = La.a(var5::a)) {
         var5 = (Kh)var3.next();
         var5.getClass();
      }

      CompletableFuture.allOf(var4).join();
   }

   public void onResourceManagerReload(IN var1) {
      this.a();
   }

   public <T> void a(Kk<T> var1, Kh<T> var2) {
      this.a.put(var1, var2);
   }

   public <T> JX<T> a(Kk<T> var1) {
      return (JX)this.a.get(var1);
   }
}
