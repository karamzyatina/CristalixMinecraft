import com.google.common.collect.Iterables;
import dev.xdark.clientapi.entity.DataParameter;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.entity.EntityDataManager;
import dev.xdark.clientapi.event.entity.EntityDataChange;
import dev.xdark.clientapi.event.entity.EntityInit;
import dev.xdark.clientapi.event.entity.RotateAround;
import dev.xdark.clientapi.math.AxisAlignedBB;
import dev.xdark.clientapi.math.RayTraceResult;
import dev.xdark.clientapi.math.Vec3d;
import dev.xdark.clientapi.resource.ResourceLocation;
import dev.xdark.clientapi.text.HoverEvent;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.world.World;
import dev.xdark.feder.RecyclableArrayList;
import dev.xdark.feder.UUIDConversionUtil;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import it.unimi.dsi.fastutil.objects.ReferenceList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class NN implements Km, aro, Entity {
   private static final Random b = new MM();
   private static final List<Vh> b = Collections.emptyList();
   private static final acU b = new acU(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
   private static double j = 1.0D;
   private static int i;
   private int j;
   public boolean a;
   protected final List<NN> a;
   protected int a;
   private NN b;
   public boolean b;
   public aej a;
   public double a;
   public double b;
   public double c;
   public double d;
   public double e;
   public double f;
   public iS a;
   public iS b;
   public iS c;
   public float j;
   public float k;
   public float l;
   public float m;
   private acU c;
   protected final acU a;
   public iQ a;
   public iQ b;
   public iQ c;
   public iQ d;
   protected iQ e;
   private boolean k;
   public boolean c;
   public iT a;
   public iT b;
   public float n;
   public float o;
   public float p;
   public float q;
   private int k;
   private float a;
   public double g;
   public double h;
   public double i;
   public iT c;
   public iQ f;
   public float r;
   public final Random a;
   public int b;
   private int l;
   protected boolean d;
   public int c;
   protected boolean e;
   protected boolean f;
   protected WS a;
   public static final WB<Byte> a;
   public static final WB<Integer> b;
   public static final WB<String> c;
   public static final WB<Boolean> d;
   public static final WB<Boolean> e;
   public static final WB<Boolean> f;
   public boolean g;
   public int d;
   public int e;
   public int f;
   public long a;
   public long b;
   public long c;
   public boolean h;
   public int g;
   protected boolean i;
   public int h;
   protected adm a;
   protected abP a;
   private boolean l;
   protected UUID a;
   protected String a;
   protected boolean j;
   private final double[] a;
   private long d;
   private final adm b;
   private final adm c;
   public NN a;
   public Ff<?> a;
   public OptionalInt a;
   public acC a;
   private final float[] a;
   private Set a;

   public NN(aej var1) {
      if (this.a == null) {
         this.a = new iS(0.0D);
      }

      if (this.b == null) {
         this.b = new iS(0.0D);
      }

      if (this.c == null) {
         this.c = new iS(0.0D);
      }

      if (this.a == null) {
         this.a = new iQ(false);
      }

      if (this.b == null) {
         this.b = new iQ(false);
      }

      if (this.c == null) {
         this.c = new iQ(false);
      }

      if (this.d == null) {
         this.d = new iQ(false);
      }

      if (this.e == null) {
         this.e = new iQ(false);
      }

      if (this.a == null) {
         this.a = new iT(0.0F);
      }

      if (this.b == null) {
         this.b = new iT(0.0F);
      }

      if (this.c == null) {
         this.c = new iT(0.0F);
      }

      if (this.f == null) {
         this.f = new iQ(false);
      }

      this.a = OptionalInt.empty();
      this.a = new float[4];
      this.a = b.b();
      this.b = adm.e();
      this.c = adm.e();
      this.b.b = adm.e();
      this.c.b = adm.e();
      this.j = i++;
      this.a = new ReferenceArrayList(1);
      this.c = b.b();
      this.a.a(iM.a(iM.a(-2064756327) ^ iM.a(~iM.a(1141389308))));
      this.b.a(iM.a(iM.a(-1058394645) ^ iM.a(~iM.a(15971442))));
      this.k = 1;
      this.a = 1.0F;
      this.a = b;
      this.l = -this.c();
      this.e = true;
      this.a = adh.a(this.a);
      this.a = UUIDConversionUtil.toString(this.a);
      this.a = new double[]{0.0D, 0.0D, 0.0D};
      this.a = var1;
      this.a(0.0D, 0.0D, 0.0D);
      if (var1 != null) {
         this.h = var1.a.a().a();
      }

      this.a = new WS(this);
      this.a.a((WB)a, (byte)0);
      this.a.a((WB)b, (int)300);
      this.a.a((WB)d, (Object)Boolean.FALSE);
      this.a.a((WB)c, (Object)"");
      this.a.a((WB)e, (Object)Boolean.FALSE);
      this.a.a((WB)f, (Object)Boolean.FALSE);
      this.l();
      this.a = this;
      this.a(var1, new CallbackInfo("<init>", false));
      this.b(var1, new CallbackInfo("<init>", false));
   }

   public final int getEntityId() {
      return this.j;
   }

   public final void setEntityId(int var1) {
      this.j = var1;
   }

   protected abstract void l();

   public WS a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof NN && ((NN)var1).j == this.j;
      }
   }

   public final int hashCode() {
      return this.j;
   }

   protected void m() {
      if (this.a != null) {
         while(true) {
            if (this.e > 0.0D && this.e < 256.0D) {
               this.a(this.d, this.e, this.f);
               if (!this.a.a(this, this.b())) {
                  ++this.e;
                  continue;
               }
            }

            this.a.a(0.0D);
            this.b.a(0.0D);
            this.c.a(0.0D);
            this.k = 0.0F;
            break;
         }
      }

   }

   public void n() {
      this.c = true;
   }

   public void setSize(float var1, float var2) {
      float var3 = this.a.a();
      if (var1 != var3 || var2 != this.b.a()) {
         this.a.a(var1);
         this.b.a(var2);
         acU var4 = this.b();
         if (var1 < var3) {
            double var5 = (double)var1 * iM.a(iM.a(2750935898796428308L) ^ iM.a(iM.a(-1859223172577070101L) ^ -1L));
            var4.b(this.d - var5, this.e, this.f - var5, this.d + var5, this.e + (double)var2, this.f + var5);
            return;
         }

         var4.b(var4.a, var4.b, var4.c, var4.a + (double)var1, var4.b + (double)var2, var4.c + (double)var1);
      }

   }

   protected final void b(float var1, float var2) {
      this.j = var1 % 360.0F;
      this.k = var2 % 360.0F;
   }

   public void a(double var1, double var3, double var5) {
      this.d = var1;
      this.e = var3;
      this.f = var5;
      float var7 = this.a.a() / iM.a(iM.a(-1125040193) ^ iM.a(~iM.a(51298368)));
      float var8 = this.b.a();
      this.b().b(var1 - (double)var7, var3, var5 - (double)var7, var1 + (double)var7, var3 + (double)var8, var5 + (double)var7);
   }

   public final void turn(float var1, float var2) {
      float var3 = this.k;
      float var4 = this.j;
      float var5 = (float)((double)this.j + (double)var1 * 0.15D);
      float var6 = (float)((double)this.k - (double)var2 * 0.15D);
      var6 = adh.a(var6, -90.0F, 90.0F);
      float[] var7 = this.a;
      var7[0] = var3;
      var7[1] = var4;
      var7[2] = var5;
      var7[3] = var6;
      if (this.r()) {
         var5 = var7[2];
         var6 = var7[3];
         if (var3 != var5 || var4 != var6) {
            this.j = var5;
            this.k = var6;
            this.m += var6 - var3;
            this.l += var5 - var4;
            if (this.b != null) {
               this.b.e(this);
            }

         }
      }
   }

   public void a() {
      this.o();
   }

   public void o() {
      if (this.isRiding() && this.c().c) {
         this.dismountRidingEntity();
      }

      if (this.a > 0) {
         --this.a;
      }

      this.n = this.o;
      this.a = this.d;
      this.b = this.e;
      this.c = this.f;
      this.m = this.k;
      this.l = this.j;
      this.u();
      this.f();
      this.extinguish();
      if (this.isInLava()) {
         this.p();
         this.q *= iM.a(iM.a(-553156976) ^ iM.a(~iM.a(536379759)));
      }

      if (this.e < -64.0D) {
         this.q();
      }

      this.e = false;
   }

   protected final void p() {
      if (!this.f) {
         this.a(abD.d, 4.0F);
         this.setFire(15);
      }

   }

   public final void setFire(int var1) {
      int var2 = var1 * 20;
      if (this instanceof Oh) {
         var2 = Ns.a((Oh)this, var2);
      }

      this.l = Math.max(this.l, var2);
   }

   public final void extinguish() {
      this.l = 0;
   }

   protected void q() {
      this.n();
   }

   public final boolean b(double var1, double var3, double var5) {
      acU var7 = this.d().f(var1, var3, var5);
      return this.a(var7);
   }

   private boolean a(acU var1) {
      return this.a.a(this, var1) && !this.a.d(var1);
   }

   public void a(Oq var1, double var2, double var4, double var6) {
      if (this.f.a()) {
         this.b().f(var2, var4, var6);
         this.r();
      } else {
         aej var8 = this.a;
         if (var1 == Oq.PISTON) {
            long var9 = var8.a();
            if (var9 != this.d) {
               Arrays.fill(this.a, 0.0D);
               this.d = var9;
            }

            int var11;
            double var12;
            if (var2 != 0.0D) {
               var11 = abR.X.ordinal();
               var12 = adh.a(var2 + this.a[var11], -0.51D, 0.51D);
               var2 = var12 - this.a[var11];
               this.a[var11] = var12;
               if (Math.abs(var2) <= iM.a(iM.a(-5405219625313322615L) ^ iM.a(iM.a(8495981503589992054L) ^ -1L))) {
                  return;
               }
            } else if (var4 != 0.0D) {
               var11 = abR.Y.ordinal();
               var12 = adh.a(var4 + this.a[var11], -0.51D, 0.51D);
               var4 = var12 - this.a[var11];
               this.a[var11] = var12;
               if (Math.abs(var4) <= iM.a(iM.a(42101416279745496L) ^ iM.a(iM.a(-4499495933656245209L) ^ -1L))) {
                  return;
               }
            } else {
               if (var6 == 0.0D) {
                  return;
               }

               var11 = abR.Z.ordinal();
               var12 = adh.a(var6 + this.a[var11], -0.51D, 0.51D);
               var6 = var12 - this.a[var11];
               this.a[var11] = var12;
               if (Math.abs(var6) <= iM.a(iM.a(6470584180590178329L) ^ iM.a(iM.a(-7433431643372056602L) ^ -1L))) {
                  return;
               }
            }
         }

         double var60 = this.d;
         double var61 = this.e;
         double var13 = this.f;
         if (this.e.a()) {
            this.e.a(false);
            var2 *= iM.a(iM.a(1948827827503447893L) ^ iM.a(iM.a(-2655892969000615766L) ^ -1L));
            var4 *= iM.a(iM.a(-7132645580381336150L) ^ iM.a(iM.a(6725464982770922069L) ^ -1L));
            var6 *= iM.a(iM.a(570129185724112980L) ^ iM.a(iM.a(-4051411697681506389L) ^ -1L));
            this.a.a(0.0D);
            this.b.a(0.0D);
            this.c.a(0.0D);
         }

         double var15 = var2;
         double var17 = var4;
         double var19 = var6;
         if (var1 == Oq.SELF && this.a.a() && this.isSneaking() && this instanceof Rn) {
            float var21;
            for(var21 = -this.c.a(); var2 != 0.0D && var8.a(this, this.d().f(var2, (double)var21, 0.0D)); var15 = var2) {
               if (var2 < iM.a(iM.a(8538173438239877070L) ^ iM.a(iM.a(-5319936540186459733L) ^ -1L)) && var2 >= iM.a(iM.a(3319088353226457382L) ^ iM.a(iM.a(7951565991145989955L) ^ -1L))) {
                  var2 = 0.0D;
               } else if (var2 > 0.0D) {
                  var2 -= iM.a(iM.a(-912753162643621333L) ^ iM.a(iM.a(3675880349476674638L) ^ -1L));
               } else {
                  var2 += iM.a(iM.a(-167868320865535319L) ^ iM.a(iM.a(4467002110841642188L) ^ -1L));
               }
            }

            for(; var6 != 0.0D && var8.a(this, this.d().f(0.0D, (double)var21, var6)); var19 = var6) {
               if (var6 < iM.a(iM.a(6441386991131472608L) ^ iM.a(iM.a(-7407857125808876411L) ^ -1L)) && var6 >= iM.a(iM.a(6483982639161738024L) ^ iM.a(iM.a(1850378826667746637L) ^ -1L))) {
                  var6 = 0.0D;
               } else if (var6 > 0.0D) {
                  var6 -= iM.a(iM.a(8349748746571909682L) ^ iM.a(iM.a(-5497168527812400041L) ^ -1L));
               } else {
                  var6 += iM.a(iM.a(-8848657062534519408L) ^ iM.a(iM.a(5000446043243316213L) ^ -1L));
               }
            }

            for(; var2 != 0.0D && var6 != 0.0D && var8.a(this, this.d().f(var2, (double)var21, var6)); var19 = var6) {
               if (var2 < iM.a(iM.a(9166022415081317779L) ^ iM.a(iM.a(-4656116506984791050L) ^ -1L)) && var2 >= iM.a(iM.a(264069136613902332L) ^ iM.a(iM.a(4898877482429735321L) ^ -1L))) {
                  var2 = 0.0D;
               } else if (var2 > 0.0D) {
                  var2 -= iM.a(iM.a(1546665162943727042L) ^ iM.a(iM.a(-3089260836567522393L) ^ -1L));
               } else {
                  var2 += iM.a(iM.a(-1073030314692918456L) ^ iM.a(iM.a(3552692473478685997L) ^ -1L));
               }

               var15 = var2;
               if (var6 < iM.a(iM.a(8967863051555813455L) ^ iM.a(iM.a(-4890247804314460630L) ^ -1L)) && var6 >= iM.a(iM.a(-1042480762221346832L) ^ iM.a(iM.a(-5629997461499520619L) ^ -1L))) {
                  var6 = 0.0D;
               } else if (var6 > 0.0D) {
                  var6 -= iM.a(iM.a(9011938481322400991L) ^ iM.a(iM.a(-4807961852191212870L) ^ -1L));
               } else {
                  var6 += iM.a(iM.a(2267836124373125946L) ^ iM.a(iM.a(-2364778383274316449L) ^ -1L));
               }
            }
         }

         RecyclableArrayList var62 = var8.a(this, this.d().g(var2, var4, var6));
         acU var22 = this.b();
         int var23;
         int var24;
         if (var4 != 0.0D) {
            var23 = 0;

            for(var24 = var62.size(); var23 < var24; ++var23) {
               var4 = ((acU)var62.get(var23)).b(this.b(), var4);
            }

            this.a(this.b().h(0.0D, var4, 0.0D));
         }

         if (var2 != 0.0D) {
            var23 = 0;

            for(var24 = var62.size(); var23 < var24; ++var23) {
               var2 = ((acU)var62.get(var23)).a(this.b(), var2);
            }

            if (var2 != 0.0D) {
               this.b().f(var2, 0.0D, 0.0D);
            }
         }

         if (var6 != 0.0D) {
            var23 = 0;

            for(var24 = var62.size(); var23 < var24; ++var23) {
               var6 = ((acU)var62.get(var23)).c(this.b(), var6);
            }

            if (var6 != 0.0D) {
               this.b().f(0.0D, 0.0D, var6);
            }
         }

         var62.recycle();
         boolean var63 = this.a.a() || var4 != var4 && var4 < 0.0D;
         double var75;
         if (this.c.a() > 0.0F && var63 && (var15 != var2 || var19 != var6)) {
            double var64 = var2;
            double var26 = var4;
            double var28 = var6;
            acU var30 = this.b();
            this.a(var22);
            var4 = (double)this.c.a();
            RecyclableArrayList var31 = var8.a(this, this.d().g(var15, var4, var19));
            acU var32 = this.b();
            acU var33 = var32.b(var15, 0.0D, var19);
            double var34 = var4;
            int var36 = 0;

            for(int var37 = var31.size(); var36 < var37; ++var36) {
               var34 = ((acU)var31.get(var36)).b(var33, var34);
            }

            var32 = var32.h(0.0D, var34, 0.0D);
            var75 = var15;
            int var39 = 0;

            for(int var40 = var31.size(); var39 < var40; ++var39) {
               var75 = ((acU)var31.get(var39)).a(var32, var75);
            }

            var32.f(var75, 0.0D, 0.0D);
            double var77 = var19;
            int var42 = 0;

            for(int var43 = var31.size(); var42 < var43; ++var42) {
               var77 = ((acU)var31.get(var42)).c(var32, var77);
            }

            var32.f(0.0D, 0.0D, var77);
            acU var78 = this.b();
            double var44 = var4;
            int var46 = 0;

            for(int var47 = var31.size(); var46 < var47; ++var46) {
               var44 = ((acU)var31.get(var46)).b(var78, var44);
            }

            var78 = var78.h(0.0D, var44, 0.0D);
            double var80 = var15;
            int var49 = 0;

            for(int var50 = var31.size(); var49 < var50; ++var49) {
               var80 = ((acU)var31.get(var49)).a(var78, var80);
            }

            var78.f(var80, 0.0D, 0.0D);
            double var81 = var19;
            int var52 = 0;

            for(int var53 = var31.size(); var52 < var53; ++var52) {
               var81 = ((acU)var31.get(var52)).c(var78, var81);
            }

            var78.f(0.0D, 0.0D, var81);
            double var82 = var75 * var75 + var77 * var77;
            double var55 = var80 * var80 + var81 * var81;
            if (var82 > var55) {
               var2 = var75;
               var6 = var77;
               var4 = -var34;
               this.a(var32);
            } else {
               var2 = var80;
               var6 = var81;
               var4 = -var44;
               this.a(var78);
            }

            int var57 = 0;

            for(int var58 = var31.size(); var57 < var58; ++var57) {
               var4 = ((acU)var31.get(var57)).b(this.b(), var4);
            }

            var31.recycle();
            this.b().f(0.0D, var4, 0.0D);
            if (var64 * var64 + var28 * var28 >= var2 * var2 + var6 * var6) {
               var2 = var64;
               var4 = var26;
               var6 = var28;
               this.a(var30);
            }
         }

         this.r();
         this.b.a(var15 != var2 || var19 != var6);
         this.c.a(var4 != var4);
         this.a.a(this.c.a() && var17 < 0.0D);
         this.d.a(this.b.a() || this.c.a());
         var24 = adh.b(this.d);
         int var25 = adh.b(this.e - 0.20000000298023224D);
         int var65 = adh.b(this.f);
         sD var27 = var8.a(var24, var25, var65);
         if (var27.a() == si.a) {
            sD var66 = var8.a(var24, var25 - 1, var65);
            nh var29 = var66.a();
            if (var29 instanceof os || var29 instanceof rV || var29 instanceof ou) {
               var27 = var66;
               var25 = 1;
            }
         }

         this.a(var4, this.a.a(), var27, var24, var25, var65);
         if (var15 != var2) {
            this.a.a(0.0D);
         }

         if (var19 != var6) {
            this.c.a(0.0D);
         }

         nh var67 = var27.a();
         if (var17 != var4) {
            var67.a(var8, this);
         }

         if (this.d() && (!this.a.a() || !this.isSneaking() || !(this instanceof Rn)) && !this.isRiding()) {
            double var68 = this.d - var60;
            double var71 = this.e - var61;
            double var73 = this.f - var13;
            if (var67 != RQ.P) {
               var71 = 0.0D;
            }

            if (var67 != null && this.a.a()) {
               var67.a(var8, var24, var25, var65, this);
            }

            this.o = (float)((double)this.o + (double)adh.a(var68 * var68 + var73 * var73) * 0.6D);
            this.p = (float)((double)this.p + (double)adh.a(var68 * var68 + var71 * var71 + var73 * var73) * 0.6D);
            if (this.p > (float)this.k && var27.a() != si.a) {
               this.k = (int)this.p + 1;
               if (!this.isInWater()) {
                  this.a(var24, var25, var65, var67);
               } else {
                  NN var35 = this.isBeingRidden() && this.a_() != null ? this.a_() : this;
                  float var74 = var35 == this ? 0.35F : 0.4F;
                  var75 = var35.a.a();
                  double var76 = var35.b.a();
                  double var41 = var35.c.a();
                  float var79 = adh.a(var75 * 0.20000000298023224D + var76 + var41 * 0.20000000298023224D) * var74;
                  if (var79 > 1.0F) {
                     var79 = 1.0F;
                  }

                  this.a(this.a(), var79, 1.0F + (this.a.nextFloat() - this.a.nextFloat()) * 0.4F);
               }
            } else if (this.p > this.a && this.c() && var27.a() == si.a) {
               this.a = this.a(this.p);
            }
         }

         try {
            this.s();
         } catch (Throwable var59) {
            Kn var70 = Kn.a(var59, "Checking entity block collision");
            Ku var72 = var70.a("Entity being checked for collision");
            this.a(var72);
            throw new acB(var70);
         }

         boolean var69 = this.isWet();
         if (var8.e(this.d().d(0.001D))) {
            this.b_(1);
            if (!var69 && ++this.l == 0) {
               this.setFire(8);
            }
         } else if (this.l <= 0) {
            this.l = -this.c();
         }

         if (var69 && this.isBurning()) {
            this.a(RW.bW, 0.7F, 1.6F + (this.a.nextFloat() - this.a.nextFloat()) * 0.4F);
            this.l = -this.c();
         }
      }

   }

   public final void r() {
      acU var1 = this.b();
      this.d = (var1.a + var1.d) / iM.a(iM.a(-1446760206593175223L) ^ iM.a(iM.a(6058446225020563126L) ^ -1L));
      this.e = var1.b;
      this.f = (var1.c + var1.f) / iM.a(iM.a(8018459833590550767L) ^ iM.a(iM.a(-3406773815163162864L) ^ -1L));
   }

   protected acJ a() {
      return RW.ca;
   }

   protected acJ b() {
      return RW.bZ;
   }

   protected final void s() {
      acU var1 = this.b();
      int var2 = adh.b(var1.a + 0.001D);
      int var3 = adh.b(var1.b + 0.001D);
      int var4 = adh.b(var1.c + 0.001D);
      int var5 = adh.b(var1.d - 0.001D);
      int var6 = adh.b(var1.e - 0.001D);
      int var7 = adh.b(var1.f - 0.001D);
      aej var8 = this.a;

      for(int var9 = var2; var9 <= var5; ++var9) {
         for(int var10 = var3; var10 <= var6; ++var10) {
            for(int var11 = var4; var11 <= var7; ++var11) {
               sD var12 = var8.a(var9, var10, var11);

               try {
                  var12.a().a(var8, var9, var10, var11, var12, this);
               } catch (Throwable var16) {
                  Kn var14 = Kn.a(var16, "Colliding entity with block");
                  Ku var15 = var14.a("Block being collided with");
                  Ku.a(var15, new acV(var9, var10, var11), var12);
                  throw new acB(var14);
               }
            }
         }
      }

   }

   protected void a(int var1, int var2, int var3, nh var4) {
      sf var5 = var4.a();
      if (this.a.a(var1, var2 + 1, var3).a() == RQ.aa) {
         var5 = RQ.aa.a();
         this.a(var5.b(), var5.getVolume() * 0.15F, var5.getPitch());
      } else if (!var4.a().a().isLiquid()) {
         this.a(var5.b(), var5.getVolume() * 0.15F, var5.getPitch());
      }

   }

   protected final void a(acV var1, nh var2) {
      this.a(var1.a, var1.b, var1.c, var2);
   }

   protected float a(float var1) {
      return 0.0F;
   }

   protected boolean c() {
      return false;
   }

   public void a(acJ var1, float var2, float var3) {
   }

   public final boolean isSilent() {
      return (Boolean)this.a.a(e);
   }

   public final void setSilent(boolean var1) {
      this.a.b(e, var1);
   }

   public final boolean hasNoGravity() {
      return (Boolean)this.a.a(f);
   }

   public final void setNoGravity(boolean var1) {
      this.a.b(f, var1);
   }

   protected boolean d() {
      return true;
   }

   protected void a(double var1, boolean var3, sD var4, int var5, int var6, int var7) {
      if (var3) {
         if (this.q > 0.0F) {
            var4.a().a(this.a, var5, var6, var7, this, this.q);
         }

         this.q = 0.0F;
      } else if (var1 < 0.0D) {
         this.q = (float)((double)this.q - var1);
      }

   }

   protected final void a(double var1, boolean var3, sD var4, acV var5) {
      this.a(var1, var3, var4, var5.a, var5.b, var5.c);
   }

   public acU a() {
      return null;
   }

   protected void b_(int var1) {
      if (!this.f) {
         this.a(abD.a, (float)var1);
      }

   }

   public final boolean isImmuneToFire() {
      return this.f;
   }

   public void c(float var1, float var2) {
      if (this.isBeingRidden()) {
         RecyclableArrayList var3 = this.a();
         if (var3 != null) {
            int var4 = 0;

            for(int var5 = var3.size(); var4 < var5; ++var4) {
               NN var6 = (NN)var3.get(var4);
               var6.c(var1, var2);
            }

            var3.recycle();
         }
      }

   }

   public final boolean isWet() {
      if (this.d) {
         return true;
      } else {
         int var1 = adh.b(this.d);
         int var2 = adh.b(this.e);
         int var3 = adh.b(this.f);
         aej var4 = this.a;
         return var4.isRainingAt(var1, var2, var3) || var4.isRainingAt(var1, adh.a((float)var2 + this.b.a()), var3);
      }
   }

   public final boolean isInWater() {
      return this.d;
   }

   public final boolean e() {
      return this.a.a(this.d().c(0.0D, iM.a(iM.a(6095275764468005120L) ^ iM.a(iM.a(7736404591093630719L) ^ -1L)), 0.0D).d(0.001D), si.h, this);
   }

   public boolean f() {
      if (this.c() instanceof Pc) {
         this.d = false;
      } else if (this.a.a(this.d().c(0.0D, iM.a(iM.a(-76951620762359086L) ^ iM.a(iM.a(-4699230720073247443L) ^ -1L)), 0.0D).d(0.001D), si.h, this)) {
         if (!this.d && !this.e) {
            this.t();
         }

         this.q = 0.0F;
         this.d = true;
         this.extinguish();
      } else {
         this.d = false;
      }

      return this.d;
   }

   protected void t() {
      NN var1 = this.isBeingRidden() && this.a_() != null ? this.a_() : this;
      float var2 = var1 == this ? 0.2F : 0.9F;
      double var3 = var1.a.a();
      double var5 = var1.b.a();
      double var7 = var1.c.a();
      double var9 = this.a.a();
      double var11 = this.b.a();
      double var13 = this.c.a();
      float var15 = adh.a(var3 * var3 * 0.20000000298023224D + var5 * var5 + var7 * var7 * 0.20000000298023224D) * var2;
      if (var15 > 1.0F) {
         var15 = 1.0F;
      }

      aej var16 = this.a;
      Random var17 = this.a;
      float var18 = this.a.a();
      double var19 = this.d;
      double var21 = this.f;
      this.a(this.b(), var15, 1.0F + (var17.nextFloat() - var17.nextFloat()) * 0.4F);
      float var23 = (float)adh.b(this.b().b);

      int var24;
      float var25;
      float var26;
      for(var24 = 0; (float)var24 < 1.0F + var18 * 20.0F; ++var24) {
         var25 = (var17.nextFloat() * 2.0F - 1.0F) * var18;
         var26 = (var17.nextFloat() * 2.0F - 1.0F) * var18;
         var16.a(abW.WATER_BUBBLE, var19 + (double)var25, (double)(var23 + 1.0F), var21 + (double)var26, var9, var11 - (double)(var17.nextFloat() * 0.2F), var13);
      }

      for(var24 = 0; (float)var24 < 1.0F + var18 * 20.0F; ++var24) {
         var25 = (var17.nextFloat() * 2.0F - 1.0F) * var18;
         var26 = (var17.nextFloat() * 2.0F - 1.0F) * var18;
         var16.a(abW.WATER_SPLASH, var19 + (double)var25, (double)(var23 + 1.0F), var21 + (double)var26, var9, var11, var13);
      }

   }

   public void u() {
      if (this.isSprinting() && !this.isInWater()) {
         this.v();
      }

   }

   protected final void v() {
      int var1 = adh.b(this.d);
      int var2 = adh.b(this.e - 0.20000000298023224D);
      int var3 = adh.b(this.f);
      sD var4 = this.a.a(var1, var2, var3);
      if (var4.a() != abO.INVISIBLE) {
         this.a.a(abW.BLOCK_CRACK, this.d + ((double)this.a.nextFloat() - 0.5D) * (double)this.a.a(), this.b().b + 0.1D, this.f + ((double)this.a.nextFloat() - 0.5D) * (double)this.a.a(), -this.a.a() * 4.0D, 1.5D, -this.c.a() * 4.0D, mY.e(var4));
      }

   }

   public final boolean a(si var1) {
      if (this.c() instanceof Pc) {
         return false;
      } else {
         double var2 = this.e + (double)this.getEyeHeight();
         int var4 = adh.b(this.d);
         int var5 = adh.b(var2);
         int var6 = adh.b(this.f);
         sD var7 = this.a.a(var4, var5, var6);
         if (var7.a() == var1) {
            float var8 = pj.a(var7.a().c(var7)) - 0.11111111F;
            float var9 = (float)(var5 + 1) - var8;
            boolean var10 = var2 < (double)var9;
            return (var10 || !(this instanceof Rn)) && var10;
         } else {
            return false;
         }
      }
   }

   public final boolean isInLava() {
      return this.a.a(this.d().c(iM.a(iM.a(4234456007842140975L) ^ iM.a(iM.a(8828648649019682000L) ^ -1L)), iM.a(iM.a(-621069038255440118L) ^ iM.a(iM.a(-5239969612883984139L) ^ -1L)), iM.a(iM.a(-7790778381452440547L) ^ iM.a(iM.a(-3195305925292067870L) ^ -1L))), si.i);
   }

   public final void a(float var1, float var2, float var3, float var4) {
      float var5 = var1 * var1 + var2 * var2 + var3 * var3;
      if (var5 >= iM.a(iM.a(1871021229) ^ iM.a(~iM.a(-1465136059)))) {
         var5 = adh.c(var5);
         if (var5 < iM.a(iM.a(317561719) ^ iM.a(~iM.a(-762157944)))) {
            var5 = iM.a(iM.a(239120414) ^ iM.a(~iM.a(-834711583)));
         }

         var5 = var4 / var5;
         var1 *= var5;
         var2 *= var5;
         var3 *= var5;
         float var6 = adh.a(this.j * iM.a(iM.a(-883894223) ^ iM.a(~iM.a(136437243))));
         float var7 = adh.b(this.j * iM.a(iM.a(1081604983) ^ iM.a(~iM.a(-2096693571))));
         this.a.a(this.a.a() + (double)(var1 * var7 - var3 * var6));
         this.b.a(this.b.a() + (double)var2);
         this.c.a(this.c.a() + (double)(var3 * var7 + var1 * var6));
      }

   }

   public int getBrightnessForRender() {
      return this.a.getCombinedLight(adh.b(this.d), adh.b(this.e + (double)this.getEyeHeight()), adh.b(this.f), 0);
   }

   public float getBrightness() {
      return this.a.getLightBrightness(adh.b(this.d), adh.b(this.e + (double)this.getEyeHeight()), adh.b(this.f));
   }

   public final void a(aej var1) {
      this.a = var1;
   }

   public final void a(double var1, double var3, double var5, float var7, float var8) {
      this.d = adh.a(var1, -3.0E7D, 3.0E7D);
      this.e = var3;
      this.f = adh.a(var5, -3.0E7D, 3.0E7D);
      this.a = this.d;
      this.b = this.e;
      this.c = this.f;
      var8 = adh.a(var8, -90.0F, 90.0F);
      this.j = var7;
      this.k = var8;
      this.l = this.j;
      this.m = this.k;
      double var9 = (double)(this.l - var7);
      if (var9 < -180.0D) {
         this.l += 360.0F;
      }

      if (var9 >= 180.0D) {
         this.l -= 360.0F;
      }

      this.a(this.d, this.e, this.f);
      this.b(var7, var8);
   }

   public void a(acV var1, float var2, float var3) {
      this.b((double)var1.a + 0.5D, (double)var1.b, (double)var1.c + 0.5D, var2, var3);
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.d = var1;
      this.e = var3;
      this.f = var5;
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.g = var1;
      this.h = var3;
      this.i = var5;
      this.j = var7;
      this.k = var8;
      this.a(var1, var3, var5);
   }

   public final float a(NN var1) {
      float var2 = (float)(this.d - var1.d);
      float var3 = (float)(this.e - var1.e);
      float var4 = (float)(this.f - var1.f);
      return adh.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public final double a(double var1, double var3, double var5) {
      double var7 = this.d - var1;
      double var9 = this.e - var3;
      double var11 = this.f - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public final double a(acV var1) {
      return var1.distanceSq(this.d, this.e, this.f);
   }

   public final double b(acV var1) {
      return var1.distanceSqToCenter(this.d, this.e, this.f);
   }

   public final double b(double var1, double var3, double var5) {
      double var7 = this.d - var1;
      double var9 = this.e - var3;
      double var11 = this.f - var5;
      return (double)adh.a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public final double a(NN var1) {
      double var2 = this.d - var1.d;
      double var4 = this.e - var1.e;
      double var6 = this.f - var1.f;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void a_(Rn var1) {
   }

   public void c(NN var1) {
      if (!this.h(var1) && !var1.f.a() && !this.f.a()) {
         double var2 = var1.d - this.d;
         double var4 = var1.f - this.f;
         double var6 = adh.a(var2, var4);
         if (var6 >= iM.a(iM.a(8753333266393394591L) ^ iM.a(iM.a(-5115645917948341664L) ^ -1L))) {
            var6 = (double)adh.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = iM.a(iM.a(-8380908348008173805L) ^ iM.a(iM.a(5458072189844721900L) ^ -1L)) / var6;
            if (var8 > iM.a(iM.a(-5381752649922482786L) ^ iM.a(iM.a(8457711195416531553L) ^ -1L))) {
               var8 = iM.a(iM.a(2188597235472360521L) ^ iM.a(iM.a(-2427288015722996810L) ^ -1L));
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= iM.a(iM.a(1732682142491729259L) ^ iM.a(iM.a(-2855881001847086444L) ^ -1L));
            var4 *= iM.a(iM.a(6091135592585003939L) ^ iM.a(iM.a(-7719616254214177700L) ^ -1L));
            var2 *= (double)(iM.a(iM.a(1125903316) ^ iM.a(~iM.a(-2090593237))) - this.r);
            var4 *= (double)(iM.a(iM.a(-189985192) ^ iM.a(~iM.a(886239655))) - this.r);
            if (!this.isBeingRidden()) {
               this.b(-var2, 0.0D, -var4);
            }

            if (!var1.isBeingRidden()) {
               var1.b(var2, 0.0D, var4);
            }
         }
      }

   }

   public void b(double var1, double var3, double var5) {
      this.a.a(this.a.a() + var1);
      this.b.a(this.b.a() + var3);
      this.c.a(this.c.a() + var5);
   }

   public boolean a(abD var1, float var2) {
      return false;
   }

   public adm a(float var1) {
      float var2 = this.k;
      float var3 = this.j;
      if (var1 == 1.0F) {
         return this.a(var2, var3);
      } else {
         float var4 = this.m;
         float var5 = this.l;
         float var6 = var4 + (var2 - var4) * var1;
         float var7 = var5 + (var3 - var5) * var1;
         return this.a(var6, var7);
      }
   }

   public final adm a(float var1, float var2) {
      var2 = -var2 * 0.017453292F - 3.1415927F;
      var1 = -var1 * 0.017453292F;
      float var3 = adh.b(var2);
      float var4 = adh.a(var2);
      float var5 = -adh.b(var1);
      float var6 = adh.a(var1);
      return this.b.g((double)(var4 * var5), (double)var6, (double)(var3 * var5));
   }

   public final adm b(float var1) {
      adm var2 = this.c;
      double var3 = this.d;
      double var5 = this.e;
      double var7 = this.f;
      double var9 = (double)this.getEyeHeight();
      if (var1 == 1.0F) {
         return var2.g(var3, var5 + var9, var7);
      } else {
         double var11 = (double)var1;
         double var13 = this.a;
         double var15 = this.b;
         double var17 = this.c;
         double var19 = var13 + (var3 - var13) * var11;
         double var21 = var15 + (var5 - var15) * var11 + var9;
         double var23 = var17 + (var7 - var17) * var11;
         return var2.g(var19, var21, var23);
      }
   }

   public adi a(adi var1, double var2, float var4) {
      adm var5 = this.b(var4);
      adm var6 = this.a(var4);
      adm var7 = var5.e(var6.a * var2, var6.b * var2, var6.c * var2);
      return this.a.a(var1, var5, var7, false, false, true);
   }

   public adi a(double var1, float var3) {
      return this.a((adi)null, var1, var3);
   }

   public boolean g() {
      return false;
   }

   public boolean h() {
      return false;
   }

   public boolean c(double var1, double var3, double var5) {
      double var7 = this.d - var1;
      double var9 = this.e - var3;
      double var11 = this.f - var5;
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      return this.a(var13);
   }

   public boolean a(double var1) {
      double var3 = this.b().getAverageEdgeLength();
      if (Double.isNaN(var3)) {
         var3 = 1.0D;
      }

      var3 = var3 * 64.0D * j;
      return var1 < var3 * var3;
   }

   public void a(VR var1) {
      try {
         VZ var2 = var1.a("Pos", (int)6);
         VZ var12 = var1.a("Motion", (int)6);
         VZ var13 = var1.a("Rotation", (int)5);
         double var5 = var12.a(0);
         double var7 = var12.a(1);
         double var9 = var12.a(2);
         if (Math.abs(var5) > 10.0D) {
            var5 = 0.0D;
         }

         if (Math.abs(var7) > 10.0D) {
            var7 = 0.0D;
         }

         if (Math.abs(var9) > 10.0D) {
            var9 = 0.0D;
         }

         this.a.a(var5);
         this.b.a(var7);
         this.c.a(var9);
         this.d = var2.a(0);
         this.e = var2.a(1);
         this.f = var2.a(2);
         this.g = this.d;
         this.h = this.e;
         this.i = this.f;
         this.a = this.d;
         this.b = this.e;
         this.c = this.f;
         this.j = var13.a(0);
         this.k = var13.a(1);
         this.l = this.j;
         this.m = this.k;
         this.setRotationYawHead(this.j);
         this.setRenderYawOffset(this.j);
         this.q = var1.getFloat("FallDistance");
         this.l = var1.getShort("Fire");
         this.setAir(var1.getShort("Air"));
         this.a.a(var1.getBoolean("OnGround"));
         if (var1.hasKey("Dimension")) {
            this.h = var1.getInteger("Dimension");
         }

         this.l = var1.getBoolean("Invulnerable");
         this.g = var1.getInteger("PortalCooldown");
         if (var1.a("UUID")) {
            this.a = var1.a("UUID");
            this.a = UUIDConversionUtil.toString(this.a);
         }

         this.a(this.d, this.e, this.f);
         this.b(this.j, this.k);
         if (var1.a("CustomName", (int)8)) {
            this.setCustomNameTag(var1.getString("CustomName"));
         }

         this.setAlwaysRenderNameTag(var1.getBoolean("CustomNameVisible"));
         this.setSilent(var1.getBoolean("Silent"));
         this.setNoGravity(var1.getBoolean("NoGravity"));
         this.setGlowing(var1.getBoolean("Glowing"));
         this.b(var1);
         if (this.i()) {
            this.a(this.d, this.e, this.f);
         }

      } catch (Throwable var11) {
         Kn var3 = Kn.a(var11, "Loading entity NBT");
         Ku var4 = var3.a("Entity being loaded");
         this.a(var4);
         throw new acB(var3);
      }
   }

   protected boolean i() {
      return true;
   }

   protected final String b() {
      acC var1 = Oc.a(this);
      return var1 == null ? null : var1.toString();
   }

   protected abstract void b(VR var1);

   public final Pm a(SZ var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public final Pm a(SZ var1, int var2, float var3) {
      return this.a(new Vh(var1, var2, 0), var3);
   }

   public Pm a(Vh var1, float var2) {
      if (var1.isEmpty()) {
         return null;
      } else {
         Pm var3 = new Pm(this.a, this.d, this.e + (double)var2, this.f, var1);
         var3.setDefaultPickupDelay();
         this.a.a((NN)var3);
         return var3;
      }
   }

   public boolean isEntityAlive() {
      return !this.c;
   }

   public boolean isEntityInsideOpaqueBlock() {
      if (!this.f.a()) {
         double var1 = this.d;
         double var3 = this.e;
         double var5 = this.f;
         float var7 = this.a.a();
         float var8 = this.getEyeHeight();
         aej var9 = this.a;
         int var10 = 0;
         int var11 = 0;
         int var12 = 0;

         for(int var13 = 0; var13 < 8; ++var13) {
            int var14 = adh.b(var3 + (double)(((float)((var13 >> 0) % 2) - 0.5F) * 0.1F) + (double)var8);
            int var15 = adh.b(var1 + (double)(((float)((var13 >> 1) % 2) - 0.5F) * var7 * 0.8F));
            int var16 = adh.b(var5 + (double)(((float)((var13 >> 2) % 2) - 0.5F) * var7 * 0.8F));
            if (var10 != var15 || var11 != var14 || var12 != var16) {
               var10 = var15;
               var11 = var14;
               var12 = var16;
               if (var9.a(var15, var14, var16).causesSuffocation()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(Rn var1, abU var2) {
      return false;
   }

   public acU a(NN var1) {
      return null;
   }

   public void j() {
      NN var1 = this.c();
      if (this.isRiding() && var1.c) {
         this.dismountRidingEntity();
      } else {
         this.a.a(0.0D);
         this.b.a(0.0D);
         this.c.a(0.0D);
         this.a();
         if (this.isRiding()) {
            var1.d(this);
         }
      }

   }

   public void d(NN var1) {
      if (this.g(var1)) {
         var1.a(this.d, this.e + this.getMountedYOffset() + var1.getYOffset(), this.f);
      }

   }

   public void e(NN var1) {
   }

   public double getYOffset() {
      return 0.0D;
   }

   public double getMountedYOffset() {
      return (double)this.b.a() * 0.75D;
   }

   public final boolean a(NN var1) {
      return this.a(var1, false);
   }

   public boolean a(NN var1, boolean var2) {
      for(NN var3 = var1; var3.b != null; var3 = var3.b) {
         if (var3.b == this) {
            return false;
         }
      }

      if (!var2 && (!this.b(var1) || !var1.c(this))) {
         return false;
      } else {
         if (this.isRiding()) {
            this.dismountRidingEntity();
         }

         this.b = var1;
         var1.f(this);
         return true;
      }
   }

   public boolean b(NN var1) {
      return this.a <= 0;
   }

   public final void removePassengers() {
      for(int var1 = this.a.size() - 1; var1 >= 0; --var1) {
         ((NN)this.a.get(var1)).dismountRidingEntity();
      }

   }

   public void dismountRidingEntity() {
      if (this.b != null) {
         NN var1 = this.b;
         this.b = null;
         var1.g(this);
      }

   }

   public final void f(NN var1) {
      if (var1.c() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         this.a.add(var1);
      }
   }

   public final void g(NN var1) {
      if (var1.c() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         this.a.remove(var1);
         var1.a = 60;
      }
   }

   public boolean c(NN var1) {
      return this.a.size() < 1;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.a(var1, var3, var5);
      this.b(var7, var8);
   }

   public float b() {
      return 0.0F;
   }

   public final adm b() {
      return this.a(this.k, this.j);
   }

   public final adl a() {
      return new adl(this.k, this.j);
   }

   public final adm c() {
      return adm.a(this.a());
   }

   public void a(acV var1) {
      if (this.g > 0) {
         this.g = this.a();
      } else {
         this.i = true;
      }

   }

   public int a() {
      return 300;
   }

   public void c(double var1, double var3, double var5) {
      this.a.a(var1);
      this.b.a(var3);
      this.c.a(var5);
   }

   public void a(byte var1) {
   }

   public void performHurtAnimation() {
   }

   public Iterable<Vh> getHeldEquipment() {
      return b;
   }

   public Iterable<Vh> getArmorInventoryList() {
      return b;
   }

   public Iterable<Vh> getEquipmentAndArmor() {
      return Iterables.concat(this.getHeldEquipment(), this.getArmorInventoryList());
   }

   public void a(SB var1, Vh var2) {
   }

   public boolean isBurning() {
      return !this.f && (this.l > 0 || this.a != null && this.a((int)0));
   }

   public final boolean isRiding() {
      return this.c() != null;
   }

   public final boolean isBeingRidden() {
      return !this.a.isEmpty();
   }

   public boolean isSneaking() {
      return this.a((int)1);
   }

   public final void setSneaking(boolean var1) {
      this.a(1, var1);
   }

   public final boolean isSprinting() {
      return this.a((int)3);
   }

   public void setSprinting(boolean var1) {
      this.a(3, var1);
   }

   public final boolean isGlowing() {
      return this.j || this.a((int)6);
   }

   public final void setGlowing(boolean var1) {
      this.j = var1;
   }

   public final boolean isInvisible() {
      return this.a((int)5);
   }

   public boolean a(Rn var1) {
      if (var1.isSpectator()) {
         return false;
      } else {
         aap var2 = this.a();
         return (var2 == null || var1 == null || var1.a() != var2 || !var2.b()) && this.isInvisible();
      }
   }

   public aap a() {
      return this.a.a().c(this.getCachedUniqueIdString());
   }

   public boolean d(NN var1) {
      return this.a(var1.a());
   }

   public final boolean a(aap var1) {
      return this.a() != null && this.a().a(var1);
   }

   public final void setInvisible(boolean var1) {
      this.a(5, var1);
   }

   protected final boolean a(int var1) {
      return ((Byte)this.a.a(a) & 1 << var1) != 0;
   }

   protected final void a(int var1, boolean var2) {
      byte var3 = (Byte)this.a.a(a);
      if (var2) {
         this.a.b(a, (byte)(var3 | 1 << var1));
      } else {
         this.a.b(a, (byte)(var3 & ~(1 << var1)));
      }

   }

   public final int getAir() {
      return (Integer)this.a.a(b);
   }

   public final void setAir(int var1) {
      this.a.b(b, acm.a(var1));
   }

   public void a(Oh var1) {
   }

   protected boolean a(double var1, double var3, double var5) {
      if (!this.a.a(this.b())) {
         return false;
      } else {
         int var7 = adh.b(var1);
         int var8 = adh.b(var3);
         int var9 = adh.b(var5);
         double var10 = var1 - (double)var7;
         double var12 = var3 - (double)var8;
         double var14 = var5 - (double)var9;
         abP var16 = abP.UP;
         double var17 = Double.MAX_VALUE;
         aej var19 = this.a;
         if (!var19.b(var7 - 1, var8, var9) && var10 < var17) {
            var17 = var10;
            var16 = abP.WEST;
         }

         if (!var19.b(var7 + 1, var8, var9) && iM.a(iM.a(1756295951180741643L) ^ iM.a(iM.a(-2859677859886513164L) ^ -1L)) - var10 < var17) {
            var17 = iM.a(iM.a(-5089940359253048930L) ^ iM.a(iM.a(8742359657050521185L) ^ -1L)) - var10;
            var16 = abP.EAST;
         }

         if (!var19.b(var7, var8, var9 - 1) && var14 < var17) {
            var17 = var14;
            var16 = abP.NORTH;
         }

         if (!var19.b(var7, var8, var9 + 1) && iM.a(iM.a(-1230088834611119808L) ^ iM.a(iM.a(3378305856866846399L) ^ -1L)) - var14 < var17) {
            var17 = iM.a(iM.a(-227872175547766632L) ^ iM.a(iM.a(4384694631610734439L) ^ -1L)) - var14;
            var16 = abP.SOUTH;
         }

         if (!var19.b(var7, var8 + 1, var9) && iM.a(iM.a(2925053897471404000L) ^ iM.a(iM.a(-1686563999944517601L) ^ -1L)) - var12 < var17) {
            var16 = abP.UP;
         }

         float var20 = this.a.nextFloat() * iM.a(iM.a(-1129876171) ^ iM.a(~iM.a(2098480647))) + iM.a(iM.a(1133420358) ^ iM.a(~iM.a(-2118275980)));
         float var21 = (float)var16.a().getOffset();
         if (var16.a() == abR.X) {
            this.a.a((double)(var21 * var20));
            this.b.a(this.b.a() * iM.a(iM.a(-5844234965412335906L) ^ iM.a(iM.a(7994703787481747745L) ^ -1L)));
            this.c.a(this.c.a() * iM.a(iM.a(-5008211845071919641L) ^ iM.a(iM.a(8820508929641044504L) ^ -1L)));
         } else if (var16.a() == abR.Y) {
            this.a.a(this.a.a() * iM.a(iM.a(-3330023995603772504L) ^ iM.a(iM.a(1287641564591252567L) ^ -1L)));
            this.b.a((double)(var21 * var20));
            this.c.a(this.c.a() * iM.a(iM.a(1390944838325240081L) ^ iM.a(iM.a(-3217154487223976210L) ^ -1L)));
         } else if (var16.a() == abR.Z) {
            this.a.a(this.a.a() * iM.a(iM.a(4712720214010442459L) ^ iM.a(iM.a(-9119492449392472796L) ^ -1L)));
            this.b.a(this.b.a() * iM.a(iM.a(-96833282232067916L) ^ iM.a(iM.a(4517116316496209739L) ^ -1L)));
            this.c.a((double)(var21 * var20));
         }

         return true;
      }
   }

   public void setInWeb() {
      this.e.a(true);
      this.q = 0.0F;
   }

   public String getName() {
      if (this.hasCustomName()) {
         return this.getCustomNameTag();
      } else {
         String var1 = Oc.a(this);
         if (var1 == null) {
            var1 = "generic";
         }

         return adM.a("entity." + var1 + ".name");
      }
   }

   public NN[] a() {
      return null;
   }

   public boolean e(NN var1) {
      return this == var1;
   }

   public float getRotationYawHead() {
      return 0.0F;
   }

   public void setRotationYawHead(float var1) {
   }

   public void setRenderYawOffset(float var1) {
   }

   public boolean j() {
      return true;
   }

   public boolean f(NN var1) {
      return false;
   }

   public final String toString() {
      return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.getName(), this.j, this.a == null ? "~NULL~" : this.a.a().a(), this.d, this.e, this.f);
   }

   public final boolean a(abD var1) {
      return this.l && var1 != abD.m && !var1.f();
   }

   public final boolean k() {
      return this.l;
   }

   public final void a(boolean var1) {
      this.l = var1;
   }

   public final void h(NN var1) {
      this.b(var1.d, var1.e, var1.f, var1.j, var1.k);
   }

   public boolean l() {
      return true;
   }

   public boolean a(aea var1, aej var2, int var3, int var4, int var5, sD var6, float var7) {
      return true;
   }

   public final boolean a(aea var1, aej var2, acV var3, sD var4, float var5) {
      return this.a(var1, var2, var3.a, var3.b, var3.c, var4, var5);
   }

   public int b() {
      return 3;
   }

   public final adm d() {
      return this.a;
   }

   public final abP a() {
      return this.a;
   }

   public boolean m() {
      return false;
   }

   public void a(Ku var1) {
      var1.a((String)"Entity Type", (KB)(new NO(this)));
      var1.a((String)"Entity ID", (Object)this.j);
      var1.a((String)"Entity Name", (KB)(new NP(this)));
      var1.a((String)"Entity's Exact location", (Object)String.format("%.2f, %.2f, %.2f", this.d, this.e, this.f));
      var1.a((String)"Entity's Block location", (Object)Ku.a(adh.b(this.d), adh.b(this.e), adh.b(this.f)));
      var1.a((String)"Entity's Momentum", (Object)String.format("%.2f, %.2f, %.2f", this.a.a(), this.b.a(), this.c.a()));
      var1.a((String)"Entity's Passengers", (KB)(new NQ(this)));
      var1.a((String)"Entity's Vehicle", (KB)(new NR(this)));
   }

   public boolean n() {
      return this.isBurning();
   }

   public final void setUniqueId(UUID var1) {
      this.a = var1;
      this.a = UUIDConversionUtil.toString(this.a);
   }

   public final UUID getUniqueID() {
      return this.a;
   }

   public final String getCachedUniqueIdString() {
      return this.a;
   }

   public boolean o() {
      return true;
   }

   public static double a() {
      return j;
   }

   public static void a(double var0) {
      j = var0;
   }

   public adu a() {
      adD var1 = new adD(aan.a(this.a(), this.getName()));
      var1.a().a(this.getCachedUniqueIdString());
      return var1;
   }

   public String getDisplayNameForRendering() {
      return aan.a(this.a(), this.getName());
   }

   public void setCustomNameTag(String var1) {
      this.a.b(c, var1);
   }

   public final String getCustomNameTag() {
      return (String)this.a.a(c);
   }

   public boolean hasCustomName() {
      return !((String)this.a.a(c)).isEmpty();
   }

   public final void setAlwaysRenderNameTag(boolean var1) {
      this.a.b(d, var1);
   }

   public final boolean getAlwaysRenderNameTag() {
      return (Boolean)this.a.a(d);
   }

   public final void d(double var1, double var3, double var5) {
      this.b(var1, var3, var5, this.j, this.k);
      this.a.a(this, false);
   }

   public boolean getAlwaysRenderNameTagForRender() {
      return this.getAlwaysRenderNameTag();
   }

   public void a(WB<?> var1) {
      this.b(var1);
   }

   public abP b() {
      return abP.b(adh.b((double)(this.j * 4.0F / 360.0F) + 0.5D) & 3);
   }

   public abP c() {
      return this.b();
   }

   public adK a() {
      VR var1 = new VR();
      acC var2 = Oc.a(this);
      var1.a("id", this.getCachedUniqueIdString());
      if (var2 != null) {
         var1.a("type", var2.toString());
      }

      var1.a("name", this.getName());
      return new adK(adL.SHOW_ENTITY, new adD(var1.toString()));
   }

   public final acU b() {
      return this.c;
   }

   public acU c() {
      return this.d();
   }

   private acU e() {
      return this.c();
   }

   public final void a(acU var1) {
      this.c = var1;
   }

   public float getEyeHeight() {
      return this.b.a() * 0.85F;
   }

   public final boolean p() {
      return this.k;
   }

   public final void b(boolean var1) {
      this.k = var1;
   }

   public boolean a(int var1, Vh var2) {
      return false;
   }

   public void a(adu var1) {
   }

   public boolean a(int var1, String var2) {
      return true;
   }

   public acV a_() {
      return new acV(this.d, this.e + 0.5D, this.f);
   }

   public adm a() {
      return new adm(this.d, this.e, this.f);
   }

   public aej a_() {
      return this.a;
   }

   public abN a(Rn var1, adm var2, abU var3) {
      return abN.PASS;
   }

   public boolean isImmuneToExplosions() {
      return false;
   }

   protected void a(Oh var1, NN var2) {
      if (var2 instanceof Oh) {
         Nh.a((Oh)((Oh)var2), (NN)var1);
      }

      Nh.b(var1, var2);
   }

   public float a(acE var1) {
      // $FF: Couldn't be decompiled
   }

   public float a(act var1) {
      // $FF: Couldn't be decompiled
   }

   public NN a_() {
      return null;
   }

   public RecyclableArrayList<NN> a() {
      return this.a.isEmpty() ? null : RecyclableArrayList.newInstance((ReferenceList)this.a);
   }

   public List<NN> getPassengers() {
      return (List)(this.a.isEmpty() ? Collections.emptyList() : new ArrayList(this.a));
   }

   public final boolean g(NN var1) {
      List var2 = this.a;
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         NN var5 = (NN)var2.get(var3);
         if (var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final Collection<NN> getRecursivePassengers() {
      ReferenceArraySet var1 = new ReferenceArraySet();
      this.a((Class)NN.class, (Set)var1);
      return var1;
   }

   public final <T extends NN> Collection<T> a(Class<T> var1) {
      HashSet var2 = new HashSet();
      this.a((Class)var1, (Set)var2);
      return var2;
   }

   private <T extends NN> void a(Class<T> var1, Set<T> var2) {
      List var3 = this.a;
      int var4 = 0;

      for(int var5 = var3.size(); var4 < var5; ++var4) {
         NN var6 = (NN)var3.get(var4);
         if (var1.isAssignableFrom(var6.getClass())) {
            var2.add(var6);
         }

         var6.a(var1, var2);
      }

   }

   public final NN b() {
      NN var1;
      for(var1 = this; var1.isRiding(); var1 = var1.c()) {
      }

      return var1;
   }

   public final boolean h(NN var1) {
      return this.b() == var1.b();
   }

   public final boolean i(NN var1) {
      List var2 = this.a;
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         NN var5 = (NN)var2.get(var3);
         if (var5.equals(var1)) {
            return true;
         }

         if (var5.i(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean q() {
      NN var1 = this.a_();
      return var1 instanceof Rn && ((Rn)var1).isUser();
   }

   public final NN c() {
      return this.b;
   }

   public sg a() {
      return sg.NORMAL;
   }

   public acI a() {
      return acI.NEUTRAL;
   }

   protected int c() {
      return 1;
   }

   public final acU d() {
      return this.a.d(this.b());
   }

   public final NN d() {
      this.w();
      return this.a;
   }

   public void w() {
      NN var1 = this.a;
      if (var1 != this) {
         var1.d = this.d;
         var1.e = this.e;
         var1.f = this.f;
         var1.a = this.a;
         var1.b = this.b;
         var1.c = this.c;
         var1.g = this.g;
         var1.h = this.h;
         var1.i = this.i;
         var1.j = this.j;
         var1.k = this.k;
         var1.l = this.l;
         var1.m = this.m;
         var1.b = this.b;
      }

   }

   static {
      a = WS.a(NN.class, WD.a);
      b = WS.a(NN.class, WD.b);
      c = WS.a(NN.class, WD.d);
      d = WS.a(NN.class, WD.h);
      e = WS.a(NN.class, WD.h);
      f = WS.a(NN.class, WD.h);
   }

   private void a(aej var1, CallbackInfo var2) {
      this.a.a((WB)asJ.e, (Object)false);
   }

   private void b(aej var1, CallbackInfo var2) {
      if (var1 instanceof yw) {
         EntityInit.BUS.fireAndForget(new R(this));
      }

   }

   public Text getDisplayName() {
      return (Text)d.a(this.a());
   }

   public void setMotion(double var1, double var3, double var5) {
      this.a.a(var1);
      this.b.a(var3);
      this.c.a(var5);
   }

   public void setMotionX(double var1) {
      this.a.a(var1);
   }

   public void setMotionY(double var1) {
      this.b.a(var1);
   }

   public void setMotionZ(double var1) {
      this.c.a(var1);
   }

   public void teleport(double var1, double var3, double var5) {
      this.b(var1, var3, var5, this.j, this.k);
   }

   public void setAngle(float var1, float var2) {
      this.j = var1;
      this.k = var2;
   }

   public void setYaw(float var1) {
      this.j = var1;
   }

   public void setPitch(float var1) {
      this.k = var1;
   }

   public EntityDataManager getDataManager() {
      return (EntityDataManager)d.a(this.a);
   }

   public Vec3d getVectorForRotation(float var1, float var2) {
      return (Vec3d)d.a(this.a(var1, var2));
   }

   public RayTraceResult rayTrace(double var1, float var3) {
      return (RayTraceResult)d.a(this.a(var1, var3));
   }

   public boolean startRiding(Entity var1, boolean var2) {
      return this.a((NN)d.a(var1), var2);
   }

   public boolean canBeRidden(Entity var1) {
      return this.b((NN)d.a(var1));
   }

   public void addPassenger(Entity var1) {
      this.f((NN)d.a(var1));
   }

   public void removePassenger(Entity var1) {
      this.g((NN)d.a(var1));
   }

   public boolean canFitPassenger(Entity var1) {
      return this.c((NN)d.a(var1));
   }

   public Vec3d getLookVec() {
      return (Vec3d)d.a(this.b());
   }

   public Vec3d getForward() {
      return (Vec3d)d.a(this.c());
   }

   public Entity[] getParts() {
      return (Entity[])d.a(this.a());
   }

   public EnumFacing getHorizontalFacing() {
      return (EnumFacing)d.a(this.b());
   }

   public EnumFacing getAdjustedHorizontalFacing() {
      return (EnumFacing)d.a(this.c());
   }

   public HoverEvent getHoverEvent() {
      return (HoverEvent)d.a(this.a());
   }

   public boolean isPassenger(Entity var1) {
      return this.g((NN)d.a(var1));
   }

   public Entity getLowestRidingEntity() {
      return (Entity)d.a(this.b());
   }

   public boolean isRidingSameEntity(Entity var1) {
      return this.h((NN)d.a(var1));
   }

   public boolean isRidingOrBeingRiddenBy(Entity var1) {
      return this.i((NN)d.a(var1));
   }

   public Entity getRidingEntity() {
      return (Entity)d.a(this.b);
   }

   public AxisAlignedBB getEntityBoundingBox() {
      return (AxisAlignedBB)d.a(this.c);
   }

   public AxisAlignedBB getRenderBoundingBox() {
      return (AxisAlignedBB)d.a(this.e());
   }

   public void setEntityBoundingBox(AxisAlignedBB var1) {
      this.a((acU)d.a(var1));
   }

   public Entity getRenderingEntity() {
      return (Entity)d.a(this.a);
   }

   public void setRenderingEntity(Entity var1) {
      this.a = (NN)d.a(var1);
   }

   public World getWorld() {
      return (World)d.a(this.a);
   }

   protected void b(WB var1) {
      aej var2 = this.a;
      if (var2 instanceof yw) {
         EntityDataChange.BUS.fireAndForget(new P((Entity)d.a(this), (DataParameter)d.a(var1)));
      }

   }

   public void setGlowColor(int var1) {
      this.a = OptionalInt.of(var1);
   }

   public OptionalInt getGlowColor() {
      return this.a;
   }

   public void clearGlowColor() {
      this.a = OptionalInt.empty();
   }

   protected boolean r() {
      aej var1 = this.a;
      if (!(var1 instanceof yw)) {
         return true;
      } else {
         float[] var2 = this.a;
         RotateAround var3 = (RotateAround)RotateAround.BUS.fire(Y.a((Entity)d.a(this), var2[0], var2[1], var2[2], var2[3]));
         if (var3.isCancelled()) {
            return false;
         } else {
            var2[2] = var3.getNewYaw();
            var2[3] = var3.getNewPitch();
            return true;
         }
      }
   }

   public ResourceLocation getRenderTexture() {
      return (ResourceLocation)d.a(this.a);
   }

   public void setRenderTexture(ResourceLocation var1) {
      this.a = (acC)d.a(var1);
   }

   public void enableRidingAnimation() {
      this.a.b(asJ.e, true);
   }

   public void disableRidingAnimation() {
      this.a.b(asJ.e, false);
   }

   public Set a() {
      return this.a;
   }

   public void a(Set var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   public double getLastX() {
      return this.g;
   }

   // $FF: synthetic method
   public double getPrevX() {
      return this.a;
   }

   // $FF: synthetic method
   public double getX() {
      return this.d;
   }

   // $FF: synthetic method
   public double getLastY() {
      return this.h;
   }

   // $FF: synthetic method
   public double getPrevY() {
      return this.b;
   }

   // $FF: synthetic method
   public double getY() {
      return this.e;
   }

   // $FF: synthetic method
   public double getLastZ() {
      return this.i;
   }

   // $FF: synthetic method
   public double getPrevZ() {
      return this.c;
   }

   // $FF: synthetic method
   public double getZ() {
      return this.f;
   }

   // $FF: synthetic method
   public float getRotationYaw() {
      return this.j;
   }

   // $FF: synthetic method
   public float getRotationPitch() {
      return this.k;
   }

   // $FF: synthetic method
   public float getPrevRotationYaw() {
      return this.l;
   }

   // $FF: synthetic method
   public float getPrevRotationPitch() {
      return this.m;
   }

   // $FF: synthetic method
   public double getMotionX() {
      return this.a.a();
   }

   // $FF: synthetic method
   public double getMotionY() {
      return this.b.a();
   }

   // $FF: synthetic method
   public double getMotionZ() {
      return this.c.a();
   }

   // $FF: synthetic method
   public boolean isOnGround() {
      return this.a.a();
   }
}
