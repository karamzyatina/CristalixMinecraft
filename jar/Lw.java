import io.netty.util.Recycler;
import io.netty.util.Recycler.Handle;

final class LW extends Recycler {
   protected LV a(Handle<LV> var1) {
      return new LV(var1);
   }

   // $FF: synthetic method
   protected Object newObject(Handle var1) {
      return this.a(var1);
   }
}
