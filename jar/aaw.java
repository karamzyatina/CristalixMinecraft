public final class aaW extends aaX implements aci {
   private long a;
   private int d;
   private acV a;
   private boolean b;

   public VR a(VR var1) {
      super.a(var1);
      var1.a("Age", this.a);
      if (this.a != null) {
         var1.a((String)"ExitPortal", (VK)We.a(this.a));
      }

      if (this.b) {
         var1.a("ExactTeleport", this.b);
      }

      return var1;
   }

   public void a(VR var1) {
      super.a(var1);
      this.a = var1.getLong("Age");
      if (var1.a("ExitPortal", (int)10)) {
         this.a = We.a(var1.a("ExitPortal"));
      }

      this.b = var1.getBoolean("ExactTeleport");
   }

   public double a() {
      return 65536.0D;
   }

   public void a() {
      boolean var1 = this.c();
      boolean var2 = this.d();
      ++this.a;
      if (var2) {
         --this.d;
      }

      if (var1 != this.c() || var2 != this.d()) {
         this.b();
      }

   }

   public boolean c() {
      return this.a < 200L;
   }

   public boolean d() {
      return this.d > 0;
   }

   public float a(float var1) {
      return adh.a(((float)this.a + var1) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float var1) {
      return 1.0F - adh.a(((float)this.d - var1) / 40.0F, 0.0F, 1.0F);
   }

   public VR a() {
      return this.a(new VR());
   }

   public boolean a(int var1, int var2) {
      if (var1 == 1) {
         this.d = 40;
         return true;
      } else {
         return super.a(var1, var2);
      }
   }

   public void a(NN var1) {
   }

   public boolean a(abP var1) {
      return this.a().a().a(this.a, this.a, this.b, this.c, var1);
   }

   public int e() {
      int var1 = 0;
      abP[] var2 = abP.values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         abP var5 = var2[var4];
         var1 += this.a(var5) ? 1 : 0;
      }

      return var1;
   }
}
