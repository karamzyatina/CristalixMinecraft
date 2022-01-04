import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import it.unimi.dsi.fastutil.objects.Object2FloatLinkedOpenHashMap;

public final class Df extends TypeAdapter {
   public void a(JsonWriter var1, De var2) {
      throw new UnsupportedOperationException();
   }

   public static De a(JsonReader var0) {
      acC var1 = null;
      Object2FloatLinkedOpenHashMap var2 = null;
      var0.beginObject();

      while(true) {
         while(var0.hasNext()) {
            String var3 = var0.nextName();
            byte var4 = -1;
            switch(var3.hashCode()) {
            case -1348032073:
               if (var3.equals("predicate")) {
                  var4 = 1;
               }
               break;
            case 104069929:
               if (var3.equals("model")) {
                  var4 = 0;
               }
            }

            switch(var4) {
            case 0:
               var1 = new acC(var0.nextString());
               break;
            case 1:
               var2 = new Object2FloatLinkedOpenHashMap(4, 1.0F);
               var0.beginObject();

               while(var0.hasNext()) {
                  var2.put(new acC(var0.nextName()), Float.parseFloat(var0.nextString()));
               }

               var0.endObject();
               break;
            default:
               var0.skipValue();
            }
         }

         var0.endObject();
         return new De(var1, var2);
      }
   }

   public De b(JsonReader var1) {
      return a(var1);
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.b(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.a(var1, (De)var2);
   }
}
