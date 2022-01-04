import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class YR implements Ws {
   private int a;
   private Vp a;

   public Vp a() {
      return this.a;
   }

   public int a() {
      return this.a;
   }

   public void read(ByteBuf var1) {
      this.a = var1.readByte();
      this.a = Vn.a(NetUtil.readVarInt(var1));
   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a);
      NetUtil.writeVarInt(Vn.a(this.a), var1);
   }

   public void a(Xe var1) {
      var1.a(this);
   }
}
