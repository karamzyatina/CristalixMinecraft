import com.google.common.base.MoreObjects;
import dev.xdark.feder.NetUtil;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Iterator;
import java.util.List;

public class YU implements Ws {
   private YW a;
   private final List<YX> a = new ReferenceArrayList();

   public void read(ByteBuf var1) {
      // $FF: Couldn't be decompiled
   }

   public void write(ByteBuf var1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Xe var1) {
      var1.a(this);
   }

   public List<YX> a() {
      return this.a;
   }

   public YW a() {
      return this.a;
   }

   public String toString() {
      return MoreObjects.toStringHelper(this).add("action", this.a).add("entries", this.a).toString();
   }
}
