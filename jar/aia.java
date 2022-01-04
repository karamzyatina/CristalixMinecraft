public enum aiA implements aiS {
   LIMB_SWING("limb_swing"),
   LIMB_SWING_SPEED("limb_speed"),
   AGE("age"),
   HEAD_YAW("head_yaw"),
   HEAD_PITCH("head_pitch"),
   SCALE("scale"),
   HEALTH("health"),
   HURT_TIME("hurt_time"),
   IDLE_TIME("idle_time"),
   MAX_HEALTH("max_health"),
   MOVE_FORWARD("move_forward"),
   MOVE_STRAFING("move_strafing"),
   PARTIAL_TICKS("partial_ticks"),
   POS_X("pos_x"),
   POS_Y("pos_Y"),
   POS_Z("pos_Z"),
   REVENGE_TIME("revenge_time"),
   SWING_PROGRESS("swing_progress");

   private final String name;
   private static final aiA[] VALUES = values();

   private aiA(String var3) {
      this.name = var3;
   }

   public String a() {
      return this.name;
   }

   public float a(sE var1) {
      // $FF: Couldn't be decompiled
   }

   public static aiA a(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for(int var1 = 0; var1 < VALUES.length; ++var1) {
            aiA var2 = VALUES[var1];
            if (var2.a().equals(var0)) {
               return var2;
            }
         }

         return null;
      }
   }
}
