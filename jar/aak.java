import java.util.OptionalInt;

public final class aaK extends aaD {
   private SW a;

   public aaK() {
      this.a = SW.RED;
   }

   public void a(Vh var1) {
      this.a(SW.b(var1.getMetadata()));
   }

   public void a(VR var1) {
      super.a(var1);
      if (var1.hasKey("color")) {
         this.a = SW.b(var1.getInteger("color"));
      }

   }

   public VR a(VR var1) {
      super.a(var1);
      var1.a("color", this.a.a());
      OptionalInt var2 = this.a;
      if (var2.isPresent()) {
         var1.a("rgb", var2.getAsInt());
      }

      return var1;
   }

   public VR a() {
      return this.a(new VR());
   }

   public SW a() {
      return this.a;
   }

   public void a(SW var1) {
      this.a = var1;
      this.b();
   }

   public boolean c() {
      return nk.a(this.a());
   }

   public Vh a() {
      Vh var1 = new Vh(RT.aM, 1, this.a.a());
      OptionalInt var2 = this.a;
      if (var2.isPresent()) {
         VR var3 = new VR();
         var3.a("rgb", var2.getAsInt());
         var1.a(var3);
      }

      return var1;
   }
}
