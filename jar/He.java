import dev.xdark.feder.IOUtil;
import dev.xdark.feder.collection.CompactIterables;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class HE extends Hx {
   private static final Logger a;
   public final List<String> a;
   private acC a;

   public HE(String... var1) {
      this.a = CompactIterables.newArrayList(var1);
      if (var1.length > 0 && var1[0] != null) {
         this.a = new acC(var1[0]);
      }

   }

   public void a(IN var1) {
      this.deleteGlTexture();
      BufferedImage var2 = null;
      Iterator var3 = this.a.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         Object var5 = null;

         try {
            if (var4 != null) {
               BufferedImage var6 = var1.b(new acC(var4)).a;
               if (var2 == null) {
                  var2 = new BufferedImage(var6.getWidth(), var6.getHeight(), 2);
               }

               var2.getGraphics().drawImage(var6, 0, 0, (ImageObserver)null);
            }
            continue;
         } catch (IOException var10) {
            a.error("Couldn't load layered image", var10);
         } finally {
            IOUtil.closeQuietly((Closeable)var5);
         }

         return;
      }

      if (afT.ad()) {
         akG.a(this.getGlTextureId(), var2, false, false, var1, this.a, this.a());
      } else {
         HS.a(this.getGlTextureId(), var2);
      }

   }

   static {
      a = sE.a;
   }
}
