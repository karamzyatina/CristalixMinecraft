class uP extends tL {
   private final acI a;
   private final String b;
   public float b;
   public boolean d;
   // $FF: synthetic field
   final uO a;

   public uP(uO var1, int var2, int var3, int var4, acI var5, boolean var6) {
      super(var2, var3, var4, var6 ? 310 : 150, 20, "");
      this.a = var1;
      this.b = 1.0F;
      this.a = var5;
      this.b = IK.a("soundCategory." + var5.getName());
      this.a = this.b + ": " + var1.a(var5);
      this.b = uO.a(var1).a(var5);
   }

   protected int getHoverState(boolean var1) {
      return 0;
   }

   protected void a(sE var1, int var2, int var3) {
      if (this.b) {
         if (this.d) {
            this.b = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
            this.b = adh.a(this.b, 0.0F, 1.0F);
            var1.a.a(this.a, this.b);
            var1.a.b();
            this.a = this.b + ": " + this.a.a(this.a);
         }

         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         this.b(this.c + (int)(this.b * (float)(this.a - 8)), this.d, 0, 66, 4, 20);
         this.b(this.c + (int)(this.b * (float)(this.a - 8)) + 4, this.d, 196, 66, 4, 20);
      }

   }

   public boolean a(sE var1, int var2, int var3) {
      if (super.a(var1, var2, var3)) {
         this.b = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
         this.b = adh.a(this.b, 0.0F, 1.0F);
         var1.a.a(this.a, this.b);
         var1.a.b();
         this.a = this.b + ": " + this.a.a(this.a);
         this.d = true;
         return true;
      } else {
         return false;
      }
   }

   public void a(tq var1) {
   }

   public void mouseReleased(int var1, int var2) {
      if (this.d) {
         this.a.a.a().a((tb)tm.a(RW.ic, 1.0F));
         this.d = false;
      }

   }
}
