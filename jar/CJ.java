public final class Cj {
   private final Bh[] a;

   public Cj(HO var1) {
      Bh[] var2 = new Bh[abu.VALUES.length];
      var2[abu.SOLID.ordinal()] = new Bh(var1, 2097152);
      var2[abu.CUTOUT.ordinal()] = new Bh(var1, 131072);
      var2[abu.CUTOUT_MIPPED.ordinal()] = new Bh(var1, 131072);
      var2[abu.TRANSLUCENT.ordinal()] = new Bh(var1, 262144);
      this.a = var2;
   }

   public Bh a(abu var1) {
      return this.a[var1.ordinal()];
   }

   public Bh a(int var1) {
      return this.a[var1];
   }

   public Bh[] a() {
      return this.a;
   }
}
