import java.util.List;
import java.util.Map;

public final class DZ extends Ec {
   private final so<?> a;
   private final String a;
   private final List<so<?>> a;

   private DZ(so<?> var1, String var2, List<so<?>> var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public Dv a(sD var1) {
      Dv var2 = var1.a();
      if (var2 != null) {
         return var2;
      } else {
         Map var3 = var1.getProperties();
         so var5 = null;
         so var6 = this.a;
         String var4;
         if (var6 == null) {
            var4 = ((acC)mY.a.b(var1.a())).toString();
         } else {
            var4 = var6.getName((Comparable)var3.get(var6));
            var5 = var6;
         }

         if (this.a != null) {
            var4 = var4 + this.a;
         }

         var2 = new Dv(var4, a(var3, this.a, var5));
         var1.a(var2);
         return var2;
      }
   }

   private <T extends Comparable<T>> String a(so<T> var1, Map<so<?>, Comparable<?>> var2) {
      return var1.getName((Comparable)var2.remove(this.a));
   }

   // $FF: synthetic method
   DZ(so var1, String var2, List var3, Ea var4) {
      this(var1, var2, var3);
   }
}
