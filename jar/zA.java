import java.util.Locale;

public enum ZA {
   TITLE,
   SUBTITLE,
   ACTIONBAR,
   TIMES,
   CLEAR,
   RESET;

   public static final ZA[] VALUES = values();

   public static ZA a(String var0) {
      ZA[] var1 = VALUES;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         ZA var4 = var1[var3];
         if (var4.name().equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return TITLE;
   }

   public static String[] a() {
      String[] var0 = new String[values().length];
      int var1 = 0;
      ZA[] var2 = VALUES;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ZA var5 = var2[var4];
         var0[var1++] = var5.name().toLowerCase(Locale.ROOT);
      }

      return var0;
   }
}
