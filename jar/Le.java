public final class le {
   public final String a;
   public final String b;

   private le(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public static le a(String var0) {
      int var1 = var0.indexOf(61);
      if (var1 == -1) {
         return new le(var0, (String)null);
      } else {
         String var2 = var0.substring(0, var1);
         String var3 = var1 == var0.length() - 1 ? "" : var0.substring(var1 + 1);
         return new le(var2, var3);
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof le)) {
         return false;
      } else {
         le var2 = (le)var1;
         return this.a.equals(var2.a) && this.b.equals(var2.b);
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ this.b.hashCode();
   }

   public String toString() {
      return this.a + '=' + this.b;
   }
}
