import com.google.common.util.concurrent.ListenableFuture;

public interface ach {
   ListenableFuture<Object> a(Runnable var1);

   boolean e();

   default ListenableFuture<Object> b(Runnable var1) {
      return this.a(var1);
   }
}
