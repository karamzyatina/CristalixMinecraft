import dev.xdark.clientapi.inventory.ContainerLocalMenu;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Map;

public class AG extends SH implements aee, ContainerLocalMenu {
   private final String a;
   private final Int2IntMap a = new Int2IntOpenHashMap();
   private final Map<Integer, Integer> a;

   public AG(String var1, adu var2, int var3) {
      super(var2, var3);
      this.a = this.a;
      this.a = var1;
   }

   public int getField(int var1) {
      return this.a.get(var1);
   }

   public void setField(int var1, int var2) {
      this.a.put(var1, var2);
   }

   public int getFieldCount() {
      return this.a.size();
   }

   public String a() {
      return this.a;
   }

   public RY a(Rs var1, Rn var2) {
      throw new UnsupportedOperationException();
   }
}
