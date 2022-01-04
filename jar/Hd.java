import dev.xdark.feder.IOUtil;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class HD extends Hx {
   private static final Logger a;
   private final acC a;
   private final List<String> a;
   private final List<SW> b;

   public HD(acC var1, List<String> var2, List<SW> var3) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
   }

   public void a(IN var1) {
      this.deleteGlTexture();
      IM var2 = null;

      BufferedImage var3;
      label149: {
         try {
            var2 = var1.a(this.a);
            BufferedImage var4 = var2.a().a;
            int var5 = var4.getType();
            if (var5 == 0) {
               var5 = 6;
            }

            var3 = new BufferedImage(var4.getWidth(), var4.getHeight(), var5);
            Graphics var6 = var3.getGraphics();
            var6.drawImage(var4, 0, 0, (ImageObserver)null);

            for(int var7 = 0; var7 < 17 && var7 < this.a.size() && var7 < this.b.size(); ++var7) {
               String var9 = (String)this.a.get(var7);
               int var10 = ((SW)this.b.get(var7)).c();
               if (var9 != null) {
                  Ln var8 = var1.b(new acC(var9));
                  BufferedImage var11 = var8.a;
                  if (var11.getWidth() == var3.getWidth() && var11.getHeight() == var3.getHeight() && var11.getType() == 6) {
                     var11 = La.a(var11);
                     int var12 = var11.getHeight();
                     int var13 = var11.getWidth();

                     for(int var14 = 0; var14 < var12; ++var14) {
                        for(int var15 = 0; var15 < var13; ++var15) {
                           int var16 = var11.getRGB(var15, var14);
                           if ((var16 & -16777216) != 0) {
                              int var17 = (var16 & 16711680) << 8 & -16777216;
                              int var18 = var4.getRGB(var15, var14);
                              int var19 = adh.d(var18, var10) & 16777215;
                              var11.setRGB(var15, var14, var17 | var19);
                           }
                        }
                     }

                     var6.drawImage(var11, 0, 0, (ImageObserver)null);
                  }
               }
            }

            var6.dispose();
            break label149;
         } catch (IOException var23) {
            a.error("Couldn't load layered image", var23);
         } finally {
            IOUtil.closeQuietly(var2);
         }

         return;
      }

      if (afT.ad()) {
         akG.a(this.getGlTextureId(), var3, false, false, var1, this.a, this.a());
      } else {
         HS.a(this.getGlTextureId(), var3);
      }

   }

   static {
      a = sE.a;
   }
}
