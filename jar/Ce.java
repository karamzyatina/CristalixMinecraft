import java.util.Arrays;

public final class CE extends CD {
   private final HK b;
   private final HK c;

   public CE(HO var1, CD var2, HK var3) {
      super(var1, Arrays.copyOf(var2.getVertexData(), var2.getVertexData().length), var2.a, CO.a(var2.getVertexData()), var3, var2.a, var2.a);
      this.b = var3;
      this.a = var2.a;
      this.a = var2.a;
      this.c = var2.a();
      this.b();
      this.a();
   }

   private void b() {
      Ip var1 = this.a;
      int var2 = var1.getIntegerSize();
      int[] var3 = this.a;
      HK var4 = this.b;
      HK var5 = this.c;

      for(int var6 = 0; var6 < 4; ++var6) {
         int var7 = var2 * var6;
         int var8 = var1.getUvOffsetById(0) / 4;
         var3[var7 + var8] = Float.floatToRawIntBits(var4.getInterpolatedU((double)var5.getUnInterpolatedU(Float.intBitsToFloat(var3[var7 + var8]))));
         var3[var7 + var8 + 1] = Float.floatToRawIntBits(var4.getInterpolatedV((double)var5.getUnInterpolatedV(Float.intBitsToFloat(var3[var7 + var8 + 1]))));
      }

   }

   public final HK a() {
      return this.b;
   }
}
