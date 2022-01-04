import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

public final class alV implements Comparator {
   public static final alV a = new alV();

   private alV() {
   }

   public int a(DisplayMode var1, DisplayMode var2) {
      int var3 = var1.getWidth();
      int var4 = var2.getWidth();
      if (var3 != var4) {
         return var3 - var4;
      } else if ((var3 = var1.getHeight()) != (var4 = var2.getHeight())) {
         return var3 - var4;
      } else if ((var3 = var1.getBitsPerPixel()) != (var4 = var2.getBitsPerPixel())) {
         return var3 - var4;
      } else {
         return (var3 = var1.getFrequency()) != (var4 = var2.getFrequency()) ? var3 - var4 : 0;
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((DisplayMode)var1, (DisplayMode)var2);
   }
}
