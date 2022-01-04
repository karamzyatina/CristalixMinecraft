import dev.xdark.feder.NetUtil;

public final class afg implements afl {
   public static int a;

   public int a(sD var1) {
      return mY.a.a(var1, 0);
   }

   public sD a(int var1) {
      sD var2 = (sD)mY.a.a(var1);
      return var2 == null ? afh.a : var2;
   }

   public void a(Wt var1) {
      NetUtil.readVarInt(var1);
   }

   public void b(Wt var1) {
      NetUtil.writeVarInt(0, var1);
   }

   public int a() {
      return NetUtil.varIntSize(0);
   }

   public afl a() {
      return this;
   }

   public static void a() {
      a = adh.c(mY.a.a());
   }

   static {
      a = adh.c(mY.a.a());
   }
}
