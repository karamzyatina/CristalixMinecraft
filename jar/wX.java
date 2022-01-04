import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class Wx implements JsonDeserializer, JsonSerializer {
   public Wu a(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      JsonObject var4 = acn.a(var1, "status");
      Wu var5 = new Wu();
      if (var4.has("description")) {
         var5.a((adu)var3.deserialize(var4.get("description"), adu.class));
      }

      if (var4.has("players")) {
         var5.a((Wv)var3.deserialize(var4.get("players"), Wv.class));
      }

      if (var4.has("version")) {
         var5.a((Wy)var3.deserialize(var4.get("version"), Wy.class));
      }

      if (var4.has("favicon")) {
         var5.a(acn.a(var4, "favicon"));
      }

      return var5;
   }

   public JsonElement a(Wu var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      if (var1.a() != null) {
         var4.add("description", var3.serialize(var1.a()));
      }

      if (var1.a() != null) {
         var4.add("players", var3.serialize(var1.a()));
      }

      if (var1.a() != null) {
         var4.add("version", var3.serialize(var1.a()));
      }

      if (var1.a() != null) {
         var4.addProperty("favicon", var1.a());
      }

      return var4;
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.a(var1, var2, var3);
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.a((Wu)var1, var2, var3);
   }
}
