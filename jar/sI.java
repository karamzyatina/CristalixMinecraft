class Si extends SH {
   // $FF: synthetic field
   final Sh a;

   Si(Sh var1, String var2, boolean var3, int var4) {
      super(var2, var3, var4);
      this.a = var1;
   }

   public int getInventoryStackLimit() {
      return 64;
   }

   public void b() {
      super.b();
      this.a.a((SE)this);
   }
}
