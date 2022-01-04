enum AT {
   DOWN(0, 1, 2, 3),
   UP(2, 3, 0, 1),
   NORTH(3, 0, 1, 2),
   SOUTH(0, 1, 2, 3),
   WEST(3, 0, 1, 2),
   EAST(1, 2, 3, 0);

   final int vert0;
   final int vert1;
   final int vert2;
   final int vert3;
   private static final AT[] VALUES = new AT[6];

   private AT(int var3, int var4, int var5, int var6) {
      this.vert0 = var3;
      this.vert1 = var4;
      this.vert2 = var5;
      this.vert3 = var6;
   }

   public static AT a(abP var0) {
      return VALUES[var0.getIndex()];
   }

   static {
      VALUES[abP.DOWN.getIndex()] = DOWN;
      VALUES[abP.UP.getIndex()] = UP;
      VALUES[abP.NORTH.getIndex()] = NORTH;
      VALUES[abP.SOUTH.getIndex()] = SOUTH;
      VALUES[abP.WEST.getIndex()] = WEST;
      VALUES[abP.EAST.getIndex()] = EAST;
   }
}
