import com.google.gson.JsonObject;
import java.util.Locale;

public final class Ka {
   private static Ka a;
   private final int a;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final boolean a;
   private final boolean b;

   private Ka(boolean var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
      this.a = var1;
      this.a = var3;
      this.c = var4;
      this.b = var5;
      this.d = var6;
      this.b = var2;
      this.e = var7;
   }

   public Ka() {
      this(false, true, 1, 0, 1, 0, 32774);
   }

   public Ka(int var1, int var2, int var3) {
      this(false, false, var1, var2, var1, var2, var3);
   }

   public Ka(int var1, int var2, int var3, int var4, int var5) {
      this(true, false, var1, var2, var3, var4, var5);
   }

   public void a() {
      if (!this.equals(a)) {
         if (a == null || this.b != a.a()) {
            a = this;
            if (this.b) {
               By.k();
               return;
            }

            By.l();
         }

         By.d(this.e);
         if (this.a) {
            By.a(this.a, this.c, this.b, this.d);
         } else {
            By.b(this.a, this.c);
         }
      }

   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Ka)) {
         return false;
      } else {
         Ka var2 = (Ka)var1;
         if (this.e != var2.e) {
            return false;
         } else if (this.d != var2.d) {
            return false;
         } else if (this.c != var2.c) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else if (this.a != var2.a) {
            return false;
         } else if (this.b != var2.b) {
            return false;
         } else {
            return this.a == var2.a;
         }
      }
   }

   public int hashCode() {
      int var1 = this.a;
      var1 = 31 * var1 + this.b;
      var1 = 31 * var1 + this.c;
      var1 = 31 * var1 + this.d;
      var1 = 31 * var1 + this.e;
      var1 = 31 * var1 + (this.a ? 1 : 0);
      var1 = 31 * var1 + (this.b ? 1 : 0);
      return var1;
   }

   public boolean a() {
      return this.b;
   }

   public static Ka a(JsonObject var0) {
      if (var0 == null) {
         return new Ka();
      } else {
         int var1 = 32774;
         int var2 = 1;
         int var3 = 0;
         int var4 = 1;
         int var5 = 0;
         boolean var6 = true;
         boolean var7 = false;
         if (acn.a(var0, "func")) {
            var1 = a(var0.get("func").getAsString());
            if (var1 != 32774) {
               var6 = false;
            }
         }

         if (acn.a(var0, "srcrgb")) {
            var2 = b(var0.get("srcrgb").getAsString());
            if (var2 != 1) {
               var6 = false;
            }
         }

         if (acn.a(var0, "dstrgb")) {
            var3 = b(var0.get("dstrgb").getAsString());
            if (var3 != 0) {
               var6 = false;
            }
         }

         if (acn.a(var0, "srcalpha")) {
            var4 = b(var0.get("srcalpha").getAsString());
            if (var4 != 1) {
               var6 = false;
            }

            var7 = true;
         }

         if (acn.a(var0, "dstalpha")) {
            var5 = b(var0.get("dstalpha").getAsString());
            if (var5 != 0) {
               var6 = false;
            }

            var7 = true;
         }

         if (var6) {
            return new Ka();
         } else {
            return var7 ? new Ka(var2, var3, var4, var5, var1) : new Ka(var2, var3, var1);
         }
      }
   }

   private static int a(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      if ("add".equals(var1)) {
         return 32774;
      } else if ("subtract".equals(var1)) {
         return 32778;
      } else if ("reversesubtract".equals(var1)) {
         return 32779;
      } else if ("reverse_subtract".equals(var1)) {
         return 32779;
      } else if ("min".equals(var1)) {
         return 32775;
      } else {
         return "max".equals(var1) ? '耈' : '耆';
      }
   }

   private static int b(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      var1 = var1.replaceAll("_", "");
      var1 = var1.replaceAll("one", "1");
      var1 = var1.replaceAll("zero", "0");
      var1 = var1.replaceAll("minus", "-");
      if ("0".equals(var1)) {
         return 0;
      } else if ("1".equals(var1)) {
         return 1;
      } else if ("srccolor".equals(var1)) {
         return 768;
      } else if ("1-srccolor".equals(var1)) {
         return 769;
      } else if ("dstcolor".equals(var1)) {
         return 774;
      } else if ("1-dstcolor".equals(var1)) {
         return 775;
      } else if ("srcalpha".equals(var1)) {
         return 770;
      } else if ("1-srcalpha".equals(var1)) {
         return 771;
      } else if ("dstalpha".equals(var1)) {
         return 772;
      } else {
         return "1-dstalpha".equals(var1) ? 773 : -1;
      }
   }
}
