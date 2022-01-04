import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public final class Xh implements Ws {
   private String a;

   public Xh() {
   }

   public Xh(String var1) {
      if (var1.length() > 256) {
         var1 = var1.substring(0, 256);
      }

      this.a = var1;
   }

   public void read(ByteBuf var1) {
      this.a = NetUtil.readUtf8(var1);
   }

   public void write(ByteBuf var1) {
      NetUtil.writeUtf8(this.a, var1);
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }
}
