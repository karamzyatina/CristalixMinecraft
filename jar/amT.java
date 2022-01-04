import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class amt {
   public static final int a = 1;
   public static final int b = 2;
   public static final int c = 4;
   public static final int d = 8;
   static final int e = 256;
   private static final int g = 4096;
   @Deprecated
   public final byte[] a;
   public final int f;
   final byte[] b;
   private final int[] a;
   private final String[] a;
   private final amx[] a;
   private final int[] b;
   private final int h;

   public amt(byte[] var1) {
      this(var1, 0, var1.length);
   }

   public amt(byte[] var1, int var2, int var3) {
      this(var1, var2, true);
   }

   amt(byte[] var1, int var2, boolean var3) {
      this.b = var1;
      this.a = var1;
      if (var3 && this.a(var2 + 6) > 61) {
         throw new IllegalArgumentException("Unsupported class file major version " + this.a(var2 + 6));
      } else {
         int var4 = this.c(var2 + 8);
         this.a = new int[var4];
         this.a = new String[var4];
         int var5 = 1;
         int var6 = var2 + 10;
         int var7 = 0;
         boolean var8 = false;

         boolean var9;
         int var10;
         for(var9 = false; var5 < var4; var6 += var10) {
            this.a[var5++] = var6 + 1;
            switch(var1[var6]) {
            case 1:
               var10 = 3 + this.c(var6 + 1);
               if (var10 > var7) {
                  var7 = var10;
               }
               break;
            case 2:
            case 13:
            case 14:
            default:
               throw new IllegalArgumentException();
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 12:
               var10 = 5;
               break;
            case 5:
            case 6:
               var10 = 9;
               ++var5;
               break;
            case 7:
            case 8:
            case 16:
            case 19:
            case 20:
               var10 = 3;
               break;
            case 15:
               var10 = 4;
               break;
            case 17:
               var10 = 5;
               var8 = true;
               var9 = true;
               break;
            case 18:
               var10 = 5;
               var8 = true;
            }
         }

         this.h = var7;
         this.f = var6;
         this.a = var9 ? new amx[var4] : null;
         this.b = var8 ? this.a(var7) : null;
      }
   }

   public amt(InputStream var1) {
      this(a(var1, false));
   }

   public amt(String var1) {
      this(a(ClassLoader.getSystemResourceAsStream(var1.replace('.', '/') + ".class"), true));
   }

   private static byte[] a(InputStream var0, boolean var1) {
      if (var0 == null) {
         throw new IOException("Class not found");
      } else {
         byte[] var5;
         try {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();

            try {
               byte[] var3 = new byte[4096];

               int var4;
               while((var4 = var0.read(var3, 0, var3.length)) != -1) {
                  var2.write(var3, 0, var4);
               }

               var2.flush();
               var5 = var2.toByteArray();
            } catch (Throwable var11) {
               try {
                  var2.close();
               } catch (Throwable var10) {
               }

               throw var11;
            }

            var2.close();
         } finally {
            if (var1) {
               var0.close();
            }

         }

         return var5;
      }
   }

   public int a() {
      return this.c(this.f);
   }

   public String a() {
      return this.c(this.f + 2, new char[this.h]);
   }

   public String b() {
      return this.c(this.f + 4, new char[this.h]);
   }

   public String[] a() {
      int var1 = this.f + 6;
      int var2 = this.c(var1);
      String[] var3 = new String[var2];
      if (var2 > 0) {
         char[] var4 = new char[this.h];

         for(int var5 = 0; var5 < var2; ++var5) {
            var1 += 2;
            var3[var5] = this.c(var1, var4);
         }
      }

      return var3;
   }

   public void a(amv var1, int var2) {
      this.a(var1, new amq[0], var2);
   }

   public void a(amv var1, amq[] var2, int var3) {
      amz var4 = new amz();
      var4.a = var2;
      var4.a = var3;
      var4.a = new char[this.h];
      char[] var5 = var4.a;
      int var6 = this.f;
      int var7 = this.c(var6);
      String var8 = this.c(var6 + 2, var5);
      String var9 = this.c(var6 + 4, var5);
      String[] var10 = new String[this.c(var6 + 6)];
      var6 += 8;

      int var11;
      for(var11 = 0; var11 < var10.length; ++var11) {
         var10[var11] = this.c(var6, var5);
         var6 += 2;
      }

      var11 = 0;
      int var12 = 0;
      String var13 = null;
      String var14 = null;
      String var15 = null;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      String var22 = null;
      String var23 = null;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      amq var27 = null;
      int var28 = this.b();

      int var29;
      for(var29 = this.c(var28 - 2); var29 > 0; --var29) {
         String var30 = this.a(var28, var5);
         int var31 = this.d(var28 + 2);
         var28 += 6;
         if ("SourceFile".equals(var30)) {
            var14 = this.a(var28, var5);
         } else if ("InnerClasses".equals(var30)) {
            var11 = var28;
         } else if ("EnclosingMethod".equals(var30)) {
            var12 = var28;
         } else if ("NestHost".equals(var30)) {
            var23 = this.c(var28, var5);
         } else if ("NestMembers".equals(var30)) {
            var24 = var28;
         } else if ("PermittedSubclasses".equals(var30)) {
            var25 = var28;
         } else if ("Signature".equals(var30)) {
            var13 = this.a(var28, var5);
         } else if ("RuntimeVisibleAnnotations".equals(var30)) {
            var16 = var28;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var30)) {
            var18 = var28;
         } else if ("Deprecated".equals(var30)) {
            var7 |= 131072;
         } else if ("Synthetic".equals(var30)) {
            var7 |= 4096;
         } else if ("SourceDebugExtension".equals(var30)) {
            if (var31 > this.b.length - var28) {
               throw new IllegalArgumentException();
            }

            var15 = this.a(var28, var31, new char[var31]);
         } else if ("RuntimeInvisibleAnnotations".equals(var30)) {
            var17 = var28;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var30)) {
            var19 = var28;
         } else if ("Record".equals(var30)) {
            var26 = var28;
            var7 |= 65536;
         } else if ("Module".equals(var30)) {
            var20 = var28;
         } else if ("ModuleMainClass".equals(var30)) {
            var22 = this.c(var28, var5);
         } else if ("ModulePackages".equals(var30)) {
            var21 = var28;
         } else if (!"BootstrapMethods".equals(var30)) {
            amq var32 = this.a(var2, var30, var28, var31, var5, -1, (amH[])null);
            var32.a = var27;
            var27 = var32;
         }

         var28 += var31;
      }

      var1.a(this.d(this.a[1] - 7), var7, var8, var13, var9, var10);
      if ((var3 & 2) == 0 && (var14 != null || var15 != null)) {
         var1.a(var14, var15);
      }

      if (var20 != 0) {
         this.a(var1, var4, var20, var21, var22);
      }

      if (var23 != null) {
         var1.a(var23);
      }

      int var34;
      String var35;
      if (var12 != 0) {
         String var33 = this.c(var12, var5);
         var34 = this.c(var12 + 2);
         var35 = var34 == 0 ? null : this.a(this.a[var34], var5);
         String var36 = var34 == 0 ? null : this.a(this.a[var34] + 2, var5);
         var1.a(var33, var35, var36);
      }

      if (var16 != 0) {
         var29 = this.c(var16);

         for(var34 = var16 + 2; var29-- > 0; var34 = this.a(var1.a(var35, true), var34, true, var5)) {
            var35 = this.a(var34, var5);
            var34 += 2;
         }
      }

      if (var17 != 0) {
         var29 = this.c(var17);

         for(var34 = var17 + 2; var29-- > 0; var34 = this.a(var1.a(var35, false), var34, true, var5)) {
            var35 = this.a(var34, var5);
            var34 += 2;
         }
      }

      if (var18 != 0) {
         var29 = this.c(var18);

         for(var34 = var18 + 2; var29-- > 0; var34 = this.a(var1.a(var4.c, var4.a, var35, true), var34, true, var5)) {
            var34 = this.a(var4, var34);
            var35 = this.a(var34, var5);
            var34 += 2;
         }
      }

      if (var19 != 0) {
         var29 = this.c(var19);

         for(var34 = var19 + 2; var29-- > 0; var34 = this.a(var1.a(var4.c, var4.a, var35, false), var34, true, var5)) {
            var34 = this.a(var4, var34);
            var35 = this.a(var34, var5);
            var34 += 2;
         }
      }

      while(var27 != null) {
         amq var37 = var27.a;
         var27.a = null;
         var1.a(var27);
         var27 = var37;
      }

      if (var24 != 0) {
         var29 = this.c(var24);

         for(var34 = var24 + 2; var29-- > 0; var34 += 2) {
            var1.b(this.c(var34, var5));
         }
      }

      if (var25 != 0) {
         var29 = this.c(var25);

         for(var34 = var25 + 2; var29-- > 0; var34 += 2) {
            var1.c(this.c(var34, var5));
         }
      }

      if (var11 != 0) {
         var29 = this.c(var11);

         for(var34 = var11 + 2; var29-- > 0; var34 += 8) {
            var1.a(this.c(var34, var5), this.c(var34 + 2, var5), this.a(var34 + 4, var5), this.c(var34 + 6));
         }
      }

      if (var26 != 0) {
         var29 = this.c(var26);

         for(var26 += 2; var29-- > 0; var26 = this.a(var1, var4, var26)) {
         }
      }

      var29 = this.c(var6);

      for(var6 += 2; var29-- > 0; var6 = this.b(var1, var4, var6)) {
      }

      var34 = this.c(var6);

      for(var6 += 2; var34-- > 0; var6 = this.c(var1, var4, var6)) {
      }

      var1.a();
   }

   private void a(amv var1, amz var2, int var3, int var4, String var5) {
      char[] var6 = var2.a;
      String var8 = this.d(var3, var6);
      int var9 = this.c(var3 + 2);
      String var10 = this.a(var3 + 4, var6);
      int var7 = var3 + 6;
      amL var11 = var1.a(var8, var9, var10);
      if (var11 != null) {
         if (var5 != null) {
            var11.a(var5);
         }

         int var12;
         int var13;
         if (var4 != 0) {
            var12 = this.c(var4);

            for(var13 = var4 + 2; var12-- > 0; var13 += 2) {
               var11.b(this.e(var13, var6));
            }
         }

         var12 = this.c(var7);
         var7 += 2;

         int var14;
         String var15;
         while(var12-- > 0) {
            String var21 = this.d(var7, var6);
            var14 = this.c(var7 + 2);
            var15 = this.a(var7 + 4, var6);
            var7 += 6;
            var11.a(var21, var14, var15);
         }

         var13 = this.c(var7);

         int var16;
         String[] var17;
         int var18;
         String var22;
         int var23;
         for(var7 += 2; var13-- > 0; var11.a(var22, var23, var17)) {
            var22 = this.e(var7, var6);
            var23 = this.c(var7 + 2);
            var16 = this.c(var7 + 4);
            var7 += 6;
            var17 = null;
            if (var16 != 0) {
               var17 = new String[var16];

               for(var18 = 0; var18 < var16; ++var18) {
                  var17[var18] = this.d(var7, var6);
                  var7 += 2;
               }
            }
         }

         var14 = this.c(var7);

         String[] var26;
         for(var7 += 2; var14-- > 0; var11.b(var15, var16, var26)) {
            var15 = this.e(var7, var6);
            var16 = this.c(var7 + 2);
            int var24 = this.c(var7 + 4);
            var7 += 6;
            var26 = null;
            if (var24 != 0) {
               var26 = new String[var24];

               for(int var19 = 0; var19 < var24; ++var19) {
                  var26[var19] = this.d(var7, var6);
                  var7 += 2;
               }
            }
         }

         var23 = this.c(var7);

         for(var7 += 2; var23-- > 0; var7 += 2) {
            var11.c(this.c(var7, var6));
         }

         var16 = this.c(var7);
         var7 += 2;

         while(var16-- > 0) {
            String var25 = this.c(var7, var6);
            var18 = this.c(var7 + 2);
            var7 += 4;
            String[] var27 = new String[var18];

            for(int var20 = 0; var20 < var18; ++var20) {
               var27[var20] = this.c(var7, var6);
               var7 += 2;
            }

            var11.a(var25, var27);
         }

         var11.a();
      }
   }

   private int a(amv var1, amz var2, int var3) {
      char[] var4 = var2.a;
      String var6 = this.a(var3, var4);
      String var7 = this.a(var3 + 2, var4);
      int var5 = var3 + 4;
      String var8 = null;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      amq var13 = null;
      int var14 = this.c(var5);

      int var16;
      for(var5 += 2; var14-- > 0; var5 += var16) {
         String var15 = this.a(var5, var4);
         var16 = this.d(var5 + 2);
         var5 += 6;
         if ("Signature".equals(var15)) {
            var8 = this.a(var5, var4);
         } else if ("RuntimeVisibleAnnotations".equals(var15)) {
            var9 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var15)) {
            var11 = var5;
         } else if ("RuntimeInvisibleAnnotations".equals(var15)) {
            var10 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var15)) {
            var12 = var5;
         } else {
            amq var17 = this.a(var2.a, var15, var5, var16, var4, -1, (amH[])null);
            var17.a = var13;
            var13 = var17;
         }
      }

      amO var19 = var1.a(var6, var7, var8);
      if (var19 == null) {
         return var5;
      } else {
         String var18;
         int var20;
         if (var9 != 0) {
            var16 = this.c(var9);

            for(var20 = var9 + 2; var16-- > 0; var20 = this.a(var19.a(var18, true), var20, true, var4)) {
               var18 = this.a(var20, var4);
               var20 += 2;
            }
         }

         if (var10 != 0) {
            var16 = this.c(var10);

            for(var20 = var10 + 2; var16-- > 0; var20 = this.a(var19.a(var18, false), var20, true, var4)) {
               var18 = this.a(var20, var4);
               var20 += 2;
            }
         }

         if (var11 != 0) {
            var16 = this.c(var11);

            for(var20 = var11 + 2; var16-- > 0; var20 = this.a(var19.a(var2.c, var2.a, var18, true), var20, true, var4)) {
               var20 = this.a(var2, var20);
               var18 = this.a(var20, var4);
               var20 += 2;
            }
         }

         if (var12 != 0) {
            var16 = this.c(var12);

            for(var20 = var12 + 2; var16-- > 0; var20 = this.a(var19.a(var2.c, var2.a, var18, false), var20, true, var4)) {
               var20 = this.a(var2, var20);
               var18 = this.a(var20, var4);
               var20 += 2;
            }
         }

         while(var13 != null) {
            amq var21 = var13.a;
            var13.a = null;
            var19.a(var13);
            var13 = var21;
         }

         var19.a();
         return var5;
      }
   }

   private int b(amv var1, amz var2, int var3) {
      char[] var4 = var2.a;
      int var6 = this.c(var3);
      String var7 = this.a(var3 + 2, var4);
      String var8 = this.a(var3 + 4, var4);
      int var5 = var3 + 6;
      Object var9 = null;
      String var10 = null;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      amq var15 = null;
      int var16 = this.c(var5);

      int var18;
      int var19;
      for(var5 += 2; var16-- > 0; var5 += var18) {
         String var17 = this.a(var5, var4);
         var18 = this.d(var5 + 2);
         var5 += 6;
         if ("ConstantValue".equals(var17)) {
            var19 = this.c(var5);
            var9 = var19 == 0 ? null : this.a(var19, var4);
         } else if ("Signature".equals(var17)) {
            var10 = this.a(var5, var4);
         } else if ("Deprecated".equals(var17)) {
            var6 |= 131072;
         } else if ("Synthetic".equals(var17)) {
            var6 |= 4096;
         } else if ("RuntimeVisibleAnnotations".equals(var17)) {
            var11 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var17)) {
            var13 = var5;
         } else if ("RuntimeInvisibleAnnotations".equals(var17)) {
            var12 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var17)) {
            var14 = var5;
         } else {
            amq var22 = this.a(var2.a, var17, var5, var18, var4, -1, (amH[])null);
            var22.a = var15;
            var15 = var22;
         }
      }

      amC var21 = var1.a(var6, var7, var8, var10, var9);
      if (var21 == null) {
         return var5;
      } else {
         String var20;
         if (var11 != 0) {
            var18 = this.c(var11);

            for(var19 = var11 + 2; var18-- > 0; var19 = this.a(var21.a(var20, true), var19, true, var4)) {
               var20 = this.a(var19, var4);
               var19 += 2;
            }
         }

         if (var12 != 0) {
            var18 = this.c(var12);

            for(var19 = var12 + 2; var18-- > 0; var19 = this.a(var21.a(var20, false), var19, true, var4)) {
               var20 = this.a(var19, var4);
               var19 += 2;
            }
         }

         if (var13 != 0) {
            var18 = this.c(var13);

            for(var19 = var13 + 2; var18-- > 0; var19 = this.a(var21.a(var2.c, var2.a, var20, true), var19, true, var4)) {
               var19 = this.a(var2, var19);
               var20 = this.a(var19, var4);
               var19 += 2;
            }
         }

         if (var14 != 0) {
            var18 = this.c(var14);

            for(var19 = var14 + 2; var18-- > 0; var19 = this.a(var21.a(var2.c, var2.a, var20, false), var19, true, var4)) {
               var19 = this.a(var2, var19);
               var20 = this.a(var19, var4);
               var19 += 2;
            }
         }

         while(var15 != null) {
            amq var23 = var15.a;
            var15.a = null;
            var21.a(var15);
            var15 = var23;
         }

         var21.a();
         return var5;
      }
   }

   private int c(amv var1, amz var2, int var3) {
      char[] var4 = var2.a;
      var2.b = this.c(var3);
      var2.a = this.a(var3 + 2, var4);
      var2.b = this.a(var3 + 4, var4);
      int var5 = var3 + 6;
      int var6 = 0;
      int var7 = 0;
      String[] var8 = null;
      boolean var9 = false;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      amq var19 = null;
      int var20 = this.c(var5);

      int var22;
      int var27;
      for(var5 += 2; var20-- > 0; var5 += var22) {
         String var21 = this.a(var5, var4);
         var22 = this.d(var5 + 2);
         var5 += 6;
         if ("Code".equals(var21)) {
            if ((var2.a & 1) == 0) {
               var6 = var5;
            }
         } else if ("Exceptions".equals(var21)) {
            var7 = var5;
            var8 = new String[this.c(var5)];
            var27 = var5 + 2;

            for(int var24 = 0; var24 < var8.length; ++var24) {
               var8[var24] = this.c(var27, var4);
               var27 += 2;
            }
         } else if ("Signature".equals(var21)) {
            var10 = this.c(var5);
         } else if ("Deprecated".equals(var21)) {
            var2.b |= 131072;
         } else if ("RuntimeVisibleAnnotations".equals(var21)) {
            var11 = var5;
         } else if ("RuntimeVisibleTypeAnnotations".equals(var21)) {
            var15 = var5;
         } else if ("AnnotationDefault".equals(var21)) {
            var17 = var5;
         } else if ("Synthetic".equals(var21)) {
            var9 = true;
            var2.b |= 4096;
         } else if ("RuntimeInvisibleAnnotations".equals(var21)) {
            var12 = var5;
         } else if ("RuntimeInvisibleTypeAnnotations".equals(var21)) {
            var16 = var5;
         } else if ("RuntimeVisibleParameterAnnotations".equals(var21)) {
            var13 = var5;
         } else if ("RuntimeInvisibleParameterAnnotations".equals(var21)) {
            var14 = var5;
         } else if ("MethodParameters".equals(var21)) {
            var18 = var5;
         } else {
            amq var23 = this.a(var2.a, var21, var5, var22, var4, -1, (amH[])null);
            var23.a = var19;
            var19 = var23;
         }
      }

      amJ var25 = var1.a(var2.b, var2.a, var2.b, var10 == 0 ? null : this.b(var10, var4), var8);
      if (var25 == null) {
         return var5;
      } else {
         if (var25 instanceof amK) {
            amK var26 = (amK)var25;
            if (var26.a(this, var9, (var2.b & 131072) != 0, this.c(var3 + 4), var10, var7)) {
               var26.f(var3, var5 - var3);
               return var5;
            }
         }

         if (var18 != 0 && (var2.a & 2) == 0) {
            var22 = this.b(var18);

            for(var27 = var18 + 1; var22-- > 0; var27 += 4) {
               var25.b(this.a(var27, var4), this.c(var27 + 2));
            }
         }

         if (var17 != 0) {
            amo var28 = var25.a();
            this.a(var28, var17, (String)null, var4);
            if (var28 != null) {
               var28.a();
            }
         }

         String var29;
         if (var11 != 0) {
            var22 = this.c(var11);

            for(var27 = var11 + 2; var22-- > 0; var27 = this.a(var25.a(var29, true), var27, true, var4)) {
               var29 = this.a(var27, var4);
               var27 += 2;
            }
         }

         if (var12 != 0) {
            var22 = this.c(var12);

            for(var27 = var12 + 2; var22-- > 0; var27 = this.a(var25.a(var29, false), var27, true, var4)) {
               var29 = this.a(var27, var4);
               var27 += 2;
            }
         }

         if (var15 != 0) {
            var22 = this.c(var15);

            for(var27 = var15 + 2; var22-- > 0; var27 = this.a(var25.a(var2.c, var2.a, var29, true), var27, true, var4)) {
               var27 = this.a(var2, var27);
               var29 = this.a(var27, var4);
               var27 += 2;
            }
         }

         if (var16 != 0) {
            var22 = this.c(var16);

            for(var27 = var16 + 2; var22-- > 0; var27 = this.a(var25.a(var2.c, var2.a, var29, false), var27, true, var4)) {
               var27 = this.a(var2, var27);
               var29 = this.a(var27, var4);
               var27 += 2;
            }
         }

         if (var13 != 0) {
            this.a(var25, var2, var13, true);
         }

         if (var14 != 0) {
            this.a(var25, var2, var14, false);
         }

         while(var19 != null) {
            amq var30 = var19.a;
            var19.a = null;
            var25.a(var19);
            var19 = var30;
         }

         if (var6 != 0) {
            var25.a();
            this.a(var25, var2, var6);
         }

         var25.b();
         return var5;
      }
   }

   private void a(amJ var1, amz var2, int var3) {
      byte[] var5 = this.b;
      char[] var6 = var2.a;
      int var7 = this.c(var3);
      int var8 = this.c(var3 + 2);
      int var9 = this.d(var3 + 4);
      int var4 = var3 + 8;
      if (var9 > this.b.length - var4) {
         throw new IllegalArgumentException();
      } else {
         int var10 = var4;
         int var11 = var4 + var9;
         amH[] var12 = var2.a = new amH[var9 + 1];

         int var13;
         int var14;
         int var15;
         label423:
         while(var4 < var11) {
            var13 = var4 - var10;
            var14 = var5[var4] & 255;
            switch(var14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 190:
            case 191:
            case 194:
            case 195:
               ++var4;
               break;
            case 16:
            case 18:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
            case 188:
               var4 += 2;
               break;
            case 17:
            case 19:
            case 20:
            case 132:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 187:
            case 189:
            case 192:
            case 193:
               var4 += 3;
               break;
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               this.b(var13 + this.a(var4 + 1), var12);
               var4 += 3;
               break;
            case 170:
               var4 += 4 - (var13 & 3);
               this.b(var13 + this.d(var4), var12);
               var15 = this.d(var4 + 8) - this.d(var4 + 4) + 1;
               var4 += 12;

               while(true) {
                  if (var15-- <= 0) {
                     continue label423;
                  }

                  this.b(var13 + this.d(var4), var12);
                  var4 += 4;
               }
            case 171:
               var4 += 4 - (var13 & 3);
               this.b(var13 + this.d(var4), var12);
               int var16 = this.d(var4 + 4);
               var4 += 8;

               while(true) {
                  if (var16-- <= 0) {
                     continue label423;
                  }

                  this.b(var13 + this.d(var4 + 4), var12);
                  var4 += 8;
               }
            case 185:
            case 186:
               var4 += 5;
               break;
            case 196:
               switch(var5[var4 + 1] & 255) {
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 169:
                  var4 += 4;
                  continue;
               case 132:
                  var4 += 6;
                  continue;
               default:
                  throw new IllegalArgumentException();
               }
            case 197:
               var4 += 4;
               break;
            case 200:
            case 201:
            case 220:
               this.b(var13 + this.d(var4 + 1), var12);
               var4 += 5;
               break;
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
               this.b(var13 + this.c(var4 + 1), var12);
               var4 += 3;
               break;
            default:
               throw new IllegalArgumentException();
            }
         }

         var13 = this.c(var4);
         var4 += 2;

         while(var13-- > 0) {
            amH var41 = this.b(this.c(var4), var12);
            amH var42 = this.b(this.c(var4 + 2), var12);
            amH var43 = this.b(this.c(var4 + 4), var12);
            String var17 = this.a(this.a[this.c(var4 + 6)], var6);
            var4 += 8;
            var1.a(var41, var42, var43, var17);
         }

         var14 = 0;
         var15 = 0;
         boolean var44 = true;
         int var45 = 0;
         int var18 = 0;
         int[] var19 = null;
         int[] var20 = null;
         amq var21 = null;
         int var22 = this.c(var4);

         int var24;
         int var26;
         int var27;
         int var47;
         for(var4 += 2; var22-- > 0; var4 += var24) {
            String var23 = this.a(var4, var6);
            var24 = this.d(var4 + 2);
            var4 += 6;
            int var28;
            if ("LocalVariableTable".equals(var23)) {
               if ((var2.a & 2) == 0) {
                  var45 = var4;
                  var26 = this.c(var4);

                  for(var47 = var4 + 2; var26-- > 0; var47 += 10) {
                     var27 = this.c(var47);
                     this.a(var27, var12);
                     var28 = this.c(var47 + 2);
                     this.a(var27 + var28, var12);
                  }
               }
            } else if ("LocalVariableTypeTable".equals(var23)) {
               var18 = var4;
            } else if ("LineNumberTable".equals(var23)) {
               if ((var2.a & 2) == 0) {
                  var26 = this.c(var4);
                  var47 = var4 + 2;

                  while(var26-- > 0) {
                     var27 = this.c(var47);
                     var28 = this.c(var47 + 2);
                     var47 += 4;
                     this.a(var27, var12);
                     var12[var27].a(var28);
                  }
               }
            } else if ("RuntimeVisibleTypeAnnotations".equals(var23)) {
               var19 = this.a(var1, var2, var4, true);
            } else if ("RuntimeInvisibleTypeAnnotations".equals(var23)) {
               var20 = this.a(var1, var2, var4, false);
            } else if ("StackMapTable".equals(var23)) {
               if ((var2.a & 4) == 0) {
                  var14 = var4 + 2;
                  var15 = var4 + var24;
               }
            } else if ("StackMap".equals(var23)) {
               if ((var2.a & 4) == 0) {
                  var14 = var4 + 2;
                  var15 = var4 + var24;
                  var44 = false;
               }
            } else {
               amq var25 = this.a(var2.a, var23, var4, var24, var6, var3, var12);
               var25.a = var21;
               var21 = var25;
            }
         }

         boolean var46 = (var2.a & 8) != 0;
         if (var14 != 0) {
            var2.d = -1;
            var2.e = 0;
            var2.f = 0;
            var2.g = 0;
            var2.a = new Object[var8];
            var2.h = 0;
            var2.b = new Object[var7];
            if (var46) {
               this.a(var2);
            }

            for(var24 = var14; var24 < var15 - 2; ++var24) {
               if (var5[var24] == 8) {
                  var47 = this.c(var24 + 1);
                  if (var47 >= 0 && var47 < var9 && (var5[var10 + var47] & 255) == 187) {
                     this.b(var47, var12);
                  }
               }
            }
         }

         if (var46 && (var2.a & 256) != 0) {
            var1.a(-1, var8, (Object[])null, 0, (Object[])null);
         }

         var24 = 0;
         var47 = this.a((int[])var19, 0);
         var26 = 0;
         var27 = this.a((int[])var20, 0);
         boolean var48 = false;
         int var29 = (var2.a & 256) == 0 ? 33 : 0;
         var4 = var10;

         int var32;
         String var35;
         int var52;
         int var53;
         String var55;
         String var59;
         while(var4 < var11) {
            int var30 = var4 - var10;
            amH var31 = var12[var30];
            if (var31 != null) {
               var31.a(var1, (var2.a & 2) == 0);
            }

            while(var14 != 0 && (var2.d == var30 || var2.d == -1)) {
               if (var2.d != -1) {
                  if (var44 && !var46) {
                     var1.a(var2.e, var2.g, var2.a, var2.h, var2.b);
                  } else {
                     var1.a(-1, var2.f, var2.a, var2.h, var2.b);
                  }

                  var48 = false;
               }

               if (var14 < var15) {
                  var14 = this.a(var14, var44, var46, var2);
               } else {
                  var14 = 0;
               }
            }

            if (var48) {
               if ((var2.a & 8) != 0) {
                  var1.a(256, 0, (Object[])null, 0, (Object[])null);
               }

               var48 = false;
            }

            var32 = var5[var4] & 255;
            amH var33;
            String var36;
            int var37;
            amH[] var57;
            switch(var32) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 190:
            case 191:
            case 194:
            case 195:
               var1.a(var32);
               ++var4;
               break;
            case 16:
            case 188:
               var1.a(var32, var5[var4 + 1]);
               var4 += 2;
               break;
            case 17:
               var1.a(var32, this.a(var4 + 1));
               var4 += 3;
               break;
            case 18:
               var1.a(this.a(var5[var4 + 1] & 255, var6));
               var4 += 2;
               break;
            case 19:
            case 20:
               var1.a(this.a(this.c(var4 + 1), var6));
               var4 += 3;
               break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 169:
               var1.b(var32, var5[var4 + 1] & 255);
               var4 += 2;
               break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
               var32 -= 26;
               var1.b(21 + (var32 >> 2), var32 & 3);
               ++var4;
               break;
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
               var32 -= 59;
               var1.b(54 + (var32 >> 2), var32 & 3);
               ++var4;
               break;
            case 132:
               var1.c(var5[var4 + 1] & 255, var5[var4 + 2]);
               var4 += 3;
               break;
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 198:
            case 199:
               var1.a(var32, var12[var30 + this.a(var4 + 1)]);
               var4 += 3;
               break;
            case 170:
               var4 += 4 - (var30 & 3);
               var33 = var12[var30 + this.d(var4)];
               var53 = this.d(var4 + 4);
               int var56 = this.d(var4 + 8);
               var4 += 12;
               var57 = new amH[var56 - var53 + 1];

               for(var37 = 0; var37 < var57.length; ++var37) {
                  var57[var37] = var12[var30 + this.d(var4)];
                  var4 += 4;
               }

               var1.a(var53, var56, var33, var57);
               break;
            case 171:
               var4 += 4 - (var30 & 3);
               var33 = var12[var30 + this.d(var4)];
               var53 = this.d(var4 + 4);
               var4 += 8;
               int[] var54 = new int[var53];
               var57 = new amH[var53];

               for(var37 = 0; var37 < var53; ++var37) {
                  var54[var37] = this.d(var4);
                  var57[var37] = var12[var30 + this.d(var4 + 4)];
                  var4 += 8;
               }

               var1.a(var33, var54, var57);
               break;
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
               var52 = this.a[this.c(var4 + 1)];
               var53 = this.a[this.c(var52 + 2)];
               var35 = this.c(var52, var6);
               var36 = this.a(var53, var6);
               var59 = this.a(var53 + 2, var6);
               if (var32 < 182) {
                  var1.a(var32, var35, var36, var59);
               } else {
                  boolean var60 = var5[var52 - 1] == 11;
                  var1.a(var32, var35, var36, var59, var60);
               }

               if (var32 == 185) {
                  var4 += 5;
               } else {
                  var4 += 3;
               }
               break;
            case 186:
               var52 = this.a[this.c(var4 + 1)];
               var53 = this.a[this.c(var52 + 2)];
               var35 = this.a(var53, var6);
               var36 = this.a(var53 + 2, var6);
               var37 = this.b[this.c(var52)];
               amF var38 = (amF)this.a(this.c(var37), var6);
               Object[] var39 = new Object[this.c(var37 + 2)];
               var37 += 4;

               for(int var40 = 0; var40 < var39.length; ++var40) {
                  var39[var40] = this.a(this.c(var37), var6);
                  var37 += 2;
               }

               var1.a(var35, var36, var38, var39);
               var4 += 5;
               break;
            case 187:
            case 189:
            case 192:
            case 193:
               var1.a(var32, this.c(var4 + 1, var6));
               var4 += 3;
               break;
            case 196:
               var32 = var5[var4 + 1] & 255;
               if (var32 == 132) {
                  var1.c(this.c(var4 + 2), this.a(var4 + 4));
                  var4 += 6;
               } else {
                  var1.b(var32, this.c(var4 + 2));
                  var4 += 4;
               }
               break;
            case 197:
               var1.a(this.c(var4 + 1, var6), var5[var4 + 3] & 255);
               var4 += 4;
               break;
            case 200:
            case 201:
               var1.a(var32 - var29, var12[var30 + this.d(var4 + 1)]);
               var4 += 5;
               break;
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
               var32 = var32 < 218 ? var32 - 49 : var32 - 20;
               var33 = var12[var30 + this.c(var4 + 1)];
               if (var32 != 167 && var32 != 168) {
                  var32 = var32 < 167 ? (var32 + 1 ^ 1) - 1 : var32 ^ 1;
                  amH var34 = this.b(var30 + 3, var12);
                  var1.a(var32, var34);
                  var1.a(200, (amH)var33);
                  var48 = true;
               } else {
                  var1.a(var32 + 33, var33);
               }

               var4 += 3;
               break;
            case 220:
               var1.a(200, (amH)var12[var30 + this.d(var4 + 1)]);
               var48 = true;
               var4 += 5;
               break;
            default:
               throw new AssertionError();
            }

            while(var19 != null && var24 < var19.length && var47 <= var30) {
               if (var47 == var30) {
                  var52 = this.a(var2, var19[var24]);
                  var55 = this.a(var52, var6);
                  var52 += 2;
                  this.a(var1.b(var2.c, var2.a, var55, true), var52, true, var6);
               }

               ++var24;
               var47 = this.a(var19, var24);
            }

            while(var20 != null && var26 < var20.length && var27 <= var30) {
               if (var27 == var30) {
                  var52 = this.a(var2, var20[var26]);
                  var55 = this.a(var52, var6);
                  var52 += 2;
                  this.a(var1.b(var2.c, var2.a, var55, false), var52, true, var6);
               }

               ++var26;
               var27 = this.a(var20, var26);
            }
         }

         if (var12[var9] != null) {
            var1.a(var12[var9]);
         }

         int[] var49;
         int var50;
         if (var45 != 0 && (var2.a & 2) == 0) {
            var49 = null;
            if (var18 != 0) {
               var49 = new int[this.c(var18) * 3];
               var4 = var18 + 2;

               for(var50 = var49.length; var50 > 0; var4 += 10) {
                  --var50;
                  var49[var50] = var4 + 6;
                  --var50;
                  var49[var50] = this.c(var4 + 8);
                  --var50;
                  var49[var50] = this.c(var4);
               }
            }

            var50 = this.c(var45);

            int var58;
            for(var4 = var45 + 2; var50-- > 0; var1.a(var55, var35, var59, var12[var32], var12[var32 + var52], var58)) {
               var32 = this.c(var4);
               var52 = this.c(var4 + 2);
               var55 = this.a(var4 + 4, var6);
               var35 = this.a(var4 + 6, var6);
               var58 = this.c(var4 + 8);
               var4 += 10;
               var59 = null;
               if (var49 != null) {
                  for(int var61 = 0; var61 < var49.length; var61 += 3) {
                     if (var49[var61] == var32 && var49[var61 + 1] == var58) {
                        var59 = this.a(var49[var61 + 2], var6);
                        break;
                     }
                  }
               }
            }
         }

         if (var19 != null) {
            var49 = var19;
            var50 = var19.length;

            for(var32 = 0; var32 < var50; ++var32) {
               var52 = var49[var32];
               var53 = this.b(var52);
               if (var53 == 64 || var53 == 65) {
                  var4 = this.a(var2, var52);
                  var35 = this.a(var4, var6);
                  var4 += 2;
                  this.a(var1.a(var2.c, var2.a, var2.b, var2.c, var2.a, var35, true), var4, true, var6);
               }
            }
         }

         if (var20 != null) {
            var49 = var20;
            var50 = var20.length;

            for(var32 = 0; var32 < var50; ++var32) {
               var52 = var49[var32];
               var53 = this.b(var52);
               if (var53 == 64 || var53 == 65) {
                  var4 = this.a(var2, var52);
                  var35 = this.a(var4, var6);
                  var4 += 2;
                  this.a(var1.a(var2.c, var2.a, var2.b, var2.c, var2.a, var35, false), var4, true, var6);
               }
            }
         }

         while(var21 != null) {
            amq var51 = var21.a;
            var21.a = null;
            var1.a(var21);
            var21 = var51;
         }

         var1.d(var7, var8);
      }
   }

   protected amH a(int var1, amH[] var2) {
      if (var2[var1] == null) {
         var2[var1] = new amH();
      }

      return var2[var1];
   }

   private amH b(int var1, amH[] var2) {
      amH var3 = this.a(var1, var2);
      var3.a = (short)(var3.a & -2);
      return var3;
   }

   private void a(int var1, amH[] var2) {
      if (var2[var1] == null) {
         amH var10000 = this.a(var1, var2);
         var10000.a = (short)(var10000.a | 1);
      }

   }

   private int[] a(amJ var1, amz var2, int var3, boolean var4) {
      char[] var5 = var2.a;
      int[] var7 = new int[this.c(var3)];
      int var6 = var3 + 2;

      for(int var8 = 0; var8 < var7.length; ++var8) {
         int var9;
         int var10;
         var7[var8] = var6;
         var9 = this.d(var6);
         label32:
         switch(var9 >>> 24) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 19:
         case 20:
         case 21:
         case 22:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         default:
            throw new IllegalArgumentException();
         case 16:
         case 17:
         case 18:
         case 23:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
            var6 += 3;
            break;
         case 64:
         case 65:
            var10 = this.c(var6 + 1);
            var6 += 3;

            while(true) {
               if (var10-- <= 0) {
                  break label32;
               }

               int var11 = this.c(var6);
               int var12 = this.c(var6 + 2);
               var6 += 6;
               this.b(var11, var2.a);
               this.b(var11 + var12, var2.a);
            }
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
            var6 += 4;
         }

         var10 = this.b(var6);
         if (var9 >>> 24 == 66) {
            amU var13 = var10 == 0 ? null : new amU(this.b, var6);
            var6 += 1 + 2 * var10;
            String var14 = this.a(var6, var5);
            var6 += 2;
            var6 = this.a(var1.c(var9 & -256, var13, var14, var4), var6, true, var5);
         } else {
            var6 += 3 + 2 * var10;
            var6 = this.a((amo)null, var6, true, var5);
         }
      }

      return var7;
   }

   private int a(int[] var1, int var2) {
      return var1 != null && var2 < var1.length && this.b(var1[var2]) >= 67 ? this.c(var1[var2] + 1) : -1;
   }

   private int a(amz var1, int var2) {
      int var3;
      int var4;
      int var5;
      var4 = this.d(var2);
      label26:
      switch(var4 >>> 24) {
      case 0:
      case 1:
      case 22:
         var4 &= -65536;
         var3 = var2 + 2;
         break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      default:
         throw new IllegalArgumentException();
      case 16:
      case 17:
      case 18:
      case 23:
      case 66:
         var4 &= -256;
         var3 = var2 + 3;
         break;
      case 19:
      case 20:
      case 21:
         var4 &= -16777216;
         var3 = var2 + 1;
         break;
      case 64:
      case 65:
         var4 &= -16777216;
         var5 = this.c(var2 + 1);
         var3 = var2 + 3;
         var1.b = new amH[var5];
         var1.c = new amH[var5];
         var1.a = new int[var5];
         int var6 = 0;

         while(true) {
            if (var6 >= var5) {
               break label26;
            }

            int var7 = this.c(var3);
            int var8 = this.c(var3 + 2);
            int var9 = this.c(var3 + 4);
            var3 += 6;
            var1.b[var6] = this.b(var7, var1.a);
            var1.c[var6] = this.b(var7 + var8, var1.a);
            var1.a[var6] = var9;
            ++var6;
         }
      case 67:
      case 68:
      case 69:
      case 70:
         var4 &= -16777216;
         var3 = var2 + 3;
         break;
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
         var4 &= -16776961;
         var3 = var2 + 4;
      }

      var1.c = var4;
      var5 = this.b(var3);
      var1.a = var5 == 0 ? null : new amU(this.b, var3);
      return var3 + 1 + 2 * var5;
   }

   private void a(amJ var1, amz var2, int var3, boolean var4) {
      int var5 = var3 + 1;
      int var6 = this.b[var3] & 255;
      var1.a(var6, var4);
      char[] var7 = var2.a;

      for(int var8 = 0; var8 < var6; ++var8) {
         int var9 = this.c(var5);

         String var10;
         for(var5 += 2; var9-- > 0; var5 = this.a(var1.a(var8, var10, var4), var5, true, var7)) {
            var10 = this.a(var5, var7);
            var5 += 2;
         }
      }

   }

   private int a(amo var1, int var2, boolean var3, char[] var4) {
      int var6 = this.c(var2);
      int var5 = var2 + 2;
      if (var3) {
         while(var6-- > 0) {
            String var7 = this.a(var5, var4);
            var5 = this.a(var1, var5 + 2, var7, var4);
         }
      } else {
         while(var6-- > 0) {
            var5 = this.a(var1, var5, (String)null, var4);
         }
      }

      if (var1 != null) {
         var1.a();
      }

      return var5;
   }

   private int a(amo var1, int var2, String var3, char[] var4) {
      if (var1 == null) {
         switch(this.b[var2] & 255) {
         case 64:
            return this.a((amo)null, var2 + 3, true, var4);
         case 91:
            return this.a((amo)null, var2 + 1, false, var4);
         case 101:
            return var2 + 5;
         default:
            return var2 + 3;
         }
      } else {
         int var5 = var2 + 1;
         switch(this.b[var2] & 255) {
         case 64:
            var5 = this.a(var1.a(var3, this.a(var5, var4)), var5 + 2, true, var4);
            break;
         case 65:
         case 69:
         case 71:
         case 72:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 100:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         default:
            throw new IllegalArgumentException();
         case 66:
            var1.a(var3, (Object)((byte)this.d(this.a[this.c(var5)])));
            var5 += 2;
            break;
         case 67:
            var1.a(var3, (Object)((char)this.d(this.a[this.c(var5)])));
            var5 += 2;
            break;
         case 68:
         case 70:
         case 73:
         case 74:
            var1.a(var3, this.a(this.c(var5), var4));
            var5 += 2;
            break;
         case 83:
            var1.a(var3, (Object)((short)this.d(this.a[this.c(var5)])));
            var5 += 2;
            break;
         case 90:
            var1.a(var3, (Object)(this.d(this.a[this.c(var5)]) == 0 ? Boolean.FALSE : Boolean.TRUE));
            var5 += 2;
            break;
         case 91:
            int var6 = this.c(var5);
            var5 += 2;
            if (var6 == 0) {
               return this.a(var1.a(var3), var5 - 2, false, var4);
            }

            switch(this.b[var5] & 255) {
            case 66:
               byte[] var7 = new byte[var6];

               for(int var16 = 0; var16 < var6; ++var16) {
                  var7[var16] = (byte)this.d(this.a[this.c(var5 + 1)]);
                  var5 += 3;
               }

               var1.a(var3, (Object)var7);
               return var5;
            case 67:
               char[] var18 = new char[var6];

               for(int var19 = 0; var19 < var6; ++var19) {
                  var18[var19] = (char)this.d(this.a[this.c(var5 + 1)]);
                  var5 += 3;
               }

               var1.a(var3, (Object)var18);
               return var5;
            case 68:
               double[] var22 = new double[var6];

               for(int var15 = 0; var15 < var6; ++var15) {
                  var22[var15] = Double.longBitsToDouble(this.a(this.a[this.c(var5 + 1)]));
                  var5 += 3;
               }

               var1.a(var3, (Object)var22);
               return var5;
            case 69:
            case 71:
            case 72:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            default:
               var5 = this.a(var1.a(var3), var5 - 2, false, var4);
               return var5;
            case 70:
               float[] var21 = new float[var6];

               for(int var14 = 0; var14 < var6; ++var14) {
                  var21[var14] = Float.intBitsToFloat(this.d(this.a[this.c(var5 + 1)]));
                  var5 += 3;
               }

               var1.a(var3, (Object)var21);
               return var5;
            case 73:
               int[] var11 = new int[var6];

               for(int var20 = 0; var20 < var6; ++var20) {
                  var11[var20] = this.d(this.a[this.c(var5 + 1)]);
                  var5 += 3;
               }

               var1.a(var3, (Object)var11);
               return var5;
            case 74:
               long[] var12 = new long[var6];

               for(int var13 = 0; var13 < var6; ++var13) {
                  var12[var13] = this.a(this.a[this.c(var5 + 1)]);
                  var5 += 3;
               }

               var1.a(var3, (Object)var12);
               return var5;
            case 83:
               short[] var17 = new short[var6];

               for(int var10 = 0; var10 < var6; ++var10) {
                  var17[var10] = (short)this.d(this.a[this.c(var5 + 1)]);
                  var5 += 3;
               }

               var1.a(var3, (Object)var17);
               return var5;
            case 90:
               boolean[] var8 = new boolean[var6];

               for(int var9 = 0; var9 < var6; ++var9) {
                  var8[var9] = this.d(this.a[this.c(var5 + 1)]) != 0;
                  var5 += 3;
               }

               var1.a(var3, (Object)var8);
               return var5;
            }
         case 99:
            var1.a(var3, (Object)amT.a(this.a(var5, var4)));
            var5 += 2;
            break;
         case 101:
            var1.a(var3, this.a(var5, var4), this.a(var5 + 2, var4));
            var5 += 4;
            break;
         case 115:
            var1.a(var3, (Object)this.a(var5, var4));
            var5 += 2;
         }

         return var5;
      }
   }

   private void a(amz var1) {
      String var2 = var1.b;
      Object[] var3 = var1.a;
      int var4 = 0;
      if ((var1.b & 8) == 0) {
         if ("<init>".equals(var1.a)) {
            var3[var4++] = amN.g;
         } else {
            var3[var4++] = this.c(this.f + 2, var1.a);
         }
      }

      int var5 = 1;

      while(true) {
         int var6 = var5;
         switch(var2.charAt(var5++)) {
         case 'B':
         case 'C':
         case 'I':
         case 'S':
         case 'Z':
            var3[var4++] = amN.b;
            break;
         case 'D':
            var3[var4++] = amN.d;
            break;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         default:
            var1.f = var4;
            return;
         case 'F':
            var3[var4++] = amN.c;
            break;
         case 'J':
            var3[var4++] = amN.e;
            break;
         case 'L':
            while(var2.charAt(var5) != ';') {
               ++var5;
            }

            var3[var4++] = var2.substring(var6 + 1, var5++);
            break;
         case '[':
            while(var2.charAt(var5) == '[') {
               ++var5;
            }

            if (var2.charAt(var5) == 'L') {
               ++var5;

               while(var2.charAt(var5) != ';') {
                  ++var5;
               }
            }

            int var10001 = var4++;
            ++var5;
            var3[var10001] = var2.substring(var6, var5);
         }
      }
   }

   private int a(int var1, boolean var2, boolean var3, amz var4) {
      int var5 = var1;
      char[] var6 = var4.a;
      amH[] var7 = var4.a;
      int var8;
      if (var2) {
         var5 = var1 + 1;
         var8 = this.b[var1] & 255;
      } else {
         var8 = 255;
         var4.d = -1;
      }

      var4.g = 0;
      int var9;
      if (var8 < 64) {
         var9 = var8;
         var4.e = 3;
         var4.h = 0;
      } else if (var8 < 128) {
         var9 = var8 - 64;
         var5 = this.a(var5, var4.b, 0, var6, var7);
         var4.e = 4;
         var4.h = 1;
      } else {
         if (var8 < 247) {
            throw new IllegalArgumentException();
         }

         var9 = this.c(var5);
         var5 += 2;
         if (var8 == 247) {
            var5 = this.a(var5, var4.b, 0, var6, var7);
            var4.e = 4;
            var4.h = 1;
         } else if (var8 >= 248 && var8 < 251) {
            var4.e = 2;
            var4.g = 251 - var8;
            var4.f -= var4.g;
            var4.h = 0;
         } else if (var8 == 251) {
            var4.e = 3;
            var4.h = 0;
         } else {
            int var10;
            int var11;
            if (var8 < 255) {
               var10 = var3 ? var4.f : 0;

               for(var11 = var8 - 251; var11 > 0; --var11) {
                  var5 = this.a(var5, var4.a, var10++, var6, var7);
               }

               var4.e = 1;
               var4.g = var8 - 251;
               var4.f += var4.g;
               var4.h = 0;
            } else {
               var10 = this.c(var5);
               var5 += 2;
               var4.e = 0;
               var4.g = var10;
               var4.f = var10;

               for(var11 = 0; var11 < var10; ++var11) {
                  var5 = this.a(var5, var4.a, var11, var6, var7);
               }

               var11 = this.c(var5);
               var5 += 2;
               var4.h = var11;

               for(int var12 = 0; var12 < var11; ++var12) {
                  var5 = this.a(var5, var4.b, var12, var6, var7);
               }
            }
         }
      }

      var4.d += var9 + 1;
      this.b(var4.d, var7);
      return var5;
   }

   private int a(int var1, Object[] var2, int var3, char[] var4, amH[] var5) {
      int var6 = var1 + 1;
      int var7 = this.b[var1] & 255;
      switch(var7) {
      case 0:
         var2[var3] = amN.a;
         break;
      case 1:
         var2[var3] = amN.b;
         break;
      case 2:
         var2[var3] = amN.c;
         break;
      case 3:
         var2[var3] = amN.d;
         break;
      case 4:
         var2[var3] = amN.e;
         break;
      case 5:
         var2[var3] = amN.f;
         break;
      case 6:
         var2[var3] = amN.g;
         break;
      case 7:
         var2[var3] = this.c(var6, var4);
         var6 += 2;
         break;
      case 8:
         var2[var3] = this.b(this.c(var6), var5);
         var6 += 2;
         break;
      default:
         throw new IllegalArgumentException();
      }

      return var6;
   }

   final int b() {
      int var1 = this.f + 8 + this.c(this.f + 6) * 2;
      int var2 = this.c(var1);
      var1 += 2;

      int var3;
      while(var2-- > 0) {
         var3 = this.c(var1 + 6);

         for(var1 += 8; var3-- > 0; var1 += 6 + this.d(var1 + 2)) {
         }
      }

      var3 = this.c(var1);
      var1 += 2;

      while(var3-- > 0) {
         int var4 = this.c(var1 + 6);

         for(var1 += 8; var4-- > 0; var1 += 6 + this.d(var1 + 2)) {
         }
      }

      return var1 + 2;
   }

   private int[] a(int var1) {
      char[] var2 = new char[var1];
      int var3 = this.b();

      for(int var4 = this.c(var3 - 2); var4 > 0; --var4) {
         String var5 = this.a(var3, var2);
         int var6 = this.d(var3 + 2);
         var3 += 6;
         if ("BootstrapMethods".equals(var5)) {
            int[] var7 = new int[this.c(var3)];
            int var8 = var3 + 2;

            for(int var9 = 0; var9 < var7.length; ++var9) {
               var7[var9] = var8;
               var8 += 4 + this.c(var8 + 2) * 2;
            }

            return var7;
         }

         var3 += var6;
      }

      throw new IllegalArgumentException();
   }

   private amq a(amq[] var1, String var2, int var3, int var4, char[] var5, int var6, amH[] var7) {
      amq[] var8 = var1;
      int var9 = var1.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         amq var11 = var8[var10];
         if (var11.a.equals(var2)) {
            return var11.a(this, var3, var4, var5, var6, var7);
         }
      }

      return (new amq(var2)).a(this, var3, var4, (char[])null, -1, (amH[])null);
   }

   public int c() {
      return this.a.length;
   }

   public int a(int var1) {
      return this.a[var1];
   }

   public int d() {
      return this.h;
   }

   public int b(int var1) {
      return this.b[var1] & 255;
   }

   public int c(int var1) {
      byte[] var2 = this.b;
      return (var2[var1] & 255) << 8 | var2[var1 + 1] & 255;
   }

   public short a(int var1) {
      byte[] var2 = this.b;
      return (short)((var2[var1] & 255) << 8 | var2[var1 + 1] & 255);
   }

   public int d(int var1) {
      byte[] var2 = this.b;
      return (var2[var1] & 255) << 24 | (var2[var1 + 1] & 255) << 16 | (var2[var1 + 2] & 255) << 8 | var2[var1 + 3] & 255;
   }

   public long a(int var1) {
      long var2 = (long)this.d(var1);
      long var4 = (long)this.d(var1 + 4) & 4294967295L;
      return var2 << 32 | var4;
   }

   public String a(int var1, char[] var2) {
      int var3 = this.c(var1);
      return var1 != 0 && var3 != 0 ? this.b(var3, var2) : null;
   }

   final String b(int var1, char[] var2) {
      String var3 = this.a[var1];
      if (var3 != null) {
         return var3;
      } else {
         int var4 = this.a[var1];
         return this.a[var1] = this.a(var4 + 2, this.c(var4), var2);
      }
   }

   private String a(int var1, int var2, char[] var3) {
      int var4 = var1;
      int var5 = var1 + var2;
      int var6 = 0;
      byte[] var7 = this.b;

      while(var4 < var5) {
         byte var8 = var7[var4++];
         if ((var8 & 128) == 0) {
            var3[var6++] = (char)(var8 & 127);
         } else if ((var8 & 224) == 192) {
            var3[var6++] = (char)(((var8 & 31) << 6) + (var7[var4++] & 63));
         } else {
            var3[var6++] = (char)(((var8 & 15) << 12) + ((var7[var4++] & 63) << 6) + (var7[var4++] & 63));
         }
      }

      return new String(var3, 0, var6);
   }

   private String f(int var1, char[] var2) {
      return this.a(this.a[this.c(var1)], var2);
   }

   public String c(int var1, char[] var2) {
      return this.f(var1, var2);
   }

   public String d(int var1, char[] var2) {
      return this.f(var1, var2);
   }

   public String e(int var1, char[] var2) {
      return this.f(var1, var2);
   }

   private amx a(int var1, char[] var2) {
      amx var3 = this.a[var1];
      if (var3 != null) {
         return var3;
      } else {
         int var4 = this.a[var1];
         int var5 = this.a[this.c(var4 + 2)];
         String var6 = this.a(var5, var2);
         String var7 = this.a(var5 + 2, var2);
         int var8 = this.b[this.c(var4)];
         amF var9 = (amF)this.a(this.c(var8), var2);
         Object[] var10 = new Object[this.c(var8 + 2)];
         var8 += 4;

         for(int var11 = 0; var11 < var10.length; ++var11) {
            var10[var11] = this.a(this.c(var8), var2);
            var8 += 2;
         }

         return this.a[var1] = new amx(var6, var7, var9, var10);
      }
   }

   public Object a(int var1, char[] var2) {
      int var3 = this.a[var1];
      switch(this.b[var3 - 1]) {
      case 3:
         return this.d(var3);
      case 4:
         return Float.intBitsToFloat(this.d(var3));
      case 5:
         return this.a(var3);
      case 6:
         return Double.longBitsToDouble(this.a(var3));
      case 7:
         return amT.b(this.a(var3, var2));
      case 8:
         return this.a(var3, var2);
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      default:
         throw new IllegalArgumentException();
      case 15:
         int var4 = this.b(var3);
         int var5 = this.a[this.c(var3 + 1)];
         int var6 = this.a[this.c(var5 + 2)];
         String var7 = this.c(var5, var2);
         String var8 = this.a(var6, var2);
         String var9 = this.a(var6 + 2, var2);
         boolean var10 = this.b[var5 - 1] == 11;
         return new amF(var4, var7, var8, var9, var10);
      case 16:
         return amT.c(this.a(var3, var2));
      case 17:
         return this.a(var1, var2);
      }
   }
}
