import io.netty.util.Recycler;
import io.netty.util.Recycler.Handle;

final class Lz extends Recycler {
   Lz(int var1) {
      super(var1);
   }

   protected LA a(Handle<LA> var1) {
      return new LA(var1, (Lz)null);
   }

   // $FF: synthetic method
   protected Object newObject(Handle var1) {
      return this.a(var1);
   }
}
