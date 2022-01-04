import com.google.common.util.concurrent.ListenableFuture;

class Em implements Runnable {
   // $FF: synthetic field
   final ListenableFuture a;
   // $FF: synthetic field
   final El a;

   Em(El var1, ListenableFuture var2) {
      this.a = var1;
      this.a = var2;
   }

   public void run() {
      this.a.cancel(false);
   }
}
