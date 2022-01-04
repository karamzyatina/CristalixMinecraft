import io.netty.buffer.ByteBuf;

public class Yi implements Ws {
   private int a;
   private short a;
   private boolean a;

   public void a(Xe var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      this.a = var1.readUnsignedByte();
      this.a = var1.readShort();
      this.a = var1.readBoolean();
   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a);
      var1.writeShort(this.a);
      var1.writeBoolean(this.a);
   }

   public int a() {
      return this.a;
   }

   public short a() {
      return this.a;
   }

   public boolean a() {
      return this.a;
   }
}
