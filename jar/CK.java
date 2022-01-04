import com.google.gson.JsonSyntaxException;
import dev.xdark.clientapi.entity.Entity;
import dev.xdark.clientapi.event.render.BlockLayerRender;
import dev.xdark.clientapi.particle.Particle;
import dev.xdark.clientapi.render.RenderGlobal;
import dev.xdark.clientapi.util.BlockRenderLayer;
import dev.xdark.clientapi.util.ParticleType;
import dev.xdark.feder.RecyclableArrayList;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectCollection;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import org.lwjgl.util.vector.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class Ck implements IO, aef, RenderGlobal {
   private static final Logger a;
   private static final Lg a;
   private static final Lg b;
   private static final Lg c;
   private static final Lg d;
   private static final Lg e;
   public final sE a;
   private final HM a;
   private final Ga a;
   private yw a;
   private Set<Et> d;
   private List<Cn> a;
   public final Set<aaD> a;
   private CA a;
   private int a;
   private int b;
   private int c;
   private final Ip a;
   private Io a;
   private Io b;
   private Io c;
   private int d;
   public final Int2ObjectMap<Bm> a;
   private final Map<acV, tb> a;
   private final HK[] a;
   private JO a;
   private JR a;
   private double a;
   private double b;
   private double c;
   private int e;
   private int f;
   private int g;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private Eg a;
   private Bl a;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private boolean d;
   Eq a;
   private double i;
   private double j;
   private double k;
   public boolean a;
   private boolean e;
   private final ajS a;
   public NN a;
   public final Set<Et> b;
   public final Set<Et> c;
   private Set<Et> e;
   private final Deque<Cn> a;
   private List<Cn> b;
   private List<Cn> c;
   private final List d;
   private final List e;
   private final List f;
   private final List g;
   private final List h;
   private final List i;
   private int m;
   private int n;
   private int o;
   private int p;
   private final ajV a;
   public boolean b;
   public boolean c;
   private static int q;
   private final aqT a;
   private int r;

   public Ck(sE var1) {
      this.a = aqR.a().a;
      this.d = new ReferenceLinkedOpenHashSet();
      this.a = new ReferenceArrayList(69696);
      this.a = new ReferenceOpenHashSet();
      this.a = -1;
      this.b = -1;
      this.c = -1;
      this.a = new Int2ObjectOpenHashMap();
      this.a = new HashMap();
      this.a = new HK[10];
      this.a = Double.MIN_VALUE;
      this.b = Double.MIN_VALUE;
      this.c = Double.MIN_VALUE;
      this.e = Integer.MIN_VALUE;
      this.f = Integer.MIN_VALUE;
      this.g = Integer.MIN_VALUE;
      this.d = Double.MIN_VALUE;
      this.e = Double.MIN_VALUE;
      this.f = Double.MIN_VALUE;
      this.g = Double.MIN_VALUE;
      this.h = Double.MIN_VALUE;
      this.h = -1;
      this.i = 2;
      this.a = true;
      this.b = new LinkedHashSet();
      this.c = new LinkedHashSet();
      this.e = new ObjectLinkedOpenHashSet();
      this.a = new ArrayDeque();
      this.b = new ArrayList(1024);
      this.c = new ArrayList(1024);
      this.d = new ArrayList(1024);
      this.e = new ArrayList(1024);
      this.f = new ArrayList(1024);
      this.g = new ArrayList(1024);
      this.h = new ArrayList(1024);
      this.i = new ArrayList(1024);
      this.m = 0;
      this.n = 0;
      this.p = 0;
      this.a = new ajV();
      this.b = false;
      this.c = false;
      this.a = new ajS(var1);
      this.a = var1;
      this.a = var1.a();
      this.a = var1.a();
      this.a.a(e);
      By.b(3553, 10242, 10497);
      By.b(3553, 10243, 10497);
      By.i(0);
      this.i();
      this.d = Ci.b();
      if (this.d) {
         this.a = new Cy();
         this.a = new Ev();
      } else {
         this.a = new Cu();
         this.a = new Er();
      }

      this.a = new Ip();
      this.a.a(new Ir(0, It.FLOAT, IB.POSITION, 3));
      this.l();
      this.k();
      this.j();
   }

   public void onResourceManagerReload(IN var1) {
      this.i();
   }

   private void i() {
      HO var1 = this.a.a();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = var1.a("minecraft:blocks/destroy_stage_" + var2);
      }

   }

   public void a() {
      if (Ci.f) {
         acC var1 = new acC("shaders/post/entity_outline.json");

         try {
            this.a = new JR(this.a.a(), this.a.a(), this.a.a(), var1, this.a, this.a.a);
            this.a.a(this.a.a, this.a.b);
            this.a = this.a.a("final");
         } catch (JsonSyntaxException | IOException var3) {
            a.warn("Failed to load shader: {}", var1, var3);
            this.a = null;
            this.a = null;
         }
      } else {
         this.a = null;
         this.a = null;
      }

   }

   public void b() {
      if (this.a()) {
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ZERO, BL.ONE);
         this.a.framebufferRenderExt(this.a.a, this.a.b, false);
         By.k();
      }

   }

   protected boolean a() {
      if (!afT.ac() && !afT.ad() && !afT.M()) {
         return this.a != null && this.a != null && this.a.a != null;
      } else {
         return false;
      }
   }

   private void j() {
      Cw var1 = this.a.a;
      Bh var2 = var1.a();
      if (this.c != null) {
         this.c.c();
      }

      if (this.c >= 0) {
         Bx.a(this.c);
         this.c = -1;
      }

      if (this.d) {
         this.c = new Io(this.a);
         this.a(var2, -16.0F, true);
         var2.finishDrawing();
         var2.reset();
         this.c.a(var2.b());
      } else {
         this.c = Bx.a(1);
         By.f(this.c, 4864);
         this.a(var2, -16.0F, true);
         var1.draw();
         By.G();
      }

   }

   private void k() {
      Cw var1 = this.a.a;
      Bh var2 = var1.a();
      if (this.b != null) {
         this.b.c();
      }

      if (this.b >= 0) {
         Bx.a(this.b);
         this.b = -1;
      }

      if (this.d) {
         this.b = new Io(this.a);
         this.a(var2, 16.0F, false);
         var2.finishDrawing();
         var2.reset();
         this.b.a(var2.b());
      } else {
         this.b = Bx.a(1);
         By.f(this.b, 4864);
         this.a(var2, 16.0F, false);
         var1.draw();
         By.G();
      }

   }

   private void a(Bh var1, float var2, boolean var3) {
      var1.a(7, In.e);
      int var4 = (this.m / 64 + 1) * 64 + 64;

      for(int var5 = -var4; var5 <= var4; var5 += 64) {
         for(int var6 = -var4; var6 <= var4; var6 += 64) {
            float var7 = (float)var5;
            float var8 = (float)(var5 + 64);
            if (var3) {
               var8 = (float)var5;
               var7 = (float)(var5 + 64);
            }

            var1.a((double)var7, (double)var2, (double)var6).endVertex();
            var1.a((double)var8, (double)var2, (double)var6).endVertex();
            var1.a((double)var8, (double)var2, (double)(var6 + 64)).endVertex();
            var1.a((double)var7, (double)var2, (double)(var6 + 64)).endVertex();
         }
      }

   }

   private void l() {
      Cw var1 = this.a.a;
      Bh var2 = var1.a();
      if (this.a != null) {
         this.a.c();
      }

      if (this.a >= 0) {
         Bx.a(this.a);
         this.a = -1;
      }

      if (this.d) {
         this.a = new Io(this.a);
         this.a(var2);
         var2.finishDrawing();
         var2.reset();
         this.a.a(var2.b());
      } else {
         this.a = Bx.a(1);
         By.C();
         By.f(this.a, 4864);
         this.a(var2);
         var1.draw();
         By.G();
         By.D();
      }

   }

   private void a(Bh var1) {
      Random var2 = new Random(10842L);
      var1.a(7, In.e);

      for(int var3 = 0; var3 < 1500; ++var3) {
         double var4 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.15F + var2.nextFloat() * 0.1F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0D && var12 > 0.01D) {
            var12 = 1.0D / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0D;
            double var16 = var6 * 100.0D;
            double var18 = var8 * 100.0D;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var2.nextDouble() * 3.141592653589793D * 2.0D;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for(int var38 = 0; var38 < 4; ++var38) {
               double var39 = (double)((var38 & 2) - 1) * var10;
               double var41 = (double)((var38 + 1 & 2) - 1) * var10;
               double var43 = var39 * var36 - var41 * var34;
               double var45 = var41 * var36 + var39 * var34;
               double var47 = var43 * var28 + 0.0D * var30;
               double var49 = 0.0D * var28 - var43 * var30;
               double var51 = var49 * var22 - var45 * var24;
               double var53 = var45 * var22 + var49 * var24;
               var1.a(var14 + var51, var16 + var47, var18 + var53).endVertex();
            }
         }
      }

   }

   public void a(yw var1) {
      if (this.a != null) {
         this.a.b((aef)this);
      }

      this.a = Double.MIN_VALUE;
      this.b = Double.MIN_VALUE;
      this.c = Double.MIN_VALUE;
      this.e = Integer.MIN_VALUE;
      this.f = Integer.MIN_VALUE;
      this.g = Integer.MIN_VALUE;
      this.a.a((aej)var1);
      yw var2 = this.a;
      this.a = var1;
      if (afT.ai()) {
         ajv.a();
      }

      this.a.a((sD)null, (acV)null);
      akC.a(this.a, (aej)var2, (aej)var1);
      if (var1 != null) {
         var1.a((aef)this);
         this.loadRenderers();
      } else {
         this.d.clear();
         this.e.clear();
         this.p();
         if (this.a != null) {
            this.a.a();
            this.a = null;
         }

         if (this.a != null) {
            this.a.b();
         }
      }

   }

   public void loadRenderers() {
      if (this.a != null) {
         if (this.a == null) {
            this.a = new Eg(this.a);
         }

         this.a = true;
         RQ.a.a(afT.l());
         RQ.b.a(afT.l());
         AO.a();
         if (afT.ai()) {
            ajv.a();
         }

         agx.a();
         this.h = JI.b();
         this.m = this.h * 16;
         this.n = this.m * this.m;
         boolean var1 = this.d;
         this.d = Ci.b();
         if (var1 && !this.d) {
            this.a = new Cu();
            this.a = new Er();
         } else if (!var1 && this.d) {
            this.a = new Cy();
            this.a = new Ev();
         }

         this.l();
         this.k();
         this.j();
         if (this.a != null) {
            this.a.a();
         }

         this.c();
         synchronized(this.a) {
            this.a.clear();
         }

         this.a = new CA(this.a, JI.b(), this);
         double var2 = 0.0D;
         double var4 = 0.0D;
         boolean var6 = false;
         if (this.a != null) {
            NN var7 = this.a.a();
            if (var7 != null) {
               var6 = true;
               var2 = var7.d;
               var4 = var7.f;
               this.e = var7.d;
               this.g = var7.f;
            }
         }

         this.a.a(this.a, var2, var4, var6);
         this.i = 2;
      }

   }

   protected void c() {
      this.d.clear();
      this.a.a();
   }

   public void a(int var1, int var2) {
      if (this.a != null) {
         this.a.a(var1, var2);
      }

   }

   public void a(NN var1, Fb var2, float var3) {
      this.a(var1, var2, var3, new CallbackInfo("renderEntities", false));
      if (this.i > 0) {
         --this.i;
      } else {
         double var4 = (double)var3;
         double var6 = var1.a + (var1.d - var1.a) * var4;
         double var8 = var1.b + (var1.e - var1.b) * var4;
         double var10 = var1.c + (var1.f - var1.c) * var4;
         sE var12 = this.a;
         Bn var13 = var12.a;
         yw var14 = this.a;
         Ga var15 = this.a;
         NN var16 = var12.a();
         var12.a.a(var14, var16, var12.a, var3);
         var15.a(var14, var16, var12.a, var3);
         ++q;
         this.j = 0;
         this.k = 0;
         this.l = 0;
         this.o = 0;
         double var17 = var16.g + (var16.d - var16.g) * var4;
         double var19 = var16.h + (var16.e - var16.h) * var4;
         double var21 = var16.i + (var16.f - var16.i) * var4;
         Ie.a = var17;
         Ie.b = var19;
         Ie.c = var21;
         var15.a(var17, var19, var21);
         var13.enableLightmap();
         this.j = var14.a().size();
         if (afT.f() && var13.a) {
            By.o();
         }

         this.a(var3, var6, var8, var10);
         boolean var23 = afT.ad();
         if (var23) {
            akC.l(this.a);
         }

         FQ.a(var12);
         boolean var24 = JI.d;
         JI.d = afT.n();
         RecyclableArrayList var25 = RecyclableArrayList.newInstance();
         RecyclableArrayList var26 = RecyclableArrayList.newInstance();
         this.a(var2, var3, var6, var8, var10, var16, var23, var25, var26);
         this.c(var3, var23, var26);
         var26.recycle();
         this.b(var3, var23, var25);
         this.a(var3, var23, var25);
         var25.recycle();
         JI.d = var24;
         if (var23) {
            akC.o(var12);
            akC.p(var12);
         }

         Co.b();
         Ih.a(var12);
         this.b(var3, var23);
         this.c(var3, var23);
         if (!this.a.isEmpty()) {
            this.b = true;
            this.n();
            this.a(var3, var23);
            this.o();
            this.b = false;
         }

         if (var23) {
            akC.q(this.a);
         }

         --q;
         var13.disableLightmap();
      }

      this.b(var1, var2, var3, new CallbackInfo("renderEntities", false));
   }

   private void a(float var1, boolean var2) {
      ObjectCollection var3 = this.a.values();
      int var4 = var3.size();
      if (var4 != 0) {
         sE var5 = this.a;
         Ie var6 = var5.a;
         ObjectIterator var7 = var3.iterator();
         yw var8 = this.a;

         while(var4-- > 0) {
            Bm var9 = (Bm)var7.next();
            acV var10 = var9.a();
            sD var11 = var8.a(var10);
            if (var11.a().hasTileEntity()) {
               aaD var12 = var8.a(var10);
               if (var12 instanceof aaM) {
                  aaM var13 = (aaM)var12;
                  if (var13.c != null) {
                     var10 = var10.a(abP.WEST);
                     var11 = var8.a(var10);
                     var12 = var8.a(var10);
                  } else if (var13.a != null) {
                     var10 = var10.a(abP.NORTH);
                     var11 = var8.a(var10);
                     var12 = var8.a(var10);
                  }
               }

               if (var12 != null && var11.hasCustomBreakingProgress()) {
                  if (var2) {
                     akC.a(var5, var12);
                  }

                  var6.a(var12, var1, var9.a());
               }
            }
         }
      }

   }

   private void b(float var1, boolean var2) {
      List var3 = this.c;
      int var4 = 0;
      sE var5 = this.a;
      Ie var6 = var5.a;

      for(int var7 = var3.size(); var4 < var7; ++var4) {
         Cn var8 = (Cn)var3.get(var4);
         List var9 = var8.a.a().a();
         if (!var9.isEmpty()) {
            int var10 = var9.size();

            for(int var11 = 0; var11 < var10; ++var11) {
               aaD var12 = (aaD)var9.get(var11);
               if (var2) {
                  akC.a(var5, var12);
               }

               var6.a(var12, var1, -1);
            }

            this.o += var10;
         }
      }

   }

   private void c(float var1, boolean var2) {
      Set var3 = this.a;
      synchronized(var3) {
         int var5 = var3.size();
         if (var5 != 0) {
            sE var6 = this.a;
            Ie var7 = var6.a;

            aaD var9;
            for(Iterator var8 = var3.iterator(); var5-- > 0; var7.a(var9, var1, -1)) {
               var9 = (aaD)var8.next();
               if (var2) {
                  akC.a(var6, var9);
               }
            }
         }

      }
   }

   private void a(float var1, boolean var2, RecyclableArrayList var3) {
      if (!this.a() && (!var3.isEmpty() || this.e)) {
         this.e = !var3.isEmpty();
         if (!var3.isEmpty()) {
            if (var2) {
               akC.k();
            }

            By.o();
            By.i();
            this.a.a.disableLightmap();
            Co.a();
            this.a.setRenderOutlines(true);

            for(int var4 = 0; var4 < var3.size(); ++var4) {
               NN var5 = (NN)var3.get(var4);
               if (var2) {
                  akC.a(this.a, var5);
               }

               this.a.a(var5, var1, false);
            }

            this.a.setRenderOutlines(false);
            Co.b();
            this.a.a.enableLightmap();
            By.j();
            By.n();
            if (var2) {
               akC.l();
            }
         }
      }

   }

   private void b(float var1, boolean var2, RecyclableArrayList var3) {
      boolean var4;
      if (this.a() && ((var4 = !var3.isEmpty()) || this.e)) {
         JO var5 = this.a;
         var5.framebufferClear();
         this.e = var4;
         if (var4) {
            Ga var6 = this.a;
            By.c(519);
            By.o();
            var5.bindFramebuffer(false);
            Co.a();
            var6.setRenderOutlines(true);

            for(int var7 = 0; var7 < var3.size(); ++var7) {
               NN var8 = (NN)var3.get(var7);
               if (var2) {
                  akC.a(this.a, var8);
               }

               var6.a(var8, var1, false);
            }

            var6.setRenderOutlines(false);
            Co.b();
            By.a(false);
            this.a.a(var1);
            By.e();
            By.a(true);
            By.n();
            By.l();
            By.g();
            By.c(515);
            By.j();
            By.d();
         }

         this.a.a().bindFramebuffer(false);
      }

   }

   private void c(float var1, boolean var2, RecyclableArrayList var3) {
      if (!var3.isEmpty()) {
         int var4 = 0;
         Ga var5 = this.a;

         for(int var6 = var3.size(); var4 < var6; ++var4) {
            NN var7 = (NN)var3.get(var4);
            if (var2) {
               akC.a(this.a, var7);
            }

            var5.a(var7, var1);
         }
      }

   }

   private void a(Fb var1, float var2, double var3, double var5, double var7, NN var9, boolean var10, RecyclableArrayList var11, RecyclableArrayList var12) {
      List var13 = this.b;
      int var14 = 0;
      sE var15 = this.a;
      Ga var16 = this.a;

      label67:
      for(int var17 = var13.size(); var14 < var17; ++var14) {
         Cn var18 = (Cn)var13.get(var14);
         afh var19 = var18.a.a();
         Set[] var20 = var19.a();
         int var21 = var18.a.a().b >> 4;
         var21 = adh.a(var21, 0, var20.length - 1);
         Set var22 = var20[var21];
         if (!var22.isEmpty()) {
            Iterator var23 = var22.iterator();

            while(true) {
               NN var24;
               boolean var26;
               do {
                  boolean var25;
                  do {
                     if (!var23.hasNext()) {
                        continue label67;
                     }

                     var24 = (NN)var23.next();
                     var25 = var16.a(var24, var1, var3, var5, var7) || var24.i(var15.a);
                  } while(!var25);

                  var26 = var15.a() instanceof Oh && ((Oh)var15.a()).isPlayerSleeping();
               } while(var24 == var15.a() && JI.j == 0 && !var26);

               ++this.k;
               this.a = var24;
               if (var10) {
                  akC.a(var15, var24);
               }

               var16.a(var24, var2, false);
               this.a = null;
               if (this.a(var24, var9, var1)) {
                  var11.add(var24);
               }

               if (var16.a(var24)) {
                  var12.add(var24);
               }
            }
         }
      }

   }

   private void a(float var1, double var2, double var4, double var6) {
      List var8 = this.a.d;
      Ga var9 = this.a;
      int var10 = var8.size();

      for(int var11 = 0; var11 < var10; ++var11) {
         NN var12 = (NN)var8.get(var11);
         if (var12.c(var2, var4, var6)) {
            var9.a(var12, var1, false);
         }
      }

      this.k += var10;
   }

   private boolean a(NN var1, NN var2, Fb var3) {
      boolean var4 = var2 instanceof Oh && ((Oh)var2).isPlayerSleeping();
      if (var1 == var2 && JI.j == 0 && !var4) {
         return false;
      } else if (var1.isGlowing()) {
         return true;
      } else if (this.a.a.isSpectator() && this.a.a.u.isKeyDown() && var1 instanceof Rn) {
         return var1.h || var3.a(var1.b()) || var1.i(this.a.a);
      } else {
         return false;
      }
   }

   public String a() {
      int var1 = this.a.a.length;
      int var2 = this.a();
      return String.format("C: %d/%d %sD: %d, L: %d, %s", var2, var1, this.a.f ? "(s) " : "", this.h, 0, this.a == null ? "null" : this.a.a());
   }

   protected int a() {
      int var1 = 0;
      List var2 = this.a;
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         Cn var5 = (Cn)var2.get(var3);
         Eo var6 = var5.a.a;
         if (var6 != Eo.a && !var6.a()) {
            ++var1;
         }
      }

      return var1;
   }

   public String b() {
      return "E: " + this.k + '/' + this.j + ", B: " + this.l;
   }

   public void a(NN var1, double var2, Fb var4, int var5, boolean var6) {
      if (JI.b() != this.h) {
         this.loadRenderers();
      }

      double var7 = var1.d - this.a;
      double var9 = var1.e - this.b;
      double var11 = var1.f - this.c;
      this.a(var1, var7, var9, var11);
      if (afT.ai()) {
         ajv.a(this);
      }

      double var13 = var1.g + (var1.d - var1.g) * var2;
      double var15 = var1.h + (var1.e - var1.h) * var2;
      double var17 = var1.i + (var1.f - var1.i) * var2;
      this.a.a(var13, var15, var17);
      int var19 = adh.b(var13);
      int var20 = adh.b(var15 + (double)var1.getEyeHeight());
      int var21 = adh.b(var17);
      Et var22 = this.a.a(var13, var15 + (double)var1.getEyeHeight(), var17);
      this.a = this.a || !this.d.isEmpty() || var1.d != this.d || var1.e != this.e || var1.f != this.f || (double)var1.k != this.g || (double)var1.j != this.h;
      this.c(var1);
      int var23 = this.f();
      if (var23 != this.p) {
         this.p = var23;
         this.a = true;
      }

      int var24 = this.a.getHeight();
      Et var25 = this.a.a(adh.b(var1.d), adh.b(var1.e), adh.b(var1.f));
      if (akC.c) {
         this.a(var1, var2, false, var24, var25);
      } else {
         this.a = this.d;
         this.b = this.e;
         this.c = this.f;
      }

      this.a(var4, var5, var6, var19, var20, var21, var22, var24, var25);
      if (!akC.c) {
         Set var26 = this.d;
         this.d = this.e;
         this.e = var26;
         this.d.clear();
         this.a((double)var19, (double)var20, (double)var21, var26);
      }

   }

   private void a(Fb var1, int var2, boolean var3, int var4, int var5, int var6, Et var7, int var8, Et var9) {
      if (this.a && !akC.c) {
         this.a = false;
         this.p();
         Deque var10 = this.a;
         var10.clear();
         NN.a(adh.a((double)JI.b() / 8.0D, 1.0D, 2.5D));
         boolean var11 = this.a.f;
         if (var7 != null && var7.a().b <= var8) {
            Cn var13 = new Cn(var7, (abP)null, 0);
            if (var3 && this.a.a(var4, var5, var6).isOpaqueCube()) {
               var11 = false;
            }

            var7.a(var2);
            var10.add(var13);
         } else {
            int var12 = var5 > 0 ? Math.min(var8, 248) : 8;
            if (var9 != null) {
               this.b.add(var9.a());
            }

            this.a(var1, var2, var10, var12);
         }

         boolean var14 = afT.g();

         while(!var10.isEmpty()) {
            this.a(var1, var2, var4, var5, var6, var8, var10, var11, var14);
         }
      }

   }

   private void a(Fb var1, int var2, int var3, int var4, int var5, int var6, Deque var7, boolean var8, boolean var9) {
      Cn var10 = (Cn)var7.poll();
      Et var11 = var10.a;
      abP var12 = var10.a;
      Eo var13 = var11.a;
      if (!var13.a() || var11.a()) {
         this.a.add(var10);
      }

      if (var11.a().a) {
         this.b.add(var10);
      }

      if (!var13.a().isEmpty()) {
         this.c.add(var10);
      }

      abP[] var14 = var8 ? ajR.a(var10.a) : abP.VALUES;
      int var15 = var14.length;

      for(int var16 = 0; var16 < var15; ++var16) {
         abP var17 = var14[var16];
         if (!var8 || var12 == null || var13.a(var12.a(), var17)) {
            Et var18 = this.a(var3, var4, var5, var11, var17, var9, var6);
            if (var18 != null && var18.a(var2) && var18.a(var1, var2)) {
               int var19 = var10.a | 1 << var17.ordinal();
               Cn var20 = var18.a();
               var20.a(var17, var19);
               var7.add(var20);
            }
         }
      }

   }

   private void a(Fb var1, int var2, Deque var3, int var4) {
      CA var5 = this.a;
      int var6 = this.h;

      for(int var7 = -var6; var7 <= var6; ++var7) {
         for(int var8 = -var6; var8 <= var6; ++var8) {
            Et var9 = var5.a((var7 << 4) + 8, var4, (var8 << 4) + 8);
            if (var9 != null && var9.a(var1, var2)) {
               var9.a(var2);
               Cn var10 = var9.a();
               var10.a((abP)null, 0);
               var3.add(var10);
            }
         }
      }

   }

   private void a(NN var1, double var2, double var4, double var6) {
      if (this.e != var1.d || this.g != var1.f || var2 * var2 + var4 * var4 + var6 * var6 > 16.0D) {
         this.a = var1.d;
         this.b = var1.e;
         this.c = var1.f;
         this.e = var1.d;
         this.g = var1.f;
         this.a.a(var1.d, var1.f);
      }

   }

   private void c(NN var1) {
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.g = (double)var1.k;
      this.h = (double)var1.j;
   }

   private void a(double var1, double var3, double var5, Set<Et> var7) {
      List var8 = this.a;
      int var9 = 0;

      for(int var10 = var8.size(); var9 < var10; ++var9) {
         Cn var11 = (Cn)var8.get(var9);
         Et var12 = var11.a;
         if (var12.a() || var7.contains(var12)) {
            this.a(var1, var3, var5, var12);
         }
      }

      this.d.addAll(var7);
   }

   private void a(double var1, double var3, double var5, Et var7) {
      this.a = true;
      acV var8 = var7.a();
      double var9 = var1 - (double)(var8.a + 8);
      double var11 = var3 - (double)(var8.b + 8);
      double var13 = var5 - (double)(var8.c + 8);
      double var15 = var9 * var9 + var11 * var11 + var13 * var13;
      boolean var17 = var15 < 768.0D;
      if (!var17) {
         this.d.add(var7);
      } else if (!var7.c()) {
         this.c.add(var7);
      } else {
         this.a.b(var7);
         var7.e();
      }

   }

   private void a(NN var1, double var2, boolean var4, int var5, Et var6) {
      this.a = this.g;
      this.b = this.h;
      this.c = this.i;
      if (!var4 && this.a) {
         this.p();
         if (var6 != null && var6.a().b > var5) {
            this.b.add(var6.a());
         }

         Iterator var7 = akH.a(this.a, var2, var1, this.h, this.a);

         while(var7.hasNext()) {
            Et var8 = (Et)var7.next();
            if (var8 != null && var8.a().b <= var5) {
               Cn var9 = var8.a();
               if (!var8.a.a()) {
                  this.a.add(var9);
               }

               if (var8.a().a) {
                  this.b.add(var9);
               }

               if (!var8.a().a().isEmpty()) {
                  this.c.add(var9);
               }
            }
         }
      }

   }

   private Et a(int var1, int var2, int var3, Et var4, abP var5, boolean var6, int var7) {
      Et var8 = var4.a(var5);
      if (var8 == null) {
         return null;
      } else {
         acV var9;
         if ((var9 = var8.a()).b > var7) {
            return null;
         } else {
            if (var6) {
               int var10 = var1 - var9.a;
               int var11 = var3 - var9.c;
               int var12 = var10 * var10 + var11 * var11;
               if (var12 > this.n) {
                  return null;
               }
            }

            return var8;
         }
      }
   }

   private Et a(acV var1, Et var2, abP var3, boolean var4, int var5) {
      return this.a(var1.a, var1.b, var1.c, var2, var3, var4, var5);
   }

   protected Vector3f a(NN var1, double var2) {
      float var4 = (float)((double)var1.m + (double)(var1.k - var1.m) * var2);
      float var5 = (float)((double)var1.l + (double)(var1.j - var1.l) * var2);
      if (JI.j == 2) {
         var4 += 180.0F;
      }

      float var6 = adh.b(-var5 * 0.017453292F - 3.1415927F);
      float var7 = adh.a(-var5 * 0.017453292F - 3.1415927F);
      float var8 = -adh.b(-var4 * 0.017453292F);
      float var9 = adh.a(-var4 * 0.017453292F);
      return new Vector3f(var7 * var8, var9, var6 * var8);
   }

   public int a(abu var1, double var2, int var4, NN var5) {
      if (!this.a(var1, var2, var4, var5)) {
         return 0;
      } else {
         Co.a();
         List var6 = this.a;
         int var13;
         if (var1 == abu.TRANSLUCENT && !akC.c) {
            double var7 = var5.d - this.i;
            double var9 = var5.e - this.j;
            double var11 = var5.f - this.k;
            if (var7 * var7 + var9 * var9 + var11 * var11 > 1.0D) {
               this.i = var5.d;
               this.j = var5.e;
               this.k = var5.f;
               var13 = 0;
               Set var14 = this.b;
               var14.clear();
               int var15 = 0;

               for(int var16 = var6.size(); var15 < var16; ++var15) {
                  Cn var17 = (Cn)var6.get(var15);
                  if (var17.a.a.b(var1)) {
                     if (var13++ >= 15) {
                        break;
                     }

                     var14.add(var17.a);
                  }
               }
            }
         }

         int var18 = 0;
         boolean var8 = var1 == abu.TRANSLUCENT;
         int var19 = var8 ? var6.size() - 1 : 0;
         int var10 = var8 ? -1 : var6.size();
         int var20 = var8 ? -1 : 1;
         Bl var12 = this.a;

         for(var13 = var19; var13 != var10; var13 += var20) {
            Et var21 = ((Cn)var6.get(var13)).a;
            if (!var21.a().a(var1)) {
               ++var18;
               var12.a(var21, var1);
            }
         }

         if (var18 != 0) {
            if (afT.f() && this.a.a.a) {
               By.o();
            }

            this.a(var1);
         }

         return var18;
      }
   }

   private void a(abu var1) {
      // $FF: Couldn't be decompiled
   }

   private void a(Iterator<Bm> var1) {
      int var2 = this.d;

      while(var1.hasNext()) {
         Bm var3 = (Bm)var1.next();
         int var4 = var3.b();
         if (var2 - var4 > 400) {
            var1.remove();
         }
      }

   }

   public void d() {
      ++this.d;
      if (this.d % 20 == 0) {
         this.a((Iterator)this.a.values().iterator());
      }

   }

   private void m() {
      if (afT.E()) {
         By.o();
         By.c();
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         Co.a();
         By.a(false);
         this.a.a(d);
         Cw var1 = this.a.a;
         Bh var2 = var1.a();

         for(int var3 = 0; var3 < 6; ++var3) {
            By.C();
            if (var3 == 1) {
               By.b(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var3 == 2) {
               By.b(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var3 == 3) {
               By.b(180.0F, 1.0F, 0.0F, 0.0F);
            }

            if (var3 == 4) {
               By.b(90.0F, 0.0F, 0.0F, 1.0F);
            }

            if (var3 == 5) {
               By.b(-90.0F, 0.0F, 0.0F, 1.0F);
            }

            var2.a(7, In.i);
            int var4 = 40;
            int var5 = 40;
            int var6 = 40;
            if (afT.V()) {
               adm var7 = new adm((double)var4 / 255.0D, (double)var5 / 255.0D, (double)var6 / 255.0D);
               var7 = agd.a(this.a, var7, this.a, this.a.a(), 0.0F);
               var4 = (int)(var7.a * 255.0D);
               var5 = (int)(var7.b * 255.0D);
               var6 = (int)(var7.c * 255.0D);
            }

            var2.a(-100.0D, -100.0D, -100.0D).a(0.0D, 0.0D).a(var4, var5, var6, 255).endVertex();
            var2.a(-100.0D, -100.0D, 100.0D).a(0.0D, 16.0D).a(var4, var5, var6, 255).endVertex();
            var2.a(100.0D, -100.0D, 100.0D).a(16.0D, 16.0D).a(var4, var5, var6, 255).endVertex();
            var2.a(100.0D, -100.0D, -100.0D).a(16.0D, 0.0D).a(var4, var5, var6, 255).endVertex();
            var1.draw();
            By.D();
         }

         By.a(true);
         By.v();
         By.d();
         By.k();
      }

   }

   public void a(float var1, int var2) {
      sE var3 = this.a;
      yw var4 = var3.a;
      aen var5 = var4.a;
      if (var5.a() == adX.THE_END) {
         this.m();
      } else if (var5.a()) {
         By.w();
         boolean var6 = afT.ad();
         if (var6) {
            akC.z(var3);
         }

         NN var7 = var3.a();
         adm var8 = var4.a(var7, var1);
         var8 = agd.a((adm)var8, var4, var7.d, var7.e + 1.0D, var7.f);
         float var9 = (float)var8.a;
         float var10 = (float)var8.b;
         float var11 = (float)var8.c;
         if (var6) {
            akC.b(var9, var10, var11);
         }

         if (var2 != 2) {
            float var12 = (var9 * 30.0F + var10 * 59.0F + var11 * 11.0F) / 100.0F;
            float var13 = (var9 * 30.0F + var10 * 70.0F) / 100.0F;
            float var14 = (var9 * 30.0F + var11 * 70.0F) / 100.0F;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         By.d(var9, var10, var11);
         Cw var24 = var3.a;
         Bh var25 = var24.a();
         By.a(false);
         By.n();
         if (var6) {
            akC.t();
         }

         By.d(var9, var10, var11);
         if (var6) {
            akC.a(var3.a, var24);
         }

         if (afT.E()) {
            if (this.d) {
               Io var26 = this.b;
               var26.a();
               By.n(32884);
               By.d(3, 5126, 12, 0);
               var26.a(7);
               var26.b();
               By.m(32884);
            } else {
               By.p(this.b);
            }
         }

         By.o();
         if (var6) {
            akC.u();
         }

         By.c();
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         Co.a();
         float[] var27 = var5.a(var4.b(var1), var1);
         float var15;
         float var16;
         float var17;
         float var20;
         float var21;
         int var29;
         if (var27 != null && afT.F()) {
            By.w();
            if (var6) {
               akC.z(var3);
            }

            By.j(7425);
            By.C();
            By.b(90.0F, 1.0F, 0.0F, 0.0F);
            By.b(adh.a(var4.c(var1)) < 0.0F ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
            By.b(90.0F, 0.0F, 0.0F, 1.0F);
            var15 = var27[0];
            var16 = var27[1];
            var17 = var27[2];
            float var19;
            if (var2 != 2) {
               float var18 = (var15 * 30.0F + var16 * 59.0F + var17 * 11.0F) / 100.0F;
               var19 = (var15 * 30.0F + var16 * 70.0F) / 100.0F;
               var20 = (var15 * 30.0F + var17 * 70.0F) / 100.0F;
               var15 = var18;
               var16 = var19;
               var17 = var20;
            }

            var25.a(6, In.f);
            var25.a(0.0D, 100.0D, 0.0D).a(var15, var16, var17, var27[3]).endVertex();

            for(var29 = 0; var29 <= 16; ++var29) {
               var19 = (float)var29 * 6.2831855F / 16.0F;
               var20 = adh.a(var19);
               var21 = adh.b(var19);
               var25.a((double)(var20 * 120.0F), (double)(var21 * 120.0F), (double)(-var21 * 40.0F * var27[3])).a(var27[0], var27[1], var27[2], 0.0F).endVertex();
            }

            var24.draw();
            By.D();
            By.j(7424);
         }

         By.v();
         if (var6) {
            akC.y(var3);
         }

         By.a(BU.SRC_ALPHA, BL.ONE, BU.ONE, BL.ZERO);
         By.C();
         var15 = 1.0F - var4.b();
         By.c(1.0F, 1.0F, 1.0F, var15);
         By.b(-90.0F, 0.0F, 1.0F, 0.0F);
         alN.a(var4, var3, var24, var1);
         if (var6) {
            akC.h();
         }

         By.b(var4.b(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
         if (var6) {
            akC.c(var3);
         }

         var16 = 30.0F;
         if (afT.G()) {
            this.a.a(b);
            var25.a(7, In.g);
            var25.a((double)(-var16), 100.0D, (double)(-var16)).a(0.0D, 0.0D).endVertex();
            var25.a((double)var16, 100.0D, (double)(-var16)).a(1.0D, 0.0D).endVertex();
            var25.a((double)var16, 100.0D, (double)var16).a(1.0D, 1.0D).endVertex();
            var25.a((double)(-var16), 100.0D, (double)var16).a(0.0D, 1.0D).endVertex();
            var24.draw();
         }

         var16 = 20.0F;
         if (afT.H()) {
            this.a.a(a);
            int var28 = var4.a();
            var29 = var28 % 4;
            int var31 = var28 / 4 % 2;
            var20 = (float)var29 / 4.0F;
            var21 = (float)var31 / 2.0F;
            float var22 = (float)(var29 + 1) / 4.0F;
            float var23 = (float)(var31 + 1) / 2.0F;
            var25.a(7, In.g);
            var25.a((double)(-var16), -100.0D, (double)var16).a((double)var22, (double)var23).endVertex();
            var25.a((double)var16, -100.0D, (double)var16).a((double)var20, (double)var23).endVertex();
            var25.a((double)var16, -100.0D, (double)(-var16)).a((double)var20, (double)var21).endVertex();
            var25.a((double)(-var16), -100.0D, (double)(-var16)).a((double)var22, (double)var21).endVertex();
            var24.draw();
         }

         By.w();
         if (var6) {
            akC.z(var3);
         }

         var17 = var4.getStarBrightness(var1) * var15;
         if (var17 > 0.0F && afT.J() && !alN.a(this.a)) {
            By.c(var17, var17, var17, var17);
            if (this.d) {
               Io var30 = this.a;
               var30.a();
               By.n(32884);
               By.d(3, 5126, 12, 0);
               var30.a(7);
               var30.b();
               By.m(32884);
            } else {
               By.p(this.a);
            }
         }

         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         By.k();
         By.d();
         By.n();
         if (var6) {
            akC.t();
         }

         By.D();
         By.w();
         if (var6) {
            akC.z(var3);
         }

         By.d(0.0F, 0.0F, 0.0F);
         double var32 = var3.a().b(var1).b - var4.getHorizon();
         Io var33;
         if (var32 < 0.0D) {
            By.C();
            By.c(0.0F, 12.0F, 0.0F);
            if (this.d) {
               var33 = this.c;
               var33.a();
               By.n(32884);
               By.d(3, 5126, 12, 0);
               var33.a(7);
               var33.b();
               By.m(32884);
            } else {
               By.p(this.c);
            }

            By.D();
            var20 = -((float)(var32 + 65.0D));
            var25.a(7, In.f);
            var25.a(-1.0D, (double)var20, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, (double)var20, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, -1.0D, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, -1.0D, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, -1.0D, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, -1.0D, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, (double)var20, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, (double)var20, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, -1.0D, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, -1.0D, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, (double)var20, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, (double)var20, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, (double)var20, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, (double)var20, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, -1.0D, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, -1.0D, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, -1.0D, -1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(-1.0D, -1.0D, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, -1.0D, 1.0D).a(0, 0, 0, 255).endVertex();
            var25.a(1.0D, -1.0D, -1.0D).a(0, 0, 0, 255).endVertex();
            var24.draw();
         }

         if (var5.b()) {
            By.d(var9 * 0.2F + 0.04F, var10 * 0.2F + 0.04F, var11 * 0.6F + 0.1F);
         } else {
            By.d(var9, var10, var11);
         }

         if (JI.b() <= 4) {
            Bn var34 = this.a.a;
            By.d(var34.a, var34.b, var34.c);
         }

         By.C();
         By.c(0.0F, -((float)(var32 - 16.0D)), 0.0F);
         if (afT.E()) {
            if (this.d) {
               var33 = this.c;
               var33.a();
               By.n(32884);
               By.d(3, 5126, 12, 0);
               var33.a(7);
               var33.b();
               By.m(32884);
            } else {
               By.p(this.c);
            }
         }

         By.D();
         By.v();
         if (var6) {
            akC.y(var3);
         }

         By.a(true);
      }

   }

   public void a(float var1, int var2, double var3, double var5, double var7) {
      if (!afT.k() && this.a.a.a.a()) {
         if (afT.ad()) {
            akC.j(this.a);
         }

         if (afT.j()) {
            this.b(var1, var2, var3, var5, var7);
         } else {
            float var9 = var1;
            var1 = 0.0F;
            By.q();
            Cw var10 = this.a.a;
            Bh var11 = var10.a();
            this.a.a(c);
            By.l();
            By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
            adm var12 = this.a.a(var1);
            float var13 = (float)var12.a;
            float var14 = (float)var12.b;
            float var15 = (float)var12.c;
            this.a.a(false, this.d, var9, var12);
            if (this.a.a()) {
               this.a.a();
               if (var2 != 2) {
                  float var16 = (var13 * 30.0F + var14 * 59.0F + var15 * 11.0F) / 100.0F;
                  float var17 = (var13 * 30.0F + var14 * 70.0F) / 100.0F;
                  float var18 = (var13 * 30.0F + var15 * 70.0F) / 100.0F;
                  var13 = var16;
                  var14 = var17;
                  var15 = var18;
               }

               double var29 = (double)((float)this.d + var1);
               double var30 = var3 + var29 * 0.029999999329447746D;
               int var20 = adh.b(var30 / 2048.0D);
               int var21 = adh.b(var7 / 2048.0D);
               var30 -= (double)(var20 * 2048);
               double var22 = var7 - (double)(var21 * 2048);
               float var24 = this.a.a.a() - (float)var5 + 0.33F;
               var24 += JI.k * 128.0F;
               float var25 = (float)(var30 * 4.8828125E-4D);
               float var26 = (float)(var22 * 4.8828125E-4D);
               var11.a(7, In.i);

               for(int var27 = -256; var27 < 256; var27 += 32) {
                  for(int var28 = -256; var28 < 256; var28 += 32) {
                     var11.a((double)var27, (double)var24, (double)(var28 + 32)).a((double)((float)var27 * 4.8828125E-4F + var25), (double)((float)(var28 + 32) * 4.8828125E-4F + var26)).a(var13, var14, var15, 0.8F).endVertex();
                     var11.a((double)(var27 + 32), (double)var24, (double)(var28 + 32)).a((double)((float)(var27 + 32) * 4.8828125E-4F + var25), (double)((float)(var28 + 32) * 4.8828125E-4F + var26)).a(var13, var14, var15, 0.8F).endVertex();
                     var11.a((double)(var27 + 32), (double)var24, (double)var28).a((double)((float)(var27 + 32) * 4.8828125E-4F + var25), (double)((float)var28 * 4.8828125E-4F + var26)).a(var13, var14, var15, 0.8F).endVertex();
                     var11.a((double)var27, (double)var24, (double)var28).a((double)((float)var27 * 4.8828125E-4F + var25), (double)((float)var28 * 4.8828125E-4F + var26)).a(var13, var14, var15, 0.8F).endVertex();
                  }
               }

               var10.draw();
               this.a.b();
            }

            this.a.c();
            By.c(1.0F, 1.0F, 1.0F, 1.0F);
            By.k();
            By.p();
         }

         if (afT.ad()) {
            akC.k(this.a);
         }
      }

   }

   public boolean a(double var1, double var3, double var5, float var7) {
      return false;
   }

   private void b(float var1, int var2, double var3, double var5, double var7) {
      float var9 = 0.0F;
      By.q();
      Cw var10 = this.a.a;
      Bh var11 = var10.a();
      double var12 = (double)((float)this.d + var9);
      double var14 = (var3 + var12 * 0.029999999329447746D) / 12.0D;
      double var16 = var7 / 12.0D + 0.33000001311302185D;
      float var18 = this.a.a.a() - (float)var5 + 0.33F;
      var18 += JI.k * 128.0F;
      int var19 = adh.b(var14 / 2048.0D);
      int var20 = adh.b(var16 / 2048.0D);
      var14 -= (double)(var19 * 2048);
      var16 -= (double)(var20 * 2048);
      this.a.a(c);
      By.l();
      By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
      adm var21 = this.a.a(var9);
      float var22 = (float)var21.a;
      float var23 = (float)var21.b;
      float var24 = (float)var21.c;
      this.a.a(true, this.d, var1, var21);
      float var25;
      float var26;
      float var27;
      if (var2 != 2) {
         var25 = (var22 * 30.0F + var23 * 59.0F + var24 * 11.0F) / 100.0F;
         var26 = (var22 * 30.0F + var23 * 70.0F) / 100.0F;
         var27 = (var22 * 30.0F + var24 * 70.0F) / 100.0F;
         var22 = var25;
         var23 = var26;
         var24 = var27;
      }

      var25 = var22 * 0.9F;
      var26 = var23 * 0.9F;
      var27 = var24 * 0.9F;
      float var28 = var22 * 0.7F;
      float var29 = var23 * 0.7F;
      float var30 = var24 * 0.7F;
      float var31 = var22 * 0.8F;
      float var32 = var23 * 0.8F;
      float var33 = var24 * 0.8F;
      float var34 = (float)adh.b(var14) * 0.00390625F;
      float var35 = (float)adh.b(var16) * 0.00390625F;
      float var36 = (float)(var14 - (double)adh.b(var14));
      float var37 = (float)(var16 - (double)adh.b(var16));
      By.b(12.0F, 1.0F, 12.0F);

      int var38;
      for(var38 = 0; var38 < 2; ++var38) {
         if (var38 == 0) {
            By.a(false, false, false, false);
         } else {
            switch(var2) {
            case 0:
               By.a(false, true, true, true);
               break;
            case 1:
               By.a(true, false, false, true);
               break;
            case 2:
               By.a(true, true, true, true);
            }
         }

         this.a.c();
      }

      if (this.a.a()) {
         this.a.a();

         for(var38 = -3; var38 <= 4; ++var38) {
            for(int var39 = -3; var39 <= 4; ++var39) {
               var11.a(7, In.l);
               float var40 = (float)(var38 * 8);
               float var41 = (float)(var39 * 8);
               float var42 = var40 - var36;
               float var43 = var41 - var37;
               if (var18 > -5.0F) {
                  var11.a((double)(var42 + 0.0F), (double)(var18 + 0.0F), (double)(var43 + 8.0F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var28, var29, var30, 0.8F).a(0.0F, -1.0F, 0.0F).endVertex();
                  var11.a((double)(var42 + 8.0F), (double)(var18 + 0.0F), (double)(var43 + 8.0F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var28, var29, var30, 0.8F).a(0.0F, -1.0F, 0.0F).endVertex();
                  var11.a((double)(var42 + 8.0F), (double)(var18 + 0.0F), (double)(var43 + 0.0F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var28, var29, var30, 0.8F).a(0.0F, -1.0F, 0.0F).endVertex();
                  var11.a((double)(var42 + 0.0F), (double)(var18 + 0.0F), (double)(var43 + 0.0F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var28, var29, var30, 0.8F).a(0.0F, -1.0F, 0.0F).endVertex();
               }

               if (var18 <= 5.0F) {
                  var11.a((double)(var42 + 0.0F), (double)(var18 + 4.0F - 9.765625E-4F), (double)(var43 + 8.0F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var22, var23, var24, 0.8F).a(0.0F, 1.0F, 0.0F).endVertex();
                  var11.a((double)(var42 + 8.0F), (double)(var18 + 4.0F - 9.765625E-4F), (double)(var43 + 8.0F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var22, var23, var24, 0.8F).a(0.0F, 1.0F, 0.0F).endVertex();
                  var11.a((double)(var42 + 8.0F), (double)(var18 + 4.0F - 9.765625E-4F), (double)(var43 + 0.0F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var22, var23, var24, 0.8F).a(0.0F, 1.0F, 0.0F).endVertex();
                  var11.a((double)(var42 + 0.0F), (double)(var18 + 4.0F - 9.765625E-4F), (double)(var43 + 0.0F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var22, var23, var24, 0.8F).a(0.0F, 1.0F, 0.0F).endVertex();
               }

               int var44;
               if (var38 > -1) {
                  for(var44 = 0; var44 < 8; ++var44) {
                     var11.a((double)(var42 + (float)var44 + 0.0F), (double)(var18 + 0.0F), (double)(var43 + 8.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(-1.0F, 0.0F, 0.0F).endVertex();
                     var11.a((double)(var42 + (float)var44 + 0.0F), (double)(var18 + 4.0F), (double)(var43 + 8.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(-1.0F, 0.0F, 0.0F).endVertex();
                     var11.a((double)(var42 + (float)var44 + 0.0F), (double)(var18 + 4.0F), (double)(var43 + 0.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(-1.0F, 0.0F, 0.0F).endVertex();
                     var11.a((double)(var42 + (float)var44 + 0.0F), (double)(var18 + 0.0F), (double)(var43 + 0.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(-1.0F, 0.0F, 0.0F).endVertex();
                  }
               }

               if (var38 <= 1) {
                  for(var44 = 0; var44 < 8; ++var44) {
                     var11.a((double)(var42 + (float)var44 + 1.0F - 9.765625E-4F), (double)(var18 + 0.0F), (double)(var43 + 8.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(1.0F, 0.0F, 0.0F).endVertex();
                     var11.a((double)(var42 + (float)var44 + 1.0F - 9.765625E-4F), (double)(var18 + 4.0F), (double)(var43 + 8.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 8.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(1.0F, 0.0F, 0.0F).endVertex();
                     var11.a((double)(var42 + (float)var44 + 1.0F - 9.765625E-4F), (double)(var18 + 4.0F), (double)(var43 + 0.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(1.0F, 0.0F, 0.0F).endVertex();
                     var11.a((double)(var42 + (float)var44 + 1.0F - 9.765625E-4F), (double)(var18 + 0.0F), (double)(var43 + 0.0F)).a((double)((var40 + (float)var44 + 0.5F) * 0.00390625F + var34), (double)((var41 + 0.0F) * 0.00390625F + var35)).a(var25, var26, var27, 0.8F).a(1.0F, 0.0F, 0.0F).endVertex();
                  }
               }

               if (var39 > -1) {
                  for(var44 = 0; var44 < 8; ++var44) {
                     var11.a((double)(var42 + 0.0F), (double)(var18 + 4.0F), (double)(var43 + (float)var44 + 0.0F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, -1.0F).endVertex();
                     var11.a((double)(var42 + 8.0F), (double)(var18 + 4.0F), (double)(var43 + (float)var44 + 0.0F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, -1.0F).endVertex();
                     var11.a((double)(var42 + 8.0F), (double)(var18 + 0.0F), (double)(var43 + (float)var44 + 0.0F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, -1.0F).endVertex();
                     var11.a((double)(var42 + 0.0F), (double)(var18 + 0.0F), (double)(var43 + (float)var44 + 0.0F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, -1.0F).endVertex();
                  }
               }

               if (var39 <= 1) {
                  for(var44 = 0; var44 < 8; ++var44) {
                     var11.a((double)(var42 + 0.0F), (double)(var18 + 4.0F), (double)(var43 + (float)var44 + 1.0F - 9.765625E-4F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, 1.0F).endVertex();
                     var11.a((double)(var42 + 8.0F), (double)(var18 + 4.0F), (double)(var43 + (float)var44 + 1.0F - 9.765625E-4F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, 1.0F).endVertex();
                     var11.a((double)(var42 + 8.0F), (double)(var18 + 0.0F), (double)(var43 + (float)var44 + 1.0F - 9.765625E-4F)).a((double)((var40 + 8.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, 1.0F).endVertex();
                     var11.a((double)(var42 + 0.0F), (double)(var18 + 0.0F), (double)(var43 + (float)var44 + 1.0F - 9.765625E-4F)).a((double)((var40 + 0.0F) * 0.00390625F + var34), (double)((var41 + (float)var44 + 0.5F) * 0.00390625F + var35)).a(var31, var32, var33, 0.8F).a(0.0F, 0.0F, 1.0F).endVertex();
                  }
               }

               var10.draw();
            }
         }

         this.a.b();
      }

      By.c(1.0F, 1.0F, 1.0F, 1.0F);
      By.k();
      By.p();
   }

   public void a(long var1) {
      var1 = (long)((double)var1 + 1.0E8D);
      Eg var3 = this.a;
      this.a |= var3.a(var1);
      Iterator var4;
      Et var5;
      if (this.c.size() > 0) {
         var4 = this.c.iterator();

         while(var4.hasNext()) {
            var5 = (Et)var4.next();
            if (!this.a.a(var5)) {
               break;
            }

            var5.e();
            var4.remove();
            this.d.remove(var5);
            this.b.remove(var5);
         }
      }

      if (this.b.size() > 0) {
         var4 = this.b.iterator();
         if (var4.hasNext()) {
            var5 = (Et)var4.next();
            if (this.a.c(var5)) {
               var4.remove();
            }
         }
      }

      if (!this.d.isEmpty()) {
         double var13 = 0.0D;
         int var6 = afT.c();
         Iterator var7 = this.d.iterator();

         while(var7.hasNext()) {
            Et var8 = (Et)var7.next();
            boolean var9 = var8.d();
            boolean var10;
            if (!var8.b() && !var9) {
               var10 = var3.a(var8);
            } else {
               var10 = var3.b(var8);
            }

            if (!var10) {
               break;
            }

            var8.e();
            var7.remove();
            if (!var9) {
               double var11 = 2.0D * amf.a(var8);
               var13 += var11;
               if (var13 > (double)var6) {
                  break;
               }
            }
         }
      }

   }

   public void a(NN var1, float var2) {
      afc var3 = this.a.a();
      double var4 = (double)(JI.b() * 16);
      if (var1.d >= var3.e() - var4 || var1.d <= var3.c() + var4 || var1.f >= var3.f() - var4 || var1.f <= var3.d() + var4) {
         double var6 = 1.0D - var3.a(var1) / var4;
         var6 = Math.pow(var6, 4.0D);
         double var8 = var1.g + (var1.d - var1.g) * (double)var2;
         double var10 = var1.h + (var1.e - var1.h) * (double)var2;
         double var12 = var1.i + (var1.f - var1.i) * (double)var2;
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE, BU.ONE, BL.ZERO);
         this.a.a(e);
         By.a(false);
         By.C();
         int var14 = var3.a().a();
         float var15 = (float)(var14 >> 16 & 255) / 255.0F;
         float var16 = (float)(var14 >> 8 & 255) / 255.0F;
         float var17 = (float)(var14 & 255) / 255.0F;
         By.c(var15, var16, var17, (float)var6);
         By.a(-3.0F, -3.0F);
         By.r();
         By.a(516, 0.1F);
         By.d();
         By.q();
         float var18 = (float)(sE.a() % 3000L) / 3000.0F;
         Cw var19 = this.a.a;
         Bh var20 = var19.a();
         var20.a(7, In.g);
         var20.setTranslation(-var8, -var10, -var12);
         double var21 = Math.max((double)adh.b(var12 - var4), var3.d());
         double var23 = Math.min((double)adh.c(var12 + var4), var3.f());
         double var25 = var3.e();
         double var30;
         if (var8 > var25 - var4) {
            float var27 = 0.0F;

            for(double var28 = var21; var28 < var23; var27 += 0.5F) {
               var30 = Math.min(1.0D, var23 - var28);
               float var32 = (float)var30 * 0.5F;
               var20.a(var25, 256.0D, var28).a((double)(var18 + var27), (double)(var18 + 0.0F)).endVertex();
               var20.a(var25, 256.0D, var28 + var30).a((double)(var18 + var32 + var27), (double)(var18 + 0.0F)).endVertex();
               var20.a(var25, 0.0D, var28 + var30).a((double)(var18 + var32 + var27), (double)(var18 + 128.0F)).endVertex();
               var20.a(var25, 0.0D, var28).a((double)(var18 + var27), (double)(var18 + 128.0F)).endVertex();
               ++var28;
            }
         }

         double var39 = var3.c();
         double var42;
         if (var8 < var39 + var4) {
            float var29 = 0.0F;

            for(var30 = var21; var30 < var23; var29 += 0.5F) {
               var42 = Math.min(1.0D, var23 - var30);
               float var34 = (float)var42 * 0.5F;
               var20.a(var39, 256.0D, var30).a((double)(var18 + var29), (double)(var18 + 0.0F)).endVertex();
               var20.a(var39, 256.0D, var30 + var42).a((double)(var18 + var34 + var29), (double)(var18 + 0.0F)).endVertex();
               var20.a(var39, 0.0D, var30 + var42).a((double)(var18 + var34 + var29), (double)(var18 + 128.0F)).endVertex();
               var20.a(var39, 0.0D, var30).a((double)(var18 + var29), (double)(var18 + 128.0F)).endVertex();
               ++var30;
            }
         }

         var21 = Math.max((double)adh.b(var8 - var4), var3.c());
         var23 = Math.min((double)adh.c(var8 + var4), var3.e());
         double var40 = var3.f();
         double var43;
         if (var12 > var40 - var4) {
            float var31 = 0.0F;

            for(var42 = var21; var42 < var23; var31 += 0.5F) {
               var43 = Math.min(1.0D, var23 - var42);
               float var36 = (float)var43 * 0.5F;
               var20.a(var42, 256.0D, var40).a((double)(var18 + var31), (double)(var18 + 0.0F)).endVertex();
               var20.a(var42 + var43, 256.0D, var40).a((double)(var18 + var36 + var31), (double)(var18 + 0.0F)).endVertex();
               var20.a(var42 + var43, 0.0D, var40).a((double)(var18 + var36 + var31), (double)(var18 + 128.0F)).endVertex();
               var20.a(var42, 0.0D, var40).a((double)(var18 + var31), (double)(var18 + 128.0F)).endVertex();
               ++var42;
            }
         }

         double var41 = var3.d();
         if (var12 < var41 + var4) {
            float var33 = 0.0F;

            for(var43 = var21; var43 < var23; var33 += 0.5F) {
               double var44 = Math.min(1.0D, var23 - var43);
               float var38 = (float)var44 * 0.5F;
               var20.a(var43, 256.0D, var41).a((double)(var18 + var33), (double)(var18 + 0.0F)).endVertex();
               var20.a(var43 + var44, 256.0D, var41).a((double)(var18 + var38 + var33), (double)(var18 + 0.0F)).endVertex();
               var20.a(var43 + var44, 0.0D, var41).a((double)(var18 + var38 + var33), (double)(var18 + 128.0F)).endVertex();
               var20.a(var43, 0.0D, var41).a((double)(var18 + var33), (double)(var18 + 128.0F)).endVertex();
               ++var43;
            }
         }

         var19.draw();
         var20.setTranslation(0.0D, 0.0D, 0.0D);
         By.p();
         By.c();
         By.a(0.0F, 0.0F);
         By.s();
         By.d();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         By.k();
         By.D();
         By.a(true);
      }

   }

   private void n() {
      By.a(BU.DST_COLOR, BL.SRC_COLOR, BU.ONE, BL.ZERO);
      By.l();
      By.c(1.0F, 1.0F, 1.0F, 0.5F);
      By.a(-1.0F, -10.0F);
      By.r();
      By.a(516, 0.1F);
      By.d();
      By.C();
      if (afT.ad()) {
         akF.e(this.a);
      }

   }

   private void o() {
      By.c();
      By.a(0.0F, 0.0F);
      By.s();
      By.d();
      By.a(true);
      By.D();
      if (afT.ad()) {
         akF.f(this.a);
      }

   }

   public void a(Cw var1, Bh var2, NN var3, float var4) {
      Int2ObjectMap var5 = this.a;
      if (!var5.isEmpty()) {
         double var6 = var3.g;
         double var8 = var3.h;
         double var10 = var3.i;
         double var12 = var6 + (var3.d - var6) * (double)var4;
         double var14 = var8 + (var3.e - var8) * (double)var4;
         double var16 = var10 + (var3.f - var10) * (double)var4;
         this.a.a(HO.a);
         this.n();
         var2.a(7, In.a);
         var2.setTranslation(-var12, -var14, -var16);
         var2.noColor();
         ObjectIterator var18 = var5.values().iterator();
         HK[] var19 = this.a;
         Bd var20 = this.a.a();
         yw var21 = this.a;
         adm var22 = adm.a;

         while(true) {
            while(true) {
               Bm var23;
               acV var24;
               sD var25;
               nh var26;
               do {
                  do {
                     do {
                        do {
                           if (!var18.hasNext()) {
                              var1.draw();
                              var2.setTranslation(0.0D, 0.0D, 0.0D);
                              this.o();
                              return;
                           }

                           var23 = (Bm)var18.next();
                           var24 = var23.a();
                           var25 = var21.a(var24);
                           var26 = var25.a();
                        } while(var26 instanceof nB);
                     } while(var26 instanceof oo);
                  } while(var26 instanceof qS);
               } while(var26 instanceof rc);

               double var27 = (double)var24.a - var12;
               double var29 = (double)var24.b - var14;
               double var31 = (double)var24.c - var16;
               if (var25.a() != si.a && !(var27 * var27 + var29 * var29 + var31 * var31 > 1024.0D)) {
                  Mp var33 = var23.a;
                  if (var33 == null) {
                     int var34 = var23.a();
                     HK var35 = var19[var34];
                     var23.a = var33 = var20.a(var22, var25, var24, (HK)var35, (aec)var21);
                  }

                  var33.a();
               } else {
                  var23.a = null;
                  var18.remove();
               }
            }
         }
      }
   }

   public void a(NN var1, adi var2, int var3, float var4) {
      if (var3 == 0 && var2.a == adj.BLOCK) {
         By.l();
         By.a(BU.SRC_ALPHA, BL.ONE_MINUS_SRC_ALPHA, BU.ONE, BL.ZERO);
         By.d(2.0F);
         By.w();
         if (afT.ad()) {
            akC.z(this.a);
         }

         By.a(false);
         acV var5 = var2.a();
         sD var6 = this.a.a((acV)var5);
         if (var6.a() != si.a && this.a.a().a(var5)) {
            double var7 = var1.g + (var1.d - var1.g) * (double)var4;
            double var9 = var1.h + (var1.e - var1.h) * (double)var4;
            double var11 = var1.i + (var1.f - var1.i) * (double)var4;
            acU var13 = var6.a(this.a, var5);
            double var14 = var13.a;
            double var16 = var13.b;
            double var18 = var13.c;
            double var20 = var13.d;
            double var22 = var13.e;
            double var24 = var13.f;
            a(this.a.a, var13.b(0.0020000000949949026D).f(-var7, -var9, -var11), 0.0F, 0.0F, 0.0F, 0.4F);
            var13.a(var14, var16, var18, var20, var22, var24);
         }

         By.a(true);
         By.v();
         if (afT.ad()) {
            akC.y(this.a);
         }

         By.k();
      }

   }

   public static void a(Cw var0, acU var1, float var2, float var3, float var4, float var5) {
      a(var0, var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var2, var3, var4, var5);
   }

   public static void a(Cw var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16) {
      Bh var17 = var0.a();
      var17.a(3, In.f);
      a(var17, var1, var3, var5, var7, var9, var11, var13, var14, var15, var16);
      var0.draw();
   }

   public static void a(Bh var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16) {
      var0.a(var1, var3, var5).a(var13, var14, var15, 0.0F).endVertex();
      var0.a(var1, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var5).a(var13, var14, var15, 0.0F).endVertex();
      var0.a(var1, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var11).a(var13, var14, var15, 0.0F).endVertex();
      var0.a(var7, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var5).a(var13, var14, var15, 0.0F).endVertex();
      var0.a(var7, var3, var5).a(var13, var14, var15, var16).endVertex();
   }

   public static void b(Cw var0, acU var1, float var2, float var3, float var4, float var5) {
      b(var0, var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var2, var3, var4, var5);
   }

   public static void b(Cw var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16) {
      Bh var17 = var0.a();
      var17.a(5, In.f);
      b(var17, var1, var3, var5, var7, var9, var11, var13, var14, var15, var16);
      var0.draw();
   }

   public static void b(Bh var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16) {
      var0.a(var1, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var3, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var1, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var5).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var11).a(var13, var14, var15, var16).endVertex();
      var0.a(var7, var9, var11).a(var13, var14, var15, var16).endVertex();
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.a.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void a(aej var1, int var2, int var3, int var4, sD var5, sD var6, int var7) {
      this.a(var2 - 1, var3 - 1, var4 - 1, var2 + 1, var3 + 1, var4 + 1, (var7 & 8) != 0);
   }

   public final void a(aej var1, acV var2, sD var3, sD var4, int var5) {
      this.a(var1, var2.a, var2.b, var2.c, var3, var4, var5);
   }

   public void a(int var1, int var2, int var3) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1, false);
   }

   public final void a(acV var1) {
      this.a(var1.a, var1.b, var1.c);
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.a(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1, false);
   }

   public void a(acJ var1, acV var2) {
      var2 = var2.g();
      tb var3 = (tb)this.a.remove(var2);
      if (var3 != null) {
         this.a.a().b(var3);
      }

      if (var1 != null) {
         UO var4 = UO.a(var1);
         if (var4 != null) {
            this.a.a.a(var4.a());
         }

         tm var5 = tm.a(var1, (float)var2.a, (float)var2.b, (float)var2.c);
         this.a.put(var2, var5);
         this.a.a().a((tb)var5);
      }

      this.a(this.a, var2, var1 != null);
   }

   private void a(aej var1, acV var2, boolean var3) {
      RecyclableArrayList var4 = var1.a(Oh.class, (new acU(var2)).c(3.0D));
      int var5 = 0;

      for(int var6 = var4.size(); var5 < var6; ++var5) {
         Oh var7 = (Oh)var4.get(var5);
         var7.a(var2, var3);
      }

      var4.recycle();
   }

   public void a(Rn var1, acJ var2, acI var3, double var4, double var6, double var8, float var10, float var11) {
   }

   public void a(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      this.a(var1, var2, false, var3, var5, var7, var9, var11, var13, var15);
   }

   public void a(int var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14, int... var16) {
      try {
         this.a(var1, var2, var3, var4, var6, var8, var10, var12, var14, var16);
      } catch (Throwable var20) {
         Kn var18 = Kn.a(var20, "Exception while adding particle");
         Ku var19 = var18.a("Particle being added");
         var19.a((String)"ID", (Object)var1);
         if (var16 != null) {
            var19.a((String)"Parameters", (Object)var16);
         }

         var19.a((String)"Position", (KB)(new Cl(this, var4, var6, var8)));
         throw new acB(var18);
      }
   }

   private void a(abW var1, double var2, double var4, double var6, double var8, double var10, double var12, int... var14) {
      this.a(var1.a(), var1.a(), var2, var4, var6, var8, var10, var12, var14);
   }

   public final yQ a(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      return this.a(var1, var2, false, var3, var5, var7, var9, var11, var13, var15);
   }

   public final yQ a(int var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14, int... var16) {
      CallbackInfoReturnable var27 = new CallbackInfoReturnable("spawnParticle0", true);
      this.a(var1, var2, var3, var4, var6, var8, var10, var12, var14, var16, var27);
      if (var27.isCancelled()) {
         return (yQ)var27.getReturnValue();
      } else {
         NN var17 = this.a.a();
         if (var17 != null && this.a.a != null) {
            int var18 = this.a(var3);
            double var19 = var17.d - var4;
            double var21 = var17.e - var6;
            double var23 = var17.f - var8;
            if (var1 == abW.EXPLOSION_HUGE.a() && !afT.t()) {
               return null;
            } else if (var1 == abW.EXPLOSION_LARGE.a() && !afT.t()) {
               return null;
            } else if (var1 == abW.EXPLOSION_NORMAL.a() && !afT.t()) {
               return null;
            } else if (var1 == abW.SUSPENDED.a() && !afT.x()) {
               return null;
            } else if (var1 == abW.SUSPENDED_DEPTH.a() && !afT.w()) {
               return null;
            } else if (var1 == abW.SMOKE_NORMAL.a() && !afT.v()) {
               return null;
            } else if (var1 == abW.SMOKE_LARGE.a() && !afT.v()) {
               return null;
            } else if (var1 == abW.SPELL_MOB.a() && !afT.A()) {
               return null;
            } else if (var1 == abW.SPELL_MOB_AMBIENT.a() && !afT.A()) {
               return null;
            } else if (var1 == abW.SPELL.a() && !afT.A()) {
               return null;
            } else if (var1 == abW.SPELL_INSTANT.a() && !afT.A()) {
               return null;
            } else if (var1 == abW.SPELL_WITCH.a() && !afT.A()) {
               return null;
            } else if (var1 == abW.PORTAL.a() && !afT.z()) {
               return null;
            } else if (var1 == abW.FLAME.a() && !afT.u()) {
               return null;
            } else if (var1 == abW.REDSTONE.a() && !afT.s()) {
               return null;
            } else if (var1 == abW.DRIP_WATER.a() && !afT.P()) {
               return null;
            } else if (var1 == abW.DRIP_LAVA.a() && !afT.P()) {
               return null;
            } else if (var1 == abW.FIREWORKS_SPARK.a() && !afT.B()) {
               return null;
            } else {
               if (!var2) {
                  double var25 = 1024.0D;
                  if (var1 == abW.CRIT.a()) {
                     var25 = 38416.0D;
                  }

                  if (var19 * var19 + var21 * var21 + var23 * var23 > var25) {
                     return null;
                  }

                  if (var18 > 1) {
                     return null;
                  }
               }

               yQ var28 = this.a.a.b(var1, var4, var6, var8, var10, var12, var14, var16);
               if (var1 == abW.WATER_BUBBLE.a()) {
                  agd.a(this.a.a(), var28, this.a, var4, var6, var8, this.a);
               }

               if (var1 == abW.WATER_SPLASH.a()) {
                  agd.a(this.a.a(), var28, this.a, var4, var6, var8, this.a);
               }

               if (var1 == abW.WATER_DROP.a()) {
                  agd.a(this.a.a(), var28, this.a, var4, var6, var8, this.a);
               }

               if (var1 == abW.TOWN_AURA.a()) {
                  agd.b(var28);
               }

               if (var1 == abW.PORTAL.a()) {
                  agd.a(var28);
               }

               if (var1 == abW.REDSTONE.a()) {
                  agd.a((yQ)var28, this.a, var4, var6, var8);
               }

               return var28;
            }
         } else {
            return null;
         }
      }
   }

   private int a(boolean var1) {
      int var2 = JI.l;
      if (var1 && var2 == 2 && this.a.a.nextInt(10) == 0) {
         var2 = 1;
      }

      if (var2 == 1 && this.a.a.nextInt(3) == 0) {
         var2 = 2;
      }

      return var2;
   }

   public void a(NN var1) {
      ajK.a((sE)this.a, (NN)var1, (aej)this.a);
   }

   public void b(NN var1) {
      ajK.a(this.a, var1);
      if (afT.ai()) {
         ajv.a(var1, this);
      }

   }

   public void a(int var1, acV var2, int var3) {
      switch(var1) {
      case 1023:
      case 1028:
      case 1038:
         NN var4 = this.a.a();
         if (var4 != null) {
            double var5 = (double)var2.a - var4.d;
            double var7 = (double)var2.b - var4.e;
            double var9 = (double)var2.c - var4.f;
            double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
            double var13 = var4.d;
            double var15 = var4.e;
            double var17 = var4.f;
            if (var11 > 0.0D) {
               var13 += var5 / var11 * 2.0D;
               var15 += var7 / var11 * 2.0D;
               var17 += var9 / var11 * 2.0D;
            }

            if (var1 == 1023) {
               this.a.a(var13, var15, var17, RW.iL, acI.HOSTILE, 1.0F, 1.0F, false);
            } else if (var1 == 1038) {
               this.a.a(var13, var15, var17, RW.bq, acI.HOSTILE, 1.0F, 1.0F, false);
            } else {
               this.a.a(var13, var15, var17, RW.aV, acI.HOSTILE, 5.0F, 1.0F, false);
            }
         }
      default:
      }
   }

   public void a(Rn var1, int var2, int var3, int var4, int var5, int var6) {
      Random var7 = this.a.a;
      double var22;
      double var24;
      int var26;
      double var29;
      double var31;
      double var42;
      double var43;
      switch(var2) {
      case 1000:
         this.a.a((double)var3, (double)var4, (double)var5, RW.az, acI.BLOCKS, 1.0F, 1.0F, false);
         break;
      case 1001:
         this.a.a((double)var3, (double)var4, (double)var5, RW.aA, acI.BLOCKS, 1.0F, 1.2F, false);
         break;
      case 1002:
         this.a.a((double)var3, (double)var4, (double)var5, RW.aB, acI.BLOCKS, 1.0F, 1.2F, false);
         break;
      case 1003:
         this.a.a((double)var3, (double)var4, (double)var5, RW.bc, acI.NEUTRAL, 1.0F, 1.2F, false);
         break;
      case 1004:
         this.a.a((double)var3, (double)var4, (double)var5, RW.bJ, acI.NEUTRAL, 1.0F, 1.2F, false);
         break;
      case 1005:
         this.a.a((double)var3, (double)var4, (double)var5, RW.do, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1006:
         this.a.a((double)var3, (double)var4, (double)var5, RW.iW, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1007:
         this.a.a((double)var3, (double)var4, (double)var5, RW.iY, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1008:
         this.a.a((double)var3, (double)var4, (double)var5, RW.bC, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1009:
         this.a.a((double)var3, (double)var4, (double)var5, RW.bN, acI.BLOCKS, 0.5F, 2.6F + (var7.nextFloat() - var7.nextFloat()) * 0.8F, false);
         break;
      case 1010:
         ada var8 = ada.a(var3, var4, var5);
         if (SZ.a(var6) instanceof UO) {
            this.a.a(var8, ((UO)SZ.a(var6)).a());
         } else {
            this.a.a(var8, (acJ)null);
         }

         var8.recycle();
         break;
      case 1011:
         this.a.a((double)var3, (double)var4, (double)var5, RW.dn, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1012:
         this.a.a((double)var3, (double)var4, (double)var5, RW.iV, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1013:
         this.a.a((double)var3, (double)var4, (double)var5, RW.iX, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1014:
         this.a.a((double)var3, (double)var4, (double)var5, RW.bB, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1015:
         this.a.a((double)var3, (double)var4, (double)var5, RW.cg, acI.HOSTILE, 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1016:
         this.a.a((double)var3, (double)var4, (double)var5, RW.cf, acI.HOSTILE, 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1017:
         this.a.a((double)var3, (double)var4, (double)var5, RW.ba, acI.HOSTILE, 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1018:
         this.a.a((double)var3, (double)var4, (double)var5, RW.G, acI.HOSTILE, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1019:
         this.a.a((double)var3, (double)var4, (double)var5, RW.jj, acI.HOSTILE, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1020:
         this.a.a((double)var3, (double)var4, (double)var5, RW.jk, acI.HOSTILE, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1021:
         this.a.a((double)var3, (double)var4, (double)var5, RW.jl, acI.HOSTILE, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1022:
         this.a.a((double)var3, (double)var4, (double)var5, RW.iD, acI.HOSTILE, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1024:
         this.a.a((double)var3, (double)var4, (double)var5, RW.iG, acI.HOSTILE, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1025:
         this.a.a((double)var3, (double)var4, (double)var5, RW.B, acI.NEUTRAL, 0.05F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1026:
         this.a.a((double)var3, (double)var4, (double)var5, RW.jr, acI.HOSTILE, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1027:
         this.a.a((double)var3, (double)var4, (double)var5, RW.jy, acI.NEUTRAL, 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F, false);
         break;
      case 1029:
         this.a.a((double)var3, (double)var4, (double)var5, RW.c, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1030:
         this.a.a((double)var3, (double)var4, (double)var5, RW.i, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1031:
         this.a.a((double)var3, (double)var4, (double)var5, RW.f, acI.BLOCKS, 0.3F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1032:
         this.a.a().a((tb)tm.a(RW.fT, var7.nextFloat() * 0.4F + 0.8F));
         break;
      case 1033:
         this.a.a((double)var3, (double)var4, (double)var5, RW.aj, acI.BLOCKS, 1.0F, 1.0F, false);
         break;
      case 1034:
         this.a.a((double)var3, (double)var4, (double)var5, RW.ai, acI.BLOCKS, 1.0F, 1.0F, false);
         break;
      case 1035:
         this.a.a((double)var3, (double)var4, (double)var5, RW.P, acI.BLOCKS, 1.0F, 1.0F, false);
         break;
      case 1036:
         this.a.a((double)var3, (double)var4, (double)var5, RW.dp, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 1037:
         this.a.a((double)var3, (double)var4, (double)var5, RW.dq, acI.BLOCKS, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 2000:
         int var9 = var6 % 3 - 1;
         int var10 = var6 / 3 % 3 - 1;
         double var11 = (double)var3 + (double)var9 * 0.6D + 0.5D;
         double var13 = (double)var4 + 0.5D;
         double var15 = (double)var5 + (double)var10 * 0.6D + 0.5D;

         for(int var36 = 0; var36 < 10; ++var36) {
            double var39 = var7.nextDouble() * 0.2D + 0.01D;
            double var40 = var11 + (double)var9 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var10 * 0.5D;
            var22 = var13 + (var7.nextDouble() - 0.5D) * 0.5D;
            var24 = var15 + (double)var10 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var9 * 0.5D;
            var43 = (double)var9 * var39 + var7.nextGaussian() * 0.01D;
            double var44 = -0.03D + var7.nextGaussian() * 0.01D;
            double var30 = (double)var10 * var39 + var7.nextGaussian() * 0.01D;
            this.a(abW.SMOKE_NORMAL, var40, var22, var24, var43, var44, var30);
         }

         return;
      case 2001:
         nh var17 = mY.a(var6 & 4095);
         if (var17.a().a() != si.a) {
            sf var38 = var17.a();
            this.a.a((double)var3, (double)var4, (double)var5, var38.a(), acI.BLOCKS, (var38.getVolume() + 1.0F) / 2.0F, var38.getPitch() * 0.8F, false);
         }

         this.a.a.a(var3, var4, var5, var17.a(var6 >> 12 & 255));
         break;
      case 2002:
      case 2007:
         for(int var18 = 0; var18 < 8; ++var18) {
            this.a(abW.ITEM_CRACK, (double)var3, (double)var4, (double)var5, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D, SZ.a((SZ)RT.b));
         }

         float var37 = (float)(var6 >> 16 & 255) / 255.0F;
         float var19 = (float)(var6 >> 8 & 255) / 255.0F;
         float var20 = (float)(var6 >> 0 & 255) / 255.0F;
         abW var21 = var2 == 2007 ? abW.SPELL_INSTANT : abW.SPELL;

         for(int var41 = 0; var41 < 100; ++var41) {
            double var23 = var7.nextDouble() * 4.0D;
            double var25 = var7.nextDouble() * 3.141592653589793D * 2.0D;
            var42 = Math.cos(var25) * var23;
            var29 = 0.01D + var7.nextDouble() * 0.5D;
            var31 = Math.sin(var25) * var23;
            yQ var45 = this.a(var21.a(), var21.a(), (double)var3 + var42 * 0.1D, (double)var4 + 0.3D, (double)var5 + var31 * 0.1D, var42, var29, var31);
            if (var45 != null) {
               float var34 = 0.75F + var7.nextFloat() * 0.25F;
               var45.a(var37 * var34, var19 * var34, var20 * var34);
               var45.a((float)var23);
            }
         }

         this.a.a((double)var3, (double)var4, (double)var5, RW.hD, acI.NEUTRAL, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 2003:
         var22 = (double)var3 + 0.5D;
         var24 = (double)var5 + 0.5D;

         for(var26 = 0; var26 < 8; ++var26) {
            this.a(abW.ITEM_CRACK, var22, (double)var4, var24, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D, SZ.a(RT.br));
         }

         for(var43 = 0.0D; var43 < 6.283185307179586D; var43 += 0.15707963267948966D) {
            this.a(abW.PORTAL, var22 + Math.cos(var43) * 5.0D, (double)var4 - 0.4D, var24 + Math.sin(var43) * 5.0D, Math.cos(var43) * -5.0D, 0.0D, Math.sin(var43) * -5.0D);
            this.a(abW.PORTAL, var22 + Math.cos(var43) * 5.0D, (double)var4 - 0.4D, var24 + Math.sin(var43) * 5.0D, Math.cos(var43) * -7.0D, 0.0D, Math.sin(var43) * -7.0D);
         }

         return;
      case 2004:
         for(var26 = 0; var26 < 20; ++var26) {
            var42 = (double)var3 + 0.5D + ((double)this.a.a.nextFloat() - 0.5D) * 2.0D;
            var29 = (double)var4 + 0.5D + ((double)this.a.a.nextFloat() - 0.5D) * 2.0D;
            var31 = (double)var5 + 0.5D + ((double)this.a.a.nextFloat() - 0.5D) * 2.0D;
            this.a.a(abW.SMOKE_NORMAL, var42, var29, var31, 0.0D, 0.0D, 0.0D, new int[0]);
            this.a.a(abW.FLAME, var42, var29, var31, 0.0D, 0.0D, 0.0D, new int[0]);
         }

         return;
      case 2005:
         Ua.a(this.a, var3, var4, var5, var6);
         break;
      case 2006:
         for(var26 = 0; var26 < 200; ++var26) {
            float var27 = var7.nextFloat() * 4.0F;
            float var28 = var7.nextFloat() * 6.2831855F;
            var29 = (double)(adh.b(var28) * var27);
            var31 = 0.01D + var7.nextDouble() * 0.5D;
            double var33 = (double)(adh.a(var28) * var27);
            yQ var35 = this.a(abW.DRAGON_BREATH.a(), false, (double)var3 + var29 * 0.1D, (double)var4 + 0.3D, (double)var5 + var33 * 0.1D, var29, var31, var33);
            if (var35 != null) {
               var35.a(var27);
            }
         }

         this.a.a((double)var3, (double)var4, (double)var5, RW.aW, acI.HOSTILE, 1.0F, this.a.a.nextFloat() * 0.1F + 0.9F, false);
         break;
      case 3000:
         this.a.a(abW.EXPLOSION_HUGE, true, (double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, 0.0D, 0.0D, 0.0D, new int[0]);
         this.a.a((double)var3, (double)var4, (double)var5, RW.bo, acI.BLOCKS, 10.0F, (1.0F + (this.a.a.nextFloat() - this.a.a.nextFloat()) * 0.2F) * 0.7F, false);
         break;
      case 3001:
         this.a.a((double)var3, (double)var4, (double)var5, RW.aY, acI.HOSTILE, 64.0F, 0.8F + this.a.a.nextFloat() * 0.3F, false);
      }

   }

   public void b(int var1, acV var2, int var3) {
      if (var3 >= 0 && var3 < 10) {
         Bm var4 = (Bm)this.a.get(var1);
         if (var4 == null || var4.a().a != var2.a || var4.a().b != var2.b || var4.a().c != var2.c) {
            var4 = new Bm(var1, var2);
            this.a.put(var1, var4);
         }

         var4.a(var3);
         var4.b(this.d);
      } else {
         this.a.remove(var1);
      }

   }

   public boolean b() {
      return this.d.isEmpty() && this.a.a();
   }

   public void e() {
      this.a = true;
   }

   public final void f() {
      this.a.d();
   }

   public final int b() {
      return this.a.a.length;
   }

   public final int c() {
      return this.a.size();
   }

   public int d() {
      return this.k;
   }

   public int e() {
      return this.o;
   }

   public final int f() {
      yw var1 = this.a;
      return var1 == null ? 0 : var1.b().a();
   }

   public final int g() {
      return this.d.size();
   }

   public final Et a(int var1, int var2, int var3) {
      return this.a.a(var1, var2, var3);
   }

   public final Et a(acV var1) {
      return this.a(var1.a, var1.b, var1.c);
   }

   public yw a() {
      return this.a;
   }

   private void p() {
      if (q > 0) {
         this.a = new ArrayList(this.a.size() + 16);
         this.b = new ArrayList(this.b.size() + 16);
         this.c = new ArrayList(this.c.size() + 16);
      } else {
         this.a.clear();
         this.b.clear();
         this.c.clear();
      }

   }

   public final void g() {
      if (this.a != null) {
         this.a.d();
      }

   }

   public final void h() {
      if (this.a != null) {
         this.a.e();
      }

   }

   public void a(Collection<aaD> var1, Collection<aaD> var2) {
      synchronized(this.a) {
         this.a.removeAll(var1);
         this.a.addAll(var2);
      }
   }

   static {
      a = sE.a;
      a = new Lg("textures/environment/moon_phases.png");
      b = new Lg("textures/environment/sun.png");
      c = new Lg("textures/environment/clouds.png");
      d = new Lg("textures/environment/end_sky.png");
      e = new Lg("textures/misc/forcefield.png");
      q = 0;
   }

   private void a(int var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14, int[] var16, CallbackInfoReturnable var17) {
      if (JI.l == 2) {
         var17.setReturnValue((Object)null);
      }

   }

   public Particle spawnParticle(ParticleType var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int... var15) {
      return (Particle)d.a(this.a(var1.getId(), var2, var3, var5, var7, var11, var11, var13, var15));
   }

   protected boolean a(abu var1, double var2, int var4, NN var5) {
      return !((BlockLayerRender)aq.BUS.fire(aq.a((BlockRenderLayer)d.a(var1), (float)var2, var4, (Entity)d.a(var5)))).isCancelled();
   }

   public void a(NN var1, Fb var2, float var3, CallbackInfo var4) {
      if (this.a.c()) {
         JI var10001 = this.a.a;
         this.r = JI.j;
         JI var10000 = this.a.a;
         JI.j = 1;
      }

   }

   public void b(NN var1, Fb var2, float var3, CallbackInfo var4) {
      if (this.a.c()) {
         JI var10000 = this.a.a;
         JI.j = this.r;
      }

   }
}
