import dev.xdark.clientapi.event.render.AirBarRender;
import dev.xdark.clientapi.event.render.ArmorRender;
import dev.xdark.clientapi.event.render.ExpBarRender;
import dev.xdark.clientapi.event.render.HealthRender;
import dev.xdark.clientapi.event.render.HotbarRender;
import dev.xdark.clientapi.event.render.HungerRender;
import dev.xdark.clientapi.event.render.JumpPowerRender;
import dev.xdark.clientapi.event.render.PlayerListRender;
import dev.xdark.clientapi.event.render.PotionsRender;
import dev.xdark.clientapi.event.render.VehicleHealthRender;
import dev.xdark.clientapi.gui.ChatOverlay;
import dev.xdark.clientapi.gui.IngameUI;
import dev.xdark.clientapi.render.ScaledResolution;
import dev.xdark.feder.RecyclableArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.cristalix.core.datasync.EntitySleepData;

public final class uf extends tJ implements asY, IngameUI {
   private static final Lg c = new Lg("textures/misc/vignette.png");
   private static final Lg d = new Lg("textures/gui/widgets.png");
   private static final Lg e = new Lg("textures/misc/pumpkinblur.png");
   private final Random a;
   private final sE a;
   private final Cp a;
   public final ux a;
   public ux b;
   private int a;
   private String a;
   private int b;
   private boolean a;
   public float b;
   private int c;
   private Vh a;
   private final uB a;
   private final uX a;
   private final uW a;
   private final uD a;
   private final tK a;
   private int d;
   private String b;
   private String c;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private long a;
   private long b;
   private final Map<adt, List<vD>> a;
   private boolean b;
   private ChatOverlay a;
   private final aqT a;

   public uf(sE var1) {
      this.a = aqR.a().a;
      this.a = new Random();
      this.a = "";
      this.b = 1.0F;
      this.a = Vh.a;
      this.b = "";
      this.c = "";
      this.a = new EnumMap(adt.class);
      this.a = var1;
      Cw var2 = this.a = this.a.a;
      this.a = var1.a();
      (this.a = new uB(var1)).a = var2;
      (this.a = new uW(var1)).a = var2;
      (this.b = new ux(var1)).a = var2;
      this.a = this.b;
      (this.a = new uD(var1, this)).a = var2;
      (this.a = new tK(var1)).a = var2;
      (this.a = new uX(var1)).a = var2;
      adt[] var3 = adt.VALUES;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         adt var6 = var3[var5];
         this.a.put(var6, new ObjectArrayList(2));
      }

