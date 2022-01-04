import com.google.common.base.Function;
import com.google.gson.JsonElement;

final class DU implements Function {
   public DN a(JsonElement var1) {
      return var1 == null ? null : DT.a(var1.getAsJsonObject());
   }

   // $FF: synthetic method
   public Object apply(Object var1) {
      return this.a((JsonElement)var1);
   }
}
