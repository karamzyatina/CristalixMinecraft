import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class Yl implements Ws {
   private String a;
   private acI a;
   private int a;
   private int b = Integer.MAX_VALUE;
   private int c;
   private float a;
   private float b;

   public void read(ByteBuf var1) {
      this.a = NetUtil.readUtf8(var1);
      this.a = (acI)NetUtil.readEnum(acI.VALUES, var1);
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.a = var1.readFloat();
      this.b = var1.readFloat();
   }

   public void write(ByteBuf var1) {
      NetUtil.writeUtf8(this.a, var1);
      NetUtil.writeEnum(this.a, var1);
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeFloat(this.a);
      var1.writeFloat(this.b);
   }

   public String a() {
      return this.a;
   }

   public acI a() {
      return this.a;
   }

   public double a() {
      return (double)((float)this.a / 8.0F);
   }

   public double b() {
      return (double)((float)this.b / 8.0F);
   }

   public double c() {
      return (double)((float)this.c / 8.0F);
   }

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public void a(Xe var1) {
      var1.a(this);
   }
}
