import it.unimi.dsi.fastutil.chars.CharOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public final class LQ extends LS {
   private final Map<String, String> a;
   private final CharSet a;
   private final int a;
   private final int b;

   public LQ(String[]... var1) {
      HashMap var2 = new HashMap(var1.length);
      CharOpenHashSet var3 = new CharOpenHashSet(var1.length);
      int var4 = Integer.MAX_VALUE;
      int var5 = 0;
      String[][] var6 = var1;
      int var7 = var1.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         String[] var9 = var6[var8];
         var2.put(var9[0], var9[1]);
         var3.add(var9[0].charAt(0));
         int var10 = var9[0].length();
         if (var10 < var4) {
            var4 = var10;
         }

         if (var10 > var5) {
            var5 = var10;
         }
      }

      this.a = var4;
      this.b = var5;
      this.a = var2;
      this.a = var3;
   }

   public int a(String var1, int var2, Writer var3) {
      if (this.a.contains(var1.charAt(var2))) {
         int var4 = this.b;
         if (var2 + var4 > var1.length()) {
            var4 = var1.length() - var2;
         }

         int var5 = this.a;
         Map var6 = this.a;

         for(int var7 = var4; var7 >= var5; --var7) {
            String var8 = var1.substring(var2, var2 + var7);
            String var9 = (String)var6.get(var8);
            if (var9 != null) {
               var3.write(var9);
               return var7;
            }
         }
      }

      return 0;
   }
}
