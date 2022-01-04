import it.unimi.dsi.fastutil.objects.Object2ReferenceArrayMap;
import java.util.Map;

public enum aaq {
   ALWAYS("always", 0),
   NEVER("never", 1),
   HIDE_FOR_OTHER_TEAMS("pushOtherTeams", 2),
   HIDE_FOR_OWN_TEAM("pushOwnTeam", 3);

   public static final aaq[] VALUES = values();
   private static final Map<String, aaq> nameMap = new Object2ReferenceArrayMap(VALUES.length);
   public final String name;
   public final int id;

   public static String[] a() {
      return (String[])((String[])nameMap.keySet().toArray(new String[0]));
   }

   public static aaq a(String var0) {
      return (aaq)nameMap.get(var0);
   }

   private aaq(String var3, int var4) {
      this.name = var3;
      this.id = var4;
   }

   static {
      aaq[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         aaq var3 = var0[var2];
         nameMap.put(var3.name, var3);
      }

   }
}
