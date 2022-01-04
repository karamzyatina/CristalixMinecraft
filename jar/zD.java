import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class Zd implements Ws {
   private int a;
   private ZV a;

   public void read(ByteBuf var1) {
      this.a = NetUtil.readVarInt(var1);
      this.a = ZV.a(var1.readUnsignedByte());
   }

   public void write(ByteBuf var1) {
      NetUtil.writeVarInt(this.a, var1);
      var1.writeByte(ZV.a(this.a));
   }

   public void a(Xe var1) {
      var1.a(this);
   }

   public NN a(aej var1) {
      return var1.a(this.a);
   }

   public ZV a() {
      return this.a;
   }
}
