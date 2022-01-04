import it.unimi.dsi.fastutil.floats.FloatOpenHashSet;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.objects.Object2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.Object2FloatSortedMap.FastSortedEntrySet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class agr {
   private final ags[] a;
   private final Map<int[], acC> a;
   public static final acC a = new acC("");

   public agr(ags[] var1) {
      this.a = new Object2ObjectOpenCustomHashMap(IntArrays.HASH_STRATEGY);
      this.a = var1;
   }

   public acC a(Vh var1, aej var2, Oh var3) {
      int[] var4 = this.a(var1, var2, var3);
      return var4 == null ? null : (acC)this.a.get(var4);
   }

   public void a(Vh var1, aej var2, Oh var3, acC var4) {
      int[] var5 = this.a(var1, var2, var3);
      if (var5 != null) {
         this.a.put(var5, var4);
      }

   }

   private int[] a(Vh var1, aej var2, Oh var3) {
      ags[] var4 = this.a;
      int[] var5 = new int[var4.length];

      for(int var6 = 0; var6 < var5.length; ++var6) {
         Integer var7 = var4[var6].a(var1, var2, var3);
         if (var7 == null) {
            return null;
         }

         var5[var6] = var7;
      }

      return var5;
   }

   public static agr a(List<De> var0) {
      if (var0.isEmpty()) {
         return null;
      } else {
         LinkedHashMap var1 = new LinkedHashMap();
         Iterator var2 = var0.iterator();

         while(true) {
            FastSortedEntrySet var5;
            int var6;
            do {
               if (!var2.hasNext()) {
                  Set var12 = var1.entrySet();
                  int var13 = var12.size();
                  ObjectArrayList var14 = new ObjectArrayList(var13);
                  Iterator var15 = var12.iterator();

                  while(var13-- > 0) {
                     Entry var16 = (Entry)var15.next();
                     FloatSet var18 = (FloatSet)var16.getValue();
                     ags var19 = new ags((acC)var16.getKey(), var18.toFloatArray());
                     var14.add(var19);
                  }

                  ags[] var17 = (ags[])((ags[])var14.toArray(new ags[0]));
                  return new agr(var17);
               }

               De var3 = (De)var2.next();
               Object2FloatLinkedOpenHashMap var4 = var3.a;
               var5 = var4.object2FloatEntrySet();
               var6 = var5.size();
            } while(var6 == 0);

            float var10;
            Object var11;
            for(ObjectBidirectionalIterator var7 = var5.fastIterator(); var6-- > 0; ((FloatSet)var11).add(var10)) {
               it.unimi.dsi.fastutil.objects.Object2FloatMap.Entry var8 = (it.unimi.dsi.fastutil.objects.Object2FloatMap.Entry)var7.next();
               acC var9 = (acC)var8.getKey();
               var10 = var8.getFloatValue();
               var11 = (FloatSet)var1.get(var9);
               if (var11 == null) {
                  var11 = new FloatOpenHashSet();
                  var1.put(var9, var11);
               }
            }
         }
      }
   }

   public String toString() {
      return "properties: " + this.a.length + ", models: " + this.a.size();
   }
}
