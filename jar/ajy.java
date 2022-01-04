import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.ArrayList;

public final class ajY {
   private final int a;
   private final agH[] a;

   public ajY(int var1, agH[] var2) {
      this.a = var1;
      this.a = var2;
   }

   public int a() {
      return this.a;
   }

   public boolean a(int var1, int var2) {
      for(int var3 = 0; var3 < this.a.length; ++var3) {
         agH var4 = this.a[var3];
         if (var4.a(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public int[] a() {
      IntOpenHashSet var1 = new IntOpenHashSet(this.a.length, 1.0F);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1.add(this.a[var2].a());
      }

      return var1.toIntArray();
   }

   public agH[] a(int var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         agH var4 = this.a[var3];
         if (var4.a() == var1) {
            var2.add(var4);
         }
      }

      return (agH[])((agH[])var2.toArray(new agH[0]));
   }

   public String toString() {
      return "block." + this.a + '=' + afT.a((Object[])this.a);
   }
}
