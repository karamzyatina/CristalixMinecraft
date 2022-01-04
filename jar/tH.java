import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.entity.EntityPlayer;
import dev.xdark.clientapi.item.ItemBlock;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.util.EnumFacing;
import dev.xdark.clientapi.world.World;
import java.util.List;

public class TH extends SZ implements ItemBlock {
   protected final nh a;

   public TH(nh var1) {
      this.a = var1;
   }

   public abN a(Rn var1, aej var2, acV var3, abU var4, abP var5, float var6, float var7, float var8) {
      sD var9 = var2.a(var3);
      nh var10 = var9.a();
      if (!var10.a((aec)var2, (acV)var3)) {
         var3 = var3.a(var5);
      }

      Vh var11 = var1.a((abU)var4);
      if (!var11.isEmpty() && var1.a(var3, var5, var11) && var2.a(this.a, var3, false, var5, (NN)null)) {
         int var12 = this.getMetadata(var11.getMetadata());
         sD var13 = this.a.a(var2, var3.a, var3.b, var3.c, var5, var6, var7, var8, var12, var1);
         if (var2.a((acV)var3, (sD)var13, 11)) {
            var13 = var2.a(var3);
            if (var13.a() == this.a) {
               this.a.a(var2, var3, var13, var1, var11);
            }

            sf var14 = this.a.a();
            var2.a(var1, var3, var14.c(), acI.BLOCKS, (var14.getVolume() + 1.0F) / 2.0F, var14.getPitch() * 0.8F);
            var11.shrink(1);
         }

         return abN.SUCCESS;
      } else {
         return abN.FAIL;
      }
   }

   public boolean a(aej var1, acV var2, abP var3, Rn var4, Vh var5) {
      nh var6 = var1.a(var2).a();
      if (var6 == RQ.aa) {
         var3 = abP.UP;
      } else if (!var6.a((aec)var1, (acV)var2)) {
         var2 = var2.a(var3);
      }

      return var1.a(this.a, var2, false, var3, (NN)null);
   }

   public String b(Vh var1) {
      return this.a.getTranslationKey();
   }

   public String getTranslationKey() {
      return this.a.getTranslationKey();
   }

   public KC a() {
      return this.a.a();
   }

   public void a(KC var1, acz<Vh> var2) {
      if (this.a(var1)) {
         this.a.a(var1, var2);
      }

   }

   public void a(Vh var1, aej var2, List<String> var3, JY var4) {
      super.a(var1, var2, var3, var4);
      this.a.a(var1, var2, var3, var4);
   }

   public nh a() {
      return this.a;
   }

   public nh b() {
      return this.a;
   }

   public boolean canPlaceOnSide(World var1, BlockPos var2, EnumFacing var3, EntityPlayer var4, ItemStack var5) {
      return this.a((aej)d.a(var1), (acV)d.a(var2), (abP)d.a(var3), (Rn)d.a(var4), (Vh)d.a(var5));
   }

   public Block getBlock() {
      return (Block)d.a(this.a);
   }
}
