import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;

public class YQ implements Ws {
   private abW a;
   private float a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private float g;
   private int a;
   private boolean a;
   private int[] a;

   public void read(ByteBuf var1) {
      this.a = abW.a(var1.readInt());
      if (this.a == null) {
         this.a = abW.BARRIER;
      }

      this.a = var1.readBoolean();
      this.a = var1.readFloat();
      this.b = var1.readFloat();
      this.c = var1.readFloat();
      this.d = var1.readFloat();
      this.e = var1.readFloat();
      this.f = var1.readFloat();
      this.g = var1.readFloat();
      this.a = var1.readInt();
      int var2 = this.a.getArgumentCount();
      this.a = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = NetUtil.readVarInt(var1);
      }

   }

   public void write(ByteBuf var1) {
      var1.writeInt(this.a.a());
      var1.writeBoolean(this.a);
      var1.writeFloat(this.a);
      var1.writeFloat(this.b);
      var1.writeFloat(this.c);
      var1.writeFloat(this.d);
      var1.writeFloat(this.e);
      var1.writeFloat(this.f);
      var1.writeFloat(this.g);
      var1.writeInt(this.a);
      int var2 = this.a.getArgumentCount();

      for(int var3 = 0; var3 < var2; ++var3) {
         NetUtil.writeVarInt(this.a[var3], var1);
      }

   }

   public abW a() {
      return this.a;
   }

   public boolean a() {
      return this.a;
   }

   public double a() {
      return (double)this.a;
   }

   public double b() {
      return (double)this.b;
   }

   public double c() {
      return (double)this.c;
   }

   public float a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int a() {
      return this.a;
   }

   public int[] a() {
      return this.a;
   }

   public void a(Xe var1) {
      var1.a(this);
   }
}
