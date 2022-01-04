import dev.xdark.clientapi.biome.Biome;
import dev.xdark.clientapi.block.state.BlockState;
import dev.xdark.clientapi.tile.TileEntity;
import dev.xdark.clientapi.world.BlockAccess;

public interface aec extends BlockAccess {
   aaD a(acV var1);

   aaD a(int var1, int var2, int var3);

   int getCombinedLight(int var1, int var2, int var3, int var4);

   int a(acV var1, int var2);

   sD a(acV var1);

   sD a(double var1, double var3, double var5);

   sD a(int var1, int var2, int var3);

   boolean a(acV var1);

   boolean isAirBlock(int var1, int var2, int var3);

   aeu a(int var1, int var2, int var3);

   aeu a(acV var1);

   int a(acV var1, abP var2);

   int a(int var1, int var2, int var3, abP var4);

   aet a();

   default TileEntity getTileEntity(int var1, int var2, int var3) {
      return (TileEntity)d.a(this.a(var1, var2, var3));
   }

   default BlockState getBlockState(int var1, int var2, int var3) {
      return (BlockState)d.a(this.a(var1, var2, var3));
   }

   default BlockState getBlockState(double var1, double var3, double var5) {
      return (BlockState)d.a(this.a(var1, var3, var5));
   }

   default Biome getBiome(int var1, int var2, int var3) {
      return (Biome)d.a(this.a(var1, var2, var3));
   }
}
