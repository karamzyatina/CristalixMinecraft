import com.google.common.base.Predicate;

final class qx implements Predicate {
   // $FF: synthetic field
   final abP a;

   qx(abP var1) {
      this.a = var1;
   }

   public boolean a(NN var1) {
      return var1 != null && var1.b() == this.a;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.a((NN)var1);
   }
}
