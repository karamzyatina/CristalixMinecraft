import dev.xdark.clientapi.opengl.GlStateManager.Profile;

public enum BQ implements Profile {
   DEFAULT,
   PLAYER_SKIN,
   TRANSPARENT_MODEL;

   private BQ() {
   }

   public abstract void a();

   public abstract void b();

   // $FF: synthetic method
   BQ(Bz var3) {
      this();
   }
}
