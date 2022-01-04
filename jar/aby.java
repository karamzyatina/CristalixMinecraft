import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

class abY extends TypeAdapter {
   // $FF: synthetic field
   final Map a;
   // $FF: synthetic field
   final abX a;

   abY(abX var1, Map var2) {
      this.a = var1;
      this.a = var2;
   }

   public void write(JsonWriter var1, T var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.value(abX.a(this.a, var2));
      }

   }

   public T read(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      } else {
         return this.a.get(var1.nextString());
      }
   }
}
