import dev.xdark.clientapi.block.state.BlockStateContainer;
import dev.xdark.clientapi.renderer.block.model.multipart.Multipart;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DQ implements Multipart {
   private final List<DS> a;
   private sy a;
   private Set<DD> a;

   public DQ(List<DS> var1) {
      this.a = var1;
   }

   public List<DS> getSelectors() {
      return this.a;
   }

   public Set<DD> getVariants() {
      Set var1 = this.a;
      if (var1 == null) {
         List var2 = this.a;
         int var3 = var2.size();
         if (var3 == 0) {
            return this.a = Collections.emptySet();
         }

         var1 = this.a = new HashSet(var3, 1.0F);

         while(var3-- > 0) {
            var1.add(((DS)var2.get(var3)).a());
         }
      }

      return var1;
   }

   public void a(sy var1) {
      this.a = var1;
   }

   public sy a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         if (var1 instanceof DQ) {
            DQ var2 = (DQ)var1;
            if (this.a.equals(var2.a)) {
               if (this.a == null) {
                  return var2.a == null;
               }

               return this.a.equals(var2.a);
            }
         }

         return false;
      }
   }

   public int hashCode() {
      return 31 * this.a.hashCode() + (this.a == null ? 0 : this.a.hashCode());
   }

   public void setStateContainer(BlockStateContainer var1) {
      this.a((sy)d.a(var1));
   }

   public BlockStateContainer getStateContainer() {
      return (BlockStateContainer)d.a(this.a);
   }
}
