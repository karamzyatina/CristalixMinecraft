public class VH implements Vp {
   public boolean a(SJ var1, aej var2) {
      int var3 = 0;
      int var4 = 0;

      for(int var5 = 0; var5 < var1.getSizeInventory(); ++var5) {
         Vh var6 = var1.a(var5);
         if (!var6.isEmpty()) {
            if (mY.a(var6.a()) instanceof qQ) {
               ++var3;
            } else {
               if (var6.a() != RT.aI) {
                  return false;
               }

               ++var4;
            }

            if (var4 > 1 || var3 > 1) {
               return false;
            }
         }
      }

      return var3 == 1 && var4 == 1;
   }

   public Vh a() {
      return Vh.a;
   }

   public acz<Vh> a(SJ var1) {
      acz var2 = acz.a(var1.getSizeInventory(), Vh.a);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         Vh var4 = var1.a(var3);
         if (var4.a().hasContainerItem()) {
            var2.set(var3, new Vh(var4.a().b()));
         }
      }

      return var2;
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, int var2) {
      return var1 * var2 >= 2;
   }
}
