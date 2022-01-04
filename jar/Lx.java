import io.netty.util.Recycler;
import io.netty.util.Recycler.Handle;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public final class LX implements Runnable {
   private static final Recycler<LX> a = new LY();
   private final Handle<LX> a;
   private Wp a;
   private Ws<?> a;
   private GenericFutureListener<? extends Future<? super Void>> a;

   public LX(Handle<LX> var1) {
      this.a = var1;
   }

   public void run() {
      try {
         this.a.b(this.a, this.a);
      } finally {
         this.a = null;
         this.a = null;
         this.a = null;
         this.a.recycle(this);
      }

   }

   public static LX a(Wp var0, Ws<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      LX var3 = (LX)a.get();
      var3.a = var0;
      var3.a = var1;
      var3.a = var2;
      return var3;
   }
}
