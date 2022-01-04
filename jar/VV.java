public final class Vv implements Vp {
   public boolean a(SJ var1, aej var2) {
      if (var1.b() == 3 && var1.a() == 3) {
         for(int var3 = 0; var3 < var1.b(); ++var3) {
            for(int var4 = 0; var4 < var1.a(); ++var4) {
               Vh var5 = var1.b(var3, var4);
               if (var5.isEmpty()) {
                  return false;
               }

               SZ var6 = var5.a();
               if (var3 == 1 && var4 == 1) {
                  if (var6 != RT.c) {
                     return false;
                  }
               } else if (var6 != RT.g) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public Vh a() {
      return Vh.a;
   }

   public acz<Vh> a(SJ var1) {
      return acz.a(var1.getSizeInventory(), Vh.a);
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }
}
