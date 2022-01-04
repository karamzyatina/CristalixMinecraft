import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.render.model.ItemCameraTransforms;
import dev.xdark.clientapi.renderer.block.model.BakedModel;
import dev.xdark.clientapi.renderer.texture.TextureAtlasSprite;
import dev.xdark.clientapi.util.EnumFacing;
import java.util.List;

public interface CV extends BakedModel {
   List<CD> a(sD var1, abP var2, long var3);

   List<CD> b(sD var1, abP var2, long var3);

   default boolean a(sD var1, abP var2, long var3) {
      return this.a(var1, var2, var3).size() != 0;
   }

   boolean isAmbientOcclusion();

   boolean isGui3d();

   boolean isBuiltInRenderer();

   HK a();

   CW a();

   Dg a();

   default boolean a(Cp var1, Bh var2, int var3, Vh var4) {
      return false;
   }

   default List getQuads(BlockState var1, EnumFacing var2, long var3) {
      return this.a((sD)d.a(var1), (abP)d.a(var2), var3);
   }

   default boolean hasQuads(BlockState var1, EnumFacing var2, long var3) {
      return this.a((sD)d.a(var1), (abP)d.a(var2), var3);
   }

   default TextureAtlasSprite getParticleTexture() {
      return (TextureAtlasSprite)d.a(this.a());
   }

   default ItemCameraTransforms getItemCameraTransforms() {
      return (ItemCameraTransforms)d.a(this.a());
   }
}
