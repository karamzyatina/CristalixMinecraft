import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collections;
import java.util.List;

public class Dg {
   public static final Dg a = new Dg();
   private final List<De> a;
   private agr a;

   private Dg() {
      this.a = Collections.emptyList();
   }

   public Dg(List<De> var1) {
      int var2 = var1.size();
      List var3 = this.a = new ObjectArrayList(var2);

      for(int var4 = var1.size() - 1; var4 >= 0; --var4) {
         var3.add(var1.get(var4));
      }

      if (var3.size() > 65) {
         this.a = agr.a(var3);
      }

   }

   public acC a(Vh var1, aej var2, Oh var3) {
      List var4 = this.a;
      if (!var4.isEmpty()) {
         agr var5 = this.a;
         if (var5 != null) {
            acC var6 = var5.a(var1, var2, var3);
            if (var6 != null) {
               return var6 == agr.a ? null : var6;
            }
         }

         int var9 = 0;

         for(int var7 = var4.size(); var9 < var7; ++var9) {
            De var8 = (De)var4.get(var9);
            if (var8.a(var1, var2, var3)) {
               if (var5 != null) {
                  var5.a(var1, var2, var3, var8.a());
               }

               return var8.a();
            }
         }

         if (var5 != null) {
            var5.a(var1, var2, var3, agr.a);
         }
      }

      return null;
   }

   public List<De> a() {
      return this.a;
   }
}
