import dev.xdark.clientapi.sound.SoundCategory;
import it.unimi.dsi.fastutil.objects.Object2ReferenceArrayMap;
import java.util.Map;
import java.util.Set;

public enum acI implements SoundCategory {
   MASTER("master"),
   MUSIC("music"),
   RECORDS("record"),
   WEATHER("weather"),
   BLOCKS("block"),
   HOSTILE("hostile"),
   NEUTRAL("neutral"),
   PLAYERS("player"),
   AMBIENT("ambient"),
   VOICE("voice");

   public static final acI[] VALUES = values();
   private static final Map<String, acI> SOUND_CATEGORIES = new Object2ReferenceArrayMap(VALUES.length);
   private final String name;

   private acI(String var3) {
      this.name = var3;
   }

   public String getName() {
      return this.name;
   }

   public static acI a(String var0) {
      return (acI)SOUND_CATEGORIES.get(var0);
   }

   public static Set<String> a() {
      return SOUND_CATEGORIES.keySet();
   }

   static {
      acI[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         acI var3 = var0[var2];
         if (SOUND_CATEGORIES.putIfAbsent(var3.getName(), var3) != null) {
            throw new Error("Clash in Sound Category name pools! Cannot insert " + var3);
         }
      }

   }
}
