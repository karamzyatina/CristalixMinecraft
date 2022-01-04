import dev.xdark.feder.Recyclable;
import io.netty.util.Recycler;
import io.netty.util.Recycler.Handle;
import java.util.concurrent.Callable;

public final class LV implements Recyclable, Runnable, Callable {
   private static final Recycler<LV> a = new LW();
   private final Handle<LV> a;
   private Wm a;
   private Ws a;

   protected LV(Handle<LV> var1) {
      this.a = var1;
   }

   public void run() {
      Ws var1 = this.a;

      try {
         var1.a(this.a);
      } catch (WA var27) {
         sE.a.fatal("Did not expect ThreadQuickExitException to be thrown", new Throwable());
      } finally {
         try {
            var1.recycle();
         } finally {
            this.a = null;
            this.a = null;
            this.a.recycle(this);
         }
      }

   }

   public Void a() {
      this.run();
      return null;
   }

   public void recycle() {
      this.a.recycle(this);
   }

   public static LV a(Wm var0, Ws var1) {
      LV var2 = (LV)a.get();
      var2.a = var0;
      var2.a = var1;
      return var2;
   }

   // $FF: synthetic method
   public Object call() {
      return this.a();
   }
}
