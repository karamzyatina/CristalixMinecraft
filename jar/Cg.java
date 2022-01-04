import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

class CG extends TypeAdapter {
   public void a(JsonWriter var1, CF var2) {
      throw new UnsupportedOperationException();
   }

   public static CF a(JsonReader var0) {
      float[] var1 = null;
      int var2 = 0;
      var0.beginObject();

      label40:
      do {
         while(var0.hasNext()) {
            String var3 = var0.nextName();
            byte var4 = -1;
            switch(var3.hashCode()) {
            case -40300674:
               if (var3.equals("rotation")) {
                  var4 = 1;
               }
               break;
            case 3745:
               if (var3.equals("uv")) {
                  var4 = 0;
               }
            }

            switch(var4) {
            case 0:
               var0.beginArray();
               var1 = new float[]{Float.parseFloat(var0.nextString()), Float.parseFloat(var0.nextString()), Float.parseFloat(var0.nextString()), Float.parseFloat(var0.nextString())};
               var0.endArray();
               break;
            case 1:
               var2 = var0.nextInt();
               continue label40;
            default:
               var0.skipValue();
            }
         }

         var0.endObject();
         return new CF(var1, var2);
      } while(var2 >= 0 && var2 % 90 == 0 && var2 / 90 <= 3);

      throw new JsonParseException("Invalid rotation " + var2 + " found, only 0/90/180/270 allowed");
   }

   public CF b(JsonReader var1) {
      return a(var1);
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.b(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.a(var1, (CF)var2);
   }
}
