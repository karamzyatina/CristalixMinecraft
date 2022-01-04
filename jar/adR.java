import com.google.common.base.Preconditions;
import java.util.Random;

public final class adr extends adq {
   private final K a;
   private V b;

   public adr(K var1) {
      this.a = var1;
   }

   public adr(K var1, int var2) {
      super(var2);
      this.a = var1;
   }

   public void a(int var1, K var2, V var3) {
      if (this.a.equals(var2)) {
         this.b = var3;
      }

      super.a(var1, var2, var3);
   }

   public void a() {
      Preconditions.checkNotNull(this.b, "Missing default of DefaultedMappedRegistry: " + this.a);
   }

   public int a(V var1) {
      int var2 = super.a(var1);
      return var2 == -1 ? super.a(this.b) : var2;
   }

   public K b(V var1) {
      Object var2 = super.b(var1);
      return var2 == null ? this.a : var2;
   }

   public V a(K var1) {
      Object var2 = super.a(var1);
      return var2 == null ? this.b : var2;
   }

   public V a(int var1) {
      Object var2 = super.a(var1);
      return var2 == null ? this.b : var2;
   }

   public V a(Random var1) {
      Object var2 = super.a((Random)var1);
      return var2 == null ? this.b : var2;
   }
}
