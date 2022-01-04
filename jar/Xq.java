import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public final class XQ implements Ws {
   private acV a;
   private String[] a;

   public XQ() {
   }

   public XQ(acV var1, adu[] var2) {
      this.a = var1;
      this.a = new String[]{var2[0].getUnformattedText(), var2[1].getUnformattedText(), var2[2].getUnformattedText(), var2[3].getUnformattedText()};
   }

   public void read(ByteBuf var1) {
      Wt.a(this.a, var1);
      this.a = new String[4];

      for(int var2 = 0; var2 < 4; ++var2) {
         this.a[var2] = NetUtil.readUtf8(var1);
      }

   }

   public void write(ByteBuf var1) {
      Wt.a(this.a, var1);

      for(int var2 = 0; var2 < 4; ++var2) {
         NetUtil.writeUtf8(this.a[var2], var1);
      }

   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public acV a() {
      return this.a;
   }

   public String[] a() {
      return this.a;
   }
}
