import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

class ty extends URLStreamHandler {
   // $FF: synthetic field
   final String a;
   // $FF: synthetic field
   final String b;
   // $FF: synthetic field
   final acC a;
   // $FF: synthetic field
   final tw a;

   ty(tw var1, String var2, String var3, acC var4) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.a = var4;
   }

   protected URLConnection openConnection(URL var1) {
      return new tz(this, var1);
   }
}
