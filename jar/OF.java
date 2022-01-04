import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityLiving;
import dev.xdark.clientapi.item.ItemStack;
import java.util.Arrays;
import java.util.UUID;

public abstract class Of extends Oh implements EntityLiving {
   public static final WB<Byte> g;
   public int l;
   protected int m;
   private final Ov a = new Ov(this);
   protected Ow a = new Ow(this);
   private final NV a = this.a();
   private Oh a;
   public final acz<Vh> a;
   protected float[] a;
   public final acz<Vh> b;
   protected float[] b;
   private boolean m;
   private boolean n;
   private boolean o;
   private NN b;
   private UUID b;
   private String b;

   public Of(aej var1) {
      super(var1);
      this.a = acz.a(2, Vh.a);
      this.a = new float[2];
      this.b = acz.a(4, Vh.a);
      this.b = new float[4];
      this.b = null;
      this.b = null;
      Arrays.fill(this.b, 0.085F);
      Arrays.fill(this.a, 0.085F);
   }

   protected void a_() {
      super.a_();
      this.a().b(Ot.b).a(16.0D);
   }

   protected NV a() {
      return new NV(this);
   }

   public Ov a() {
      return this.a;
   }

   public Oh a() {
      return this.a;
   }

   public void b(Oh var1) {
      this.a = var1;
   }

   public boolean a(Class<? extends Oh> var1) {
      return var1 != PP.class;
   }

   protected void l() {
      super.l();
      this.a.a((WB)g, (byte)0);
   }

   public int getTalkInterval() {
      return 80;
   }

   public void playLivingSound() {
      acJ var1 = this.c();
      if (var1 != null) {
         this.a(var1, this.c(), this.d());
      }

   }

   public void o() {
      super.o();
      if (this.isEntityAlive() && this.a.nextInt(1000) < this.l++) {
         this.f();
         this.playLivingSound();
      }

   }

   protected void a(abD var1) {
      this.f();
      super.a(var1);
   }

   private void f() {
      this.l = -this.getTalkInterval();
   }

   protected int a(Rn var1) {
      if (this.m > 0) {
         int var2 = this.m;

         int var3;
         for(var3 = 0; var3 < this.b.size(); ++var3) {
            if (!((Vh)this.b.get(var3)).isEmpty() && this.b[var3] <= 1.0F) {
               var2 += 1 + this.a.nextInt(3);
            }
         }

         for(var3 = 0; var3 < this.a.size(); ++var3) {
            if (!((Vh)this.a.get(var3)).isEmpty() && this.a[var3] <= 1.0F) {
               var2 += 1 + this.a.nextInt(3);
            }
         }

         return var2;
      } else {
         return this.m;
      }
   }

