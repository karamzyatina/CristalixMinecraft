import dev.xdark.clientapi.util.ParticleType;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;

public enum abW implements ParticleType {
   EXPLOSION_NORMAL("explode", 0, true),
   EXPLOSION_LARGE("largeexplode", 1, true),
   EXPLOSION_HUGE("hugeexplosion", 2, true),
   FIREWORKS_SPARK("fireworksSpark", 3, false),
   WATER_BUBBLE("bubble", 4, false),
   WATER_SPLASH("splash", 5, false),
   WATER_WAKE("wake", 6, false),
   SUSPENDED("suspended", 7, false),
   SUSPENDED_DEPTH("depthsuspend", 8, false),
   CRIT("crit", 9, false),
   CRIT_MAGIC("magicCrit", 10, false),
   SMOKE_NORMAL("smoke", 11, false),
   SMOKE_LARGE("largesmoke", 12, false),
   SPELL("spell", 13, false),
   SPELL_INSTANT("instantSpell", 14, false),
   SPELL_MOB("mobSpell", 15, false),
   SPELL_MOB_AMBIENT("mobSpellAmbient", 16, false),
   SPELL_WITCH("witchMagic", 17, false),
   DRIP_WATER("dripWater", 18, false),
   DRIP_LAVA("dripLava", 19, false),
   VILLAGER_ANGRY("angryVillager", 20, false),
   VILLAGER_HAPPY("happyVillager", 21, false),
   TOWN_AURA("townaura", 22, false),
   NOTE("note", 23, false),
   PORTAL("portal", 24, false),
   ENCHANTMENT_TABLE("enchantmenttable", 25, false),
   FLAME("flame", 26, false),
   LAVA("lava", 27, false),
   FOOTSTEP("footstep", 28, false),
   CLOUD("cloud", 29, false),
   REDSTONE("reddust", 30, false),
   SNOWBALL("snowballpoof", 31, false),
   SNOW_SHOVEL("snowshovel", 32, false),
   SLIME("slime", 33, false),
   HEART("heart", 34, false),
   BARRIER("barrier", 35, false),
   ITEM_CRACK("iconcrack", 36, false, 2),
   BLOCK_CRACK("blockcrack", 37, false, 1),
   BLOCK_DUST("blockdust", 38, false, 1),
   WATER_DROP("droplet", 39, false),
   ITEM_TAKE("take", 40, false),
   MOB_APPEARANCE("mobappearance", 41, true),
   DRAGON_BREATH("dragonbreath", 42, false),
   END_ROD("endRod", 43, false),
   DAMAGE_INDICATOR("damageIndicator", 44, true),
   SWEEP_ATTACK("sweepAttack", 45, true),
   FALLING_DUST("fallingdust", 46, false, 1),
   TOTEM("totem", 47, false),
   SPIT("spit", 48, true);

   public static final abW[] VALUES = values();
   private final String particleName;
   private final int particleID;
   private final boolean shouldIgnoreRange;
   private final int argumentCount;
   private final BooleanSupplier visibilityFilter;
   private static final Int2ReferenceMap<abW> PARTICLES = new Int2ReferenceOpenHashMap(VALUES.length, 1.0F);
   private static final Map<String, abW> BY_NAME = new Object2ReferenceOpenHashMap(VALUES.length, 1.0F);

   private abW(String var3, int var4, boolean var5, int var6, BooleanSupplier var7) {
      this.particleName = var3;
      this.particleID = var4;
      this.shouldIgnoreRange = var5;
      this.argumentCount = var6;
      this.visibilityFilter = var7;
   }

   private abW(String var3, int var4, boolean var5, int var6) {
      this(var3, var4, var5, var6, () -> {
         return true;
      });
   }

   private abW(String var3, int var4, boolean var5) {
      this(var3, var4, var5, 0);
   }

   public static Set<String> a() {
      return BY_NAME.keySet();
   }

   public String a() {
      return this.particleName;
   }

   public int a() {
      return this.particleID;
   }

   public int getArgumentCount() {
      return this.argumentCount;
   }

   public boolean a() {
      return this.shouldIgnoreRange;
   }

   public boolean b() {
      return this.visibilityFilter.getAsBoolean();
   }

   public static abW a(int var0) {
      return (abW)PARTICLES.get(var0);
   }

   public static abW a(String var0) {
      return (abW)BY_NAME.get(var0);
   }

   static {
      abW[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         abW var3 = var0[var2];
         PARTICLES.put(var3.a(), var3);
         BY_NAME.put(var3.a(), var3);
      }

   }

   // $FF: synthetic method
   public int getId() {
      return this.a();
   }

   // $FF: synthetic method
   public String getName() {
      return this.a();
   }

   // $FF: synthetic method
   public boolean ignoresRange() {
      return this.a();
   }
}
