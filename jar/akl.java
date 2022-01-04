import java.util.Map;

public class akL implements aiU {
   private Map<String, String> a = null;

   public akL(Map<String, String> var1) {
      this.a = var1;
   }

   public aiP a(String var1) {
      String var2 = "defined_";
      String var3;
      if (var1.startsWith(var2)) {
         var3 = var1.substring(var2.length());
         return this.a.containsKey(var3) ? new aiK(aiN.TRUE, (aiP[])null) : new aiK(aiN.FALSE, (aiP[])null);
      } else {
         while(this.a.containsKey(var1)) {
            var3 = (String)this.a.get(var1);
            if (var3 == null || var3.equals(var1)) {
               break;
            }

            var1 = var3;
         }

         int var4 = afT.a(var1, Integer.MIN_VALUE);
         if (var4 == Integer.MIN_VALUE) {
            afT.b("Unknown macro value: " + var1);
            return new aiE(0.0F);
         } else {
            return new aiE((float)var4);
         }
      }
   }
}
