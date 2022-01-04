public class tm extends tl {
   public tm(acJ var1, acI var2, float var3, float var4, acV var5) {
      this(var1, var2, var3, var4, (float)var5.a + 0.5F, (float)var5.b + 0.5F, (float)var5.c + 0.5F);
   }

   public static tm a(acJ var0, float var1) {
      return a(var0, var1, 0.25F);
   }

   public static tm a(acJ var0, float var1, float var2) {
      return new tm(var0, acI.MASTER, var2, var1, false, 0, tc.NONE, 0.0F, 0.0F, 0.0F);
   }

   public static tm a(acJ var0) {
      return new tm(var0, acI.MUSIC, 1.0F, 1.0F, false, 0, tc.NONE, 0.0F, 0.0F, 0.0F);
   }

   public static tm a(acJ var0, float var1, float var2, float var3) {
      return new tm(var0, acI.RECORDS, 4.0F, 1.0F, false, 0, tc.LINEAR, var1, var2, var3);
   }

   public tm(acJ var1, acI var2, float var3, float var4, float var5, float var6, float var7) {
      this((acJ)var1, var2, var3, var4, false, 0, tc.LINEAR, var5, var6, var7);
   }

   private tm(acJ var1, acI var2, float var3, float var4, boolean var5, int var6, tc var7, float var8, float var9, float var10) {
      this(var1.a(), var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public tm(acC var1, acI var2, float var3, float var4, boolean var5, int var6, tc var7, float var8, float var9, float var10) {
      super(var1, var2);
      this.a = var3;
      this.b = var4;
      this.c = var8;
      this.d = var9;
      this.e = var10;
      this.b = var5;
      this.a = var6;
      this.a = var7;
   }
}
