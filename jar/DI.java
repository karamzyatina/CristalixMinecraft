import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.lwjgl.util.vector.Vector3f;

public class Di extends TypeAdapter {
   private static final Vector3f a = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Vector3f b = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);

   public void a(JsonWriter var1, Dh var2) {
      throw new UnsupportedOperationException();
   }

   public static Dh a(JsonReader var0) {
      Vector3f var1 = a;
      Vector3f var2 = b;
      Vector3f var3 = c;
      var0.beginObject();

      while(var0.hasNext()) {
         String var4 = var0.nextName();
         byte var5 = -1;
         switch(var4.hashCode()) {
         case -1840647503:
            if (var4.equals("translation")) {
               var5 = 1;
            }
            break;
         case -40300674:
            if (var4.equals("rotation")) {
               var5 = 0;
            }
            break;
         case 109250890:
            if (var4.equals("scale")) {
               var5 = 2;
            }
         }

         switch(var5) {
         case 0:
            var1 = a(var0);
            break;
         case 1:
            var2 = a(var0);
            break;
         case 2:
            var3 = a(var0);
            break;
         default:
            var0.skipValue();
         }
      }

      var0.endObject();
      var2.scale(0.0625F);
      var2.x = adh.a(var2.x, -5.0F, 5.0F);
      var2.y = adh.a(var2.y, -5.0F, 5.0F);
      var2.z = adh.a(var2.z, -5.0F, 5.0F);
      var3.x = adh.a(var3.x, -4.0F, 4.0F);
      var3.y = adh.a(var3.y, -4.0F, 4.0F);
      var3.z = adh.a(var3.z, -4.0F, 4.0F);
      return new Dh(var1, var2, var3);
   }

   public Dh b(JsonReader var1) {
      return a(var1);
   }

   private static Vector3f a(JsonReader var0) {
      var0.beginArray();
      Vector3f var1 = new Vector3f(Float.parseFloat(var0.nextString()), Float.parseFloat(var0.nextString()), Float.parseFloat(var0.nextString()));
      var0.endArray();
      return var1;
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.b(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.a(var1, (Dh)var2);
   }
}
