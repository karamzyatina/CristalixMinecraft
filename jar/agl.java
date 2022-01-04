public final class agL {
   private final int a;
   private final int b;

   public agL(int var1, int var2) {
      this.a = Math.min(var1, var2);
      this.b = Math.max(var1, var2);
   }

   public boolean a(int var1) {
      if (var1 < this.a) {
         return false;
      } else {
         return var1 <= this.b;
      }
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public String toString() {
      return "min: " + this.a + ", max: " + this.b;
   }
}
