public final class Ns extends MT {
   public final Nt a;

   public Ns(MU var1, Nt var2, SB... var3) {
      super(var1, NA.ARMOR, var3);
      this.a = var2;
      if (var2 == Nt.FALL) {
         this.a = NA.ARMOR_FEET;
      }

   }

   public int a(int var1) {
      return this.a.a() + (var1 - 1) * this.a.b();
   }

   public int b(int var1) {
      return this.a(var1) + this.a.b();
   }

   public int b() {
      return 4;
   }

   public int a(int var1, abD var2) {
      if (var2.c()) {
         return 0;
      } else if (this.a == Nt.ALL) {
         return var1;
      } else if (this.a == Nt.FIRE && var2.d()) {
         return var1 * 2;
      } else if (this.a == Nt.FALL && var2 == abD.k) {
         return var1 * 3;
      } else if (this.a == Nt.EXPLOSION && var2.b()) {
         return var1 * 2;
      } else {
         return this.a == Nt.PROJECTILE && var2.a() ? var1 * 2 : 0;
      }
   }

   public String a() {
      return "enchantment.protect." + this.a.a();
   }

   public boolean b(MT var1) {
      if (var1 instanceof Ns) {
         Ns var2 = (Ns)var1;
         if (this.a == var2.a) {
            return false;
         } else {
            return this.a == Nt.FALL || var2.a == Nt.FALL;
         }
      } else {
         return super.b(var1);
      }
   }

   public static int a(Oh var0, int var1) {
      int var2 = Nh.a(RS.b, var0);
      if (var2 > 0) {
         var1 -= adh.a((float)var1 * (float)var2 * 0.15F);
      }

      return var1;
   }

   public static double a(Oh var0, double var1) {
      int var3 = Nh.a(RS.d, var0);
      if (var3 > 0) {
         var1 -= (double)adh.b(var1 * (double)((float)var3 * 0.15F));
      }

      return var1;
   }
}
