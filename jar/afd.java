import java.util.HashMap;
import java.util.Map;

public class afD {
   protected Map<String, afL> a = new HashMap();
   private final Map<String, Short> b = new HashMap();

   public afL a(Class<? extends afL> var1, String var2) {
      return (afL)this.a.get(var2);
   }

   public void a(String var1, afL var2) {
      this.a.put(var1, var2);
   }

   public int a(String var1) {
      Short var2 = (Short)this.b.get(var1);
      if (var2 == null) {
         var2 = Short.valueOf((short)0);
      } else {
         var2 = (short)(var2 + 1);
      }

      this.b.put(var1, var2);
      return var2;
   }
}
