import java.util.ArrayList;
import java.util.List;

public class qm {
   private final aej a;
   private final acV a;
   private final qj b;
   private sD a;
   private final boolean a;
   private final List<acV> a;
   // $FF: synthetic field
   final qj a;

   public qm(qj var1, aej var2, acV var3, sD var4) {
      this.a = var1;
      this.a = new ArrayList();
      this.a = var2;
      this.a = var3;
      this.a = var4;
      this.b = (qj)var4.a();
      ql var5 = (ql)var4.a(this.b.a());
      this.a = this.b.h;
      this.a(var5);
   }

   public List<acV> a() {
      return this.a;
   }

   private void a(ql var1) {
      // $FF: Couldn't be decompiled
   }

   private void a() {
      for(int var1 = 0; var1 < this.a.size(); ++var1) {
         qm var2 = this.a((acV)this.a.get(var1));
         if (var2 != null && var2.a(this)) {
            this.a.set(var1, var2.a);
         } else {
            this.a.remove(var1--);
         }
      }

   }

   private boolean a(acV var1) {
      return qj.b(this.a, var1) || qj.b(this.a, var1.a()) || qj.b(this.a, var1.b());
   }

   private qm a(acV var1) {
      sD var2 = this.a.a(var1);
      if (qj.m(var2)) {
         qj var6 = this.a;
         this.a.getClass();
         var6.getClass();
         return new qm(var6, this.a, var1, var2);
      } else {
         acV var3 = var1.a();
         var2 = this.a.a(var3);
         if (qj.m(var2)) {
            qj var7 = this.a;
            this.a.getClass();
            var7.getClass();
            return new qm(var7, this.a, var3, var2);
         } else {
            var3 = var1.b();
            var2 = this.a.a(var3);
            qm var4;
            if (qj.m(var2)) {
               qj var5 = this.a;
               this.a.getClass();
               var5.getClass();
               var4 = new qm(var5, this.a, var3, var2);
            } else {
               var4 = null;
            }

            return var4;
         }
      }
   }

   private boolean a(qm var1) {
      return this.b(var1.a);
   }

   private boolean b(acV var1) {
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         acV var3 = (acV)this.a.get(var2);
         if (var3.a == var1.a && var3.c == var1.c) {
            return true;
         }
      }

