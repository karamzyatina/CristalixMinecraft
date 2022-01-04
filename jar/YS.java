import io.netty.buffer.ByteBuf;

public class Ys extends Yq {
   public Ys() {
      this.b = true;
   }

   public void read(ByteBuf var1) {
      super.read(var1);
      this.a = var1.readByte();
      this.b = var1.readByte();
      this.a = var1.readBoolean();
   }

   public void write(ByteBuf var1) {
      super.write(var1);
      var1.writeByte(this.a);
      var1.writeByte(this.b);
      var1.writeBoolean(this.a);
   }
}