      ((List)this.a.get(adt.CHAT)).add(new vE(var1));
      ((List)this.a.get(adt.SYSTEM)).add(new vE(var1));
      ((List)this.a.get(adt.GAME_INFO)).add(new vF(var1));
      this.a();
      this.a(var1, new CallbackInfo("<init>", false));
   }

   public void a() {
      this.e = 10;
      this.f = 70;
      this.g = 20;
   }

   public void a(float var1) {
      vk var2 = this.a.b();
      int var3 = var2.getScaledWidth();
      int var4 = var2.getScaledHeight();
      tI var5 = this.a();
      By.l();
      if (afT.I()) {
         this.b(this.a.a.getBrightness(), var2);
      } else {
         By.j();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      }

      Vh var6 = this.a.a.a.c(3);
      if (JI.j == 0 && var6.a() == SZ.a((nh)RQ.al)) {
         this.c(var2);
      }

      if (!this.a.a.a((ZV)RU.i)) {
         float var7 = this.a.a.i + (this.a.a.h - this.a.a.i) * var1;
         if (var7 > 0.0F) {
            this.c(var7, var2);
         }
      }

      if (this.a.a.a()) {
         this.a.a(var2, var1);
      } else {
         this.a(this, var2, var1);
      }

      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.a().a(b);
      By.l();
      this.a(var1, var2);
      By.d();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      this.a.a();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.a().a(b);
      if (this.a.a.shouldDrawHUD()) {
         this.d(var2);
      }

      this.e(var2);
      By.k();
      tE var15 = this.a.a;
      int var19 = this.a(var15);
      int var9;
      if (var19 > 0) {
         By.i();
         By.c();
         float var8 = (float)var19 / 100.0F;
         if (var8 > 1.0F) {
            var8 = 1.0F - (float)(var19 - 100) / 10.0F;
         }

         var9 = (int)(220.0F * var8) << 24 | 1052704;
         a(0, 0, var3, var4, var9);
         By.d();
         By.j();
      }

      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      int var20 = var3 / 2 - 91;
      if (this.a.a.isRidingHorse()) {
         this.a(var2, var20);
      } else if (this.a.a.b()) {
         this.a(this, var2, var20);
      }

      if (JI.o && !this.a.a.a()) {
         this.b(var2);
      } else if (this.a.a.isSpectator()) {
         this.a.a(var2);
      }

      this.a(this, var2);
      if (JI.t) {
         this.a.a(var2);
      }

      var9 = this.b;
      int var12;
      if (var9 > 0) {
         float var10 = (float)var9 - var1;
         int var11 = (int)(var10 * 255.0F / 20.0F);
         if (var11 > 255) {
            var11 = 255;
         }

         if (var11 > 8) {
            By.C();
            By.c((float)(var3 / 2), (float)(var4 - 68), 0.0F);
            By.l();
            By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
            if (this.a) {
               var12 = adh.b(var10 / 50.0F, 0.7F, 0.6F) & 16777215;
            } else {
               var12 = 16777215;
            }

            var5.a(this.a, -var5.getStringWidth(this.a) / 2, -4, var12 + (var11 << 24 & -16777216));
            By.k();
            By.D();
         }
      }

      this.a.a(var2);
      int var21 = this.d;
      if (var21 > 0) {
         float var22 = (float)var21 - var1;
         var12 = 255;
         if (var21 > this.g + this.f) {
            float var13 = (float)(this.e + this.f + this.g) - var22;
            var12 = (int)(var13 * 255.0F / (float)this.e);
         }

         if (var21 <= this.g) {
            var12 = (int)(var22 * 255.0F / (float)this.g);
         }

         var12 = adh.a(var12, 0, 255);
         if (var12 > 8) {
            By.C();
            By.c((float)(var3 / 2), (float)(var4 / 2), 0.0F);
            By.l();
            By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
            By.C();
            By.b(4.0F, 4.0F, 4.0F);
            int var24 = var12 << 24 & -16777216;
            var5.drawString(this.b, (float)(-var5.getStringWidth(this.b) / 2), -10.0F, 16777215 | var24, true);
            By.D();
            By.C();
            By.b(2.0F, 2.0F, 2.0F);
            var5.drawString(this.c, (float)(-var5.getStringWidth(this.c) / 2), 5.0F, 16777215 | var24, true);
            By.D();
            By.k();
            By.D();
         }
      }

      aao var23 = this.a.a.a();
      aam var27 = null;
      aan var25 = var23.c(this.a.a.getName());
      if (var25 != null) {
         int var14 = var25.a().getColorIndex();
         if (var14 >= 0) {
            var27 = var23.a(3 + var14);
         }
      }

      aam var26 = var27 != null ? var27 : var23.a(1);
      if (var26 != null) {
         this.a(var26, var2);
      }

      By.l();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      By.c();
      By.C();
      By.c(0.0F, (float)(var4 - 48), 0.0F);
      this.b.a(this.a);
      By.D();
      var26 = var23.a(0);
      JN var28 = this.a.a.o;
      if (this.a(var28)) {
         this.a.a(true);
         this.a.a(var3, var23, var26);
      } else {
         this.a.a(false);
      }

      this.b(var1);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.f();
      By.d();
   }

   private void a(float var1, vk var2) {
      CallbackInfo var12 = new CallbackInfo("renderAttackIndicator", true);
      this.a(var1, var2, var12);
      if (!var12.isCancelled()) {
         sE var3 = this.a;
         JI var4 = var3.a;
         if (JI.j == 0) {
            if (var3.a.a() && var3.a == null) {
               adi var5 = var3.a;
               if (var5 == null || var5.a != adj.BLOCK) {
                  return;
               }

               acV var6 = var5.a();
               yw var7 = var3.a;
               sD var8 = var7.a((acV)var6);
               nh var9 = var8.a();
               if (!var9.hasTileEntity() || !(var7.a((acV)var6) instanceof SE)) {
                  return;
               }
            }

            int var13 = var2.getScaledWidth();
            int var14 = var2.getScaledHeight();
            if (JI.t && !JI.s && !var3.a.hasReducedDebug() && !JI.k) {
               By.C();
               By.c((float)(var13 / 2), (float)(var14 / 2), this.a);
               NN var16 = var3.a();
               By.b(var16.m + (var16.k - var16.m) * var1, -1.0F, 0.0F, 0.0F);
               By.b(var16.l + (var16.j - var16.l) * var1, 0.0F, 1.0F, 0.0F);
               By.b(-1.0F, -1.0F, -1.0F);
               Ci.a(var3.a, 10);
               By.D();
            } else {
               By.a(BU.ONE_MINUS_DST_COLOR, BL.ONE_MINUS_SRC_COLOR, BU.ONE, BL.ZERO);
               By.d();
               this.b(var13 / 2 - 7, var14 / 2 - 7, 0, 0, 16, 16);
               if (JI.i == 1) {
                  float var15 = var3.a.c(0.0F);
                  boolean var17 = false;
                  if (var3.a instanceof Oh && var15 >= 1.0F) {
                     var17 = var3.a.getCooldownPeriod() > 5.0F;
                     var17 &= var3.a.isEntityAlive();
                  }

                  int var18 = var14 / 2 - 7 + 16;
                  int var10 = var13 / 2 - 8;
                  if (var17) {
                     this.b(var10, var18, 68, 94, 16, 16);
                  } else if (var15 < 1.0F) {
                     int var11 = (int)(var15 * 17.0F);
                     this.b(var10, var18, 36, 94, 16, 4);
                     this.b(var10, var18, 52, 94, var11, 4);
                  }
               }
            }
         }

      }
   }

   public void a(vk var1) {
      Collection var2 = this.a.a.getActivePotionEffects();
      if (!var2.isEmpty()) {
         this.a.a().a(vO.c);
         By.l();
         int var3 = 0;
         int var4 = 0;
         RecyclableArrayList var5 = RecyclableArrayList.newInstance(var2);
         var5.sort(Collections.reverseOrder());
         int var6 = 0;

         for(int var7 = var5.size(); var6 < var7; ++var6) {
            ZY var8 = (ZY)var5.get(var6);
            ZV var9 = var8.a();
            boolean var10 = var9.hasStatusIcon();
            if (var10 && var8.doesShowParticles()) {
               int var11 = var1.getScaledWidth();
               int var12 = 1;
               int var13 = var9.getStatusIconIndex();
               if (var9.isBeneficial()) {
                  ++var3;
                  var11 -= 25 * var3;
               } else {
                  ++var4;
                  var11 -= 25 * var4;
                  var12 += 26;
               }

               By.c(1.0F, 1.0F, 1.0F, 1.0F);
               float var14 = 1.0F;
               if (var8.a()) {
                  this.b(var11, var12, 165, 166, 24, 24);
               } else {
                  this.b(var11, var12, 141, 166, 24, 24);
                  if (var8.getDuration() <= 200) {
                     int var15 = 10 - var8.getDuration() / 20;
                     var14 = adh.a((float)var8.getDuration() / 10.0F / 5.0F * 0.5F, 0.0F, 0.5F) + adh.b((float)var8.getDuration() * 3.1415927F / 5.0F) * adh.a((float)var15 / 10.0F * 0.25F, 0.0F, 0.25F);
                  }
               }

               By.c(1.0F, 1.0F, 1.0F, var14);
               this.b(var11 + 3, var12 + 3, var13 % 8 * 18, 198 + var13 / 8 * 18, 18, 18);
            }
         }

         var5.recycle();
      }

   }

   public void a(vk var1, float var2) {
      if (this.a.a() instanceof Rn) {
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         this.a.a().a(d);
         Rn var3 = (Rn)this.a.a();
         Vh var4 = var3.b();
         abV var5 = var3.a().a();
         int var6 = var1.getScaledWidth() / 2;
         float var7 = this.a;
         this.a = -90.0F;
         this.b(var6 - 91, var1.getScaledHeight() - 22, 0, 0, 182, 22);
         this.b(var6 - 91 - 1 + var3.a.a * 20, var1.getScaledHeight() - 22 - 1, 0, 22, 24, 22);
         if (!var4.isEmpty()) {
            if (var5 == abV.LEFT) {
               this.b(var6 - 91 - 29, var1.getScaledHeight() - 23, 24, 22, 29, 24);
            } else {
               this.b(var6 + 91, var1.getScaledHeight() - 23, 53, 22, 29, 24);
            }
         }

         this.a = var7;
         By.z();
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         Co.c();
         ajs.a(false);

         int var8;
         int var9;
         int var10;
         for(var8 = 0; var8 < 9; ++var8) {
            var9 = var6 - 90 + var8 * 20 + 2;
            var10 = var1.getScaledHeight() - 16 - 3;
            this.a(var9, var10, var2, var3, (Vh)var3.a.a.get(var8));
         }

         if (!var4.isEmpty()) {
            ajs.a(true);
            var8 = var1.getScaledHeight() - 16 - 3;
            if (var5 == abV.LEFT) {
               this.a(var6 - 91 - 26, var8, var2, var3, var4);
            } else {
               this.a(var6 + 91 + 10, var8, var2, var3, var4);
            }

            ajs.a(false);
         }

         if (JI.i == 2) {
            float var12 = this.a.a.c(0.0F);
            if (var12 < 1.0F) {
               var9 = var1.getScaledHeight() - 20;
               var10 = var6 + 91 + 6;
               if (var5 == abV.RIGHT) {
                  var10 = var6 - 91 - 22;
               }

               this.a.a().a(tJ.b);
               int var11 = (int)(var12 * 19.0F);
               By.c(1.0F, 1.0F, 1.0F, 1.0F);
               this.b(var10, var9, 0, 94, 18, 18);
               this.b(var10, var9 + 18 - var11, 18, 112 - var11, 18, var11);
            }
         }

         Co.a();
         By.A();
         By.k();
      }

   }

   public void a(vk var1, int var2) {
      if (this.e()) {
         this.a.a().a(tJ.b);
         float var3 = this.a.a.a();
         int var4 = (int)(var3 * 183.0F);
         int var5 = var1.getScaledHeight() - 32 + 3;
         this.b(var2, var5, 0, 84, 182, 5);
         if (var4 > 0) {
            this.b(var2, var5, 0, 89, var4, 5);
         }

      }
   }

   public void b(vk var1, int var2) {
      this.a.a().a(tJ.b);
      int var3 = this.a.a.xpBarCap();
      int var4;
      if (var3 > 0) {
         var4 = (int)(this.a.a.N * 183.0F);
         int var5 = var1.getScaledHeight() - 32 + 3;
         this.b(var2, var5, 0, 64, 182, 5);
         if (var4 > 0) {
            this.b(var2, var5, 0, 69, var4, 5);
         }
      }

      if (this.a.a.k > 0) {
         var4 = 8453920;
         if (afT.V()) {
            var4 = agd.a(var4);
         }

         String var9 = acm.a(this.a.a.k);
         int var6 = (var1.getScaledWidth() - this.a().getStringWidth(var9)) / 2;
         int var7 = var1.getScaledHeight() - 31 - 4;
         tI var8 = this.a();
         var8.a(var9, var6 + 1, var7, 0);
         var8.a(var9, var6 - 1, var7, 0);
         var8.a(var9, var6, var7 + 1, 0);
         var8.a(var9, var6, var7 - 1, 0);
         var8.a(var9, var6, var7, var4);
      }

   }

   public void b(vk var1) {
      if (this.c > 0 && !this.a.isEmpty()) {
         String var2 = this.a.getDisplayName();
         if (this.a.hasDisplayName()) {
            var2 = adH.ITALIC + var2;
         }

         int var3 = (var1.getScaledWidth() - this.a().getStringWidth(var2)) / 2;
         int var4 = var1.getScaledHeight() - 59;
         if (!this.a.a.shouldDrawHUD()) {
            var4 += 14;
         }

         int var5 = (int)((float)this.c * 256.0F / 10.0F);
         if (var5 > 255) {
            var5 = 255;
         }

         if (var5 > 0) {
            By.C();
            By.l();
            By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
            this.a().drawStringWithShadow(var2, (float)var3, (float)var4, 16777215 + (var5 << 24));
            By.k();
            By.D();
         }
      }

   }

   private void a(aam var1, vk var2) {
      tI var3 = this.a();
      aao var4 = var1.a();
      RecyclableArrayList var5 = var4.a(var1);
      RecyclableArrayList var6 = RecyclableArrayList.newInstance();
      int var7 = 0;

      int var8;
      for(var8 = var5.size(); var7 < var8; ++var7) {
         aai var9 = (aai)var5.get(var7);
         if (var9.a() != null && !var9.a().startsWith("#")) {
            var6.add(var9);
         }
      }

      var5.recycle();
      var7 = var3.getStringWidth(var1.b());
      var8 = 0;

      int var21;
      for(var21 = var6.size(); var8 < var21; ++var8) {
         aai var10 = (aai)var6.get(var8);
         aan var11 = var4.c(var10.a());
         String var12 = aan.a(var11, var10.a());
         var7 = Math.max(var7, var3.getStringWidth(var12));
      }

      var8 = var3.a;
      var21 = var6.size() * var8 - 10;
      int var22 = var2.getScaledHeight() / 2 + var21 / 3 + 5;
      int var23 = var2.getScaledWidth() - var7 - 3 - 10;
      int var24 = 0;
      int var13 = 0;

      int var14;
      for(var14 = var6.size(); var13 < var14; ++var13) {
         aai var15 = (aai)var6.get(var13);
         ++var24;
         aan var16 = var4.c(var15.a());
         String var17 = aan.a(var16, var15.a());
         int var18 = var22 - var24 * var8;
         int var19 = var2.getScaledWidth() - 3 + 2;
         a(var23 - 2, var18, var19, var18 + var8, 1342177280);
         var3.a(var17, var23 + 5, var18, 553648127);
         if (var24 == var14) {
            String var20 = var1.b();
            a(var23 - 2, var18 - var8 - 1 - 5, var19, var18 - 1 - 5, 1610612736);
            a(var23 - 2, var18 - 1 - 5, var19, var18 - 5, 1342177280);
            a(var23 - 2, var18 - 5, var19, var18 - 5 + 1 + 5 - 1, 1342177280);
            var3.a(var20, var23 + var7 / 2 - var3.getStringWidth(var20) / 2 + 5, var18 - var8 - 5, 553648127);
         }
      }

      var13 = var22 + var8 + 2;
      var14 = var2.getScaledWidth() - 3 + 2;
      a(var23 - 2, var13 - var8 - 2 - 1 - 5 + 5 + 1, var14, var13 - var8 - 1 - 1 + 5, 1342177280);
      a(var23 - 2, var13 - var8 - 2 + 5, var14, var13 - var8 - 1 + 5, 1342177280);
      a(var23 - 2, var13 - var8 - 1 + 5, var14, var13 - 1 + 5, 1610612736);
      var3.a("www.cristalix.ru", var23 + var7 / 2 - var3.getStringWidth("www.cristalix.ru") / 2 + 5, var13 - var8 + 5, 553648127);
      var6.recycle();
   }

   private void d(vk var1) {
      if (this.a.a() instanceof Rn) {
         Rn var2 = (Rn)this.a.a();
         int var3 = adh.b(var2.getHealth());
         boolean var4 = this.b > (long)this.a && (this.b - (long)this.a) / 3L % 2L == 1L;
         if (var3 < this.h && var2.c > 0) {
            this.a = sE.a();
            this.b = (long)(this.a + 20);
         } else if (var3 > this.h && var2.c > 0) {
            this.a = sE.a();
            this.b = (long)(this.a + 10);
         }

         if (sE.a() - this.a > 1000L) {
            this.h = var3;
            this.i = var3;
            this.a = sE.a();
         }

         this.h = var3;
         int var5 = this.i;
         this.a.setSeed((long)this.a * 312871L);
         abZ var6 = var2.a();
         int var7 = var6.getFoodLevel();
         OD var8 = var2.a((OC)Ot.a);
         int var9 = var1.getScaledWidth() / 2 - 91;
         int var10 = var1.getScaledWidth() / 2 + 91;
         int var11 = var1.getScaledHeight() - 39;
         float var12 = (float)var8.b();
         int var13 = adh.b(var2.getAbsorptionAmount());
         int var14 = adh.b((var12 + (float)var13) / 2.0F / 10.0F);
         int var15 = Math.max(10 - (var14 - 2), 3);
         int var16 = var11 - (var14 - 1) * var15 - 10;
         int var17 = var11 - 10;
         int var18 = var13;
         int var19 = var2.getTotalArmorValue();
         int var20 = -1;
         if (var2.a((ZV)RU.j)) {
            var20 = this.a % adh.b(var12 + 5.0F);
         }

         int var21;
         int var22;
         if (this.a()) {
            for(var21 = 0; var21 < 10; ++var21) {
               if (var19 > 0) {
                  var22 = var9 + var21 * 8;
                  if (var21 * 2 + 1 < var19) {
                     this.b(var22, var16, 34, 9, 9, 9);
                  }

                  if (var21 * 2 + 1 == var19) {
                     this.b(var22, var16, 25, 9, 9, 9);
                  }

                  if (var21 * 2 + 1 > var19) {
                     this.b(var22, var16, 16, 9, 9, 9);
                  }
               }
            }
         }

         int var24;
         int var25;
         int var26;
         if (this.b()) {
            for(var21 = adh.b((var12 + (float)var13) / 2.0F) - 1; var21 >= 0; --var21) {
               var22 = 16;
               if (var2.a((ZV)RU.s)) {
                  var22 += 36;
               } else if (var2.a((ZV)RU.t)) {
                  var22 += 72;
               }

               byte var23 = 0;
               if (var4) {
                  var23 = 1;
               }

               var24 = adh.b((float)(var21 + 1) / 10.0F) - 1;
               var25 = var9 + var21 % 10 * 8;
               var26 = var11 - var24 * var15;
               if (var3 <= 4) {
                  var26 += this.a.nextInt(2);
               }

               if (var18 <= 0 && var21 == var20) {
                  var26 -= 2;
               }

               byte var27 = 0;
               if (var2.a.a().b()) {
                  var27 = 5;
               }

               this.b(var25, var26, 16 + var23 * 9, 9 * var27, 9, 9);
               if (var4) {
                  if (var21 * 2 + 1 < var5) {
                     this.b(var25, var26, var22 + 54, 9 * var27, 9, 9);
                  }

                  if (var21 * 2 + 1 == var5) {
                     this.b(var25, var26, var22 + 63, 9 * var27, 9, 9);
                  }
               }

               if (var18 > 0) {
                  if (var18 == var13 && var13 % 2 == 1) {
                     this.b(var25, var26, var22 + 153, 9 * var27, 9, 9);
                     --var18;
                  } else {
                     this.b(var25, var26, var22 + 144, 9 * var27, 9, 9);
                     var18 -= 2;
                  }
               } else {
                  if (var21 * 2 + 1 < var3) {
                     this.b(var25, var26, var22 + 36, 9 * var27, 9, 9);
                  }

                  if (var21 * 2 + 1 == var3) {
                     this.b(var25, var26, var22 + 45, 9 * var27, 9, 9);
                  }
               }
            }
         }

         NN var30 = var2.c();
         int var31;
         if (!(var30 instanceof Oh) && this.c()) {
            for(var22 = 0; var22 < 10; ++var22) {
               var31 = var11;
               var24 = 16;
               byte var32 = 0;
               if (var2.a((ZV)RU.q)) {
                  var24 += 36;
                  var32 = 13;
               }

               if (var2.a().getSaturationLevel() <= 0.0F && this.a % (var7 * 3 + 1) == 0) {
                  var31 = var11 + (this.a.nextInt(3) - 1);
               }

               var26 = var10 - var22 * 8 - 9;
               this.b(var26, var31, 16 + var32 * 9, 27, 9, 9);
               if (var22 * 2 + 1 < var7) {
                  this.b(var26, var31, var24 + 36, 27, 9, 9);
               }

               if (var22 * 2 + 1 == var7) {
                  this.b(var26, var31, var24 + 45, 27, 9, 9);
               }
            }
         }

         si var29 = si.h;
         if (this.a(var2, var29)) {
            var22 = this.a.a.getAir();
            var31 = adh.c((double)(var22 - 2) * 10.0D / 300.0D);
            var24 = adh.c((double)var22 * 10.0D / 300.0D) - var31;

            for(var25 = 0; var25 < var31 + var24; ++var25) {
               if (var25 < var31) {
                  this.b(var10 - var25 * 8 - 9, var17, 16, 18, 9, 9);
               } else {
                  this.b(var10 - var25 * 8 - 9, var17, 25, 18, 9, 9);
               }
            }
         }
      }

   }

   private void e(vk var1) {
      if (this.a.a() instanceof Rn) {
         Rn var2 = (Rn)this.a.a();
         NN var3 = var2.c();
         if (var3 instanceof Oh) {
            if (!this.d()) {
               return;
            }

            Oh var4 = (Oh)var3;
            int var5 = (int)Math.ceil((double)var4.getHealth());
            float var6 = var4.getMaxHealth();
            int var7 = (int)(var6 + 0.5F) / 2;
            if (var7 > 30) {
               var7 = 30;
            }

            int var8 = var1.getScaledHeight() - 39;
            int var9 = var1.getScaledWidth() / 2 + 91;
            int var10 = var8;

            for(int var11 = 0; var7 > 0; var11 += 20) {
               int var12 = Math.min(var7, 10);
               var7 -= var12;

               for(int var13 = 0; var13 < var12; ++var13) {
                  int var14 = var9 - var13 * 8 - 9;
                  this.b(var14, var10, 52, 9, 9, 9);
                  if (var13 * 2 + 1 + var11 < var5) {
                     this.b(var14, var10, 88, 9, 9, 9);
                  }

                  if (var13 * 2 + 1 + var11 == var5) {
                     this.b(var14, var10, 97, 9, 9, 9);
                  }
               }

               var10 -= 10;
            }
         }
      }

   }

   public void c(vk var1) {
      By.i();
      By.a(false);
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.c();
      this.a.a().a(e);
      Cw var2 = this.a.a;
      Bh var3 = var2.a();
      var3.a(7, In.g);
      var3.a(0.0D, (double)var1.getScaledHeight(), -90.0D).a(0.0D, 1.0D).endVertex();
      var3.a((double)var1.getScaledWidth(), (double)var1.getScaledHeight(), -90.0D).a(1.0D, 1.0D).endVertex();
      var3.a((double)var1.getScaledWidth(), 0.0D, -90.0D).a(1.0D, 0.0D).endVertex();
      var3.a(0.0D, 0.0D, -90.0D).a(0.0D, 0.0D).endVertex();
      var2.draw();
      By.a(true);
      By.j();
      By.d();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void b(float var1, vk var2) {
      if (!afT.I()) {
         By.j();
      } else {
         var1 = 1.0F - var1;
         var1 = adh.a(var1, 0.0F, 1.0F);
         afc var3 = this.a.a.a();
         float var4 = (float)var3.a((NN)this.a.a);
         double var5 = Math.min(var3.k() * (double)var3.b() * 1000.0D, Math.abs(var3.h() - var3.g()));
         double var7 = Math.max((double)var3.c(), var5);
         if ((double)var4 < var7) {
            var4 = 1.0F - (float)((double)var4 / var7);
         } else {
            var4 = 0.0F;
         }

         this.b = (float)((double)this.b + (double)(var1 - this.b) * 0.01D);
         By.i();
         By.a(false);
         By.a(BU.ZERO, BL.ONE_MINUS_SRC_COLOR, BU.ONE, BL.ZERO);
         if (var4 > 0.0F) {
            By.c(0.0F, var4, var4, 1.0F);
         } else {
            By.c(this.b, this.b, this.b, 1.0F);
         }

         this.a.a().a(c);
         Cw var9 = this.a.a;
         Bh var10 = var9.a();
         var10.a(7, In.g);
         var10.a(0.0D, (double)var2.getScaledHeight(), -90.0D).a(0.0D, 1.0D).endVertex();
         var10.a((double)var2.getScaledWidth(), (double)var2.getScaledHeight(), -90.0D).a(1.0D, 1.0D).endVertex();
         var10.a((double)var2.getScaledWidth(), 0.0D, -90.0D).a(1.0D, 0.0D).endVertex();
         var10.a(0.0D, 0.0D, -90.0D).a(0.0D, 0.0D).endVertex();
         var9.draw();
         By.a(true);
         By.j();
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
      }

      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
   }

   private void c(float var1, vk var2) {
      if (var1 < 1.0F) {
         var1 *= var1;
         var1 *= var1;
         var1 = var1 * 0.8F + 0.2F;
      }

      By.c();
      By.i();
      By.a(false);
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      By.c(1.0F, 1.0F, 1.0F, var1);
      this.a.a().a(HO.a);
      HK var3 = this.a.a().a().a(RQ.a.a());
      float var4 = var3.getMinU();
      float var5 = var3.getMinV();
      float var6 = var3.getMaxU();
      float var7 = var3.getMaxV();
      Cw var8 = this.a.a;
      Bh var9 = var8.a();
      var9.a(7, In.g);
      var9.a(0.0D, (double)var2.getScaledHeight(), -90.0D).a((double)var4, (double)var7).endVertex();
      var9.a((double)var2.getScaledWidth(), (double)var2.getScaledHeight(), -90.0D).a((double)var6, (double)var7).endVertex();
      var9.a((double)var2.getScaledWidth(), 0.0D, -90.0D).a((double)var6, (double)var5).endVertex();
      var9.a(0.0D, 0.0D, -90.0D).a((double)var4, (double)var5).endVertex();
      var8.draw();
      By.a(true);
      By.j();
      By.d();
      By.c(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(int var1, int var2, float var3, Rn var4, Vh var5) {
      if (!var5.isEmpty()) {
         float var6 = (float)var5.c() - var3;
         if (var6 > 0.0F) {
            By.C();
            float var7 = 1.0F + var6 / 5.0F;
            By.c((float)(var1 + 8), (float)(var2 + 12), 0.0F);
            By.b(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            By.c((float)(-(var1 + 8)), (float)(-(var2 + 12)), 0.0F);
         }

         this.a.a((Oh)var4, var5, var1, var2);
         if (var6 > 0.0F) {
            By.D();
         }

         this.a.a(this.a.a, var5, var1, var2);
      }

   }

   public void b() {
      sE var1 = this.a;
      if (var1.a == null) {
         agB.a(var1.a(), var1.a(), var1.a.b);
      }

      if (this.b > 0) {
         --this.b;
      }

      if (this.d > 0) {
         --this.d;
         if (this.d <= 0) {
            this.b = "";
            this.c = "";
         }
      }

      ++this.a;
      if (this.a.a != null) {
         Vh var2 = this.a.a.a.a();
         if (var2.isEmpty()) {
            this.c = 0;
         } else if (!this.a.isEmpty() && var2.a() == this.a.a() && Vh.a(var2, this.a) && (var2.a() || var2.getMetadata() == this.a.getMetadata())) {
            if (this.c > 0) {
               --this.c;
            }
         } else {
            this.c = 40;
         }

         this.a = var2;
      }

   }

   public void a(String var1) {
      this.a(IK.a("record.nowPlaying", var1), true);
   }

   public void a(String var1, boolean var2) {
      this.a = var1;
      this.b = 60;
      this.a = var2;
   }

   public void a(String var1, String var2, int var3, int var4, int var5) {
      CallbackInfo var6 = new CallbackInfo("displayTitle", true);
      this.a(var1, var2, var3, var4, var5, var6);
      if (!var6.isCancelled()) {
         if (var1 == null && var2 == null && var3 < 0 && var4 < 0 && var5 < 0) {
            this.b = "";
            this.c = "";
            this.d = 0;
         } else if (var1 != null) {
            this.b = var1;
            this.d = this.e + this.f + this.g;
         } else if (var2 != null) {
            this.c = var2;
         } else {
            if (var3 >= 0) {
               this.e = var3;
            }

            if (var4 >= 0) {
               this.f = var4;
            }

            if (var5 >= 0) {
               this.g = var5;
            }

            if (this.d > 0) {
               this.d = this.e + this.f + this.g;
            }
         }

      }
   }

   public void a(adu var1, boolean var2) {
      this.a(var1.getUnformattedText(), var2);
   }

   public void a(adt var1, adu var2) {
      Iterator var3 = ((List)this.a.get(var1)).iterator();

      while(var3.hasNext()) {
         vD var4 = (vD)var3.next();
         var4.a(var1, var2);
      }

   }

   public ux a() {
      return this.b;
   }

   public int a() {
      return this.a;
   }

   public tI a() {
      return this.a.a;
   }

   public uW a() {
      return this.a;
   }

   public uD a() {
      return this.a;
   }

   public void c() {
      this.a.a();
      this.a.b();
      this.a.a().a();
   }

   public tK a() {
      return this.a;
   }

   protected void b(float var1) {
      sE var2 = this.a;
      vk var3 = var2.b();
      asE var4 = this.a();
      var4.a.a();
      var4.a.a(var2, var3, var2.a);
      au.BUS.fireAndForget(au.a(var1, (ScaledResolution)d.a(var3)));
      By.j();
      By.M();
   }

   private int a(tE var1) {
      return ((EntitySleepData)var1.a().a(asJ.f)).shouldApply() ? 0 : var1.getSleepTimer();
   }

   private boolean a(JN var1) {
      return var1.isKeyDown() && !((PlayerListRender)aD.BUS.fire(aD.a.a())).isCancelled();
   }

   private boolean a(Rn var1, si var2) {
      return var1.a((si)si.h) && !((AirBarRender)ao.BUS.fire(ao.a.a())).isCancelled();
   }

   private void a(uf var1, vk var2, float var3) {
      boolean var4 = !((HotbarRender)ax.BUS.fire(ax.a.a())).isCancelled();
      if (var4) {
         var1.a(var2, var3);
      }

   }

   private void a(uf var1, vk var2) {
      boolean var3 = !((PotionsRender)aE.BUS.fire(aE.a.a())).isCancelled();
      if (var3) {
         var1.a(var2);
      }

   }

   private void a(uf var1, vk var2, int var3) {
      boolean var4 = !((ExpBarRender)at.BUS.fire(at.a.a())).isCancelled();
      if (var4) {
         var1.b(var2, var3);
      }

   }

   protected boolean a() {
      return !((ArmorRender)ap.BUS.fire(ap.a.a())).isCancelled();
   }

   protected boolean b() {
      return !((HealthRender)aw.BUS.fire(aw.a.a())).isCancelled();
   }

   protected boolean c() {
      return !((HungerRender)ay.BUS.fire(ay.a.a())).isCancelled();
   }

   protected boolean d() {
      return !((VehicleHealthRender)aK.BUS.fire(aK.a.a())).isCancelled();
   }

   protected boolean e() {
      return !((JumpPowerRender)aA.BUS.fire(aA.a.a())).isCancelled();
   }

   private void a(String var1, String var2, int var3, int var4, int var5, CallbackInfo var6) {
      if (this.b) {
         var6.cancel();
      }

   }

   private asE a() {
      return ((ata)this.a).a();
   }

   public void a(boolean var1) {
      this.b = var1;
   }

   private void a(sE var1, CallbackInfo var2) {
      this.a = new hT((ChatOverlay)d.a(this.a));
   }

   public ChatOverlay getDefaultChatOverlay() {
      return this.a;
   }

   public ChatOverlay getChatOverlay() {
      ux var1 = this.b;
      return var1.getClass() == ux.class ? this.a : (ChatOverlay)d.a(var1);
   }

   public void setChatOverlay(ChatOverlay var1) {
      this.b = (ux)d.a(a(var1));
   }

   private static ChatOverlay a(ChatOverlay var0) {
      while(var0 instanceof hT) {
         var0 = ((hT)var0).a();
      }

      return var0;
   }

   public void a(float var1, vk var2, CallbackInfo var3) {
      if (this.a.c()) {
         var3.cancel();
      }

   }
}
