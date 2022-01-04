public enum afO {
   DOWN(abP.DOWN),
   UP(abP.UP),
   NORTH(abP.NORTH),
   SOUTH(abP.SOUTH),
   WEST(abP.WEST),
   EAST(abP.EAST),
   NORTH_WEST(abP.NORTH, abP.WEST),
   NORTH_EAST(abP.NORTH, abP.EAST),
   SOUTH_WEST(abP.SOUTH, abP.WEST),
   SOUTH_EAST(abP.SOUTH, abP.EAST),
   DOWN_NORTH(abP.DOWN, abP.NORTH),
   DOWN_SOUTH(abP.DOWN, abP.SOUTH),
   UP_NORTH(abP.UP, abP.NORTH),
   UP_SOUTH(abP.UP, abP.SOUTH),
   DOWN_WEST(abP.DOWN, abP.WEST),
   DOWN_EAST(abP.DOWN, abP.EAST),
   UP_WEST(abP.UP, abP.WEST),
   UP_EAST(abP.UP, abP.EAST);

   private final abP facing1;
   private abP facing2;

   private afO(abP var3) {
      this.facing1 = var3;
   }

   private afO(abP var3, abP var4) {
      this.facing1 = var3;
      this.facing2 = var4;
   }

   public abP a() {
      return this.facing1;
   }

   public abP b() {
      return this.facing2;
   }

   acV a(acV var1) {
      var1 = var1.a(this.facing1, 1);
      if (this.facing2 != null) {
         var1 = var1.a(this.facing2, 1);
      }

      return var1;
   }

   public int a() {
      int var1 = this.facing1.getXOffset();
      if (this.facing2 != null) {
         var1 += this.facing2.getXOffset();
      }

      return var1;
   }

   public int b() {
      int var1 = this.facing1.getYOffset();
      if (this.facing2 != null) {
         var1 += this.facing2.getYOffset();
      }

      return var1;
   }

   public int c() {
      int var1 = this.facing1.getZOffset();
      if (this.facing2 != null) {
         var1 += this.facing2.getZOffset();
      }

      return var1;
   }

   public boolean a() {
      return this.facing2 != null;
   }
}
