import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.entity.PlayerModelPart;
import dev.xdark.clientapi.inventory.Container;
import dev.xdark.clientapi.inventory.InventoryPlayer;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.nbt.NBTTagCompound;
import dev.xdark.clientapi.util.EnumHandSide;
import dev.xdark.clientapi.util.FoodStats;
import dev.xdark.feder.RecyclableArrayList;
import dev.xdark.feder.collection.CompactIterables;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.cristalix.core.datasync.EntityScaleData;
import ru.cristalix.core.datasync.EntitySleepData;
import ru.cristalix.core.math.V3;

public abstract class Rn extends Oh implements arp, EntityPlayer {
   public static final WB<Float> g;
   public static final WB<Integer> m;
   public static final WB<Byte> n;
   public static final WB<Byte> o;
   public static final WB<VR> p;
   public static final WB<VR> q;
   public Rs a;
   protected SK a;
   public RY a;
   public RY b;
   protected abZ a;
   protected int i;
   public float I;
   public float J;
   public int j;
   public double o;
   public double p;
   public double q;
   public double r;
   public double s;
   public double t;
   protected boolean m;
   public acV a;
   private int y;
   public float K;
   public float L;
   public float M;
   private acV b;
   private boolean o;
   public Ru a;
   public int k;
   public int l;
   public float N;
   protected int m;
   protected iT h;
   private int z;
   private GameProfile a;
   private boolean p;
   private Vh b;
   private final abz a;
   public RC a;
   public boolean n;
   private final ml a;
   private Set a;

   protected abz a() {
      return new abz();
   }

   public Rn(aej var1, GameProfile var2) {
      super(var1);
      if (this.h == null) {
         this.h = new iT(0.0F);
      }

      this.a = new mn();
      this.a = new Rs(this);
      this.a = new SK();
      this.a = new abZ();
      this.a = new Ru();
      this.h.a(iM.a(iM.a(-769634708) ^ iM.a(~iM.a(293365401))));
      this.b = Vh.a;
      this.a = this.a();
      this.setUniqueId(a(var2));
      this.a = var2;
      this.g();
      this.a = new Ss(this.a);
      this.b = this.a;
   }

   protected void a_() {
      super.a_();
      Oy var1 = this.a();
      var1.b(Ot.f).a(iM.a(iM.a(-1497519948747550789L) ^ iM.a(iM.a(3114312214973558852L) ^ -1L)));
      this.a((OC)Ot.d).a(iM.a(iM.a(5723557630567661912L) ^ iM.a(iM.a(-8131162054229115225L) ^ -1L)));
      var1.b(Ot.g);
      var1.b(Ot.j);
   }

   protected void l() {
      super.l();
      this.a.a((WB)g, (Object)0.0F);
      this.a.a((WB)m, (int)0);
      this.a.a((WB)n, (byte)0);
      this.a.a((WB)o, (byte)1);
      this.a.a((WB)p, (Object)(new VR()));
      this.a.a((WB)q, (Object)(new VR()));
      this.b(new CallbackInfo("entityInit", false));
   }

   public void a() {
      this.a(new CallbackInfo("onUpdate", false));
      boolean var1 = this.isSpectator();
      this.f.a(var1);
      if (var1) {
         this.a.a(false);
      }

      this.j = Math.max(this.j - 1, 0);
      if (this.isPlayerSleeping()) {
         this.y = Math.min(this.y + 1, 100);
      } else if (this.y > 0 && ++this.y >= 110) {
         this.y = 0;
      }

      super.a();
      if (this.isBurning() && this.a.a) {
         this.extinguish();
      }

      this.f();
      double var2 = this.d;
      double var4 = this.f;
      double var6 = adh.a(var2, -2.9999999E7D, 2.9999999E7D);
      double var8 = adh.a(var4, -2.9999999E7D, 2.9999999E7D);
      if (var6 != var2 || var8 != var4) {
         this.a(var6, this.e, var8);
      }

      ++this.r;
      Vh var10 = this.a();
      if (!Vh.b(this.b, var10)) {
         if (!Vh.d(this.b, var10)) {
            this.resetCooldown();
         }

         this.b = var10.isEmpty() ? Vh.a : var10;
      }

      this.a.a();
      this.H();
   }

   public boolean isOnLadder() {
      return !this.isSpectator() && super.isOnLadder();
   }

   private void f() {
      this.o = this.r;
      this.p = this.s;
      this.q = this.t;
      double var1 = this.d;
      double var3 = this.e;
      double var5 = this.f;
      double var7 = var1 - this.r;
      double var9 = var3 - this.s;
      double var11 = var5 - this.t;
      if (var7 > 10.0D) {
         this.r = var1;
         this.o = this.r;
      }

      if (var11 > 10.0D) {
         this.t = var5;
         this.q = this.t;
      }

      if (var9 > 10.0D) {
         this.s = var3;
         this.p = this.s;
      }

      if (var7 < -10.0D) {
         this.r = var1;
         this.o = this.r;
      }

      if (var11 < -10.0D) {
         this.t = var5;
         this.q = this.t;
      }

      if (var9 < -10.0D) {
         this.s = var3;
         this.p = this.s;
      }

      this.r += var7 * 0.25D;
      this.t += var11 * 0.25D;
      this.s += var9 * 0.25D;
   }

