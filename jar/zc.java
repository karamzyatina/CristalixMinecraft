import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class ZC implements Ws {
   private UUID a;
   private ZE a;
   private adu a;
   private float a;
   private adR a;
   private adS a;
   private boolean a;
   private boolean b;
   private boolean c;

   public void read(ByteBuf var1) {
      // $FF: Couldn't be decompiled
   }

   private void a(int var1) {
      this.a = (var1 & 1) > 0;
      this.b = (var1 & 2) > 0;
      this.c = (var1 & 2) > 0;
   }

   public void write(ByteBuf var1) {
      // $FF: Couldn't be decompiled
   }

   private int a() {
      int var1 = 0;
      if (this.a) {
         var1 |= 1;
      }

      if (this.b) {
         var1 |= 2;
      }

      if (this.c) {
         var1 |= 2;
      }

      return var1;
   }

   public void a(Xe var1) {
      var1.a(this);
   }

   public UUID a() {
      return this.a;
   }

   public ZE a() {
      return this.a;
   }

   public adu a() {
      return this.a;
   }

   public float a() {
      return this.a;
   }

   public adR a() {
      return this.a;
   }

   public adS a() {
      return this.a;
   }

   public boolean a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
