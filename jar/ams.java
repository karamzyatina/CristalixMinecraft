class amS extends amQ {
   final int y;
   amS a;

   amS(int var1, int var2, String var3, String var4, String var5, long var6, int var8) {
      super(var1, var2, var3, var4, var5, var6);
      this.y = var8;
   }

   amS(int var1, int var2, String var3, int var4) {
      super(var1, var2, (String)null, (String)null, var3, 0L);
      this.y = var4;
   }

   amS(int var1, int var2, String var3, long var4, int var6) {
      super(var1, var2, (String)null, (String)null, var3, var4);
      this.y = var6;
   }

   amS(int var1, int var2, String var3, String var4, int var5) {
      super(var1, var2, (String)null, var3, var4, 0L);
      this.y = var5;
   }

   amS(int var1, int var2, long var3, int var5) {
      super(var1, var2, (String)null, (String)null, (String)null, var3);
      this.y = var5;
   }
}
