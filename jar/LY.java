import io.netty.util.Recycler;

public final class Ly {
   private static final Recycler<LA> a = new Lz(64);

   public static LA a() {
      return (LA)a.get();
   }
}
