import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class ajX {
   private int a = Ci.b();
   private int b = 4096;
   private int c = 0;
   private int d;
   private final alZ<ajW> a = new alZ();
   private ajW a = null;
   private ByteBuffer a;
   private ByteBuffer b;
   private IntBuffer a;
   private IntBuffer b;
   private int e;
   private final int f;

   public ajX() {
      this.a = Bx.a(this.b << 2);
      this.b = Bx.a(this.b << 2);
      this.a = this.a.asIntBuffer();
      this.b = this.b.asIntBuffer();
      this.e = 7;
      this.f = In.a.getSize();
      this.a();
      long var1 = this.a(this.b);
      Ci.a(Ci.J, var1, Ci.K);
      this.b();
   }

   public void a(ByteBuffer var1, ajW var2) {
      int var3 = var2.a();
      int var4 = var2.b();
      int var5 = this.a((long)var1.limit());
      if (var5 <= 0) {
         if (var3 >= 0) {
            var2.a(-1);
            var2.b(0);
            this.a.a(var2.a());
            this.d -= var4;
         }
      } else {
         if (var5 > var4) {
            var2.a(this.c);
            var2.b(var5);
            this.c += var5;
            if (var3 >= 0) {
               this.a.a(var2.a());
            }

            this.a.a(var2.a());
         }

         var2.b(var5);
         this.d += var5 - var4;
         this.b(var2.c());
         long var6 = this.a(var2.a());
         this.a();
         Ci.a(Ci.J, var6, var1);
         this.b();
         if (this.c > this.d * 11 / 10) {
            this.a(1);
         }
      }

   }

   private void a(int var1) {
      if (!this.a.a()) {
         ajW var2 = this.a;
         if (var2 == null || !this.a.a(var2.a())) {
            var2 = (ajW)this.a.a().a();
         }

         ajW var3 = var2.a();
         int var4;
         if (var3 == null) {
            var4 = 0;
         } else {
            var4 = var3.c();
         }

         int var5 = 0;

         while(var2 != null && var5 < var1) {
            ++var5;
            if (var2.a() == var4) {
               var4 += var2.b();
               var2 = var2.b();
            } else {
               int var6 = var2.a() - var4;
               if (var2.b() <= var6) {
                  this.a(var2.a(), var4, var2.b());
                  var2.a(var4);
                  var4 += var2.b();
                  var2 = var2.b();
               } else {
                  this.b(this.c + var2.b());
                  this.a(var2.a(), this.c, var2.b());
                  var2.a(this.c);
                  this.c += var2.b();
                  ajW var7 = var2.b();
                  this.a.a(var2.a());
                  this.a.a(var2.a());
                  var2 = var7;
               }
            }
         }

         if (var2 == null) {
            this.c = ((ajW)this.a.b().a()).c();
         }

         this.a = var2;
      }

   }

   private void b(int var1) {
      if (this.b < var1) {
         this.c(var1);
      }

   }

   private void a(int var1, int var2, int var3) {
      long var4 = this.a(var1);
      long var6 = this.a(var2);
      long var8 = this.a(var3);
      Ci.c(Ci.L, this.a);
      Ci.c(Ci.M, this.a);
      Ci.a(Ci.L, Ci.M, var4, var6, var8);
      afT.f("Copy VBO range");
      Ci.c(Ci.L, 0);
      Ci.c(Ci.M, 0);
   }

   private void c(int var1) {
      int var2;
      for(var2 = this.b * 6 / 4; var2 < var1; var2 = var2 * 6 / 4) {
      }

      long var3 = this.a(this.b);
      long var5 = this.a(var2);
      int var7 = Ci.b();
      Ci.c(Ci.J, var7);
      Ci.a(Ci.J, var5, Ci.K);
      afT.f("Expand VBO");
      Ci.c(Ci.J, 0);
      Ci.c(Ci.L, this.a);
      Ci.c(Ci.M, var7);
      Ci.a(Ci.L, Ci.M, 0L, 0L, var3);
      afT.f("Copy VBO: " + var5);
      Ci.c(Ci.L, 0);
      Ci.c(Ci.M, 0);
      Ci.f(this.a);
      Bx.a(this.a);
      Bx.a(this.b);
      this.a = Bx.a(var2 << 2);
      this.b = Bx.a(var2 << 2);
      this.a = this.a.asIntBuffer();
      this.b = this.b.asIntBuffer();
      this.a = var7;
      this.b = var2;
   }

   public void a() {
      Ci.c(Ci.J, this.a);
   }

   public void a(int var1, ajW var2) {
      if (this.e != var1) {
         if (this.a.position() > 0) {
            throw new IllegalArgumentException("Mixed region draw modes: " + this.e + " != " + var1);
         }

         this.e = var1;
      }

      this.a.put(var2.a());
      this.b.put(var2.b());
   }

   public void a(Cy var1) {
      this.a();
      var1.a();
      this.a.flip();
      this.b.flip();
      By.a(this.e, this.a, this.b);
      this.a.limit(this.a.capacity());
      this.b.limit(this.b.capacity());
      if (this.c > this.d * 11 / 10) {
         this.a(1);
      }

   }

   public void b() {
      Ci.c(Ci.J, 0);
   }

   public void c() {
      if (this.a >= 0) {
         Ci.f(this.a);
         this.a = -1;
         Bx.a(this.a);
         Bx.a(this.b);
      }

   }

   private long a(int var1) {
      return (long)var1 * (long)this.f;
   }

   private int a(long var1) {
      return (int)(var1 / (long)this.f);
   }

   public int a() {
      return this.c;
   }
}
