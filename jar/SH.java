import java.util.Random;

public final class Sh extends RY {
   public SE a;
   private final aej a;
   private final int c;
   private final int d;
   private final int e;
   private final Random a;
   public int b;
   public int[] a;
   public int[] b;
   public int[] c;

   public Sh(Rs var1, aej var2) {
      this(var1, var2, acV.a);
   }

   public Sh(Rs var1, aej var2, int var3, int var4, int var5) {
      this.a = new Si(this, "Enchant", true, 2);
      this.a = new Random();
      this.a = new int[3];
      this.b = new int[]{-1, -1, -1};
      this.c = new int[]{-1, -1, -1};
      this.a = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.b = var1.a.d();
      this.a((SP)(new Sj(this, this.a, 0, 15, 47)));
      this.a((SP)(new Sk(this, this.a, 1, 35, 47)));

      int var6;
      for(var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 9; ++var7) {
            this.a((SP)(new SP(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18)));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.a((SP)(new SP(var1, var6, 8 + var6 * 18, 142)));
      }

   }

   public Sh(Rs var1, aej var2, acV var3) {
      this(var1, var2, var3.a, var3.b, var3.c);
   }

   public void a(SD var1) {
      super.a(var1);
   }

   public void updateProgressBar(int var1, int var2) {
      if (var1 >= 0 && var1 <= 2) {
         this.a[var1] = var2;
      } else if (var1 == 3) {
         this.b = var2;
      } else if (var1 >= 4 && var1 <= 6) {
         this.b[var1 - 4] = var2;
      } else if (var1 >= 7 && var1 <= 9) {
         this.c[var1 - 7] = var2;
      } else {
         super.updateProgressBar(var1, var2);
      }

   }

   public void a(SE var1) {
      if (var1 == this.a) {
         Vh var2 = var1.a(0);
         if (var2.isEmpty() || !var2.isItemEnchantable()) {
            for(int var3 = 0; var3 < 3; ++var3) {
               this.a[var3] = 0;
               this.b[var3] = -1;
               this.c[var3] = -1;
            }
         }
      }

   }

   public boolean a(Rn var1, int var2) {
      Vh var3 = this.a.a(0);
      Vh var4 = this.a.a(1);
      int var5 = var2 + 1;
      if ((var4.isEmpty() || var4.getCount() < var5) && !var1.a.d) {
         return false;
      } else {
         return this.a[var2] > 0 && !var3.isEmpty() && (var1.k >= var5 && var1.k >= this.a[var2] || var1.a.d);
      }
   }

   public int a() {
      Vh var1 = this.a.a(1);
      return var1.isEmpty() ? 0 : var1.getCount();
   }

   public void a(Rn var1) {
      super.a(var1);
   }

   public boolean a(Rn var1) {
      if (this.a.a(this.c, this.d, this.e).a() != RQ.aO) {
         return false;
      } else {
         return var1.a((double)this.c + 0.5D, (double)this.d + 0.5D, (double)this.e + 0.5D) <= 64.0D;
      }
   }

   public Vh a(Rn var1, int var2) {
      Vh var3 = Vh.a;
      SP var4 = (SP)this.a.get(var2);
      if (var4 != null && var4.a()) {
         Vh var5 = var4.a();
         var3 = var5.a();
         if (var2 == 0) {
            if (!this.a(var5, 2, 38, true)) {
               return Vh.a;
            }
         } else if (var2 == 1) {
            if (!this.a(var5, 2, 38, true)) {
               return Vh.a;
            }
         } else if (var5.a() == RT.aI && SW.a(var5.getMetadata()) == SW.BLUE) {
            if (!this.a(var5, 1, 2, true)) {
               return Vh.a;
            }
         } else {
            if (((SP)this.a.get(0)).a() || !((SP)this.a.get(0)).a(var5)) {
               return Vh.a;
            }

            if (var5.c() && var5.getCount() == 1) {
               ((SP)this.a.get(0)).a(var5.a());
               var5.setCount(0);
            } else if (!var5.isEmpty()) {
               ((SP)this.a.get(0)).a(new Vh(var5.a(), 1, var5.getMetadata()));
               var5.shrink(1);
            }
         }

         if (var5.isEmpty()) {
            var4.a(Vh.a);
         } else {
            var4.a();
         }

         if (var5.getCount() == var3.getCount()) {
            return Vh.a;
         }

         var4.a(var1, var5);
      }

      return var3;
   }
}
