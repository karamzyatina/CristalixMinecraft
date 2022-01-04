import java.net.IDN;
import java.util.function.Predicate;

class uK implements Predicate {
   // $FF: synthetic field
   final uJ a;

   uK(uJ var1) {
      this.a = var1;
   }

   public boolean a(String var1) {
      if (acK.a(var1)) {
         return true;
      } else {
         String[] var2 = var1.split(":");
         if (var2.length == 0) {
            return true;
         } else {
            try {
               String var3 = IDN.toASCII(var2[0]);
               return true;
            } catch (IllegalArgumentException var4) {
               return false;
            }
         }
      }
   }

   // $FF: synthetic method
   public boolean test(Object var1) {
      return this.a((String)var1);
   }
}
