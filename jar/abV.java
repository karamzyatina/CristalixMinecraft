import dev.xdark.feder.ChatAllowedCharacters;

public final class abv {
   public static final char[] a = new char[]{'.', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"'};

   public static boolean a(char var0) {
      return ChatAllowedCharacters.isAllowedChar(var0);
   }

   public static String a(String var0) {
      return ChatAllowedCharacters.filterChars(var0);
   }
}
