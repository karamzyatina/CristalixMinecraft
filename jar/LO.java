import com.sun.imageio.plugins.png.PNGImageReaderSpi;
import com.sun.imageio.plugins.png.PNGImageWriterSpi;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Path;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

public final class Lo {
   private static final PNGImageReaderSpi a = new PNGImageReaderSpi();
   private static final PNGImageWriterSpi a = new PNGImageWriterSpi();

   public static ImageInputStream a(InputStream var0) {
      return (ImageInputStream)(var0 instanceof ImageInputStream ? (ImageInputStream)var0 : new Lp(var0));
   }

   public static BufferedImage a(InputStream var0) {
      return a(a(var0));
   }

   public static BufferedImage a(ImageInputStream var0) {
      ImageReader var1 = a.createReaderInstance((Object)null);
      var1.setInput(var0, true, true);

      BufferedImage var2;
      try {
         var2 = var1.read(0, var1.getDefaultReadParam());
      } finally {
         var1.dispose();
         var0.close();
      }

      return var2;
   }

   public static boolean a(RenderedImage var0, ImageOutputStream var1) {
      ImageWriter var2 = a.createWriterInstance((Object)null);
      var2.setOutput(var1);

      try {
         var2.write(var0);
      } finally {
         var2.dispose();
      }

      return true;
   }

   public static boolean a(RenderedImage var0, File var1) {
      FileImageOutputStream var2 = new FileImageOutputStream(var1);
      Throwable var3 = null;

      boolean var4;
      try {
         var4 = a(var0, (ImageOutputStream)var2);
      } catch (Throwable var13) {
         var3 = var13;
         throw var13;
      } finally {
         if (var2 != null) {
            if (var3 != null) {
               try {
                  var2.close();
               } catch (Throwable var12) {
                  var3.addSuppressed(var12);
               }
            } else {
               var2.close();
            }
         }

      }

      return var4;
   }

   public static boolean a(RenderedImage var0, Path var1) {
      return a(var0, var1.toFile());
   }
}
