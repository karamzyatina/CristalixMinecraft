import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;
import java.security.PublicKey;

public class Xc implements Ws {
   private String a;
   private PublicKey a;
   private byte[] a;

   public void read(ByteBuf var1) {
      this.a = NetUtil.readUtf8(var1);
      this.a = abC.a(NetUtil.readArray(var1));
      this.a = NetUtil.readArray(var1);
   }

   public void write(ByteBuf var1) {
      NetUtil.writeUtf8(this.a, var1);
      NetUtil.writeArray(this.a.getEncoded(), var1);
      NetUtil.writeArray(this.a, var1);
   }

   public void a(WW var1) {
      var1.a(this);
   }

   public String a() {
      return this.a;
   }

   public PublicKey a() {
      return this.a;
   }

   public byte[] a() {
      return this.a;
   }
}
