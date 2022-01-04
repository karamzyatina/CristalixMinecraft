import com.google.common.util.concurrent.FutureCallback;

class yD implements FutureCallback {
   // $FF: synthetic field
   final yC a;

   yD(yC var1) {
      this.a = var1;
   }

   public void onSuccess(Object var1) {
      yC.a(this.a).a((Ws)(new XJ(XK.SUCCESSFULLY_LOADED)));
   }

   public void onFailure(Throwable var1) {
      yC.a(this.a).a((Ws)(new XJ(XK.FAILED_DOWNLOAD)));
   }
}
