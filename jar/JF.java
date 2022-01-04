import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.SettableFuture;
import dev.xdark.feder.FileUtil;
import java.io.File;

class Jf implements FutureCallback {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final File a;
   // $FF: synthetic field
   final String b;
   // $FF: synthetic field
   final SettableFuture a;
   // $FF: synthetic field
   final Jc a;

   Jf(Jc var1, String var2, File var3, String var4, SettableFuture var5) {
      this.a = var1;
      this.a = var2;
      this.a = var3;
      this.b = var4;
      this.a = var5;
   }

   public void onSuccess(Object var1) {
      if (Jc.a(this.a, this.a, this.a)) {
         this.a.a(this.a, this.b, this.a);
         this.a.set((Object)null);
      } else {
         Jc.a().warn("Deleting file {}", this.a);
         FileUtil.deleteQuietly(this.a);
         this.a.b();
      }

   }

   public void onFailure(Throwable var1) {
      FileUtil.deleteQuietly(this.a);
      this.a.setException(var1);
      this.a.b();
   }
}
