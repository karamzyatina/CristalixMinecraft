class uM extends tL {
   private final boolean d;

   public uM(int var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, 23, 13, "");
      this.d = var4;
   }

   public void a(sE var1, int var2, int var3, float var4) {
      if (this.b) {
         boolean var5 = var2 >= this.c && var3 >= this.d && var2 < this.c + this.a && var3 < this.d + this.b;
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         var1.a().c(uL.a());
         int var6 = 0;
         int var7 = 192;
         if (var5) {
            var6 += 23;
         }

         if (!this.d) {
            var7 += 13;
         }

         this.b(this.c, this.d, var6, var7, 23, 13);
      }

   }
}
