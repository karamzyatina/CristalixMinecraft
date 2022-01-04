// $FF: synthetic class
class Pp {
   // $FF: synthetic field
   static final int[] a = new int[Pq.values().length];

   static {
      try {
         a[Pq.CHEST.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         a[Pq.FURNACE.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         a[Pq.TNT.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         a[Pq.SPAWNER.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[Pq.HOPPER.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[Pq.COMMAND_BLOCK.ordinal()] = 6;
      } catch (NoSuchFieldError var1) {
      }

   }
}
