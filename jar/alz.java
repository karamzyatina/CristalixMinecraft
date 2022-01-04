public final class alZ {
   private ama<T> a;
   private ama<T> b;
   private int a;

   public void a(ama<T> var1) {
      if (this.a++ == 0) {
         this.a = var1;
      } else {
         ama var2 = this.b;
         ama.a(var1, var2);
         ama.b(var2, var1);
      }

      this.b = var1;
      ama.a(var1, this);
   }

   public ama<T> a(ama<T> var1) {
      ama var2 = var1.a();
      ama var3 = var1.b();
      if (var2 != null) {
         ama.b(var2, var3);
      } else {
         this.a = var3;
      }

      if (var3 != null) {
         ama.a(var3, var2);
      } else {
         this.b = var2;
      }

      ama.a(var1, (ama)null);
      ama.b(var1, (ama)null);
      ama.a(var1, (alZ)null);
      --this.a;
      return var1;
   }

   public boolean a(ama<T> var1) {
      return ama.a(var1) == this;
   }

   public ama<T> a() {
      return this.a;
   }

   public ama<T> b() {
      return this.b;
   }

   public boolean a() {
      return this.a <= 0;
   }

   public String toString() {
      int var1 = this.a;
      if (var1 == 0) {
         return "0 []";
      } else {
         ama var2 = this.a;
         StringBuilder var3 = new StringBuilder(var2.toString());

         while((var2 = var2.b()) != null) {
            var3.append(", ").append(var2.a());
         }

         return var1 + " [" + var3 + ']';
      }
   }
}
