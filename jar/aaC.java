import com.google.common.base.Predicate;
import java.util.Iterator;

final class aac implements Predicate {
   public boolean a(Vh var1) {
      Iterator var2 = aab.a().iterator();

      Vq var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (Vq)var2.next();
      } while(!var3.a(var1));

      return true;
   }

   // $FF: synthetic method
   public boolean apply(Object var1) {
      return this.a((Vh)var1);
   }
}
