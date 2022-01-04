import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class alh {
   public static Pattern a = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
   public static Pattern b = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
   public static Pattern c = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern d = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern e = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
   public static Pattern f = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
   public static Pattern g = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*(\\w+)\\s*(\\*/.*|\\s*)");
   public static Pattern h = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
   public static Pattern i = Pattern.compile(".*deferred[0-9]*\\.fsh");
   public static Pattern j = Pattern.compile(".*composite[0-9]*\\.fsh");
   public static Pattern k = Pattern.compile(".*final\\.fsh");
   public static Pattern l = Pattern.compile("[0-7N]*");

   public static akT a(String var0) {
      Matcher var1 = a.matcher(var0);
      if (var1.matches()) {
         return new akT(1, var1.group(1), "", var0);
      } else {
         Matcher var2 = b.matcher(var0);
         if (var2.matches()) {
            return new akT(2, var2.group(1), "", var0);
         } else {
            Matcher var3 = g.matcher(var0);
            if (var3.matches()) {
               return new akT(6, var3.group(2), var3.group(3), var0);
            } else {
               Matcher var4 = c.matcher(var0);
               if (var4.matches()) {
                  return new akT(3, var4.group(1), var4.group(2), var0);
               } else {
                  Matcher var5 = d.matcher(var0);
                  if (var5.matches()) {
                     return new akT(4, var5.group(1), var5.group(2), var0);
                  } else {
                     Matcher var6 = f.matcher(var0);
                     if (var6.matches()) {
                        return new akT(5, var6.group(1), var6.group(2), var0);
                     } else {
                        Matcher var7 = h.matcher(var0);
                        if (var7.matches()) {
                           return new akT(7, var7.group(1), var7.group(2), var0);
                        } else {
                           Matcher var8 = e.matcher(var0);
                           return var8.matches() ? new akT(8, var8.group(1), var8.group(2), var0) : null;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static int a(String var0, String var1, int var2, int var3) {
      if (var0.length() != var1.length() + 1) {
         return -1;
      } else if (!var0.startsWith(var1)) {
         return -1;
      } else {
         int var4 = var0.charAt(var1.length()) - 48;
         return var4 >= var2 && var4 <= var3 ? var4 : -1;
      }
   }

   public static int a(String var0) {
      byte var1 = -1;
      switch(var0.hashCode()) {
      case -903579360:
         if (var0.equals("shadow")) {
            var1 = 0;
         }
         break;
      case 1235669239:
         if (var0.equals("watershadow")) {
            var1 = 1;
         }
      }

      switch(var1) {
      case 0:
         return 0;
      case 1:
         return 1;
      default:
         return a(var0, "shadowtex", 0, 1);
      }
   }

   public static int b(String var0) {
      byte var1 = -1;
      switch(var0.hashCode()) {
      case -1560188349:
         if (var0.equals("shadowcolor")) {
            var1 = 0;
         }
      default:
         switch(var1) {
         case 0:
            return 0;
         default:
            return a(var0, "shadowcolor", 0, 1);
         }
      }
   }

   public static int c(String var0) {
      return a(var0, "depthtex", 0, 2);
   }

   public static int d(String var0) {
      int var1 = a(var0, "gaux", 1, 4);
      return var1 > 0 ? var1 + 3 : a(var0, "colortex", 4, 7);
   }

   public static boolean a(String var0) {
      return i.matcher(var0).matches();
   }

   public static boolean b(String var0) {
      return j.matcher(var0).matches();
   }

   public static boolean c(String var0) {
      return k.matcher(var0).matches();
   }

   public static boolean d(String var0) {
      return l.matcher(var0).matches();
   }
}
