import dev.xdark.clientapi.option.client.AmbientOcclusion;

public enum Mc implements AmbientOcclusion {
   MAX,
   MIN,
   OFF;

   public static final Mc[] VALUES = values();
}
