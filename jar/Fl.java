import java.util.HashMap;
import java.util.Map;

public class FL extends FU {
   private static final Map<String, acC> a = new HashMap();

   public FL(Ga var1) {
      super(var1, new xv(var1.a), 0.75F);
   }

   protected acC a(QH var1) {
      String var2 = var1.a();
      acC var3 = (acC)a.get(var2);
      if (var3 == null) {
         var3 = new acC(var2);
         this.a.a.a((acC)var3, (HA)(new HE(var1.a())));
         a.put(var2, var3);
      }

      return var3;
   }
}
