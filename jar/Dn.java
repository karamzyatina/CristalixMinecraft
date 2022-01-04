import dev.xdark.clientapi.block.state.BlockStateContainer;
import dev.xdark.clientapi.renderer.block.model.multipart.Condition;
import java.util.function.Predicate;

public interface DN extends Condition {
   DN a = new DO();
   DN b = new DP();

   Predicate<sD> a(sy var1);

   default Predicate getPredicate(BlockStateContainer var1) {
      return this.a((sy)d.a(var1));
   }
}
