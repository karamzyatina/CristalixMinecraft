import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.EnumMap;

class Jp implements Runnable {
   // $FF: synthetic field
   final GameProfile a;
   // $FF: synthetic field
   final boolean a;
   // $FF: synthetic field
   final Jr a;
   // $FF: synthetic field
   final Jm a;

   Jp(Jm var1, GameProfile var2, boolean var3, Jr var4) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
   }

   public void run() {
      EnumMap var1 = new EnumMap(Type.class);

      try {
         var1.putAll(Jm.a(this.a).getTextures(this.a, this.a));
      } catch (InsecureTextureException var3) {
      }

      if (!var1.isEmpty()) {
         Jm.a(this.a).a((Runnable)(new Jq(this, var1)));
      }

   }
}
