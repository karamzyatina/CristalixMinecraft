import com.google.common.primitives.Doubles;
import com.google.common.util.concurrent.ListenableFutureTask;

final class Ek implements Comparable {
   private final ListenableFutureTask<Object> a;
   private final double a;

   public Ek(ListenableFutureTask<Object> var1, double var2) {
      this.a = var1;
      this.a = var2;
   }

   public int a(Ek var1) {
      return Doubles.compare(this.a, var1.a);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((Ek)var1);
   }

   // $FF: synthetic method
   static ListenableFutureTask a(Ek var0) {
      return var0.a;
   }
}
