import java.util.regex.Pattern;

public final class acK {
   private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
   private static final String[][] a = new String[][]{{"\\b", "\b"}, {"\\n", "\n"}, {"\\t", "\t"}, {"\\f", "\f"}, {"\\r", "\r"}};
   private static final LS a;

   public static String a(int var0) {
      int var1 = var0 / 20;
      int var2 = var1 / 60;
      var1 %= 60;
      return var1 < 10 ? var2 + ":0" + var1 : var2 + ":" + var1;
   }

   public static String a(String var0) {
      return a.matcher(var0).replaceAll("");
   }

   public static boolean a(String var0) {
      return var0 == null || var0.length() == 0;
   }

   public static String b(String var0) {
      if (a(var0)) {
         return var0;
      } else {
         int var1 = var0.length();
         char[] var2 = new char[var1];
         int var3 = 0;
         int var4 = 0;
         boolean var5 = true;

         for(int var6 = 0; var6 < var1; ++var6) {
            char var7 = var0.charAt(var6);
            boolean var8 = Character.isWhitespace(var7);
            if (!var8) {
               var5 = false;
               var2[var3++] = var7 == 160 ? 32 : var7;
               var4 = 0;
            } else {
               if (var4 == 0 && !var5) {
                  var2[var3++] = ' ';
               }

               ++var4;
            }
         }

         if (var5) {
            return "";
         } else {
            return (new String(var2, 0, var3 - (var4 > 0 ? 1 : 0))).trim();
         }
      }
   }

   public static boolean a(CharSequence var0) {
      int var1;
      if (var0 != null && (var1 = var0.length()) != 0) {
         for(int var2 = 0; var2 < var1; ++var2) {
            if (!Character.isWhitespace(var0.charAt(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return true;
      }
   }

   public static String a(String var0, String var1, int var2) {
      if (!ami.a(var0) && !ami.a(var1)) {
         if (var2 < var0.length() && var2 >= var1.length() + 2) {
            int var3 = var2 - var1.length();
            int var4 = var3 / 2 + var3 % 2;
            int var5 = var0.length() - var3 / 2;
            return var0.substring(0, var4) + var1 + var0.substring(var5);
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static String a(String var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      } else {
         if (var2 < 0) {
            var2 += var0.length();
         }

         if (var1 < 0) {
            var1 += var0.length();
         }

         if (var2 > var0.length()) {
            var2 = var0.length();
         }

         if (var1 > var2) {
            return "";
         } else {
            if (var1 < 0) {
               var1 = 0;
            }

            if (var2 < 0) {
               var2 = 0;
            }

            return var0.substring(var1, var2);
         }
      }
   }

   public static String a(String... var0) {
      if (var0 != null && var0.length != 0) {
         int var1 = a(var0);
         if (var1 == -1) {
            return var0[0] == null ? "" : var0[0];
         } else {
            return var1 == 0 ? "" : var0[0].substring(0, var1);
         }
      } else {
         return "";
      }
   }

   public static int a(String... var0) {
      if (var0 != null && var0.length > 1) {
         boolean var1 = false;
         boolean var2 = true;
         int var3 = var0.length;
         int var4 = Integer.MAX_VALUE;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var3; ++var6) {
            if (var0[var6] == null) {
               var1 = true;
               var4 = 0;
            } else {
               var2 = false;
               int var7 = var0[var6].length();
               var4 = Math.min(var7, var4);
               var5 = Math.max(var7, var5);
            }
         }

         if (var2 || var5 == 0 && !var1) {
            return -1;
         } else if (var4 == 0) {
            return 0;
         } else {
            var6 = -1;
            String var11 = var0[0];

            for(int var8 = 0; var8 < var4; ++var8) {
               char var9 = var11.charAt(var8);

               for(int var10 = 1; var10 < var3; ++var10) {
                  if (var0[var10].charAt(var8) != var9) {
                     var6 = var8;
                     break;
                  }
               }

               if (var6 != -1) {
                  break;
               }
            }

            return var6 == -1 && var4 != var5 ? var4 : var6;
         }
      } else {
         return -1;
      }
   }

   public static String c(String var0) {
      return a.a(var0);
   }

   static {
      a = new LP(new LS[]{new LR(), new LT(), new LQ(a), new LQ(new String[][]{{"\\\\", "\\"}, {"\\\"", "\""}, {"\\'", "'"}, {"\\", ""}})});
   }
}
