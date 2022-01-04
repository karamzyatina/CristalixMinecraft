import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import dev.xdark.clientapi.renderer.block.model.ModelBakery;
import dev.xdark.clientapi.renderer.block.model.ModelBlockDefinition;
import dev.xdark.clientapi.renderer.block.model.ModelResourceLocation;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.feder.IOUtil;
import dev.xdark.feder.RecyclableArrayList;
import dev.xdark.feder.collection.CompactIterables;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.Logger;

public final class Dj implements ModelBakery {
   private static final Set<acC> a = Sets.newHashSet(new acC[]{new acC("blocks/water_flow"), new acC("blocks/water_still"), new acC("blocks/lava_flow"), new acC("blocks/lava_still"), new acC("blocks/water_overlay"), new acC("blocks/destroy_stage_0"), new acC("blocks/destroy_stage_1"), new acC("blocks/destroy_stage_2"), new acC("blocks/destroy_stage_3"), new acC("blocks/destroy_stage_4"), new acC("blocks/destroy_stage_5"), new acC("blocks/destroy_stage_6"), new acC("blocks/destroy_stage_7"), new acC("blocks/destroy_stage_8"), new acC("blocks/destroy_stage_9"), new acC("items/empty_armor_slot_helmet"), new acC("items/empty_armor_slot_chestplate"), new acC("items/empty_armor_slot_leggings"), new acC("items/empty_armor_slot_boots"), new acC("items/empty_armor_slot_shield"), new acC("blocks/shulker_top_white"), new acC("blocks/shulker_top_orange"), new acC("blocks/shulker_top_magenta"), new acC("blocks/shulker_top_light_blue"), new acC("blocks/shulker_top_yellow"), new acC("blocks/shulker_top_lime"), new acC("blocks/shulker_top_pink"), new acC("blocks/shulker_top_gray"), new acC("blocks/shulker_top_silver"), new acC("blocks/shulker_top_cyan"), new acC("blocks/shulker_top_purple"), new acC("blocks/shulker_top_blue"), new acC("blocks/shulker_top_brown"), new acC("blocks/shulker_top_green"), new acC("blocks/shulker_top_red"), new acC("blocks/shulker_top_black")});
   private static final Logger a;
   protected static final Dv a;
   private static final String a;
   private static final Map<String, String> a;
   private static final Joiner a;
   private final IN a;
   private final Map<acC, HK> b = new Object2ReferenceOpenHashMap(817, 1.0F);
   private final Map<acC, Dm> c = new Object2ReferenceOpenHashMap(1598, 1.0F);
   private final Map<Dv, DD> d = new Object2ObjectOpenHashMap(1979, 1.0F);
   private final Map<Dr, Collection<Dv>> e = new Object2ObjectOpenHashMap(31, 1.0F);
   private final HO a;
   private final AU a;
   private final ads<Dv, CV> a = new Dk(this);
   private static final String b;
   private static final Dm a;
   private static final Dm b;
   private final Map<String, acC> f = new Object2ObjectOpenHashMap(714, 1.0F);
   private final Map<acC, Dr> g = new Object2ObjectOpenHashMap(407, 1.0F);
   private final Map<SZ, List<String>> h = new Reference2ObjectOpenHashMap(47);
   private final Jc a;

   public Dj(IN var1, HO var2, AU var3, Jc var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
   }

   public ado<Dv, CV> a() {
      this.a();
      this.b();
      this.j();
      this.l();
      CompletableFuture.allOf(La.a(this::m), La.a(this::h)).join();
      this.i();
      return this.a;
   }

   private void a() {
      DW var1 = this.a.a();
      adr var2 = mY.a;
      Iterator var3 = var2.iterator();

      while(true) {
         nh var4;
         Set var5;
         int var6;
         do {
            if (!var3.hasNext()) {
               return;
            }

            var4 = (nh)var3.next();
            var5 = var1.a(var4);
            var6 = var5.size();
         } while(var6 == 0);

         Iterator var7 = var5.iterator();

         while(var6-- > 0) {
            acC var8 = (acC)var7.next();

            try {
               this.a(var1, var4, var8);
            } catch (Exception var10) {
               a.warn("Unable to load definition " + var8, var10);
            }
         }
      }
   }

