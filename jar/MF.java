import dev.xdark.clientapi.option.client.ParticleVisibility;

public enum Mf implements ParticleVisibility {
   ALL,
   DECREASED,
   OFF;

   public static final Mf[] VALUES = values();
}