   protected final void H() {
      float var1;
      float var2;
      if (this.isElytraFlying()) {
         var1 = iM.a(iM.a(-1476362189) ^ iM.a(~iM.a(1759962710)));
         var2 = iM.a(iM.a(831081405) ^ iM.a(~iM.a(-244372008)));
      } else if (this.isPlayerSleeping()) {
         var1 = iM.a(iM.a(474301006) ^ iM.a(~iM.a(-571051652)));
         var2 = iM.a(iM.a(139487848) ^ iM.a(~iM.a(-907847334)));
      } else if (this.isSneaking()) {
         var1 = iM.a(iM.a(1875257389) ^ iM.a(~iM.a(-1356837304)));
         var2 = iM.a(iM.a(-766283127) ^ iM.a(~iM.a(310361669)));
      } else {
         var1 = iM.a(iM.a(1342580990) ^ iM.a(~iM.a(-1864348005)));
         var2 = iM.a(iM.a(344930320) ^ iM.a(~iM.a(-728325751)));
      }

      if (var1 != this.a.a() || var2 != this.b.a()) {
         acU var3 = this.b();
         var3 = new acU(var3.a, var3.b, var3.c, var3.a + (double)var1, var3.b + (double)var2, var3.c + (double)var1);
         if (!this.a.a(var3)) {
            this.setSize(var1, var2);
         }
      }

   }

   protected acJ a() {
      return RW.fL;
   }

   protected acJ b() {
      return RW.fK;
   }

   public int a() {
      return 10;
   }

   public void a(acJ var1, float var2, float var3) {
      this.a.a(this, this.d, this.e, this.f, var1, this.a(), var2, var3);
   }

   public acI a() {
      return acI.PLAYERS;
   }

   protected int c() {
      return 20;
   }

   public void a(byte var1) {
      if (var1 == 9) {
         this.E();
      } else if (var1 == 23) {
         this.p = false;
      } else if (var1 == 22) {
         this.p = true;
      } else {
         super.a(var1);
      }

   }

   public boolean v() {
      return super.v() || this.isPlayerSleeping();
   }

   protected void closeScreen() {
      this.b = this.a;
   }

   public void j() {
      float var1 = this.j;
      float var2 = this.k;
      super.j();
      this.I = this.J;
      this.J = 0.0F;
      if (this.c() instanceof QQ) {
         this.k = var2;
         this.j = var1;
         this.A = ((QQ)this.c()).A;
      }

   }

   public void I() {
      this.setSize(iM.a(iM.a(817687243) ^ iM.a(~iM.a(-262501202))), iM.a(iM.a(460783192) ^ iM.a(~iM.a(-613455935))));
      this.setHealth(this.getMaxHealth());
      this.q = 0;
   }

   public void m() {
      this.setSize(iM.a(iM.a(806995655) ^ iM.a(~iM.a(-251682654))), iM.a(iM.a(-1497294194) ^ iM.a(~iM.a(1725465367))));
      super.m();
      this.setHealth(this.getMaxHealth());
      this.q = 0;
   }

   protected void i() {
      this.A();
      this.C = this.j;
   }

   public void b() {
      if (this.i > 0) {
         --this.i;
      }

      this.a.a();
      this.I = this.J;
      super.b();
      OD var1 = this.a((OC)Ot.d);
      float var2 = this.h.a();
      float var3 = this.h.a();
      if (this.isSprinting()) {
         var3 = (float)((double)var3 + (double)var2 * iM.a(iM.a(-5385318521003070008L) ^ iM.a(iM.a(8462067551718564100L) ^ -1L)));
      }

      this.d.a(var3);
      this.setAIMoveSpeed((float)var1.b());
      float var4 = adh.a(this.a.a() * this.a.a() + this.c.a() * this.c.a());
      float var5 = (float)(Math.atan(-this.b.a() * 0.20000000298023224D) * 15.0D);
      var4 = Math.min(var4, 0.1F);
      boolean var6 = this.a.a();
      if (!var6 || this.getHealth() <= 0.0F) {
         var4 = 0.0F;
      }

      if (var6 || this.getHealth() <= 0.0F) {
         var5 = 0.0F;
      }

      this.J += (var4 - this.J) * 0.4F;
      this.z += (var5 - this.z) * 0.8F;
      if (this.getHealth() > 0.0F && !this.isSpectator()) {
         acU var7;
         if (this.isRiding() && !this.c().c) {
            var7 = this.d().b(this.c().b()).c(1.0D, 0.0D, 1.0D);
         } else {
            var7 = this.d().c(1.0D, 0.5D, 1.0D);
         }

         RecyclableArrayList var8 = this.a.b((NN)this, (acU)var7);

         for(int var9 = 0; var9 < var8.size(); ++var9) {
            NN var10 = (NN)var8.get(var9);
            if (!var10.c) {
               this.k(var10);
            }
         }

         var8.recycle();
      }

   }

   private void k(NN var1) {
      var1.a_(this);
   }

   public int getScore() {
      return (Integer)this.a.a(m);
   }

   public void setScore(int var1) {
      this.a.b(m, var1);
   }

   public void addScore(int var1) {
      int var2 = this.getScore();
      this.a.b(m, var2 + var1);
   }

