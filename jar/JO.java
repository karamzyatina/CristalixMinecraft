import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;

class Jo implements Cb {
   // $FF: synthetic field
   final Cb a;
   // $FF: synthetic field
   final Jr a;
   // $FF: synthetic field
   final Type a;
   // $FF: synthetic field
   final acC a;
   // $FF: synthetic field
   final MinecraftProfileTexture a;
   // $FF: synthetic field
   final Jm a;

   Jo(Jm var1, Cb var2, Jr var3, Type var4, acC var5, MinecraftProfileTexture var6) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.a = var4;
      this.a = var5;
      this.a = var6;
   }

   public BufferedImage a(BufferedImage var1) {
      if (this.a != null) {
         var1 = this.a.a(var1);
      }

      return var1;
   }

   public void a() {
      if (this.a != null) {
         this.a.a();
      }

      if (this.a != null) {
         this.a.skinAvailable(this.a, this.a, this.a);
      }

   }
}
