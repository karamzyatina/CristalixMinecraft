public enum adt {
   CHAT((byte)0),
   SYSTEM((byte)1),
   GAME_INFO((byte)2);

   public static final adt[] VALUES = values();
   private final byte id;

   private adt(byte var3) {
      this.id = var3;
   }

   public byte a() {
      return this.id;
   }

   public static adt a(byte var0) {
      adt[] var1 = VALUES;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         adt var4 = var1[var3];
         if (var0 == var4.id) {
            return var4;
         }
      }

      return CHAT;
   }
}
