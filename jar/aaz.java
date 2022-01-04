public final class aaZ extends aaD {
   private SZ a;
   private int d;

   public aaZ() {
   }

   public aaZ(SZ var1, int var2) {
      this.a = var1;
      this.d = var2;
   }

   public VR a(VR var1) {
      super.a(var1);
      acC var2 = this.a.a();
      var1.a("Item", var2 == null ? "" : var2.toString());
      var1.a("Data", this.d);
      return var1;
   }

   public void a(VR var1) {
      super.a(var1);
      if (var1.a("Item", (int)8)) {
         this.a = SZ.a(var1.getString("Item"));
      } else {
         this.a = SZ.a(var1.getInteger("Item"));
      }

      this.d = var1.getInteger("Data");
   }

   public VR a() {
      return this.a(new VR());
   }

   public void a(Vh var1) {
      this.a = var1.a();
      this.d = var1.getMetadata();
   }

   public Vh a() {
      return this.a == null ? Vh.a : new Vh(this.a, 1, this.d);
   }

   public SZ a() {
      return this.a;
   }

   public int e() {
      return this.d;
   }
}
