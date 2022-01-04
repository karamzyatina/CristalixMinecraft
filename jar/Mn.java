import it.unimi.dsi.fastutil.HashCommon;

public final class MN {
   private long a;

   public MN(long var1) {
      this.a(var1);
   }

   private static long a(long var0) {
      var0 = (var0 ^ var0 >>> 30) * -4658895280553007687L;
      var0 = (var0 ^ var0 >>> 27) * -7723592293110705685L;
      return var0 ^ var0 >>> 31;
   }

   public long a() {
      return a(this.a += -7046029254386353131L);
   }

   public void a(long var1) {
      this.a = HashCommon.murmurHash3(var1);
   }
}
