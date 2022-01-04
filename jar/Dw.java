import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.renderer.block.statemap.BlockStateMapper;
import dev.xdark.clientapi.renderer.block.statemap.StateMapper;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class DW implements BlockStateMapper {
   private Map<sD, Dv> a;

   public void a(nh var1, DY var2) {
      var1.a(var2);
   }

   public void a(nh... var1) {
      nh[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         nh var5 = var2[var4];
         var5.a();
      }

   }

   public Map<sD, Dv> putAllStateModelLocations() {
      Object var1 = this.a;
      if (var1 == null) {
         var1 = new Reference2ObjectOpenHashMap(5228);
         adr var2 = mY.a;
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            ((Map)var1).putAll(this.a((nh)var3.next()));
         }

         this.a = (Map)var1;
      }

      return (Map)var1;
   }

   public Set<acC> a(nh var1) {
      if (var1.a()) {
         return Collections.emptySet();
      } else {
         DY var2 = var1.a();
         if (var2 == null) {
            return Collections.singleton(var1.a());
         } else {
            Collection var3 = var2.a(var1).values();
            int var4 = var3.size();
            if (var4 == 0) {
               return Collections.emptySet();
            } else {
               LinkedHashSet var5 = new LinkedHashSet(var4, 1.0F);
               Iterator var6 = var3.iterator();

               while(var4-- > 0) {
                  Dv var7 = (Dv)var6.next();
                  var5.add(new acC(var7.getNamespace(), var7.getPath()));
               }

               return var5;
            }
         }
      }
   }

   public Map<sD, Dv> a(nh var1) {
      if (var1.a()) {
         return Collections.emptyMap();
      } else {
         Object var2 = var1.a();
         if (var2 == null) {
            var2 = DX.a;
         }

         return ((DY)var2).a(var1);
      }
   }

   public void registerBlockStateMapper(Block var1, StateMapper var2) {
      this.a((nh)d.a(var1), (DY)d.a(var2));
   }

   public void registerBuiltInBlocks(Block... var1) {
      int var2 = var1.length;

      nh[] var3;
      for(var3 = new nh[var2]; var2-- > 0; var3[var2] = (nh)d.a(var1[var2])) {
      }

      this.a(var3);
   }

   public Set getBlockStateLocations(Block var1) {
      return this.a((nh)d.a(var1));
   }

   public Map getVariants(Block var1) {
      return this.a((nh)d.a(var1));
   }
}
