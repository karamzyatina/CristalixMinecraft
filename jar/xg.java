import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public final class XG implements Ws {
   private acV a;
   private abP a;
   private abU a;
   private float a;
   private float b;
   private float c;

   public XG() {
   }

   public XG(acV var1, abP var2, abU var3, float var4, float var5, float var6) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
      this.b = var5;
      this.c = var6;
   }

   public void read(ByteBuf var1) {
      this.a = Wt.a(var1);
      this.a = (abP)NetUtil.readEnum(abP.VALUES, var1);
      this.a = (abU)NetUtil.readEnum(abU.VALUES, var1);
      this.a = var1.readFloat();
      this.b = var1.readFloat();
      this.c = var1.readFloat();
   }

   public void write(ByteBuf var1) {
      Wt.a(this.a, var1);
      NetUtil.writeEnum(this.a, var1);
      NetUtil.writeEnum(this.a, var1);
      var1.writeFloat(this.a);
      var1.writeFloat(this.b);
      var1.writeFloat(this.c);
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public acV a() {
      return this.a;
   }

   public abP a() {
      return this.a;
   }

   public abU a() {
      return this.a;
   }

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public float c() {
      return this.c;
   }
}
