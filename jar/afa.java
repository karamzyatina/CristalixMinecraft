public class afA {
   public final Rn a;
   private boolean a = true;
   private int a;
   private int b;
   private int c = 127;
   private int d = 127;

   public afA(Rn var1) {
      this.a = var1;
   }

   public void a(int var1, int var2) {
      if (this.a) {
         this.a = Math.min(this.a, var1);
         this.b = Math.min(this.b, var2);
         this.c = Math.max(this.c, var1);
         this.d = Math.max(this.d, var2);
      } else {
         this.a = true;
         this.a = var1;
         this.b = var2;
         this.c = var1;
         this.d = var2;
      }

   }
}
