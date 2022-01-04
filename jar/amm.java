final class amM extends amL {
   private final amR a;
   private final int b;
   private final int c;
   private final int d;
   private int e;
   private final ams a;
   private int f;
   private final ams b;
   private int g;
   private final ams c;
   private int h;
   private final ams d;
   private int i;
   private final ams e;
   private int j;
   private final ams f;
   private int k;

   amM(amR var1, int var2, int var3, int var4) {
      super(589824);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.a = new ams();
      this.b = new ams();
      this.c = new ams();
      this.d = new ams();
      this.e = new ams();
      this.f = new ams();
   }

   public void a(String var1) {
      this.k = this.a.a(var1).v;
   }

   public void b(String var1) {
      this.f.b(this.a.e(var1).v);
      ++this.j;
   }

   public void a(String var1, int var2, String var3) {
      this.a.b(this.a.d(var1).v).b(var2).b(var3 == null ? 0 : this.a.a(var3));
      ++this.e;
   }

   public void a(String var1, int var2, String... var3) {
      this.b.b(this.a.e(var1).v).b(var2);
      if (var3 == null) {
         this.b.b(0);
      } else {
         this.b.b(var3.length);
         String[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            this.b.b(this.a.d(var7).v);
         }
      }

      ++this.f;
   }

   public void b(String var1, int var2, String... var3) {
      this.c.b(this.a.e(var1).v).b(var2);
      if (var3 == null) {
         this.c.b(0);
      } else {
         this.c.b(var3.length);
         String[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            this.c.b(this.a.d(var7).v);
         }
      }

      ++this.g;
   }

   public void c(String var1) {
      this.d.b(this.a.a(var1).v);
      ++this.h;
   }

   public void a(String var1, String... var2) {
      this.e.b(this.a.a(var1).v);
      this.e.b(var2.length);
      String[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         this.e.b(this.a.a(var6).v);
      }

      ++this.i;
   }

   public void a() {
   }

   int a() {
      return 1 + (this.j > 0 ? 1 : 0) + (this.k > 0 ? 1 : 0);
   }

   int b() {
      this.a.a("Module");
      int var1 = 22 + this.a.a + this.b.a + this.c.a + this.d.a + this.e.a;
      if (this.j > 0) {
         this.a.a("ModulePackages");
         var1 += 8 + this.f.a;
      }

      if (this.k > 0) {
         this.a.a("ModuleMainClass");
         var1 += 8;
      }

      return var1;
   }

   void a(ams var1) {
      int var2 = 16 + this.a.a + this.b.a + this.c.a + this.d.a + this.e.a;
      var1.b(this.a.a("Module")).c(var2).b(this.b).b(this.c).b(this.d).b(this.e).a((byte[])this.a.a, 0, this.a.a).b(this.f).a((byte[])this.b.a, 0, this.b.a).b(this.g).a((byte[])this.c.a, 0, this.c.a).b(this.h).a((byte[])this.d.a, 0, this.d.a).b(this.i).a((byte[])this.e.a, 0, this.e.a);
      if (this.j > 0) {
         var1.b(this.a.a("ModulePackages")).c(2 + this.f.a).b(this.j).a((byte[])this.f.a, 0, this.f.a);
      }

      if (this.k > 0) {
         var1.b(this.a.a("ModuleMainClass")).c(2).b(this.k);
      }

   }
}