   protected void a(DW var1, nh var2, acC var3) {
      Dr var4 = this.a(var3);
      Map var5 = var1.a(var2);
      if (var4.hasMultipartData()) {
         Collection var6 = var5.values();
         var4.a().a(var2.b());
         Object var7 = (Collection)this.e.get(var4);
         Stream var10000 = var6.stream();
         var3.getClass();
         List var8 = (List)var10000.filter(var3::equals).collect(Collectors.toCollection(() -> {
            return new ArrayList(var6.size());
         }));
         if (var7 == null) {
            var7 = var8;
         } else {
            ((Collection)var7).addAll(var8);
         }

         this.a((Dr)var4, (Collection)var7);
      }

      Set var15 = var5.entrySet();
      int var16 = var15.size();
      if (var16 != 0) {
         Iterator var17 = var15.iterator();
         Map var9 = this.d;

         while(true) {
            Dv var11;
            do {
               if (var16-- <= 0) {
                  return;
               }

               Entry var10 = (Entry)var17.next();
               var11 = (Dv)var10.getValue();
            } while(!var3.equals(var11));

            try {
               var9.put(var11, var4.a(var11.getVariant()));
            } catch (RuntimeException var13) {
               if (!var4.hasMultipartData()) {
                  a.warn("Unable to load variant: " + var11.getVariant() + " from " + var11, var13);
               }
            }
         }
      }
   }

   private void b() {
      this.d.put(a, new DD(Collections.singletonList(new DB(new acC(a.getPath()), Dw.X0_Y0, false, 1))));
      this.c();
      this.d();
      this.e();
      this.f();
      ajs.a(this.a, this.a);
      ajs.a(this);
   }

   private void c() {
      acC var1 = new acC("item_frame");
      Dr var2 = this.a(var1);
      this.a(var2, new Dv(var1, "normal"));
      this.a(var2, new Dv(var1, "map"));
   }

   public void a(Dr var1, Dv var2) {
      try {
         this.d.put(var2, var1.a(var2.getVariant()));
      } catch (RuntimeException var4) {
         if (!var1.hasMultipartData()) {
            a.warn("Unable to load variant: {} from {}", var2.getVariant(), var2);
         }
      }

   }

   private Dr a(acC var1) {
      acC var2 = this.a(var1);
      Dr var3 = (Dr)this.g.get(var2);
      if (var3 == null) {
         var3 = this.a(var1, var2);
         this.g.put(var2, var3);
      }

      return var3;
   }

   private Dr a(acC var1, acC var2) {
      try {
         return this.a.a(var2);
      } catch (IOException var4) {
         throw new RuntimeException("Encountered an exception when loading model definition of model " + var2 + "/" + var1, var4);
      }
   }

   private Dr a(acC var1, IM var2) {
      InputStream var3 = null;

      Dr var4;
      try {
         var3 = var2.getInputStream();
         var4 = Dr.a((Reader)(new InputStreamReader(var3, StandardCharsets.UTF_8)));
      } catch (Exception var9) {
         throw new RuntimeException("Encountered an exception when loading model definition of '" + var1 + "' from: '" + var2.a() + "' in resourcepack: '" + var2.a() + '\'', var9);
      } finally {
         IOUtil.closeQuietly(var3);
      }

      return var4;
   }

   private acC a(acC var1) {
      return new acC(var1.getNamespace(), "blockstates/" + var1.getPath() + ".json");
   }

