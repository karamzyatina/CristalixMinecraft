import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ds extends TypeAdapter {
   public void a(JsonWriter var1, Dr var2) {
      throw new UnsupportedOperationException();
   }

   public Dr a(JsonReader var1) {
      Object var2 = Collections.emptyMap();
      DQ var3 = null;
      var1.beginObject();

      while(var1.hasNext()) {
         String var4 = var1.nextName();
         byte var6 = -1;
         switch(var4.hashCode()) {
         case -1249574770:
            if (var4.equals("variants")) {
               var6 = 0;
            }
            break;
         case -1206127444:
            if (var4.equals("multipart")) {
               var6 = 1;
            }
         }

         switch(var6) {
         case 0:
            var2 = new HashMap(4);
            var1.beginObject();

            while(var1.hasNext()) {
               ((Map)var2).put(var1.nextName(), DE.a(var1));
            }

            var1.endObject();
            break;
         case 1:
            var3 = DR.a(var1);
            break;
         default:
            var1.skipValue();
         }
      }

      var1.endObject();
      if (!((Map)var2).isEmpty() || var3 != null && !var3.getVariants().isEmpty()) {
         return new Dr((Map)var2, var3);
      } else {
         throw new JsonParseException("Neither 'variants' nor 'multipart' found");
      }
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.a(var1, (Dr)var2);
   }
}
