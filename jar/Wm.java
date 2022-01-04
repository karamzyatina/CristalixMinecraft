import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

final class WM implements WC {
   public void a(ByteBuf var1, String var2) {
      NetUtil.writeUtf8(var2, var1);
   }

   public String a(ByteBuf var1) {
      return NetUtil.readUtf8(var1);
   }

   public WB<String> a(int var1) {
      return new WB(var1, this);
   }

   public String a(String var1) {
      return var1;
   }

   // $FF: synthetic method
   public Object copyValue(Object var1) {
      return this.a((String)var1);
   }
}
