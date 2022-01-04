import dev.xdark.clientapi.text.ClickEvent.Action;
import it.unimi.dsi.fastutil.objects.Object2ReferenceArrayMap;
import java.util.Map;

public enum adJ implements Action {
   OPEN_URL("open_url", true),
   OPEN_FILE("open_file", false),
   RUN_COMMAND("run_command", true),
   SUGGEST_COMMAND("suggest_command", true),
   CHANGE_PAGE("change_page", true);

   public static final adJ[] VALUES = values();
   private static final Map<String, adJ> NAME_MAPPING = new Object2ReferenceArrayMap(VALUES.length);
   private final boolean allowedInChat;
   private final String canonicalName;

   private adJ(String var3, boolean var4) {
      this.canonicalName = var3;
      this.allowedInChat = var4;
   }

   public boolean a() {
      return this.allowedInChat;
   }

   public String a() {
      return this.canonicalName;
   }

   public static adJ a(String var0) {
      return (adJ)NAME_MAPPING.get(var0);
   }

   static {
      adJ[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         adJ var3 = var0[var2];
         NAME_MAPPING.put(var3.a(), var3);
      }

   }
}
