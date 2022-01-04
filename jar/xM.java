import io.netty.buffer.ByteBuf;

public final class Xm implements Ws {
   private int a;

   public Xm() {
   }

   public Xm(int var1) {
      this.a = var1;
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      this.a = var1.readByte();
   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a);
   }
}
