public enum AS {
   DOWN(abP.DOWN, false),
   UP(abP.UP, false),
   NORTH(abP.NORTH, false),
   SOUTH(abP.SOUTH, false),
   WEST(abP.WEST, false),
   EAST(abP.EAST, false),
   FLIP_DOWN(abP.DOWN, true),
   FLIP_UP(abP.UP, true),
   FLIP_NORTH(abP.NORTH, true),
   FLIP_SOUTH(abP.SOUTH, true),
   FLIP_WEST(abP.WEST, true),
   FLIP_EAST(abP.EAST, true);

   final int shape;

   private AS(abP var3, boolean var4) {
      this.shape = var3.getIndex() + (var4 ? abP.VALUES.length : 0);
   }
}
