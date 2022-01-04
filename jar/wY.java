import com.google.common.base.MoreObjects;
import java.util.List;

public class wy {
   private final List<wq> a;
   private final int a;

   public wy(List<wq> var1, int var2) {
      this.a = var1;
      this.a = var2;
   }

   public wq a(int var1) {
      return var1 >= 0 && var1 < this.a.size() ? (wq)MoreObjects.firstNonNull(this.a.get(var1), wu.a) : wu.a;
   }

   public int a() {
      return this.a;
   }
}
