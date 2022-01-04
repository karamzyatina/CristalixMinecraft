import dev.xdark.clientapi.entity.EntityArmorStand;
import dev.xdark.clientapi.math.Rotations;

public final class Pa extends Oh implements EntityArmorStand {
   private static final adk a = new adk(0.0F, 0.0F, 0.0F);
   private static final adk b = new adk(0.0F, 0.0F, 0.0F);
   private static final adk c = new adk(-10.0F, 0.0F, -10.0F);
   private static final adk d = new adk(-15.0F, 0.0F, 10.0F);
   private static final adk e = new adk(-1.0F, 0.0F, -1.0F);
   private static final adk f = new adk(1.0F, 0.0F, 1.0F);
   public static final WB<Byte> g;
   public static final WB<adk> m;
   public static final WB<adk> n;
   public static final WB<adk> o;
   public static final WB<adk> p;
   public static final WB<adk> q;
   public static final WB<adk> r;
   private final acz<Vh> a;
   private final acz<Vh> b;
   public long d;
   private boolean m;
   private adk g;
   private adk h;
   private adk i;
   private adk j;
   private adk k;
   private adk l;

   public Pa(aej var1) {
      super(var1);
      this.a = acz.a(2, Vh.a);
      this.b = acz.a(4, Vh.a);
      this.g = a;
      this.h = b;
      this.i = c;
      this.j = d;
      this.k = e;
      this.l = f;
      this.f.a(this.hasNoGravity());
      this.setSize(0.5F, 1.975F);
   }

   public Pa(aej var1, double var2, double var4, double var6) {
      this(var1);
      this.a(var2, var4, var6);
   }

   public void setSize(float var1, float var2) {
      double var3 = this.d;
      double var5 = this.e;
      double var7 = this.f;
      float var9 = this.hasMarker() ? 0.0F : (this.isChild() ? 0.5F : 1.0F);
      super.setSize(var1 * var9, var2 * var9);
      this.a(var3, var5, var7);
   }

   protected void l() {
      super.l();
      this.a.a((WB)g, (byte)0);
      this.a.a((WB)m, (Object)a);
      this.a.a((WB)n, (Object)b);
      this.a.a((WB)o, (Object)c);
      this.a.a((WB)p, (Object)d);
      this.a.a((WB)q, (Object)e);
      this.a.a((WB)r, (Object)f);
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

      if (!var2.isEmpty() && !Of.a(var3, var2) && var3 != SB.HEAD) {
         return false;
      } else {
         this.a(var3, var2);
         return true;
      }
   }

   public void b(VR var1) {
      super.b(var1);
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

      this.setInvisible(var1.getBoolean("Invisible"));
      this.setSmall(var1.getBoolean("Small"));
      this.setShowArms(var1.getBoolean("ShowArms"));
      this.setNoBasePlate(var1.getBoolean("NoBasePlate"));
      this.setMarker(var1.getBoolean("Marker"));
      this.m = !this.hasMarker();
      this.f.a(this.hasNoGravity());
      VR var4 = var1.a("Pose");
      this.c(var4);
   }

   private void c(VR var1) {
      VZ var2 = var1.a("Head", (int)5);
      this.a(var2.isEmpty() ? a : new adk(var2));
      VZ var3 = var1.a("Body", (int)5);
      this.b(var3.isEmpty() ? b : new adk(var3));
      VZ var4 = var1.a("LeftArm", (int)5);
      this.c(var4.isEmpty() ? c : new adk(var4));
      VZ var5 = var1.a("RightArm", (int)5);
      this.d(var5.isEmpty() ? d : new adk(var5));
      VZ var6 = var1.a("LeftLeg", (int)5);
      this.e(var6.isEmpty() ? e : new adk(var6));
      VZ var7 = var1.a("RightLeg", (int)5);
      this.f(var7.isEmpty() ? f : new adk(var7));
   }

   public boolean h() {
      return false;
   }

   public abN a(Rn var1, adm var2, abU var3) {
      Vh var4 = var1.a((abU)var3);
      return !this.hasMarker() && var4.a() != RT.bW ? abN.SUCCESS : abN.PASS;
   }

   public void a(byte var1) {
      if (var1 == 32) {
         this.a.a(this.d, this.e, this.f, RW.l, this.a(), 0.3F, 1.0F, false);
         this.d = this.a.a();
      } else {
         super.a(var1);
      }

   }

   public boolean a(double var1) {
      double var3 = this.b().getAverageEdgeLength() * 4.0D;
      if (Double.isNaN(var3) || var3 == 0.0D) {
         var3 = 4.0D;
      }

      var3 *= 64.0D;
      return var1 < var3 * var3;
   }

   protected float a(float var1, float var2) {
      this.B = this.l;
      this.A = this.j;
      return 0.0F;
   }

   public float getEyeHeight() {
      return this.isChild() ? this.b.a() * 0.5F : this.b.a() * 0.9F;
   }

   public double getYOffset() {
      return this.hasMarker() ? 0.0D : 0.10000000149011612D;
   }

   public void travel(float var1, float var2, float var3) {
      if (!this.hasNoGravity()) {
         super.travel(var1, var2, var3);
      }

   }

   public void setRenderYawOffset(float var1) {
      this.B = this.l = var1;
      this.D = this.C = var1;
   }

   public void setRotationYawHead(float var1) {
      this.B = this.l = var1;
      this.D = this.C = var1;
   }

