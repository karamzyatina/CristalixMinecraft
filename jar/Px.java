import java.util.function.Predicate;

final class px implements Predicate {
   public boolean a(pQ var1) {
      return var1.a() >= 4;
   }

   // $FF: synthetic method
   public boolean test(Object var1) {
      return this.a((pQ)var1);
   }
}
