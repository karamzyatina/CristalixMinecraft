public final class agI {
   public static boolean a(sw var0, agH[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            agH var3 = var1[var2];
            if (var3.a(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(int var0, int var1, agH[] var2) {
      if (var2 == null) {
         return true;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            agH var4 = var2[var3];
            if (var4.a(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(int var0, agH[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            agH var3 = var1[var2];
            if (var3.a() == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(int var0, int[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(HK var0, HK[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean a(aeu var0, aeu[] var1) {
      if (var1 == null) {
         return true;
      } else {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }
}
