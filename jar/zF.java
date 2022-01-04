import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class Zf implements Ws {
   private int a;
   private adY a;
   private aeb a;
   private aet a;

   public void a(Xe var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      this.a = var1.readInt();
      this.a = adY.a(var1.readUnsignedByte());
      this.a = aeb.a(var1.readUnsignedByte());
      this.a = aet.a(NetUtil.readUtf8(var1));
      if (this.a == null) {
         this.a = aet.a;
      }

   }

   public void write(ByteBuf var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.a.a());
      var1.writeByte(this.a.a());
      NetUtil.writeUtf8(this.a.a(), var1);
   }

   public int a() {
      return this.a;
   }

   public adY a() {
      return this.a;
   }

   public aeb a() {
      return this.a;
   }

   public aet a() {
      return this.a;
   }
}
