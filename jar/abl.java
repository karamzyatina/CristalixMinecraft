import java.util.function.Predicate;

final class abL implements Predicate {
   public boolean a(NN var1) {
      return !(var1 instanceof Rn) || !((Rn)var1).isSpectator() && !((Rn)var1).isCreative();
   }

   // $FF: synthetic method
   public boolean test(Object var1) {
      return this.a((NN)var1);
   }
}
