import io.netty.buffer.ByteBuf;

class aaP extends aaA {
   // $FF: synthetic field
   final aaO a;

   aaP(aaO var1) {
      this.a = var1;
   }

   public void a(String var1) {
      super.a(var1);
      this.a.b();
   }

   public int a() {
      return 0;
   }

   public void a(ByteBuf var1) {
      aaO var2 = this.a;
      var1.writeInt(var2.a);
      var1.writeInt(var2.b);
      var1.writeInt(var2.c);
   }

   public acV a_() {
      return this.a.a();
   }

   public aej a_() {
      return this.a.b();
   }
}
