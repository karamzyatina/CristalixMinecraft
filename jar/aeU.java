import dev.xdark.clientapi.biome.Biome;
import dev.xdark.clientapi.biome.TemperatureCategory;
import java.util.Random;

public abstract class aeu implements Biome {
   protected static final sD a;
   protected static final sD b;
   protected static final sD c;
   protected static final sD d;
   public static final acA<aeu> a;
   protected static final afs a;
   protected static final afs b;
   public static final adq<acC, aeu> a;
   private final String a;
   private final float a;
   private final float b;
   private final float c;
   private final float d;
   private final int a;
   private final boolean a;
   private final boolean b;
   private final String b;

   public static int a(aeu var0) {
      return a.a(var0);
   }

   public static aeu a(int var0) {
      return (aeu)a.a(var0);
   }

   public static aeu a(aeu var0) {
      return (aeu)a.a(a(var0));
   }

   protected aeu(aev var1) {
      this.a = var1.a;
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.d = var1.d;
      this.a = var1.a;
      this.a = var1.a;
      this.b = var1.b;
      this.b = aev.a(var1);
   }

   public boolean a() {
      return this.b != null;
   }

   public int a(float var1) {
      var1 /= 3.0F;
      var1 = adh.a(var1, -1.0F, 1.0F);
      return adh.b(0.62222224F - var1 * 0.05F, 0.5F + var1 * 0.1F, 1.0F);
   }

   public boolean b() {
      return this.c();
   }

   public boolean canRain() {
      return !this.c() && this.b;
   }

   public boolean isHighHumidity() {
      return this.getRainfall() > 0.85F;
   }

   public float getTemperature(int var1, int var2, int var3) {
      if (var2 > 64) {
         float var4 = (float)(a.a((double)((float)var1 / 8.0F), (double)((float)var3 / 8.0F)) * 4.0D);
         return this.getDefaultTemperature() - (var4 + (float)var2 - 64.0F) * 0.05F / 30.0F;
      } else {
         return this.getDefaultTemperature();
      }
   }

   public final float a(acV var1) {
      return this.getTemperature(var1.a, var1.b, var1.c);
   }

   public int getGrassColorAtPos(int var1, int var2, int var3) {
      double var4 = (double)adh.a(this.getTemperature(var1, var2, var3), 0.0F, 1.0F);
      double var6 = (double)adh.a(this.getRainfall(), 0.0F, 1.0F);
      return adV.a(var4, var6);
   }

   public int a(acV var1) {
      return this.getGrassColorAtPos(var1.a, var1.b, var1.c);
   }

   public int getFoliageColorAtPos(int var1, int var2, int var3) {
      double var4 = (double)adh.a(this.getTemperature(var1, var2, var3), 0.0F, 1.0F);
      double var6 = (double)adh.a(this.getRainfall(), 0.0F, 1.0F);
      return adU.a(var4, var6);
   }

   public int b(acV var1) {
      return this.getFoliageColorAtPos(var1.a, var1.b, var1.c);
   }

   public aex a() {
      if ((double)this.getDefaultTemperature() < 0.2D) {
         return aex.COLD;
      } else {
         return (double)this.getDefaultTemperature() < 1.0D ? aex.MEDIUM : aex.WARM;
      }
   }

   public static aeu b(int var0) {
      return a(var0, (aeu)null);
   }

   public static aeu a(int var0, aeu var1) {
      aeu var2 = a(var0);
      return var2 == null ? var1 : var2;
   }

   public final float getBaseHeight() {
      return this.a;
   }

   public final float getRainfall() {
      return this.d;
   }

   public final String a() {
      return this.a;
   }

   public final float getHeightVariation() {
      return this.b;
   }

   public final float getDefaultTemperature() {
      return this.c;
   }

   public int getWaterColor() {
      return this.a;
   }

   public final boolean c() {
      return this.a;
   }

