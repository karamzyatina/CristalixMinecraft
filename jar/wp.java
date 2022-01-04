import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

final class WP implements WC {
   public void a(ByteBuf var1, Optional<sD> var2) {
      if (var2.isPresent()) {
         NetUtil.writeVarInt(mY.e((sD)var2.get()), var1);
      } else {
         NetUtil.writeVarInt(0, var1);
      }

   }

   public Optional<sD> a(ByteBuf var1) {
      int var2 = NetUtil.readVarInt(var1);
      return var2 == 0 ? Optional.empty() : Optional.of(mY.c(var2));
   }

   public WB<Optional<sD>> a(int var1) {
      return new WB(var1, this);
   }

   public Optional<sD> a(Optional<sD> var1) {
      return var1;
   }

   // $FF: synthetic method
   public Object copyValue(Object var1) {
      return this.a((Optional)var1);
   }
}