      return false;
   }

   protected int a() {
      int var1 = 0;
      abP[] var2 = abT.HORIZONTAL.a();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         abP var5 = var2[var4];
         if (this.a(this.a.a(var5))) {
            ++var1;
         }
      }

      return var1;
   }

   private boolean b(qm var1) {
      return this.a(var1) || this.a.size() != 2;
   }

   private void a(qm var1) {
      this.a.add(var1.a);
      acV var2 = this.a.c();
      acV var3 = this.a.d();
      acV var4 = this.a.e();
      acV var5 = this.a.f();
      boolean var6 = this.b(var2);
      boolean var7 = this.b(var3);
      boolean var8 = this.b(var4);
      boolean var9 = this.b(var5);
      ql var10 = null;
      if (var6 || var7) {
         var10 = ql.NORTH_SOUTH;
      }

      if (var8 || var9) {
         var10 = ql.EAST_WEST;
      }

      if (!this.a) {
         if (var7 && var9 && !var6 && !var8) {
            var10 = ql.SOUTH_EAST;
         }

         if (var7 && var8 && !var6 && !var9) {
            var10 = ql.SOUTH_WEST;
         }

         if (var6 && var8 && !var7 && !var9) {
            var10 = ql.NORTH_WEST;
         }

         if (var6 && var9 && !var7 && !var8) {
            var10 = ql.NORTH_EAST;
         }
      }

      if (var10 == ql.NORTH_SOUTH) {
         if (qj.b(this.a, var2.a())) {
            var10 = ql.ASCENDING_NORTH;
         }

         if (qj.b(this.a, var3.a())) {
            var10 = ql.ASCENDING_SOUTH;
         }
      }

      if (var10 == ql.EAST_WEST) {
         if (qj.b(this.a, var5.a())) {
            var10 = ql.ASCENDING_EAST;
         }

         if (qj.b(this.a, var4.a())) {
            var10 = ql.ASCENDING_WEST;
         }
      }

      if (var10 == null) {
         var10 = ql.NORTH_SOUTH;
      }

      this.a = this.a.a(this.b.a(), var10);
      this.a.a((acV)this.a, (sD)this.a, 3);
   }

   private boolean c(acV var1) {
      qm var2 = this.a(var1);
      if (var2 == null) {
         return false;
      } else {
         var2.a();
         return var2.b(this);
      }
   }

   public qm a(boolean var1, boolean var2) {
      acV var3 = this.a.c();
      acV var4 = this.a.d();
      acV var5 = this.a.e();
      acV var6 = this.a.f();
      boolean var7 = this.c(var3);
      boolean var8 = this.c(var4);
      boolean var9 = this.c(var5);
      boolean var10 = this.c(var6);
      ql var11 = null;
      if ((var7 || var8) && !var9 && !var10) {
         var11 = ql.NORTH_SOUTH;
      }

      if ((var9 || var10) && !var7 && !var8) {
         var11 = ql.EAST_WEST;
      }

      if (!this.a) {
         if (var8 && var10 && !var7 && !var9) {
            var11 = ql.SOUTH_EAST;
         }

         if (var8 && var9 && !var7 && !var10) {
            var11 = ql.SOUTH_WEST;
         }

         if (var7 && var9 && !var8 && !var10) {
            var11 = ql.NORTH_WEST;
         }

         if (var7 && var10 && !var8 && !var9) {
            var11 = ql.NORTH_EAST;
         }
      }

      if (var11 == null) {
         if (var7 || var8) {
            var11 = ql.NORTH_SOUTH;
         }

         if (var9 || var10) {
            var11 = ql.EAST_WEST;
         }

         if (!this.a) {
            if (var1) {
               if (var8 && var10) {
                  var11 = ql.SOUTH_EAST;
               }

               if (var9 && var8) {
                  var11 = ql.SOUTH_WEST;
               }

               if (var10 && var7) {
                  var11 = ql.NORTH_EAST;
               }

               if (var7 && var9) {
                  var11 = ql.NORTH_WEST;
               }
            } else {
               if (var7 && var9) {
                  var11 = ql.NORTH_WEST;
               }

               if (var10 && var7) {
                  var11 = ql.NORTH_EAST;
               }

               if (var9 && var8) {
                  var11 = ql.SOUTH_WEST;
               }

               if (var8 && var10) {
                  var11 = ql.SOUTH_EAST;
               }
            }
         }
      }

      if (var11 == ql.NORTH_SOUTH) {
         if (qj.b(this.a, var3.a())) {
            var11 = ql.ASCENDING_NORTH;
         }

         if (qj.b(this.a, var4.a())) {
            var11 = ql.ASCENDING_SOUTH;
         }
      }

      if (var11 == ql.EAST_WEST) {
         if (qj.b(this.a, var6.a())) {
            var11 = ql.ASCENDING_EAST;
         }

         if (qj.b(this.a, var5.a())) {
            var11 = ql.ASCENDING_WEST;
         }
      }

      if (var11 == null) {
         var11 = ql.NORTH_SOUTH;
      }

      this.a(var11);
      this.a = this.a.a(this.b.a(), var11);
      if (var2 || this.a.a(this.a) != this.a) {
         this.a.a((acV)this.a, (sD)this.a, 3);

         for(int var12 = 0; var12 < this.a.size(); ++var12) {
            qm var13 = this.a((acV)this.a.get(var12));
            if (var13 != null) {
               var13.a();
               if (var13.b(this)) {
                  var13.a(this);
               }
            }
         }
      }

      return this;
   }

   public sD a() {
      return this.a;
   }
}
