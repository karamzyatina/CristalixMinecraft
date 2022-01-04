import io.netty.util.Recycler.Handle;

public final class LA {
   private final Handle<LA> a;
   public final byte[] a;

   private LA(Handle<LA> var1) {
      this.a = new byte[8192];
      this.a = var1;
   }

   public void a() {
      this.a.recycle(this);
   }

   // $FF: synthetic method
   LA(Handle var1, Lz var2) {
      this(var1);
   }
}