   public void spawnExplosionParticle() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.a.nextGaussian() * 0.02D;
         double var4 = this.a.nextGaussian() * 0.02D;
         double var6 = this.a.nextGaussian() * 0.02D;
         this.a.a(abW.EXPLOSION_NORMAL, this.d + (double)(this.a.nextFloat() * this.a.a() * 2.0F) - (double)this.a.a() - var2 * 10.0D, this.e + (double)(this.a.nextFloat() * this.b.a()) - var4 * 10.0D, this.f + (double)(this.a.nextFloat() * this.a.a() * 2.0F) - (double)this.a.a() - var6 * 10.0D, var2, var4, var6);
      }

   }

   public void a(byte var1) {
      if (var1 == 20) {
         this.spawnExplosionParticle();
      } else {
         super.a(var1);
      }

   }

   public void a() {
      if (afT.af() && this.x()) {
         this.g();
      } else {
         super.a();
      }

   }

   protected float a(float var1, float var2) {
      this.a.a();
      return var2;
   }

   protected acJ c() {
      return null;
   }

   public void b(VR var1) {
      super.b(var1);
      if (var1.a("CanPickUpLoot", (int)1)) {
         this.d(var1.getBoolean("CanPickUpLoot"));
      }

      this.n = var1.getBoolean("PersistenceRequired");
      VZ var2;
      int var3;
      if (var1.a("ArmorItems", (int)9)) {
         var2 = var1.a("ArmorItems", (int)10);

         for(var3 = 0; var3 < this.b.size(); ++var3) {
            this.b.set(var3, new Vh(var2.a(var3)));
         }
      }

      if (var1.a("HandItems", (int)9)) {
         var2 = var1.a("HandItems", (int)10);

         for(var3 = 0; var3 < this.a.size(); ++var3) {
            this.a.set(var3, new Vh(var2.a(var3)));
         }
      }

      if (var1.a("ArmorDropChances", (int)9)) {
         var2 = var1.a("ArmorDropChances", (int)5);

         for(var3 = 0; var3 < var2.a(); ++var3) {
            this.b[var3] = var2.a(var3);
         }
      }

      if (var1.a("HandDropChances", (int)9)) {
         var2 = var1.a("HandDropChances", (int)5);

         for(var3 = 0; var3 < var2.a(); ++var3) {
            this.a[var3] = var2.a(var3);
         }
      }

      this.o = var1.getBoolean("Leashed");
      this.setLeftHanded(var1.getBoolean("LeftHanded"));
      this.setNoAI(var1.getBoolean("NoAI"));
   }

   public void setMoveForward(float var1) {
      this.g.a(var1);
   }

   public void setMoveVertical(float var1) {
      this.f.a(var1);
   }

   public void setMoveStrafing(float var1) {
      this.e.a(var1);
   }

   public void setAIMoveSpeed(float var1) {
      super.setAIMoveSpeed(var1);
      this.setMoveForward(var1);
   }

   public void b() {
      super.b();
   }

   public boolean a(Vh var1) {
      return true;
   }

   public boolean canDespawn() {
      return true;
   }

   public void despawnEntity() {
      if (this.n) {
         this.u = 0;
      } else {
         Rn var1 = this.a.a(this, -1.0D);
         if (var1 != null) {
            double var2 = var1.d - this.d;
            double var4 = var1.e - this.e;
            double var6 = var1.f - this.f;
            double var8 = var2 * var2 + var4 * var4 + var6 * var6;
            if (this.canDespawn() && var8 > 16384.0D) {
               this.n();
            }

            if (this.u > 600 && this.a.nextInt(800) == 0 && var8 > 1024.0D && this.canDespawn()) {
               this.n();
            } else if (var8 < 1024.0D) {
               this.u = 0;
            }
         }
      }

   }

   public int getVerticalFaceSpeed() {
      return 40;
   }

   public int getHorizontalFaceSpeed() {
      return 10;
   }

   public void a(NN var1, float var2, float var3) {
      double var4 = var1.d - this.d;
      double var6 = var1.f - this.f;
      double var8;
      if (var1 instanceof Oh) {
         Oh var10 = (Oh)var1;
         var8 = var10.e + (double)var10.getEyeHeight() - (this.e + (double)this.getEyeHeight());
      } else {
         var8 = (var1.b().b + var1.b().e) / 2.0D - (this.e + (double)this.getEyeHeight());
      }

      double var14 = (double)adh.a(var4 * var4 + var6 * var6);
      float var12 = (float)(adh.c(var6, var4) * 57.29577951308232D) - 90.0F;
      float var13 = (float)(-(adh.c(var8, var14) * 57.29577951308232D));
      this.k = this.a(this.k, var13, var3);
      this.j = this.a(this.j, var12, var2);
   }

   private float a(float var1, float var2, float var3) {
      float var4 = adh.d(var2 - var1);
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public boolean isNotColliding() {
      return !this.a.d(this.b()) && this.a.a((NN)this, (acU)this.b()) && this.a.a((acU)this.b(), (NN)this);
   }

   public float a() {
      return 1.0F;
   }

   public int e() {
      return 4;
   }

   public int b() {
      if (this.a() == null) {
         return 3;
      } else {
         int var1 = (int)(this.getHealth() - this.getMaxHealth() * 0.33F);
         var1 -= (3 - this.a.a().a()) * 4;
         if (var1 < 0) {
            var1 = 0;
         }

         return var1 + 3;
      }
   }

   public Iterable<Vh> getHeldEquipment() {
      return this.a;
   }

   public Iterable<Vh> getArmorInventoryList() {
      return this.b;
   }

   public Vh a(SB var1) {
      // $FF: Couldn't be decompiled
   }

   public void a(SB var1, Vh var2) {
      // $FF: Couldn't be decompiled
   }

   protected void a(adW var1) {
      if (this.a.nextFloat() < 0.15F * var1.b()) {
         int var2 = this.a.nextInt(2);
         float var3 = this.a.a() == adY.HARD ? 0.1F : 0.25F;
         if (this.a.nextFloat() < 0.095F) {
            ++var2;
         }

         if (this.a.nextFloat() < 0.095F) {
            ++var2;
         }

         if (this.a.nextFloat() < 0.095F) {
            ++var2;
         }

         boolean var4 = true;
         SB[] var5 = SB.values();
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            SB var8 = var5[var7];
            if (var8.a() == SC.ARMOR) {
               Vh var9 = this.a(var8);
               if (!var4 && this.a.nextFloat() < var3) {
                  break;
               }

               var4 = false;
               if (var9.isEmpty()) {
                  SZ var10 = a(var8, var2);
                  if (var10 != null) {
                     this.a(var8, new Vh(var10));
                  }
               }
            }
         }
      }

   }

   public static SB a(Vh var0) {
      if (var0.a() != SZ.a((nh)RQ.al) && var0.a() != RT.bG) {
         if (var0.a() instanceof LF) {
            return ((LF)var0.a()).a();
         } else if (var0.a() == RT.cp) {
            return SB.CHEST;
         } else {
            boolean var1 = var0.a() == RT.co;
            return var1 ? SB.OFFHAND : SB.MAINHAND;
         }
      } else {
         return SB.HEAD;
      }
   }

   public static SZ a(SB var0, int var1) {
      // $FF: Couldn't be decompiled
   }

   protected void b(adW var1) {
      float var2 = var1.b();
      if (!this.a().isEmpty() && this.a.nextFloat() < 0.25F * var2) {
         this.a(SB.MAINHAND, Nh.a(this.a, this.a(), (int)(5.0F + var2 * (float)this.a.nextInt(18)), false));
      }

      SB[] var3 = SB.values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         SB var6 = var3[var5];
         if (var6.a() == SC.ARMOR) {
            Vh var7 = this.a(var6);
            if (!var7.isEmpty() && this.a.nextFloat() < 0.5F * var2) {
               this.a(var6, Nh.a(this.a, var7, (int)(5.0F + var2 * (float)this.a.nextInt(18)), false));
            }
         }
      }

   }

   public boolean canBeSteered() {
      return false;
   }

   public void e() {
      this.n = true;
   }

   public void a(SB var1, float var2) {
      // $FF: Couldn't be decompiled
   }

   public boolean a_() {
      return this.m;
   }

   public void d(boolean var1) {
      this.m = var1;
   }

   public boolean s() {
      return this.n;
   }

   public final boolean a(Rn var1, abU var2) {
      if (this.getLeashed() && this.e() == var1) {
         this.a(true, !var1.a.d);
         return true;
      } else {
         Vh var3 = var1.a((abU)var2);
         if (var3.a() == RT.bV && this.b(var1)) {
            this.a(var1, true);
            var3.shrink(1);
            return true;
         } else {
            return this.b(var1, var2) || super.a((Rn)var1, (abU)var2);
         }
      }
   }

   protected boolean b(Rn var1, abU var2) {
      return false;
   }

   public void a(boolean var1, boolean var2) {
      if (this.o) {
         this.o = false;
         this.b = null;
      }

   }

   public boolean b(Rn var1) {
      return !this.getLeashed() && !(this instanceof Qx);
   }

   public boolean getLeashed() {
      return this.o;
   }

   public NN e() {
      return this.b;
   }

   public void a(NN var1, boolean var2) {
      this.o = true;
      this.b = var1;
      if (this.isRiding()) {
         this.dismountRidingEntity();
      }

   }

   public boolean a(NN var1, boolean var2) {
      boolean var3 = super.a((NN)var1, var2);
      if (var3 && this.getLeashed()) {
         this.a(true, true);
      }

      return var3;
   }

   public boolean a(int var1, Vh var2) {
      SB var3;
      if (var1 == 98) {
         var3 = SB.MAINHAND;
      } else if (var1 == 99) {
         var3 = SB.OFFHAND;
      } else if (var1 == 100 + SB.HEAD.getIndex()) {
         var3 = SB.HEAD;
      } else if (var1 == 100 + SB.CHEST.getIndex()) {
         var3 = SB.CHEST;
      } else if (var1 == 100 + SB.LEGS.getIndex()) {
         var3 = SB.LEGS;
      } else {
         if (var1 != 100 + SB.FEET.getIndex()) {
            return false;
         }

         var3 = SB.FEET;
      }

      if (!var2.isEmpty() && !a(var3, var2) && var3 != SB.HEAD) {
         return false;
      } else {
         this.a(var3, var2);
         return true;
      }
   }

   public boolean q() {
      return this.canBeSteered() && super.q();
   }

   public static boolean a(SB var0, Vh var1) {
      SB var2 = a(var1);
      return var2 == var0 || var2 == SB.MAINHAND && var0 == SB.OFFHAND || var2 == SB.OFFHAND && var0 == SB.MAINHAND;
   }

   public boolean b() {
      return false;
   }

   public void setNoAI(boolean var1) {
      byte var2 = (Byte)this.a.a(g);
      this.a.b(g, var1 ? (byte)(var2 | 1) : (byte)(var2 & -2));
   }

   public void setLeftHanded(boolean var1) {
      byte var2 = (Byte)this.a.a(g);
      this.a.b(g, var1 ? (byte)(var2 | 2) : (byte)(var2 & -3));
   }

   public boolean isAIDisabled() {
      return ((Byte)this.a.a(g) & 1) != 0;
   }

   public boolean isLeftHanded() {
      return ((Byte)this.a.a(g) & 2) != 0;
   }

   public abV a() {
      return this.isLeftHanded() ? abV.LEFT : abV.RIGHT;
   }

   private boolean x() {
      if (this.isChild()) {
         return false;
      } else if (this.o > 0) {
         return false;
      } else if (this.b < 20) {
         return false;
      } else {
         aej var1 = this.a_();
         if (var1 == null) {
            return false;
         } else if (var1.c.size() != 1) {
            return false;
         } else {
            NN var2 = (NN)var1.c.get(0);
            double var3 = Math.max(Math.abs(this.d - var2.d) - 16.0D, 0.0D);
            double var5 = Math.max(Math.abs(this.f - var2.f) - 16.0D, 0.0D);
            double var7 = var3 * var3 + var5 * var5;
            return !this.a(var7);
         }
      }
   }

   private void g() {
      ++this.u;
      if (this instanceof PZ) {
         float var1 = this.getBrightness();
         if (var1 > 0.5F) {
            this.u += 2;
         }
      }

      this.despawnEntity();
   }

   public aap a() {
      UUID var1 = this.getUniqueID();
      if (this.b != var1) {
         this.b = var1;
         this.b = var1.toString();
      }

      return this.a.a().c(this.b);
   }

   static {
      g = WS.a(Of.class, WD.a);
   }

   public boolean canEquipItem(ItemStack var1) {
      return this.a((Vh)d.a(var1));
   }

   public void faceEntity(Entity var1, float var2, float var3) {
      this.a((NN)d.a(var1), var2, var3);
   }

   public Entity getLeashHolder() {
      return (Entity)d.a(this.b);
   }
}
