public final class Ru {
   public boolean a;
   public boolean b;
   public boolean c;
   public boolean d;
   public iQ a;
   private iT a;
   private iT b;

   public Ru() {
      if (this.a == null) {
         this.a = new iQ(false);
      }

      if (this.a == null) {
         this.a = new iT(0.0F);
      }

      if (this.b == null) {
         this.b = new iT(0.0F);
      }

      this.a.a(true);
      this.a.a(iM.a(iM.a(-1834260400) ^ iM.a(~iM.a(1343773538))));
      this.b.a(iM.a(iM.a(-1552795800) ^ iM.a(~iM.a(1631650906))));
   }

   public void a(VR var1) {
      VR var2 = new VR();
      var2.a("invulnerable", this.a);
      var2.a("flying", this.b);
      var2.a("mayfly", this.c);
      var2.a("instabuild", this.d);
      var2.a("mayBuild", this.a.a());
      var2.a("flySpeed", this.a.a());
      var2.a("walkSpeed", this.b.a());
      var1.a((String)"abilities", (VK)var2);
   }

   public void b(VR var1) {
      if (var1.a("abilities", (int)10)) {
         VR var2 = var1.a("abilities");
         this.a = var2.getBoolean("invulnerable");
         this.b = var2.getBoolean("flying");
         this.c = var2.getBoolean("mayfly");
         this.d = var2.getBoolean("instabuild");
         if (var2.a("flySpeed", (int)99)) {
            this.a.a(var2.getFloat("flySpeed"));
            this.b.a(var2.getFloat("walkSpeed"));
         }

         if (var2.a("mayBuild", (int)1)) {
            this.a.a(var2.getBoolean("mayBuild"));
         }
      }

   }

   public float a() {
      return this.a.a();
   }

   public void a(float var1) {
      this.a.a(var1);
   }

   public float b() {
      return this.b.a();
   }

   public void b(float var1) {
      this.b.a(var1);
   }
}
