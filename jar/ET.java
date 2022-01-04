import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.ReentrantLock;

public class Et {
   public final aej a;
   protected final Ck a;
   public static final LongAdder a = new LongAdder();
   public Eo a;
   private final ReentrantLock a;
   private final ReentrantLock b;
   private Ed a;
   private final Set<aaD> a;
   private final ByteBuffer a;
   private final FloatBuffer a;
   private final Io[] a;
   public acU a;
   private int d;
   private boolean a;
   private final acZ a;
   private final acZ[] a;
   private boolean b;
   public static final abu[] a;
   private final boolean c;
   private boolean d;
   public int a;
   public int b;
   public int c;
   private afh a;
   private final Et[] a;
   private final Et[] b;
   private boolean e;
   private final Cn a;
   public ajP a;
   private final adm a;
   private boolean f;

   public Et(ByteBuffer var1, aej var2, Ck var3) {
      this.a = Eo.a;
      this.a = new ReentrantLock();
      this.b = new ReentrantLock();
      this.a = new ReferenceOpenHashSet();
      this.a = new adm(0.0D, 0.0D, 0.0D);
      this.a = var1;
      this.a = this.a.asFloatBuffer();
      this.d = -1;
      this.a = true;
      this.a = new acZ(-1, -1, -1);
      acZ[] var4 = new acZ[6];
      this.c = afT.c();
      this.d = false;
      this.a = new Et[abP.VALUES.length];
      this.b = new Et[abP.VALUES.length];
      this.e = false;
      this.a = new Cn(this, (abP)null, 0);

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = new acZ();
      }

