class kk {
   private final String[] a;
   private int a;

   kk(String... var1) {
      this.a = (String[])var1.clone();
   }

   boolean a() {
      return this.a < this.a.length;
   }

   String a() {
      return this.a[this.a++];
   }

   String b() {
      return this.a[this.a];
   }

   void a() {
      if ('-' != this.a[this.a].charAt(0)) {
         this.a[this.a] = "--" + this.a[this.a];
      }

   }
}
