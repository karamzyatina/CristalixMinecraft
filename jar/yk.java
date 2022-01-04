import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class Yk implements Ws {
   private String a;
   private Wt a;

   public void read(ByteBuf var1) {
      this.a = NetUtil.readUtf8(var1);
      int var2 = var1.readableBytes();
      this.a = new Wt(var1.readBytes(var2));
   }

   public void a(ByteBuf var1) {
      this.a = NetUtil.readUtf8(var1);
      int var2 = NetUtil.readVarInt(var1);
      this.a = new Wt(var1.readBytes(var2));
   }

   public void write(ByteBuf var1) {
      NetUtil.writeUtf8(this.a, var1);
      var1.writeBytes(this.a);
   }

   public void a(Xe var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }

   public Wt a() {
      return this.a;
   }

   public void recycle() {
      this.a.release();
   }
}
