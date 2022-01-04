import com.google.common.collect.MapMaker;
import java.util.Map;

public final class aay {
   protected final Map<aau, acO> a = (new MapMaker()).makeMap();

   public void a(aau var1, int var2) {
      acO var3 = (acO)this.a.get(var1);
      if (var3 == null) {
         var3 = new acO();
         this.a.put(var1, var3);
      }

      var3.a(var2);
   }

   public int a(aau var1) {
      acO var2 = (acO)this.a.get(var1);
      return var2 == null ? 0 : var2.a();
   }
}
