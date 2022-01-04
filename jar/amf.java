public final class amF {
   private final int a;
   private final String a;
   private final String b;
   private final String c;
   private final boolean a;

   @Deprecated
   public amF(int var1, String var2, String var3, String var4) {
      this(var1, var2, var3, var4, var1 == 9);
   }

   public amF(int var1, String var2, String var3, String var4, boolean var5) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.a = var5;
   }

   public int a() {
      return this.a;
   }

   public String a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public boolean a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof amF)) {
         return false;
      } else {
         amF var2 = (amF)var1;
         return this.a == var2.a && this.a == var2.a && this.a.equals(var2.a) && this.b.equals(var2.b) && this.c.equals(var2.c);
      }
   }

   public int hashCode() {
      return this.a + (this.a ? 64 : 0) + this.a.hashCode() * this.b.hashCode() * this.c.hashCode();
   }

   public String toString() {
      return this.a + '.' + this.b + this.c + " (" + this.a + (this.a ? " itf" : "") + ')';
   }
}
