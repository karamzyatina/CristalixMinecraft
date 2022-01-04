import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class YP implements Ws {
   private int a;
   private String a;
   private adu a;
   private int b;
   private int c;

   public void a(Xe var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      this.a = var1.readUnsignedByte();
      this.a = NetUtil.readUtf8(var1);
      this.a = Wt.a(var1);
      this.b = var1.readUnsignedByte();
      if (this.a.equals("EntityHorse")) {
         this.c = var1.readInt();
      }

   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a);
      NetUtil.writeUtf8(this.a, var1);
      Wt.a(this.a, var1);
      var1.writeByte(this.b);
      if (this.a.equals("EntityHorse")) {
         var1.writeInt(this.c);
      }

   }

   public int a() {
      return this.a;
   }

   public String a() {
      return this.a;
   }

   public adu a() {
      return this.a;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.c;
   }

   public boolean a() {
      return this.b > 0;
   }
}
