import java.net.UnknownHostException;

class vn implements Runnable {
   // $FF: synthetic field
   final vm a;

   vn(vm var1) {
      this.a = var1;
   }

   public void run() {
      try {
         vm.a(this.a).a().a(vm.a(this.a));
      } catch (UnknownHostException var2) {
         vm.a(this.a).a = -1L;
         vm.a(this.a).d = adH.DARK_RED + IK.a("multiplayer.status.cannot_resolve");
      } catch (Exception var3) {
         vm.a(this.a).a = -1L;
         vm.a(this.a).d = adH.DARK_RED + IK.a("multiplayer.status.cannot_connect");
      }

   }
}
