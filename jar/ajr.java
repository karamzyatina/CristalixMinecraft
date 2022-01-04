import dev.xdark.feder.RecyclableArrayList;

public class ajR {
   public static final abP[][] a = a(true);

   private static abP[][] a(boolean var0) {
      byte var1 = 64;
      abP[][] var2 = new abP[var1][];
      abP[] var3 = abP.VALUES;
      RecyclableArrayList var4 = RecyclableArrayList.newInstance(var3.length);

      for(int var5 = 0; var5 < var1; ++var5) {
         for(int var6 = 0; var6 < var3.length; ++var6) {
            abP var7 = var3[var6];
            abP var8 = var0 ? var7.a() : var7;
            int var9 = 1 << var8.ordinal();
            if ((var5 & var9) != 0) {
               var4.add(var7);
            }
         }

         abP[] var10 = (abP[])var4.toArray(new abP[0]);
         var4.clear();
         var2[var5] = var10;
      }

      var4.recycle();
      return var2;
   }

   public static abP[] a(int var0) {
      int var1 = ~var0 & 63;
      return a[var1];
   }
}
