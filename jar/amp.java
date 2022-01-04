final class amP extends amO {
   private final amR a;
   private final int b;
   private final int c;
   private int d;
   private amp a;
   private amp b;
   private amp c;
   private amp d;
   private amq a;

   amP(amR var1, String var2, String var3, String var4) {
      super(589824);
      this.a = var1;
      this.b = var1.a(var2);
      this.c = var1.a(var3);
      if (var4 != null) {
         this.d = var1.a(var4);
      }

   }

   public amo a(String var1, boolean var2) {
      return var2 ? (this.a = amp.a(this.a, var1, this.a)) : (this.b = amp.a(this.a, var1, this.b));
   }

   public amo a(int var1, amU var2, String var3, boolean var4) {
      return var4 ? (this.c = amp.a(this.a, var1, var2, var3, this.c)) : (this.d = amp.a(this.a, var1, var2, var3, this.d));
   }

   public void a(amq var1) {
      var1.a = this.a;
      this.a = var1;
   }

   public void a() {
   }

   int a() {
      byte var1 = 6;
      int var2 = var1 + amq.a(this.a, 0, this.d);
      var2 += amp.a(this.a, this.b, this.c, this.d);
      if (this.a != null) {
         var2 += this.a.a(this.a);
      }

      return var2;
   }

   void a(ams var1) {
      var1.b(this.b).b(this.c);
      int var2 = 0;
      if (this.d != 0) {
         ++var2;
      }

      if (this.a != null) {
         ++var2;
      }

      if (this.b != null) {
         ++var2;
      }

      if (this.c != null) {
         ++var2;
      }

      if (this.d != null) {
         ++var2;
      }

      if (this.a != null) {
         var2 += this.a.a();
      }

      var1.b(var2);
      amq.a(this.a, 0, this.d, var1);
      amp.a(this.a, this.a, this.b, this.c, this.d, var1);
      if (this.a != null) {
         this.a.a(this.a, var1);
      }

   }

   final void a(amr var1) {
      var1.a(this.a);
   }
}
