import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

class Kg {
   private final Vp a;
   private final List<Vq> a;
   private final int a;
   private final int[] a;
   private final int b;
   private final BitSet a;
   private final IntList a;
   // $FF: synthetic field
   final Kf a;

   public Kg(Kf var1, Vp var2) {
      this.a = var1;
      this.a = new ArrayList();
      this.a = new IntArrayList();
      this.a = var2;
      this.a.addAll(var2.a());
      this.a.removeIf((var0) -> {
         return var0 == Vq.a;
      });
      this.a = this.a.size();
      this.a = this.a();
      this.b = this.a.length;
      this.a = new BitSet(this.a + this.b + this.a + this.a * this.b);

      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         IntList var4 = ((Vq)this.a.get(var3)).a();

         for(int var5 = 0; var5 < this.b; ++var5) {
            if (var4.contains(this.a[var5])) {
               this.a.set(this.a(true, var5, var3));
            }
         }
      }

   }

   public boolean a(int var1, IntList var2) {
      if (var1 <= 0) {
         return true;
      } else {
         int var3;
         for(var3 = 0; this.a(var1); ++var3) {
            this.a.a(this.a[this.a.getInt(0)], var1);
            int var4 = this.a.size() - 1;
            this.a(this.a.getInt(var4));

            for(int var5 = 0; var5 < var4; ++var5) {
               this.a((var5 & 1) == 0, this.a.get(var5), this.a.get(var5 + 1));
            }

            this.a.clear();
            this.a.clear(0, this.a + this.b);
         }

         boolean var10 = var3 == this.a;
         boolean var11 = var10 && var2 != null;
         if (var11) {
            var2.clear();
         }

         this.a.clear(0, this.a + this.b + this.a);
         int var6 = 0;
         acz var7 = this.a.a();

         for(int var8 = 0; var8 < var7.size(); ++var8) {
            if (var11 && var7.get(var8) == Vq.a) {
               var2.add(0);
            } else {
               for(int var9 = 0; var9 < this.b; ++var9) {
                  if (this.b(false, var6, var9)) {
                     this.a(true, var9, var6);
                     Kf.a(this.a, this.a[var9], var1);
                     if (var11) {
                        var2.add(this.a[var9]);
                     }
                  }
               }

               ++var6;
            }
         }

         return var10;
      }
   }

   private int[] a() {
      IntAVLTreeSet var1 = new IntAVLTreeSet();
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         Vq var3 = (Vq)var2.next();
         var1.addAll(var3.a());
      }

      IntIterator var4 = var1.iterator();

      while(var4.hasNext()) {
         if (!this.a.a(var4.nextInt())) {
            var4.remove();
         }
      }

      return var1.toIntArray();
   }

   private boolean a(int var1) {
      int var2 = this.b;

      for(int var3 = 0; var3 < var2; ++var3) {
         if (this.a.a.get(this.a[var3]) >= var1) {
            this.a(false, var3);

            while(!this.a.isEmpty()) {
               int var4 = this.a.size();
               boolean var5 = (var4 & 1) == 1;
               int var6 = this.a.getInt(var4 - 1);
               if (!var5 && !this.b(var6)) {
                  break;
               }

               int var7 = var5 ? this.a : var2;

               int var8;
               for(var8 = 0; var8 < var7; ++var8) {
                  if (!this.a(var5, var8) && this.a(var5, var6, var8) && this.b(var5, var6, var8)) {
                     this.a(var5, var8);
                     break;
                  }
               }

               var8 = this.a.size();
               if (var8 == var4) {
                  this.a.removeInt(var8 - 1);
               }
            }

            if (!this.a.isEmpty()) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean b(int var1) {
      return this.a.get(this.a(var1));
   }

   private void a(int var1) {
      this.a.set(this.a(var1));
   }

   private int a(int var1) {
      return this.a + this.b + var1;
   }

   private boolean a(boolean var1, int var2, int var3) {
      return this.a.get(this.a(var1, var2, var3));
   }

   private boolean b(boolean var1, int var2, int var3) {
      return var1 != this.a.get(1 + this.a(var1, var2, var3));
   }

   private void a(boolean var1, int var2, int var3) {
      this.a.flip(1 + this.a(var1, var2, var3));
   }

   private int a(boolean var1, int var2, int var3) {
      int var4 = var1 ? var2 * this.a + var3 : var3 * this.a + var2;
      return this.a + this.b + this.a + 2 * var4;
   }

   private void a(boolean var1, int var2) {
      this.a.set(this.a(var1, var2));
      this.a.add(var2);
   }

   private boolean a(boolean var1, int var2) {
      return this.a.get(this.a(var1, var2));
   }

   private int a(boolean var1, int var2) {
      return (var1 ? 0 : this.a) + var2;
   }

   public int a(int var1, IntList var2) {
      int var3 = 0;
      int var4 = Math.min(var1, this.a()) + 1;

      while(true) {
         while(true) {
            int var5 = (var3 + var4) / 2;
            if (this.a(var5, (IntList)null)) {
               if (var4 - var3 <= 1) {
                  if (var5 > 0) {
                     this.a(var5, var2);
                  }

                  return var5;
               }

               var3 = var5;
            } else {
               var4 = var5;
            }
         }
      }
   }

   private int a() {
      int var1 = Integer.MAX_VALUE;
      Iterator var2 = this.a.iterator();

      while(var2.hasNext()) {
         Vq var3 = (Vq)var2.next();
         int var4 = 0;

         int var5;
         for(IntListIterator var6 = var3.a().iterator(); var6.hasNext(); var4 = Math.max(var4, this.a.a.get(var5))) {
            var5 = var6.next();
         }

         if (var1 > 0) {
            var1 = Math.min(var1, var4);
         }
      }

      return var1;
   }
}
