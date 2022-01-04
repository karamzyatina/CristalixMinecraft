import dev.xdark.clientapi.item.ItemFood;
import dev.xdark.clientapi.item.ItemStack;

public interface LI extends ItemFood {
   int b(Vh var1);

   float a(Vh var1);

   boolean isWolfsFavoriteMeat();

   void a(Vh var1, aej var2, Rn var3);

   boolean isAlwaysEdible();

   default int getHealAmount(ItemStack var1) {
      return this.b((Vh)d.a(var1));
   }

   default float getSaturationModifier(ItemStack var1) {
      return this.a((Vh)d.a(var1));
   }
}
