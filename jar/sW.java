import java.util.EnumSet;

public enum SW implements acf {
   WHITE(0, 15, "white", "white", 16383998),
   ORANGE(1, 14, "orange", "orange", 16351261),
   MAGENTA(2, 13, "magenta", "magenta", 13061821),
   LIGHT_BLUE(3, 12, "light_blue", "lightBlue", 3847130),
   YELLOW(4, 11, "yellow", "yellow", 16701501),
   LIME(5, 10, "lime", "lime", 8439583),
   PINK(6, 9, "pink", "pink", 15961002),
   GRAY(7, 8, "gray", "gray", 4673362),
   SILVER(8, 7, "silver", "silver", 10329495),
   CYAN(9, 6, "cyan", "cyan", 1481884),
   PURPLE(10, 5, "purple", "purple", 8991416),
   BLUE(11, 4, "blue", "blue", 3949738),
   BROWN(12, 3, "brown", "brown", 8606770),
   GREEN(13, 2, "green", "green", 6192150),
   RED(14, 1, "red", "red", 11546150),
   BLACK(15, 0, "black", "black", 1908001);

   public static final SW[] VALUES = values();
   public static final EnumSet<SW> SET = EnumSet.of(VALUES[0], VALUES);
   private static final SW[] META_LOOKUP = new SW[VALUES.length];
   private static final SW[] DYE_DMG_LOOKUP = new SW[VALUES.length];
   private final int meta;
   private final int dyeDamage;
   private final String name;
   private final String translationKey;
   private final int colorValue;
   private final float[] colorComponentValues;

   private SW(int var3, int var4, String var5, String var6, int var7) {
      this.meta = var3;
      this.dyeDamage = var4;
      this.name = var5;
      this.translationKey = var6;
      this.colorValue = var7;
      int var8 = (var7 & 16711680) >> 16;
      int var9 = (var7 & '\uff00') >> 8;
      int var10 = (var7 & 255) >> 0;
      this.colorComponentValues = new float[]{(float)var8 / 255.0F, (float)var9 / 255.0F, (float)var10 / 255.0F};
   }

   public int a() {
      return this.meta;
   }

   public int b() {
      return this.dyeDamage;
   }

   public String a() {
      return this.name;
   }

   public String b() {
      return this.translationKey;
   }

   public int c() {
      return this.colorValue;
   }

   public float[] a() {
      return this.colorComponentValues;
   }

   public static SW a(int var0) {
      if (var0 < 0 || var0 >= DYE_DMG_LOOKUP.length) {
         var0 = 0;
      }

      return DYE_DMG_LOOKUP[var0];
   }

   public static SW b(int var0) {
      if (var0 < 0 || var0 >= META_LOOKUP.length) {
         var0 = 0;
      }

      return META_LOOKUP[var0];
   }

   public String toString() {
      return this.translationKey;
   }

   public String getName() {
      return this.name;
   }

   static {
      SW[] var0 = VALUES;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         SW var3 = var0[var2];
         META_LOOKUP[var3.a()] = var3;
         DYE_DMG_LOOKUP[var3.b()] = var3;
      }

   }
}
