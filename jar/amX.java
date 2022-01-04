import java.util.Arrays;

public final class amx {
   private final String a;
   private final String b;
   private final amF a;
   private final Object[] a;

   public amx(String var1, String var2, amF var3, Object... var4) {
      this.a = var1;
      this.b = var2;
      this.a = var3;
      this.a = var4;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public amF a() {
      return this.a;
   }

   public int a() {
      return this.a.length;
   }

   public Object a(int var1) {
      return this.a[var1];
   }

   Object[] a() {
      return this.a;
   }

   public int b() {
      char var1 = this.b.charAt(0);
      return var1 != 'J' && var1 != 'D' ? 1 : 2;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof amx)) {
         return false;
      } else {
         amx var2 = (amx)var1;
         return this.a.equals(var2.a) && this.b.equals(var2.b) && this.a.equals(var2.a) && Arrays.equals(this.a, var2.a);
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 8) ^ Integer.rotateLeft(this.a.hashCode(), 16) ^ Integer.rotateLeft(Arrays.hashCode(this.a), 24);
   }

   public String toString() {
      return this.a + " : " + this.b + ' ' + this.a + ' ' + Arrays.toString(this.a);
   }
}
