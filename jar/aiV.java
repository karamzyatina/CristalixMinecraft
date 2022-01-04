public enum aiv {
   POS_X("tx"),
   POS_Y("ty"),
   POS_Z("tz"),
   ANGLE_X("rx"),
   ANGLE_Y("ry"),
   ANGLE_Z("rz"),
   OFFSET_X("ox"),
   OFFSET_Y("oy"),
   OFFSET_Z("oz"),
   SCALE_X("sx"),
   SCALE_Y("sy"),
   SCALE_Z("sz");

   private final String name;
   public static final aiv[] VALUES = values();

   private aiv(String var3) {
      this.name = var3;
   }

   public String a() {
      return this.name;
   }

   public float a(xN var1) {
      // $FF: Couldn't be decompiled
   }

   public void a(xN var1, float var2) {
      // $FF: Couldn't be decompiled
   }

   public static aiv a(String var0) {
      for(int var1 = 0; var1 < VALUES.length; ++var1) {
         aiv var2 = VALUES[var1];
         if (var2.a().equals(var0)) {
            return var2;
         }
      }

      return null;
   }
}
