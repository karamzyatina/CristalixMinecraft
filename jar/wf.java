import io.netty.buffer.ByteBuf;

final class WF implements WC {
   public void a(ByteBuf var1, acV var2) {
      Wt.a(var2, var1);
   }

   public acV a(ByteBuf var1) {
      return Wt.a(var1);
   }

   public WB<acV> a(int var1) {
      return new WB(var1, this);
   }

   public acV a(acV var1) {
      return var1;
   }

   // $FF: synthetic method
   public Object copyValue(Object var1) {
      return this.a((acV)var1);
   }
}
