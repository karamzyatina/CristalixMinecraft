import io.netty.buffer.ByteBuf;

public class Xy implements Ws {
   protected double a;
   protected double b;
   protected double c;
   protected float a;
   protected float b;
   protected boolean a;
   protected boolean b;
   protected boolean c;

   public Xy() {
   }

   public Xy(boolean var1) {
      this.a = var1;
   }

   public void a(Xf var1) {
      var1.a(this);
   }

   public void read(ByteBuf var1) {
      this.a = var1.readUnsignedByte() != 0;
   }

   public void write(ByteBuf var1) {
      var1.writeByte(this.a ? 1 : 0);
   }

   public double a(double var1) {
      return this.b ? this.a : var1;
   }

   public double b(double var1) {
      return this.b ? this.b : var1;
   }

   public double c(double var1) {
      return this.b ? this.c : var1;
   }

   public float a(float var1) {
      return this.c ? this.a : var1;
   }

   public float b(float var1) {
      return this.c ? this.b : var1;
   }

   public boolean a() {
      return this.a;
   }
}