   public void b(abD var1) {
      super.b(var1);
      this.setSize(0.2F, 0.2F);
      this.a(this.d, this.e, this.f);
      this.b.a(0.10000000149011612D);
      if (var1 != null) {
         float var2 = (this.s + this.j) * 0.017453292F;
         this.a.a((double)(-adh.b(var2) * 0.1F));
         this.c.a((double)(-adh.a(var2) * 0.1F));
      } else {
         this.a.a(0.0D);
         this.c.a(0.0D);
      }

      this.extinguish();
      this.a(0, false);
   }

   protected acJ a(abD var1) {
      if (var1 == abD.c) {
         return RW.fH;
      } else {
         return var1 == abD.h ? RW.fG : RW.fF;
      }
   }

   protected acJ d() {
      return RW.fE;
   }

   public Pm a(boolean var1) {
      return this.a(this.a.a(this.a.a, var1 && !this.a.a().isEmpty() ? this.a.a().getCount() : 1), false, true);
   }

   public Pm a(Vh var1, boolean var2) {
      return this.a(var1, false, var2);
   }

   public Pm a(Vh var1, boolean var2, boolean var3) {
      if (var1.isEmpty()) {
         return null;
      } else {
         double var4 = this.e - 0.30000001192092896D + (double)this.getEyeHeight();
         Pm var6 = new Pm(this.a, this.d, var4, this.f, var1);
         var6.setPickupDelay(40);
         if (var3) {
            var6.b(this.getName());
         }

         Random var13 = this.a;
         double var7;
         double var9;
         double var11;
         float var14;
         float var15;
         if (var2) {
            var14 = var13.nextFloat() * 0.5F;
            var15 = var13.nextFloat() * 6.2831855F;
            var7 = (double)(-adh.a(var15) * var14);
            var11 = (double)(adh.b(var15) * var14);
            var9 = 0.20000000298023224D;
         } else {
            var14 = 0.3F;
            var15 = this.j * 0.017453292F;
            float var16 = this.k * 0.017453292F;
            float var17 = adh.b(var16) * var14;
            var7 = (double)(-adh.a(var15) * var17);
            var11 = (double)(adh.b(var15) * var17);
            var9 = (double)(-adh.a(var16) * var14 + 0.1F);
            float var18 = var13.nextFloat() * 6.2831855F;
            var14 = 0.02F * var13.nextFloat();
            var7 += Math.cos((double)var18) * (double)var14;
            var9 += (double)((var13.nextFloat() - var13.nextFloat()) * 0.1F);
            var11 += Math.sin((double)var18) * (double)var14;
         }

         var6.a.a(var7);
         var6.b.a(var9);
         var6.c.a(var11);
         this.a(var6);
         return var6;
      }
   }

   public Vh a(Pm var1) {
      this.a.a((NN)var1);
      return var1.a();
   }

   public float a(sD var1) {
      float var2 = this.a.a(var1);
      if (var2 > iM.a(iM.a(-467563675) ^ iM.a(~iM.a(610170010)))) {
         int var3 = Nh.e(this);
         Vh var4 = this.a();
         if (var3 > 0 && !var4.isEmpty()) {
            var2 += (float)(var3 * var3 + 1);
         }
      }

      if (this.a((ZV)RU.c)) {
         var2 *= iM.a(iM.a(941718236) ^ iM.a(~iM.a(-128023261))) + (float)(this.b((ZV)RU.c).getAmplifier() + 1) * iM.a(iM.a(-934756983) ^ iM.a(~iM.a(167481019)));
      }

      if (this.a((ZV)RU.d)) {
         float var5;
         switch(this.b((ZV)RU.d).getAmplifier()) {
         case 0:
            var5 = iM.a(iM.a(684620467) ^ iM.a(~iM.a(-374858538)));
            break;
         case 1:
            var5 = iM.a(iM.a(-1897818075) ^ iM.a(~iM.a(1285961270)));
            break;
         case 2:
            var5 = iM.a(iM.a(-978007946) ^ iM.a(~iM.a(24888821)));
            break;
         case 3:
         default:
            var5 = iM.a(iM.a(1026531976) ^ iM.a(~iM.a(-125564071)));
         }

         var2 *= var5;
      }

      if (this.a((si)si.h) && !Nh.a((Oh)this)) {
         var2 /= iM.a(iM.a(-106021522) ^ iM.a(~iM.a(1190249105)));
      }

      if (!this.a.a()) {
         var2 /= iM.a(iM.a(-2005424885) ^ iM.a(~iM.a(925391604)));
      }

      return var2;
   }

   public boolean a(sD var1) {
      return this.a.a(var1);
   }

