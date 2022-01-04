import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.item.Item;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.render.FontRenderer;
import dev.xdark.clientapi.render.RenderItem;
import dev.xdark.clientapi.render.model.ItemCameraTransforms.Type;
import dev.xdark.feder.UUIDConversionUtil;
import java.util.List;
import java.util.UUID;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class Cp implements IO, RenderItem {
   public float a;
   private final Cf a;
   private final HM a;
   private final EP a;
   private acC a = null;
   private boolean a = false;
   public Du a = null;
   private boolean b = false;
   private boolean c = false;
   private final sE a;
   private final Cw a;

   public Cp(sE var1, HM var2, Du var3, EP var4) {
      this.a = var2;
      this.a = var3;
      this.a = new Cf(var3);
      this.a = var4;
      this.a = var1;
      this.a = var1.a;
   }

   public Cf a() {
      return this.a;
   }

   public void a(SZ var1, int var2, String var3) {
      this.a.a(var1, var2, new Dv(var3, "inventory"));
   }

   public void a(nh var1, int var2, String var3) {
      this.a(SZ.a(var1), var2, var3);
   }

   public void a(nh var1, String var2) {
      this.a((nh)var1, 0, (String)var2);
   }

   public void a(SZ var1, String var2) {
      this.a((SZ)var1, 0, (String)var2);
   }

   private void a(CV var1, Vh var2) {
      this.a(var1, La.a(var2), var2);
   }

   public void a(CV var1, int var2) {
      this.a(var1, var2, Vh.a);
   }

   private void a(CV var1, int var2, Vh var3) {
      Cw var4 = this.a;
      Bh var5 = var4.a();
      boolean var6 = this.a.a().isTextureBound();
      boolean var7 = afT.O() && var6;
      if (var7) {
         var5.a(abu.SOLID);
      }

      var5.a(7, In.b);
      this.a(var5, var1, var2, var3);
      var4.draw();
      if (var7) {
         var5.a((abu)null);
         By.H();
      }

   }

   public void a(Bh var1, CV var2, int var3, Vh var4) {
      this.b(var1, var2, var3, var4);
   }

   public void b(Bh var1, CV var2, int var3, Vh var4) {
      abP[] var5 = abP.VALUES;
      int var6 = var5.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         abP var8 = var5[var7];
         this.a(var1, var2.b((sD)null, var8, 0L), var3, var4);
      }

      this.a(var1, var2.b((sD)null, (abP)null, 0L), var3, var4);
   }

   public void a(Vh var1, CV var2) {
      CallbackInfo var6 = new CallbackInfo("renderItem", true);
      this.a(var1, var2, var6);
      if (!var6.isCancelled()) {
         if (!var1.isEmpty()) {
            By.C();
            By.c(-0.5F, -0.5F, -0.5F);
            if (var2.isBuiltInRenderer()) {
               By.c(1.0F, 1.0F, 1.0F, 1.0F);
               By.z();
               this.a.a.a(var1);
            } else {
               var2 = ajs.a(var1, var2, this.a, false);
               this.a = null;
               this.b = false;
               this.a(var2, var1);
               if (this.b) {
                  float var3 = Ci.a;
                  float var4 = Ci.b;
                  Ci.a(Ci.o, 240.0F, var4);
                  this.c = true;
                  this.a(var2, var1);
                  this.c = false;
                  Ci.a(Ci.o, var3, var4);
               }

               boolean var7 = var1.hasEffect();
               VR var8 = var1.a();
               int var5;
               if (var8 != null && var8.a("glow_color", (int)99)) {
                  var5 = var8.getInteger("glow_color");
                  var7 = true;
               } else {
                  var5 = -8372020;
               }

               if (var7 && !ajs.a(this.a, this, var1, var2)) {
                  this.a(var1, var2, var5);
               }
            }

            By.D();
         }

      }
   }

   public void a(Vh var1, CV var2, int var3) {
      if (ajs.a() && (!afT.ad() || !akC.c)) {
         By.a(false);
         By.c(514);
         By.f();
         By.a(BU.SRC_COLOR, BL.ONE);
         this.a.a(LO.a(var1));
         if (afT.ad() && !this.a) {
            akF.g(this.a);
         }

         By.l(5890);
         By.C();
         By.b(8.0F, 8.0F, 8.0F);
         long var4 = sE.a();
         float var6 = (float)(var4 % 3000L) / 3000.0F / 8.0F;
         By.c(var6, 0.0F, 0.0F);
         By.b(-50.0F, 0.0F, 0.0F, 1.0F);
         this.a(var2, var3);
         By.D();
         By.C();
         By.b(8.0F, 8.0F, 8.0F);
         float var7 = (float)(var4 % 4873L) / 4873.0F / 8.0F;
         By.c(-var7, 0.0F, 0.0F);
         By.b(10.0F, 0.0F, 0.0F, 1.0F);
         this.a(var2, var3);
         By.D();
         By.l(5888);
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA);
         By.e();
         By.c(515);
         By.a(true);
         this.a.a(HO.a);
         if (afT.ad() && !this.a) {
            akF.h(this.a);
         }
      }

   }

   private static void a(Bh var0, CD var1) {
      adn var2 = var1.a().a();
      var0.putNormal((float)var2.a, (float)var2.b, (float)var2.c);
   }

   private void a(Bh var1, CD var2, int var3) {
      CD var4 = var2.a();
      if (this.c) {
         if (var4 == null) {
            return;
         }

         var2 = var4;
      } else if (var4 != null) {
         this.b = true;
      }

      if (var1.a()) {
         var1.addVertexData(var2.getVertexDataSingle());
      } else {
         var1.addVertexData(var2.getVertexData());
      }

      var1.a(var2.a());
      var1.putColor4(var3);
      a(var1, var2);
   }

   private void a(Bh var1, List<CD> var2, int var3, Vh var4) {
      boolean var5 = var3 == -1 && !var4.isEmpty();
      int var6 = 0;

      for(int var7 = var2.size(); var6 < var7; ++var6) {
         CD var8 = (CD)var2.get(var6);
         int var9 = var3;
         if (var5 && var8.hasTintIndex()) {
            var9 = this.a.a(var4, var8.getTintIndex());
            var9 = La.a(var9);
         }

         this.a(var1, var8, var9);
      }

      La.a((Object)var2);
   }

   public boolean a(Vh var1) {
      CV var2 = this.a.a(var1);
      return var2 != null && var2.isGui3d();
   }

   public void a(Vh var1, CZ var2) {
      if (!var1.isEmpty()) {
         CV var3 = this.a(var1, (aej)null, (Oh)null);
         this.a(var1, var3, var2, false);
      }

   }

   public CV a(Vh var1, aej var2, Oh var3) {
      Cf var4 = this.a;
      CV var5 = var4.a(var1);
      SZ var6 = var1.a();
      if (var6 != null && var6.hasCustomProperties()) {
         this.a = var5.a().a(var1, var2, var3);
      }

      CV var7 = ajs.a(var1, var5, this.a, true);
      if (var7 != var5) {
         return var7;
      } else if (var6 != null && var6.hasCustomProperties()) {
         acC var8 = var5.a().a(var1, var2, var3);
         return var8 == null ? var5 : var4.a().a(new Dv(var8, "inventory"));
      } else {
         return var5;
      }
   }

   public void a(Vh var1, Oh var2, CZ var3, boolean var4) {
      if (!var1.isEmpty() && var2 != null) {
         CV var5 = this.a(var1, var2.a, var2);
         this.a(var1, var5, var3, var4);
      }

   }

   protected void a(Vh var1, CV var2, CZ var3, boolean var4) {
      if (!var1.isEmpty()) {
         this.a.a(HO.a);
         HO.a.a().setBlurMipmap(false, false);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.z();
         By.a(516, 0.1F);
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         By.C();
         CW var5 = var2.a();
         CW.a(var5.a(var3), var4);
         if (this.a(var5.a(var3))) {
            By.a(BI.FRONT);
         }

         ajs.a(var4);
         this.a(var1, var2);
         ajs.a(false);
         By.a(BI.BACK);
         By.D();
         By.A();
         By.k();
         this.a.a(HO.a);
         HO.a.a().restoreLastBlurMipmap();
      }

   }

   private boolean a(Dh var1) {
      return var1.c.x < 0.0F ^ var1.c.y < 0.0F ^ var1.c.z < 0.0F;
   }

   public void a(Vh var1, int var2, int var3) {
      this.a(var1, var2, var3, this.a(var1, (aej)null, (Oh)null));
   }

   protected void a(Vh var1, int var2, int var3, CV var4) {
      this.a = true;
      By.C();
      this.a.a(HO.a);
      HO.a.a().setBlurMipmap(false, false);
      By.z();
      By.d();
      By.a(516, 0.1F);
      By.l();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a(var2, var3, var4.isGui3d());
      var4.a().a(CZ.GUI);
      this.a(var1, var4);
      By.c();
      By.A();
      By.f();
      By.D();
      this.a.a(HO.a);
      HO.a.a().restoreLastBlurMipmap();
      this.a = false;
   }

   private void a(int var1, int var2, boolean var3) {
      By.c((float)var1, (float)var2, 100.0F + this.a);
      By.c(8.0F, 8.0F, 0.0F);
      By.b(1.0F, -1.0F, 1.0F);
      By.b(16.0F, 16.0F, 16.0F);
      if (var3) {
         By.e();
      } else {
         By.f();
      }

   }

   public void b(Vh var1, int var2, int var3) {
      this.a((Oh)this.a.a, var1, var2, var3);
   }

   public void a(Oh var1, Vh var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         this.a += 50.0F;

         try {
            this.a(var2, var3, var4, this.a(var2, (aej)null, (Oh)var1));
         } catch (Throwable var8) {
            Kn var6 = Kn.a(var8, "Rendering item");
            Ku var7 = var6.a("Item being rendered");
            var7.a((String)"Item Type", (KB)(new Cq(this, var2)));
            var7.a((String)"Item Aux", (KB)(new Cr(this, var2)));
            var7.a((String)"Item NBT", (KB)(new Cs(this, var2)));
            var7.a((String)"Item Foil", (KB)(new Ct(this, var2)));
            throw new acB(var6);
         }

         this.a -= 50.0F;
      }

   }

   public void a(tI var1, Vh var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, (String)null);
   }

   public void a(tI var1, Vh var2, int var3, int var4, String var5) {
      if (!var2.isEmpty()) {
         int var6 = var2.d();
         if (var6 != 1 || var5 != null) {
            String var7 = var5 == null ? acm.a(var6) : var5;
            By.f();
            By.i();
            By.k();
            var1.drawStringWithShadow(var7, (float)(var3 + 19 - 2 - var1.getStringWidth(var7)), (float)(var4 + 6 + 3), 16777215);
            By.e();
            By.j();
            By.l();
         }

         if (var2.isItemDamaged()) {
            By.f();
            By.i();
            By.w();
            By.c();
            By.k();
            Cw var14 = this.a;
            Bh var8 = var14.a();
            float var9 = (float)var2.getItemDamage();
            float var10 = (float)var2.getMaxDamage();
            float var11 = Math.max(0.0F, (var10 - var9) / var10);
            int var12 = Math.round(13.0F - var9 * 13.0F / var10);
            int var13 = adh.b(var11 / 3.0F, 1.0F, 1.0F);
            if (afT.V()) {
               var13 = agd.a(var11, var13);
            }

            if (afT.V()) {
               var13 = agd.a(var11, var13);
            }

            this.a(var8, var3 + 2, var4 + 13, 13, 2, 0, 0, 0, 255);
            this.a(var8, var3 + 2, var4 + 13, var12, 1, var13 >> 16 & 255, var13 >> 8 & 255, var13 & 255, 255);
            By.l();
            By.d();
            By.v();
            By.e();
            By.j();
         }

         tE var15 = this.a.a;
         float var16 = var15 == null ? 0.0F : var15.b().a(var2.a(), this.a.a());
         if (var16 > 0.0F) {
            By.f();
            By.i();
            By.w();
            Bh var17 = this.a.a();
            this.a(var17, var3, var4 + adh.a(16.0F * (1.0F - var16)), 16, adh.b(16.0F * var16), 255, 255, 255, 127);
            By.v();
            By.e();
            By.j();
         }
      }

   }

   private void a(Bh var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.a(7, In.f);
      var1.a((double)var2, (double)var3, 0.0D).a(var6, var7, var8, var9).endVertex();
      var1.a((double)var2, (double)(var3 + var5), 0.0D).a(var6, var7, var8, var9).endVertex();
      var1.a((double)(var2 + var4), (double)(var3 + var5), 0.0D).a(var6, var7, var8, var9).endVertex();
      var1.a((double)(var2 + var4), (double)var3, 0.0D).a(var6, var7, var8, var9).endVertex();
      this.a.draw();
   }

   public void a() {
      this.a((nh)RQ.bi, (String)"anvil_intact");
      this.a((nh)RQ.bi, 1, (String)"anvil_slightly_damaged");
      this.a((nh)RQ.bi, 2, (String)"anvil_very_damaged");
      this.a((nh)RQ.bw, SW.BLACK.a(), (String)"black_carpet");
      this.a((nh)RQ.bw, SW.BLUE.a(), (String)"blue_carpet");
      this.a((nh)RQ.bw, SW.BROWN.a(), (String)"brown_carpet");
      this.a((nh)RQ.bw, SW.CYAN.a(), (String)"cyan_carpet");
      this.a((nh)RQ.bw, SW.GRAY.a(), (String)"gray_carpet");
      this.a((nh)RQ.bw, SW.GREEN.a(), (String)"green_carpet");
      this.a((nh)RQ.bw, SW.LIGHT_BLUE.a(), (String)"light_blue_carpet");
      this.a((nh)RQ.bw, SW.LIME.a(), (String)"lime_carpet");
      this.a((nh)RQ.bw, SW.MAGENTA.a(), (String)"magenta_carpet");
      this.a((nh)RQ.bw, SW.ORANGE.a(), (String)"orange_carpet");
      this.a((nh)RQ.bw, SW.PINK.a(), (String)"pink_carpet");
      this.a((nh)RQ.bw, SW.PURPLE.a(), (String)"purple_carpet");
      this.a((nh)RQ.bw, SW.RED.a(), (String)"red_carpet");
      this.a((nh)RQ.bw, SW.SILVER.a(), (String)"silver_carpet");
      this.a((nh)RQ.bw, SW.WHITE.a(), (String)"white_carpet");
      this.a((nh)RQ.bw, SW.YELLOW.a(), (String)"yellow_carpet");
      this.a((nh)RQ.bf, rW.MOSSY.a(), (String)"mossy_cobblestone_wall");
      this.a((nh)RQ.bf, rW.NORMAL.a(), (String)"cobblestone_wall");
      this.a((nh)RQ.c, nS.COARSE_DIRT.a(), (String)"coarse_dirt");
      this.a((nh)RQ.c, nS.DIRT.a(), (String)"dirt");
      this.a((nh)RQ.c, nS.PODZOL.a(), (String)"podzol");
      this.a((nh)RQ.a, oa.FERN.a(), (String)"double_fern");
      this.a((nh)RQ.a, oa.GRASS.a(), (String)"double_grass");
      this.a((nh)RQ.a, oa.PAEONIA.a(), (String)"paeonia");
      this.a((nh)RQ.a, oa.ROSE.a(), (String)"double_rose");
      this.a((nh)RQ.a, oa.SUNFLOWER.a(), (String)"sunflower");
      this.a((nh)RQ.a, oa.SYRINGA.a(), (String)"syringa");
      this.a((nh)RQ.a, pQ.BIRCH.a(), (String)"birch_leaves");
      this.a((nh)RQ.a, pQ.JUNGLE.a(), (String)"jungle_leaves");
      this.a((nh)RQ.a, pQ.OAK.a(), (String)"oak_leaves");
      this.a((nh)RQ.a, pQ.SPRUCE.a(), (String)"spruce_leaves");
      this.a((nh)RQ.b, pQ.ACACIA.a() - 4, (String)"acacia_leaves");
      this.a((nh)RQ.b, pQ.DARK_OAK.a() - 4, (String)"dark_oak_leaves");
      this.a((nh)RQ.l, pQ.BIRCH.a(), (String)"birch_log");
      this.a((nh)RQ.l, pQ.JUNGLE.a(), (String)"jungle_log");
      this.a((nh)RQ.l, pQ.OAK.a(), (String)"oak_log");
      this.a((nh)RQ.l, pQ.SPRUCE.a(), (String)"spruce_log");
      this.a((nh)RQ.m, pQ.ACACIA.a() - 4, (String)"acacia_log");
      this.a((nh)RQ.m, pQ.DARK_OAK.a() - 4, (String)"dark_oak_log");
      this.a((nh)RQ.as, qV.CHISELED_STONEBRICK.a(), (String)"chiseled_brick_monster_egg");
      this.a((nh)RQ.as, qV.COBBLESTONE.a(), (String)"cobblestone_monster_egg");
      this.a((nh)RQ.as, qV.CRACKED_STONEBRICK.a(), (String)"cracked_brick_monster_egg");
      this.a((nh)RQ.as, qV.MOSSY_STONEBRICK.a(), (String)"mossy_brick_monster_egg");
      this.a((nh)RQ.as, qV.STONE.a(), (String)"stone_monster_egg");
      this.a((nh)RQ.as, qV.STONEBRICK.a(), (String)"stone_brick_monster_egg");
      this.a((nh)RQ.e, pQ.ACACIA.a(), (String)"acacia_planks");
      this.a((nh)RQ.e, pQ.BIRCH.a(), (String)"birch_planks");
      this.a((nh)RQ.e, pQ.DARK_OAK.a(), (String)"dark_oak_planks");
      this.a((nh)RQ.e, pQ.JUNGLE.a(), (String)"jungle_planks");
      this.a((nh)RQ.e, pQ.OAK.a(), (String)"oak_planks");
      this.a((nh)RQ.e, pQ.SPRUCE.a(), (String)"spruce_planks");
      this.a((nh)RQ.bD, pY.BRICKS.a(), (String)"prismarine_bricks");
      this.a((nh)RQ.bD, pY.DARK.a(), (String)"dark_prismarine");
      this.a((nh)RQ.bD, pY.ROUGH.a(), (String)"prismarine");
      this.a((nh)RQ.bo, qg.CHISELED.a(), (String)"chiseled_quartz_block");
      this.a((nh)RQ.bo, qg.DEFAULT.a(), (String)"quartz_block");
      this.a((nh)RQ.bo, qg.LINES_Y.a(), (String)"quartz_column");
      this.a((nh)RQ.b, oz.ALLIUM.a(), (String)"allium");
      this.a((nh)RQ.b, oz.BLUE_ORCHID.a(), (String)"blue_orchid");
      this.a((nh)RQ.b, oz.HOUSTONIA.a(), (String)"houstonia");
      this.a((nh)RQ.b, oz.ORANGE_TULIP.a(), (String)"orange_tulip");
      this.a((nh)RQ.b, oz.OXEYE_DAISY.a(), (String)"oxeye_daisy");
      this.a((nh)RQ.b, oz.PINK_TULIP.a(), (String)"pink_tulip");
      this.a((nh)RQ.b, oz.POPPY.a(), (String)"poppy");
      this.a((nh)RQ.b, oz.RED_TULIP.a(), (String)"red_tulip");
      this.a((nh)RQ.b, oz.WHITE_TULIP.a(), (String)"white_tulip");
      this.a((nh)RQ.a, qL.RED_SAND.b(), (String)"red_sand");
      this.a((nh)RQ.a, qL.SAND.b(), (String)"sand");
      this.a((nh)RQ.s, qN.CHISELED.a(), (String)"chiseled_sandstone");
      this.a((nh)RQ.s, qN.DEFAULT.a(), (String)"sandstone");
      this.a((nh)RQ.s, qN.SMOOTH.a(), (String)"smooth_sandstone");
      this.a((nh)RQ.bG, qv.CHISELED.a(), (String)"chiseled_red_sandstone");
      this.a((nh)RQ.bG, qv.DEFAULT.a(), (String)"red_sandstone");
      this.a((nh)RQ.bG, qv.SMOOTH.a(), (String)"smooth_red_sandstone");
      this.a((nh)RQ.f, pQ.ACACIA.a(), (String)"acacia_sapling");
      this.a((nh)RQ.f, pQ.BIRCH.a(), (String)"birch_sapling");
      this.a((nh)RQ.f, pQ.DARK_OAK.a(), (String)"dark_oak_sapling");
      this.a((nh)RQ.f, pQ.JUNGLE.a(), (String)"jungle_sapling");
      this.a((nh)RQ.f, pQ.OAK.a(), (String)"oak_sapling");
      this.a((nh)RQ.f, pQ.SPRUCE.a(), (String)"spruce_sapling");
      this.a((nh)RQ.n, 0, (String)"sponge");
      this.a((nh)RQ.n, 1, (String)"sponge_wet");
      this.a((nh)RQ.a, SW.BLACK.a(), (String)"black_stained_glass");
      this.a((nh)RQ.a, SW.BLUE.a(), (String)"blue_stained_glass");
      this.a((nh)RQ.a, SW.BROWN.a(), (String)"brown_stained_glass");
      this.a((nh)RQ.a, SW.CYAN.a(), (String)"cyan_stained_glass");
      this.a((nh)RQ.a, SW.GRAY.a(), (String)"gray_stained_glass");
      this.a((nh)RQ.a, SW.GREEN.a(), (String)"green_stained_glass");
      this.a((nh)RQ.a, SW.LIGHT_BLUE.a(), (String)"light_blue_stained_glass");
      this.a((nh)RQ.a, SW.LIME.a(), (String)"lime_stained_glass");
      this.a((nh)RQ.a, SW.MAGENTA.a(), (String)"magenta_stained_glass");
      this.a((nh)RQ.a, SW.ORANGE.a(), (String)"orange_stained_glass");
      this.a((nh)RQ.a, SW.PINK.a(), (String)"pink_stained_glass");
      this.a((nh)RQ.a, SW.PURPLE.a(), (String)"purple_stained_glass");
      this.a((nh)RQ.a, SW.RED.a(), (String)"red_stained_glass");
      this.a((nh)RQ.a, SW.SILVER.a(), (String)"silver_stained_glass");
      this.a((nh)RQ.a, SW.WHITE.a(), (String)"white_stained_glass");
      this.a((nh)RQ.a, SW.YELLOW.a(), (String)"yellow_stained_glass");
      this.a((nh)RQ.a, SW.BLACK.a(), (String)"black_stained_glass_pane");
      this.a((nh)RQ.a, SW.BLUE.a(), (String)"blue_stained_glass_pane");
      this.a((nh)RQ.a, SW.BROWN.a(), (String)"brown_stained_glass_pane");
      this.a((nh)RQ.a, SW.CYAN.a(), (String)"cyan_stained_glass_pane");
      this.a((nh)RQ.a, SW.GRAY.a(), (String)"gray_stained_glass_pane");
      this.a((nh)RQ.a, SW.GREEN.a(), (String)"green_stained_glass_pane");
      this.a((nh)RQ.a, SW.LIGHT_BLUE.a(), (String)"light_blue_stained_glass_pane");
      this.a((nh)RQ.a, SW.LIME.a(), (String)"lime_stained_glass_pane");
      this.a((nh)RQ.a, SW.MAGENTA.a(), (String)"magenta_stained_glass_pane");
      this.a((nh)RQ.a, SW.ORANGE.a(), (String)"orange_stained_glass_pane");
      this.a((nh)RQ.a, SW.PINK.a(), (String)"pink_stained_glass_pane");
      this.a((nh)RQ.a, SW.PURPLE.a(), (String)"purple_stained_glass_pane");
      this.a((nh)RQ.a, SW.RED.a(), (String)"red_stained_glass_pane");
      this.a((nh)RQ.a, SW.SILVER.a(), (String)"silver_stained_glass_pane");
      this.a((nh)RQ.a, SW.WHITE.a(), (String)"white_stained_glass_pane");
      this.a((nh)RQ.a, SW.YELLOW.a(), (String)"yellow_stained_glass_pane");
      this.a((nh)RQ.bs, SW.BLACK.a(), (String)"black_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.BLUE.a(), (String)"blue_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.BROWN.a(), (String)"brown_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.CYAN.a(), (String)"cyan_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.GRAY.a(), (String)"gray_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.GREEN.a(), (String)"green_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.LIGHT_BLUE.a(), (String)"light_blue_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.LIME.a(), (String)"lime_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.MAGENTA.a(), (String)"magenta_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.ORANGE.a(), (String)"orange_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.PINK.a(), (String)"pink_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.PURPLE.a(), (String)"purple_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.RED.a(), (String)"red_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.SILVER.a(), (String)"silver_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.WHITE.a(), (String)"white_stained_hardened_clay");
      this.a((nh)RQ.bs, SW.YELLOW.a(), (String)"yellow_stained_hardened_clay");
      this.a((nh)RQ.b, rx.ANDESITE.a(), (String)"andesite");
      this.a((nh)RQ.b, rx.ANDESITE_SMOOTH.a(), (String)"andesite_smooth");
      this.a((nh)RQ.b, rx.DIORITE.a(), (String)"diorite");
      this.a((nh)RQ.b, rx.DIORITE_SMOOTH.a(), (String)"diorite_smooth");
      this.a((nh)RQ.b, rx.GRANITE.a(), (String)"granite");
      this.a((nh)RQ.b, rx.GRANITE_SMOOTH.a(), (String)"granite_smooth");
      this.a((nh)RQ.b, rx.STONE.a(), (String)"stone");
      this.a((nh)RQ.at, rz.CRACKED.a(), (String)"cracked_stonebrick");
      this.a((nh)RQ.at, rz.DEFAULT.a(), (String)"stonebrick");
      this.a((nh)RQ.at, rz.CHISELED.a(), (String)"chiseled_stonebrick");
      this.a((nh)RQ.at, rz.MOSSY.a(), (String)"mossy_stonebrick");
      this.a((nh)RQ.b, rB.BRICK.a(), (String)"brick_slab");
      this.a((nh)RQ.b, rB.COBBLESTONE.a(), (String)"cobblestone_slab");
      this.a((nh)RQ.b, rB.WOOD.a(), (String)"old_wood_slab");
      this.a((nh)RQ.b, rB.NETHERBRICK.a(), (String)"nether_brick_slab");
      this.a((nh)RQ.b, rB.QUARTZ.a(), (String)"quartz_slab");
      this.a((nh)RQ.b, rB.SAND.a(), (String)"sandstone_slab");
      this.a((nh)RQ.b, rB.SMOOTHBRICK.a(), (String)"stone_brick_slab");
      this.a((nh)RQ.b, rB.STONE.a(), (String)"stone_slab");
      this.a((nh)RQ.f, rD.RED_SANDSTONE.a(), (String)"red_sandstone_slab");
      this.a((nh)RQ.a, rI.DEAD_BUSH.a(), (String)"dead_bush");
      this.a((nh)RQ.a, rI.FERN.a(), (String)"fern");
      this.a((nh)RQ.a, rI.GRASS.a(), (String)"tall_grass");
      this.a((nh)RQ.d, pQ.ACACIA.a(), (String)"acacia_slab");
      this.a((nh)RQ.d, pQ.BIRCH.a(), (String)"birch_slab");
      this.a((nh)RQ.d, pQ.DARK_OAK.a(), (String)"dark_oak_slab");
      this.a((nh)RQ.d, pQ.JUNGLE.a(), (String)"jungle_slab");
      this.a((nh)RQ.d, pQ.OAK.a(), (String)"oak_slab");
      this.a((nh)RQ.d, pQ.SPRUCE.a(), (String)"spruce_slab");
      this.a((nh)RQ.x, SW.BLACK.a(), (String)"black_wool");
      this.a((nh)RQ.x, SW.BLUE.a(), (String)"blue_wool");
      this.a((nh)RQ.x, SW.BROWN.a(), (String)"brown_wool");
      this.a((nh)RQ.x, SW.CYAN.a(), (String)"cyan_wool");
      this.a((nh)RQ.x, SW.GRAY.a(), (String)"gray_wool");
      this.a((nh)RQ.x, SW.GREEN.a(), (String)"green_wool");
      this.a((nh)RQ.x, SW.LIGHT_BLUE.a(), (String)"light_blue_wool");
      this.a((nh)RQ.x, SW.LIME.a(), (String)"lime_wool");
      this.a((nh)RQ.x, SW.MAGENTA.a(), (String)"magenta_wool");
      this.a((nh)RQ.x, SW.ORANGE.a(), (String)"orange_wool");
      this.a((nh)RQ.x, SW.PINK.a(), (String)"pink_wool");
      this.a((nh)RQ.x, SW.PURPLE.a(), (String)"purple_wool");
      this.a((nh)RQ.x, SW.RED.a(), (String)"red_wool");
      this.a((nh)RQ.x, SW.SILVER.a(), (String)"silver_wool");
      this.a((nh)RQ.x, SW.WHITE.a(), (String)"white_wool");
      this.a((nh)RQ.x, SW.YELLOW.a(), (String)"yellow_wool");
      this.a((nh)RQ.L, (String)"farmland");
      this.a((nh)RQ.bA, (String)"acacia_stairs");
      this.a((nh)RQ.bq, (String)"activator_rail");
      this.a((nh)RQ.a, (String)"beacon");
      this.a((nh)RQ.g, (String)"bedrock");
      this.a((nh)RQ.bc, (String)"birch_stairs");
      this.a((nh)RQ.C, (String)"bookshelf");
      this.a((nh)RQ.A, (String)"brick_block");
      this.a((nh)RQ.A, (String)"brick_block");
      this.a((nh)RQ.aI, (String)"brick_stairs");
      this.a((nh)RQ.a, (String)"brown_mushroom");
      this.a((nh)RQ.a, (String)"cactus");
      this.a((nh)RQ.ad, (String)"clay");
      this.a((nh)RQ.by, (String)"coal_block");
      this.a((nh)RQ.k, (String)"coal_ore");
      this.a((nh)RQ.d, (String)"cobblestone");
      this.a((nh)RQ.K, (String)"crafting_table");
      this.a((nh)RQ.bB, (String)"dark_oak_stairs");
      this.a((nh)RQ.a, (String)"daylight_detector");
      this.a((nh)RQ.a, (String)"dead_bush");
      this.a((nh)RQ.v, (String)"detector_rail");
      this.a((nh)RQ.J, (String)"diamond_block");
      this.a((nh)RQ.I, (String)"diamond_ore");
      this.a((nh)RQ.r, (String)"dispenser");
      this.a((nh)RQ.br, (String)"dropper");
      this.a((nh)RQ.ba, (String)"emerald_block");
      this.a((nh)RQ.aX, (String)"emerald_ore");
      this.a((nh)RQ.aO, (String)"enchanting_table");
      this.a((nh)RQ.aQ, (String)"end_portal_frame");
      this.a((nh)RQ.aR, (String)"end_stone");
      this.a((nh)RQ.af, (String)"oak_fence");
      this.a((nh)RQ.ag, (String)"spruce_fence");
      this.a((nh)RQ.ah, (String)"birch_fence");
      this.a((nh)RQ.ai, (String)"jungle_fence");
      this.a((nh)RQ.aj, (String)"dark_oak_fence");
      this.a((nh)RQ.ak, (String)"acacia_fence");
      this.a((nh)RQ.aC, (String)"oak_fence_gate");
      this.a((nh)RQ.aD, (String)"spruce_fence_gate");
      this.a((nh)RQ.aE, (String)"birch_fence_gate");
      this.a((nh)RQ.aF, (String)"jungle_fence_gate");
      this.a((nh)RQ.aG, (String)"dark_oak_fence_gate");
      this.a((nh)RQ.aH, (String)"acacia_fence_gate");
      this.a((nh)RQ.M, (String)"furnace");
      this.a((nh)RQ.o, (String)"glass");
      this.a((nh)RQ.ax, (String)"glass_pane");
      this.a((nh)RQ.ao, (String)"glowstone");
      this.a((nh)RQ.u, (String)"golden_rail");
      this.a((nh)RQ.y, (String)"gold_block");
      this.a((nh)RQ.i, (String)"gold_ore");
      this.a((nh)RQ.a, (String)"grass");
      this.a((nh)RQ.bP, (String)"grass_path");
      this.a((nh)RQ.h, (String)"gravel");
      this.a((nh)RQ.bx, (String)"hardened_clay");
      this.a((nh)RQ.bv, (String)"hay_block");
      this.a((nh)RQ.bl, (String)"heavy_weighted_pressure_plate");
      this.a((nh)RQ.a, (String)"hopper");
      this.a((nh)RQ.ab, (String)"ice");
      this.a((nh)RQ.aw, (String)"iron_bars");
      this.a((nh)RQ.z, (String)"iron_block");
      this.a((nh)RQ.j, (String)"iron_ore");
      this.a((nh)RQ.bu, (String)"iron_trapdoor");
      this.a((nh)RQ.ae, (String)"jukebox");
      this.a((nh)RQ.bd, (String)"jungle_stairs");
      this.a((nh)RQ.P, (String)"ladder");
      this.a((nh)RQ.q, (String)"lapis_block");
      this.a((nh)RQ.p, (String)"lapis_ore");
      this.a((nh)RQ.S, (String)"lever");
      this.a((nh)RQ.bk, (String)"light_weighted_pressure_plate");
      this.a((nh)RQ.ap, (String)"lit_pumpkin");
      this.a((nh)RQ.ay, (String)"melon_block");
      this.a((nh)RQ.D, (String)"mossy_cobblestone");
      this.a((nh)RQ.a, (String)"mycelium");
      this.a((nh)RQ.am, (String)"netherrack");
      this.a((nh)RQ.aL, (String)"nether_brick");
      this.a((nh)RQ.aM, (String)"nether_brick_fence");
      this.a((nh)RQ.aN, (String)"nether_brick_stairs");
      this.a((nh)RQ.t, (String)"noteblock");
      this.a((nh)RQ.H, (String)"oak_stairs");
      this.a((nh)RQ.E, (String)"obsidian");
      this.a((nh)RQ.bz, (String)"packed_ice");
      this.a((nh)RQ.b, (String)"piston");
      this.a((nh)RQ.al, (String)"pumpkin");
      this.a((nh)RQ.bn, (String)"quartz_ore");
      this.a((nh)RQ.bp, (String)"quartz_stairs");
      this.a((nh)RQ.Q, (String)"rail");
      this.a((nh)RQ.bm, (String)"redstone_block");
      this.a((nh)RQ.aT, (String)"redstone_lamp");
      this.a((nh)RQ.V, (String)"redstone_ore");
      this.a((nh)RQ.Y, (String)"redstone_torch");
      this.a((nh)RQ.b, (String)"red_mushroom");
      this.a((nh)RQ.aW, (String)"sandstone_stairs");
      this.a((nh)RQ.bH, (String)"red_sandstone_stairs");
      this.a((nh)RQ.bE, (String)"sea_lantern");
      this.a((nh)RQ.bC, (String)"slime");
      this.a((nh)RQ.ac, (String)"snow");
      this.a((nh)RQ.aa, (String)"snow_layer");
      this.a((nh)RQ.an, (String)"soul_sand");
      this.a((nh)RQ.bb, (String)"spruce_stairs");
      this.a((nh)RQ.a, (String)"sticky_piston");
      this.a((nh)RQ.aJ, (String)"stone_brick_stairs");
      this.a((nh)RQ.Z, (String)"stone_button");
      this.a((nh)RQ.T, (String)"stone_pressure_plate");
      this.a((nh)RQ.R, (String)"stone_stairs");
      this.a((nh)RQ.B, (String)"tnt");
      this.a((nh)RQ.F, (String)"torch");
      this.a((nh)RQ.ar, (String)"trapdoor");
      this.a((nh)RQ.a, (String)"tripwire_hook");
      this.a((nh)RQ.aB, (String)"vine");
      this.a((nh)RQ.aK, (String)"waterlily");
      this.a((nh)RQ.w, (String)"web");
      this.a((nh)RQ.bh, (String)"wooden_button");
      this.a((nh)RQ.U, (String)"wooden_pressure_plate");
      this.a((nh)RQ.a, oz.DANDELION.a(), (String)"dandelion");
      this.a((nh)RQ.bI, (String)"end_rod");
      this.a((nh)RQ.bJ, (String)"chorus_plant");
      this.a((nh)RQ.bK, (String)"chorus_flower");
      this.a((nh)RQ.bL, (String)"purpur_block");
      this.a((nh)RQ.bM, (String)"purpur_pillar");
      this.a((nh)RQ.bN, (String)"purpur_stairs");
      this.a((nh)RQ.h, (String)"purpur_slab");
      this.a((nh)RQ.g, (String)"purpur_double_slab");
      this.a((nh)RQ.bO, (String)"end_bricks");
      this.a((nh)RQ.bS, (String)"magma");
      this.a((nh)RQ.bT, (String)"nether_wart_block");
      this.a((nh)RQ.bU, (String)"red_nether_brick");
      this.a((nh)RQ.bV, (String)"bone_block");
      this.a((nh)RQ.bW, (String)"structure_void");
      this.a((nh)RQ.bX, (String)"observer");
      this.a((nh)RQ.bY, (String)"white_shulker_box");
      this.a((nh)RQ.bZ, (String)"orange_shulker_box");
      this.a((nh)RQ.ca, (String)"magenta_shulker_box");
      this.a((nh)RQ.cb, (String)"light_blue_shulker_box");
      this.a((nh)RQ.cc, (String)"yellow_shulker_box");
      this.a((nh)RQ.cd, (String)"lime_shulker_box");
      this.a((nh)RQ.ce, (String)"pink_shulker_box");
      this.a((nh)RQ.cf, (String)"gray_shulker_box");
      this.a((nh)RQ.cg, (String)"silver_shulker_box");
      this.a((nh)RQ.ch, (String)"cyan_shulker_box");
      this.a((nh)RQ.ci, (String)"purple_shulker_box");
      this.a((nh)RQ.cj, (String)"blue_shulker_box");
      this.a((nh)RQ.ck, (String)"brown_shulker_box");
      this.a((nh)RQ.cl, (String)"green_shulker_box");
      this.a((nh)RQ.cm, (String)"red_shulker_box");
      this.a((nh)RQ.cn, (String)"black_shulker_box");
      this.a((nh)RQ.co, (String)"white_glazed_terracotta");
      this.a((nh)RQ.cp, (String)"orange_glazed_terracotta");
      this.a((nh)RQ.cq, (String)"magenta_glazed_terracotta");
      this.a((nh)RQ.cr, (String)"light_blue_glazed_terracotta");
      this.a((nh)RQ.cs, (String)"yellow_glazed_terracotta");
      this.a((nh)RQ.ct, (String)"lime_glazed_terracotta");
      this.a((nh)RQ.cu, (String)"pink_glazed_terracotta");
      this.a((nh)RQ.cv, (String)"gray_glazed_terracotta");
      this.a((nh)RQ.cw, (String)"silver_glazed_terracotta");
      this.a((nh)RQ.cx, (String)"cyan_glazed_terracotta");
      this.a((nh)RQ.cy, (String)"purple_glazed_terracotta");
      this.a((nh)RQ.cz, (String)"blue_glazed_terracotta");
      this.a((nh)RQ.cA, (String)"brown_glazed_terracotta");
      this.a((nh)RQ.cB, (String)"green_glazed_terracotta");
      this.a((nh)RQ.cC, (String)"red_glazed_terracotta");
      this.a((nh)RQ.cD, (String)"black_glazed_terracotta");
      SW[] var1 = SW.VALUES;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         SW var4 = var1[var3];
         this.a((nh)RQ.cE, var4.a(), (String)(var4.a() + "_concrete"));
         this.a((nh)RQ.cF, var4.a(), (String)(var4.a() + "_concrete_powder"));
      }

      this.a((nh)RQ.a, (String)"chest");
      this.a((nh)RQ.bj, (String)"trapped_chest");
      this.a((nh)RQ.aY, (String)"ender_chest");
      this.a(RT.b, "iron_shovel");
      this.a(RT.c, "iron_pickaxe");
      this.a(RT.d, "iron_axe");
      this.a(RT.e, "flint_and_steel");
      this.a(RT.f, "apple");
      this.a((SZ)RT.a, (String)"bow");
      this.a(RT.g, "arrow");
      this.a(RT.h, "spectral_arrow");
      this.a(RT.i, "tipped_arrow");
      this.a((SZ)RT.j, 0, (String)"coal");
      this.a((SZ)RT.j, 1, (String)"charcoal");
      this.a(RT.k, "diamond");
      this.a(RT.l, "iron_ingot");
      this.a(RT.m, "gold_ingot");
      this.a(RT.n, "iron_sword");
      this.a(RT.o, "wooden_sword");
      this.a(RT.p, "wooden_shovel");
      this.a(RT.q, "wooden_pickaxe");
      this.a(RT.r, "wooden_axe");
      this.a(RT.s, "stone_sword");
      this.a(RT.t, "stone_shovel");
      this.a(RT.u, "stone_pickaxe");
      this.a(RT.v, "stone_axe");
      this.a(RT.w, "diamond_sword");
      this.a(RT.x, "diamond_shovel");
      this.a(RT.y, "diamond_pickaxe");
      this.a(RT.z, "diamond_axe");
      this.a(RT.A, "stick");
      this.a(RT.B, "bowl");
      this.a(RT.C, "mushroom_stew");
      this.a(RT.D, "golden_sword");
      this.a(RT.E, "golden_shovel");
      this.a(RT.F, "golden_pickaxe");
      this.a(RT.G, "golden_axe");
      this.a(RT.H, "string");
      this.a(RT.I, "feather");
      this.a(RT.J, "gunpowder");
      this.a(RT.K, "wooden_hoe");
      this.a(RT.L, "stone_hoe");
      this.a(RT.M, "iron_hoe");
      this.a(RT.N, "diamond_hoe");
      this.a(RT.O, "golden_hoe");
      this.a(RT.P, "wheat_seeds");
      this.a(RT.Q, "wheat");
      this.a(RT.R, "bread");
      this.a((SZ)RT.a, (String)"leather_helmet");
      this.a((SZ)RT.b, (String)"leather_chestplate");
      this.a((SZ)RT.c, (String)"leather_leggings");
      this.a((SZ)RT.d, (String)"leather_boots");
      this.a((SZ)RT.e, (String)"chainmail_helmet");
      this.a((SZ)RT.f, (String)"chainmail_chestplate");
      this.a((SZ)RT.g, (String)"chainmail_leggings");
      this.a((SZ)RT.h, (String)"chainmail_boots");
      this.a((SZ)RT.i, (String)"iron_helmet");
      this.a((SZ)RT.j, (String)"iron_chestplate");
      this.a((SZ)RT.k, (String)"iron_leggings");
      this.a((SZ)RT.l, (String)"iron_boots");
      this.a((SZ)RT.m, (String)"diamond_helmet");
      this.a((SZ)RT.n, (String)"diamond_chestplate");
      this.a((SZ)RT.o, (String)"diamond_leggings");
      this.a((SZ)RT.p, (String)"diamond_boots");
      this.a((SZ)RT.q, (String)"golden_helmet");
      this.a((SZ)RT.r, (String)"golden_chestplate");
      this.a((SZ)RT.s, (String)"golden_leggings");
      this.a((SZ)RT.t, (String)"golden_boots");
      this.a(RT.S, "flint");
      this.a(RT.T, "porkchop");
      this.a(RT.U, "cooked_porkchop");
      this.a(RT.V, "painting");
      this.a(RT.W, "golden_apple");
      this.a((SZ)RT.W, 1, (String)"golden_apple");
      this.a(RT.X, "sign");
      this.a(RT.Y, "oak_door");
      this.a(RT.Z, "spruce_door");
      this.a(RT.aa, "birch_door");
      this.a(RT.ab, "jungle_door");
      this.a(RT.ac, "acacia_door");
      this.a(RT.ad, "dark_oak_door");
      this.a(RT.ae, "bucket");
      this.a(RT.af, "water_bucket");
      this.a(RT.ag, "lava_bucket");
      this.a(RT.ah, "minecart");
      this.a(RT.ai, "saddle");
      this.a(RT.aj, "iron_door");
      this.a(RT.ak, "redstone");
      this.a(RT.al, "snowball");
      this.a(RT.am, "oak_boat");
      this.a(RT.an, "spruce_boat");
      this.a(RT.ao, "birch_boat");
      this.a(RT.ap, "jungle_boat");
      this.a(RT.aq, "acacia_boat");
      this.a(RT.ar, "dark_oak_boat");
      this.a(RT.as, "leather");
      this.a(RT.at, "milk_bucket");
      this.a(RT.au, "brick");
      this.a(RT.av, "clay_ball");
      this.a(RT.aw, "reeds");
      this.a(RT.ax, "paper");
      this.a(RT.ay, "book");
      this.a(RT.az, "slime_ball");
      this.a(RT.aA, "chest_minecart");
      this.a(RT.aB, "furnace_minecart");
      this.a(RT.aC, "egg");
      this.a(RT.aD, "compass");
      this.a((SZ)RT.a, (String)"fishing_rod");
      this.a(RT.aE, "clock");
      this.a(RT.aF, "glowstone_dust");
      this.a(RT.aG, Uo.COD.a(), "cod");
      this.a(RT.aG, Uo.SALMON.a(), "salmon");
      this.a(RT.aG, Uo.CLOWNFISH.a(), "clownfish");
      this.a(RT.aG, Uo.PUFFERFISH.a(), "pufferfish");
      this.a(RT.aH, Uo.COD.a(), "cooked_cod");
      this.a(RT.aH, Uo.SALMON.a(), "cooked_salmon");
      this.a(RT.aI, SW.BLACK.b(), "dye_black");
      this.a(RT.aI, SW.RED.b(), "dye_red");
      this.a(RT.aI, SW.GREEN.b(), "dye_green");
      this.a(RT.aI, SW.BROWN.b(), "dye_brown");
      this.a(RT.aI, SW.BLUE.b(), "dye_blue");
      this.a(RT.aI, SW.PURPLE.b(), "dye_purple");
      this.a(RT.aI, SW.CYAN.b(), "dye_cyan");
      this.a(RT.aI, SW.SILVER.b(), "dye_silver");
      this.a(RT.aI, SW.GRAY.b(), "dye_gray");
      this.a(RT.aI, SW.PINK.b(), "dye_pink");
      this.a(RT.aI, SW.LIME.b(), "dye_lime");
      this.a(RT.aI, SW.YELLOW.b(), "dye_yellow");
      this.a(RT.aI, SW.LIGHT_BLUE.b(), "dye_light_blue");
      this.a(RT.aI, SW.MAGENTA.b(), "dye_magenta");
      this.a(RT.aI, SW.ORANGE.b(), "dye_orange");
      this.a(RT.aI, SW.WHITE.b(), "dye_white");
      this.a(RT.aJ, "bone");
      this.a(RT.aK, "sugar");
      this.a(RT.aL, "cake");
      this.a(RT.aN, "repeater");
      this.a(RT.aO, "cookie");
      this.a((SZ)RT.a, (String)"shears");
      this.a(RT.aP, "melon");
      this.a(RT.aQ, "pumpkin_seeds");
      this.a(RT.aR, "melon_seeds");
      this.a(RT.aS, "beef");
      this.a(RT.aT, "cooked_beef");
      this.a(RT.aU, "chicken");
      this.a(RT.aV, "cooked_chicken");
      this.a(RT.aY, "rabbit");
      this.a(RT.aZ, "cooked_rabbit");
      this.a(RT.aW, "mutton");
      this.a(RT.aX, "cooked_mutton");
      this.a(RT.bb, "rabbit_foot");
      this.a(RT.bc, "rabbit_hide");
      this.a(RT.ba, "rabbit_stew");
      this.a(RT.bd, "rotten_flesh");
      this.a(RT.be, "ender_pearl");
      this.a(RT.bf, "blaze_rod");
      this.a(RT.bg, "ghast_tear");
      this.a(RT.bh, "gold_nugget");
      this.a(RT.bi, "nether_wart");
      this.a(RT.ct, "beetroot");
      this.a(RT.cs, "beetroot_seeds");
      this.a(RT.cu, "beetroot_soup");
      this.a(RT.cv, "totem");
      this.a((SZ)RT.a, (String)"bottle_drinkable");
      this.a((SZ)RT.b, (String)"bottle_splash");
      this.a((SZ)RT.c, (String)"bottle_lingering");
      this.a(RT.bj, "glass_bottle");
      this.a(RT.bk, "dragon_breath");
      this.a(RT.bl, "spider_eye");
      this.a(RT.bm, "fermented_spider_eye");
      this.a(RT.bn, "blaze_powder");
      this.a(RT.bo, "magma_cream");
      this.a(RT.bp, "brewing_stand");
      this.a(RT.bq, "cauldron");
      this.a(RT.br, "ender_eye");
      this.a(RT.bs, "speckled_melon");
      this.a.a(RT.bt, new KU(new Dv("spawn_egg", "inventory")));
      this.a(RT.bu, "experience_bottle");
      this.a(RT.bv, "fire_charge");
      this.a(RT.bw, "writable_book");
      this.a(RT.by, "emerald");
      this.a(RT.bz, "item_frame");
      this.a(RT.bA, "flower_pot");
      this.a(RT.bB, "carrot");
      this.a(RT.bC, "potato");
      this.a(RT.bD, "baked_potato");
      this.a(RT.bE, "poisonous_potato");
      this.a((SZ)RT.a, (String)"map");
      this.a(RT.bF, "golden_carrot");
      this.a((SZ)RT.bG, 0, (String)"skull_skeleton");
      this.a((SZ)RT.bG, 1, (String)"skull_wither");
      this.a((SZ)RT.bG, 2, (String)"skull_zombie");
      this.a((SZ)RT.bG, 3, (String)"skull_char");
      this.a((SZ)RT.bG, 4, (String)"skull_creeper");
      this.a((SZ)RT.bG, 5, (String)"skull_dragon");
      this.a(RT.bH, "carrot_on_a_stick");
      this.a(RT.bI, "nether_star");
      this.a(RT.cn, "end_crystal");
      this.a(RT.bJ, "pumpkin_pie");
      this.a(RT.bL, "firework_charge");
      this.a(RT.bN, "comparator");
      this.a(RT.bO, "netherbrick");
      this.a(RT.bP, "quartz");
      this.a(RT.bQ, "tnt_minecart");
      this.a(RT.bR, "hopper_minecart");
      this.a((SZ)RT.a, (String)"armor_stand");
      this.a(RT.bS, "iron_horse_armor");
      this.a(RT.bT, "golden_horse_armor");
      this.a(RT.bU, "diamond_horse_armor");
      this.a(RT.bV, "lead");
      this.a(RT.bW, "name_tag");
      this.a.a(RT.cm, new KU(new Dv("banner", "inventory")));
      this.a.a(RT.aM, new KU(new Dv("bed", "inventory")));
      this.a.a(RT.co, new KU(new Dv("shield", "inventory")));
      this.a(RT.cp, "elytra");
      this.a(RT.cq, "chorus_fruit");
      this.a(RT.cr, "chorus_fruit_popped");
      this.a(RT.cw, "shulker_shell");
      this.a(RT.cx, "iron_nugget");
      this.a(RT.bY, "record_13");
      this.a(RT.bZ, "record_cat");
      this.a(RT.ca, "record_blocks");
      this.a(RT.cb, "record_chirp");
      this.a(RT.cc, "record_far");
      this.a(RT.cd, "record_mall");
      this.a(RT.ce, "record_mellohi");
      this.a(RT.cf, "record_stal");
      this.a(RT.cg, "record_strad");
      this.a(RT.ch, "record_ward");
      this.a(RT.ci, "record_11");
      this.a(RT.cj, "record_wait");
      this.a(RT.ck, "prismarine_shard");
      this.a(RT.cl, "prismarine_crystals");
      this.a(RT.cy, "knowledge_book");
      this.a.a(RT.bM, new KU(new Dv("enchanted_book", "inventory")));
      this.a.a(RT.a, new KU(new Dv("filled_map", "inventory")));
      this.a((nh)RQ.be, (String)"command_block");
      this.a(RT.bK, "fireworks");
      this.a(RT.bX, "command_block_minecart");
      this.a((nh)RQ.bt, (String)"barrier");
      this.a((nh)RQ.G, (String)"mob_spawner");
      this.a(RT.bx, "written_book");
      this.a((nh)RQ.au, oY.ALL_INSIDE.a(), (String)"brown_mushroom_block");
      this.a((nh)RQ.av, oY.ALL_INSIDE.a(), (String)"red_mushroom_block");
      this.a((nh)RQ.aS, (String)"dragon_egg");
      this.a((nh)RQ.bQ, (String)"repeating_command_block");
      this.a((nh)RQ.bR, (String)"chain_command_block");
      this.a((nh)RQ.cG, abr.SAVE.a(), (String)"structure_block");
      this.a((nh)RQ.cG, abr.LOAD.a(), (String)"structure_block");
      this.a((nh)RQ.cG, abr.CORNER.a(), (String)"structure_block");
      this.a((nh)RQ.cG, abr.DATA.a(), (String)"structure_block");
   }

   public void onResourceManagerReload(IN var1) {
      this.a.a();
   }

   public void renderItemIntoGUI(ItemStack var1, int var2, int var3) {
      this.a(bl.a(var1), var2, var3);
   }

   public void renderItemAndEffectIntoGUI(ItemStack var1, int var2, int var3) {
      this.b(bl.a(var1), var2, var3);
   }

   public void renderItemOverlayIntoGUI(FontRenderer var1, ItemStack var2, int var3, int var4, String var5) {
      this.a((tI)d.a(var1), bl.a(var2), var3, var4, var5);
   }

   public void renderItem(ItemStack var1, Type var2) {
      this.a(bl.a(var1), (CZ)d.a(var2));
   }

   public void registerBlock(Block var1, String var2) {
      this.a((nh)d.a(var1), var2);
   }

   public void registerBlock(Block var1, int var2, String var3) {
      this.a((nh)d.a(var1), var2, var3);
   }

   public void registerItem(Item var1, String var2) {
      this.a((SZ)d.a(var1), var2);
   }

   public void registerItem(Item var1, int var2, String var3) {
      this.a((SZ)d.a(var1), var2, var3);
   }

   public void unregisterItem(Item var1) {
      this.a.a((SZ)d.a(var1));
   }

   public void unregisterItem(Item var1, int var2) {
      this.a.a((SZ)d.a(var1), var2);
   }

   public void unregisterItem(int var1) {
      this.a.a(var1);
   }

   public void a(Vh var1, CV var2, CallbackInfo var3) {
      if (!var1.isEmpty() && var1.c()) {
         VR var4 = var1.a();
         if (var4.a("p13nModelId", (int)8)) {
            String var5 = var4.getString("p13nModelId");

            UUID var6;
            try {
               var6 = UUIDConversionUtil.fromString(var5);
            } catch (Exception var9) {
               var4.a("p13nModelId");
               return;
            }

            aqV var7 = aqR.a().a;
            arz var8 = (arz)var7.a.a().get(var6);
            if (var8 != null) {
               var7.a.a(sE.a().a, arR.GUI, (var1x) -> {
                  By.C();
                  By.b(180.0F, 0.0F, 0.0F, 1.0F);
                  By.b(0.05F, 0.05F, 0.05F);
                  var8.a(arR.GUI, sE.a().a());
                  By.D();
               }, sE.a().a());
               var3.cancel();
            }
         }
      }

   }
}
