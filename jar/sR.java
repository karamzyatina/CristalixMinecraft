public final class Sr extends RY {
   private final Oo a;
   private final SN a;

   public Sr(Rs var1, Oo var2, aej var3) {
      this.a = var2;
      this.a = new SN(var1.a, var2);
      this.a((SP)(new SP(this.a, 0, 36, 53)));
      this.a((SP)(new SP(this.a, 1, 62, 53)));
      this.a((SP)(new ST(var1.a, var2, this.a, 2, 120, 53)));

      int var4;
      for(var4 = 0; var4 < 3; ++var4) {
         for(int var5 = 0; var5 < 9; ++var5) {
            this.a((SP)(new SP(var1, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18)));
         }
      }

      for(var4 = 0; var4 < 9; ++var4) {
         this.a((SP)(new SP(var1, var4, 8 + var4 * 18, 142)));
      }

   }

   public SN a() {
      return this.a;
   }

   public void a(SE var1) {
      this.a.a();
      super.a(var1);
   }

   public void a(int var1) {
      this.a.a(var1);
   }

   public boolean a(Rn var1) {
      return this.a.a() == var1;
   }

   public Vh a(Rn var1, int var2) {
      Vh var3 = Vh.a;
      SP var4 = (SP)this.a.get(var2);
      if (var4 != null && var4.a()) {
         Vh var5 = var4.a();
         var3 = var5.a();
         if (var2 == 2) {
            if (!this.a(var5, 3, 39, true)) {
               return Vh.a;
            }

            var4.a(var5, var3);
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 30) {
               if (!this.a(var5, 30, 39, false)) {
                  return Vh.a;
               }
            } else if (var2 >= 30 && var2 < 39 && !this.a(var5, 3, 30, false)) {
               return Vh.a;
            }
         } else if (!this.a(var5, 3, 39, false)) {
            return Vh.a;
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

   public void a(Rn var1) {
      super.a(var1);
      this.a.a((Rn)null);
      super.a(var1);
   }
}
