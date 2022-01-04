import it.unimi.dsi.fastutil.Hash.Strategy;

final class akD implements Strategy {
   public int a(nh var1) {
      return System.identityHashCode(var1);
   }

   public boolean a(nh var1, nh var2) {
      return var1 == var2;
   }

   // $FF: synthetic method
   public boolean equals(Object var1, Object var2) {
      return this.a((nh)var1, (nh)var2);
   }

   // $FF: synthetic method
   public int hashCode(Object var1) {
      return this.a((nh)var1);
   }
}
