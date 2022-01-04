public final class amU {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   private final byte[] a;
   private final int e;

   amU(byte[] var1, int var2) {
      this.a = var1;
      this.e = var2;
   }

   public int a() {
      return this.a[this.e];
   }

   public int a(int var1) {
      return this.a[this.e + 2 * var1 + 1];
   }

   public int b(int var1) {
      return this.a[this.e + 2 * var1 + 2];
   }

   public static amU a(String var0) {
      if (var0 != null && var0.length() != 0) {
         int var1 = var0.length();
         ams var2 = new ams(var1);
         var2.a(0);
         int var3 = 0;

         while(true) {
            while(true) {
               while(true) {
                  while(var3 < var1) {
                     char var4 = var0.charAt(var3++);
                     if (var4 != '[') {
                        if (var4 != '.') {
                           if (var4 != '*') {
                              if (var4 < '0' || var4 > '9') {
                                 throw new IllegalArgumentException();
                              }

                              int var5;
                              for(var5 = var4 - 48; var3 < var1; var5 = var5 * 10 + var4 - 48) {
                                 var4 = var0.charAt(var3++);
                                 if (var4 < '0' || var4 > '9') {
                                    if (var4 != ';') {
                                       throw new IllegalArgumentException();
                                    }
                                    break;
                                 }
                              }

                              var2.a(3, var5);
                           } else {
                              var2.a(2, 0);
                           }
                        } else {
                           var2.a(1, 0);
                        }
                     } else {
                        var2.a(0, 0);
                     }
                  }

                  var2.a[0] = (byte)(var2.a / 2);
                  return new amU(var2.a, 0);
               }
            }
         }
      } else {
         return null;
      }
   }

   public String toString() {
      int var1 = this.a();
      StringBuilder var2 = new StringBuilder(var1 * 2);

      for(int var3 = 0; var3 < var1; ++var3) {
         switch(this.a(var3)) {
         case 0:
            var2.append('[');
            break;
         case 1:
            var2.append('.');
            break;
         case 2:
            var2.append('*');
            break;
         case 3:
            var2.append(this.b(var3)).append(';');
            break;
         default:
            throw new AssertionError();
         }
      }

      return var2.toString();
   }

   static void a(amU var0, ams var1) {
      if (var0 == null) {
         var1.a(0);
      } else {
         int var2 = var0.a[var0.e] * 2 + 1;
         var1.a(var0.a, var0.e, var2);
      }

   }
}