      this.a = var4;
      this.a = var2;
      this.a = var3;
      if (Ci.b()) {
         this.a = new Io[a.length];
      } else {
         this.a = null;
      }

   }

   public Et(aej var1, Ck var2) {
      this(Bx.a(64), var1, var2);
      this.f = true;
   }

   public boolean a(int var1) {
      int var2 = this.d;
      this.d = var1;
      return var2 != var1;
   }

   public Io a(int var1) {
      Io[] var2 = this.a;
      Io var3 = var2[var1];
      if (var3 == null) {
         var2[var1] = var3 = new Io(In.a);
      }

      return var3;
   }

   public void a(int var1, int var2, int var3) {
      this.a.a(var1, var2, var3);
      byte var4 = 8;
      this.a = var1 >> var4 << var4;
      this.b = var2 & -256;
      this.c = var3 >> var4 << var4;
      acU var5 = this.a;
      if (var5 == null) {
         this.a = new acU((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));
      } else {
         var5.b((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));
      }

      acZ[] var6 = this.a;
      abP[] var7 = abP.VALUES;
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         abP var10 = var7[var9];
         var6[var10.ordinal()].a((adn)this.a).a(var10, 16);
      }

      this.a = null;
      this.a = null;
   }

   public void b(int var1, int var2, int var3) {
      acZ var4 = this.a;
      if (var1 != var4.a || var2 != var4.b || var3 != var4.c) {
         this.d();
         this.a(var1, var2, var3);
         this.e = false;
         this.f();
      }

   }

   public void a(float var1, float var2, float var3, Ed var4) {
      Eo var5 = var4.a();
      if (var5.a() != null && !var5.a(abu.TRANSLUCENT)) {
         Bh var6 = var4.a().a(abu.TRANSLUCENT);
         this.a((Bh)var6, (acV)this.a);
         var6.a(var5.a());
         this.a(abu.TRANSLUCENT, var1, var2, var3, var6, var5);
      }

   }

   public void b(float var1, float var2, float var3, Ed var4) {
      Eo var5 = new Eo();
      if (!this.a(var4, var5)) {
         acZ var6 = this.a;
         Set var7 = null;
         Eu var8 = Eu.a;
         if (!this.a((acV)var6)) {
            Ew var9 = new Ew(this.a.f());
            acV var10 = var6.a(15, 15, 15);
            a.increment();
            ajG var11 = this.a((acV)var6);
            var11.a();
            boolean[] var12 = new boolean[a.length];
            Bd var13 = this.a.a.a();
            Iterator var14 = afP.b(var6, var10).iterator();

            while(var14.hasNext()) {
               afP var15 = (afP)var14.next();
               sD var16 = var11.a(var15);
               nh var17 = var16.a();
               if (var16.isOpaqueCube()) {
                  var9.a(var15);
               }

               var7 = this.a(var5, var7, var11, var15, var17);
               this.a(var4, var5, var6, var11, var12, var13, var15, var16, var17, var17.a());
            }

            abu[] var21 = a;
            int var22 = var21.length;

            for(int var23 = 0; var23 < var22; ++var23) {
               abu var24 = var21[var23];
               this.a(var1, var2, var3, var4, var5, var12, var24);
            }

            var11.b();
            var8 = var9.a();
         }

         if (var7 == null) {
            var7 = Collections.emptySet();
         }

         var5.a(var8);
         this.a.lock();

         try {
            this.a(var7);
         } finally {
            this.a.unlock();
         }
      }

   }

   private Set<aaD> a(Eo var1, Set<aaD> var2, ajG var3, afP var4, nh var5) {
      if (var5.hasTileEntity()) {
         aaD var6 = var3.a(var4, (afj)afj.CHECK);
         if (var6 != null) {
            Ik var7 = this.a.a.a.a(var6);
            if (var7 != null) {
               if (var7.a(var6)) {
                  if (var2 == null) {
                     var2 = new ReferenceOpenHashSet();
                  }

                  ((Set)var2).add(var6);
               } else {
                  var1.a(var6);
               }
            }
         }
      }

      return (Set)var2;
   }

   private void a(Ed var1, Eo var2, acV var3, ajG var4, boolean[] var5, Bd var6, afP var7, sD var8, nh var9, abu var10) {
      if (var9.a().a() != abO.INVISIBLE) {
         var10 = this.a(var8, var10);
         int var11 = var10.ordinal();
         adm var12 = this.a;
         Bh var13 = var1.a().a(var11);
         var13.a(var10);
         ajV var14 = var13.a(var8, var7);
         var14.a(var1.a());
         if (!var2.b(var10)) {
            var2.b(var10);
            this.a(var13, var3);
         }

         var5[var11] |= var6.a(var12, var8, var7, (aec)var4, (Bh)var13);
         if (var14.c()) {
            this.a(var1.a(), var2, var5);
            var14.a(false);
         }
      }

   }

   private void a(float var1, float var2, float var3, Ed var4, Eo var5, boolean[] var6, abu var7) {
      if (var6[var7.ordinal()]) {
         var5.a(var7);
      }

      if (var5.b(var7)) {
         if (afT.ad()) {
            akv.g(var4.a().a(var7));
         }

         Bh var8 = var4.a().a(var7);
         this.a(var7, var1, var2, var3, var8, var5);
         if (var8.a != null) {
            var5.a(var7, (BitSet)var8.a.clone());
         }
      } else {
         var5.a((abu)var7, (BitSet)null);
      }

   }

   private void a(Set<aaD> var1) {
      Set var2 = this.a;
      Object var3 = var1.isEmpty() ? var1 : new ReferenceOpenHashSet(var1);
      Object var4 = Collections.emptySet();
      if (!var2.isEmpty()) {
         var4 = new ReferenceOpenHashSet(var2);
         ((Set)var3).removeAll(var2);
         ((Set)var4).removeAll(var1);
      }

      var2.clear();
      if (!var1.isEmpty()) {
         var2.addAll(var1);
      }

      this.a.a((Collection)var4, (Collection)var3);
   }

   private boolean a(Ed var1, Eo var2) {
      var1.a().lock();

      try {
         if (var1.a() == Ee.COMPILING) {
            var1.a(var2);
            boolean var3 = false;
            return var3;
         }
      } finally {
         var1.a().unlock();
      }

      return true;
   }

   protected void b() {
      ReentrantLock var1 = this.a;
      var1.lock();

      try {
         Ed var2 = this.a;
         if (var2 != null && var2.a() != Ee.DONE) {
            var2.a();
            this.a = null;
         }
      } finally {
         var1.unlock();
      }

   }

   public ReentrantLock a() {
      return this.a;
   }

   public Ed a() {
      ReentrantLock var1 = this.a;
      var1.lock();

      Ed var2;
      try {
         this.b();
         var2 = this.a = new Ed(this, Ef.REBUILD_CHUNK, this.a());
      } finally {
         var1.unlock();
      }

      return var2;
   }

   public Ed b() {
      ReentrantLock var1 = this.a;
      var1.lock();

      try {
         Ed var2 = this.a;
         if (var2 == null || var2.a() != Ee.PENDING) {
            if (var2 != null && var2.a() != Ee.DONE) {
               var2.a();
               this.a = null;
            }

            var2 = new Ed(this, Ef.RESORT_TRANSPARENCY, this.a());
            var2.a(this.a);
            Ed var3 = this.a = var2;
            return var3;
         }
      } finally {
         var1.unlock();
      }

      return null;
   }

   protected double a() {
      NN var1 = this.a.a.a();
      acU var2 = this.a;
      double var3 = var2.a + 8.0D - var1.d;
      double var5 = var2.b + 8.0D - var1.e;
      double var7 = var2.c + 8.0D - var1.f;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   public void a(Bh var1, int var2, int var3, int var4) {
      var1.a(7, In.a);
      if (afT.an()) {
         int var5 = var3 >> 8 << 8;
         int var6 = this.a;
         int var7 = this.c;
         var1.setTranslation((double)(-var6), (double)(-var5), (double)(-var7));
      } else {
         var1.setTranslation((double)(-var2), (double)(-var3), (double)(-var4));
      }

   }

   public void a(Bh var1, acV var2) {
      this.a(var1, var2.a, var2.b, var2.c);
   }

   public void a(abu var1, float var2, float var3, float var4, Bh var5, Eo var6) {
      if (var1 == abu.TRANSLUCENT && !var6.a(var1)) {
         var5.sortVertexData(var2, var3, var4);
         var6.a(var5.a());
      }

      var5.finishDrawing();
   }

   private void f() {
      By.C();
      By.B();
      By.c(-8.0F, -8.0F, -8.0F);
      By.b(1.000001F, 1.000001F, 1.000001F);
      By.c(8.0F, 8.0F, 8.0F);
      By.c(2982, this.a);
      By.D();
   }

   public void c() {
      By.a(this.a);
   }

   public Eo a() {
      return this.a;
   }

   public void a(Eo var1) {
      ReentrantLock var2 = this.b;
      var2.lock();

      try {
         this.a = var1;
      } finally {
         var2.unlock();
      }

   }

   public void d() {
      this.b();
      this.a = Eo.a;
   }

   public void a() {
      this.d();
      Io[] var1 = this.a;
      if (var1 != null) {
         for(int var2 = 0; var2 < a.length; ++var2) {
            Io var3 = var1[var2];
            if (var3 != null) {
               var3.c();
            }
         }
      }

      if (this.f) {
         Bx.a(this.a);
      }

   }

   public acV a() {
      return this.a;
   }

   public void a(boolean var1) {
      if (this.a) {
         var1 |= this.b;
      }

      this.a = true;
      this.b = var1;
      if (this.e()) {
         this.d = true;
      }

   }

   public void e() {
      this.a = false;
      this.b = false;
      this.d = false;
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.a && this.b;
   }

   public acV a(abP var1) {
      return this.a[var1.ordinal()];
   }

   public aej a() {
      return this.a;
   }

   private boolean e() {
      if (this.a instanceof yw) {
         yw var1 = (yw)this.a;
         return var1.a();
      } else {
         return false;
      }
   }

   public boolean c() {
      return this.d;
   }

   private abu a(sD var1, abu var2) {
      if (aga.a()) {
         abu var3 = aga.a(var1);
         if (var3 != null) {
            return var3;
         }
      }

      if (this.c) {
         if (var2 == abu.CUTOUT) {
            nh var4 = var1.a();
            if (var4 instanceof qE) {
               return var2;
            }

            if (var4 instanceof nw) {
               return var2;
            }

            return abu.CUTOUT_MIPPED;
         }
      } else if (var2 == abu.CUTOUT_MIPPED) {
         return abu.CUTOUT;
      }

      return var2;
   }

   private void a(Cj var1, Eo var2, boolean[] var3) {
      this.a(abu.CUTOUT, var1, var2, var3);
      this.a(abu.CUTOUT_MIPPED, var1, var2, var3);
      this.a(abu.TRANSLUCENT, var1, var2, var3);
   }

   private void a(abu var1, Cj var2, Eo var3, boolean[] var4) {
      Bh var5 = var2.a(var1);
      if (var5.b()) {
         var3.b(var1);
         var4[var1.ordinal()] = true;
      }

   }

   private ajG a(acV var1) {
      acV var2 = var1.a(-1, -1, -1);
      acV var3 = var1.a(16, 16, 16);
      adT var4 = this.a(this.a, var2, var3, 1);
      return new ajG(var4, var2, var3, 1);
   }

   public afh a() {
      return this.a((acV)this.a);
   }

   private afh a(acV var1) {
      afh var2 = this.a;
      return var2 != null && var2.b() ? var2 : (this.a = this.a.a(var1));
   }

   public boolean d() {
      return this.a((acV)this.a);
   }

   private boolean a(acV var1) {
      int var2 = var1.b;
      int var3 = var2 + 15;
      return this.a(var1).b(var2, var3);
   }

   public void a(abP var1, Et var2) {
      int var3 = var1.ordinal();
      this.a[var3] = var2;
      this.b[var3] = var2;
   }

   public Et a(abP var1) {
      if (!this.e) {
         this.g();
      }

      return this.b[var1.ordinal()];
   }

   public Cn a() {
      return this.a;
   }

   private void g() {
      acV var1 = this.a();
      int var2 = var1.a;
      int var3 = var1.c;
      int var4 = abP.NORTH.ordinal();
      int var5 = abP.SOUTH.ordinal();
      int var6 = abP.WEST.ordinal();
      int var7 = abP.EAST.ordinal();
      Et[] var8 = this.a;
      Et[] var9 = this.b;
      Et var10;
      var9[var4] = (var10 = var8[var4]).a().c == var3 - 16 ? var10 : null;
      var9[var5] = (var10 = var8[var5]).a().c == var3 + 16 ? var10 : null;
      var9[var6] = (var10 = var8[var6]).a().a == var2 - 16 ? var10 : null;
      var9[var7] = (var10 = var8[var7]).a().a == var2 + 16 ? var10 : null;
      this.e = true;
   }

   public boolean a(Fb var1, int var2) {
      return this.a().a(var1, var2) || var1.a(this.a);
   }

   public ajP a() {
      ajP var1 = this.a;
      if (var1 == null) {
         acV var2 = this.a();
         int var3 = var2.a;
         int var4 = var2.b;
         int var5 = var2.c;
         byte var6 = 5;
         int var7 = var3 >> var6 << var6;
         int var8 = var4 >> var6 << var6;
         int var9 = var5 >> var6 << var6;
         if (var7 != var3 || var8 != var4 || var9 != var5) {
            ajP var10 = this.a.a(var7, var8, var9).a();
            if (var10 != null && var10.a == (double)var7 && var10.b == (double)var8 && var10.c == (double)var9) {
               var1 = var10;
            }
         }

         if (var1 == null) {
            int var11 = 1 << var6;
            var1 = new ajP((double)var7, (double)var8, (double)var9, (double)(var7 + var11), (double)(var8 + var11), (double)(var9 + var11));
         }

         this.a = var1;
      }

      return var1;
   }

   public String toString() {
      return "pos: " + this.a() + ", frameIndex: " + this.d;
   }

   protected adT a(aej var1, acV var2, acV var3, int var4) {
      return new adT(var1, var2, var3, var4);
   }

   static {
      a = abu.VALUES;
   }
}
