import java.util.List;
import java.util.Random;

public final class acR {
   public static int a(List<? extends acS> var0) {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = var0.size(); var2 < var3; ++var2) {
         acS var4 = (acS)var0.get(var2);
         var1 += var4.b;
      }

      return var1;
   }

   public static <T extends acS> T a(Random var0, List<T> var1, int var2) {
      if (var2 <= 0) {
         throw new IllegalArgumentException();
      } else {
         int var3 = var0.nextInt(var2);
         return a(var1, var3);
      }
   }

   public static <T extends acS> T a(List<T> var0, int var1) {
      int var2 = 0;

      for(int var3 = var0.size(); var2 < var3; ++var2) {
         acS var4 = (acS)var0.get(var2);
         var1 -= var4.b;
         if (var1 < 0) {
            return var4;
         }
      }

      return null;
   }

   public static <T extends acS> T a(Random var0, List<T> var1) {
      return a(var0, var1, a(var1));
   }
}
