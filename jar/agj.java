import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

public final class agJ {
   private String[] a = null;
   private String a = null;
   private boolean a = false;
   private int a = 0;
   private String b = null;
   private int b = 0;
   private static final Pattern a = Pattern.compile("^#[0-9a-f]{6}+$");

   public agJ(String var1, String var2) {
      String[] var3 = afT.a(var1, ".");
      this.a = (String[])((String[])Arrays.copyOfRange(var3, 0, var3.length - 1));
      this.a = var3[var3.length - 1];
      if (!var2.isEmpty() && var2.charAt(0) == '!') {
         this.a = true;
         var2 = var2.substring(1);
      }

      if (var2.startsWith("pattern:")) {
         this.a = 1;
         var2 = var2.substring("pattern:".length());
      } else if (var2.startsWith("ipattern:")) {
         this.a = 2;
         var2 = var2.substring("ipattern:".length()).toLowerCase();
      } else if (var2.startsWith("regex:")) {
         this.a = 3;
         var2 = var2.substring("regex:".length());
      } else if (var2.startsWith("iregex:")) {
         this.a = 4;
         var2 = var2.substring("iregex:".length()).toLowerCase();
      } else {
         this.a = 0;
      }

      var2 = acK.c(var2);
      if (this.a == 0 && a.matcher(var2).matches()) {
         this.b = 1;
      }

      this.b = var2;
   }

   public boolean a(VR var1) {
      if (this.a) {
         return !this.b(var1);
      } else {
         return this.b(var1);
      }
   }

   public boolean b(VR var1) {
      if (var1 == null) {
         return false;
      } else {
         Object var2 = var1;

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            String var4 = this.a[var3];
            var2 = a((VK)var2, var4);
            if (var2 == null) {
               return false;
            }
         }

         if (this.a.equals("*")) {
            return this.b((VK)var2);
         } else {
            VK var5 = a((VK)var2, this.a);
            if (var5 == null) {
               return false;
            } else if (this.a(var5)) {
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private boolean b(VK var1) {
      VK var5;
      if (var1 instanceof VR) {
         VR var2 = (VR)var1;
         Iterator var3 = var2.a().iterator();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            var5 = var2.a(var4);
            if (this.a(var5)) {
               return true;
            }
         }
      }

      if (var1 instanceof VZ) {
         VZ var6 = (VZ)var1;
         int var7 = var6.a();

         for(int var8 = 0; var8 < var7; ++var8) {
            var5 = var6.b(var8);
            if (this.a(var5)) {
               return true;
            }
         }
      }

      return false;
   }

   private static VK a(VK var0, String var1) {
      if (var0 instanceof VR) {
         VR var4 = (VR)var0;
         return var4.a(var1);
      } else if (var0 instanceof VZ) {
         VZ var2 = (VZ)var0;
         if (var1.equals("count")) {
            return new VX(var2.a());
         } else {
            int var3 = afT.a((String)var1, -1);
            return var3 >= 0 && var3 < var2.a() ? var2.b(var3) : null;
         }
      } else {
         return null;
      }
   }

   public boolean a(VK var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = a(var1, this.b);
         return this.a(var2);
      }
   }

   public boolean a(String var1) {
      if (var1 == null) {
         return false;
      } else {
         switch(this.a) {
         case 0:
            return var1.equals(this.b);
         case 1:
            return this.a(var1, this.b);
         case 2:
            return this.a(var1.toLowerCase(), this.b);
         case 3:
            return this.b(var1, this.b);
         case 4:
            return this.b(var1.toLowerCase(), this.b);
         default:
            throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.a);
         }
      }
   }

   private boolean a(String var1, String var2) {
      return ami.a(var1, var2, '*', '?');
   }

   private boolean b(String var1, String var2) {
      return var1.matches(var2);
   }

   private static String a(VK var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof Wd) {
         Wd var8 = (Wd)var0;
         return var8.a();
      } else if (var0 instanceof VX) {
         VX var7 = (VX)var0;
         return var1 == 1 ? '#' + ami.a(Integer.toHexString(var7.getInt()), 6, '0') : acm.a(var7.getInt());
      } else if (var0 instanceof VP) {
         VP var6 = (VP)var0;
         return Byte.toString(var6.getByte());
      } else if (var0 instanceof Wc) {
         Wc var5 = (Wc)var0;
         return Short.toString(var5.getShort());
      } else if (var0 instanceof Wa) {
         Wa var4 = (Wa)var0;
         return Long.toString(var4.getLong());
      } else if (var0 instanceof VW) {
         VW var3 = (VW)var0;
         return Float.toString(var3.getFloat());
      } else if (var0 instanceof VU) {
         VU var2 = (VU)var0;
         return Double.toString(var2.getDouble());
      } else {
         return var0.toString();
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      String[] var2 = this.a;
      int var3 = var2.length;
      if (var3 != 0) {
         for(int var4 = 0; var4 < var3; ++var4) {
            var1.append(var2[var4]).append('.');
         }
      }

      var1.append(this.a);
      var1.append(" = ");
      var1.append(this.b);
      return var1.toString();
   }
}
