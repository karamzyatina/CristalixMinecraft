public enum aiy implements aiQ {
   IS_ALIVE("is_alive"),
   IS_BURNING("is_burning"),
   IS_CHILD("is_child"),
   IS_GLOWING("is_glowing"),
   IS_HURT("is_hurt"),
   IS_IN_LAVA("is_in_lava"),
   IS_IN_WATER("is_in_water"),
   IS_INVISIBLE("is_invisible"),
   IS_ON_GROUND("is_on_ground"),
   IS_RIDDEN("is_ridden"),
   IS_RIDING("is_riding"),
   IS_SNEAKING("is_sneaking"),
   IS_SPRINTING("is_sprinting"),
   IS_WET("is_wet");

   private final String name;
   private static final aiy[] VALUES = values();

   private aiy(String var3) {
      this.name = var3;
   }

   public String a() {
      return this.name;
   }

   public boolean a(sE var1) {
      // $FF: Couldn't be decompiled
   }

   public static aiy a(String var0) {
      if (var0 != null) {
         for(int var1 = 0; var1 < VALUES.length; ++var1) {
            aiy var2 = VALUES[var1];
            if (var2.a().equals(var0)) {
               return var2;
            }
         }
      }

      return null;
   }
}
