import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Arrays;
import javax.crypto.SecretKey;

class yB implements GenericFutureListener {
   // $FF: synthetic field
   final byte[] a;
   // $FF: synthetic field
   final SecretKey a;
   // $FF: synthetic field
   final yA a;

   yB(yA var1, byte[] var2, SecretKey var3) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
   }

   public void operationComplete(Future<? super Void> var1) {
      Arrays.fill(this.a, (byte)0);
      yA.a(this.a).a(this.a);
   }
}
