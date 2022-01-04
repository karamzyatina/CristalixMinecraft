import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class afc {
   private final List<afb> a = new ArrayList();
   private double a;
   private double b;
   private double c = 6.0E7D;
   private double d;
   private long a;
   private long b;
   private int a;
   private final double e;
   private final double f;
   private int b;
   private int c;

   public afc() {
      this.d = this.c;
      this.a = 29999984;
      this.e = 0.2D;
      this.f = 5.0D;
      this.b = 15;
      this.c = 5;
   }

   public final boolean a(int var1, int var2) {
      return (double)(var1 + 1) > this.c() && (double)var1 < this.e() && (double)(var2 + 1) > this.d() && (double)var2 < this.f();
   }

   public final boolean a(acV var1) {
      return this.a(var1.a, var1.c);
   }

   public final boolean a(adg var1) {
      return (double)var1.c() > this.c() && (double)var1.a() < this.e() && (double)var1.d() > this.d() && (double)var1.b() < this.f();
   }

   public final boolean a(acU var1) {
      return var1.d > this.c() && var1.a < this.e() && var1.f > this.d() && var1.c < this.f();
   }

   public final double a(NN var1) {
      return this.a(var1.d, var1.f);
   }

   public final double a(double var1, double var3) {
      double var5 = var3 - this.d();
      double var7 = this.f() - var3;
      double var9 = var1 - this.c();
      double var11 = this.e() - var1;
      double var13 = Math.min(var9, var11);
      var13 = Math.min(var13, var5);
      return Math.min(var13, var7);
   }

   public final afa a() {
      double var1 = this.d;
      double var3 = this.c;
      if (var1 < var3) {
         return afa.SHRINKING;
      } else {
         return var1 > var3 ? afa.GROWING : afa.STATIONARY;
      }
   }

   public final double c() {
      double var1 = this.a() - this.g() / 2.0D;
      if (var1 < (double)(-this.a)) {
         var1 = (double)(-this.a);
      }

      return var1;
   }

   public final double d() {
      double var1 = this.b() - this.g() / 2.0D;
      if (var1 < (double)(-this.a)) {
         var1 = (double)(-this.a);
      }

      return var1;
   }

   public final double e() {
      double var1 = this.a() + this.g() / 2.0D;
      if (var1 > (double)this.a) {
         var1 = (double)this.a;
      }

      return var1;
   }

   public final double f() {
      double var1 = this.b() + this.g() / 2.0D;
      if (var1 > (double)this.a) {
         var1 = (double)this.a;
      }

      return var1;
   }

   public double a() {
      return this.a;
   }

   public double b() {
      return this.b;
   }

   public final void a(double var1, double var3) {
      this.a = var1;
      this.b = var3;
      Iterator var5 = this.a().iterator();

      while(var5.hasNext()) {
         afb var6 = (afb)var5.next();
         var6.a(this, var1, var3);
      }

   }

   public final double g() {
      return this.a() != afa.STATIONARY ? this.l() : this.c;
   }

   private double l() {
      double var1 = (double)((float)(System.currentTimeMillis() - this.b) / (float)(this.a - this.b));
      if (var1 < 1.0D) {
         return this.c + (this.d - this.c) * var1;
      } else {
         this.a(this.d);
         return this.c;
      }
   }

   public final double h() {
      return this.d;
   }

   public final void a(double var1) {
      this.c = var1;
      this.d = var1;
      this.a = System.currentTimeMillis();
      this.b = this.a;
      Iterator var3 = this.a().iterator();

      while(var3.hasNext()) {
         afb var4 = (afb)var3.next();
         var4.a(this, var1);
      }

   }

   public final void a(double var1, double var3, long var5) {
      this.c = var1;
      this.d = var3;
      this.b = System.currentTimeMillis();
      this.a = this.b + var5;
      Iterator var7 = this.a().iterator();

      while(var7.hasNext()) {
         afb var8 = (afb)var7.next();
         var8.a(this, var1, var3, var5);
      }

   }

   protected final List<afb> a() {
      return this.a;
   }

   public final void a(afb var1) {
      this.a.add(var1);
   }

   public final void a(int var1) {
      this.a = var1;
   }

   public final int a() {
      return this.a;
   }

   public final double i() {
      return this.f;
   }

   public final double j() {
      return this.e;
   }

   public final double k() {
      return this.a == this.b ? 0.0D : Math.abs(this.c - this.d) / (double)(this.a - this.b);
   }

   public final int b() {
      return this.b;
   }

   public final void b(int var1) {
      this.b = var1;
      Iterator var2 = this.a().iterator();

      while(var2.hasNext()) {
         afb var3 = (afb)var2.next();
         var3.a(this, var1);
      }

   }

   public final int c() {
      return this.c;
   }

   public final void c(int var1) {
      this.c = var1;
      Iterator var2 = this.a().iterator();

      while(var2.hasNext()) {
         afb var3 = (afb)var2.next();
         var3.b(this, var1);
      }

   }
}
