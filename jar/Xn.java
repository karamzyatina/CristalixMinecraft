import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public final class XN implements Ws {
   private UUID a;

   public XN() {
   }

   public XN(UUID var1) {
      this.a = var1;
   }

   public void read(ByteBuf var1) {
      this.a = NetUtil.readId(var1);
   }

   public void write(ByteBuf var1) {
      NetUtil.writeId(this.a, var1);
   }

   public void a(Xf var1) {
      var1.a(this);
   }
}
