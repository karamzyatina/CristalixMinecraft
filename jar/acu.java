import dev.xdark.clientapi.math.AxisAlignedBB;

public class acU implements AxisAlignedBB {
   private boolean a;
   public double a;
   public double b;
   public double c;
   public double d;
   public double e;
   public double f;

   public acU(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = Math.min(var1, var7);
      this.b = Math.min(var3, var9);
      this.c = Math.min(var5, var11);
      this.d = Math.max(var1, var7);
      this.e = Math.max(var3, var9);
      this.f = Math.max(var5, var11);
   }

   public acU(int var1, int var2, int var3) {
      this((double)var1, (double)var2, (double)var3, (double)(var1 + 1), (double)(var2 + 1), (double)(var3 + 1));
   }

   public acU(acV var1) {
      this(var1.a, var1.b, var1.c);
   }

   public acU(acV var1, acV var2) {
      this((double)var1.a, (double)var1.b, (double)var1.c, (double)var2.a, (double)var2.b, (double)var2.c);
   }

   public acU(adm var1, adm var2) {
      this(var1.a, var1.b, var1.c, var2.a, var2.b, var2.c);
   }

   public final acU a(double var1) {
      return new acU(this.a, this.b, this.c, this.d, var1, this.f);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof acU)) {
         return false;
      } else {
         acU var2 = (acU)var1;
         if (Double.compare(var2.a, this.a) != 0) {
            return false;
         } else if (Double.compare(var2.b, this.b) != 0) {
            return false;
         } else if (Double.compare(var2.c, this.c) != 0) {
            return false;
         } else if (Double.compare(var2.d, this.d) != 0) {
            return false;
         } else if (Double.compare(var2.e, this.e) != 0) {
            return false;
         } else {
            return Double.compare(var2.f, this.f) == 0;
         }
      }
   }

   public final int hashCode() {
      long var1 = Double.doubleToLongBits(this.a);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.b);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.c);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.d);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.e);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.f);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      return var3;
   }

   public final acU a() {
      this.a = true;
      return this;
   }

   public final acU a(double var1, double var3, double var5) {
      double var7 = this.a;
      double var9 = this.b;
      double var11 = this.c;
      double var13 = this.d;
      double var15 = this.e;
      double var17 = this.f;
      if (var1 < 0.0D) {
         var7 -= var1;
      } else if (var1 > 0.0D) {
         var13 -= var1;
      }

      if (var3 < 0.0D) {
         var9 -= var3;
      } else if (var3 > 0.0D) {
         var15 -= var3;
      }

      if (var5 < 0.0D) {
         var11 -= var5;
      } else if (var5 > 0.0D) {
         var17 -= var5;
      }

      return new acU(var7, var9, var11, var13, var15, var17);
   }

   public final acU b(double var1, double var3, double var5) {
      double var7 = this.a;
      double var9 = this.b;
      double var11 = this.c;
      double var13 = this.d;
      double var15 = this.e;
      double var17 = this.f;
      if (var1 < 0.0D) {
         var7 += var1;
      } else if (var1 > 0.0D) {
         var13 += var1;
      }

      if (var3 < 0.0D) {
         var9 += var3;
      } else if (var3 > 0.0D) {
         var15 += var3;
      }

      if (var5 < 0.0D) {
         var11 += var5;
      } else if (var5 > 0.0D) {
         var17 += var5;
      }

      return new acU(var7, var9, var11, var13, var15, var17);
   }

   public final acU c(double var1, double var3, double var5) {
      return this.b(this.a - var1, this.b - var3, this.c - var5, this.d + var1, this.e + var3, this.f + var5);
   }

   public final acU d(double var1, double var3, double var5) {
      double var7 = this.a - var1;
      double var9 = this.b - var3;
      double var11 = this.c - var5;
      double var13 = this.d + var1;
      double var15 = this.e + var3;
      double var17 = this.f + var5;
      return new acU(var7, var9, var11, var13, var15, var17);
   }

   public final acU b(double var1) {
      return this.c(var1, var1, var1);
   }

   public final acU c(double var1) {
      return this.d(var1, var1, var1);
   }

   public final acU a(acU var1) {
      double var2 = Math.max(this.a, var1.a);
      double var4 = Math.max(this.b, var1.b);
      double var6 = Math.max(this.c, var1.c);
      double var8 = Math.min(this.d, var1.d);
      double var10 = Math.min(this.e, var1.e);
      double var12 = Math.min(this.f, var1.f);
      return new acU(var2, var4, var6, var8, var10, var12);
   }

   public final acU b(acU var1) {
      return this.b(Math.min(this.a, var1.a), Math.min(this.b, var1.b), Math.min(this.c, var1.c), Math.max(this.d, var1.d), Math.max(this.e, var1.e), Math.max(this.f, var1.f));
   }

   public final acU c(acU var1) {
      double var2 = Math.min(this.a, var1.a);
      double var4 = Math.min(this.b, var1.b);
      double var6 = Math.min(this.c, var1.c);
      double var8 = Math.max(this.d, var1.d);
      double var10 = Math.max(this.e, var1.e);
      double var12 = Math.max(this.f, var1.f);
      return new acU(var2, var4, var6, var8, var10, var12);
   }

   public final acU d(acU var1) {
      if (this.a) {
         return var1.b();
      } else {
         this.a = var1.a;
         this.b = var1.b;
         this.c = var1.c;
         this.d = var1.d;
         this.e = var1.e;
         this.f = var1.f;
         return this;
      }
   }

   public final acU a(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var7;
      this.e = var9;
      this.f = var11;
      return this;
   }

   private acU c(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.a = Math.min(var1, var7);
      this.b = Math.min(var3, var9);
      this.c = Math.min(var5, var11);
      this.d = Math.max(var1, var7);
      this.e = Math.max(var3, var9);
      this.f = Math.max(var5, var11);
      return this;
   }

   public final acU b(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.a ? new acU(var1, var3, var5, var7, var9, var11) : this.c(var1, var3, var5, var7, var9, var11);
   }

   public final acU e(double var1, double var3, double var5) {
      this.a += var1;
      this.b += var3;
      this.c += var5;
      this.d += var1;
      this.e += var3;
      this.f += var5;
      return this;
   }

   public final acU f(double var1, double var3, double var5) {
      return this.a ? this.h(var1, var3, var5) : this.e(var1, var3, var5);
   }

   public final acU g(double var1, double var3, double var5) {
      if (this.a) {
         return this.b(var1, var3, var5);
      } else {
         double var7 = this.a;
         double var9 = this.b;
         double var11 = this.c;
         double var13 = this.d;
         double var15 = this.e;
         double var17 = this.f;
         if (var1 < 0.0D) {
            var7 += var1;
         } else if (var1 > 0.0D) {
            var13 += var1;
         }

         if (var3 < 0.0D) {
            var9 += var3;
         } else if (var3 > 0.0D) {
            var15 += var3;
         }

         if (var5 < 0.0D) {
            var11 += var5;
         } else if (var5 > 0.0D) {
            var17 += var5;
         }

         return this.b(var7, var9, var11, var13, var15, var17);
      }
   }

   public final acU h(double var1, double var3, double var5) {
      return new acU(this.a + var1, this.b + var3, this.c + var5, this.d + var1, this.e + var3, this.f + var5);
   }

   public final acU a(int var1, int var2, int var3) {
      double var4 = (double)var1;
      double var6 = (double)var2;
      double var8 = (double)var3;
      return new acU(this.a + var4, this.b + var6, this.c + var8, this.d + var4, this.e + var6, this.f + var8);
   }

   public final acU a(acV var1) {
      double var2 = (double)var1.a;
      double var4 = (double)var1.b;
      double var6 = (double)var1.c;
      return new acU(this.a + var2, this.b + var4, this.c + var6, this.d + var2, this.e + var4, this.f + var6);
   }

   public final acU a(adm var1) {
      return this.h(var1.a, var1.b, var1.c);
   }

   public final double a(acU var1, double var2) {
      if (var1.e > this.b && var1.b < this.e && var1.f > this.c && var1.c < this.f) {
         double var4;
         if (var2 > 0.0D && var1.d <= this.a) {
            var4 = this.a - var1.d;
            if (var4 < var2) {
               var2 = var4;
            }
         } else if (var2 < 0.0D && var1.a >= this.d) {
            var4 = this.d - var1.a;
            if (var4 > var2) {
               var2 = var4;
            }
         }
      }

      return var2;
   }

   public final double b(acU var1, double var2) {
      if (var1.d > this.a && var1.a < this.d && var1.f > this.c && var1.c < this.f) {
         double var4;
         if (var2 > 0.0D && var1.e <= this.b) {
            var4 = this.b - var1.e;
            if (var4 < var2) {
               var2 = var4;
            }
         } else if (var2 < 0.0D && var1.b >= this.e) {
            var4 = this.e - var1.b;
            if (var4 > var2) {
               var2 = var4;
            }
         }
      }

      return var2;
   }

   public final double c(acU var1, double var2) {
      if (var1.d > this.a && var1.a < this.d && var1.e > this.b && var1.b < this.e) {
         double var4;
         if (var2 > 0.0D && var1.f <= this.c) {
            var4 = this.c - var1.f;
            if (var4 < var2) {
               var2 = var4;
            }
         } else if (var2 < 0.0D && var1.c >= this.f) {
            var4 = this.f - var1.c;
            if (var4 > var2) {
               var2 = var4;
            }
         }
      }

      return var2;
   }

   public final boolean a(acU var1) {
      return this.intersects(var1.a, var1.b, var1.c, var1.d, var1.e, var1.f);
   }

   public final boolean intersects(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.a < var7 && this.d > var1 && this.b < var9 && this.e > var3 && this.c < var11 && this.f > var5;
   }

   public final boolean a(adm var1, adm var2) {
      return this.intersects(Math.min(var1.a, var2.a), Math.min(var1.b, var2.b), Math.min(var1.c, var2.c), Math.max(var1.a, var2.a), Math.max(var1.b, var2.b), Math.max(var1.c, var2.c));
   }

   public final boolean contains(double var1, double var3, double var5) {
      if (var1 > this.a && var1 < this.d) {
         if (var3 > this.b && var3 < this.e) {
            return var5 > this.c && var5 < this.f;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean a(adm var1) {
      return this.contains(var1.a, var1.b, var1.c);
   }

   public final double getAverageEdgeLength() {
      double var1 = this.d - this.a;
      double var3 = this.e - this.b;
      double var5 = this.f - this.c;
      return (var1 + var3 + var5) / iM.a(iM.a(-7749751285846907063L) ^ iM.a(iM.a(3135813467605833910L) ^ -1L));
   }

   public final acU d(double var1) {
      return this.b(-var1);
   }

   public final acU e(double var1) {
      return this.c(-var1);
   }

   public final adi a(adm var1, adm var2) {
      return this.a((adi)null, var1, var2);
   }

   public final adi a(adi var1, adm var2, adm var3) {
      adm var4 = this.a(this.a, var2, var3);
      abP var5 = abP.WEST;
      adm var6 = this.a(this.d, var2, var3);
      if (var6 != null && this.a(var2, var4, var6)) {
         var4 = var6;
         var5 = abP.EAST;
      }

      var6 = this.b(this.b, var2, var3);
      if (var6 != null && this.a(var2, var4, var6)) {
         var4 = var6;
         var5 = abP.DOWN;
      }

      var6 = this.b(this.e, var2, var3);
      if (var6 != null && this.a(var2, var4, var6)) {
         var4 = var6;
         var5 = abP.UP;
      }

      var6 = this.c(this.c, var2, var3);
      if (var6 != null && this.a(var2, var4, var6)) {
         var4 = var6;
         var5 = abP.NORTH;
      }

      var6 = this.c(this.f, var2, var3);
      if (var6 != null && this.a(var2, var4, var6)) {
         var4 = var6;
         var5 = abP.SOUTH;
      }

      return var4 == null ? null : adi.a(var1, var4, var5);
   }

   final boolean a(adm var1, adm var2, adm var3) {
      return var2 == null || var1.c(var3) < var1.c(var2);
   }

   final adm a(double var1, adm var3, adm var4) {
      adm var5 = var3.a(var4, var1);
      return var5 != null && this.b(var5) ? var5 : null;
   }

   final adm b(double var1, adm var3, adm var4) {
      adm var5 = var3.b(var4, var1);
      return var5 != null && this.c(var5) ? var5 : null;
   }

   final adm c(double var1, adm var3, adm var4) {
      adm var5 = var3.c(var4, var1);
      return var5 != null && this.d(var5) ? var5 : null;
   }

   public final boolean b(adm var1) {
      return var1.b >= this.b && var1.b <= this.e && var1.c >= this.c && var1.c <= this.f;
   }

   public final boolean c(adm var1) {
      return var1.a >= this.a && var1.a <= this.d && var1.c >= this.c && var1.c <= this.f;
   }

   public final boolean d(adm var1) {
      return var1.a >= this.a && var1.a <= this.d && var1.b >= this.b && var1.b <= this.e;
   }

   public final String toString() {
      return "box[" + this.a + ", " + this.b + ", " + this.c + " -> " + this.d + ", " + this.e + ", " + this.f + ']';
   }

   public final boolean hasNaN() {
      return Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f);
   }

   public final adm a() {
      return new adm(this.a + (this.d - this.a) * 0.5D, this.b + (this.e - this.b) * 0.5D, this.c + (this.f - this.c) * 0.5D);
   }

   public final acU b() {
      return new acU(this.a, this.b, this.c, this.d, this.e, this.f);
   }

   public final boolean a() {
      return this.a;
   }

   public AxisAlignedBB contract(double var1, double var3, double var5) {
      return (AxisAlignedBB)d.a(this.a(var1, var3, var5));
   }

   public AxisAlignedBB expand(double var1, double var3, double var5) {
      return (AxisAlignedBB)d.a(this.b(var1, var3, var5));
   }

   public AxisAlignedBB grow(double var1, double var3, double var5) {
      return (AxisAlignedBB)d.a(this.d(var1, var3, var5));
   }

   public AxisAlignedBB intersect(AxisAlignedBB var1) {
      return (AxisAlignedBB)d.a(this.a((acU)d.a(var1)));
   }

   public AxisAlignedBB union(AxisAlignedBB var1) {
      return (AxisAlignedBB)d.a(this.c((acU)d.a(var1)));
   }

   public AxisAlignedBB offset(double var1, double var3, double var5) {
      return (AxisAlignedBB)d.a(this.h(var1, var3, var5));
   }

   public double calculateXOffset(AxisAlignedBB var1, double var2) {
      return this.a((acU)d.a(var1), var2);
   }

   public double calculateYOffset(AxisAlignedBB var1, double var2) {
      return this.b((acU)d.a(var1), var2);
   }

   public double calculateZOffset(AxisAlignedBB var1, double var2) {
      return this.c((acU)d.a(var1), var2);
   }

   public boolean intersects(AxisAlignedBB var1) {
      return this.a((acU)d.a(var1));
   }

   public AxisAlignedBB shrink(double var1) {
      return (AxisAlignedBB)d.a(this.e(var1));
   }

   public AxisAlignedBB copy() {
      return (AxisAlignedBB)d.a(this.b());
   }

   // $FF: synthetic method
   public double getMinX() {
      return this.a;
   }

   // $FF: synthetic method
   public double getMinY() {
      return this.b;
   }

   // $FF: synthetic method
   public double getMinZ() {
      return this.c;
   }

   // $FF: synthetic method
   public double getMaxX() {
      return this.d;
   }

   // $FF: synthetic method
   public double getMaxY() {
      return this.e;
   }

   // $FF: synthetic method
   public double getMaxZ() {
      return this.f;
   }
}
