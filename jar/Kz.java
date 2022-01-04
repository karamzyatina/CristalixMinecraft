public final class KZ {
   private int[] a;
   private int a = 0;

   public KZ(int var1) {
      this.a = new int[var1];
   }

   public void a(int var1) {
      int var2 = this.a;
      int[] var3 = this.a;
      if (var2 == var3.length) {
         int[] var4 = new int[var2 * 2];
         System.arraycopy(var3, 0, var4, 0, var2);
         var3 = var4;
         this.a = var4;
      }

      var3[this.a++] = var1;
   }

   public int a() {
      return this.a[--this.a];
   }

   public boolean a() {
      return this.a == 0;
   }

   public int b() {
      return this.a;
   }

   public void b(int var1) {
      this.a = var1;
   }
}
