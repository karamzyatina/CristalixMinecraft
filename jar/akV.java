import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public final class akv {
   int a;
   int b;
   int c;
   int d;
   boolean a;
   boolean b;
   boolean c;
   boolean d;
   long[] a = new long[10];
   int e = 0;

   public akv() {
      this.a[this.e] = 0L;
   }

   public static void a(Bh var0) {
      var0.a = new akv();
   }

   public void a(long var1) {
      ++this.e;
      this.a[this.e] = var1;
   }

   public void a() {
      this.a[this.e] = 0L;
      --this.e;
   }

   public static void a(sD var0, Bh var1) {
      nh var2 = var0.a();
      int var3;
      int var4;
      if (var0 instanceof sw) {
         sw var5 = (sw)var0;
         var3 = var5.a();
         var4 = var5.b();
      } else {
         var3 = mY.a(var2);
         var4 = var2.c(var0);
      }

      int var9 = ajZ.a(var3, var4);
      if (var9 >= 0) {
         var3 = var9;
      }

      int var6 = var2.a(var0).ordinal();
      int var7 = ((var6 & '\uffff') << 16) + (var3 & '\uffff');
      int var8 = var4 & '\uffff';
      var1.a.a(((long)var8 << 32) + (long)var7);
   }

   public static void b(Bh var0) {
      var0.a.a();
   }

   public static void c(Bh var0) {
      akv var1 = var0.a;
      Ip var2 = var0.a();
      var1.a = var2.getSize() / 4;
      var1.a = var2.hasNormal();
      var1.b = var1.a;
      var1.c = var2.hasUvOffset(0);
      var1.b = var1.a ? var2.getNormalOffset() / 4 : 0;
      var1.c = var1.c ? var2.getUvOffsetById(0) / 4 : 0;
      var1.d = 8;
   }

   public static void d(Bh var0) {
      if (var0.a == 0) {
         c(var0);
      }

   }

   public static void e(Bh var0) {
      akv var1 = var0.a;
      if (var1.a == 14) {
         if (var0.b == 7 && var0.a % 4 == 0) {
            var1.a(var0, var0.getBufferSize() - 4 * var1.a);
         }

         long var2 = var1.a[var1.e];
         int var4 = var0.getBufferSize() - 14 + 12;
         IntBuffer var5 = var0.a;
         var5.put(var4, (int)var2);
         var5.put(var4 + 1, (int)(var2 >> 32));
      }

   }

   public static void a(Bh var0, int[] var1) {
      if (var0.a == 0) {
         c(var0);
      }

      akv var2 = var0.a;
      if (var2.a == 14) {
         long var3 = var2.a[var2.e];

         for(int var5 = 12; var5 + 1 < var1.length; var5 += 14) {
            var1[var5] = (int)var3;
            var1[var5 + 1] = (int)(var3 >> 32);
         }
      }

   }

   public static void a(Bh var0, ByteBuffer var1) {
      if (var0.a == 0) {
         c(var0);
      }

      akv var2 = var0.a;
      if (var2.a == 14) {
         long var3 = var2.a[var2.e];
         int var5 = var1.limit() / 4;

         for(int var6 = 12; var6 + 1 < var5; var6 += 14) {
            int var7 = (int)var3;
            int var8 = (int)(var3 >> 32);
            var1.putInt(var6 * 4, var7);
            var1.putInt((var6 + 1) * 4, var8);
         }
      }

   }

   public static void f(Bh var0) {
      akv var1 = var0.a;
      if (var1.a == 14 && var0.b == 7 && var0.a % 4 == 0) {
         var1.a(var0, var0.getBufferSize() - 4 * var1.a);
      }

   }

   public void a(Bh var1, int var2) {
      FloatBuffer var3 = var1.a;
      IntBuffer var4 = var1.a;
      int var5 = this.a;
      int var6 = this.b;
      int var7 = this.c;
      float var8 = var3.get(var2);
      float var9 = var3.get(var2 + 1);
      float var10 = var3.get(var2 + 2);
      float var11 = var3.get(var2 + var7);
      float var12 = var3.get(var2 + var7 + 1);
      float var13 = var3.get(var2 + var5);
      float var14 = var3.get(var2 + var5 + 1);
      float var15 = var3.get(var2 + var5 + 2);
      float var16 = var3.get(var2 + var5 + var7);
      float var17 = var3.get(var2 + var5 + var7 + 1);
      float var18 = var3.get(var2 + 2 * var5);
      float var19 = var3.get(var2 + 2 * var5 + 1);
      float var20 = var3.get(var2 + 2 * var5 + 2);
      float var21 = var3.get(var2 + 2 * var5 + var7);
      float var22 = var3.get(var2 + 2 * var5 + var7 + 1);
      float var23 = var3.get(var2 + 3 * var5);
      float var24 = var3.get(var2 + 3 * var5 + 1);
      float var25 = var3.get(var2 + 3 * var5 + 2);
      float var26 = var3.get(var2 + 3 * var5 + var7);
      float var27 = var3.get(var2 + 3 * var5 + var7 + 1);
      float var28 = var18 - var8;
      float var29 = var19 - var9;
      float var30 = var20 - var10;
      float var31 = var23 - var13;
      float var32 = var24 - var14;
      float var33 = var25 - var15;
      float var34 = var29 * var33 - var32 * var30;
      float var35 = var30 * var31 - var33 * var28;
      float var36 = var28 * var32 - var31 * var29;
      float var37 = var34 * var34 + var35 * var35 + var36 * var36;
      float var38 = (double)var37 != 0.0D ? (float)(1.0D / Math.sqrt((double)var37)) : 1.0F;
      var34 *= var38;
      var35 *= var38;
      var36 *= var38;
      var28 = var13 - var8;
      var29 = var14 - var9;
      var30 = var15 - var10;
      float var39 = var16 - var11;
      float var40 = var17 - var12;
      var31 = var18 - var8;
      var32 = var19 - var9;
      var33 = var20 - var10;
      float var41 = var21 - var11;
      float var42 = var22 - var12;
      float var43 = var39 * var42 - var41 * var40;
      float var44 = var43 != 0.0F ? 1.0F / var43 : 1.0F;
      float var45 = (var42 * var28 - var40 * var31) * var44;
      float var46 = (var42 * var29 - var40 * var32) * var44;
      float var47 = (var42 * var30 - var40 * var33) * var44;
      float var48 = (var39 * var31 - var41 * var28) * var44;
      float var49 = (var39 * var32 - var41 * var29) * var44;
      float var50 = (var39 * var33 - var41 * var30) * var44;
      var37 = var45 * var45 + var46 * var46 + var47 * var47;
      var38 = (double)var37 != 0.0D ? (float)(1.0D / Math.sqrt((double)var37)) : 1.0F;
      var45 *= var38;
      var46 *= var38;
      var47 *= var38;
      var37 = var48 * var48 + var49 * var49 + var50 * var50;
      var38 = (double)var37 != 0.0D ? (float)(1.0D / Math.sqrt((double)var37)) : 1.0F;
      var48 *= var38;
      var49 *= var38;
      var50 *= var38;
      float var51 = var36 * var46 - var35 * var47;
      float var52 = var34 * var47 - var36 * var45;
      float var53 = var35 * var45 - var34 * var46;
      float var54 = var48 * var51 + var49 * var52 + var50 * var53 < 0.0F ? -1.0F : 1.0F;
      int var55 = (int)(var34 * 127.0F) & 255;
      int var56 = (int)(var35 * 127.0F) & 255;
      int var57 = (int)(var36 * 127.0F) & 255;
      int var58 = (var57 << 16) + (var56 << 8) + var55;
      var4.put(var2 + var6, var58);
      var4.put(var2 + var5 + var6, var58);
      var4.put(var2 + 2 * var5 + var6, var58);
      var4.put(var2 + 3 * var5 + var6, var58);
      int var59 = ((int)(var45 * 32767.0F) & '\uffff') + (((int)(var46 * 32767.0F) & '\uffff') << 16);
      int var60 = ((int)(var47 * 32767.0F) & '\uffff') + (((int)(var54 * 32767.0F) & '\uffff') << 16);
      var4.put(var2 + 10, var59);
      var4.put(var2 + 10 + 1, var60);
      var4.put(var2 + var5 + 10, var59);
      var4.put(var2 + var5 + 10 + 1, var60);
      var4.put(var2 + 2 * var5 + 10, var59);
      var4.put(var2 + 2 * var5 + 10 + 1, var60);
      var4.put(var2 + 3 * var5 + 10, var59);
      var4.put(var2 + 3 * var5 + 10 + 1, var60);
      float var61 = (var11 + var16 + var21 + var26) / 4.0F;
      float var62 = (var12 + var17 + var22 + var27) / 4.0F;
      var3.put(var2 + 8, var61);
      var3.put(var2 + 8 + 1, var62);
      var3.put(var2 + var5 + 8, var61);
      var3.put(var2 + var5 + 8 + 1, var62);
      var3.put(var2 + 2 * var5 + 8, var61);
      var3.put(var2 + 2 * var5 + 8 + 1, var62);
      var3.put(var2 + 3 * var5 + 8, var61);
      var3.put(var2 + 3 * var5 + 8 + 1, var62);
   }

   public static void g(Bh var0) {
      if (var0.a().hasNormal() && var0.b == 7 && var0.a % 4 == 0) {
         akv var1 = var0.a;
         c(var0);
         int var2 = var0.a * var1.a;

         for(int var3 = 0; var3 < var2; var3 += var1.a * 4) {
            var1.a(var0, var3);
         }
      }

   }

   public static void a(int var0, int var1, int var2, Bh var3) {
      if (var2 != 0) {
         Ip var4 = var3.a();
         int var5 = var4.getSize();
         if (var5 == 56) {
            ByteBuffer var6 = var3.b();
            var6.position(32);
            Lw.a(11, 2, 5126, false, var5, var6);
            var6.position(40);
            Lw.a(12, 4, 5122, false, var5, var6);
            var6.position(48);
            Lw.a(10, 3, 5122, false, var5, var6);
            var6.position(0);
            Lw.v(11);
            Lw.v(12);
            Lw.v(10);
            By.c(var0, var1, var2);
            Lw.w(11);
            Lw.w(12);
            Lw.w(10);
         } else {
            By.c(var0, var1, var2);
         }
      }

   }
}
