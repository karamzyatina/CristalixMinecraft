public final class amb {
   private int a;

   public boolean a() {
      return ++this.a == 1;
   }

   public boolean b() {
      if (this.a <= 0) {
         return false;
      } else {
         return --this.a == 0;
      }
   }

   public boolean c() {
      return this.a > 0;
   }

   public int a() {
      return this.a;
   }

   public String toString() {
      return "lockCount: " + this.a;
   }
}
