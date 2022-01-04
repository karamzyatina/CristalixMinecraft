public class ajN {
   private String a = null;
   private acC a = null;
   private final int b;
   private int[] b = null;
   private acC[] a = null;
   private int[] c = null;
   private aeu[] a = null;
   private agM a = null;
   private agJ a = null;
   public int[] a = null;
   public int a = 1;
   private agN[] a = null;

   public ajN(String var1, acC var2, int var3, int[] var4, int[] var5, aeu[] var6, agM var7, agJ var8, agN[] var9) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.b = var4;
      this.c = var5;
      this.a = var6;
      this.a = var7;
      this.a = var8;
      this.a = var9;
   }

   public boolean a(IN var1, String var2) {
      if (this.b != null && this.b.length != 0) {
         if (this.a != null) {
            return true;
         } else {
            this.a = new acC[this.b.length];
            boolean var3 = this.a.startsWith("mcpatcher/mob/");
            acC var4 = ajK.a(this.a, var3);
            if (var4 == null) {
               afT.b("Invalid path: " + this.a.getPath());
               return false;
            } else {
               int var5;
               int var6;
               for(var5 = 0; var5 < this.a.length; ++var5) {
                  var6 = this.b[var5];
                  if (var6 <= 1) {
                     this.a[var5] = this.a;
                  } else {
                     acC var7 = ajK.a(var4, var6);
                     if (var7 == null) {
                        afT.b("Invalid path: " + this.a.getPath());
                        return false;
                     }

                     if (!var1.a(var7)) {
                        afT.b("Texture not found: " + var7.getPath());
                        return false;
                     }

                     this.a[var5] = var7;
                  }
               }

               if (this.c != null) {
                  int[] var8;
                  if (this.c.length > this.a.length) {
                     afT.b("More weights defined than skins, trimming weights: " + var2);
                     var8 = new int[this.a.length];
                     System.arraycopy(this.c, 0, var8, 0, var8.length);
                     this.c = var8;
                  }

                  if (this.c.length < this.a.length) {
                     afT.b("Less weights defined than skins, expanding weights: " + var2);
                     var8 = new int[this.a.length];
                     System.arraycopy(this.c, 0, var8, 0, this.c.length);
                     var6 = amc.a(this.c);

                     for(int var9 = this.c.length; var9 < var8.length; ++var9) {
                        var8[var9] = var6;
                     }

                     this.c = var8;
                  }

                  this.a = new int[this.c.length];
                  var5 = 0;

                  for(var6 = 0; var6 < this.c.length; ++var6) {
                     if (this.c[var6] < 0) {
                        afT.b("Invalid weight: " + this.c[var6]);
                        return false;
                     }

                     var5 += this.c[var6];
                     this.a[var6] = var5;
                  }

                  this.a = var5;
                  if (this.a <= 0) {
                     afT.b("Invalid sum of all weights: " + var5);
                     this.a = 1;
                  }
               }

               if (this.a == agC.a) {
                  afT.b("Invalid professions or careers: " + var2);
                  return false;
               } else {
                  return true;
               }
            }
         }
      } else {
         afT.b("Invalid skins for rule: " + this.b);
         return false;
      }
   }

   public boolean a(ajJ var1) {
      if (this.a != null && !agI.a(var1.a(), this.a)) {
         return false;
      } else if (this.a != null && !this.a.a(var1.c())) {
         return false;
      } else {
         if (this.a != null) {
            String var2 = var1.a();
            if (!this.a.a(var2)) {
               return false;
            }
         }

         if (this.a != null && var1 instanceof ajL) {
            ajL var11 = (ajL)var1;
            NN var3 = var11.a();
            if (var3 instanceof QZ) {
               QZ var4 = (QZ)var3;
               int var5 = var4.i();
               int var6 = var4.y;
               if (var5 >= 0 && var6 >= 0) {
                  boolean var7 = false;
                  agN[] var8 = this.a;
                  int var9 = 0;

                  for(int var10 = var8.length; var9 < var10; ++var9) {
                     if (var8[var9].a(var5, var6)) {
                        var7 = true;
                        break;
                     }
                  }

                  return var7;
               }

               return false;
            }
         }

         return true;
      }
   }

   public acC a(acC var1, int var2) {
      if (this.a != null && this.a.length != 0) {
         int var3 = 0;
         if (this.c == null) {
            var3 = var2 % this.a.length;
         } else {
            int var4 = var2 % this.a;

            for(int var5 = 0; var5 < this.a.length; ++var5) {
               if (this.a[var5] > var4) {
                  var3 = var5;
                  break;
               }
            }
         }

         return this.a[var3];
      } else {
         return var1;
      }
   }
}
