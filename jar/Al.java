import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AL {
   private final Map<String, AM> a = new LinkedHashMap();
   private final acC a;
   private final String a;
   private final String b;

   public AL(String var1, acC var2, String var3) {
      this.b = var1;
      this.a = var2;
      this.a = var3;
   }

   public acC a(HM var1, String var2, List<aaz> var3, List<SW> var4) {
      if (var2.isEmpty()) {
         return null;
      } else {
         var2 = this.b + var2;
         AM var5 = (AM)this.a.get(var2);
         if (var5 == null) {
            if (this.a.size() >= 256 && !this.a(var1)) {
               return AJ.b;
            }

            ObjectArrayList var6 = new ObjectArrayList(var3.size());
            Iterator var7 = var3.iterator();

            while(var7.hasNext()) {
               aaz var8 = (aaz)var7.next();
               var6.add(this.a + var8.a() + ".png");
            }

            var5 = new AM((AK)null);
            var5.a = new acC(var2);
            var1.a((acC)var5.a, (HA)(new HD(this.a, var6, var4)));
            this.a.put(var2, var5);
         }

         var5.a = System.currentTimeMillis();
         return var5.a;
      }
   }

   private boolean a(HM var1) {
      long var2 = System.currentTimeMillis();
      Iterator var4 = this.a.keySet().iterator();

      AM var6;
      do {
         if (!var4.hasNext()) {
            return this.a.size() < 256;
         }

         String var5 = (String)var4.next();
         var6 = (AM)this.a.get(var5);
      } while(var2 - var6.a <= 5000L);

      var1.e(var6.a);
      var4.remove();
      return true;
   }
}
