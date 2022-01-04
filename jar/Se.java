import dev.xdark.clientapi.inventory.Inventory;
import dev.xdark.clientapi.item.ItemStack;

public interface SE extends aeg, Inventory {
   int getSizeInventory();

   boolean isEmpty();

   Vh a(int var1);

   Vh a(int var1, int var2);

   Vh b(int var1);

   void a(int var1, Vh var2);

   int getInventoryStackLimit();

   void b();

   boolean b(Rn var1);

   void b(Rn var1);

   void c(Rn var1);

   boolean b(int var1, Vh var2);

   int getField(int var1);

   void setField(int var1, int var2);

   int getFieldCount();

   void clear();

   default ItemStack getStackInSlot(int var1) {
      return (ItemStack)d.a(this.a(var1));
   }

   default ItemStack decrStackSize(int var1, int var2) {
      return (ItemStack)d.a(this.a(var1, var2));
   }

   default ItemStack removeStackFromSlot(int var1) {
      return (ItemStack)d.a(this.b(var1));
   }

   default void setInventorySlotContents(int var1, ItemStack var2) {
      this.a(var1, (Vh)d.a(var2));
   }

   default boolean isItemValidForSlot(int var1, ItemStack var2) {
      return this.b(var1, (Vh)d.a(var2));
   }
}
