import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public final class alK {
   private static final Int2ObjectMap<amh> a = new Int2ObjectOpenHashMap();
   private static final alU a = new alU(1);

   public static float a(int var0, float var1, float var2, float var3) {
      synchronized(a) {
         amh var5 = (amh)a.get(var0);
         if (var5 == null) {
            var5 = new amh(var1, var2, var3);
            a.put(var0, var5);
         }

         float var6 = var5.a(var1, var2, var3);
         return var6;
      }
   }

   public static int a() {
      return a.a();
   }

   public static void a() {
      a.clear();
   }
}
