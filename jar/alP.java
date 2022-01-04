public final class alp extends all {
   private float b = 1.0F;
   public boolean d;
   private akX a = null;

   public alp(tI var1, int var2, int var3, int var4, int var5, int var6, akX var7, String var8) {
      super(var2, var3, var4, var5, var6, var7, var8);
      this.a = var7;
      this.b = var7.a();
      this.a = alm.a(var1, var7, this.a);
   }

   protected int getHoverState(boolean var1) {
      return 0;
   }

   protected void a(sE var1, int var2, int var3) {
      if (this.b) {
         if (this.d && !uI.b()) {
            this.b = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
            this.b = adh.a(this.b, 0.0F, 1.0F);
            this.a.a(this.b);
            this.b = this.a.a();
            this.a = alm.a(var1.a, this.a, this.a);
         }

         var1.a().a(c);
         By.c(1.0F, 1.0F, 1.0F, 1.0F);
         this.b(this.c + (int)(this.b * (float)(this.a - 8)), this.d, 0, 66, 4, 20);
         this.b(this.c + (int)(this.b * (float)(this.a - 8)) + 4, this.d, 196, 66, 4, 20);
      }

   }

   public boolean a(sE var1, int var2, int var3) {
      if (super.a(var1, var2, var3)) {
         this.b = (float)(var2 - (this.c + 4)) / (float)(this.a - 8);
         this.b = adh.a(this.b, 0.0F, 1.0F);
         this.a.a(this.b);
         this.a = alm.a(var1.a, this.a, this.a);
         this.d = true;
         return true;
      } else {
         return false;
      }
   }

   public void mouseReleased(int var1, int var2) {
      this.d = false;
   }

   public void a() {
      this.b = this.a.a();
   }

   public boolean b() {
      return false;
   }
}
