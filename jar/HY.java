import dev.xdark.clientapi.texture.DynamicTexture;
import java.awt.image.BufferedImage;

public class Hy extends Hx implements DynamicTexture {
   private final int[] a;
   private final int b;
   private final int c;
   private boolean e;

   public Hy(BufferedImage var1) {
      this(var1.getWidth(), var1.getHeight());
      var1.getRGB(0, 0, var1.getWidth(), var1.getHeight(), this.a, 0, var1.getWidth());
      this.updateDynamicTexture();
   }

   public Hy(int var1, int var2) {
      this.e = false;
      this.b = var1;
      this.c = var2;
      this.a = new int[var1 * var2 * 3];
      if (afT.ad()) {
         akG.a(this.getGlTextureId(), var1, var2, this);
         this.e = true;
      } else {
         HS.a(this.getGlTextureId(), var1, var2);
      }

   }

   public void a(IN var1) {
   }

   public void updateDynamicTexture() {
      if (afT.ad()) {
         if (!this.e) {
            akG.a(this.getGlTextureId(), this.b, this.c, this);
            this.e = true;
         }

         akG.a(this.getGlTextureId(), this.a, this.b, this.c, this);
      } else {
         HS.a(this.getGlTextureId(), this.a, this.b, this.c);
      }

   }

   public int[] getTextureData() {
      return this.a;
   }
}
