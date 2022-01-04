import io.netty.buffer.ByteBuf;

public class YF implements Ws {
   private int a;

   public void read(ByteBuf var1) {
      this.a = var1.readByte();
   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a);
   }

   public void a(Xe var1) {
      var1.a(this);
   }

   public int a() {
      return this.a;
   }
}
