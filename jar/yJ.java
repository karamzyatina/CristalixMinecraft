import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class Yj implements Ws {
   private SZ a;
   private int a;

   public void read(ByteBuf var1) {
      this.a = SZ.a(NetUtil.readVarInt(var1));
      this.a = NetUtil.readVarInt(var1);
   }

   public void write(ByteBuf var1) {
      NetUtil.writeVarInt(SZ.a(this.a), var1);
      NetUtil.writeVarInt(this.a, var1);
   }

   public void a(Xe var1) {
      var1.a(this);
   }

   public SZ a() {
      return this.a;
   }

   public int a() {
      return this.a;
   }
}
