import io.netty.buffer.ByteBuf;

public final class XO implements Ws {
   private boolean a;
   private boolean b;

   public XO() {
   }

   public XO(boolean var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   public void read(ByteBuf var1) {
      this.a = var1.readBoolean();
      this.b = var1.readBoolean();
   }

   public void write(ByteBuf var1) {
      var1.writeBoolean(this.a);
      var1.writeBoolean(this.b);
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }
}
