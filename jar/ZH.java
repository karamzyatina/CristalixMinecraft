import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class Zh implements Ws {
   private acC a;

   public void a(Xe var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      if (var1.readBoolean()) {
         this.a = new acC(NetUtil.readUtf8(var1));
      }

   }

   public void write(ByteBuf var1) {
      var1.writeBoolean(this.a != null);
      if (this.a != null) {
         Wt.a(this.a, var1);
      }

   }

   public acC a() {
      return this.a;
   }
}