   public static void a() {
      a(0, (String)"ocean", new aeP((new aev("Ocean")).c(-1.0F).d(0.1F)));
      a(1, (String)"plains", new aeQ(false, (new aev("Plains")).c(0.125F).d(0.05F).a(0.8F).b(0.4F)));
      a(2, (String)"desert", new aeE((new aev("Desert")).c(0.125F).d(0.05F).a(2.0F).b(0.0F).a()));
      a(3, (String)"extreme_hills", new aeK(aeL.NORMAL, (new aev("Extreme Hills")).c(1.0F).d(0.5F).a(0.2F).b(0.3F)));
      a(4, (String)"forest", new aeG(aeH.NORMAL, (new aev("Forest")).a(0.7F).b(0.8F)));
      a(5, (String)"taiga", new aeX(aeY.NORMAL, (new aev("Taiga")).c(0.2F).d(0.2F).a(0.25F).b(0.8F)));
      a(6, (String)"swampland", new aeW((new aev("Swampland")).c(-0.2F).d(0.1F).a(0.8F).b(0.9F).a(14745518)));
      a(7, (String)"river", new aeR((new aev("River")).c(-0.5F).d(0.0F)));
      a(8, (String)"hell", new aeJ((new aev("Hell")).a(2.0F).b(0.0F).a()));
      a(9, (String)"sky", new aeF((new aev("The End")).a()));
      a(10, (String)"frozen_ocean", new aeP((new aev("FrozenOcean")).c(-1.0F).d(0.1F).a(0.0F).b(0.5F).b()));
      a(11, (String)"frozen_river", new aeR((new aev("FrozenRiver")).c(-0.5F).d(0.0F).a(0.0F).b(0.5F).b()));
      a(12, (String)"ice_flats", new aeU(false, (new aev("Ice Plains")).c(0.125F).d(0.05F).a(0.0F).b(0.5F).b()));
      a(13, (String)"ice_mountains", new aeU(false, (new aev("Ice Mountains")).c(0.45F).d(0.3F).a(0.0F).b(0.5F).b()));
      a(14, (String)"mushroom_island", new aeO((new aev("MushroomIsland")).c(0.2F).d(0.3F).a(0.9F).b(1.0F)));
      a(15, (String)"mushroom_island_shore", new aeO((new aev("MushroomIslandShore")).c(0.0F).d(0.025F).a(0.9F).b(1.0F)));
      a(16, (String)"beaches", new aey((new aev("Beach")).c(0.0F).d(0.025F).a(0.8F).b(0.4F)));
      a(17, (String)"desert_hills", new aeE((new aev("DesertHills")).c(0.45F).d(0.3F).a(2.0F).b(0.0F).a()));
      a(18, (String)"forest_hills", new aeG(aeH.NORMAL, (new aev("ForestHills")).c(0.45F).d(0.3F).a(0.7F).b(0.8F)));
      a(19, (String)"taiga_hills", new aeX(aeY.NORMAL, (new aev("TaigaHills")).a(0.25F).b(0.8F).c(0.45F).d(0.3F)));
      a(20, (String)"smaller_extreme_hills", new aeK(aeL.EXTRA_TREES, (new aev("Extreme Hills Edge")).c(0.8F).d(0.3F).a(0.2F).b(0.3F)));
      a(21, (String)"jungle", new aeM(false, (new aev("Jungle")).a(0.95F).b(0.9F)));
      a(22, (String)"jungle_hills", new aeM(false, (new aev("JungleHills")).c(0.45F).d(0.3F).a(0.95F).b(0.9F)));
      a(23, (String)"jungle_edge", new aeM(true, (new aev("JungleEdge")).a(0.95F).b(0.8F)));
      a(24, (String)"deep_ocean", new aeP((new aev("Deep Ocean")).c(-1.8F).d(0.1F)));
      a(25, (String)"stone_beach", new aeV((new aev("Stone Beach")).c(0.1F).d(0.8F).a(0.2F).b(0.3F)));
      a(26, (String)"cold_beach", new aey((new aev("Cold Beach")).c(0.0F).d(0.025F).a(0.05F).b(0.3F).b()));
      a(27, (String)"birch_forest", new aeG(aeH.BIRCH, (new aev("Birch Forest")).a(0.6F).b(0.6F)));
      a(28, (String)"birch_forest_hills", new aeG(aeH.BIRCH, (new aev("Birch Forest Hills")).c(0.45F).d(0.3F).a(0.6F).b(0.6F)));
      a(29, (String)"roofed_forest", new aeG(aeH.ROOFED, (new aev("Roofed Forest")).a(0.7F).b(0.8F)));
      a(30, (String)"taiga_cold", new aeX(aeY.NORMAL, (new aev("Cold Taiga")).c(0.2F).d(0.2F).a(-0.5F).b(0.4F).b()));
      a(31, (String)"taiga_cold_hills", new aeX(aeY.NORMAL, (new aev("Cold Taiga Hills")).c(0.45F).d(0.3F).a(-0.5F).b(0.4F).b()));
      a(32, (String)"redwood_taiga", new aeX(aeY.MEGA, (new aev("Mega Taiga")).a(0.3F).b(0.8F).c(0.2F).d(0.2F)));
      a(33, (String)"redwood_taiga_hills", new aeX(aeY.MEGA, (new aev("Mega Taiga Hills")).c(0.45F).d(0.3F).a(0.3F).b(0.8F)));
      a(34, (String)"extreme_hills_with_trees", new aeK(aeL.EXTRA_TREES, (new aev("Extreme Hills+")).c(1.0F).d(0.5F).a(0.2F).b(0.3F)));
      a(35, (String)"savanna", new aeS((new aev("Savanna")).c(0.125F).d(0.05F).a(1.2F).b(0.0F).a()));
      a(36, (String)"savanna_rock", new aeS((new aev("Savanna Plateau")).c(1.5F).d(0.025F).a(1.0F).b(0.0F).a()));
      a(37, (String)"mesa", new aeN(false, false, (new aev("Mesa")).a(2.0F).b(0.0F).a()));
      a(38, (String)"mesa_rock", new aeN(false, true, (new aev("Mesa Plateau F")).c(1.5F).d(0.025F).a(2.0F).b(0.0F).a()));
      a(39, (String)"mesa_clear_rock", new aeN(false, false, (new aev("Mesa Plateau")).c(1.5F).d(0.025F).a(2.0F).b(0.0F).a()));
      a(127, (String)"void", new aeZ((new aev("The Void")).a()));
      a(129, (String)"mutated_plains", new aeQ(true, (new aev("Sunflower Plains")).a("plains").c(0.125F).d(0.05F).a(0.8F).b(0.4F)));
      a(130, (String)"mutated_desert", new aeE((new aev("Desert M")).a("desert").c(0.225F).d(0.25F).a(2.0F).b(0.0F).a()));
      a(131, (String)"mutated_extreme_hills", new aeK(aeL.MUTATED, (new aev("Extreme Hills M")).a("extreme_hills").c(1.0F).d(0.5F).a(0.2F).b(0.3F)));
      a(132, (String)"mutated_forest", new aeG(aeH.FLOWER, (new aev("Flower Forest")).a("forest").d(0.4F).a(0.7F).b(0.8F)));
      a(133, (String)"mutated_taiga", new aeX(aeY.NORMAL, (new aev("Taiga M")).a("taiga").c(0.3F).d(0.4F).a(0.25F).b(0.8F)));
      a(134, (String)"mutated_swampland", new aeW((new aev("Swampland M")).a("swampland").c(-0.1F).d(0.3F).a(0.8F).b(0.9F).a(14745518)));
      a(140, (String)"mutated_ice_flats", new aeU(true, (new aev("Ice Plains Spikes")).a("ice_flats").c(0.425F).d(0.45000002F).a(0.0F).b(0.5F).b()));
      a(149, (String)"mutated_jungle", new aeM(false, (new aev("Jungle M")).a("jungle").c(0.2F).d(0.4F).a(0.95F).b(0.9F)));
      a(151, (String)"mutated_jungle_edge", new aeM(true, (new aev("JungleEdge M")).a("jungle_edge").c(0.2F).d(0.4F).a(0.95F).b(0.8F)));
      a(155, (String)"mutated_birch_forest", new aeI((new aev("Birch Forest M")).a("birch_forest").c(0.2F).d(0.4F).a(0.6F).b(0.6F)));
      a(156, (String)"mutated_birch_forest_hills", new aeI((new aev("Birch Forest Hills M")).a("birch_forest_hills").c(0.55F).d(0.5F).a(0.6F).b(0.6F)));
      a(157, (String)"mutated_roofed_forest", new aeG(aeH.ROOFED, (new aev("Roofed Forest M")).a("roofed_forest").c(0.2F).d(0.4F).a(0.7F).b(0.8F)));
      a(158, (String)"mutated_taiga_cold", new aeX(aeY.NORMAL, (new aev("Cold Taiga M")).a("taiga_cold").c(0.3F).d(0.4F).a(-0.5F).b(0.4F).b()));
      a(160, (String)"mutated_redwood_taiga", new aeX(aeY.MEGA_SPRUCE, (new aev("Mega Spruce Taiga")).a("redwood_taiga").c(0.2F).d(0.2F).a(0.25F).b(0.8F)));
      a(161, (String)"mutated_redwood_taiga_hills", new aeX(aeY.MEGA_SPRUCE, (new aev("Redwood Taiga Hills M")).a("redwood_taiga_hills").c(0.2F).d(0.2F).a(0.25F).b(0.8F)));
      a(162, (String)"mutated_extreme_hills_with_trees", new aeK(aeL.MUTATED, (new aev("Extreme Hills+ M")).a("extreme_hills_with_trees").c(1.0F).d(0.5F).a(0.2F).b(0.3F)));
      a(163, (String)"mutated_savanna", new aeT((new aev("Savanna M")).a("savanna").c(0.3625F).d(1.225F).a(1.1F).b(0.0F).a()));
      a(164, (String)"mutated_savanna_rock", new aeT((new aev("Savanna Plateau M")).a("savanna_rock").c(1.05F).d(1.2125001F).a(1.0F).b(0.0F).a()));
      a(165, (String)"mutated_mesa", new aeN(true, false, (new aev("Mesa (Bryce)")).a("mesa").a(2.0F).b(0.0F).a()));
      a(166, (String)"mutated_mesa_rock", new aeN(false, true, (new aev("Mesa Plateau F M")).a("mesa_rock").c(0.45F).d(0.3F).a(2.0F).b(0.0F).a()));
      a(167, (String)"mutated_mesa_clear_rock", new aeN(false, false, (new aev("Mesa Plateau M")).a("mesa_clear_rock").c(0.45F).d(0.3F).a(2.0F).b(0.0F).a()));
   }

   public static void a(int var0, acC var1, aeu var2) {
      a.a(var0, var1, var2);
      if (var2.a()) {
         a.a(var2, a((aeu)a.a(new acC(var2.b))));
      }

   }

   public static void a(int var0, String var1, aeu var2) {
      a.a(var0, new acC(var1), var2);
      if (var2.a()) {
         a.a(var2, a((aeu)a.a(new acC(var2.b))));
      }

   }

   static {
      a = RQ.b.a();
      b = afh.a;
      c = RQ.ab.a();
      d = RQ.a.a();
      a = new acA(21, 1.0F);
      a = new afs(new Random(1234L), 1);
      b = new afs(new Random(2345L), 1);
      a = new adq(62);
   }

   public int getSkyColorByTemperature(float var1) {
      return this.a(var1);
   }

   public boolean canSnow() {
      return this.c();
   }

   public TemperatureCategory getTempCategory() {
      return null;
   }

   public int getId() {
      return a(this);
   }

   public String getName() {
      return this.a();
   }
}
