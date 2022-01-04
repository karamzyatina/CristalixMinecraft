import dev.xdark.clientapi.text.HoverEvent.Action;
import it.unimi.dsi.fastutil.objects.Object2ReferenceArrayMap;
import java.util.Map;

public enum adL implements Action {
   SHOW_TEXT("show_text", true),
   SHOW_ITEM("show_item", true),
   SHOW_ENTITY("show_entity", true);

   public static final adL[] VALUES = values();
   private static final Map<String, adL> NAME_MAPPING = new Object2ReferenceArrayMap(VALUES.length);
   private final boolean allowedInChat;
   private final String canonicalName;

   private adL(String var3, boolean var4) {
      this.canonicalName = var3;
      this.allowedInChat = var4;
   }

   public boolean a() {
      return this.allowedInChat;
   }

   public String a() {
      return this.canonicalName;
   }

   public static adL a(String var0) {
      return (adL)NAME_MAPPING.get(var0);
   }

   static {
      adL[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         adL var3 = var0[var2];
         NAME_MAPPING.put(var3.a(), var3);
      }

   }
}
