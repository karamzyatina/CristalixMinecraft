import io.netty.buffer.ByteBuf;

public final class Xw implements Ws {
   private long a;

   public Xw() {
   }

   public Xw(long var1) {
      this.a = var1;
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      this.a = var1.readLong();
   }

   public void write(ByteBuf var1) {
      var1.writeLong(this.a);
   }

   public long a() {
      return this.a;
   }
}
