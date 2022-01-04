public final class afP extends acV {
   private final int d;
   private afP[] a;
   private boolean a;

   public afP(int var1, int var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public afP(double var1, double var3, double var5) {
      this(adh.b(var1), adh.b(var3), adh.b(var5));
   }

   public afP(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3);
      this.d = var4;
   }

   public void a(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.a = true;
   }

   public void a(double var1, double var3, double var5) {
      this.a(adh.b(var1), adh.b(var3), adh.b(var5));
   }

   public acV a(abP var1) {
      if (this.d <= 0) {
         return super.a(var1, 1).g();
      } else {
         if (this.a == null) {
            this.a = new afP[abP.VALUES.length];
         }

         if (this.a) {
            this.a();
         }

         int var2 = var1.getIndex();
         afP var3 = this.a[var2];
         if (var3 == null) {
            int var4 = this.a + var1.getXOffset();
            int var5 = this.b + var1.getYOffset();
            int var6 = this.c + var1.getZOffset();
            var3 = new afP(var4, var5, var6, this.d - 1);
            this.a[var2] = var3;
         }

         return var3;
      }
   }

   public acV a(abP var1, int var2) {
      return var2 == 1 ? this.a(var1) : super.a(var1, var2).g();
   }

   private void a() {
      int var1 = this.a;
      int var2 = this.b;
      int var3 = this.c;
      afP[] var4 = this.a;

      for(int var5 = 0; var5 < 6; ++var5) {
         afP var6 = var4[var5];
         if (var6 != null) {
            abP var7 = abP.VALUES[var5];
            int var8 = var1 + var7.getXOffset();
            int var9 = var2 + var7.getYOffset();
            int var10 = var3 + var7.getZOffset();
            var6.a(var8, var9, var10);
         }
      }

      this.a = false;
   }

   public acV g() {
      return new acV(this.a, this.b, this.c);
   }

   public static Iterable b(acV var0, acV var1) {
      acV var2 = new acV(Math.min(var0.a, var1.a), Math.min(var0.b, var1.b), Math.min(var0.c, var1.c));
      acV var3 = new acV(Math.max(var0.a, var1.a), Math.max(var0.b, var1.b), Math.max(var0.c, var1.c));
      return new afQ(var2, var3);
   }
}