   public void a() {
      super.a();
      adk var1 = (adk)this.a.a(m);
      if (!this.g.equals(var1)) {
         this.g = var1;
      }

      adk var2 = (adk)this.a.a(n);
      if (!this.h.equals(var2)) {
         this.h = var2;
      }

      adk var3 = (adk)this.a.a(o);
      if (!this.i.equals(var3)) {
         this.i = var3;
      }

      adk var4 = (adk)this.a.a(p);
      if (!this.j.equals(var4)) {
         this.j = var4;
      }

      adk var5 = (adk)this.a.a(q);
      if (!this.k.equals(var5)) {
         this.k = var5;
      }

      adk var6 = (adk)this.a.a(r);
      if (!this.l.equals(var6)) {
         this.l = var6;
      }

      boolean var7 = this.hasMarker();
      if (this.m != var7) {
         this.c(var7);
         this.a = !var7;
         this.m = var7;
      }

   }

   private void c(boolean var1) {
      if (var1) {
         this.setSize(0.0F, 0.0F);
      } else {
         this.setSize(0.5F, 1.975F);
      }

   }

   public boolean isChild() {
      return this.isSmall();
   }

   public boolean isImmuneToExplosions() {
      return this.isInvisible();
   }

   public sg a() {
      return this.hasMarker() ? sg.IGNORE : super.a();
   }

   public void setSmall(boolean var1) {
      this.a.b(g, a((Byte)this.a.a(g), 1, var1));
      this.setSize(0.5F, 1.975F);
   }

   public boolean isSmall() {
      return ((Byte)this.a.a(g) & 1) != 0;
   }

   public void setShowArms(boolean var1) {
      this.a.b(g, a((Byte)this.a.a(g), 4, var1));
   }

   public boolean a() {
      return ((Byte)this.a.a(g) & 4) != 0;
   }

   public void setNoBasePlate(boolean var1) {
      this.a.b(g, a((Byte)this.a.a(g), 8, var1));
   }

   public boolean hasNoBasePlate() {
      return ((Byte)this.a.a(g) & 8) != 0;
   }

   public void setMarker(boolean var1) {
      this.a.b(g, a((Byte)this.a.a(g), 16, var1));
      this.setSize(0.5F, 1.975F);
   }

   public boolean hasMarker() {
      return ((Byte)this.a.a(g) & 16) != 0;
   }

   private static byte a(byte var0, int var1, boolean var2) {
      if (var2) {
         var0 = (byte)(var0 | var1);
      } else {
         var0 = (byte)(var0 & ~var1);
      }

      return var0;
   }

   public void a(adk var1) {
      this.g = var1;
      this.a.b(m, var1);
   }

   public void b(adk var1) {
      this.h = var1;
      this.a.b(n, var1);
   }

   public void c(adk var1) {
      this.i = var1;
      this.a.b(o, var1);
   }

   public void d(adk var1) {
      this.j = var1;
      this.a.b(p, var1);
   }

   public void e(adk var1) {
      this.k = var1;
      this.a.b(q, var1);
   }

   public void f(adk var1) {
      this.l = var1;
      this.a.b(r, var1);
   }

   public adk a() {
      return this.g;
   }

   public adk b() {
      return this.h;
   }

   public adk c() {
      return this.i;
   }

   public adk d() {
      return this.j;
   }

   public adk e() {
      return this.k;
   }

   public adk f() {
      return this.l;
   }

   public boolean g() {
      return super.g() && !this.hasMarker();
   }

   public abV a() {
      return abV.RIGHT;
   }

   protected acJ a(int var1) {
      return RW.k;
   }

   protected acJ a(abD var1) {
      return RW.l;
   }

   protected acJ d() {
      return RW.j;
   }

   public void a(WB<?> var1) {
      if (g.equals(var1)) {
         this.setSize(0.5F, 1.975F);
      }

      super.a(var1);
   }

   static {
      g = WS.a(Pa.class, WD.a);
      m = WS.a(Pa.class, WD.i);
      n = WS.a(Pa.class, WD.i);
      o = WS.a(Pa.class, WD.i);
      p = WS.a(Pa.class, WD.i);
      q = WS.a(Pa.class, WD.i);
      r = WS.a(Pa.class, WD.i);
   }

   public void setHeadRotation(Rotations var1) {
      this.a((adk)d.a(var1));
   }

   public void setBodyRotation(Rotations var1) {
      this.b((adk)d.a(var1));
   }

   public void setLeftArmRotation(Rotations var1) {
      this.c((adk)d.a(var1));
   }

   public void setRightArmRotation(Rotations var1) {
      this.d((adk)d.a(var1));
   }

   public void setLeftLegRotation(Rotations var1) {
      this.e((adk)d.a(var1));
   }

   public void setRightLegRotation(Rotations var1) {
      this.f((adk)d.a(var1));
   }

   public Rotations getHeadRotation() {
      return (Rotations)d.a(this.g);
   }

   public Rotations getBodyRotation() {
      return (Rotations)d.a(this.h);
   }

   public Rotations getLeftArmRotation() {
      return (Rotations)d.a(this.i);
   }

   public Rotations getRightArmRotation() {
      return (Rotations)d.a(this.j);
   }

   public Rotations getLeftLegRotation() {
      return (Rotations)d.a(this.k);
   }

   public Rotations getRightLegRotation() {
      return (Rotations)d.a(this.l);
   }
}
