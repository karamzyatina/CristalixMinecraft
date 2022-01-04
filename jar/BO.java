import java.util.function.Predicate;

class Bo implements Predicate {
   // $FF: synthetic field
   final Bn a;

   Bo(Bn var1) {
      this.a = var1;
   }

   public boolean a(NN var1) {
      return var1 != null && var1.g();
   }

   // $FF: synthetic method
   public boolean test(Object var1) {
      return this.a((NN)var1);
   }
}
