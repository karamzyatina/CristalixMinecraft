import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.renderer.color.BlockColor;
import dev.xdark.clientapi.world.BlockAccess;

public interface EN extends BlockColor {
   int a(sD var1, aec var2, acV var3, int var4);

   default int colorMultiplier(BlockState var1, BlockAccess var2, BlockPos var3, int var4) {
      return this.a((sD)d.a(var1), (aec)d.a(var2), (acV)d.a(var3), var4);
   }
}
