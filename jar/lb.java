import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class Lb {
   private static final LoadingCache<Ld, int[][]> a;

   private Lb() {
   }

   public static int[][] a(int var0, int var1, int[][] var2) {
      return (int[][])a.getUnchecked(new Ld(var0, var1, var2));
   }

   private static int b(int[][] var0) {
      int var1 = 1;
      int var2 = 0;

      for(int var3 = var0.length; var2 < var3; ++var2) {
         var1 = 31 * var1 + Arrays.hashCode(var0[var2]);
      }

      return var1;
   }

   private static boolean b(int[][] var0, int[][] var1) {
      int var2;
      if ((var2 = var0.length) != var1.length) {
         return false;
      } else {
         do {
            if (var2-- <= 0) {
               return true;
            }
         } while(Arrays.equals(var0[var2], var1[var2]));

         return false;
      }
   }

   // $FF: synthetic method
   static boolean a(int[][] var0, int[][] var1) {
      return b(var0, var1);
   }

   // $FF: synthetic method
   static int a(int[][] var0) {
      return b(var0);
   }

   static {
      a = CacheBuilder.newBuilder().expireAfterAccess(15L, TimeUnit.MINUTES).maximumSize(4096L).concurrencyLevel(Runtime.getRuntime().availableProcessors()).build(new Lc());
   }
}
