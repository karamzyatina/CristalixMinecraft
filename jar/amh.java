public class amH {
   static final int a = 1;
   static final int b = 2;
   static final int c = 4;
   static final int d = 8;
   static final int e = 16;
   static final int f = 32;
   static final int g = 64;
   static final int h = 4;
   static final int i = 6;
   static final int j = -268435456;
   static final int k = 268435456;
   static final int l = 536870912;
   static final int m = 268435455;
   static final amH a = new amH();
   public Object a;
   short a;
   private short f;
   private int[] a;
   int n;
   private int[] b;
   short b;
   short c;
   short d;
   short e;
   amE a;
   amH b;
   amB a;
   amH c;

   public int a() {
      if ((this.a & 4) == 0) {
         throw new IllegalStateException("Label offset position has not been resolved yet");
      } else {
         return this.n;
      }
   }

   final amH a() {
      return this.a == null ? this : this.a.a;
   }

   final void a(int var1) {
      if (this.f == 0) {
         this.f = (short)var1;
      } else {
         if (this.a == null) {
            this.a = new int[4];
         }

         int var2 = ++this.a[0];
         if (var2 >= this.a.length) {
            int[] var3 = new int[this.a.length + 4];
            System.arraycopy(this.a, 0, var3, 0, this.a.length);
            this.a = var3;
         }

         this.a[var2] = var1;
      }

   }

   final void a(amJ var1, boolean var2) {
      var1.a(this);
      if (var2 && this.f != 0) {
         var1.b(this.f & '\uffff', this);
         if (this.a != null) {
            for(int var3 = 1; var3 <= this.a[0]; ++var3) {
               var1.b(this.a[var3], this);
            }
         }
      }

   }

   final void a(ams var1, int var2, boolean var3) {
      if ((this.a & 4) == 0) {
         if (var3) {
            this.a(var2, 536870912, var1.a);
            var1.c(-1);
         } else {
            this.a(var2, 268435456, var1.a);
            var1.b(-1);
         }
      } else if (var3) {
         var1.c(this.n - var2);
      } else {
         var1.b(this.n - var2);
      }

   }

   private void a(int var1, int var2, int var3) {
      if (this.b == null) {
         this.b = new int[6];
      }

      int var4 = this.b[0];
      if (var4 + 2 >= this.b.length) {
         int[] var5 = new int[this.b.length + 6];
         System.arraycopy(this.b, 0, var5, 0, this.b.length);
         this.b = var5;
      }

      ++var4;
      this.b[var4] = var1;
      ++var4;
      this.b[var4] = var2 | var3;
      this.b[0] = var4;
   }

   final boolean a(byte[] var1, int var2) {
      this.a = (short)(this.a | 4);
      this.n = var2;
      if (this.b == null) {
         return false;
      } else {
         boolean var3 = false;

         for(int var4 = this.b[0]; var4 > 0; var4 -= 2) {
            int var5 = this.b[var4 - 1];
            int var6 = this.b[var4];
            int var7 = var2 - var5;
            int var8 = var6 & 268435455;
            if ((var6 & -268435456) != 268435456) {
               var1[var8++] = (byte)(var7 >>> 24);
               var1[var8++] = (byte)(var7 >>> 16);
               var1[var8++] = (byte)(var7 >>> 8);
               var1[var8] = (byte)var7;
            } else {
               if (var7 < -32768 || var7 > 32767) {
                  int var9 = var1[var5] & 255;
                  if (var9 < 198) {
                     var1[var5] = (byte)(var9 + 49);
                  } else {
                     var1[var5] = (byte)(var9 + 20);
                  }

                  var3 = true;
               }

               var1[var8++] = (byte)(var7 >>> 8);
               var1[var8] = (byte)var7;
            }
         }

         return var3;
      }
   }

   final void a(short var1) {
      amH var2 = this;
      this.c = a;

      while(var2 != a) {
         amH var3 = var2;
         var2 = var2.c;
         var3.c = null;
         if (var3.e == 0) {
            var3.e = var1;
            var2 = var3.a(var2);
         }
      }

   }

   final void a(amH var1) {
      amH var2 = a;
      amH var3 = this;

      amH var4;
      for(this.c = a; var3 != a; var3 = var4.a(var3)) {
         var4 = var3;
         var3 = var3.c;
         var4.c = var2;
         var2 = var4;
         if ((var4.a & 64) != 0 && var4.e != var1.e) {
            var4.a = new amB(var4.c, var1.a.a, var4.a);
         }
      }

      while(var2 != a) {
         var4 = var2.c;
         var2.c = null;
         var2 = var4;
      }

   }

   private amH a(amH var1) {
      amH var2 = var1;

      for(amB var3 = this.a; var3 != null; var3 = var3.a) {
         boolean var4 = (this.a & 16) != 0 && var3 == this.a.a;
         if (!var4 && var3.a.c == null) {
            var3.a.c = var2;
            var2 = var3.a;
         }
      }

      return var2;
   }

   public String toString() {
      return "L" + System.identityHashCode(this);
   }
}
