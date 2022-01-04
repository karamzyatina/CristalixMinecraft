import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public final class Xx implements Ws {
   private int a;
   private Vp a;
   private boolean a;

   public Xx() {
   }

   public Xx(int var1, Vp var2, boolean var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public void read(ByteBuf var1) {
      this.a = var1.readByte();
      this.a = Vn.a(NetUtil.readVarInt(var1));
      this.a = var1.readBoolean();
   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a);
      NetUtil.writeVarInt(Vn.a(this.a), var1);
      var1.writeBoolean(this.a);
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public int a() {
      return this.a;
   }

   public Vp a() {
      return this.a;
   }

   public boolean a() {
      return this.a;
   }
}
