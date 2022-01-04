import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Collections;

public class DE extends TypeAdapter {
   public void a(JsonWriter var1, DD var2) {
      throw new UnsupportedOperationException();
   }

   public static DD a(JsonReader var0) {
      if (var0.peek() != JsonToken.BEGIN_ARRAY) {
         return new DD(Collections.singletonList(DC.a(var0)));
      } else {
         ReferenceArrayList var1 = new ReferenceArrayList(4);
         var0.beginArray();

         while(var0.hasNext()) {
            var1.add(DC.a(var0));
         }

         var0.endArray();
         return new DD(var1);
      }
   }

   public DD b(JsonReader var1) {
      return a(var1);
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.b(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.a(var1, (DD)var2);
   }
}
