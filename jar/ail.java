public final class aiL implements aiS {
   private final aiN a;
   private final aiP[] a;
   private int a = -1;

   public aiL(aiN var1, aiP[] var2) {
      this.a = var1;
      this.a = var2;
   }

   public float a(sE var1) {
      aiP[] var2 = this.a;
      if (this.a == aiN.SMOOTH) {
         aiP var3 = var2[0];
         if (!(var3 instanceof aiE)) {
            float var4 = a(var1, var2, 0);
            float var5 = var2.length > 1 ? a(var1, var2, 1) : 1.0F;
            float var6 = var2.length > 2 ? a(var1, var2, 2) : var5;
            if (this.a < 0) {
               this.a = alK.a();
            }

            return alK.a(this.a, var4, var5, var6);
         }
      }

      return this.a.a(var1, this.a);
   }

   private static float a(sE var0, aiP[] var1, int var2) {
      aiS var3 = (aiS)var1[var2];
      return var3.a(var0);
   }

   public String toString() {
      return this.a + "()";
   }
}
