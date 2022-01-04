import java.io.IOException;

public class II implements IO {
   private static final acC a = new acC("textures/colormap/foliage.png");

   public void onResourceManagerReload(IN var1) {
      try {
         adU.a(HS.a(var1, a));
      } catch (IOException var3) {
      }

   }
}
