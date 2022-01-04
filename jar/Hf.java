import dev.xdark.clientapi.renderer.texture.PngSizeInfo;
import dev.xdark.feder.IOUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class HF implements PngSizeInfo {
   public final int a;
   public final int b;

   public HF(InputStream var1) {
      if (a(var1) != -8552249625308161526L) {
         throw new IOException("Bad PNG Signature");
      } else if (a(var1) != 13) {
         throw new IOException("Bad length for IHDR chunk!");
      } else if (a(var1) != 1229472850) {
         throw new IOException("Bad type for IHDR chunk!");
      } else {
         this.a = a(var1);
         this.b = a(var1);
      }
   }

   public static HF a(InputStream var0) {
      HF var1;
      try {
         var1 = new HF(var0);
      } finally {
         IOUtil.closeQuietly(var0);
      }

      return var1;
   }

   private static int a(InputStream var0) {
      int var1 = var0.read();
      int var2 = var0.read();
      int var3 = var0.read();
      int var4 = var0.read();
      if ((var1 | var2 | var3 | var4) < 0) {
         throw new EOFException();
      } else {
         return (var1 << 24) + (var2 << 16) + (var3 << 8) + (var4 << 0);
      }
   }

   private static long a(InputStream var0) {
      int var1 = var0.read();
      int var2 = var0.read();
      int var3 = var0.read();
      int var4 = var0.read();
      int var5 = var0.read();
      int var6 = var0.read();
      int var7 = var0.read();
      int var8 = var0.read();
      if ((var1 | var2 | var3 | var4 | var5 | var6 | var7 | var8) < 0) {
         throw new EOFException();
      } else {
         return (long)(var1 & 255) << 56 | (long)(var2 & 255) << 48 | (long)(var3 & 255) << 40 | (long)(var4 & 255) << 32 | (long)(var5 & 255) << 24 | (long)(var6 & 255) << 16 | (long)(var7 & 255) << 8 | (long)(var8 & 255);
      }
   }

   // $FF: synthetic method
   public int getWidth() {
      return this.a;
   }

   // $FF: synthetic method
   public int getHeight() {
      return this.b;
   }
}
