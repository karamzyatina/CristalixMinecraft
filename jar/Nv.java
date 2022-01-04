public class NV {
   private final Oh a;
   private int a;
   private float a;

   public NV(Oh var1) {
      this.a = var1;
   }

   public void a() {
      double var1 = this.a.d - this.a.a;
      double var3 = this.a.f - this.a.c;
      if (var1 * var1 + var3 * var3 > 2.500000277905201E-7D) {
         this.a.A = this.a.j;
         this.a.C = a(this.a.A, this.a.C, 75.0F);
         this.a = this.a.C;
         this.a = 0;
      } else if (this.a.a.isEmpty() || !(this.a.a.get(0) instanceof Of)) {
         float var5 = 75.0F;
         if (Math.abs(this.a.C - this.a) > 15.0F) {
            this.a = 0;
            this.a = this.a.C;
         } else {
            ++this.a;
            if (this.a > 10) {
               var5 = Math.max(1.0F - (float)(this.a - 10) / 10.0F, 0.0F) * 75.0F;
            }
         }

         this.a.A = a(this.a.C, this.a.A, var5);
      }

   }

   private static float a(float var0, float var1, float var2) {
      float var3 = adh.d(var0 - var1);
      if (var3 < -var2) {
         var3 = -var2;
      }

      if (var3 >= var2) {
         var3 = var2;
      }

      return var0 - var3;
   }
}
