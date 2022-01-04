import java.nio.ByteBuffer;

public final class akh implements aki {
   private int a = Lw.d();
   private final int b = 15;

   public akh(int var1, int var2) {
      byte[] var3 = this.a(var1, var2);
      ByteBuffer var4 = Bx.a(var3.length);
      var4.put(var3);
      var4.flip();
      By.i(this.a);
      Lw.b(3553, 0, 6407, var1, var2, 0, 6407, 5121, (ByteBuffer)var4);
      Lw.a(3553, 10242, 10497);
      Lw.a(3553, 10243, 10497);
      Lw.a(3553, 10240, 9729);
      Lw.a(3553, 10241, 9729);
      By.i(0);
   }

   public int d() {
      return this.a;
   }

   public void a() {
      By.h(this.a);
      this.a = 0;
   }

   private int a(int var1) {
      var1 ^= var1 << 13;
      var1 ^= var1 >> 17;
      var1 ^= var1 << 5;
      return var1;
   }

   private byte a(int var1, int var2, int var3) {
      int var4 = (this.a(var1) + this.a(var2 * 19)) * this.a(var3 * 23) - var3;
      return (byte)(this.a(var4) % 128);
   }

   private byte[] a(int var1, int var2) {
      byte[] var3 = new byte[var1 * var2 * 3];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         for(int var6 = 0; var6 < var1; ++var6) {
            for(int var7 = 1; var7 < 4; ++var7) {
               var3[var4++] = this.a(var6, var5, var7);
            }
         }
      }

      return var3;
   }

   public int b() {
      return this.a;
   }

   public int a() {
      this.getClass();
      return 15;
   }
}
