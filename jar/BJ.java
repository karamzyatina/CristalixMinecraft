import dev.xdark.clientapi.render.BufferBuilder.State;

public final class Bj implements State {
   private final int[] a;
   private final Ip a;
   public final HK[] a;

   public Bj(int[] var1, Ip var2, HK[] var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public Bj(int[] var1, Ip var2) {
      this.a = var1;
      this.a = var2;
      this.a = null;
   }

   public int[] getRawBuffer() {
      return this.a;
   }

   public int getVertexCount() {
      return this.a.length / this.a.getIntegerSize();
   }

   public Ip a() {
      return this.a;
   }
}
