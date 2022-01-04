import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public final class Xi implements Ws {
   private int a;
   private int b;
   private int c;
   private short a;
   private Vh a;
   private RX a;

   public Xi() {
      this.a = Vh.a;
   }

   public Xi(int var1, int var2, int var3, RX var4, Vh var5, short var6) {
      this.a = Vh.a;
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.a = var5.a();
      this.a = var6;
      this.a = var4;
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      this.a = var1.readByte();
      this.b = var1.readShort();
      this.c = var1.readByte();
      this.a = var1.readShort();
      this.a = (RX)NetUtil.readEnum(RX.VALUES, var1);
      this.a = Wt.a(var1);
   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.b);
      var1.writeByte(this.c);
      var1.writeShort(this.a);
      NetUtil.writeEnum(this.a, var1);
      Wt.a(this.a, var1);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public short a() {
      return this.a;
   }

   public Vh a() {
      return this.a;
   }

   public RX a() {
      return this.a;
   }
}
