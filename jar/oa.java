import java.util.function.Predicate;

final class oA implements Predicate {
   // $FF: synthetic field
   final oy a;

   oA(oy var1) {
      this.a = var1;
   }

   public boolean a(oz var1) {
      return var1.a() == this.a;
   }

   // $FF: synthetic method
   public boolean test(Object var1) {
      return this.a((oz)var1);
   }
}
