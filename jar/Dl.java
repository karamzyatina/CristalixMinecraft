import com.google.common.base.Function;
import java.util.function.Predicate;

class DL implements Function {
   // $FF: synthetic field
   final sy a;
   // $FF: synthetic field
   final DK a;

   DL(DK var1, sy var2) {
      this.a = var1;
      this.a = var2;
   }

   public Predicate<sD> a(DN var1) {
      return var1 == null ? null : var1.a(this.a);
   }

   // $FF: synthetic method
   public Object apply(Object var1) {
      return this.a((DN)var1);
   }
}