   public void b(VR var1) {
      super.b(var1);
      this.setUniqueId(a(this.a));
      VZ var2 = var1.a("Inventory", (int)10);
      this.a.a(var2);
      this.a.a = var1.getInteger("SelectedItemSlot");
      this.m = var1.getBoolean("Sleeping");
      this.y = var1.getShort("SleepTimer");
      this.N = var1.getFloat("XpP");
      this.k = var1.getInteger("XpLevel");
      this.l = var1.getInteger("XpTotal");
      this.m = var1.getInteger("XpSeed");
      if (this.m == 0) {
         this.m = this.a.nextInt();
      }

      this.setScore(var1.getInteger("Score"));
      if (this.m) {
         this.a = new acV(this);
         this.a(true, true, false);
      }

      if (var1.a("SpawnX", (int)99) && var1.a("SpawnY", (int)99) && var1.a("SpawnZ", (int)99)) {
         this.b = new acV(var1.getInteger("SpawnX"), var1.getInteger("SpawnY"), var1.getInteger("SpawnZ"));
         this.o = var1.getBoolean("SpawnForced");
      }

      this.a.a(var1);
      this.a.b(var1);
      if (var1.a("EnderItems", (int)9)) {
         VZ var3 = var1.a("EnderItems", (int)10);
         this.a.a(var3);
      }

      if (var1.a("ShoulderEntityLeft", (int)10)) {
         this.c(var1.a("ShoulderEntityLeft"));
      }

      if (var1.a("ShoulderEntityRight", (int)10)) {
         this.d(var1.a("ShoulderEntityRight"));
      }

   }

   public boolean a(abD var1, float var2) {
      if (this.a((abD)var1)) {
         return false;
      } else if (this.a.a && !var1.c()) {
         return false;
      } else {
         this.u = 0;
         if (this.getHealth() > 0.0F) {
            this.K();
         }

         return false;
      }
   }

   public boolean b(Rn var1) {
      aap var2 = this.a();
      aap var3 = var1.a();
      if (var2 == null) {
         return true;
      } else {
         return !var2.a(var3) || var2.a();
      }
   }

   public float getArmorVisibility() {
      int var1 = 0;
      acz var2 = this.a.b;
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         Vh var5 = (Vh)var2.get(var3);
         if (!var5.isEmpty()) {
            ++var1;
         }
      }

