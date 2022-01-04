import dev.xdark.clientapi.block.Block;
import dev.xdark.clientapi.block.properties.Property;
import dev.xdark.clientapi.block.state.BlockState;
import java.util.Collection;
import java.util.Map;

public interface sD extends BlockState, sB, sC {
   int getId();

   void a(int var1);

   Collection<so<?>> getPropertyKeys();

   <T extends Comparable<T>> T a(so<T> var1);

   <T extends Comparable<T>, V extends T> sD a(so<T> var1, V var2);

   <T extends Comparable<T>> sD a(so<T> var1);

   Map<so<?>, Comparable<?>> getProperties();

   nh a();

   CV a();

   void a(CV var1);

   Dv a();

   void a(Dv var1);

   default Block getBlock() {
      return (Block)this.a();
   }

   default Comparable getValue(Property var1) {
      return this.a((so)d.a(var1));
   }

   default BlockState withProperty(Property var1, Comparable var2) {
      return (BlockState)this.a((so)d.a(var1), var2);
   }

   default BlockState cycleProperty(Property var1) {
      return (BlockState)this.a((so)d.a(var1));
   }
}
