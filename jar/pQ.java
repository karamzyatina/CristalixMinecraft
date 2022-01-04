import java.util.HashMap;
import java.util.Map;

public enum Pq {
   RIDEABLE(0, "MinecartRideable"),
   CHEST(1, "MinecartChest"),
   FURNACE(2, "MinecartFurnace"),
   TNT(3, "MinecartTNT"),
   SPAWNER(4, "MinecartSpawner"),
   HOPPER(5, "MinecartHopper"),
   COMMAND_BLOCK(6, "MinecartCommandBlock");

   private static final Map<Integer, Pq> BY_ID = new HashMap();
   private final int id;
   private final String name;

   private Pq(int var3, String var4) {
      this.id = var3;
      this.name = var4;
   }

   public int a() {
      return this.id;
   }

   public String a() {
      return this.name;
   }

   public static Pq a(int var0) {
      Pq var1 = (Pq)BY_ID.get(var0);
      return var1 == null ? RIDEABLE : var1;
   }

   static {
      Pq[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         Pq var3 = var0[var2];
         BY_ID.put(var3.a(), var3);
      }

   }
}
