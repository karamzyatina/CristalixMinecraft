import dev.xdark.clientapi.resource.ResourceManager;
import dev.xdark.clientapi.texture.Texture;

public interface HA extends Texture {
   void setBlurMipmap(boolean var1, boolean var2);

   void restoreLastBlurMipmap();

   void a(IN var1);

   int getGlTextureId();

   ako a();

   default void deleteGlTexture() {
      HS.a(this.getGlTextureId());
   }

   default void loadTexture(ResourceManager var1) {
      this.a((IN)var1);
   }
}
