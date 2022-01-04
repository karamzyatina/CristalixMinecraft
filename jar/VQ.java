import com.google.common.base.Predicate;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;

public class Vq implements Predicate {
   public static final Vq a = new Vr(new Vh[0]);
   private final Vh[] a;
   private IntList a;

   public Vq(Vh... var1) {
      this.a = var1;
   }

   public Vh[] a() {
      return this.a;
   }

   public boolean a(Vh var1) {
      if (var1 != null) {
         Vh[] var2 = this.a;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            Vh var5 = var2[var4];
            if (var5.a() == var1.a()) {
               int var6 = var5.getMetadata();
               if (var6 == 32767 || var6 == var1.getMetadata()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public IntList a() {
      if (this.a == null) {
         this.a = new IntArrayList(this.a.length);
         Vh[] var1 = this.a;
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Vh var4 = var1[var3];
            this.a.add(Kf.a(var4));
         }

         this.a.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.a;
   }

   public static Vq a(SZ var0) {
      return a(new Vh(var0, 1, 32767));
   }

   public static Vq a(SZ... var0) {
      Vh[] var1 = new Vh[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1[var2] = new Vh(var0[var2]);
      }

      return a(var1);
   }

   public static Vq a(Vh... var0) {
      if (var0.length > 0) {
         Vh[] var1 = var0;
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            Vh var4 = var1[var3];
            if (!var4.isEmpty()) {
               return new Vq(var0);
            }
         }
      }

      return a;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.a((Vh)var1);
   }
}
