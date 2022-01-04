import com.google.common.base.Preconditions;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class tv extends TypeAdapter {
   public void a(JsonWriter var1, tu var2) {
      throw new UnsupportedOperationException();
   }

   public tu a(JsonReader var1) {
      boolean var2 = false;
      String var3 = null;
      Object var4 = Collections.emptyList();
      var1.beginObject();

      while(true) {
         while(var1.hasNext()) {
            String var5 = var1.nextName();
            byte var6 = -1;
            switch(var5.hashCode()) {
            case -2060497896:
               if (var5.equals("subtitle")) {
                  var6 = 1;
               }
               break;
            case -896509628:
               if (var5.equals("sounds")) {
                  var6 = 2;
               }
               break;
            case 1094496948:
               if (var5.equals("replace")) {
                  var6 = 0;
               }
            }

            switch(var6) {
            case 0:
               var2 = var1.nextBoolean();
               break;
            case 1:
               var3 = var1.nextString();
               break;
            case 2:
               var1.beginArray();
               var4 = new ArrayList(32);

               while(var1.hasNext()) {
                  if (var1.peek() == JsonToken.STRING) {
                     String var7 = var1.nextString();
                     ((List)var4).add(new tn(var7, 1.0F, 1.0F, 1, to.FILE, false));
                  } else {
                     ((List)var4).add(a(var1));
                  }
               }

               var1.endArray();
               break;
            default:
               var1.skipValue();
            }
         }

         var1.endObject();
         return new tu((List)var4, var2, var3);
      }
   }

   private static tn a(JsonReader var0) {
      String var1 = null;
      to var2 = to.FILE;
      float var3 = 1.0F;
      float var4 = 1.0F;
      int var5 = 1;
      boolean var6 = false;
      var0.beginObject();

      while(var0.hasNext()) {
         String var7 = var0.nextName();
         byte var8 = -1;
         switch(var7.hashCode()) {
         case -891990144:
            if (var7.equals("stream")) {
               var8 = 5;
            }
            break;
         case -810883302:
            if (var7.equals("volume")) {
               var8 = 2;
            }
            break;
         case -791592328:
            if (var7.equals("weight")) {
               var8 = 4;
            }
            break;
         case 3373707:
            if (var7.equals("name")) {
               var8 = 0;
            }
            break;
         case 3575610:
            if (var7.equals("type")) {
               var8 = 1;
            }
            break;
         case 106677056:
            if (var7.equals("pitch")) {
               var8 = 3;
            }
         }

         switch(var8) {
         case 0:
            var1 = var0.nextString();
            break;
         case 1:
            var2 = to.a(var0.nextString());
            Preconditions.checkNotNull(var2, "Invalid type");
            break;
         case 2:
            var3 = Float.parseFloat(var0.nextString());
            Preconditions.checkState(var3 > 0.0F, "Invalid volume");
            break;
         case 3:
            var4 = Float.parseFloat(var0.nextString());
            Preconditions.checkState(var4 > 0.0F, "Invalid pitch");
            break;
         case 4:
            var5 = var0.nextInt();
            Preconditions.checkState(var5 > 0, "Invalid weight");
            break;
         case 5:
            var6 = var0.nextBoolean();
            break;
         default:
            var0.skipValue();
         }
      }

      var0.endObject();
      return new tn(var1, var3, var4, var5, var2, var6);
   }

   // $FF: synthetic method
   public Object read(JsonReader var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public void write(JsonWriter var1, Object var2) {
      this.a(var1, (tu)var2);
   }
}
