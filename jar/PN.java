public final class Pn extends NY {
   private static final WB<Vh> g;
   private static final WB<Integer> h;

   public Pn(aej var1) {
      super(var1);
   }

   public Pn(aej var1, acV var2, abP var3) {
      super(var1, var2);
      this.a(var3);
   }

   protected void l() {
      this.a().a((WB)g, (Object)Vh.a);
      this.a().a((WB)h, (int)0);
   }

   public float b() {
      return 0.0F;
   }

   public boolean a(abD var1, float var2) {
      if (this.a(var1)) {
         return false;
      } else {
         return !var1.b() && !this.a().isEmpty() ? true : super.a(var1, var2);
      }
   }

   public int d() {
      return 12;
   }

   public int e() {
      return 12;
   }

   public boolean a(double var1) {
      double var3 = 16.0D;
      var3 = var3 * 64.0D * a();
      return var1 < var3 * var3;
   }

   public Vh a() {
      return (Vh)this.a().a(g);
   }

   public void a(Vh var1, boolean var2) {
      if (!var1.isEmpty()) {
         var1 = var1.a();
         var1.setCount(1);
         var1.a(this);
      }

      this.a().b(g, var1);
      this.a().a(g);
   }

   public void a(WB<?> var1) {
      if (var1.equals(g)) {
         Vh var2 = this.a();
         if (!var2.isEmpty() && var2.a() != this) {
            var2.a(this);
         }
      }

   }

   public int f() {
      return (Integer)this.a().a(h);
   }

   public void a(int var1) {
      this.b(var1, true);
   }

   private void b(int var1, boolean var2) {
      this.a().b(h, var1 % 8);
   }

   public void b(VR var1) {
      VR var2 = var1.a("Item");
      if (var2 != null && !var2.isEmpty()) {
         this.a(new Vh(var2), false);
         this.b(var1.getByte("ItemRotation"), false);
      }

      super.b(var1);
   }

   public boolean a(Rn var1, abU var2) {
      return true;
   }

   public int g() {
      return this.a().isEmpty() ? 0 : this.f() % 8 + 1;
   }

   static {
      g = WS.a(Pn.class, WD.f);
      h = WS.a(Pn.class, WD.b);
   }
}