      return (float)var1 / (float)this.a.b.size();
   }

   public void a(abn var1) {
   }

   public void a(aaA var1) {
   }

   public void a(aaO var1) {
   }

   public void a(abp var1) {
   }

   public void a(Oo var1) {
   }

   public void a(SE var1) {
   }

   public void a(Qz var1, SE var2) {
   }

   public void a(aed var1) {
   }

   public void a(Vh var1, abU var2) {
   }

   public abN a(NN var1, abU var2) {
      if (this.isSpectator()) {
         if (var1 instanceof SE) {
            this.a((SE)var1);
         }

         return abN.PASS;
      } else {
         Vh var3 = this.a((abU)var2);
         Vh var4 = var3.isEmpty() ? Vh.a : var3.a();
         if (var1.a(this, var2)) {
            if (this.a.d && var3 == this.a((abU)var2) && var3.getCount() < var4.getCount()) {
               var3.setCount(var4.getCount());
            }

            return abN.SUCCESS;
         } else {
            if (!var3.isEmpty() && var1 instanceof Oh) {
               if (this.a.d) {
                  var3 = var4;
               }

               if (var3.a(this, (Oh)var1, var2)) {
                  if (var3.isEmpty() && !this.a.d) {
                     this.a((abU)var2, (Vh)Vh.a);
                  }

                  return abN.SUCCESS;
               }
            }

            return abN.PASS;
         }
      }
   }

   public double getYOffset() {
      return -0.35D;
   }

   public void dismountRidingEntity() {
      super.dismountRidingEntity();
      this.a = 0;
   }

   public void j(NN var1) {
      if (var1.j() && !var1.f(this)) {
         float var2 = (float)this.a((OC)Ot.f).b();
         float var3;
         if (var1 instanceof Oh) {
            var3 = Nh.a(this.a(), ((Oh)var1).a());
         } else {
            var3 = Nh.a(this.a(), Oj.UNDEFINED);
         }

         float var4 = this.c(0.5F);
         var2 *= 0.2F + var4 * var4 * 0.8F;
         var3 *= var4;
         this.resetCooldown();
         if (var2 > 0.0F || var3 > 0.0F) {
            boolean var5 = var4 > 0.9F;
            boolean var6 = false;
            int var7 = Nh.a((Oh)this);
            if (this.isSprinting() && var5) {
               ++var7;
               var6 = true;
            }

            boolean var8 = var5 && this.q > 0.0F && !this.a.a() && !this.isOnLadder() && !this.isInWater() && !this.a((ZV)RU.o) && !this.isRiding() && var1 instanceof Oh;
            var8 = var8 && !this.isSprinting();
            if (var8) {
               var2 *= 1.5F;
            }

            var2 += var3;
            boolean var9 = false;
            double var10 = (double)(this.o - this.n);
            if (var5 && !var8 && !var6 && this.a.a() && var10 < (double)this.getAIMoveSpeed()) {
               Vh var12 = this.a((abU)abU.MAIN_HAND);
               if (var12.a() instanceof LM) {
                  var9 = true;
               }
            }

            boolean var19 = false;
            int var13 = Nh.b((Oh)this);
            if (var1 instanceof Oh && var13 > 0 && !var1.isBurning()) {
               var19 = true;
               var1.setFire(1);
            }

            boolean var14 = var1.a(abD.a(this), var2);
            if (var14) {
               if (var7 > 0) {
                  if (var1 instanceof Oh) {
                     ((Oh)var1).a((float)var7 * 0.5F, (double)adh.a(this.j * 0.017453292F), (double)(-adh.b(this.j * 0.017453292F)));
                  } else {
                     var1.b((double)(-adh.a(this.j * 0.017453292F) * (float)var7 * 0.5F), 0.1D, (double)(adh.b(this.j * 0.017453292F) * (float)var7 * 0.5F));
                  }

                  this.a.a(this.a.a() * iM.a(iM.a(2509671359563155451L) ^ iM.a(iM.a(-2105177727060997321L) ^ -1L)));
                  this.c.a(this.c.a() * iM.a(iM.a(2450342542581750452L) ^ iM.a(iM.a(-2153405327443224968L) ^ -1L)));
                  this.setSprinting(false);
               }

               if (var9) {
                  float var15 = 1.0F + Nh.a((Oh)this) * var2;
                  RecyclableArrayList var16 = this.a.a(Oh.class, var1.b().d(1.0D, 0.25D, 1.0D));
                  ObjectListIterator var17 = var16.iterator();

                  while(var17.hasNext()) {
                     Oh var18 = (Oh)var17.next();
                     if (var18 != this && var18 != var1 && !this.d(var18) && this.a((NN)var18) < 9.0D) {
                        var18.a(0.4F, (double)adh.a(this.j * 0.017453292F), (double)(-adh.b(this.j * 0.017453292F)));
                        var18.a(abD.a(this), var15);
                     }
                  }

                  var16.recycle();
                  this.J();
               }

               if (var8) {
                  this.a(var1);
               }

               if (var3 > 0.0F) {
                  this.b(var1);
               }

               this.i(var1);
               if (var1 instanceof Oh) {
                  Nh.a((Oh)((Oh)var1), (NN)this);
               }

               Nh.b(this, var1);
               Vh var20 = this.a();
               Object var21 = var1;
               if (var1 instanceof Or) {
                  Ol var22 = ((Or)var1).a;
                  if (var22 instanceof Oh) {
                     var21 = (Oh)var22;
                  }
               }

               if (!var20.isEmpty() && var21 instanceof Oh) {
                  var20.a((Oh)var21, this);
                  if (var20.isEmpty()) {
                     this.a((abU)abU.MAIN_HAND, (Vh)Vh.a);
                  }
               }

               if (var1 instanceof Oh && var13 > 0) {
                  var1.setFire(var13 * 4);
               }
            } else if (var19) {
               var1.extinguish();
            }
         }
      }

   }

   public void a(NN var1) {
   }

   public void b(NN var1) {
   }

   public void J() {
   }

   public void c() {
   }

   public void n() {
      super.n();
      this.a.a(this);
      if (this.b != null) {
         this.b.a(this);
      }

   }

   public boolean isEntityInsideOpaqueBlock() {
      return !this.m && super.isEntityInsideOpaqueBlock();
   }

   public boolean isUser() {
      return false;
   }

   public GameProfile getGameProfile() {
      return this.a;
   }

   public void setGameProfile(GameProfile var1) {
      this.a = var1;
      this.g();
   }

   public Rq a(abP var1, acV var2) {
      if (this.isRiding()) {
         this.dismountRidingEntity();
      }

      this.K();
      this.setSize(iM.a(iM.a(1448066326) ^ iM.a(~iM.a(-1745056220))), iM.a(iM.a(1532374483) ^ iM.a(~iM.a(-1696260383))));
      float var3 = iM.a(iM.a(514049328) ^ iM.a(~iM.a(-564380977))) + (float)var1.getXOffset() * iM.a(iM.a(1452052263) ^ iM.a(~iM.a(-1749042155)));
      float var4 = iM.a(iM.a(-1515383327) ^ iM.a(~iM.a(1699932702))) + (float)var1.getZOffset() * iM.a(iM.a(-663662807) ^ iM.a(~iM.a(423787547)));
      this.a(var1);
      this.a((double)((float)var2.a + var3), (double)((float)var2.b + iM.a(iM.a(-362928134) ^ iM.a(~iM.a(714201093)))), (double)((float)var2.c + var4));
      this.m = true;
      this.y = 0;
      this.a = var2;
      this.a.a(0.0D);
      this.b.a(0.0D);
      this.c.a(0.0D);
      return Rq.OK;
   }

   public Rq a(acV var1) {
      return this.a((abP)this.a.a(var1).a((so)oV.a), var1);
   }

   public void a(abP var1) {
      this.K = -1.8F * (float)var1.getXOffset();
      this.M = -1.8F * (float)var1.getZOffset();
   }

   public void setRenderOffset(float var1, float var2, float var3) {
      this.K = var1;
      this.L = var2;
      this.M = var3;
   }

   public void setRenderOffsetForSleep(float var1, float var2) {
      this.K = var1;
      this.M = var2;
   }

   public void a(boolean var1, boolean var2, boolean var3) {
      this.setSize(iM.a(iM.a(-1723305881) ^ iM.a(~iM.a(1504581122))), iM.a(iM.a(1030106084) ^ iM.a(~iM.a(-41962883))));
      if (this.a != null) {
         sD var4 = this.a.a(this.a);
         if (var4.a() == RQ.a) {
            this.a.a((acV)this.a, (sD)var4.a(nk.a, Boolean.FALSE), 4);
            acV var5 = nk.a(this.a, this.a, 0);
            if (var5 == null) {
               var5 = this.a.a();
            }

            this.a((double)((float)var5.a + iM.a(iM.a(-880459709) ^ iM.a(~iM.a(192593852)))), (double)((float)var5.b + iM.a(iM.a(-809827814) ^ iM.a(~iM.a(227029288)))), (double)((float)var5.c + iM.a(iM.a(-822708419) ^ iM.a(~iM.a(235505858)))));
         }
      }

      this.m = false;
      this.y = var1 ? 0 : 100;
      if (var3) {
         this.b(this.a, false);
      }

   }

   public boolean isInBed() {
      return this.a.a(this.a).a() == RQ.a;
   }

   public static acV a(aej var0, acV var1, boolean var2) {
      nh var3 = var0.a(var1).a();
      if (var3 != RQ.a) {
         if (!var2) {
            return null;
         } else {
            boolean var4 = var3.d();
            boolean var5 = var0.a(var1.a()).a().d();
            return var4 && var5 ? var1 : null;
         }
      } else {
         return nk.a(var0, var1, 0);
      }
   }

   public float g() {
      // $FF: Couldn't be decompiled
   }

   public boolean isPlayerSleeping() {
      return this.m;
   }

   public boolean isPlayerFullyAsleep() {
      return this.m && this.y >= 100;
   }

   public int getSleepTimer() {
      return this.y;
   }

   public void a(adu var1, boolean var2) {
   }

   public acV b() {
      return this.b;
   }

   public boolean s() {
      return this.o;
   }

   public void b(acV var1, boolean var2) {
      if (var1 != null) {
         this.b = var1;
         this.o = var2;
      } else {
         this.b = null;
         this.o = false;
      }

   }

   public void jump() {
      super.jump();
   }

   public void travel(float var1, float var2, float var3) {
      if (this.a.b && !this.isRiding()) {
         double var4 = this.b.a();
         float var6 = this.d.a();
         this.d.a(this.a.a() * (this.isSprinting() ? iM.a(iM.a(629931561) ^ iM.a(~iM.a(-1703673386))) : iM.a(iM.a(826031128) ^ iM.a(~iM.a(-247217177)))));
         super.travel(var1, var2, var3);
         this.b.a(var4 * iM.a(iM.a(-2721467971172927161L) ^ iM.a(iM.a(1884663536839210379L) ^ -1L)));
         this.d.a(var6);
         this.q = 0.0F;
         this.a(7, false);
      } else {
         super.travel(var1, var2, var3);
      }

   }

   public float getAIMoveSpeed() {
      return (float)this.a((OC)Ot.d).b();
   }

   public void c(float var1, float var2) {
      if (!this.a.c) {
         super.c(var1, var2);
      }

   }

   protected void t() {
      if (!this.isSpectator()) {
         super.t();
      }

   }

   protected acJ a(int var1) {
      return var1 > 4 ? RW.fB : RW.fJ;
   }

   public void a(Oh var1) {
   }

   public void setInWeb() {
      if (!this.a.b) {
         super.setInWeb();
      }

   }

   public void addExperience(int var1) {
      this.addScore(var1);
      int var2 = Integer.MAX_VALUE - this.l;
      if (var1 > var2) {
         var1 = var2;
      }

      this.N += (float)var1 / (float)this.xpBarCap();

      for(this.l += var1; this.N >= 1.0F; this.N /= (float)this.xpBarCap()) {
         this.N = (this.N - 1.0F) * (float)this.xpBarCap();
         this.addExperienceLevel(1);
      }

   }

   public int d() {
      return this.m;
   }

   public void b(Vh var1, int var2) {
      this.k -= var2;
      if (this.k < 0) {
         this.k = 0;
         this.N = 0.0F;
         this.l = 0;
      }

      this.m = this.a.nextInt();
   }

   public void addExperienceLevel(int var1) {
      this.k += var1;
      if (this.k < 0) {
         this.k = 0;
         this.N = 0.0F;
         this.l = 0;
      }

      if (var1 > 0 && this.k % 5 == 0 && (float)this.z < (float)this.b - 100.0F) {
         this.z = this.b;
      }

   }

   public int xpBarCap() {
      if (this.k >= 30) {
         return 112 + (this.k - 30) * 9;
      } else {
         return this.k >= 15 ? 37 + (this.k - 15) * 5 : 7 + this.k * 2;
      }
   }

   public abZ a() {
      return this.a;
   }

   public boolean canEat(boolean var1) {
      return (var1 || this.a.needFood()) && !this.a.a;
   }

   public boolean shouldHeal() {
      return this.getHealth() > 0.0F && this.getHealth() < this.getMaxHealth();
   }

   public boolean isAllowEdit() {
      return this.a.a.a();
   }

   public boolean a(acV var1, abP var2, Vh var3) {
      if (this.a.a.a()) {
         return true;
      } else if (var3.isEmpty()) {
         return false;
      } else {
         acV var4 = var1.a(var2.a());
         nh var5 = this.a.a(var4).a();
         return var3.b(var5) || var3.d();
      }
   }

   protected int a(Rn var1) {
      if (!this.isSpectator()) {
         int var2 = this.k * 7;
         return Math.min(var2, 100);
      } else {
         return 0;
      }
   }

   protected boolean u() {
      return true;
   }

   public boolean getAlwaysRenderNameTagForRender() {
      return true;
   }

   protected boolean d() {
      return !this.a.b;
   }

   public void e() {
   }

   public String getName() {
      return this.a.getName();
   }

   public SK a() {
      return this.a;
   }

   public Vh a(SB var1) {
      if (var1 == SB.MAINHAND) {
         return this.a.a();
      } else if (var1 == SB.OFFHAND) {
         return (Vh)this.a.c.get(0);
      } else {
         return var1.a() == SC.ARMOR ? (Vh)this.a.b.get(var1.getIndex()) : Vh.a;
      }
   }

   public void a(SB var1, Vh var2) {
      if (var1 == SB.MAINHAND) {
         this.a_(var2);
         this.a.a.set(this.a.a, var2);
      } else if (var1 == SB.OFFHAND) {
         this.a_(var2);
         this.a.c.set(0, var2);
      } else if (var1.a() == SC.ARMOR) {
         this.a_(var2);
         this.a.b.set(var1.getIndex(), var2);
      }

   }

   public boolean a(Vh var1) {
      this.a_(var1);
      return this.a.a(var1);
   }

   public Iterable<Vh> getHeldEquipment() {
      return CompactIterables.newList(this.a(), this.b());
   }

   public Iterable<Vh> getArmorInventoryList() {
      return this.a.b;
   }

   protected void K() {
      this.c(new VR());
      this.d(new VR());
   }

   public boolean a(Rn var1) {
      if (!this.isInvisible()) {
         return false;
      } else if (var1.isSpectator()) {
         return false;
      } else {
         aap var2 = this.a();
         return var2 == null || var1 == null || var1.a() != var2 || !var2.b();
      }
   }

   public abstract boolean isSpectator();

   public abstract boolean isCreative();

   public boolean o() {
      return !this.a.b;
   }

   public aao a() {
      return this.a.a();
   }

   public aap a() {
      return this.a().c(this.getName());
   }

   public adu a() {
      adD var1 = new adD(aan.a(this.a(), this.getName()));
      var1.a().a(new adI(adJ.SUGGEST_COMMAND, "/msg " + this.getName() + ' '));
      var1.a().a(this.a());
      var1.a().a(this.getName());
      return var1;
   }

   public float getEyeHeight() {
      float var1 = iM.a(iM.a(-1226123030) ^ iM.a(~iM.a(1994029884)));
      if (this.isPlayerSleeping()) {
         var1 = iM.a(iM.a(-1517256318) ^ iM.a(~iM.a(1680061104)));
      } else if (!this.isSneaking() && this.b.a() != iM.a(iM.a(998378736) ^ iM.a(~iM.a(-72433604)))) {
         if (this.isElytraFlying() || this.b.a() == iM.a(iM.a(1628063450) ^ iM.a(~iM.a(-1578360641)))) {
            var1 = iM.a(iM.a(-1241324293) ^ iM.a(~iM.a(1999755209)));
         }
      } else {
         var1 -= iM.a(iM.a(-1290431909) ^ iM.a(~iM.a(1900657326)));
      }

      return this.d(var1);
   }

   public void setAbsorptionAmount(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.a().b(g, var1);
   }

   public float getAbsorptionAmount() {
      return (Float)this.a().a(g);
   }

   public static UUID a(GameProfile var0) {
      UUID var1 = var0.getId();
      if (var1 == null) {
         var1 = a(var0.getName());
      }

      return var1;
   }

   public static UUID a(String var0) {
      return UUID.nameUUIDFromBytes(("OfflinePlayer:" + var0).getBytes(StandardCharsets.UTF_8));
   }

   public boolean a(Rr var1) {
      return ((Byte)this.a().a(n) & var1.a()) == var1.a();
   }

   public void a(Rr var1) {
      WS var2 = this.a();
      var2.b(n, (byte)((Byte)var2.a(n) | var1.a()));
   }

   public boolean a(int var1, Vh var2) {
      if (var1 >= 0 && var1 < this.a.a.size()) {
         this.a.a(var1, var2);
         return true;
      } else {
         SB var3;
         if (var1 == 100 + SB.HEAD.getIndex()) {
            var3 = SB.HEAD;
         } else if (var1 == 100 + SB.CHEST.getIndex()) {
            var3 = SB.CHEST;
         } else if (var1 == 100 + SB.LEGS.getIndex()) {
            var3 = SB.LEGS;
         } else if (var1 == 100 + SB.FEET.getIndex()) {
            var3 = SB.FEET;
         } else {
            var3 = null;
         }

         if (var1 == 98) {
            this.a(SB.MAINHAND, var2);
            return true;
         } else if (var1 == 99) {
            this.a(SB.OFFHAND, var2);
            return true;
         } else if (var3 == null) {
            int var4 = var1 - 200;
            if (var4 >= 0 && var4 < this.a.getSizeInventory()) {
               this.a.a(var4, var2);
               return true;
            } else {
               return false;
            }
         } else {
            if (!var2.isEmpty()) {
               if (!(var2.a() instanceof TA) && !(var2.a() instanceof Uc)) {
                  if (var3 != SB.HEAD) {
                     return false;
                  }
               } else if (Of.a(var2) != var3) {
                  return false;
               }
            }

            this.a.a(var3.getIndex() + this.a.a.size(), var2);
            return true;
         }
      }
   }

   public boolean hasReducedDebug() {
      return this.p;
   }

   public void setReducedDebug(boolean var1) {
      this.p = var1;
   }

   public abV a() {
      return (Byte)this.a.a(o) == 0 ? abV.LEFT : abV.RIGHT;
   }

   public void a(abV var1) {
      this.a.b(o, (byte)(var1 == abV.LEFT ? 0 : 1));
   }

   public VR a() {
      return (VR)this.a.a(p);
   }

   private VR c() {
      return this.a();
   }

   public void c(VR var1) {
      this.a.b(p, var1);
   }

   public VR b() {
      return (VR)this.a.a(q);
   }

   private VR d() {
      return this.b();
   }

   public void d(VR var1) {
      this.a.b(q, var1);
   }

   public float getCooldownPeriod() {
      return (float)(1.0D / this.a((OC)Ot.g).b() * 20.0D);
   }

   public float c(float var1) {
      return adh.a(((float)this.r + var1) / this.getCooldownPeriod(), 0.0F, 1.0F);
   }

   public void resetCooldown() {
      this.r = 0;
   }

   public abz b() {
      return this.a;
   }

   public void c(NN var1) {
      if (!this.isPlayerSleeping()) {
         super.c((NN)var1);
      }

   }

   public float getLuck() {
      return (float)this.a((OC)Ot.j).b();
   }

   public boolean x() {
      return this.a.d && this.a(2, "");
   }

   private void g() {
      this.n = "deadmau5".equals(this.a.getName());
   }

   static {
      g = WS.a(Rn.class, WD.c);
      m = WS.a(Rn.class, WD.b);
      n = WS.a(Rn.class, WD.a);
      o = WS.a(Rn.class, WD.a);
      p = WS.a(Rn.class, WD.n);
      q = WS.a(Rn.class, WD.n);
   }

   private void b(CallbackInfo var1) {
      WS var2 = this.a;
      var2.a((WB)asJ.c, (Object)null);
      var2.a((WB)asJ.f, (Object)EntitySleepData.DEFAULT);
   }

   protected float d(float var1) {
      EntityScaleData var2 = (EntityScaleData)this.a().a(asJ.a);
      return var2.shouldApply() ? (float)((double)var1 * var2.getY()) : var1;
   }

   public void a(WB var1) {
      if (asJ.f.equals(var1)) {
         EntitySleepData var2 = (EntitySleepData)this.a().a(asJ.f);
         if (!var2.shouldApply()) {
            this.a(true, false, false);
         } else {
            V3 var3 = var2.getPos();
            this.a(abP.VALUES[var2.getFacing()], new acV(var3.getX(), var3.getY(), var3.getZ()));
         }
      }

      super.a(var1);
   }

   private Comparable a(sD var1, so var2) {
      if (var2 == oV.a) {
         EntitySleepData var3 = (EntitySleepData)this.a().a(asJ.f);
         if (var3.shouldApply()) {
            return abP.VALUES[var3.getFacing()];
         }
      }

      nh var5 = var1.a();
      if (var5 != RQ.a) {
         acV var4 = this.a;
         sE.a.warn("Prevent render crash, expected bed at: {},{},{} but got: {}", var4.a, var4.b, var4.c, var5.getLocalizedName());
         return abP.WEST;
      } else {
         return var1.a(var2);
      }
   }

   public boolean addItemStackToInventory(ItemStack var1) {
      return this.a((Vh)d.a(var1));
   }

   public boolean isWearing(PlayerModelPart var1) {
      return this.a((Rr)d.a(var1));
   }

   public void setPrimaryHand(EnumHandSide var1) {
      this.a((abV)d.a(var1));
   }

   public NBTTagCompound getLeftShoulderEntity() {
      return (NBTTagCompound)d.a(this.c());
   }

   public void setLeftShoulderEntity(NBTTagCompound var1) {
      this.c((VR)d.a(var1));
   }

   public NBTTagCompound getRightShoulderEntity() {
      return (NBTTagCompound)d.a(this.d());
   }

   public void setRightShoulderEntity(NBTTagCompound var1) {
      this.d((VR)d.a(var1));
   }

   public void setWearing(PlayerModelPart var1) {
      this.a((Rr)d.a(var1));
   }

   public InventoryPlayer getInventory() {
      return (InventoryPlayer)d.a(this.a);
   }

   public Container getOpenContainer() {
      return (Container)d.a(this.b);
   }

   public void setExperienceLevel(int var1) {
      this.k = var1;
   }

   public void setExperienceTotal(int var1) {
      this.l = var1;
   }

   public void setExperience(float var1) {
      this.N = var1;
   }

   public FoodStats getFoodStats() {
      return (FoodStats)d.a(this.a);
   }

   public void a(CallbackInfo var1) {
      this.a.a(this);
   }

   public ml a() {
      return this.a;
   }

   public Set a() {
      return this.a;
   }

   public void a(Set var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public int getExperienceLevel() {
      return this.k;
   }

   // $FF: synthetic method
   public int getExperienceTotal() {
      return this.l;
   }

   // $FF: synthetic method
   public float getExperience() {
      return this.N;
   }
}
