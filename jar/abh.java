import dev.xdark.feder.function.Predicates;
import java.util.function.Predicate;

public final class abH {
   public static final Predicate<NN> a = new abI();
   public static final Predicate<NN> b = new abJ();
   public static final Predicate<NN> c = new abK();
   public static final Predicate<NN> d = new abL();
   public static final Predicate<NN> e = new abM();

   // $FF: synthetic method
   private static boolean a(aap var0, aaq var1, NN var2) {
      if (!var2.h()) {
         return false;
      } else if (var2 instanceof Rn && ((Rn)var2).isUser()) {
         aap var3 = var2.a();
         aaq var4 = var3 == null ? aaq.ALWAYS : var3.a();
         if (var4 == aaq.NEVER) {
            return false;
         } else {
            boolean var5 = var0 != null && var0.a(var3);
            if ((var1 == aaq.HIDE_FOR_OWN_TEAM || var4 == aaq.HIDE_FOR_OWN_TEAM) && var5) {
               return false;
            } else {
               return var1 != aaq.HIDE_FOR_OTHER_TEAMS && var4 != aaq.HIDE_FOR_OTHER_TEAMS || var5;
            }
         }
      } else {
         return false;
      }
   }

   public static Predicate a(NN var0) {
      return Predicates.alwaysFalse();
   }
}
