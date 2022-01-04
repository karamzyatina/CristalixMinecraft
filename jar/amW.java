public class amw extends amv {
   public static final int b = 1;
   public static final int c = 2;
   private int d;
   private final amR a;
   private int e;
   private int f;
   private int g;
   private int h;
   private int[] a;
   private amD a;
   private amD b;
   private amK a;
   private amK b;
   private int i;
   private ams a;
   private int j;
   private int k;
   private int l;
   private int m;
   private ams b;
   private amp a;
   private amp b;
   private amp c;
   private amp d;
   private amM a;
   private int n;
   private int o;
   private ams c;
   private int p;
   private ams d;
   private amP a;
   private amP b;
   private amq a;
   private int q;

   public amw(int var1) {
      this((amt)null, var1);
   }

   public amw(amt var1, int var2) {
      super(589824);
      this.a = var1 == null ? new amR(this) : new amR(this, var1);
      if ((var2 & 2) != 0) {
         this.q = 4;
      } else if ((var2 & 1) != 0) {
         this.q = 1;
      } else {
         this.q = 0;
      }

   }

   public final void a(int var1, int var2, String var3, String var4, String var5, String[] var6) {
      this.d = var1;
      this.e = var2;
      this.f = this.a.a(var1 & '\uffff', var3);
      if (var4 != null) {
         this.l = this.a.a(var4);
      }

      this.g = var5 == null ? 0 : this.a.a(var5).v;
      if (var6 != null && var6.length > 0) {
         this.h = var6.length;
         this.a = new int[this.h];

         for(int var7 = 0; var7 < this.h; ++var7) {
            this.a[var7] = this.a.a(var6[var7]).v;
         }
      }

      if (this.q == 1 && (var1 & '\uffff') >= 51) {
         this.q = 2;
      }

   }

   public final void a(String var1, String var2) {
      if (var1 != null) {
         this.m = this.a.a(var1);
      }

      if (var2 != null) {
         this.b = (new ams()).a((String)var2, 0, Integer.MAX_VALUE);
      }

   }

   public final amL a(String var1, int var2, String var3) {
      return this.a = new amM(this.a, this.a.d(var1).v, var2, var3 == null ? 0 : this.a.a(var3));
   }

   public final void a(String var1) {
      this.n = this.a.a(var1).v;
   }

   public final void a(String var1, String var2, String var3) {
      this.j = this.a.a(var1).v;
      if (var2 != null && var3 != null) {
         this.k = this.a.a(var2, var3);
      }

   }

   public final amo a(String var1, boolean var2) {
      return var2 ? (this.a = amp.a(this.a, var1, this.a)) : (this.b = amp.a(this.a, var1, this.b));
   }

   public final amo a(int var1, amU var2, String var3, boolean var4) {
      return var4 ? (this.c = amp.a(this.a, var1, var2, var3, this.c)) : (this.d = amp.a(this.a, var1, var2, var3, this.d));
   }

   public final void a(amq var1) {
      var1.a = this.a;
      this.a = var1;
   }

   public final void b(String var1) {
      if (this.c == null) {
         this.c = new ams();
      }

      ++this.o;
      this.c.b(this.a.a(var1).v);
   }

   public final void c(String var1) {
      if (this.d == null) {
         this.d = new ams();
      }

      ++this.p;
      this.d.b(this.a.a(var1).v);
   }

   public final void a(String var1, String var2, String var3, int var4) {
      if (this.a == null) {
         this.a = new ams();
      }

      amQ var5 = this.a.a(var1);
      if (var5.x == 0) {
         ++this.i;
         this.a.b(var5.v);
         this.a.b(var2 == null ? 0 : this.a.a(var2).v);
         this.a.b(var3 == null ? 0 : this.a.a(var3));
         this.a.b(var4);
         var5.x = this.i;
      }

   }

   public final amO a(String var1, String var2, String var3) {
      amP var4 = new amP(this.a, var1, var2, var3);
      if (this.a == null) {
         this.a = var4;
      } else {
         this.b.a = var4;
      }

      return this.b = var4;
   }

   public final amC a(int var1, String var2, String var3, String var4, Object var5) {
      amD var6 = new amD(this.a, var1, var2, var3, var4, var5);
      if (this.a == null) {
         this.a = var6;
      } else {
         this.b.a = var6;
      }

      return this.b = var6;
   }

   public final amJ a(int var1, String var2, String var3, String var4, String[] var5) {
      amK var6 = new amK(this.a, var1, var2, var3, var4, var5, this.q);
      if (this.a == null) {
         this.a = var6;
      } else {
         this.b.a = var6;
      }

      return this.b = var6;
   }

   public final void a() {
   }

   public byte[] a() {
      int var1 = 24 + 2 * this.h;
      int var2 = 0;

      amD var3;
      for(var3 = this.a; var3 != null; var3 = (amD)var3.a) {
         ++var2;
         var1 += var3.a();
      }

      int var4 = 0;

      amK var5;
      for(var5 = this.a; var5 != null; var5 = (amK)var5.a) {
         ++var4;
         var1 += var5.a();
      }

      int var6 = 0;
      if (this.a != null) {
         ++var6;
         var1 += 8 + this.a.a;
         this.a.a("InnerClasses");
      }

      if (this.j != 0) {
         ++var6;
         var1 += 10;
         this.a.a("EnclosingMethod");
      }

      if ((this.e & 4096) != 0 && (this.d & '\uffff') < 49) {
         ++var6;
         var1 += 6;
         this.a.a("Synthetic");
      }

      if (this.l != 0) {
         ++var6;
         var1 += 8;
         this.a.a("Signature");
      }

      if (this.m != 0) {
         ++var6;
         var1 += 8;
         this.a.a("SourceFile");
      }

      if (this.b != null) {
         ++var6;
         var1 += 6 + this.b.a;
         this.a.a("SourceDebugExtension");
      }

      if ((this.e & 131072) != 0) {
         ++var6;
         var1 += 6;
         this.a.a("Deprecated");
      }

      if (this.a != null) {
         ++var6;
         var1 += this.a.a("RuntimeVisibleAnnotations");
      }

      if (this.b != null) {
         ++var6;
         var1 += this.b.a("RuntimeInvisibleAnnotations");
      }

      if (this.c != null) {
         ++var6;
         var1 += this.c.a("RuntimeVisibleTypeAnnotations");
      }

      if (this.d != null) {
         ++var6;
         var1 += this.d.a("RuntimeInvisibleTypeAnnotations");
      }

      if (this.a.d() > 0) {
         ++var6;
         var1 += this.a.d();
      }

      if (this.a != null) {
         var6 += this.a.a();
         var1 += this.a.b();
      }

      if (this.n != 0) {
         ++var6;
         var1 += 8;
         this.a.a("NestHost");
      }

      if (this.c != null) {
         ++var6;
         var1 += 8 + this.c.a;
         this.a.a("NestMembers");
      }

      if (this.d != null) {
         ++var6;
         var1 += 8 + this.d.a;
         this.a.a("PermittedSubclasses");
      }

      int var7 = 0;
      int var8 = 0;
      if ((this.e & 65536) != 0 || this.a != null) {
         for(amP var9 = this.a; var9 != null; var9 = (amP)var9.a) {
            ++var7;
            var8 += var9.a();
         }

         ++var6;
         var1 += 8 + var8;
         this.a.a("Record");
      }

      if (this.a != null) {
         var6 += this.a.a();
         var1 += this.a.a(this.a);
      }

      var1 += this.a.c();
      int var15 = this.a.b();
      if (var15 > 65535) {
         throw new amu(this.a.a(), var15);
      } else {
         ams var10 = new ams(var1);
         var10.c(-889275714).c(this.d);
         this.a.a(var10);
         int var11 = (this.d & '\uffff') < 49 ? 4096 : 0;
         var10.b(this.e & ~var11).b(this.f).b(this.g);
         var10.b(this.h);

         for(int var12 = 0; var12 < this.h; ++var12) {
            var10.b(this.a[var12]);
         }

         var10.b(var2);

         for(var3 = this.a; var3 != null; var3 = (amD)var3.a) {
            var3.a(var10);
         }

         var10.b(var4);
         boolean var16 = false;
         boolean var13 = false;

         for(var5 = this.a; var5 != null; var5 = (amK)var5.a) {
            var16 |= var5.a();
            var13 |= var5.b();
            var5.a(var10);
         }

         var10.b(var6);
         if (this.a != null) {
            var10.b(this.a.a("InnerClasses")).c(this.a.a + 2).b(this.i).a((byte[])this.a.a, 0, this.a.a);
         }

         if (this.j != 0) {
            var10.b(this.a.a("EnclosingMethod")).c(4).b(this.j).b(this.k);
         }

         if ((this.e & 4096) != 0 && (this.d & '\uffff') < 49) {
            var10.b(this.a.a("Synthetic")).c(0);
         }

         if (this.l != 0) {
            var10.b(this.a.a("Signature")).c(2).b(this.l);
         }

         if (this.m != 0) {
            var10.b(this.a.a("SourceFile")).c(2).b(this.m);
         }

         if (this.b != null) {
            int var14 = this.b.a;
            var10.b(this.a.a("SourceDebugExtension")).c(var14).a((byte[])this.b.a, 0, var14);
         }

         if ((this.e & 131072) != 0) {
            var10.b(this.a.a("Deprecated")).c(0);
         }

         amp.a(this.a, this.a, this.b, this.c, this.d, var10);
         this.a.b(var10);
         if (this.a != null) {
            this.a.a(var10);
         }

         if (this.n != 0) {
            var10.b(this.a.a("NestHost")).c(2).b(this.n);
         }

         if (this.c != null) {
            var10.b(this.a.a("NestMembers")).c(this.c.a + 2).b(this.o).a((byte[])this.c.a, 0, this.c.a);
         }

         if (this.d != null) {
            var10.b(this.a.a("PermittedSubclasses")).c(this.d.a + 2).b(this.p).a((byte[])this.d.a, 0, this.d.a);
         }

         if ((this.e & 65536) != 0 || this.a != null) {
            var10.b(this.a.a("Record")).c(var8 + 2).b(var7);

            for(amP var17 = this.a; var17 != null; var17 = (amP)var17.a) {
               var17.a(var10);
            }
         }

         if (this.a != null) {
            this.a.a(this.a, var10);
         }

         return var13 ? this.a(var10.a, var16) : var10.a;
      }
   }

   private byte[] a(byte[] var1, boolean var2) {
      amq[] var3 = this.a();
      this.a = null;
      this.b = null;
      this.a = null;
      this.b = null;
      this.a = null;
      this.b = null;
      this.c = null;
      this.d = null;
      this.a = null;
      this.n = 0;
      this.o = 0;
      this.c = null;
      this.p = 0;
      this.d = null;
      this.a = null;
      this.b = null;
      this.a = null;
      this.q = var2 ? 3 : 0;
      (new amt(var1, 0, false)).a((amv)this, (amq[])var3, (var2 ? 8 : 0) | 256);
      return this.a();
   }

   private amq[] a() {
      amr var1 = new amr();
      var1.a(this.a);

      for(amD var2 = this.a; var2 != null; var2 = (amD)var2.a) {
         var2.a(var1);
      }

      for(amK var3 = this.a; var3 != null; var3 = (amK)var3.a) {
         var3.a(var1);
      }

      for(amP var4 = this.a; var4 != null; var4 = (amP)var4.a) {
         var4.a(var1);
      }

      return var1.a();
   }

   public int a(Object var1) {
      return this.a.a(var1).v;
   }

   public int a(String var1) {
      return this.a.a(var1);
   }

   public int b(String var1) {
      return this.a.a(var1).v;
   }

   public int c(String var1) {
      return this.a.c(var1).v;
   }

   public int d(String var1) {
      return this.a.d(var1).v;
   }

   public int e(String var1) {
      return this.a.e(var1).v;
   }

   @Deprecated
   public int a(int var1, String var2, String var3, String var4) {
      return this.a(var1, var2, var3, var4, var1 == 9);
   }

   public int a(int var1, String var2, String var3, String var4, boolean var5) {
      return this.a.a(var1, var2, var3, var4, var5).v;
   }

   public int a(String var1, String var2, amF var3, Object... var4) {
      return this.a.a(var1, var2, var3, var4).v;
   }

   public int b(String var1, String var2, amF var3, Object... var4) {
      return this.a.b(var1, var2, var3, var4).v;
   }

   public int a(String var1, String var2, String var3) {
      return this.a.a(var1, var2, var3).v;
   }

   public int a(String var1, String var2, String var3, boolean var4) {
      return this.a.a(var1, var2, var3, var4).v;
   }

   public int a(String var1, String var2) {
      return this.a.a(var1, var2);
   }

   protected String a(String var1, String var2) {
      ClassLoader var3 = this.a();

      Class var4;
      try {
         var4 = Class.forName(var1.replace('/', '.'), false, var3);
      } catch (ClassNotFoundException var8) {
         throw new TypeNotPresentException(var1, var8);
      }

      Class var5;
      try {
         var5 = Class.forName(var2.replace('/', '.'), false, var3);
      } catch (ClassNotFoundException var7) {
         throw new TypeNotPresentException(var2, var7);
      }

      if (var4.isAssignableFrom(var5)) {
         return var1;
      } else if (var5.isAssignableFrom(var4)) {
         return var2;
      } else if (!var4.isInterface() && !var5.isInterface()) {
         do {
            var4 = var4.getSuperclass();
         } while(!var4.isAssignableFrom(var5));

         return var4.getName().replace('.', '/');
      } else {
         return "java/lang/Object";
      }
   }

   protected ClassLoader a() {
      return this.getClass().getClassLoader();
   }
}
