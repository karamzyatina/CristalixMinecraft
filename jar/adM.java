import dev.xdark.clientapi.math.Vec3d;

public final class adm implements Vec3d {
   public static final adm a = new adm(0.0D, 0.0D, 0.0D);
   public double a;
   public double b;
   public double c;
   public adm b;

   public adm(double var1, double var3, double var5) {
      if (var1 == -0.0D) {
         var1 = 0.0D;
      }

      if (var3 == -0.0D) {
         var3 = 0.0D;
      }

      if (var5 == -0.0D) {
         var5 = 0.0D;
      }

      this.a = var1;
      this.b = var3;
      this.c = var5;
   }

   public adm(adn var1) {
      this((double)var1.a, (double)var1.b, (double)var1.c);
   }

   public adm a(double var1, double var3, double var5) {
      return new adm(var1 - this.a, var3 - this.b, var5 - this.c);
   }

   public adm a(adm var1) {
      return new adm(var1.a - this.a, var1.b - this.b, var1.c - this.c);
   }

   public adm a() {
      double var1 = (double)adh.a(this.a * this.a + this.b * this.b + this.c * this.c);
      return var1 < 1.0E-4D ? a : new adm(this.a / var1, this.b / var1, this.c / var1);
   }

   public adm b() {
      double var1 = (double)adh.a(this.a * this.a + this.b * this.b + this.c * this.c);
      return var1 < 1.0E-4D ? a : this.g(this.a / var1, this.b / var1, this.c / var1);
   }

   public double dotProduct(double var1, double var3, double var5) {
      return this.a * var1 + this.b * var3 + this.c * var5;
   }

   public double a(adm var1) {
      return this.a * var1.a + this.b * var1.b + this.c * var1.c;
   }

   public adm b(adm var1) {
      return this.b(var1.a, var1.b, var1.c);
   }

   public adm b(double var1, double var3, double var5) {
      return new adm(this.b * var5 - this.c * var3, this.c * var1 - this.a * var5, this.a * var3 - this.b * var1);
   }

   public adm c(adm var1) {
      return this.c(var1.a, var1.b, var1.c);
   }

   public adm d(adm var1) {
      return this.d(var1.a, var1.b, var1.c);
   }

   public adm c(double var1, double var3, double var5) {
      return this.e(-var1, -var3, -var5);
   }

   public adm d(double var1, double var3, double var5) {
      return this.f(-var1, -var3, -var5);
   }

   public adm e(adm var1) {
      return this.e(var1.a, var1.b, var1.c);
   }

   public adm f(adm var1) {
      return this.f(var1.a, var1.b, var1.c);
   }

   public adm e(double var1, double var3, double var5) {
      return new adm(this.a + var1, this.b + var3, this.c + var5);
   }

   public adm f(double var1, double var3, double var5) {
      return this.g(this.a + var1, this.b + var3, this.c + var5);
   }

   public double distanceTo(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return (double)adh.a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double b(adm var1) {
      return this.distanceTo(var1.a, var1.b, var1.c);
   }

   public double c(adm var1) {
      return this.squareDistanceTo(var1.a, var1.b, var1.c);
   }

   public double squareDistanceTo(double var1, double var3, double var5) {
      double var7 = var1 - this.a;
      double var9 = var3 - this.b;
      double var11 = var5 - this.c;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public adm a(double var1) {
      return new adm(this.a * var1, this.b * var1, this.c * var1);
   }

   public adm b(double var1) {
      return this.g(this.a * var1, this.b * var1, this.c * var1);
   }

   public double length() {
      return (double)adh.a(this.a * this.a + this.b * this.b + this.c * this.c);
   }

   public double lengthSquared() {
      return this.a * this.a + this.b * this.b + this.c * this.c;
   }

   public adm a(adm var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.a) / var4;
         return var10 >= 0.0D && var10 <= 1.0D ? new adm(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
      }
   }

   public adm b(adm var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var6 * var6 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.b) / var6;
         return var10 >= 0.0D && var10 <= 1.0D ? new adm(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
      }
   }

   public adm c(adm var1, double var2) {
      double var4 = var1.a - this.a;
      double var6 = var1.b - this.b;
      double var8 = var1.c - this.c;
      if (var8 * var8 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.c) / var8;
         return var10 >= 0.0D && var10 <= 1.0D ? new adm(this.a + var4 * var10, this.b + var6 * var10, this.c + var8 * var10) : null;
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         adm var2;
         return var1 instanceof adm && Double.compare(this.a, (var2 = (adm)var1).a) == 0 && Double.compare(this.b, var2.b) == 0 && Double.compare(this.c, var2.c) == 0;
      }
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.a);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.b);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.c);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      return var3;
   }

   public String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + ')';
   }

   public adm a(float var1) {
      float var2 = adh.b(var1);
      float var3 = adh.a(var1);
      return new adm(this.a, this.b * (double)var2 + this.c * (double)var3, this.c * (double)var2 - this.b * (double)var3);
   }

   public adm b(float var1) {
      float var2 = adh.b(var1);
      float var3 = adh.a(var1);
      return new adm(this.a * (double)var2 + this.c * (double)var3, this.b, this.c * (double)var2 - this.a * (double)var3);
   }

   public adm g(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      return this;
   }

   public adm g(adm var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      return this;
   }

   public adm c() {
      return new adm(this.a, this.b, this.c);
   }

   public adm d() {
      adm var1 = this.b;
      return var1 == null ? this : var1.g(this.a, this.b, this.c);
   }

   public final boolean a() {
      return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c);
   }

   public static adm a(adl var0) {
      return a(var0.a, var0.b);
   }

   public static adm a(float var0, float var1) {
      float var2 = adh.b(-var1 * 0.017453292F - 3.1415927F);
      float var3 = adh.a(-var1 * 0.017453292F - 3.1415927F);
      float var4 = -adh.b(-var0 * 0.017453292F);
      float var5 = adh.a(-var0 * 0.017453292F);
      return new adm((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   public static adm e() {
      return new adm(0.0D, 0.0D, 0.0D);
   }

   // $FF: synthetic method
   public Object clone() {
      return this.c();
   }

   public Vec3d normalize() {
      return (Vec3d)d.a(this.a());
   }

   public Vec3d scale(double var1) {
      return (Vec3d)d.a(this.a(var1));
   }

   public Vec3d getIntermediateWithXValue(Vec3d var1, double var2) {
      return (Vec3d)d.a(this.a((adm)d.a(var1), var2));
   }

   public Vec3d getIntermediateWithYValue(Vec3d var1, double var2) {
      return (Vec3d)d.a(this.b((adm)d.a(var1), var2));
   }

   public Vec3d getIntermediateWithZValue(Vec3d var1, double var2) {
      return (Vec3d)d.a(this.c((adm)d.a(var1), var2));
   }

   public Vec3d rotateYaw(float var1) {
      return (Vec3d)d.a(this.b(var1));
   }

   public Vec3d rotatePitch(float var1) {
      return (Vec3d)d.a(this.a(var1));
   }

   // $FF: synthetic method
   public double getX() {
      return this.a;
   }

   // $FF: synthetic method
   public double getY() {
      return this.b;
   }

   // $FF: synthetic method
   public double getZ() {
      return this.c;
   }
}
