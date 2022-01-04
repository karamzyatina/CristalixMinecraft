class kX {
   final String a;
   final String b;

   kX(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 != null && this.getClass().equals(var1.getClass())) {
         kX var2 = (kX)var1;
         return this.a.equals(var2.a) && this.b.equals(var2.b);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.a.hashCode() ^ this.b.hashCode();
   }
}
