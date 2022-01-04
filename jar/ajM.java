import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public final class ajm {
   private final uI a;
   private final ajn a;
   private int a = 0;
   private int b = 0;
   private long a = 0L;

   public ajm(uI var1, ajn var2) {
      this.a = var1;
      this.a = var2;
   }

   public void a(int var1, int var2, List var3) {
      if (Math.abs(var1 - this.a) <= 5 && Math.abs(var2 - this.b) <= 5) {
         short var4 = 700;
         if (System.currentTimeMillis() >= this.a + (long)var4) {
            tL var5 = ajk.a(var1, var2, var3);
            if (var5 != null) {
               ajn var6 = this.a;
               Rectangle var7 = var6.a(this.a, var1, var2);
               String[] var8 = var6.a(var5, var7.width);
               if (var8 != null) {
                  if (var8.length > 8) {
                     var8 = (String[])((String[])Arrays.copyOf(var8, 8));
                     var8[var8.length - 1] = var8[var8.length - 1] + " ...";
                  }

                  if (var6.a()) {
                     int var9 = -528449408;
                     this.a(var7.x, var7.y, var7.x + var7.width, var7.y + var7.height, var9);
                  }

                  uI var10000 = this.a;
                  uI.a(var7.x, var7.y, var7.x + var7.width, var7.y + var7.height, -536870912);
                  tI var13 = this.a.a.a;

                  for(int var10 = 0; var10 < var8.length; ++var10) {
                     String var11 = var8[var10];
                     int var12 = 14540253;
                     if (!var11.isEmpty() && var11.charAt(var11.length() - 1) == '!') {
                        var12 = 16719904;
                     }

                     var13.drawStringWithShadow(var11, (float)(var7.x + 5), (float)(var7.y + 5 + var10 * 11), var12);
                  }
               }
            }
         }
      } else {
         this.a = var1;
         this.b = var2;
         this.a = System.currentTimeMillis();
      }

   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      uI var10000 = this.a;
      uI.a(var1, var2 - 1, var3, var2, var5);
      var10000 = this.a;
      uI.a(var1, var4, var3, var4 + 1, var5);
      var10000 = this.a;
      uI.a(var1 - 1, var2, var1, var4, var5);
      var10000 = this.a;
      uI.a(var3, var2, var3 + 1, var4, var5);
   }
}
