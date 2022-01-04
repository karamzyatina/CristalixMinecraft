public final class aiF implements aiR, aiT {
   private final aiT a;
   private float[] a;

   public aiF(aiT var1) {
      this.a = var1;
   }

   public float[] a(sE var1) {
      float[] var2 = this.a;
      return var2 == null ? (this.a = this.a.a(var1)) : var2;
   }

   public void a() {
      this.a = null;
   }

   public aiJ a() {
      return aiJ.FLOAT;
   }

   public String toString() {
      return "cached(" + this.a + ')';
   }
}
