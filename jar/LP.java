import java.io.InputStream;
import javax.imageio.stream.ImageInputStreamImpl;

public final class Lp extends ImageInputStreamImpl {
   private final byte[] a;

   public Lp(byte[] var1) {
      this.a = var1;
   }

   public Lp(InputStream var1) {
      this(a(var1));
   }

   public int read() {
      byte[] var1 = this.a;
      return this.streamPos < (long)var1.length ? var1[(int)(this.streamPos++)] & 255 : -1;
   }

   public int read(byte[] var1, int var2, int var3) {
      byte[] var4 = this.a;
      long var5 = this.streamPos;
      long var7 = (long)var4.length;
      if (var5 >= var7) {
         return -1;
      } else {
         int var9 = (int)(var7 - var5);
         if (var3 > var9) {
            var3 = var9;
         }

         if (var3 <= 0) {
            return 0;
         } else {
            System.arraycopy(var4, (int)var5, var1, var2, var3);
            this.streamPos += (long)var3;
            return var3;
         }
      }
   }

   public boolean isCached() {
      return true;
   }

   public boolean isCachedMemory() {
      return true;
   }

   private static byte[] a(InputStream var0) {
      byte[] var1;
      try {
         var1 = La.a(var0);
      } finally {
         var0.close();
      }

      return var1;
   }
}
