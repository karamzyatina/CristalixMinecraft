public final class aiG implements aiR, aiS {
   private final aiS a;
   private float a = Float.NaN;

   public aiG(aiS var1) {
      this.a = var1;
   }

   public float a(sE var1) {
      float var2 = this.a;
      return Float.isNaN(var2) ? (this.a = this.a.a(var1)) : var2;
   }

   public void a() {
      this.a = Float.NaN;
   }

   public aiJ a() {
      return aiJ.FLOAT;
   }

   public String toString() {
      return "cached(" + this.a + ')';
   }
}
