import com.google.common.base.Function;
import com.google.gson.JsonElement;
import java.util.Map.Entry;

final class DV implements Function {
   public DN a(Entry<String, JsonElement> var1) {
      return var1 == null ? null : DT.a(var1);
   }

   // $FF: synthetic method
   public Object apply(Object var1) {
      return this.a((Entry)var1);
   }
}
