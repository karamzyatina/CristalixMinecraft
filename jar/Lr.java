import java.io.Writer;

public final class LR extends LS {
   public int a(String var1, int var2, Writer var3) {
      int var4 = var1.length() - var2 - 1;
      StringBuilder var5 = new StringBuilder();
      if (var1.charAt(var2) == '\\' && var4 > 0 && a(var1.charAt(var2 + 1))) {
         int var6 = var2 + 1;
         int var7 = var2 + 2;
         int var8 = var2 + 3;
         var5.append(var1.charAt(var6));
         if (var4 > 1 && a(var1.charAt(var7))) {
            var5.append(var1.charAt(var7));
            if (var4 > 2 && b(var1.charAt(var6)) && a(var1.charAt(var8))) {
               var5.append(var1.charAt(var8));
            }
         }

         var3.write(Integer.parseInt(var5.toString(), 8));
         return 1 + var5.length();
      } else {
         return 0;
      }
   }

   private static boolean a(char var0) {
      return var0 >= '0' && var0 <= '7';
   }

   private static boolean b(char var0) {
      return var0 >= '0' && var0 <= '3';
   }
}
