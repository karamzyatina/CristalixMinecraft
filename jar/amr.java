final class amR {
   final amw a;
   private final amt a;
   private int a;
   private String a;
   private int b;
   private amS[] a;
   private int c;
   private ams a;
   private int d;
   private ams b;
   private int e;
   private amS[] b;

   amR(amw var1) {
      this.a = var1;
      this.a = null;
      this.a = new amS[256];
      this.c = 1;
      this.a = new ams();
   }

   amR(amw var1, amt var2) {
      this.a = var1;
      this.a = var2;
      byte[] var3 = var2.b;
      int var4 = var2.a(1) - 1;
      int var5 = var2.f - var4;
      this.c = var2.c();
      this.a = new ams(var5);
      this.a.a(var3, var4, var5);
      this.a = new amS[this.c * 2];
      char[] var6 = new char[var2.d()];
      boolean var7 = false;

      byte var10;
      for(int var8 = 1; var8 < this.c; var8 += var10 != 5 && var10 != 6 ? 1 : 2) {
         int var9 = var2.a(var8);
         var10 = var3[var9 - 1];
         int var11;
         switch(var10) {
         case 1:
            this.a(var8, var2.b(var8, var6));
            break;
         case 2:
         case 13:
         case 14:
         default:
            throw new IllegalArgumentException();
         case 3:
         case 4:
            this.a(var8, var10, var2.d(var9));
            break;
         case 5:
         case 6:
            this.a(var8, var10, var2.a(var9));
            break;
         case 7:
         case 8:
         case 16:
         case 19:
         case 20:
            this.a(var8, var10, var2.a(var9, var6));
            break;
         case 9:
         case 10:
         case 11:
            var11 = var2.a(var2.c(var9 + 2));
            this.a(var8, var10, var2.c(var9, var6), var2.a(var11, var6), var2.a(var11 + 2, var6));
            break;
         case 12:
            this.a(var8, var2.a(var9, var6), var2.a(var9 + 2, var6));
            break;
         case 15:
            int var12 = var2.a(var2.c(var9 + 1));
            var11 = var2.a(var2.c(var12 + 2));
            this.b(var8, var2.b(var9), var2.c(var12, var6), var2.a(var11, var6), var2.a(var11 + 2, var6));
            break;
         case 17:
         case 18:
            var7 = true;
            var11 = var2.a(var2.c(var9 + 2));
            this.a(var10, var8, var2.a(var11, var6), var2.a(var11 + 2, var6), var2.c(var9));
         }
      }

      if (var7) {
         this.a(var2, var6);
      }

   }

   private void a(amt var1, char[] var2) {
      byte[] var3 = var1.b;
      int var4 = var1.b();

      int var5;
      for(var5 = var1.c(var4 - 2); var5 > 0; --var5) {
         String var6 = var1.a(var4, var2);
         if ("BootstrapMethods".equals(var6)) {
            this.d = var1.c(var4 + 6);
            break;
         }

         var4 += 6 + var1.d(var4 + 2);
      }

      if (this.d > 0) {
         var5 = var4 + 8;
         int var14 = var1.d(var4 + 2) - 2;
         this.b = new ams(var14);
         this.b.a(var3, var5, var14);
         int var7 = var5;

         for(int var8 = 0; var8 < this.d; ++var8) {
            int var9 = var7 - var5;
            int var10 = var1.c(var7);
            var7 += 2;
            int var11 = var1.c(var7);
            var7 += 2;

            int var12;
            int var13;
            for(var12 = var1.a(var10, var2).hashCode(); var11-- > 0; var12 ^= var1.a(var13, var2).hashCode()) {
               var13 = var1.c(var7);
               var7 += 2;
            }

            this.a(new amS(var8, 64, (long)var9, var12 & Integer.MAX_VALUE));
         }
      }

   }

   amt a() {
      return this.a;
   }

   int a() {
      return this.a;
   }

   String a() {
      return this.a;
   }

   int a(int var1, String var2) {
      this.a = var1;
      this.a = var2;
      return this.a(var2).v;
   }

   int b() {
      return this.c;
   }

   int c() {
      return this.a.a;
   }

   void a(ams var1) {
      var1.b(this.c).a((byte[])this.a.a, 0, this.a.a);
   }

   int d() {
      if (this.b != null) {
         this.a("BootstrapMethods");
         return 8 + this.b.a;
      } else {
         return 0;
      }
   }

   void b(ams var1) {
      if (this.b != null) {
         var1.b(this.a("BootstrapMethods")).c(this.b.a + 2).b(this.d).a((byte[])this.b.a, 0, this.b.a);
      }

   }

   private amS a(int var1) {
      return this.a[var1 % this.a.length];
   }

   private amS a(amS var1) {
      int var2;
      if (this.b > this.a.length * 3 / 4) {
         var2 = this.a.length;
         int var3 = var2 * 2 + 1;
         amS[] var4 = new amS[var3];

         amS var8;
         for(int var5 = var2 - 1; var5 >= 0; --var5) {
            for(amS var6 = this.a[var5]; var6 != null; var6 = var8) {
               int var7 = var6.y % var3;
               var8 = var6.a;
               var6.a = var4[var7];
               var4[var7] = var6;
            }
         }

         this.a = var4;
      }

      ++this.b;
      var2 = var1.y % this.a.length;
      var1.a = this.a[var2];
      return this.a[var2] = var1;
   }

   private void a(amS var1) {
      ++this.b;
      int var2 = var1.y % this.a.length;
      var1.a = this.a[var2];
      this.a[var2] = var1;
   }

   amQ a(Object var1) {
      if (var1 instanceof Integer) {
         return this.a((Integer)var1);
      } else if (var1 instanceof Byte) {
         return this.a(((Byte)var1).intValue());
      } else if (var1 instanceof Character) {
         return this.a((Character)var1);
      } else if (var1 instanceof Short) {
         return this.a(((Short)var1).intValue());
      } else if (var1 instanceof Boolean) {
         return this.a((Boolean)var1 ? 1 : 0);
      } else if (var1 instanceof Float) {
         return this.a((Float)var1);
      } else if (var1 instanceof Long) {
         return this.a((Long)var1);
      } else if (var1 instanceof Double) {
         return this.a((Double)var1);
      } else if (var1 instanceof String) {
         return this.b((String)var1);
      } else if (var1 instanceof amT) {
         amT var5 = (amT)var1;
         int var3 = var5.a();
         if (var3 == 10) {
            return this.a(var5.b());
         } else {
            return var3 == 11 ? this.c(var5.c()) : this.a(var5.c());
         }
      } else if (var1 instanceof amF) {
         amF var4 = (amF)var1;
         return this.a(var4.a(), var4.a(), var4.b(), var4.c(), var4.a());
      } else if (var1 instanceof amx) {
         amx var2 = (amx)var1;
         return this.a(var2.a(), var2.b(), var2.a(), var2.a());
      } else {
         throw new IllegalArgumentException("value " + var1);
      }
   }

   amQ a(String var1) {
      return this.a(7, var1);
   }

   amQ a(String var1, String var2, String var3) {
      return this.a(9, var1, var2, var3);
   }

   amQ a(String var1, String var2, String var3, boolean var4) {
      int var5 = var4 ? 11 : 10;
      return this.a(var5, var1, var2, var3);
   }

   private amS a(int var1, String var2, String var3, String var4) {
      int var5 = a(var1, var2, var3, var4);

      for(amS var6 = this.a(var5); var6 != null; var6 = var6.a) {
         if (var6.w == var1 && var6.y == var5 && var6.a.equals(var2) && var6.b.equals(var3) && var6.c.equals(var4)) {
            return var6;
         }
      }

      this.a.b(var1, this.a(var2).v, this.a(var3, var4));
      return this.a(new amS(this.c++, var1, var2, var3, var4, 0L, var5));
   }

   private void a(int var1, int var2, String var3, String var4, String var5) {
      this.a(new amS(var1, var2, var3, var4, var5, 0L, a(var2, var3, var4, var5)));
   }

   amQ b(String var1) {
      return this.a(8, var1);
   }

   amQ a(int var1) {
      return this.a(3, var1);
   }

   amQ a(float var1) {
      return this.a(4, Float.floatToRawIntBits(var1));
   }

   private amQ a(int var1, int var2) {
      int var3 = b(var1, var2);

      for(amS var4 = this.a(var3); var4 != null; var4 = var4.a) {
         if (var4.w == var1 && var4.y == var3 && var4.a == (long)var2) {
            return var4;
         }
      }

      this.a.a(var1).c(var2);
      return this.a(new amS(this.c++, var1, (long)var2, var3));
   }

   private void a(int var1, int var2, int var3) {
      this.a(new amS(var1, var2, (long)var3, b(var2, var3)));
   }

   amQ a(long var1) {
      return this.a(5, var1);
   }

   amQ a(double var1) {
      return this.a(6, Double.doubleToRawLongBits(var1));
   }

   private amQ a(int var1, long var2) {
      int var4 = a(var1, var2);

      for(amS var5 = this.a(var4); var5 != null; var5 = var5.a) {
         if (var5.w == var1 && var5.y == var4 && var5.a == var2) {
            return var5;
         }
      }

      int var6 = this.c;
      this.a.a(var1).a(var2);
      this.c += 2;
      return this.a(new amS(var6, var1, var2, var4));
   }

   private void a(int var1, int var2, long var3) {
      this.a(new amS(var1, var2, var3, a(var2, var3)));
   }

   int a(String var1, String var2) {
      boolean var3 = true;
      int var4 = a(12, var1, var2);

      for(amS var5 = this.a(var4); var5 != null; var5 = var5.a) {
         if (var5.w == 12 && var5.y == var4 && var5.b.equals(var1) && var5.c.equals(var2)) {
            return var5.v;
         }
      }

      this.a.b(12, this.a(var1), this.a(var2));
      return this.a(new amS(this.c++, 12, var1, var2, var4)).v;
   }

   private void a(int var1, String var2, String var3) {
      boolean var4 = true;
      this.a(new amS(var1, 12, var2, var3, a(12, var2, var3)));
   }

   int a(String var1) {
      int var2 = b(1, var1);

      for(amS var3 = this.a(var2); var3 != null; var3 = var3.a) {
         if (var3.w == 1 && var3.y == var2 && var3.c.equals(var1)) {
            return var3.v;
         }
      }

      this.a.a(1).a(var1);
      return this.a(new amS(this.c++, 1, var1, var2)).v;
   }

   private void a(int var1, String var2) {
      this.a(new amS(var1, 1, var2, b(1, var2)));
   }

   amQ a(int var1, String var2, String var3, String var4, boolean var5) {
      boolean var6 = true;
      int var7 = a(15, var2, var3, var4, var1);

      for(amS var8 = this.a(var7); var8 != null; var8 = var8.a) {
         if (var8.w == 15 && var8.y == var7 && var8.a == (long)var1 && var8.a.equals(var2) && var8.b.equals(var3) && var8.c.equals(var4)) {
            return var8;
         }
      }

      if (var1 <= 4) {
         this.a.a(15, var1, this.a(var2, var3, var4).v);
      } else {
         this.a.a(15, var1, this.a(var2, var3, var4, var5).v);
      }

      return this.a(new amS(this.c++, 15, var2, var3, var4, (long)var1, var7));
   }

   private void b(int var1, int var2, String var3, String var4, String var5) {
      boolean var6 = true;
      int var7 = a(15, var3, var4, var5, var2);
      this.a(new amS(var1, 15, var3, var4, var5, (long)var2, var7));
   }

   amQ c(String var1) {
      return this.a(16, var1);
   }

   amQ a(String var1, String var2, amF var3, Object... var4) {
      amQ var5 = this.a(var3, var4);
      return this.a(17, var1, var2, var5.v);
   }

   amQ b(String var1, String var2, amF var3, Object... var4) {
      amQ var5 = this.a(var3, var4);
      return this.a(18, var1, var2, var5.v);
   }

   private amQ a(int var1, String var2, String var3, int var4) {
      int var5 = a(var1, var2, var3, var4);

      for(amS var6 = this.a(var5); var6 != null; var6 = var6.a) {
         if (var6.w == var1 && var6.y == var5 && var6.a == (long)var4 && var6.b.equals(var2) && var6.c.equals(var3)) {
            return var6;
         }
      }

      this.a.b(var1, var4, this.a(var2, var3));
      return this.a(new amS(this.c++, var1, (String)null, var2, var3, (long)var4, var5));
   }

   private void a(int var1, int var2, String var3, String var4, int var5) {
      int var6 = a(var1, var3, var4, var5);
      this.a(new amS(var2, var1, (String)null, var3, var4, (long)var5, var6));
   }

   amQ d(String var1) {
      return this.a(19, var1);
   }

   amQ e(String var1) {
      return this.a(20, var1);
   }

   private amQ a(int var1, String var2) {
      int var3 = b(var1, var2);

      for(amS var4 = this.a(var3); var4 != null; var4 = var4.a) {
         if (var4.w == var1 && var4.y == var3 && var4.c.equals(var2)) {
            return var4;
         }
      }

      this.a.b(var1, this.a(var2));
      return this.a(new amS(this.c++, var1, var2, var3));
   }

   private void a(int var1, int var2, String var3) {
      this.a(new amS(var1, var2, var3, b(var2, var3)));
   }

   amQ a(amF var1, Object... var2) {
      ams var3 = this.b;
      if (var3 == null) {
         var3 = this.b = new ams();
      }

      int var4 = var2.length;
      int[] var5 = new int[var4];

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5[var6] = this.a(var2[var6]).v;
      }

      var6 = var3.a;
      var3.b(this.a(var1.a(), var1.a(), var1.b(), var1.c(), var1.a()).v);
      var3.b(var4);

      int var7;
      for(var7 = 0; var7 < var4; ++var7) {
         var3.b(var5[var7]);
      }

      var7 = var3.a - var6;
      int var8 = var1.hashCode();
      Object[] var9 = var2;
      int var10 = var2.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         Object var12 = var9[var11];
         var8 ^= var12.hashCode();
      }

      var8 &= Integer.MAX_VALUE;
      return this.a(var6, var7, var8);
   }

   private amQ a(int var1, int var2, int var3) {
      byte[] var4 = this.b.a;

      for(amS var5 = this.a(var3); var5 != null; var5 = var5.a) {
         if (var5.w == 64 && var5.y == var3) {
            int var6 = (int)var5.a;
            boolean var7 = true;

            for(int var8 = 0; var8 < var2; ++var8) {
               if (var4[var1 + var8] != var4[var6 + var8]) {
                  var7 = false;
                  break;
               }
            }

            if (var7) {
               this.b.a = var1;
               return var5;
            }
         }
      }

      return this.a(new amS(this.d++, 64, (long)var1, var3));
   }

   amQ b(int var1) {
      return this.b[var1];
   }

   int b(String var1) {
      int var2 = b(128, var1);

      for(amS var3 = this.a(var2); var3 != null; var3 = var3.a) {
         if (var3.w == 128 && var3.y == var2 && var3.c.equals(var1)) {
            return var3.v;
         }
      }

      return this.a(new amS(this.e, 128, var1, var2));
   }

   int a(String var1, int var2) {
      int var3 = a(129, var1, var2);

      for(amS var4 = this.a(var3); var4 != null; var4 = var4.a) {
         if (var4.w == 129 && var4.y == var3 && var4.a == (long)var2 && var4.c.equals(var1)) {
            return var4.v;
         }
      }

      return this.a(new amS(this.e, 129, var1, (long)var2, var3));
   }

   int a(int var1, int var2) {
      long var3 = var1 < var2 ? (long)var1 | (long)var2 << 32 : (long)var2 | (long)var1 << 32;
      int var5 = b(130, var1 + var2);

      for(amS var6 = this.a(var5); var6 != null; var6 = var6.a) {
         if (var6.w == 130 && var6.y == var5 && var6.a == var3) {
            return var6.x;
         }
      }

      String var7 = this.b[var1].c;
      String var8 = this.b[var2].c;
      int var9 = this.b(this.a.a(var7, var8));
      this.a(new amS(this.e, 130, var3, var5)).x = var9;
      return var9;
   }

   private int a(amS var1) {
      if (this.b == null) {
         this.b = new amS[16];
      }

      if (this.e == this.b.length) {
         amS[] var2 = new amS[2 * this.b.length];
         System.arraycopy(this.b, 0, var2, 0, this.b.length);
         this.b = var2;
      }

      this.b[this.e++] = var1;
      return this.a(var1).v;
   }

   private static int b(int var0, int var1) {
      return Integer.MAX_VALUE & var0 + var1;
   }

   private static int a(int var0, long var1) {
      return Integer.MAX_VALUE & var0 + (int)var1 + (int)(var1 >>> 32);
   }

   private static int b(int var0, String var1) {
      return Integer.MAX_VALUE & var0 + var1.hashCode();
   }

   private static int a(int var0, String var1, int var2) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() + var2;
   }

   private static int a(int var0, String var1, String var2) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode();
   }

   private static int a(int var0, String var1, String var2, int var3) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode() * (var3 + 1);
   }

   private static int a(int var0, String var1, String var2, String var3) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode();
   }

   private static int a(int var0, String var1, String var2, String var3, int var4) {
      return Integer.MAX_VALUE & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode() * var4;
   }
}
