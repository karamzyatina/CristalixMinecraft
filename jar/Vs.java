import java.util.Comparator;

class vs implements Comparator {
   // $FF: synthetic field
   final vp a;
   // $FF: synthetic field
   final vr a;

   vs(vr var1, vp var2) {
      this.a = var1;
      this.a = var2;
   }

   public int a(aaw var1, aaw var2) {
      SZ var3 = var1.a();
      SZ var4 = var2.a();
      aau var5 = null;
      aau var6 = null;
      if (this.a.n == 2) {
         var5 = aax.a(mY.a(var3));
         var6 = aax.a(mY.a(var4));
      } else if (this.a.n == 0) {
         var5 = aax.a(var3);
         var6 = aax.a(var4);
      } else if (this.a.n == 1) {
         var5 = aax.b(var3);
         var6 = aax.b(var4);
      } else if (this.a.n == 3) {
         var5 = aax.d(var3);
         var6 = aax.d(var4);
      } else if (this.a.n == 4) {
         var5 = aax.e(var3);
         var6 = aax.e(var4);
      }

      if (var5 != null || var6 != null) {
         if (var5 == null) {
            return 1;
         }

         if (var6 == null) {
            return -1;
         }

         int var7 = vp.a(this.a.b).a(var5);
         int var8 = vp.a(this.a.b).a(var6);
         if (var7 != var8) {
            return (var7 - var8) * this.a.o;
         }
      }

      return SZ.a(var3) - SZ.a(var4);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((aaw)var1, (aaw)var2);
   }
}
