class HL implements KB {
   // $FF: synthetic field
   final int[][] a;
   // $FF: synthetic field
   final HK a;

   HL(HK var1, int[][] var2) {
      this.a = var1;
      this.a = var2;
   }

   public String a() {
      StringBuilder var1 = new StringBuilder();
      int[][] var2 = this.a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int[] var5 = var2[var4];
         if (var1.length() > 0) {
            var1.append(", ");
         }

         var1.append(var5 == null ? "null" : var5.length);
      }

      return var1.toString();
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
