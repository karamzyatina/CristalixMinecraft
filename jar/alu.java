public final class alU {
   private final int a;
   private int b;

   public alU(int var1) {
      this.a = var1;
      this.b = var1;
   }

   public synchronized int a() {
      int var1 = this.b++;
      return var1;
   }

   public synchronized void a() {
      this.b = this.a;
   }

   public int b() {
      return this.b;
   }
}
