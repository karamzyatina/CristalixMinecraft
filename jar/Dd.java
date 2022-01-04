import dev.xdark.clientapi.renderer.block.model.VariantList;
import java.util.List;

public final class DD implements VariantList {
   private final List<DB> a;

   public DD(List<DB> var1) {
      this.a = var1;
   }

   public List<DB> a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof DD) {
         DD var2 = (DD)var1;
         return this.a.equals(var2.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   // $FF: synthetic method
   public List getVariants() {
      return this.a;
   }
}
