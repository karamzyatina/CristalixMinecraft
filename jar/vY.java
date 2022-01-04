public class Vy implements Vp {
   public boolean a(SJ var1, aej var2) {
      boolean var3 = false;

      for(int var4 = 0; var4 < var1.getSizeInventory(); ++var4) {
         Vh var5 = var1.a(var4);
         if (var5.a() == RT.cm) {
            if (var3) {
               return false;
            }

            if (aaH.a(var5) >= 6) {
               return false;
            }

            var3 = true;
         }
      }

      if (!var3) {
         return false;
      } else {
         return this.a(var1) != null;
      }
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

   private aaz a(SJ var1) {
      aaz[] var2 = aaz.values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         aaz var5 = var2[var4];
         if (var5.a()) {
            boolean var6 = true;
            int var9;
            if (var5.b()) {
               boolean var7 = false;
               boolean var8 = false;

               for(var9 = 0; var9 < var1.getSizeInventory(); ++var9) {
                  Vh var10 = var1.a(var9);
                  if (!var10.isEmpty() && var10.a() != RT.cm) {
                     if (var10.a() == RT.aI) {
                        if (var8) {
                           var6 = false;
                           break;
                        }

                        var8 = true;
                     } else {
                        if (var7 || !var10.a(var5.a())) {
                           var6 = false;
                           break;
                        }

                        var7 = true;
                     }
                  }
               }

               if (!var7 || !var8) {
                  var6 = false;
               }
            } else if (var1.getSizeInventory() == var5.a().length * var5.a()[0].length()) {
               int var12 = -1;

               for(int var13 = 0; var13 < var1.getSizeInventory(); ++var13) {
                  var9 = var13 / 3;
                  int var14 = var13 % 3;
                  Vh var11 = var1.a(var13);
                  if (!var11.isEmpty() && var11.a() != RT.cm) {
                     if (var11.a() != RT.aI) {
                        var6 = false;
                        break;
                     }

                     if (var12 != -1 && var12 != var11.getMetadata()) {
                        var6 = false;
                        break;
                     }

                     if (var5.a()[var9].charAt(var14) == ' ') {
                        var6 = false;
                        break;
                     }

                     var12 = var11.getMetadata();
                  } else if (var5.a()[var9].charAt(var14) != ' ') {
                     var6 = false;
                     break;
                  }
               }
            } else {
               var6 = false;
            }

            if (var6) {
               return var5;
            }
         }
      }

      return null;
   }

   public boolean a() {
      return true;
   }

   public boolean a(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }
}
