import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class Ym implements Ws {
   private int[] a;

   public void read(ByteBuf var1) {
      this.a = new int[NetUtil.readVarInt(var1)];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = NetUtil.readVarInt(var1);
      }

   }

   public void write(ByteBuf var1) {
      NetUtil.writeVarInt(this.a.length, var1);
      int[] var2 = this.a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         NetUtil.writeVarInt(var5, var1);
      }

   }

   public void a(Xe var1) {
      var1.a(this);
   }

   public int[] a() {
      return this.a;
   }
}
