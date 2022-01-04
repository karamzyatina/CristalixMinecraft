import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;

public class Cc implements Cb {
   private int[] a;
   private int a;

   public BufferedImage a(BufferedImage var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = 64;
         int var3 = 64;
         int var4 = var1.getWidth();
         int var5 = var1.getHeight();

         int var6;
         for(var6 = 1; var2 < var4 || var3 < var5; var6 *= 2) {
            var2 *= 2;
            var3 *= 2;
         }

         this.a = var2;
         BufferedImage var7 = new BufferedImage(var2, var3, 2);
         Graphics var8 = var7.getGraphics();
         var8.drawImage(var1, 0, 0, (ImageObserver)null);
         boolean var9 = var1.getHeight() == 32 * var6;
         if (var9) {
            var8.setColor(new Color(0, 0, 0, 0));
            var8.fillRect(0, 32 * var6, 64 * var6, 32 * var6);
            var8.drawImage(var7, 24 * var6, 48 * var6, 20 * var6, 52 * var6, 4 * var6, 16 * var6, 8 * var6, 20 * var6, (ImageObserver)null);
            var8.drawImage(var7, 28 * var6, 48 * var6, 24 * var6, 52 * var6, 8 * var6, 16 * var6, 12 * var6, 20 * var6, (ImageObserver)null);
            var8.drawImage(var7, 20 * var6, 52 * var6, 16 * var6, 64 * var6, 8 * var6, 20 * var6, 12 * var6, 32 * var6, (ImageObserver)null);
            var8.drawImage(var7, 24 * var6, 52 * var6, 20 * var6, 64 * var6, 4 * var6, 20 * var6, 8 * var6, 32 * var6, (ImageObserver)null);
            var8.drawImage(var7, 28 * var6, 52 * var6, 24 * var6, 64 * var6, 0, 20 * var6, 4 * var6, 32 * var6, (ImageObserver)null);
            var8.drawImage(var7, 32 * var6, 52 * var6, 28 * var6, 64 * var6, 12 * var6, 20 * var6, 16 * var6, 32 * var6, (ImageObserver)null);
            var8.drawImage(var7, 40 * var6, 48 * var6, 36 * var6, 52 * var6, 44 * var6, 16 * var6, 48 * var6, 20 * var6, (ImageObserver)null);
            var8.drawImage(var7, 44 * var6, 48 * var6, 40 * var6, 52 * var6, 48 * var6, 16 * var6, 52 * var6, 20 * var6, (ImageObserver)null);
            var8.drawImage(var7, 36 * var6, 52 * var6, 32 * var6, 64 * var6, 48 * var6, 20 * var6, 52 * var6, 32 * var6, (ImageObserver)null);
            var8.drawImage(var7, 40 * var6, 52 * var6, 36 * var6, 64 * var6, 44 * var6, 20 * var6, 48 * var6, 32 * var6, (ImageObserver)null);
            var8.drawImage(var7, 44 * var6, 52 * var6, 40 * var6, 64 * var6, 40 * var6, 20 * var6, 44 * var6, 32 * var6, (ImageObserver)null);
            var8.drawImage(var7, 48 * var6, 52 * var6, 44 * var6, 64 * var6, 52 * var6, 20 * var6, 56 * var6, 32 * var6, (ImageObserver)null);
         }

         var8.dispose();
         this.a = ((DataBufferInt)var7.getRaster().getDataBuffer()).getData();
         this.b(0, 0, 32 * var6, 16 * var6);
         if (var9) {
            this.a(32 * var6, 0, 64 * var6, 32 * var6);
         }

         this.b(0, 16 * var6, 64 * var6, 32 * var6);
         this.b(16 * var6, 48 * var6, 48 * var6, 64 * var6);
         return var7;
      }
   }

   public void a() {
   }

   private void a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a;
      int var6 = this.a;

      int var7;
      int var8;
      for(var7 = var1; var7 < var3; ++var7) {
         for(var8 = var2; var8 < var4; ++var8) {
            if ((var5[var7 + var8 * var6] >> 24 & 255) < 128) {
               return;
            }
         }
      }

      for(var7 = var1; var7 < var3; ++var7) {
         for(var8 = var2; var8 < var4; ++var8) {
            var5[var7 + var8 * var6] &= 16777215;
         }
      }

   }

   private void b(int var1, int var2, int var3, int var4) {
      int[] var5 = this.a;
      int var6 = this.a;

      for(int var7 = var1; var7 < var3; ++var7) {
         for(int var8 = var2; var8 < var4; ++var8) {
            var5[var7 + var8 * var6] |= -16777216;
         }
      }

   }
}
