public final class Sf extends RY {
   private final SE a;
   private final int b;

   public Sf(SE var1, SE var2, Rn var3) {
      this.a = var2;
      this.b = var2.getSizeInventory() / 9;
      var2.b(var3);
      int var4 = (this.b - 4) * 18;

      int var5;
      int var6;
      for(var5 = 0; var5 < this.b; ++var5) {
         for(var6 = 0; var6 < 9; ++var6) {
            this.a((SP)(new SP(var2, var6 + var5 * 9, 8 + var6 * 18, 18 + var5 * 18)));
         }
      }

      for(var5 = 0; var5 < 3; ++var5) {
         for(var6 = 0; var6 < 9; ++var6) {
            this.a((SP)(new SP(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, 103 + var5 * 18 + var4)));
         }
      }

      for(var5 = 0; var5 < 9; ++var5) {
         this.a((SP)(new SP(var1, var5, 8 + var5 * 18, 161 + var4)));
      }

   }

   public boolean a(Rn var1) {
      return this.a.b(var1);
   }

   public Vh a(Rn var1, int var2) {
      Vh var3 = Vh.a;
      SP var4 = (SP)this.a.get(var2);
      if (var4 != null && var4.a()) {
         Vh var5 = var4.a();
         var3 = var5.a();
         if (var2 < this.b * 9) {
            if (!this.a(var5, this.b * 9, this.a.size(), true)) {
               return Vh.a;
            }
         } else if (!this.a(var5, 0, this.b * 9, false)) {
            return Vh.a;
         }

         if (var5.isEmpty()) {
            var4.a(Vh.a);
         } else {
            var4.a();
         }
      }

      return var3;
   }

   public void a(Rn var1) {
      super.a(var1);
      this.a.c(var1);
   }
}
