public abstract class OB implements OC {
   private final OC a;
   private final String a;
   private final double a;
   private boolean a;

   protected OB(OC var1, String var2, double var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public String getName() {
      return this.a;
   }

   public double getDefaultValue() {
      return this.a;
   }

   public boolean a() {
      return this.a;
   }

   public OB a(boolean var1) {
      this.a = var1;
      return this;
   }

   public OC a() {
      return this.a;
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public boolean equals(Object var1) {
      return var1 == this || var1 instanceof OC && this.a.equals(((OC)var1).getName());
   }
}
