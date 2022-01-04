import dev.xdark.clientapi.text.TextFormatting;
import it.unimi.dsi.fastutil.objects.Object2ReferenceArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum adH implements TextFormatting {
   BLACK("BLACK", '0', 0),
   DARK_BLUE("DARK_BLUE", '1', 1),
   DARK_GREEN("DARK_GREEN", '2', 2),
   DARK_AQUA("DARK_AQUA", '3', 3),
   DARK_RED("DARK_RED", '4', 4),
   DARK_PURPLE("DARK_PURPLE", '5', 5),
   GOLD("GOLD", '6', 6),
   GRAY("GRAY", '7', 7),
   DARK_GRAY("DARK_GRAY", '8', 8),
   BLUE("BLUE", '9', 9),
   GREEN("GREEN", 'a', 10),
   AQUA("AQUA", 'b', 11),
   RED("RED", 'c', 12),
   LIGHT_PURPLE("LIGHT_PURPLE", 'd', 13),
   YELLOW("YELLOW", 'e', 14),
   WHITE("WHITE", 'f', 15),
   OBFUSCATED("OBFUSCATED", 'k', true),
   BOLD("BOLD", 'l', true),
   STRIKETHROUGH("STRIKETHROUGH", 'm', true),
   UNDERLINE("UNDERLINE", 'n', true),
   ITALIC("ITALIC", 'o', true),
   RESET("RESET", 'r', -1);

   private static final adH[] COLOR_INDEX = new adH[16];
   public static final adH[] VALUES = values();
   private static final Map<String, adH> NAME_MAPPING = new Object2ReferenceArrayMap();
   private static final Pattern FORMATTING_CODE_PATTERN = Pattern.compile(c("(?i)§[0-9A-FK-OR]"));
   private static final ThreadLocal<Matcher> THREAD_LOCAL = new ThreadLocal();
   private final String name;
   private final char formattingCode;
   private final boolean fancyStyling;
   private final String controlString;
   private final int colorIndex;

   private static String b(String var0) {
      return var0.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
   }

   private adH(String var3, char var4, int var5) {
      this(var3, var4, false, var5);
   }

   private adH(String var3, char var4, boolean var5) {
      this(var3, var4, var5, -1);
   }

   private adH(String var3, char var4, boolean var5, int var6) {
      this.name = var3;
      this.formattingCode = var4;
      this.fancyStyling = var5;
      this.colorIndex = var6;
      this.controlString = "§" + var4;
   }

   public int getColorIndex() {
      return this.colorIndex;
   }

   public boolean isFancyStyling() {
      return this.fancyStyling;
   }

   public boolean isColor() {
      return !this.fancyStyling && this != RESET;
   }

   public String getFriendlyName() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   public String toString() {
      return this.controlString;
   }

   public static String a(String var0) {
      return var0 == null ? null : a((CharSequence)var0).replaceAll("");
   }

   public static adH a(String var0) {
      return var0 == null ? null : (adH)NAME_MAPPING.get(b(var0));
   }

   public static adH a(int var0) {
      return var0 < 0 ? RESET : (adH)La.a((Object[])COLOR_INDEX, var0);
   }

   public static Collection<String> a(boolean var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      adH[] var3 = VALUES;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         adH var6 = var3[var5];
         if ((!var6.isColor() || var0) && (!var6.isFancyStyling() || var1)) {
            var2.add(var6.getFriendlyName());
         }
      }

      return var2;
   }

   private static Matcher a(CharSequence var0) {
      Matcher var1 = (Matcher)THREAD_LOCAL.get();
      if (var1 == null) {
         THREAD_LOCAL.set(var1 = FORMATTING_CODE_PATTERN.matcher(var0));
         return var1;
      } else {
         return var1.reset(var0);
      }
   }

   static {
      adH[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         adH var3 = var0[var2];
         NAME_MAPPING.put(b(var3.name), var3);
         int var4 = var3.colorIndex;
         if (var4 >= 0) {
            COLOR_INDEX[var4] = var3;
         }
      }

   }

   private static String c(String var0) {
      return "(?i)(§[0-9A-FK-OR]|¨[0-9A-F]{6})";
   }
}