   private void d() {
      Iterator var1 = this.d.entrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         this.a((Dv)var2.getKey(), (DD)var2.getValue());
      }

   }

   private void e() {
      Iterator var1 = this.e.entrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         Dv var3 = (Dv)((Collection)var2.getValue()).iterator().next();
         Set var4 = ((Dr)var2.getKey()).getMultipartVariants();
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            DD var6 = (DD)var5.next();
            this.a(var3, var6);
         }
      }

   }

   public void a(Dv var1, DD var2) {
      Iterator var3 = var2.a().iterator();

      while(var3.hasNext()) {
         DB var4 = (DB)var3.next();
         acC var5 = var4.a();
         if (this.c.get(var5) == null) {
            try {
               this.c.put(var5, this.b(var5));
            } catch (Exception var7) {
               a.warn("Unable to load block model: '{}' for variant: '{}': {} ", var5, var1, var7);
            }
         }
      }

   }

   private Dm b(acC var1) {
      String var3 = var1.getPath();
      if ("builtin/generated".equals(var3)) {
         return a;
      } else {
         Dm var2;
         if (!"builtin/entity".equals(var3)) {
            String var4;
            if (var3.startsWith("builtin/")) {
               var4 = var3.substring("builtin/".length());
               String var5 = (String)a.get(var4);
               if (var5 == null) {
                  throw new FileNotFoundException(var1.toString());
               }

               var2 = Dm.a((Reader)(new StringReader(var5)));
            } else {
               var1 = this.b(var1);
               var2 = this.a.a(var1);
            }

            var2.a = var1.toString();
            var4 = amj.a(var1.getPath());
            a(var2, var4);
            return var2;
         } else {
            var2 = b;
            return var2;
         }
      }
   }

   private acC b(acC var1) {
      String var2 = var1.getPath();
      if (!var2.startsWith("mcpatcher") && !var2.startsWith("optifine")) {
         return new acC(var1.getNamespace(), "models/" + var1.getPath() + ".json");
      } else {
         if (!var2.endsWith(".json")) {
            var1 = new acC(var1.getNamespace(), var2 + ".json");
         }

         return var1;
      }
   }

   private void f() {
      this.g();
      adq var1 = SZ.a;
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         SZ var3 = (SZ)var2.next();
         List var4 = this.a(var3);
         int var5 = 0;

         for(int var6 = var4.size(); var5 < var6; ++var5) {
            String var7 = (String)var4.get(var5);
            acC var8 = this.a(var7);
            acC var9 = var3.a();
            this.a(var7, var8, var9);
            if (var3.hasCustomProperties()) {
               Dm var10 = (Dm)this.c.get(var8);
               if (var10 != null) {
                  Collection var11 = var10.getOverrideLocations();
                  int var12 = var11.size();
                  if (var12 != 0) {
                     Iterator var13 = var11.iterator();

                     while(var12-- > 0) {
                        acC var14 = (acC)var13.next();
                        this.a(var14.toString(), var14, var9);
                     }
                  }
               }
            }
         }
      }

   }

   public void a(String var1, acC var2, acC var3) {
      this.f.put(var1, var2);
      if (this.c.get(var2) == null) {
         try {
            Dm var4 = this.b(var2);
            this.c.put(var2, var4);
         } catch (Exception var5) {
            a.error("Unable to load item model: '{}' for item: '{}'", var2, var3, var5);
         }
      }

   }

   private void g() {
      this.h.clear();
      this.h.put(SZ.a((nh)RQ.b), Arrays.asList("stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"));
      this.h.put(SZ.a((nh)RQ.c), Arrays.asList("dirt", "coarse_dirt", "podzol"));
      this.h.put(SZ.a((nh)RQ.e), Arrays.asList("oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"));
      this.h.put(SZ.a((nh)RQ.f), Arrays.asList("oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"));
      this.h.put(SZ.a((nh)RQ.a), Arrays.asList("sand", "red_sand"));
      this.h.put(SZ.a((nh)RQ.l), Arrays.asList("oak_log", "spruce_log", "birch_log", "jungle_log"));
      this.h.put(SZ.a((nh)RQ.a), Arrays.asList("oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"));
      this.h.put(SZ.a((nh)RQ.n), Arrays.asList("sponge", "sponge_wet"));
      this.h.put(SZ.a((nh)RQ.s), Arrays.asList("sandstone", "chiseled_sandstone", "smooth_sandstone"));
      this.h.put(SZ.a((nh)RQ.bG), Arrays.asList("red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"));
      this.h.put(SZ.a((nh)RQ.a), Arrays.asList("dead_bush", "tall_grass", "fern"));
      this.h.put(SZ.a((nh)RQ.a), Collections.singletonList("dead_bush"));
      this.h.put(SZ.a((nh)RQ.x), Arrays.asList("black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"));
      this.h.put(SZ.a((nh)RQ.a), Collections.singletonList("dandelion"));
      this.h.put(SZ.a((nh)RQ.b), Arrays.asList("poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"));
      this.h.put(SZ.a((nh)RQ.b), Arrays.asList("stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"));
      this.h.put(SZ.a((nh)RQ.f), Collections.singletonList("red_sandstone_slab"));
      this.h.put(SZ.a((nh)RQ.a), Arrays.asList("black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"));
      this.h.put(SZ.a((nh)RQ.as), Arrays.asList("stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"));
      this.h.put(SZ.a((nh)RQ.at), Arrays.asList("stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"));
      this.h.put(SZ.a((nh)RQ.d), Arrays.asList("oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"));
      this.h.put(SZ.a((nh)RQ.bf), Arrays.asList("cobblestone_wall", "mossy_cobblestone_wall"));
      this.h.put(SZ.a((nh)RQ.bi), Arrays.asList("anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"));
      this.h.put(SZ.a((nh)RQ.bo), Arrays.asList("quartz_block", "chiseled_quartz_block", "quartz_column"));
      this.h.put(SZ.a((nh)RQ.bs), Arrays.asList("black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"));
      this.h.put(SZ.a((nh)RQ.a), Arrays.asList("black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"));
      this.h.put(SZ.a((nh)RQ.b), Arrays.asList("acacia_leaves", "dark_oak_leaves"));
      this.h.put(SZ.a((nh)RQ.m), Arrays.asList("acacia_log", "dark_oak_log"));
      this.h.put(SZ.a((nh)RQ.bD), Arrays.asList("prismarine", "prismarine_bricks", "dark_prismarine"));
      this.h.put(SZ.a((nh)RQ.bw), Arrays.asList("black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"));
      this.h.put(SZ.a((nh)RQ.a), Arrays.asList("sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"));
      this.h.put(RT.j, Arrays.asList("coal", "charcoal"));
      this.h.put(RT.aG, Arrays.asList("cod", "salmon", "clownfish", "pufferfish"));
      this.h.put(RT.aH, Arrays.asList("cooked_cod", "cooked_salmon"));
      this.h.put(RT.aI, Arrays.asList("dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"));
      this.h.put(RT.a, Collections.singletonList("bottle_drinkable"));
      this.h.put(RT.bG, Arrays.asList("skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper", "skull_dragon"));
      this.h.put(RT.b, Collections.singletonList("bottle_splash"));
      this.h.put(RT.c, Collections.singletonList("bottle_lingering"));
      this.h.put(SZ.a((nh)RQ.cE), Arrays.asList("black_concrete", "red_concrete", "green_concrete", "brown_concrete", "blue_concrete", "purple_concrete", "cyan_concrete", "silver_concrete", "gray_concrete", "pink_concrete", "lime_concrete", "yellow_concrete", "light_blue_concrete", "magenta_concrete", "orange_concrete", "white_concrete"));
      this.h.put(SZ.a((nh)RQ.cF), Arrays.asList("black_concrete_powder", "red_concrete_powder", "green_concrete_powder", "brown_concrete_powder", "blue_concrete_powder", "purple_concrete_powder", "cyan_concrete_powder", "silver_concrete_powder", "gray_concrete_powder", "pink_concrete_powder", "lime_concrete_powder", "yellow_concrete_powder", "light_blue_concrete_powder", "magenta_concrete_powder", "orange_concrete_powder", "white_concrete_powder"));
      this.h.put(SZ.a((nh)RQ.a), Collections.emptyList());
      this.h.put(SZ.a((nh)RQ.aC), Collections.singletonList("oak_fence_gate"));
      this.h.put(SZ.a((nh)RQ.af), Collections.singletonList("oak_fence"));
      this.h.put(RT.Y, Collections.singletonList("oak_door"));
      this.h.put(RT.am, Collections.singletonList("oak_boat"));
      this.h.put(RT.cv, Collections.singletonList("totem"));
   }

   private List<String> a(SZ var1) {
      List var2 = (List)this.h.get(var1);
      if (var2 == null) {
         var2 = Collections.singletonList(var1.a().toString());
      }

      return var2;
   }

   private acC a(String var1) {
      acC var2 = new acC(var1);
      return new acC(var2.getNamespace(), "item/" + var2.getPath());
   }

   private void h() {
      ads var1 = this.a;
      Iterator var2 = this.d.entrySet().iterator();

      Entry var3;
      while(var2.hasNext()) {
         var3 = (Entry)var2.next();
         Dv var4 = (Dv)var3.getKey();
         CV var5 = this.a((DD)((DD)var3.getValue()), (String)"", (acC)var4);
         if (var5 != null) {
            var1.a(var4, var5);
         }
      }

      var2 = this.e.entrySet().iterator();

      while(var2.hasNext()) {
         var3 = (Entry)var2.next();
         Dr var13 = (Dr)var3.getKey();
         DQ var14 = var13.a();
         acC var6 = var14.a().a().a();
         Dy var7 = new Dy();
         List var8 = var14.getSelectors();
         int var9 = 0;

         for(int var10 = var8.size(); var9 < var10; ++var9) {
            DS var11 = (DS)var8.get(var9);
            CV var12 = this.a(var11.a(), "selector of ", var6);
            if (var12 != null) {
               var7.a(var11.a(var14.a()), var12);
            }
         }

         CV var15 = var7.a();
         Iterator var16 = ((Collection)var3.getValue()).iterator();

         while(var16.hasNext()) {
            Dv var17 = (Dv)var16.next();
            if (!var13.hasVariant(var17.getVariant())) {
               var1.a(var17, var15);
            }
         }
      }

   }

   private CV a(DD var1, String var2, acC var3) {
      List var4 = var1.a();
      if (var4.isEmpty()) {
         return null;
      } else {
         DG var5 = new DG();
         int var6 = 0;
         Map var7 = this.c;
         int var8 = 0;

         for(int var9 = var4.size(); var8 < var9; ++var8) {
            DB var10 = (DB)var4.get(var8);
            Dm var11 = (Dm)var7.get(var10.a());
            if (var11 != null && var11.isResolved()) {
               if (var11.getElements().isEmpty()) {
                  a.warn("Missing elements for: {}{}", var2, var3);
               } else {
                  CV var12 = this.a(var11, var10.a(), var10.a());
                  if (var12 != null) {
                     ++var6;
                     var5.a(var12, var10.getWeight());
                  }
               }
            } else {
               a.warn("Missing model for: {}{}", var2, var3);
            }
         }

         Object var13 = null;
         if (var6 == 0) {
            a.warn("No weighted models for: {}{}", var2, var3);
         } else if (var6 == 1) {
            var13 = var5.a();
         } else {
            var13 = var5.a();
         }

         return (CV)var13;
      }
   }

   private void i() {
      Map var1 = this.c;
      ads var2 = this.a;
      Iterator var3 = this.f.entrySet().iterator();

      while(true) {
         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            acC var5 = (acC)var4.getValue();
            Dm var6 = (Dm)var1.get(var5);
            if (var6 != null && var6.isResolved()) {
               if (var6.getElements().isEmpty()) {
                  a.warn("Missing elements for: {}", var5);
               } else if (this.b(var6)) {
                  Dv var7 = new Dv((String)var4.getKey(), "inventory");
                  var2.a(var7, new CN(var6.a(), var6.a()));
               } else {
                  CV var9 = this.a(var6, Dw.X0_Y0, false);
                  if (var9 != null) {
                     Dv var8 = new Dv((String)var4.getKey(), "inventory");
                     var2.a(var8, var9);
                  }
               }
            } else {
               a.warn("Missing model for: {}", var5);
            }
         }

         return;
      }
   }

   private Set<acC> a() {
      HashSet var1 = new HashSet(480, 1.0F);
      Map var2 = this.d;
      Map var3 = this.c;
      RecyclableArrayList var4 = RecyclableArrayList.newInstance(var2.keySet());
      int var5 = 0;

      int var6;
      int var10;
      for(var6 = var4.size(); var5 < var6; ++var5) {
         Dv var7 = (Dv)var4.get(var5);
         DD var8 = (DD)var2.get(var7);
         List var9 = var8.a();
         var10 = 0;

         for(int var11 = var9.size(); var10 < var11; ++var10) {
            DB var12 = (DB)var9.get(var10);
            Dm var13 = (Dm)var3.get(var12.a());
            if (var13 == null) {
               a.warn("Missing model for: {}", var7);
            } else {
               var1.addAll(this.a(var13));
            }
         }
      }

      var4.recycle();
      Set var18 = this.e.keySet();
      var6 = var18.size();
      Iterator var19 = var18.iterator();

      while(true) {
         Dr var20;
         Set var21;
         do {
            if (var6-- <= 0) {
               var1.addAll(a);
               return var1;
            }

            var20 = (Dr)var19.next();
            var21 = var20.a().getVariants();
            var10 = var21.size();
         } while(var10 == 0);

         Iterator var22 = var21.iterator();

         while(var10-- > 0) {
            DD var23 = (DD)var22.next();
            List var24 = var23.a();
            int var14 = 0;

            for(int var15 = var24.size(); var14 < var15; ++var14) {
               DB var16 = (DB)var24.get(var14);
               Dm var17 = (Dm)var3.get(var16.a());
               if (var17 == null) {
                  a.warn("Missing model for: {}", var20.a().a().a().a());
               } else {
                  var1.addAll(this.a(var17));
               }
            }
         }
      }
   }

   protected CV a(Dm var1, Dw var2, boolean var3) {
      Map var4 = this.b;
      HK var5 = (HK)var4.get(var1.a("particle"));
      List var6 = var1.getElements();
      int var7 = var6.size();
      if (var7 == 0) {
         return null;
      } else {
         DA var8 = (new DA(this.a, var1, var1.a())).a(var5);

         for(int var9 = 0; var9 < var7; ++var9) {
            CH var10 = (CH)var6.get(var9);
            Set var11 = var10.a.entrySet();
            int var12 = var11.size();
            if (var12 != 0) {
               Iterator var13 = var11.iterator();

               while(var12-- > 0) {
                  Entry var14 = (Entry)var13.next();
                  abP var15 = (abP)var14.getKey();
                  CK var16 = (CK)var14.getValue();
                  HK var17 = (HK)var4.get(var1.a(var16.a));
                  CD var18 = this.a(var10, var16, var17, var15, var2, var3);
                  if (var16.b != null) {
                     var8.a(var2.b(var16.b), var18);
                  } else {
                     var8.a(var18);
                  }
               }
            }
         }

         return var8.a();
      }
   }

   private CD a(CH var1, CK var2, HK var3, abP var4, Dw var5, boolean var6) {
      return CO.a(this.a, var1.a, var1.b, var2, var3, var4, var5, var1.a, var6, var1.a);
   }

   private void j() {
      this.k();
      Map var1 = this.c;
      Iterator var2 = var1.values().iterator();

      while(var2.hasNext()) {
         Dm var3 = (Dm)var2.next();
         var3.getParentFromMap(var1);
      }

   }

   private void k() {
      Map var1 = this.c;
      ArrayDeque var2 = new ArrayDeque();
      Set var3 = var1.keySet();
      int var4 = var3.size();
      HashSet var5 = new HashSet(var4, 1.0F);
      Iterator var6 = var3.iterator();

      acC var7;
      while(var4-- > 0) {
         var7 = (acC)var6.next();
         var5.add(var7);
         this.a((Deque)var2, (Set)var5, (Dm)((Dm)var1.get(var7)));
      }

      while((var7 = (acC)var2.poll()) != null) {
         if (var1.get(var7) == null) {
            try {
               Dm var8 = this.b(var7);
               var1.put(var7, var8);
               this.a((Deque)var2, (Set)var5, (Dm)var8);
            } catch (Exception var9) {
               a.warn("In parent chain: {}; unable to load model: '{}'", a.join(this.a(var7)), var7);
            }

            var5.add(var7);
         }
      }

   }

   private void a(Deque<acC> var1, Set<acC> var2, Dm var3) {
      acC var4 = var3.a();
      if (var4 != null && !var2.contains(var4)) {
         var1.add(var4);
      }

   }

   private List<acC> a(acC var1) {
      ArrayList var2 = CompactIterables.newArrayList(var1);
      acC var3 = var1;

      while((var3 = this.c(var3)) != null) {
         var2.add(0, var3);
      }

      return var2;
   }

   private acC c(acC var1) {
      Iterator var2 = this.c.entrySet().iterator();

      Entry var3;
      Dm var4;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (Entry)var2.next();
         var4 = (Dm)var3.getValue();
      } while(var4 == null || !var1.equals(var4.a()));

      return (acC)var3.getKey();
   }

   private Set<acC> a(Dm var1) {
      HashSet var2 = new HashSet();
      List var3 = var1.getElements();
      int var4 = 0;

      for(int var5 = var3.size(); var4 < var5; ++var4) {
         CH var6 = (CH)var3.get(var4);
         Iterator var7 = var6.a.values().iterator();

         while(var7.hasNext()) {
            CK var8 = (CK)var7.next();
            acC var9 = var1.a(var8.a);
            var2.add(var9);
         }
      }

      var2.add(var1.a("particle"));
      return var2;
   }

   private void l() {
      Set var1 = this.a();
      var1.addAll(this.b());
      var1.remove(HO.a);
      Dl var2 = new Dl(this, var1);
      this.a.a((IN)this.a, (Hz)var2);
      this.b.put(MI.a, this.a.a());
   }

   private Set<acC> b() {
      HashSet var1 = new HashSet();
      Iterator var2 = this.f.values().iterator();

      while(true) {
         while(true) {
            Dm var4;
            do {
               if (!var2.hasNext()) {
                  return var1;
               }

               acC var3 = (acC)var2.next();
               var4 = (Dm)this.c.get(var3);
            } while(var4 == null);

            var1.add(var4.a("particle"));
            Iterator var5;
            if (this.a(var4)) {
               var5 = Da.a.iterator();

               while(var5.hasNext()) {
                  String var10 = (String)var5.next();
                  var1.add(var4.a(var10));
               }
            } else if (!this.b(var4)) {
               var5 = var4.getElements().iterator();

               while(var5.hasNext()) {
                  CH var6 = (CH)var5.next();
                  Iterator var7 = var6.a.values().iterator();

                  while(var7.hasNext()) {
                     CK var8 = (CK)var7.next();
                     acC var9 = var4.a(var8.a);
                     var1.add(var9);
                  }
               }
            }
         }
      }
   }

   private boolean a(Dm var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.a() == a;
      }
   }

   private boolean b(Dm var1) {
      if (var1 == null) {
         return false;
      } else {
         Dm var2 = var1.a();
         return var2 == b;
      }
   }

   private void m() {
      Iterator var1 = this.f.values().iterator();

      while(var1.hasNext()) {
         acC var2 = (acC)var1.next();
         Dm var3 = (Dm)this.c.get(var2);
         if (this.a(var3)) {
            Dm var4 = this.a(var3);
            if (var4 != null) {
               var4.a = var2.toString();
            }

            this.c.put(var2, var4);
         } else if (this.b(var3)) {
            this.c.put(var2, var3);
         }
      }

      var1 = this.b.values().iterator();

      while(var1.hasNext()) {
         HK var5 = (HK)var1.next();
         if (!var5.hasAnimationMetadata()) {
            var5.clearFramesTextureData();
         }
      }

   }

   private Dm a(Dm var1) {
      return Da.a(this.a, var1);
   }

   public Dm a(acC var1) {
      return (Dm)this.c.get(var1);
   }

   public static void a(Dm var0, String var1) {
      acC var2 = a(var0.a, var1);
      if (var2 != var0.a) {
         var0.a = var2;
      }

      if (var0.a != null) {
         Iterator var3 = var0.a.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            String var5 = (String)var4.getValue();
            String var6 = a(var5, var1);
            if (var6 != var5) {
               var4.setValue(var6);
            }
         }
      }

   }

   public static acC a(acC var0, String var1) {
      if (var0 != null && var1 != null) {
         if (!var0.getNamespace().equals("minecraft")) {
            return var0;
         } else {
            String var2 = var0.getPath();
            String var3 = a(var2, var1);
            if (var3 != var2) {
               var0 = new acC(var0.getNamespace(), var3);
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   private static String a(String var0, String var1) {
      var0 = amj.a(var0, var1);
      var0 = ami.b(var0, ".json");
      var0 = ami.b(var0, ".png");
      return var0;
   }

   public void a(Dr var1, Collection<Dv> var2) {
      this.e.put(var1, var2);
   }

   // $FF: synthetic method
   static Map a(Dj var0) {
      return var0.b;
   }

   static {
      a = sE.a;
      a = new Dv("builtin/missing", "missing");
      a = "{    'textures': {       'particle': 'missingno',       'missingno': 'missingno'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}".replaceAll("'", "\"");
      a = new Object2ObjectOpenHashMap(1, 1.0F);
      a = Joiner.on(" -> ");
      b = "{    'elements': [        {   'from': [0, 0, 0],            'to': [16, 16, 16],            'faces': {                'down': {'uv': [0, 0, 16, 16], 'texture': '' }            }        }    ]}".replaceAll("'", "\"");
      a = Dm.a(b);
      b = Dm.a(b);
      a.put("missing", a);
      a.a = "generation marker";
      b.a = "block entity marker";
   }

   public void registerVariant(ModelBlockDefinition var1, ModelResourceLocation var2) {
      this.a((Dr)d.a(var1), (Dv)d.a(var2));
   }

   public void loadVariantList(ModelResourceLocation var1, List var2) {
      this.a((Dv)d.a(var1), new DD(var2));
   }

   public void loadItemModel(String var1, ResourceLocation var2, ResourceLocation var3) {
      this.a(var1, (acC)d.a(var2), (acC)d.a(var3));
   }

   public void registerMultipartVariant(ModelBlockDefinition var1, Collection var2) {
      this.a((Dr)d.a(var1), var2);
   }
}
