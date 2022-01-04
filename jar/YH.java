import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

// $FF: synthetic class
class yH {
   // $FF: synthetic field
   static final int[] a = new int[Type.values().length];

   static {
      try {
         a[Type.SKIN.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[Type.CAPE.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[Type.ELYTRA.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
