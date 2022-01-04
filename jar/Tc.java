import com.mojang.authlib.GameProfile;
import dev.xdark.clientapi.entity.AbstractClientPlayer;
import dev.xdark.clientapi.network.NetworkPlayerInfo;
import dev.xdark.clientapi.resource.ResourceLocation;

public abstract class tC extends Rn implements AbstractClientPlayer {
   protected final sE a;
   private yF a;
   public float a;
   public float b;
   public float c;
   public QV a;
   public QV b;

   public tC(sE var1, aej var2, GameProfile var3) {
      super(var2, var3);
      this.a = var1;
   }

   public boolean isSpectator() {
      yF var1 = this.a.a().a(this.getGameProfile().getId());
      return var1 != null && var1.a() == aeb.SPECTATOR;
   }

   public boolean isCreative() {
      yF var1 = this.a.a().a(this.getGameProfile().getId());
      return var1 != null && var1.a() == aeb.CREATIVE;
   }

   public boolean hasPlayerInfo() {
      return this.a() != null;
   }

   public yF a() {
      yF var1 = this.a;
      return var1 == null ? (this.a = this.a.a().a(this.getUniqueID())) : var1;
   }

   public void a(yF var1) {
      this.a = var1;
   }

   public boolean hasSkin() {
      yF var1 = this.a();
      return var1 != null && var1.hasLocationSkin();
   }

   public acC a() {
      yF var1 = this.a();
      return var1 == null ? ID.a(this.getUniqueID()) : var1.a();
   }

   public acC b() {
      if (!afT.X()) {
         return null;
      } else {
         yF var1 = this.a();
         return var1 == null ? null : var1.b();
      }
   }

   public boolean a() {
      return this.a() != null;
   }

   public acC c() {
      yF var1 = this.a();
      return var1 == null ? null : var1.c();
   }

   public String getSkinType() {
      yF var1 = this.a();
      return var1 == null ? ID.a(this.getUniqueID()) : var1.getSkinType();
   }

   public float getFovModifier() {
      float var1 = 1.0F;
      if (this.a.b) {
         var1 *= 1.1F;
      }

      OD var2 = this.a(Ot.d);
      var1 = (float)((double)var1 * ((var2.b() / (double)this.a.b() + 1.0D) / 2.0D));
      if (this.a.b() == 0.0F || Float.isNaN(var1) || Float.isInfinite(var1)) {
         var1 = 1.0F;
      }

      if (this.isHandActive() && this.c().a() instanceof TL) {
         int var3 = this.getItemInUseMaxCount();
         float var4 = (float)var3 / 20.0F;
         if (var4 > 1.0F) {
            var4 = 1.0F;
         } else {
            var4 *= var4;
         }

         var1 *= 1.0F - var4 * 0.15F;
      }

      return var1;
   }

   public boolean hasElytraCape() {
      acC var1 = this.b();
      return var1 != null;
   }

   public NetworkPlayerInfo getPlayerInfo() {
      return (NetworkPlayerInfo)d.a(this.a());
   }

   public void setPlayerInfo(NetworkPlayerInfo var1) {
      this.a((yF)d.a(var1));
   }

   public ResourceLocation getLocationSkin() {
      return (ResourceLocation)d.a(this.a());
   }

   public ResourceLocation getLocationCape() {
      return (ResourceLocation)d.a(this.b());
   }

   public ResourceLocation getLocationElytra() {
      return (ResourceLocation)d.a(this.c());
   }
}
