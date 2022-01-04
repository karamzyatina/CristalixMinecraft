import java.nio.IntBuffer;
import java.util.Arrays;

public final class akg {
   private final IntBuffer a;
   private final int a;
   private final boolean[] a;
   private final boolean[] b;

   public akg(IntBuffer var1, int var2) {
      this.a = var1;
      this.a = var2;
      this.a = new boolean[var1.capacity()];
      this.b = new boolean[var1.capacity()];
   }

   public int a(int var1) {
      return this.a(var1, this.a[var1]);
   }

   public int b(int var1) {
      return this.a(var1, !this.a[var1]);
   }

   private int a(int var1, boolean var2) {
      int var3 = var2 ? this.a : 0;
      return this.a.get(var3 + var1);
   }

   public void a(int var1) {
      this.a[var1] = !this.a[var1];
      this.b[var1] = true;
   }

   public boolean a(int var1) {
      return this.b[var1];
   }

   public void a() {
      Arrays.fill(this.a, false);
      Arrays.fill(this.b, false);
   }
}
