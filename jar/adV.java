import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map.Entry;

public final class adv implements JsonDeserializer, JsonSerializer {
   private static final Gson a;

   public adu a(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      if (var1.isJsonPrimitive()) {
         return new adD(var1.getAsString());
      } else if (!var1.isJsonObject()) {
         if (var1.isJsonArray()) {
            JsonArray var11 = var1.getAsJsonArray();
            adu var16 = null;
            Iterator var14 = var11.iterator();

            while(var14.hasNext()) {
               JsonElement var17 = (JsonElement)var14.next();
               adu var18 = this.a((JsonElement)var17, (Type)var17.getClass(), (JsonDeserializationContext)var3);
               if (var16 == null) {
                  var16 = var18;
               } else {
                  var16.a(var18);
               }
            }

            return var16;
         } else {
            throw new JsonParseException("Don't know how to turn " + var1 + " into a Component");
         }
      } else {
         JsonObject var4 = var1.getAsJsonObject();
         Object var5;
         if (var4.has("text")) {
            var5 = new adD(var4.get("text").getAsString());
         } else if (var4.has("translate")) {
            String var12 = var4.get("translate").getAsString();
            if (var4.has("with")) {
               JsonArray var7 = var4.getAsJsonArray("with");
               Object[] var8 = new Object[var7.size()];

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  var8[var9] = this.a(var7.get(var9), var2, var3);
                  if (var8[var9] instanceof adD) {
                     adD var10 = (adD)var8[var9];
                     if (var10.a().isEmpty() && var10.a().isEmpty()) {
                        var8[var9] = var10.b();
                     }
                  }
               }

               var5 = new adE(var12, var8);
            } else {
               var5 = new adE(var12, new Object[0]);
            }
         } else if (var4.has("score")) {
            JsonObject var6 = var4.getAsJsonObject("score");
            if (!var6.has("name") || !var6.has("objective")) {
               throw new JsonParseException("A score component needs a least a name and an objective");
            }

            var5 = new adB(acn.a(var6, "name"), acn.a(var6, "objective"));
            if (var6.has("value")) {
               ((adB)var5).a(acn.a(var6, "value"));
            }
         } else if (var4.has("selector")) {
            var5 = new adC(acn.a(var4, "selector"));
         } else {
            if (!var4.has("keybind")) {
               throw new JsonParseException("Don't know how to turn " + var1 + " into a Component");
            }

            var5 = new adA(acn.a(var4, "keybind"));
         }

         if (var4.has("extra")) {
            JsonArray var13 = var4.getAsJsonArray("extra");
            if (var13.size() <= 0) {
               throw new JsonParseException("Unexpected empty array of components");
            }

            for(int var15 = 0; var15 < var13.size(); ++var15) {
               ((adu)var5).a(this.a(var13.get(var15), var2, var3));
            }
         }

         ((adu)var5).a((adw)var3.deserialize(var1, adw.class));
         return (adu)var5;
      }
   }

   private static void a(adw var0, JsonObject var1, JsonSerializationContext var2) {
      JsonElement var3 = var2.serialize(var0);
      if (var3.isJsonObject()) {
         JsonObject var4 = (JsonObject)var3;
         Iterator var5 = var4.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            var1.add((String)var6.getKey(), (JsonElement)var6.getValue());
         }
      }

   }

   public JsonElement a(adu var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      if (!var1.a().isEmpty()) {
         a(var1.a(), var4, var3);
      }

      if (!var1.a().isEmpty()) {
         JsonArray var5 = new JsonArray();
         Iterator var6 = var1.a().iterator();

         while(var6.hasNext()) {
            adu var7 = (adu)var6.next();
            var5.add(this.a((adu)var7, (Type)var7.getClass(), (JsonSerializationContext)var3));
         }

         var4.add("extra", var5);
      }

      if (var1 instanceof adD) {
         var4.addProperty("text", ((adD)var1).b());
      } else if (var1 instanceof adE) {
         adE var11 = (adE)var1;
         var4.addProperty("translate", var11.b());
         if (var11.a() != null && var11.a().length > 0) {
            JsonArray var14 = new JsonArray();
            Object[] var17 = var11.a();
            int var8 = var17.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               Object var10 = var17[var9];
               if (var10 instanceof adu) {
                  var14.add(this.a((adu)((adu)var10), (Type)var10.getClass(), (JsonSerializationContext)var3));
               } else {
                  var14.add(new JsonPrimitive(String.valueOf(var10)));
               }
            }

            var4.add("with", var14);
         }
      } else if (var1 instanceof adB) {
         adB var12 = (adB)var1;
         JsonObject var16 = new JsonObject();
         var16.addProperty("name", var12.b());
         var16.addProperty("objective", var12.c());
         var16.addProperty("value", var12.a());
         var4.add("score", var16);
      } else if (var1 instanceof adC) {
         adC var13 = (adC)var1;
         var4.addProperty("selector", var13.b());
      } else {
         if (!(var1 instanceof adA)) {
            throw new IllegalArgumentException("Don't know how to serialize " + var1 + " as a Component");
         }

         adA var15 = (adA)var1;
         var4.addProperty("keybind", var15.b());
      }

      return var4;
   }

   public static String a(adu var0) {
      return a.toJson(var0);
   }

   public static adu a(String var0) {
      return (adu)acn.a(a, var0, adu.class, false);
   }

   public static adu b(String var0) {
      return (adu)acn.a(a, var0, adu.class, true);
   }

   // $FF: synthetic method
   public Object deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      return this.a(var1, var2, var3);
   }

   // $FF: synthetic method
   public JsonElement serialize(Object var1, Type var2, JsonSerializationContext var3) {
      return this.a((adu)var1, var2, var3);
   }

   static {
      GsonBuilder var0 = new GsonBuilder();
      var0.registerTypeHierarchyAdapter(adu.class, new adv());
      var0.registerTypeHierarchyAdapter(adw.class, new ady());
      var0.registerTypeAdapterFactory(new abX());
      a = var0.create();
   }
}
